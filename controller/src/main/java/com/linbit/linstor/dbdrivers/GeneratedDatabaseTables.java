package com.linbit.linstor.dbdrivers;

import java.sql.Types;

public class GeneratedDatabaseTables
{
    /**
     * Marker interface. All following tables share this interface
     */
    public interface Table
    {
        /**
         * Returns all columns of the current table
         */
        Column[] values();

        /**
         * Returns the name of the current table
         */
        String name();
    }

    private GeneratedDatabaseTables()
    {
    }

    // Schema name
    public static final String DATABASE_SCHEMA_NAME = "LINSTOR";

    public static class KeyValueStore implements Table
    {
        private KeyValueStore() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column KVS_NAME = new Column(1, "KVS_NAME", Types.VARCHAR, true, false);
        public static final Column KVS_DSP_NAME = new Column(2, "KVS_DSP_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            KVS_NAME,
            KVS_DSP_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "KEY_VALUE_STORE";
        }
    }

    public static class LayerDrbdResources implements Table
    {
        private LayerDrbdResources() { }

        public static final Column LAYER_RESOURCE_ID = new Column(0, "LAYER_RESOURCE_ID", Types.INTEGER, true, false);
        public static final Column PEER_SLOTS = new Column(1, "PEER_SLOTS", Types.INTEGER, false, false);
        public static final Column AL_STRIPES = new Column(2, "AL_STRIPES", Types.INTEGER, false, false);
        public static final Column AL_STRIPE_SIZE = new Column(3, "AL_STRIPE_SIZE", Types.BIGINT, false, false);
        public static final Column FLAGS = new Column(4, "FLAGS", Types.BIGINT, false, false);
        public static final Column NODE_ID = new Column(5, "NODE_ID", Types.INTEGER, false, false);

        public static final Column[] ALL = new Column[]
        {
            LAYER_RESOURCE_ID,
            PEER_SLOTS,
            AL_STRIPES,
            AL_STRIPE_SIZE,
            FLAGS,
            NODE_ID
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_DRBD_RESOURCES";
        }
    }

    public static class LayerDrbdResourceDefinitions implements Table
    {
        private LayerDrbdResourceDefinitions() { }

        public static final Column RESOURCE_NAME = new Column(0, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME_SUFFIX = new Column(1, "RESOURCE_NAME_SUFFIX", Types.VARCHAR, true, false);
        public static final Column PEER_SLOTS = new Column(2, "PEER_SLOTS", Types.INTEGER, false, false);
        public static final Column AL_STRIPES = new Column(3, "AL_STRIPES", Types.INTEGER, false, false);
        public static final Column AL_STRIPE_SIZE = new Column(4, "AL_STRIPE_SIZE", Types.BIGINT, false, false);
        public static final Column TCP_PORT = new Column(5, "TCP_PORT", Types.INTEGER, false, false);
        public static final Column TRANSPORT_TYPE = new Column(6, "TRANSPORT_TYPE", Types.VARCHAR, false, false);
        public static final Column SECRET = new Column(7, "SECRET", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            RESOURCE_NAME,
            RESOURCE_NAME_SUFFIX,
            PEER_SLOTS,
            AL_STRIPES,
            AL_STRIPE_SIZE,
            TCP_PORT,
            TRANSPORT_TYPE,
            SECRET
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_DRBD_RESOURCE_DEFINITIONS";
        }
    }

    public static class LayerDrbdVolumes implements Table
    {
        private LayerDrbdVolumes() { }

        public static final Column LAYER_RESOURCE_ID = new Column(0, "LAYER_RESOURCE_ID", Types.INTEGER, true, false);
        public static final Column VLM_NR = new Column(1, "VLM_NR", Types.INTEGER, true, false);
        public static final Column NODE_NAME = new Column(2, "NODE_NAME", Types.VARCHAR, false, true);
        public static final Column POOL_NAME = new Column(3, "POOL_NAME", Types.VARCHAR, false, true);

