package com.linbit.linstor.security;

import com.linbit.linstor.security.AccessContext;
import com.linbit.linstor.security.AccessDeniedException;
import com.linbit.linstor.security.SecurityLevel;
import com.linbit.testutils.AbsIterator;
import java.sql.SQLException;

public abstract class AbsSecurityIterator <T> extends AbsIterator<T>
{
    private final AccessContext rootCtx;

    private boolean iterateSecurityLevels;
    private SecurityLevel currentSecLevel;

    public AbsSecurityIterator(Object[][] values, boolean iteraterSecurityLevels, AccessContext rootCtx, int[] skipColumns)
    {
        super(values, skipColumns);

        this.rootCtx = rootCtx;
        this.iterateSecurityLevels = iteraterSecurityLevels;

        if (iterateSecurityLevels)
        {
            currentSecLevel = SecurityLevel.NO_SECURITY;
        }
        else
        {
            currentSecLevel = SecurityLevel.get();
        }
    }

    @Override
    public boolean hasNext()
    {
        boolean hasNext = super.hasNext();
        if (!hasNext && iterateSecurityLevels)
        {
            switch (SecurityLevel.get())
            {
                case NO_SECURITY:
                    currentSecLevel = SecurityLevel.RBAC;
                    resetAllIdx();
                    hasNext = true;
                    break;
                case RBAC:
                    currentSecLevel = SecurityLevel.MAC;
                    resetAllIdx();
                    hasNext = true;
                    break;
                case MAC:
                    break;
                default:
                    break;
            }
        }
        return hasNext;
    }

    @Override
    public T next()
    {
        T next = super.next(); // super.next increments indizes, which could
        // set the new currentSecLevel
        if (iterateSecurityLevels && !SecurityLevel.get().equals(currentSecLevel))
        {
            try
            {
                SecurityLevel.set(rootCtx, currentSecLevel, null, null);
            }
            catch (AccessDeniedException exc)
            {
                throw new RuntimeException("rootCtx cannot change securityLevel...", exc);
            }
            catch (SQLException exc)
            {
                throw new RuntimeException(
                    "Database error while changing the securityLevel, although no database is being used",
                    exc
                );
            }
        }
        return next;
    }
}