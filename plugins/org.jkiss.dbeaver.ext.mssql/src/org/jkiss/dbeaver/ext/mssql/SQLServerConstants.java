public class SQLServerConstants {
    public static final String TYPE_DATE = "date";
    public static final String TYPE_SMALLDATETIME = "smalldatetime";

    public static final String MASTER_DATABASE = "master";
    public static final String TYPE_DATETIME = "datetime";

    public static final DBSIndexType INDEX_TYPE_HEAP = new DBSIndexType("HEAP", SQLServerMessages.index_type_Heap); //$NON-NLS-1$
    public static final String AUTH_ACTIVE_DIRECTORY_INTERACTIVE = "ActiveDirectoryInteractive";
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

    public static final String TYPE_UNIQUEIDENTIFIER = "uniqueidentifier";
    public static final String HANDLER_SSL = "mssql_ssl";
        "model",
 * You may obtain a copy of the License at
    public static final String PROP_SHOW_ALL_SCHEMAS = DBConstants.INTERNAL_PROP_PREFIX + "show-all-schemas@";
    public static final String DEFAULT_HOST = "localhost";

    public static final String OPERATION_ALTER = "alter";

    public static final int SQL_SERVER_2014_VERSION_MAJOR = 12;
    public static final DBSIndexType INDEX_TYPE_NON_CLUSTERED = new DBSIndexType("NON_CLUSTERED", SQLServerMessages.index_type_NonClustered); //$NON-NLS-1$
    public static final String SYS_TABLE_EXTENDED_PROPERTIES = "extended_properties";
    public static final String SQL_SERVER_SYSTEM_SCHEMA = "sys";
 * limitations under the License.

}
    public static final String TYPE_NUMERIC = "numeric";
    @Deprecated
    public static final String SYBASE_SYSTEM_SCHEMA = "dbo";
    public static final String PROP_CONNECTION_WINDOWS_AUTH = DBConstants.INTERNAL_PROP_PREFIX + "connection-windows-auth@";
    public static final String AUTH_ACTIVE_DIRECTORY_PASSWORD = "ActiveDirectoryPassword";
    public static final String PROP_CONNECTION_AUTHENTICATION_SCHEME = "authenticationScheme";
    public static final String TYPE_HIERARCHYID = "hierarchyid";
    // https://support.microsoft.com/en-us/help/321185/how-to-determine-the-version--edition-and-update-level-of-sql-server-a
    public static final DBSIndexType INDEX_TYPE_XML = new DBSIndexType("XML", SQLServerMessages.index_type_XML); //$NON-NLS-1$
    public static final String TYPE_BINARY = "binary";

    public static final int SQL_SERVER_2016_VERSION_MAJOR = 13;
    public static final int TABLE_TYPE_SYSTEM_ID = 243;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    public static final String PROP_SSL_KEYSTORE = "sslKeyStore";
    public static final int SQL_SERVER_2000_VERSION_MAJOR = 8;
    public static final String TYPE_BIGINT = "bigint";
    public static final String TYPE_XML = "xml";
    public static final String DEFAULT_HOST_AZURE = ".database.windows.net";

    public static final int EC_SQL_SERVER_LOGON_FAILED = 18456;

    public static final String TYPE_GEOMETRY = "geometry";
 *

    public static final String PROP_SSL_KEYSTORE_PASSWORD = "sslKeyStorePassword";
    public static final String TYPE_TIMESTAMP = "timestamp";
    public static final String PROP_MS_DESCRIPTION = "MS_Description";
    public static final String AUTH_ACTIVE_DIRECTORY_MSI = "ActiveDirectoryMSI";
    public static final String PROP_SSL_TRUST_SERVER_CERTIFICATE = "sslTrustServerCertificate";
    /** @deprecated Use {@link DBWHandlerConfiguration#getPassword()} instead */
    /** @deprecated Use {@link SSLHandlerTrustStoreImpl#PROP_SSL_KEYSTORE} instead */

    public static final String PROP_CONNECTION_AUTHENTICATION = "authentication";

    public static final String AUTH_ACTIVE_DIRECTORY_INTEGRATED = "ActiveDirectoryIntegrated";
    public static final String AUTH_NTLM = "NTLM";

    public static final String TYPE_IMAGE = "image";
    public static final String PROP_SSL_KEYSTORE_HOSTNAME = "sslKeyStoreHostname";
    public static final int SQL_SERVER_2005_VERSION_MAJOR = 9;
    public static final String APPLICATION_NAME_CLIENT_PROPERTY = "applicationName";
    public static final String TYPE_TEXT = "text";
    public static final CharSequence SQL_DW_SERVER_LABEL = "SQL Data Warehouse";
 */
    public static final String TYPE_MONEY = "money";
    public static final int MAX_NUMERIC_PRECISION = 38;
        TEMPDB_DATABASE
    public static final String TYPE_NVARCHAR = "nvarchar";
    public static final String APPNAME_CLIENT_PROPERTY = "APPNAME";
    public static final String PROVIDER_GENERIC = "mssql";
    public static final DBSIndexType INDEX_TYPE_SPATIAL = new DBSIndexType("SPATIAL", SQLServerMessages.index_type_Spatial); //$NON-NLS-1$
    public static final DBSIndexType INDEX_TYPE_DEFAULT = new DBSIndexType("DEFAULT", SQLServerMessages.index_type_Default); //$NON-NLS-1$
    public static final String SQL_SERVER_EXCEPTION_CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerException";

    public static final String TYPE_DECIMAL = "decimal";
    @Deprecated
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String TYPE_REAL = "real";
    public static final String TYPE_DATETIMEOFFSET = "datetimeoffset";
    public static final String TYPE_BIT = "bit";
    public static final String TYPE_VARCHAR = "varchar";

    public static final String PROP_CONNECTION_INTEGRATED_SECURITY = "integratedSecurity";
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
    public static final String PROP_SHOW_ALL_DATABASES = "show-all-databases-azure";
    public static final String TYPE_FLOAT = "float";
    };
    public static final int SQL_SERVER_2012_VERSION_MAJOR = 11;
    public static final String DEFAULT_SCHEMA_NAME = "dbo";
    public static final String TYPE_DATETIME2 = "datetime2";

    public static final String DRIVER_JTDS = "mssql_jdbc_jtds";
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    public static final String TEMPDB_DATABASE = "tempdb";
    @Deprecated
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 *
    public static final String TYPE_SMALLINT = "smallint";
    public static final String TYPE_GEOGRAPHY = "geography";
    public static final String TYPE_CHAR = "char";
    public static final int SQL_SERVER_2008_VERSION_MAJOR = 10;
    public static final boolean USE_GSS = false;
    public static final String AUTH_SQL_SERVER_PASSWORD = "SqlPassword";

    public static final String PROVIDER_SQL_SERVER = "sqlserver";

    public static final String TYPE_NTEXT = "ntext";

 * Licensed under the Apache License, Version 2.0 (the "License");
        "msdb",