        public static final Column[] ALL = new Column[]
        {
            LAYER_RESOURCE_ID,
            VLM_NR,
            NODE_NAME,
            POOL_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_DRBD_VOLUMES";
        }
    }

    public static class LayerDrbdVolumeDefinitions implements Table
    {
        private LayerDrbdVolumeDefinitions() { }

        public static final Column RESOURCE_NAME = new Column(0, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME_SUFFIX = new Column(1, "RESOURCE_NAME_SUFFIX", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(2, "VLM_NR", Types.INTEGER, true, false);
        public static final Column VLM_MINOR_NR = new Column(3, "VLM_MINOR_NR", Types.INTEGER, false, false);

        public static final Column[] ALL = new Column[]
        {
            RESOURCE_NAME,
            RESOURCE_NAME_SUFFIX,
            VLM_NR,
            VLM_MINOR_NR
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_DRBD_VOLUME_DEFINITIONS";
        }
    }

    public static class LayerLuksVolumes implements Table
    {
        private LayerLuksVolumes() { }

        public static final Column LAYER_RESOURCE_ID = new Column(0, "LAYER_RESOURCE_ID", Types.INTEGER, true, false);
        public static final Column VLM_NR = new Column(1, "VLM_NR", Types.INTEGER, true, false);
        public static final Column ENCRYPTED_PASSWORD = new Column(2, "ENCRYPTED_PASSWORD", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            LAYER_RESOURCE_ID,
            VLM_NR,
            ENCRYPTED_PASSWORD
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_LUKS_VOLUMES";
        }
    }

    public static class LayerResourceIds implements Table
    {
        private LayerResourceIds() { }

        public static final Column LAYER_RESOURCE_ID = new Column(0, "LAYER_RESOURCE_ID", Types.INTEGER, true, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, false, false);
        public static final Column RESOURCE_NAME = new Column(2, "RESOURCE_NAME", Types.VARCHAR, false, false);
        public static final Column LAYER_RESOURCE_KIND = new Column(3, "LAYER_RESOURCE_KIND", Types.VARCHAR, false, false);
        public static final Column LAYER_RESOURCE_PARENT_ID = new Column(4, "LAYER_RESOURCE_PARENT_ID", Types.INTEGER, false, true);
        public static final Column LAYER_RESOURCE_SUFFIX = new Column(5, "LAYER_RESOURCE_SUFFIX", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            LAYER_RESOURCE_ID,
            NODE_NAME,
            RESOURCE_NAME,
            LAYER_RESOURCE_KIND,
            LAYER_RESOURCE_PARENT_ID,
            LAYER_RESOURCE_SUFFIX
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_RESOURCE_IDS";
        }
    }

    public static class LayerStorageVolumes implements Table
    {
        private LayerStorageVolumes() { }

        public static final Column LAYER_RESOURCE_ID = new Column(0, "LAYER_RESOURCE_ID", Types.INTEGER, true, false);
        public static final Column VLM_NR = new Column(1, "VLM_NR", Types.INTEGER, true, false);
        public static final Column PROVIDER_KIND = new Column(2, "PROVIDER_KIND", Types.VARCHAR, false, false);
        public static final Column NODE_NAME = new Column(3, "NODE_NAME", Types.VARCHAR, false, false);
        public static final Column STOR_POOL_NAME = new Column(4, "STOR_POOL_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            LAYER_RESOURCE_ID,
            VLM_NR,
            PROVIDER_KIND,
            NODE_NAME,
            STOR_POOL_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_STORAGE_VOLUMES";
        }
    }

    public static class LayerSwordfishVolumeDefinitions implements Table
    {
        private LayerSwordfishVolumeDefinitions() { }

        public static final Column RESOURCE_NAME = new Column(0, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME_SUFFIX = new Column(1, "RESOURCE_NAME_SUFFIX", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(2, "VLM_NR", Types.INTEGER, true, false);
        public static final Column VLM_ODATA = new Column(3, "VLM_ODATA", Types.VARCHAR, false, true);

        public static final Column[] ALL = new Column[]
        {
            RESOURCE_NAME,
            RESOURCE_NAME_SUFFIX,
            VLM_NR,
            VLM_ODATA
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "LAYER_SWORDFISH_VOLUME_DEFINITIONS";
        }
    }

    public static class Nodes implements Table
    {
        private Nodes() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column NODE_DSP_NAME = new Column(2, "NODE_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column NODE_FLAGS = new Column(3, "NODE_FLAGS", Types.BIGINT, false, false);
        public static final Column NODE_TYPE = new Column(4, "NODE_TYPE", Types.INTEGER, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            NODE_DSP_NAME,
            NODE_FLAGS,
            NODE_TYPE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "NODES";
        }
    }

    public static class NodeConnections implements Table
    {
        private NodeConnections() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME_SRC = new Column(1, "NODE_NAME_SRC", Types.VARCHAR, true, false);
        public static final Column NODE_NAME_DST = new Column(2, "NODE_NAME_DST", Types.VARCHAR, true, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME_SRC,
            NODE_NAME_DST
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "NODE_CONNECTIONS";
        }
    }

    public static class NodeNetInterfaces implements Table
    {
        private NodeNetInterfaces() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column NODE_NET_NAME = new Column(2, "NODE_NET_NAME", Types.VARCHAR, true, false);
        public static final Column NODE_NET_DSP_NAME = new Column(3, "NODE_NET_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column INET_ADDRESS = new Column(4, "INET_ADDRESS", Types.VARCHAR, false, false);
        public static final Column STLT_CONN_PORT = new Column(5, "STLT_CONN_PORT", Types.SMALLINT, false, true);
        public static final Column STLT_CONN_ENCR_TYPE = new Column(6, "STLT_CONN_ENCR_TYPE", Types.VARCHAR, false, true);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            NODE_NET_NAME,
            NODE_NET_DSP_NAME,
            INET_ADDRESS,
            STLT_CONN_PORT,
            STLT_CONN_ENCR_TYPE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "NODE_NET_INTERFACES";
        }
    }

    public static class NodeStorPool implements Table
    {
        private NodeStorPool() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column POOL_NAME = new Column(2, "POOL_NAME", Types.VARCHAR, true, false);
        public static final Column DRIVER_NAME = new Column(3, "DRIVER_NAME", Types.VARCHAR, false, false);
        public static final Column FREE_SPACE_MGR_NAME = new Column(4, "FREE_SPACE_MGR_NAME", Types.VARCHAR, false, false);
        public static final Column FREE_SPACE_MGR_DSP_NAME = new Column(5, "FREE_SPACE_MGR_DSP_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            POOL_NAME,
            DRIVER_NAME,
            FREE_SPACE_MGR_NAME,
            FREE_SPACE_MGR_DSP_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "NODE_STOR_POOL";
        }
    }

    public static class PropsContainers implements Table
    {
        private PropsContainers() { }

        public static final Column PROPS_INSTANCE = new Column(0, "PROPS_INSTANCE", Types.VARCHAR, true, false);
        public static final Column PROP_KEY = new Column(1, "PROP_KEY", Types.VARCHAR, true, false);
        public static final Column PROP_VALUE = new Column(2, "PROP_VALUE", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            PROPS_INSTANCE,
            PROP_KEY,
            PROP_VALUE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "PROPS_CONTAINERS";
        }
    }

    public static class Resources implements Table
    {
        private Resources() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME = new Column(2, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_FLAGS = new Column(3, "RESOURCE_FLAGS", Types.BIGINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            RESOURCE_NAME,
            RESOURCE_FLAGS
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "RESOURCES";
        }
    }

    public static class ResourceConnections implements Table
    {
        private ResourceConnections() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME_SRC = new Column(1, "NODE_NAME_SRC", Types.VARCHAR, true, false);
        public static final Column NODE_NAME_DST = new Column(2, "NODE_NAME_DST", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME = new Column(3, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column FLAGS = new Column(4, "FLAGS", Types.BIGINT, false, false);
        public static final Column TCP_PORT = new Column(5, "TCP_PORT", Types.INTEGER, false, true);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME_SRC,
            NODE_NAME_DST,
            RESOURCE_NAME,
            FLAGS,
            TCP_PORT
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "RESOURCE_CONNECTIONS";
        }
    }

    public static class ResourceDefinitions implements Table
    {
        private ResourceDefinitions() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column RESOURCE_NAME = new Column(1, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_DSP_NAME = new Column(2, "RESOURCE_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column RESOURCE_FLAGS = new Column(3, "RESOURCE_FLAGS", Types.BIGINT, false, false);
        public static final Column LAYER_STACK = new Column(4, "LAYER_STACK", Types.VARCHAR, false, false);
        public static final Column RESOURCE_EXTERNAL_NAME = new Column(5, "RESOURCE_EXTERNAL_NAME", Types.BLOB, false, true);
        public static final Column RESOURCE_GROUP_NAME = new Column(6, "RESOURCE_GROUP_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            RESOURCE_NAME,
            RESOURCE_DSP_NAME,
            RESOURCE_FLAGS,
            LAYER_STACK,
            RESOURCE_EXTERNAL_NAME,
            RESOURCE_GROUP_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "RESOURCE_DEFINITIONS";
        }
    }

    public static class ResourceGroups implements Table
    {
        private ResourceGroups() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column RESOURCE_GROUP_NAME = new Column(1, "RESOURCE_GROUP_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_GROUP_DSP_NAME = new Column(2, "RESOURCE_GROUP_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column DESCRIPTION = new Column(3, "DESCRIPTION", Types.VARCHAR, false, true);
        public static final Column LAYER_STACK = new Column(4, "LAYER_STACK", Types.VARCHAR, false, true);
        public static final Column REPLICA_COUNT = new Column(5, "REPLICA_COUNT", Types.INTEGER, false, true);
        public static final Column POOL_NAME = new Column(6, "POOL_NAME", Types.VARCHAR, false, true);
        public static final Column DO_NOT_PLACE_WITH_RSC_REGEX = new Column(7, "DO_NOT_PLACE_WITH_RSC_REGEX", Types.VARCHAR, false, true);
        public static final Column DO_NOT_PLACE_WITH_RSC_LIST = new Column(8, "DO_NOT_PLACE_WITH_RSC_LIST", Types.VARCHAR, false, true);
        public static final Column REPLICAS_ON_SAME = new Column(9, "REPLICAS_ON_SAME", Types.BLOB, false, true);
        public static final Column REPLICAS_ON_DIFFERENT = new Column(10, "REPLICAS_ON_DIFFERENT", Types.BLOB, false, true);
        public static final Column ALLOWED_PROVIDER_LIST = new Column(11, "ALLOWED_PROVIDER_LIST", Types.VARCHAR, false, true);
        public static final Column DISKLESS_ON_REMAINING = new Column(12, "DISKLESS_ON_REMAINING", Types.BOOLEAN, false, true);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            RESOURCE_GROUP_NAME,
            RESOURCE_GROUP_DSP_NAME,
            DESCRIPTION,
            LAYER_STACK,
            REPLICA_COUNT,
            POOL_NAME,
            DO_NOT_PLACE_WITH_RSC_REGEX,
            DO_NOT_PLACE_WITH_RSC_LIST,
            REPLICAS_ON_SAME,
            REPLICAS_ON_DIFFERENT,
            ALLOWED_PROVIDER_LIST,
            DISKLESS_ON_REMAINING
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "RESOURCE_GROUPS";
        }
    }

    public static class SecAccessTypes implements Table
    {
        private SecAccessTypes() { }

        public static final Column ACCESS_TYPE_NAME = new Column(0, "ACCESS_TYPE_NAME", Types.VARCHAR, true, false);
        public static final Column ACCESS_TYPE_VALUE = new Column(1, "ACCESS_TYPE_VALUE", Types.SMALLINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            ACCESS_TYPE_NAME,
            ACCESS_TYPE_VALUE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_ACCESS_TYPES";
        }
    }

    public static class SecAclMap implements Table
    {
        private SecAclMap() { }

        public static final Column OBJECT_PATH = new Column(0, "OBJECT_PATH", Types.VARCHAR, true, false);
        public static final Column ROLE_NAME = new Column(1, "ROLE_NAME", Types.VARCHAR, true, false);
        public static final Column ACCESS_TYPE = new Column(2, "ACCESS_TYPE", Types.SMALLINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            OBJECT_PATH,
            ROLE_NAME,
            ACCESS_TYPE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_ACL_MAP";
        }
    }

    public static class SecConfiguration implements Table
    {
        private SecConfiguration() { }

        public static final Column ENTRY_KEY = new Column(0, "ENTRY_KEY", Types.VARCHAR, true, false);
        public static final Column ENTRY_DSP_KEY = new Column(1, "ENTRY_DSP_KEY", Types.VARCHAR, false, false);
        public static final Column ENTRY_VALUE = new Column(2, "ENTRY_VALUE", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            ENTRY_KEY,
            ENTRY_DSP_KEY,
            ENTRY_VALUE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_CONFIGURATION";
        }
    }

    public static class SecDfltRoles implements Table
    {
        private SecDfltRoles() { }

        public static final Column IDENTITY_NAME = new Column(0, "IDENTITY_NAME", Types.VARCHAR, true, false);
        public static final Column ROLE_NAME = new Column(1, "ROLE_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            IDENTITY_NAME,
            ROLE_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_DFLT_ROLES";
        }
    }

    public static class SecIdentities implements Table
    {
        private SecIdentities() { }

        public static final Column IDENTITY_NAME = new Column(0, "IDENTITY_NAME", Types.VARCHAR, true, false);
        public static final Column IDENTITY_DSP_NAME = new Column(1, "IDENTITY_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column PASS_SALT = new Column(2, "PASS_SALT", Types.CHAR, false, true);
        public static final Column PASS_HASH = new Column(3, "PASS_HASH", Types.CHAR, false, true);
        public static final Column ID_ENABLED = new Column(4, "ID_ENABLED", Types.BOOLEAN, false, false);
        public static final Column ID_LOCKED = new Column(5, "ID_LOCKED", Types.BOOLEAN, false, false);

        public static final Column[] ALL = new Column[]
        {
            IDENTITY_NAME,
            IDENTITY_DSP_NAME,
            PASS_SALT,
            PASS_HASH,
            ID_ENABLED,
            ID_LOCKED
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_IDENTITIES";
        }
    }

    public static class SecIdRoleMap implements Table
    {
        private SecIdRoleMap() { }

        public static final Column IDENTITY_NAME = new Column(0, "IDENTITY_NAME", Types.VARCHAR, true, false);
        public static final Column ROLE_NAME = new Column(1, "ROLE_NAME", Types.VARCHAR, true, false);

        public static final Column[] ALL = new Column[]
        {
            IDENTITY_NAME,
            ROLE_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_ID_ROLE_MAP";
        }
    }

    public static class SecObjectProtection implements Table
    {
        private SecObjectProtection() { }

        public static final Column OBJECT_PATH = new Column(0, "OBJECT_PATH", Types.VARCHAR, true, false);
        public static final Column CREATOR_IDENTITY_NAME = new Column(1, "CREATOR_IDENTITY_NAME", Types.VARCHAR, false, false);
        public static final Column OWNER_ROLE_NAME = new Column(2, "OWNER_ROLE_NAME", Types.VARCHAR, false, false);
        public static final Column SECURITY_TYPE_NAME = new Column(3, "SECURITY_TYPE_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            OBJECT_PATH,
            CREATOR_IDENTITY_NAME,
            OWNER_ROLE_NAME,
            SECURITY_TYPE_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_OBJECT_PROTECTION";
        }
    }

    public static class SecRoles implements Table
    {
        private SecRoles() { }

        public static final Column ROLE_NAME = new Column(0, "ROLE_NAME", Types.VARCHAR, true, false);
        public static final Column ROLE_DSP_NAME = new Column(1, "ROLE_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column DOMAIN_NAME = new Column(2, "DOMAIN_NAME", Types.VARCHAR, false, false);
        public static final Column ROLE_ENABLED = new Column(3, "ROLE_ENABLED", Types.BOOLEAN, false, false);
        public static final Column ROLE_PRIVILEGES = new Column(4, "ROLE_PRIVILEGES", Types.BIGINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            ROLE_NAME,
            ROLE_DSP_NAME,
            DOMAIN_NAME,
            ROLE_ENABLED,
            ROLE_PRIVILEGES
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_ROLES";
        }
    }

    public static class SecTypes implements Table
    {
        private SecTypes() { }

        public static final Column TYPE_NAME = new Column(0, "TYPE_NAME", Types.VARCHAR, true, false);
        public static final Column TYPE_DSP_NAME = new Column(1, "TYPE_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column TYPE_ENABLED = new Column(2, "TYPE_ENABLED", Types.BOOLEAN, false, false);

        public static final Column[] ALL = new Column[]
        {
            TYPE_NAME,
            TYPE_DSP_NAME,
            TYPE_ENABLED
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_TYPES";
        }
    }

    public static class SecTypeRules implements Table
    {
        private SecTypeRules() { }

        public static final Column DOMAIN_NAME = new Column(0, "DOMAIN_NAME", Types.VARCHAR, true, false);
        public static final Column TYPE_NAME = new Column(1, "TYPE_NAME", Types.VARCHAR, true, false);
        public static final Column ACCESS_TYPE = new Column(2, "ACCESS_TYPE", Types.SMALLINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            DOMAIN_NAME,
            TYPE_NAME,
            ACCESS_TYPE
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SEC_TYPE_RULES";
        }
    }

    public static class Snapshots implements Table
    {
        private Snapshots() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME = new Column(2, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column SNAPSHOT_NAME = new Column(3, "SNAPSHOT_NAME", Types.VARCHAR, true, false);
        public static final Column SNAPSHOT_FLAGS = new Column(4, "SNAPSHOT_FLAGS", Types.BIGINT, false, false);
        public static final Column NODE_ID = new Column(5, "NODE_ID", Types.INTEGER, false, true);
        public static final Column LAYER_STACK = new Column(6, "LAYER_STACK", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            RESOURCE_NAME,
            SNAPSHOT_NAME,
            SNAPSHOT_FLAGS,
            NODE_ID,
            LAYER_STACK
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SNAPSHOTS";
        }
    }

    public static class SnapshotDefinitions implements Table
    {
        private SnapshotDefinitions() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column RESOURCE_NAME = new Column(1, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column SNAPSHOT_NAME = new Column(2, "SNAPSHOT_NAME", Types.VARCHAR, true, false);
        public static final Column SNAPSHOT_DSP_NAME = new Column(3, "SNAPSHOT_DSP_NAME", Types.VARCHAR, false, false);
        public static final Column SNAPSHOT_FLAGS = new Column(4, "SNAPSHOT_FLAGS", Types.BIGINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            RESOURCE_NAME,
            SNAPSHOT_NAME,
            SNAPSHOT_DSP_NAME,
            SNAPSHOT_FLAGS
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SNAPSHOT_DEFINITIONS";
        }
    }

    public static class SnapshotVolumes implements Table
    {
        private SnapshotVolumes() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME = new Column(2, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column SNAPSHOT_NAME = new Column(3, "SNAPSHOT_NAME", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(4, "VLM_NR", Types.INTEGER, true, false);
        public static final Column STOR_POOL_NAME = new Column(5, "STOR_POOL_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            RESOURCE_NAME,
            SNAPSHOT_NAME,
            VLM_NR,
            STOR_POOL_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SNAPSHOT_VOLUMES";
        }
    }

    public static class SnapshotVolumeDefinitions implements Table
    {
        private SnapshotVolumeDefinitions() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column RESOURCE_NAME = new Column(1, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column SNAPSHOT_NAME = new Column(2, "SNAPSHOT_NAME", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(3, "VLM_NR", Types.INTEGER, true, false);
        public static final Column VLM_SIZE = new Column(4, "VLM_SIZE", Types.BIGINT, false, false);
        public static final Column SNAPSHOT_FLAGS = new Column(5, "SNAPSHOT_FLAGS", Types.BIGINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            RESOURCE_NAME,
            SNAPSHOT_NAME,
            VLM_NR,
            VLM_SIZE,
            SNAPSHOT_FLAGS
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "SNAPSHOT_VOLUME_DEFINITIONS";
        }
    }

    public static class StorPoolDefinitions implements Table
    {
        private StorPoolDefinitions() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column POOL_NAME = new Column(1, "POOL_NAME", Types.VARCHAR, true, false);
        public static final Column POOL_DSP_NAME = new Column(2, "POOL_DSP_NAME", Types.VARCHAR, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            POOL_NAME,
            POOL_DSP_NAME
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "STOR_POOL_DEFINITIONS";
        }
    }

    public static class Volumes implements Table
    {
        private Volumes() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME = new Column(1, "NODE_NAME", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME = new Column(2, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(3, "VLM_NR", Types.INTEGER, true, false);
        public static final Column VLM_FLAGS = new Column(4, "VLM_FLAGS", Types.BIGINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME,
            RESOURCE_NAME,
            VLM_NR,
            VLM_FLAGS
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "VOLUMES";
        }
    }

    public static class VolumeConnections implements Table
    {
        private VolumeConnections() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column NODE_NAME_SRC = new Column(1, "NODE_NAME_SRC", Types.VARCHAR, true, false);
        public static final Column NODE_NAME_DST = new Column(2, "NODE_NAME_DST", Types.VARCHAR, true, false);
        public static final Column RESOURCE_NAME = new Column(3, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(4, "VLM_NR", Types.INTEGER, true, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            NODE_NAME_SRC,
            NODE_NAME_DST,
            RESOURCE_NAME,
            VLM_NR
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "VOLUME_CONNECTIONS";
        }
    }

    public static class VolumeDefinitions implements Table
    {
        private VolumeDefinitions() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column RESOURCE_NAME = new Column(1, "RESOURCE_NAME", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(2, "VLM_NR", Types.INTEGER, true, false);
        public static final Column VLM_SIZE = new Column(3, "VLM_SIZE", Types.BIGINT, false, false);
        public static final Column VLM_FLAGS = new Column(4, "VLM_FLAGS", Types.BIGINT, false, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            RESOURCE_NAME,
            VLM_NR,
            VLM_SIZE,
            VLM_FLAGS
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "VOLUME_DEFINITIONS";
        }
    }

    public static class VolumeGroups implements Table
    {
        private VolumeGroups() { }

        public static final Column UUID = new Column(0, "UUID", Types.CHAR, false, false);
        public static final Column RESOURCE_GROUP_NAME = new Column(1, "RESOURCE_GROUP_NAME", Types.VARCHAR, true, false);
        public static final Column VLM_NR = new Column(2, "VLM_NR", Types.INTEGER, true, false);

        public static final Column[] ALL = new Column[]
        {
            UUID,
            RESOURCE_GROUP_NAME,
            VLM_NR
        };

        @Override
        public Column[] values()
        {
            return ALL;
        }

        @Override
        public String name()
        {
            return "VOLUME_GROUPS";
        }
    }

    public static final KeyValueStore KEY_VALUE_STORE = new KeyValueStore();
    public static final LayerDrbdResources LAYER_DRBD_RESOURCES = new LayerDrbdResources();
    public static final LayerDrbdResourceDefinitions LAYER_DRBD_RESOURCE_DEFINITIONS = new LayerDrbdResourceDefinitions();
    public static final LayerDrbdVolumes LAYER_DRBD_VOLUMES = new LayerDrbdVolumes();
    public static final LayerDrbdVolumeDefinitions LAYER_DRBD_VOLUME_DEFINITIONS = new LayerDrbdVolumeDefinitions();
    public static final LayerLuksVolumes LAYER_LUKS_VOLUMES = new LayerLuksVolumes();
    public static final LayerResourceIds LAYER_RESOURCE_IDS = new LayerResourceIds();
    public static final LayerStorageVolumes LAYER_STORAGE_VOLUMES = new LayerStorageVolumes();
    public static final LayerSwordfishVolumeDefinitions LAYER_SWORDFISH_VOLUME_DEFINITIONS = new LayerSwordfishVolumeDefinitions();
    public static final Nodes NODES = new Nodes();
    public static final NodeConnections NODE_CONNECTIONS = new NodeConnections();
    public static final NodeNetInterfaces NODE_NET_INTERFACES = new NodeNetInterfaces();
    public static final NodeStorPool NODE_STOR_POOL = new NodeStorPool();
    public static final PropsContainers PROPS_CONTAINERS = new PropsContainers();
    public static final Resources RESOURCES = new Resources();
    public static final ResourceConnections RESOURCE_CONNECTIONS = new ResourceConnections();
    public static final ResourceDefinitions RESOURCE_DEFINITIONS = new ResourceDefinitions();
    public static final ResourceGroups RESOURCE_GROUPS = new ResourceGroups();
    public static final SecAccessTypes SEC_ACCESS_TYPES = new SecAccessTypes();
    public static final SecAclMap SEC_ACL_MAP = new SecAclMap();
    public static final SecConfiguration SEC_CONFIGURATION = new SecConfiguration();
    public static final SecDfltRoles SEC_DFLT_ROLES = new SecDfltRoles();
    public static final SecIdentities SEC_IDENTITIES = new SecIdentities();
    public static final SecIdRoleMap SEC_ID_ROLE_MAP = new SecIdRoleMap();
    public static final SecObjectProtection SEC_OBJECT_PROTECTION = new SecObjectProtection();
    public static final SecRoles SEC_ROLES = new SecRoles();
    public static final SecTypes SEC_TYPES = new SecTypes();
    public static final SecTypeRules SEC_TYPE_RULES = new SecTypeRules();
    public static final Snapshots SNAPSHOTS = new Snapshots();
    public static final SnapshotDefinitions SNAPSHOT_DEFINITIONS = new SnapshotDefinitions();
    public static final SnapshotVolumes SNAPSHOT_VOLUMES = new SnapshotVolumes();
    public static final SnapshotVolumeDefinitions SNAPSHOT_VOLUME_DEFINITIONS = new SnapshotVolumeDefinitions();
    public static final StorPoolDefinitions STOR_POOL_DEFINITIONS = new StorPoolDefinitions();
    public static final Volumes VOLUMES = new Volumes();
    public static final VolumeConnections VOLUME_CONNECTIONS = new VolumeConnections();
    public static final VolumeDefinitions VOLUME_DEFINITIONS = new VolumeDefinitions();
    public static final VolumeGroups VOLUME_GROUPS = new VolumeGroups();

    public static class Column
    {
        public final int index;
        public final String name;
        public final int sqlType;
        public final boolean isPk;
        public final boolean isNullable;

        public Column(
            final int indexRef,
            final String nameRef,
            final int sqlTypeRef,
            final boolean isPkRef,
            final boolean isNullableRef
        )
        {
            index = indexRef;
            name = nameRef;
            sqlType = sqlTypeRef;
            isPk = isPkRef;
            isNullable = isNullableRef;
        }
    }
}