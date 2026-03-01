                    dbStat.setString(1, databaseName);
                dbStat = session.prepareStatement(sql.toString());
            case DBPDataSource.FEATURE_LIMIT_AFFECTS_DML -> true;
            try {
        super.initializeContextState(monitor, context, initFrom);
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData)

            if (CommonUtils.isEmpty(databaseName)) {
            return adapter.cast(new SQLServerLoginPasswordManager(this));
            }
                    null,
            return adapter.cast(new SQLServerSessionManager(this));
                }
//            DBACertificateStorage certificateStorage = getContainer().getPlatform().getCertificateStorage();
            // By default we will show all databases only for SQL Server
        int errorCode = SQLState.getCodeFromException(error);
            }
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                    if (serverErrorLine instanceof Number) {

                        pos.line = ((Number) serverErrorLine).intValue() - 1;
    public SQLServerDataType getLocalDataType(String typeName) {
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
    @Override
                    isSynapseDatabase = true;
        } catch (DBCException ignored) {
            }
        SQLServerDataType sdt = new SQLServerDataType(this, String.valueOf(systemTypeId), systemTypeId, DBPDataKind.OBJECT, java.sql.Types.OTHER);
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerDataSource sqlServerDataSource) throws SQLException {
/*

        return List.of();
        }
 *
    }
        return super.discoverErrorType(error);
        return info;

                    hasNextValExpr = plainSelect.getSelectItems()
        if (isBabelfish) {
                    }
        }
        }
            }
                        "name",
        } catch (DBException | SQLException e) {
            return;
import java.util.List;
                keystoreFileProp = sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE);
                if (plainSelect.getFromItem() == null) {
    public Object getDataSourceFeature(String featureId) {

            if (!isDataWarehouseServer(monitor)) {
            return null;
        return super.createQueryTransformer(type);
        return super.getAdapter(adapter);
                    ((SQLServerExecutionContext)context).setCurrentDatabase(monitor, defaultObject);
            }

    public SQLServerDatabase getDatabase(DBRProgressMonitor monitor, long dbId) throws DBException {
    }

            final String keystoreHostnameProp = sslConfig.getStringProperty(SQLServerConstants.PROP_SSL_KEYSTORE_HOSTNAME);

        } else {
                    keystoreFileProp = null;

        this.dataTypeCache.getAllObjects(monitor, this);
            if (!CommonUtils.isEmpty(keystorePasswordProp)) {

            }
        @NotNull
                if (databaseFilters != null && databaseFilters.isEnabled()) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
    }
        }
        } catch (Throwable e) {
        }
            default -> super.getDataSourceFeature(featureId);
                // Backward compatibility
        for (SQLServerDatabase db : databaseCache.getAllObjects(monitor, this)) {
            }
    }
        return serverVersion;
                        long bytes = dbResult.getLong(2) * 8 * 1024;
    }
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {
            try {

import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
    {
                serverVersion = "";
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context, JDBCExecutionContext initFrom) throws DBException {

    @Override
import net.sf.jsqlparser.statement.select.PlainSelect;
    }
        }
import org.jkiss.dbeaver.model.meta.Association;
        }
                sql.append("\nWHERE db.name = ?");

        if (serverVersion == null) {

    @Override
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
                } else {

 */
                // ignore
        }
                properties.put("trustStore", keystoreFileProp);
        if (rootCause != null && SQLServerConstants.SQL_SERVER_EXCEPTION_CLASS_NAME.equals(rootCause.getClass().getName())) {
                        sql,
    }
    }
    @Association
        }
        return properties;
    public List<DBSObjectContainer> getPublicScopes(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
        SQLServerDataSourceInfo info = new SQLServerDataSourceInfo(this, metaData);

                SQLServerSchema defaultSchema = ssContext.getDefaultSchema();
    @Override
     * This method will be removed once #16366 is implemented.
    private boolean isSynapseDatabase;


        this.databaseCache.getAllObjects(monitor, this);
            default -> super.getDefaultDataTypeName(dataKind);
    }
    // Data types
        }
