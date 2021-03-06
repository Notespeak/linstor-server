package com.linbit.linstor.dbdrivers.interfaces;

import com.linbit.CollectionDatabaseDriver;
import com.linbit.SingleColumnDatabaseDriver;
import com.linbit.linstor.core.objects.ResourceGroup;
import com.linbit.linstor.storage.kinds.DeviceLayerKind;
import com.linbit.linstor.storage.kinds.DeviceProviderKind;

/**
 * Database driver for {@link ResourceGroup}.
 *
 * @author Gabor Hernadi &lt;gabor.hernadi@linbit.com&gt;
 */
public interface ResourceGroupDatabaseDriver extends GenericDatabaseDriver<ResourceGroup>
{
    SingleColumnDatabaseDriver<ResourceGroup, String> getDescriptionDriver();

    CollectionDatabaseDriver<ResourceGroup, DeviceLayerKind> getLayerStackDriver();

    /*
     *  drivers needed by autoPlace
     */
    SingleColumnDatabaseDriver<ResourceGroup, Integer> getReplicaCountDriver();

    SingleColumnDatabaseDriver<ResourceGroup, String>  getStorPoolNameDriver();

    CollectionDatabaseDriver<ResourceGroup, String> getDoNotPlaceWithRscListDriver();

    SingleColumnDatabaseDriver<ResourceGroup, String> getDoNotPlaceWithRscRegexDriver();

    CollectionDatabaseDriver<ResourceGroup, String> getReplicasOnSameListDriver();

    CollectionDatabaseDriver<ResourceGroup, String> getReplicasOnDifferentDriver();

    CollectionDatabaseDriver<ResourceGroup, DeviceProviderKind> getAllowedProviderListDriver();

    SingleColumnDatabaseDriver<ResourceGroup, Boolean> getDisklessOnRemainingDriver();
}
