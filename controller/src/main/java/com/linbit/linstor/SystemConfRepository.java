package com.linbit.linstor;

import com.linbit.linstor.propscon.InvalidKeyException;
import com.linbit.linstor.propscon.InvalidValueException;
import com.linbit.linstor.propscon.Props;
import com.linbit.linstor.security.AccessContext;
import com.linbit.linstor.security.AccessDeniedException;
import com.linbit.linstor.security.AccessType;
import com.linbit.linstor.security.ObjectProtection;

import java.sql.SQLException;

/**
 * Provides access to system-wide props with automatic security checks.
 * The controller (ctrl) props are those which only the controller uses.
 * The satellite (stlt) props are those which are transfered to the satellites.
 */
public interface SystemConfRepository
{
    ObjectProtection getObjProt();

    void requireAccess(AccessContext accCtx, AccessType requested)
        throws AccessDeniedException;

    String setCtrlProp(AccessContext accCtx, String key, String value, String namespace)
        throws InvalidValueException, AccessDeniedException, SQLException, InvalidKeyException;

    String setStltProp(AccessContext accCtx, String key, String value)
        throws AccessDeniedException, InvalidValueException, InvalidKeyException, SQLException;

    String removeCtrlProp(AccessContext accCtx, String key, String namespace)
        throws AccessDeniedException, InvalidKeyException, SQLException;

    String removeStltProp(AccessContext accCtx, String key, String namespace)
        throws AccessDeniedException, InvalidKeyException, SQLException;

    Props getCtrlConfForView(AccessContext accCtx)
        throws AccessDeniedException;

    Props getCtrlConfForChange(AccessContext accCtx)
        throws AccessDeniedException;

    Props getStltConfForView(AccessContext accCtx)
        throws AccessDeniedException;
}