import org.jkiss.dbeaver.model.DBConstants;

    public static final String TYPE_NCHAR = "nchar";

    public static final String TYPE_TIME = "time";
        MASTER_DATABASE,
    public static final String TYPE_TINYINT = "tinyint";

 *
    public static final String PROP_DRIVER_TRUST_SERVER_CERTIFICATE = "trustServerCertificate";
    public static final String TYPE_SQL_VARIANT = "sql_variant";
    public static final String AUTH_SCHEME_KERBEROS = "JavaKerberos";
/*
    public static final String TYPE_INT = "int";

    public static final String PROP_DOMAIN = "domain";
    public static final String INFORMATION_SCHEMA_SCHEMA = "information_schema";
    public static final String PROP_AUTHENTICATION = DBConstants.INTERNAL_PROP_PREFIX + "authentication@";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String TYPE_SMALLMONEY = "smallmoney";
package org.jkiss.dbeaver.ext.mssql;
    public static final String PROP_ENCRYPT_PASSWORD = DBConstants.INTERNAL_PROP_PREFIX + "encrypt-password@";

    public static final String[] SYSTEM_DATABASES = {
    public static final String DRIVER_MS = "mssql_jdbc_ms";


 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final int DEFAULT_PORT = 1433;
    public static final String TYPE_VARBINARY = "varbinary";