//            SSLHandlerTrustStoreImpl.initializeTrustStore(monitor, this, sslConfig);
        return switch (featureId) {
package org.jkiss.dbeaver.ext.mssql.model;
        monitor.subTask("Install SSL certificates");
        isBabelfish = SQLServerUtils.isDriverBabelfish(getContainer().getDriver());
                        return new ErrorPosition[] {pos};

                }
                sql.append("\nWHERE db.name = db_name()");
            if (dt.getObjectId() == systemTypeId) {
            boolean useCurrentDatabaseName = showSpecifiedDatabase && CommonUtils.isEmpty(databaseName);
    }
        try {
                connectionInfo.getProviderProperty(SQLServerConstants.PROP_SSL_TRUST_SERVER_CERTIFICATE),
        DBSDataType dt = super.getLocalDataType(typeID);
        return super.refreshObject(monitor);
        } finally {
    }
                return new SQLServerLogin(dataSource, loginName, resultSet);
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;

public class SQLServerDataSource
    }

            return false;
    }
        serverLoginCache.clearCache();
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
        ) {
                properties.put("trustStorePassword", keystorePasswordProp);
            ((SQLServerExecutionContext)context).refreshDefaults(monitor, true);
        return dataTypeCache.getCachedObjects();


        }
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {// App name
 * Copyright (C) 2010-2026 DBeaver Corp and others
            initSSL(monitor, properties, sslConfig);
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {

        return dataTypeCache.getCachedObject(typeName);
            }
            log.error("Error during connection initialization", e);
    @Override
    public boolean isForceTransform(DBCSession session, SQLQuery sqlQuery) {
    implements DBSInstanceContainer, DBPObjectStatisticsCollector, DBPAdaptable, DBCQueryTransformProviderExt, DBSVisibilityScopeProvider {

    @Nullable
    }
        return ((SQLServerExecutionContext)getDefaultInstance().getDefaultContext(monitor, true)).getDefaultCatalog();
        return databaseCache.getCachedObject(name);
    public <T> T getAdapter(@NotNull Class<T> adapter) {
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;

        };
                SQLServerDatabase defaultObject = ssContext.getDefaultCatalog();
                log.debug("Error reading SQL Server version: " + e.getMessage());

        @Override
        try {
            setListOrderComparator(DBUtils.nameComparator());
        try {
    }
            case DATETIME -> SQLServerConstants.TYPE_DATETIME;
    }
        if (dt == null) {
    @Override
    }
                this.supportsColumnProperty = true;
    public boolean supportsExternalTables() {
    public boolean isStatisticsCollected() {
            }
    public SQLServerDatabase getDatabase(DBRProgressMonitor monitor, String name) throws DBException {
        protected SQLServerDatabase fetchObject(@NotNull JDBCSession session, @NotNull SQLServerDataSource owner, @NotNull JDBCResultSet resultSet) {
        final DBWHandlerConfiguration sslConfig = getContainer().getActualConnectionConfiguration().getHandler(SQLServerConstants.HANDLER_SSL);
    @Override
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

                keystoreFileProp = sslConfig.getStringProperty(SQLServerConstants.PROP_SSL_KEYSTORE);
    }
                    SQLServerDatabase.class,
                SQLServerExecutionContext ssContext = (SQLServerExecutionContext) initFrom;
            }
        return databaseCache.getObject(monitor, this, childName);
        try {
        databaseCache.clearCache();
            try {

            if (db.getDatabaseId() == dbId) {
    public SQLServerDatabase getDatabase(String name) {
        return databaseCache.getAllObjects(monitor, this);

    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
            return session.prepareStatement("SELECT * FROM sys.types WHERE is_user_defined = 0 order by name");
            Statement statement = SQLSemanticProcessor.parseQuery(this.sqlDialect, query.getText());
    @Override
    //////////////////////////////////////////////////////////////////
    @Override
        @NotNull
        return serverLoginCache.getAllObjects(monitor, this);
    }
     * @deprecated This method is intended to be used only within
    private final SystemDataTypeCache dataTypeCache = new SystemDataTypeCache();

            boolean showSpecifiedDatabase = property != null && !CommonUtils.getBoolean(property) ||
    /**
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerDataSource dataSource) throws SQLException {
    @Override
    public boolean isDataWarehouseServer(@NotNull DBRProgressMonitor monitor) {

            return false;
                this.supportsColumnProperty = false;
                JDBCUtils.queryString(session, "SELECT COLUMNPROPERTY(0, NULL, NULL)");
        }
            // Starting microsoft driver version 10.1 defaulted the encrypt option to true (previously false)
                }



import java.sql.SQLException;
    private final boolean isBabelfish;
            return new QueryTransformerTop();
            JDBCUtils.queryString(session, "SELECT TOP 1 is_external from sys.tables where 1<>1");

    @NotNull
                dbStat = session.prepareStatement(sql.toString());
    @Override
        }
            }
    @Override
    public SQLServerDatabase getDefaultDatabase(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;

            return supportsIsExternalColumn;

                if ("6".equals(result) || "11".equals(result)) {
        }
                SQLServerUtils.isDriverJtds(getContainer().getDriver()) ? SQLServerConstants.APPNAME_CLIENT_PROPERTY : SQLServerConstants.APPLICATION_NAME_CLIENT_PROPERTY,
    }
            if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {
            String databaseName = JDBCUtils.safeGetString(resultSet, "name");
            if (dbo != null) {
            @NotNull SQLServerDataSource dataSource,
        }
        return new SQLServerExecutionContext(instance, type);
    SQLServerDataType getSystemDataType(int systemTypeId) {

        Throwable rootCause = CommonUtils.getRootCause(error);
        }
     * the {@code visibleIf} attribute of a navigator tree node.
    protected Properties getAllConnectionProperties(@NotNull DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose, DBPConnectionConfiguration connectionInfo) throws DBCException {

            // And for other databases if "Show All databases" setting is enabled
                return List.of(dbo);
            } else {
import org.jkiss.dbeaver.ext.mssql.model.session.SQLServerSessionManager;
        }
    @Override
        return sdt;

                        long dbId = JDBCUtils.safeGetLong(dbResult, 1);
//            String keyStorePath = certificateStorage.getKeyStorePath(getContainer(), "ssl").getAbsolutePath();
    /**
        }
    }
                if (databaseFilters != null) {
    public List<SQLServerDataType> getLocalDataTypes() {
}
            return adapter.cast(new SQLServerStructureAssistant(this));
        return getLocalDataType(valueType).getDataKind();
        } catch (Exception e) {
                    keystoreFileProp = saveTrustStoreToFile(trustStoreData);
        return supportsIsExternalColumn;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
            String databaseName = configuration.getDatabaseName();
            log.error("Can't parse query " + query.getText(), e);

            properties.put(
                }
            } else if (CommonUtils.isEmpty(sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD))) {
            if (!showSpecifiedDatabase) {
        } catch (Exception ignored) {
                if (defaultObject != null) {
            throw new DBCException("Error reading database statistics", e);

    }
            // thus the driver will look for a certificate to validate unless trustServerCertificate is set to true
                (property == null && (owner.isBabelfish || SQLServerUtils.isDriverAzure(owner.getContainer().getDriver())));
                        if (database != null) {
        if (supportsIsExternalColumn != null) {
import net.sf.jsqlparser.statement.Statement;
    @NotNull
     * These types of tables restrict special reading rules: do not scroll results or use TOP in the SELECT.
        } catch (SQLException e) {
            }
            }
        if (hasStatistics && !forceRefresh) {
            case BINARY, CONTENT -> "varbinary";
            DBPDataSourceContainer container = owner.getContainer();
    public boolean supportsTriggers() {
    public boolean supportsSequences() {
            this.supportsIsExternalColumn = true;
            String property = configuration.getProviderProperty(SQLServerConstants.PROP_SHOW_ALL_DATABASES);
import org.jkiss.dbeaver.ModelPreferences;
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
                return db;
            try (JDBCStatement dbStat = session.createStatement()) {

 *     http://www.apache.org/licenses/LICENSE-2.0
                String result = JDBCUtils.queryString(session, "SELECT SERVERPROPERTY('EngineEdition')");
                if (defaultSchema != null && !isDataWarehouseServer(monitor)) {
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load schema statistics")) {
            }
 * You may obtain a copy of the License at
                    ((SQLServerExecutionContext)context).setDefaultSchema(monitor, defaultSchema);
        return serverLoginCache.getObject(monitor, this, loginName);
            case NUMERIC -> "int";
    public boolean supportsExternalTables(JDBCSession session) {
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                }
                    JDBCUtils.appendFilterClause(
import java.util.Properties;
    // Delegate data type reading to the driver
    @Association
        return databaseCache.getObject(monitor, this, name);
    }
        Properties properties = super.getAllConnectionProperties(monitor, context, purpose, connectionInfo);
    }
        if (systemTypeId != SQLServerConstants.TABLE_TYPE_SYSTEM_ID) { // 243 - ID of user defined table types

                if (!useCurrentDatabaseName) {
    public static class ServerLoginCache extends JDBCObjectCache<SQLServerDataSource, SQLServerLogin> {
            this.supportsIsExternalColumn = false;



                if (serverError != null) {
                        .anyMatch(item -> item.getExpression() instanceof NextValExpression);

            return session.prepareStatement("SELECT * FROM sys.server_principals");
            case DBPDataSource.FEATURE_MAX_STRING_LENGTH -> 8000;

            @NotNull JDBCSession session,
 * limitations under the License.
    public String getServerVersion() {
    @Deprecated(forRemoval = true)
                    while (dbResult.next()) {
    public boolean isLimitApplicableTo(SQLQuery query) {

            return table != null && table.isClustered(session.getProgressMonitor());
            return new SQLServerDatabase(session, owner, resultSet, databaseName);

    public SQLServerLogin getLogin(@NotNull DBRProgressMonitor monitor, @NotNull String loginName) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return (SQLServerDataType) dt;
            if (!CommonUtils.isEmpty(keystoreFileProp)) {
    private boolean supportsColumnProperty;
    public List<SQLServerLogin> getLogins(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (tempdb != null) {
    }
            }
    }
            return supportsIsExternalColumn;
    @Nullable
    public DatabaseCache getDatabaseCache() {
    public SQLServerDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container)
            } catch (SQLException e) {
    @Override

        }
            StringBuilder sql = new StringBuilder("SELECT db.* FROM sys.databases db");
        if (supportsIsExternalColumn != null) {
        if (isDataWarehouseServer(monitor)) {
    @Override
                properties.put("hostNameInCertificate", keystoreHostnameProp);
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
            if (statement instanceof PlainSelect plainSelect) {
                log.debug("Can't read Database Engine edition info", e);
                Object serverError = rootCause.getClass().getMethod("getSQLServerError").invoke(rootCause);
    //////////////////////////////////////////////////////////
    @Override
        throws DBException
        // The "is_external" column can be used to identify external tables support.
        return null;
    //////////////////////////////////////////////////////////////
    @Override
    }
            info.setSupportsResultSetScroll(false);
        return !isBabelfish && !isSynapseDatabase;
    @Override
    }
        @Override
        @Nullable
        return databaseCache;
 * See the License for the specific language governing permissions and
        return isSynapseDatabase;
    private String serverVersion;
        // Sometimes checking the version does not work for some reason - see #15036
    @Override
    }
            } else {
        } else if (adapter == DBAUserPasswordManager.class) {

            case BOOLEAN -> "bit";
    private volatile Boolean supportsIsExternalColumn;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            log.debug("System data type " + systemTypeId + " not found");
            log.debug("Table not found. ", e);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    private volatile transient boolean hasStatistics;
        @Override
    }
        return !hasNextValExpr;
    }
        @Override
    private static final Log log = Log.getLog(SQLServerDataSource.class);
        if (initFrom != null) {
import org.jkiss.code.Nullable;
    @NotNull
                DBSObjectFilter databaseFilters = container.getObjectFilter(
        return getInfo().getDatabaseVersion().getMajor() >= 16;
    public static class DatabaseCache extends JDBCObjectCache<SQLServerDataSource, SQLServerDatabase> {

                    false);
        }
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerTop;
    private static class SystemDataTypeCache extends JDBCObjectCache<SQLServerDataSource, SQLServerDataType> {
        return serverVersion;
                CommonUtils.truncateString(DBUtils.getClientApplicationName(getContainer(), context, purpose), 64));
                        owner);
        }
            @NotNull JDBCResultSet resultSet
        } else if (CommonUtils.isEmpty(properties.getProperty(PROP_ENCRYPT_SSL))) {
import net.sf.jsqlparser.expression.NextValExpression;
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
                return dt;
        if (adapter == DBSStructureAssistant.class) {
    private final DatabaseCache databaseCache = new DatabaseCache();
            // Read Database Engine edition of the instance of SQL Server installed on the server.
        if (errorCode == SQLServerConstants.EC_SQL_SERVER_LOGON_FAILED) {
                    "GROUP BY database_id")) {
            if (trustCertificate) {
            supportsIsExternalColumn = false;

        DatabaseCache() {
            return new SQLServerDataType(dataSource, resultSet);



        @Override
        return super.getErrorPosition(monitor, context, query, error);
    }
     * <p>
                        }
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read server version")) {
            hasStatistics = true;
                    JDBCUtils.setFilterParameters(dbStat, 1, databaseFilters);
                    sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE);
        databaseCache.getAllObjects(monitor, this);

        // But not all SQL Server versions supports this column in the all_columns view
import org.jkiss.dbeaver.model.struct.*;
import org.jkiss.dbeaver.model.sql.SQLQuery;
    public boolean isAtLeastV16() {
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        return supportsColumnProperty;
                        databaseFilters,
import org.jkiss.code.NotNull;
        };
import org.jkiss.dbeaver.model.sql.SQLState;
            boolean trustCertificate = CommonUtils.getBoolean(
        return getServerVersion(monitor).contains(SQLServerConstants.SQL_DW_SERVER_LABEL);

    public boolean supportsSynonyms() {
                var trustStoreData = SSLHandlerTrustStoreImpl.readTrustStoreData(
                    }
    @Override

        return databaseCache.getAllObjects(monitor, this);
    }
    public SQLServerDataType getLocalDataType(int typeID) {
            } catch (Exception e) {
            throw new DBCException("Error initializing SSL trust store", e);
    private void initSSL(DBRProgressMonitor monitor, Properties properties, DBWHandlerConfiguration sslConfig) throws DBCException {
    @Override
    }
        }
        return false;
 * DBeaver - Universal Database Manager
            final String keystoreFileProp;
    public ErrorType discoverErrorType(@NotNull Throwable error) {

                try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT database_id, SUM(size)\n" +
    private static final String PROP_ENCRYPT_SSL = "encrypt";
    }
            return;
                keystorePasswordProp = sslConfig.getStringProperty(SQLServerConstants.PROP_SSL_KEYSTORE_PASSWORD);
        if (SQLServerUtils.isDriverAzure(getContainer().getDriver()) || SQLServerUtils.isDriverBabelfish(getContainer().getDriver()) || isDataWarehouseServer(monitor)) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            SQLServerTableBase table = SQLServerUtils.getTableFromQuery(session, sqlQuery, this);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load data source meta info")) {
import org.jkiss.dbeaver.model.exec.*;
                    // SERVERPROPERTY returns int 6 or 11 if it is Azure Synapse
        dataTypeCache.cacheObject(sdt);

            }

        var tempdb = getDatabase(monitor, SQLServerConstants.TEMPDB_DATABASE);

    }

    {

        }
import org.jkiss.utils.CommonUtils;
        hasStatistics = false;
import org.jkiss.dbeaver.model.exec.jdbc.*;
    extends JDBCDataSource
            case ROWID -> "uniqueidentifier";
     * Returns true only in case we find the table and this table has clustered COLUMNSTORE index.
    }
                if (trustStoreData != null && trustStoreData.length != 0) {
        return !isBabelfish && !isSynapseDatabase;
                }
import org.jkiss.dbeaver.model.*;
        super(monitor, container, new SQLServerDialectMssql());
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
            String loginName = JDBCUtils.safeGetString(resultSet, "name");


        for (SQLServerDataType dt : dataTypeCache.getCachedObjects()) {
    }
    }
    @NotNull
            } catch (Exception e) {
            var dbo = tempdb.getSchema(monitor, SQLServerConstants.DEFAULT_SCHEMA_NAME);
        return !isBabelfish;
    }
        }
                return null;
            final String keystorePasswordProp;
        return switch (dataKind) {
        boolean hasNextValExpr = false;
                            database.setDatabaseTotalSize(bytes);
                keystorePasswordProp = sslConfig.getPassword();

                    "FROM sys.master_files WITH(NOWAIT)\n" +
    @Override
    @NotNull

    }
                        .stream()
        } else if (adapter == DBAServerSessionManager.class) {
import org.jkiss.dbeaver.DBException;
    private String getServerVersion(DBRProgressMonitor monitor) {
        @Override
            }
                log.debug("Empty database name fetched");
    @NotNull
    }
        if (sslConfig != null && sslConfig.isEnabled()) {
            return supportsExternalTables(session);

import org.jkiss.utils.BeanUtils;
 * you may not use this file except in compliance with the License.
            } catch (Throwable e) {
    public boolean isSynapseDatabase() {

 *
                    Object serverErrorLine = BeanUtils.readObjectProperty(serverError, "lineNumber");

            } else if (showSpecifiedDatabase) {
            hasStatistics = true;
    }
            // (i.e. do not validate, trust all when encrypt option is enabled)
    }
        }
    // Databases
                }
        @NotNull

    @Association
 * Unless required by applicable law or agreed to in writing, software
        }
        } catch (DBCException e) {
            if (CommonUtils.isNotEmpty(loginName)) {

    public Collection<SQLServerDatabase> getDatabases(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
            }
        super.initialize(monitor);
    public ServerLoginCache getServerLoginCache() {
                sql.append("\nORDER BY db.name");
                }
            log.debug("System data type " + typeID + " not found");

import org.jkiss.dbeaver.Log;
                        SQLServerDatabase database = getDatabase(monitor, dbId);
        protected SQLServerLogin fetchObject(

            JDBCPreparedStatement dbStat;

    private final ServerLoginCache serverLoginCache = new ServerLoginCache();
        protected SQLServerDataType fetchObject(@NotNull JDBCSession session, @NotNull SQLServerDataSource dataSource, @NotNull JDBCResultSet resultSet) {
                }
            DBPConnectionConfiguration configuration = container.getConnectionConfiguration();
        }
    @NotNull
    }
        // Let's check the existence of column directly at the database
        if (SQLServerUtils.isDriverSqlServer(getContainer().getDriver())) {
        }
        return hasStatistics;
    }
    }
            if (useCurrentDatabaseName) {
    @Override

            // Read line number from SQLServerError class
            case STRING -> "varchar";
                        ErrorPosition pos = new ErrorPosition();
                false);
        return CommonUtils.toBoolean(getContainer().getConnectionConfiguration().getProviderProperty(SQLServerConstants.PROP_SHOW_ALL_SCHEMAS));
            }
            properties.setProperty(PROP_ENCRYPT_SSL, "false");
    @Nullable
    // Databases
                        true,
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerDataSource owner) throws SQLException {
    public boolean supportsColumnProperty() {
            if (!CommonUtils.isEmpty(keystoreHostnameProp)) {
    }
                serverVersion = JDBCUtils.queryString(session, "SELECT @@VERSION");
        }

        }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                }

                properties.put(SQLServerConstants.PROP_DRIVER_TRUST_SERVER_CERTIFICATE, Boolean.TRUE.toString());
import java.util.Collection;
    protected boolean isShowAllSchemas() {
    }
            properties.put(PROP_ENCRYPT_SSL, "true");
            return dbStat;
    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {
        try (JDBCSession session = DBUtils.openMetaSession(new VoidProgressMonitor(), this, "Determine external tables availability")) {
                keystorePasswordProp = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE_PASSWORD);
 *
        return SQLServerDatabase.class;
            return ErrorType.AUTHENTICATION_FAILED;
        }
    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {
        return serverLoginCache;
     */
