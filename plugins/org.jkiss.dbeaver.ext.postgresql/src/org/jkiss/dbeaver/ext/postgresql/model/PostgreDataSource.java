                // Backward compatibility
                log.debug(e);
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        if (!CommonUtils.isEmpty(message)) {
    @Override
        if (!getServerType().supportsDatabaseSize()) {
 *
    public boolean cancelCurrentExecution(@NotNull Connection connection, @Nullable Thread connectionThread) throws DBException {
        // Read databases
    private static final PostgrePrivilegeType[] SUPPORTED_PRIVILEGE_TYPES = new PostgrePrivilegeType[]{
        }
            }
        return getDatabase(childName);
        if (defDatabase == null) {
        }
    @Override
        return new PostgreDatabase(monitor, this, dbResult);
                        dbList.add(database);
            } else {

        }


            return session.prepareStatement("select * from pg_catalog.pg_settings");
        return DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser();
    @Override
                        }
    @NotNull
        } else {
                keyCertProp = sslConfig.getStringProperty(PostgreConstants.PROP_SSL_CLIENT_KEY);
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    }

    @Override
        }
        return defDatabase;
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {

                String keyCertDer = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY);
    @Override
    @Override
            try (PreparedStatement dbStat = prepareReadDatabaseListStatement(monitor, bootstrapConnection, configuration)) {
                throw new DBException("Can not configure SSL", e);
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    static class SettingCache extends JDBCObjectLookupCache<PostgreDataSource, PostgreSetting> {
    protected boolean isReadDatabaseList(DBPConnectionConfiguration configuration) {
            }
import org.jkiss.dbeaver.registry.timezone.TimezoneRegistry;
            } catch (SQLException e) {
    @Override
import org.jkiss.dbeaver.model.sql.SQLDialect;
                        final DBPDriver driver = getContainer().getDriver();
        String currentTimezoneId = ZoneId.systemDefault().getId();
                        if (database != null) {
            }





        return new PostgreDatabase(monitor, this, name, owner, templateName, tablespace, encoding);


        return databaseCache.getCachedObject(name);
    public PostgreServerType getType() {
    }
        if (dataType != null) {
    public boolean supportReadingAllDataTypes() {

        }
            }
        StringBuilder catalogQuery = new StringBuilder("SELECT db.oid,db.* FROM pg_catalog.pg_database db WHERE 1 = 1");
                    return dbNames;
            return true;
                pgConnection.setClientInfo(JDBCConstants.APPLICATION_NAME_CLIENT_PROPERTY, DBUtils.getClientApplicationName(getContainer(), context, purpose));
import org.jkiss.dbeaver.ext.postgresql.model.jdbc.PostgreJdbcFactory;
        try {
    }

        final boolean showNDD = isReadDatabaseList(configuration);
        return CommonUtils.toBoolean(
    public PostgreDataSource(DBPDataSourceContainer container, String serverVersion, String activeDatabaseName) {
            }
        return dbStat;
            throw new DBException("Error reading template databases", e);
            return adapter.cast(new PostgreServerOutputReader());
    }
            // Read server version info here - it is needed during database metadata fetch (#8061)
            final String keyCertProp;
    }
        PostgrePrivilegeType.MAINTAIN


            return;
    @Override
        if (CommonUtils.isEmpty(activeDatabaseName)) {

    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {

                        newURL = driver.getDataSourceProvider().getConnectionURL(driver, newConfig);
            } catch (Exception e) {
    @Override

    public boolean isConnectionRefreshing() {
            // Preload some settings, if available

                    .getProviderProperty(PostgreConstants.PROP_SHOW_DATABASE_STATISTICS));
                }
        PostgrePrivilegeType.CREATE,
                rootCertProp = sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT);

        settingCache = new SettingCache();
        return null;

        this.hasStatistics = false;
            final boolean showUnavailable = CommonUtils.toBoolean(configuration.getProviderProperty(PostgreConstants.PROP_SHOW_UNAVAILABLE_DB));
        } finally {


                        PostgreDatabase database = getDatabase(dbName);
    @Override
            props.put("sslfactory", factoryProp);

        this.initialize(monitor);
            throw new DBException("Can't connect to remote PostgreSQL server", e);
    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {
            try {
                             @NotNull DBPDataSourceContainer container,
        return settingCache;
        }
        databaseCache.setCache(Collections.singletonList(defDatabase));
                try (PreparedStatement stat = bootstrapConnection.prepareStatement("SELECT current_database()")) {
            } else if (PostgreConstants.ERROR_TRANSACTION_ABORTED.equals(sqlState)) {
        }
                String keyCertProp = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY_VALUE);
                // If database was changed then use new name for connection
                } else {
            if (PostgreConstants.ERROR_ADMIN_SHUTDOWN.equals(sqlState)) {
                if (CommonUtils.isNotEmpty(keyCertDer)) { // may be after exception
        final String modeProp = sslConfig.getStringProperty(PostgreConstants.PROP_SSL_MODE);
        } catch (SQLException e) {
        final DBWHandlerConfiguration sslConfig = getContainer().getActualConnectionConfiguration().getHandler(PostgreConstants.HANDLER_SSL);
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreDataSource owner, @Nullable PostgreSetting object, @Nullable String objectName) throws SQLException {
        PostgrePrivilegeType.CONNECT,

    public List<PostgreDatabase> getAvailableInstances() {
    @Nullable
        super(monitor, container, new PostgreDialect());

    // True if we need multiple databases
        }
            }
                    props.put("sslrootcert", saveCertificateToFile(rootCertProp));
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
                activeDatabaseName = PostgreConstants.DEFAULT_DATABASE;
    @Override
    private void loadAvailableDatabases(@NotNull DBRProgressMonitor monitor, DBPConnectionConfiguration configuration, List<PostgreDatabase> dbList) throws DBException {

                "SELECT db.datname,pg_database_size(db.oid) FROM pg_catalog.pg_database db " +
        }
        return PostgreUtils.getServerType(getContainer().getDriver());
            }
        throws DBException {
    public PostgreSetting getSetting(String name) {
        }
            if (getServerType().supportsCopyFromStdIn()) {
    {

        return supportsReltypeColumn;
                pgConnection = super.openConnection(monitor, context, purpose);
        PostgreServerType serverType = getType();

    }
            if (catalogFilters != null) {
                    supportsEnumTable = PostgreUtils.isMetaObjectExists(session, "pg_enum", "*");

                if (useProxy) {
            } catch (Throwable e) {
                             @NotNull SQLDialect dialect) throws DBException {

        } else if (adapter == DBAUserPasswordManager.class) {
    public void readDatabaseServerVersion(JDBCSession session) throws SQLException {
        return new PostgreDataSourceInfo(this, metaData);
                }

            // Get all databases
    }
            try (PreparedStatement dbStat = session.prepareStatement("SELECT db.datname FROM pg_catalog.pg_database db WHERE datistemplate")) {
        super.readDatabaseServerVersion(session, session.getMetaData());
                    catalogQuery.append("OR db.datname =?");
    }
        if (activeSchema != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {

    @Override
    }
    @Override

            final Throwable cause = CommonUtils.getRootCause(e);
            getDefaultInstance().checkInstanceConnection(monitor, false);

            if ("sun.security.util.DerValue".equals(element.getClassName()) && handler != null) { //$NON-NLS-1$
            this.activeDatabaseName = null;
import java.util.regex.Matcher;
    }
            if (errorType != null) {
        boolean addExclusionName = false;
                                          @Nullable JDBCExecutionContext initFrom) throws DBException {
                supportsReltypeColumn = PostgreUtils.isMetaObjectExists(session, "pg_class", "reltype");
        if (adapter == DBSStructureAssistant.class) {



                supportsReltypeColumn = false;
                if (!CommonUtils.isEmpty(connectionDBName)) {
package org.jkiss.dbeaver.ext.postgresql.model;
                    // User can add the name of template database in the Database field of connection settings. We must take it into account
            getServerType().initDefaultSSLConfig(connectionInfo, props);
                }
            // Local FS mode
    {
import java.sql.Connection;
    }
    }

        }
        if (getServerType() instanceof DBPErrorAssistant) {
    }
            return new QueryTransformerFetchAll();
    @Nullable
        } else if (adapter == DBSDataBulkLoader.class) {
                } else {
            if (allDatabases.isEmpty()) {
                if (serverErrorMessage != null) {
            }
import java.util.*;
        this.serverVersion = serverVersion;
        } else if (adapter == DBCServerOutputReader.class) {
                    props.put("sslkey", keyCertDer);
        PostgrePrivilegeType.EXECUTE,
    @Override
                }

            }
            }
                // Something went wrong. Doesn't matter, ignore it as we are already in error handling routine
    public void initialize(@NotNull DBRProgressMonitor monitor)
            }
            throw e;
        return isConnectionRefreshing;
        if (addExclusionName) {
    }

                    if (SSLHandlerTrustStoreImpl.loadDerFromPem(handler, dst)) {
    ) throws DBCException {
    protected PostgreExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
            }
    @NotNull
        try {
                serverVersion = JDBCUtils.queryString(session, "SELECT version()");

            // Provide client info. Not supported by Redshift?
    public ErrorType discoverErrorType(@NotNull Throwable error) {
                return adapter.cast(new PostgreCopyLoader(this));
        return PostgreUtils.resolveTypeFullName(monitor, this, typeFullName);

            // new timezone, which will lead to the error while connecting, there is no way to know before connecting
        {
            default -> super.getDataSourceFeature(featureId);
        return CommonUtils.getBoolean(configuration.getProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB), false);
            // so to be sure we will use the old name

            return adapter.cast(new PostgreStructureAssistant(this));
        PostgrePrivilegeType.TEMPORARY,
            if (!showTemplates) {
    public List<PostgreDatabase> getDatabases()
        return settingCache.getCachedObject(name);
    @Override
    public PostgreDatabase createDatabaseImpl(DBRProgressMonitor monitor, String name, PostgreRole owner, String templateName, PostgreTablespace tablespace, PostgreCharset encoding) throws DBException {

            if (isNeedToReplaceLegacyTimezone() && legacyTimezoneOverridden != null) {
        if (!this.isConnectionRefreshing()) {
        databaseCache.getAllObjects(monitor, this);



                    // Generate URL with new database name
        hasStatistics = true;
        return databaseCache.getCachedObjects();
        @NotNull DBPConnectionConfiguration connectionInfo
public class PostgreDataSource extends JDBCDataSource implements DBSInstanceContainer, DBPAdaptable,
                        // Unfortunately, we can't delete the temp file here.
            }
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerPostgreSQL;
    @Override
    private boolean supportsEnumTable;


    public PostgreDatabase createDatabaseImpl(@NotNull DBRProgressMonitor monitor, ResultSet dbResult) throws DBException {
        super.refreshObject(monitor);
        Throwable rootCause = CommonUtils.getRootCause(error);
    }
    }
        }
    @Override
            if (CommonUtils.isEmpty(sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD))) {

            try {
            final List<PostgreDatabase> allDatabases = databaseCache.getCachedObjects();
            defDatabase = allDatabases.get(0);
        DBExecUtils.startContextInitiation(getContainer());
                    (databases.size() == 1 ? "WHERE db.oid=?" : "")))
import org.jkiss.dbeaver.ext.postgresql.model.session.PostgreSessionManager;
    @Override
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
    }
        this.activeDatabaseName = activeDatabaseName;
                catalogQuery.append(" AND NOT datistemplate ");
            && !CommonUtils.toBoolean(getContainer().getActualConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_USE_PREPARED_STATEMENTS))) {
                    while (dbResult.next()) {
                final JDBCPreparedStatement dbStat = session.prepareStatement("select * from pg_catalog.pg_settings where name=?");

                        // The chain is built asynchronously by the driver, and we don't know at which moment in time it will happen.
        if (sqlState != null) {
                    if (position instanceof Number) {

        if (sslConfig != null && sslConfig.isEnabled()) {
        }

        return getDefaultInstance().getDefaultDataTypeName(dataKind);
            // ignore
    }
                // Looks like we are not connected or in connection process right now - no instance then

import org.jkiss.dbeaver.model.*;
        try {
    public Collection<PostgreSetting> getSettings() {
        if (!showNDD) {

    public boolean isSupportsEnumTable() {
        }
    }

        return null;
                        if (rs.next()) {

                    }
        databaseCache = new DatabaseCache();
        }
        PostgreDatabase defDatabase = new PostgreDatabase(
    // Connections
        }

        } finally {
        // Get all databases
    public String getServerVersion() {
    private SettingCache settingCache;
    void setActiveDatabase(PostgreDatabase newDatabase, DBCExecutionContext context) {
        DBPConnectionConfiguration configuration = getContainer().getActualConnectionConfiguration();
        props.put("sslpasswordcallback", DefaultCallbackHandler.class.getName());
                rootCertProp = sslConfig.getStringProperty(PostgreConstants.PROP_SSL_ROOT_CERT);
            }


    private static class DatabaseCache extends SimpleObjectCache<PostgreDataSource, PostgreDatabase> {
                try {
        return new PostgreExecutionContext((PostgreDatabase) instance, type);
        };

        @NotNull DBRProgressMonitor monitor,
            }
    private String activeDatabaseName;
 * you may not use this file except in compliance with the License.
        super.initialize(monitor);
    }
                props.put("sslkey", keyCertProp);
        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load template databases")) {
        String activeDatabaseName = PostgreUtils.getDatabaseNameFromConfiguration(configuration);
        return getDefaultInstance().getLocalDataType(typeName);
    public boolean isSupportsReltypeColumn() {
            }
                            database.setDbTotalSize(dbSize);
            this.databaseCache.clearCache();
            // Old versions of postgres and some linux distributions, on which docker images are made, may not contain
import org.jkiss.utils.CommonUtils;
                }
    private DatabaseCache databaseCache;
    {
    @NotNull
        return databaseCache;
import org.jkiss.dbeaver.Log;
    public boolean isNeedToReplaceLegacyTimezone() {
                JDBCUtils.appendFilterClause(catalogQuery, catalogFilters, "datname", false, this);
        if (!CommonUtils.isEmpty(modeProp)) {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ModelPreferences;
                }
        @NotNull DBPDriver driver,
            } catch (Exception e) {
                    supportsEnumTable = false;
    {
    }
                    }
    }
                    while (resultSet.next()) {
                    }
    public PostgreDataType getLocalDataType(String typeName)
        return getServerType().supportsRoles() && !getContainer().getNavigatorSettings().isShowOnlyEntities() && !getContainer().getNavigatorSettings().isHideFolders();
                        // It will still be deleted during shutdown.
        if (getServerType().supportsClientInfo() && !getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
    protected Map<String, String> getInternalConnectionProperties(
            Collection<PostgreDatabase> databases = getDatabases();
 * You may obtain a copy of the License at
    private volatile boolean isConnectionRefreshing = false;
    }
        this.shouldShowStatistics = CommonUtils.getBoolean(container.getConnectionConfiguration()
                String databaseName;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return CommonUtils.toBoolean(
            getContainer().getActualConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_READ_KEYS_WITH_COLUMNS));
            PostgreDatabase defDatabase = createDatabaseImpl(monitor, activeDatabaseName);
                return ErrorType.TRANSACTION_ABORTED;
        String sqlState = SQLState.getStateFromException(error);

        throws DBException {

                    props.put("sslcert", saveCertificateToFile(clientCertProp));
            try {
            dbStat.setString(1, connectionDBName);
    @Override
            }
                catalogQuery.append(" AND datallowconn");
    }
    }

            try {
                        ErrorPosition pos = new ErrorPosition();
            }
            if (!CommonUtils.isEmpty(rootCertProp)) {
            return;
                    }

                }
        @NotNull
import org.jkiss.dbeaver.model.sql.SQLState;
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
        } catch (DBCException e) {
        String message = error.getMessage();
        }
        DBUtils.fireObjectSelect(oldDatabase, false, context);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        return settingCache.getCachedObjects();
                }
        }
        return super.getAdapter(adapter);
    public PostgreServerExtension getServerType() {
import org.jkiss.dbeaver.model.meta.ForTest;
        PostgreDatabase defDatabase = databaseCache.getCachedObject(activeDatabaseName);
    }
                }
        final DBPConnectionConfiguration conConfig = getContainer().getActualConnectionConfiguration();
    }
            JDBCUtils.setFilterParameters(dbStat, addExclusionName ? 2 : 1, catalogFilters);
            }
        protected PostgreSetting fetchObject(@NotNull JDBCSession session, @NotNull PostgreDataSource owner, @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
                }
        }
            }
        } catch (Throwable e) {
        return getDefaultInstance().getLocalDataTypes();
        return supportsEnumTable;
                keyCertProp = sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY);
            throw new DBDatabaseException("Can't cancel connection query", e, this);
    private void initProxySSL(Map<String, String> props, DBWHandlerConfiguration sslConfig) {
    }
            } catch (Throwable e) {
        PreparedStatement dbStat = bootstrapConnection.prepareStatement(catalogQuery.toString());
        return new PostgreDatabase(monitor, this, name);
    }
        
    public PostgreDatabase createDatabaseImpl(@NotNull DBRProgressMonitor monitor, String name) throws DBException {
        // Initiate default context
    }
                log.debug("Error reading PostgreSQL version: " + e.getMessage());
            readDatabaseServerVersion(bootstrapConnection, bootstrapConnection.getMetaData());
    }

import org.jkiss.dbeaver.runtime.net.DefaultCallbackHandler;
            this.isConnectionRefreshing = false;
                }
                props.put("sslrootcert", rootCertProp);
                pgConnection = super.openConnection(monitor, context, newConfig, purpose);
        PostgreExecutionContext postgreContext = (PostgreExecutionContext) context;
    @Override
        @Override


    }
                clientCertProp = sslConfig.getStringProperty(PostgreConstants.PROP_SSL_CLIENT_CERT);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read server information")) {
            try {
        // No special config
            if (!CommonUtils.isEmpty(clientCertProp)) {
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
    /**
import org.jkiss.dbeaver.runtime.DBWorkbench;
            activeDatabaseName);
                newConfig.setDatabaseName(databaseName);
                    while (dbResult.next()) {
            if (matcher.find()) {
        return CommonUtils.toBoolean(getContainer().getActualConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_READ_ALL_DATA_TYPES));
            } else {

            ErrorType errorType = ((DBPErrorAssistant) getServerType()).discoverErrorType(error);
 * See the License for the specific language governing permissions and
                log.error("Can't determine server type", e);
        }
        }
            }
        PostgrePrivilegeType.SELECT,

                newConfig.setUrl(newURL);
            if (isNeedToReplaceLegacyTimezone() && legacyTimezoneOverridden != null) {
    @NotNull
    public PostgrePrivilegeType[] getSupportedPrivilegeTypes() {
import org.jkiss.dbeaver.model.struct.*;
    @Override
                boolean useProxy = sslConfig.getBooleanProperty(PostgreConstants.PROP_SSL_PROXY);
        settingCache = new SettingCache();
        // Notify UI
                        return new ErrorPosition[] {pos};
        }
    private volatile boolean hasStatistics;
        PostgrePrivilegeType.DELETE,
            }
                    }
        }
        // It is configurable by default
        }
                        String dbName = JDBCUtils.safeGetString(dbResult, 1);
                props.put("sslcert", clientCertProp);
            dbList.add(defDatabase);
            if (!CommonUtils.isEmpty(keyCertProp)) {
    }
            PostgreConstants.PROP_SHOW_DATABASE_STATISTICS));
            activeSchema = ((PostgreExecutionContext)initFrom).getDefaultSchema();
            return;

        }
            } catch (Exception e) {
            props.put("readOnly", "true");
        return pgConnection;
    }
        }
                        PostgreDatabase database = createDatabaseImpl(monitor, dbResult);
        PostgrePrivilegeType.TRUNCATE,
    }
        }
        @NotNull DBRProgressMonitor monitor,
                            activeDatabaseName = JDBCUtils.safeGetString(rs, 1);
    }
        return super.discoverErrorType(error);

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.connection.DBPDriver;

        return switch (featureId) {

            if (!showUnavailable) {

    }
    protected String serverVersion;
        return PostgreDatabase.class;
    @NotNull
            if (isReadDatabaseList(conConfig) || !CommonUtils.isEmpty(conConfig.getBootstrap().getDefaultCatalogName())) {
            session.enableLogging(false);
    @Override
        if (!isMultiUserOrDistributed()) {
/*
        } catch (Exception e) {

                        return this.openConnection(monitor, context, purpose);
        if (hasStatistics && !forceRefresh) {
        @NotNull String purpose,
    }
    public List<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) {
    @Override
                if (databases.size() == 1) {
    }
    }

    private boolean supportsReltypeColumn = true;
        @NotNull Connection bootstrapConnection,
        try (Connection bootstrapConnection = openConnection(monitor, null, "Read PostgreSQL database list")) {
                    if (CommonUtils.isEmpty(newConfig.getUrl()) || !CommonUtils.isEmpty(newConfig.getHostName())) {
import org.jkiss.dbeaver.model.exec.*;
        PostgrePrivilegeType.REFERENCES,
    @NotNull
            this.initializeRemoteInstance(monitor);
            this,
        return new PostgreJdbcFactory();
                try (ResultSet resultSet = dbStat.executeQuery()) {
                clientCertProp = sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT);
    }
        @NotNull DBPConnectionConfiguration configuration) throws SQLException
    @Nullable
        shutdown(monitor);
                    log.error("Error converting SSL key", ex);
            // Turn off prepared statements using, to avoid error: "ERROR: prepared statement "S_1" already exists" from PGBouncer #10742
        return getDatabases();


                return new ErrorPosition[] {pos};
    public DBSDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull String typeFullName) throws DBException {
        Map<String, String> props = new LinkedHashMap<>(PostgreDataSourceProvider.getConnectionsProps());
                DBPConnectionConfiguration newConfig = new DBPConnectionConfiguration(conConfig);
        } else {

                    databaseName = instance.getName();
            return new PostgreSetting(owner, dbResult);
        PostgrePrivilegeType.TRIGGER,
        if (!shouldShowStatistics) {
                String rootCertProp = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT_VALUE);
    ////////////////////////////////////////////
                } else {
    public PostgreDataSource(@NotNull DBRProgressMonitor monitor,
        if (initFrom != null) {
    private PostgreServerExtension serverExtension;
        if (getContainer().isConnectionReadOnly()) {
    private boolean isMultiUserOrDistributed() {

    }
            props.put("readOnlyMode", "always");
import java.nio.file.Path;
    @Override
        }
        PostgrePrivilegeType.USAGE,
            }
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context,
    }
        return serverVersion;
                        long dbSize = dbResult.getLong(2);

            final DBWHandlerConfiguration handler = conConfig.getHandler(PostgreConstants.HANDLER_SSL);
    private void initServerSSL(Map<String, String> props, DBWHandlerConfiguration sslConfig) throws DBException {
import org.jkiss.dbeaver.ext.postgresql.model.plan.PostgreQueryPlaner;
            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
import java.util.regex.Pattern;

        DBSObjectFilter catalogFilters = getContainer().getObjectFilter(PostgreDatabase.class, null, false);
            if (object != null || objectName != null) {
    private static final Log log = Log.getLog(PostgreDataSource.class);
    }
        PostgrePrivilegeType.INSERT,
 *
                throw new DBCException(e, session.getExecutionContext());
            settingCache.getObject(monitor, this, PostgreConstants.OPTION_STANDARD_CONFORMING_STRINGS);
    }
        }
import java.sql.SQLException;

        props.put(PostgreConstants.PROP_SSL, "true");
            if (activeDatabaseName == null) {
        postgreContext.refreshDefaults(monitor, true);
        if (defDatabase == null) {
                    databaseName = PostgreUtils.getDatabaseNameFromConfiguration(conConfig);
                    initProxySSL(props, sslConfig);
            props.put("sslmode", modeProp);
        PostgrePrivilegeType.UPDATE,
    public Object getDataSourceFeature(String featureId) {
        DBSDataType dataType = super.resolveDataType(monitor, typeFullName);
        //initServerSSL(props, sslConfig);
 * distributed under the License is distributed on an "AS IS" BASIS,

    public Collection<PostgreDataType> getLocalDataTypes()
        }
        @Override

                    dbStat.setLong(1, databases.iterator().next().getObjectId());
            final String rootCertProp;
                pos.position = Integer.parseInt(matcher.group(1)) - 1;
 * Unless required by applicable law or agreed to in writing, software
    }
        if (oldDatabase == newDatabase) {
    @Override
        }
                activeDatabaseName = configuration.getUserName();
 */
    {
import org.jkiss.dbeaver.model.exec.jdbc.*;
        if (serverExtension == null) {
            loadAvailableDatabases(monitor, configuration, dbList);
                Object serverErrorMessage = BeanUtils.readObjectProperty(rootCause, "serverErrorMessage");
    };
    protected void initializeRemoteInstance(@NotNull DBRProgressMonitor monitor) throws DBException {
                    }
        }

    public boolean supportsReadingKeysWithColumns() {
                try (ResultSet dbResult = dbStat.executeQuery()) {
            return adapter.cast(new PostgreQueryPlaner(this));
            return new QueryTransformerLimit(false, true);
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
 *
import org.jkiss.dbeaver.ext.postgresql.PostgreDataSourceProvider;
    public List<String> getTemplateDatabases(DBRProgressMonitor monitor) throws DBException {

import java.time.ZoneId;
    @Nullable
            postgreContext.setDefaultCatalog(monitor, activeSchema.getDatabase(), activeSchema, true);
        }
        return props;
                }
        if (!CommonUtils.isEmpty(factoryProp)) {
    private final Pattern ERROR_POSITION_PATTERN = Pattern.compile("\\n\\s*\\p{L}+\\s*: ([0-9]+)");
                String newURL = newConfig.getUrl();
                    addExclusionName = true;



    public SimpleObjectCache<PostgreDataSource, PostgreDatabase> getDatabaseCache()

        }
        Connection pgConnection;
    }
        databaseCache = new DatabaseCache();
    {
        return serverExtension;
    protected PreparedStatement prepareReadDatabaseListStatement(
    }
    public PostgreDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container)

        super(container, new PostgreDialect());
            try {
/**
    }
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
 * limitations under the License.
        } else {
            case DBPDataSource.FEATURE_LOB_REQUIRE_TRANSACTIONS -> true;
                } else if (CommonUtils.isNotEmpty(keyCertProp)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
                return errorType;
                try {
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {

            try {
            log.debug("Initiate connection to " + getServerType().getServerTypeName() + " database [" + instance.getName() + "@" + conConfig.getHostName() + "] for " + purpose);
        return databaseCache.getCachedObjects();
        try {
    public PostgreDatabase getDefaultInstance() {
import org.jkiss.code.Nullable;
            this.hasStatistics = false;
                } catch (Exception e) {
}

                }
                if (newConfig.getConfigurationType() == DBPDriverConfigurationType.MANUAL) {
import java.io.IOException;
import java.sql.PreparedStatement;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
            final String clientCertProp;
 * PostgreDataSource
import org.jkiss.dbeaver.DBDatabaseException;
                    // Patch connection URL with new database name
            catalogQuery.append("\nORDER BY db.datname");
                }
                    initServerSSL(props, sslConfig);
        getDefaultInstance().checkInstanceConnection(monitor, false);
                    props.put("sslkey", saveCertificateToFile(keyCertProp));
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
    }
        } else if (adapter == DBCQueryPlanner.class) {
            }
            } catch (IOException e) {

                TimezoneRegistry.setDefaultZone(ZoneId.of(currentTimezoneId), false);
            } else {
        return SUPPORTED_PRIVILEGE_TYPES;
        return getDefaultInstance().getLocalDataType(typeID);
        } finally {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.*;
                serverVersion = "";

            }
    @NotNull
            this.isConnectionRefreshing = true;
        } else if (adapter == DBAServerSessionManager.class) {
        }
    public <T> T getAdapter(@NotNull Class<T> adapter)

            } catch (Throwable e) {
        } finally {
                throw new DBCException("Error configuring SSL certificates", e);
    // Constructor for tests
 */
                    throw e;
    {
    @NotNull
            case DBPDataSource.FEATURE_MAX_STRING_LENGTH -> 10485760;

    @Override
                        }
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) {
    @ForTest

                log.debug("Error reading pg_class.reltype " + e.getMessage());
        this.shouldShowStatistics = CommonUtils.getBoolean(container.getConnectionConfiguration().getProviderProperty(
    }
                dbStat.setString(1, object != null ? object.getName() : objectName);
    DBPObjectStatisticsCollector {
            }
                    try (ResultSet rs = stat.executeQuery()) {
    private boolean shouldShowStatistics;
                } catch (IOException ex) {
    }


            PostgreServerType serverType = getType();
    {
    }
                }
                TimezoneRegistry.setDefaultZone(ZoneId.of(legacyTimezoneOverridden), false);
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
                return adapter.cast(new PostgresUserPasswordManager(this));
    }
        List<PostgreDatabase> dbList = new ArrayList<>();
        throws DBException
    }
                    Object position = BeanUtils.readObjectProperty(serverErrorMessage, "position");
            }
                String clientCertProp = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT_VALUE);
    public PostgreDatabase getDatabase(String name)
                    newURL = PostgreUtils.updateDatabaseNameInURL(newConfig.getUrl(), databaseName);
        String connectionDBName = PostgreUtils.getDatabaseNameFromConfiguration(getContainer().getConnectionConfiguration());
        }
            BeanUtils.invokeObjectMethod(connection, "cancelQuery");
                if (instance != null) {
        }
    @NotNull
        JDBCRemoteInstance instance = context == null ? null : context.getOwnerInstance();
                // just ignore
            if (!CommonUtils.isEmpty(configuration.getUserName())) {
        final PostgreDatabase oldDatabase = getDefaultInstance();
    @Nullable
                serverExtension = new PostgreServerPostgreSQL(this);
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReader;
                        dbNames.add(resultSet.getString(1));
        } else if (type == DBCQueryTransformType.FETCH_ALL_TABLE) {
    }
        @Nullable
        PostgreSchema activeSchema = null;
    @NotNull
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData)
            if (getServerType().supportsAlterUserChangePassword()) {
                if (!CommonUtils.isEmpty(clientCertProp)) {
import org.jkiss.dbeaver.model.struct.cache.SimpleObjectCache;
    SettingCache getSettingCache() {
        if (instance != null) {
            if (isServerVersionAtLeast(12, 0)) {

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
            final boolean showTemplates = CommonUtils.toBoolean(configuration.getProviderProperty(PostgreConstants.PROP_SHOW_TEMPLATES_DB));
            defDatabase = databaseCache.getCachedObject(PostgreConstants.DEFAULT_DATABASE);
                if (!CommonUtils.isEmpty(rootCertProp)) {
import java.sql.ResultSet;
                return ErrorType.CONNECTION_LOST;
                return dbStat;
import org.jkiss.utils.BeanUtils;
    @NotNull
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        }
    }

     * Returns true if a database support pg_ctalog.reltype column. True by default.
        return this;
    public DBSDataType getLocalDataType(int typeID) {
        getDefaultInstance().cacheDataTypes(monitor, true);
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
            return dataType;
        final String factoryProp = sslConfig.getStringProperty(PostgreConstants.PROP_SSL_FACTORY);
    }
        super(monitor, container, dialect);
        if (catalogFilters != null) {
            hasStatistics = true;
            DBExecUtils.finishContextInitiation(getContainer());
        if (PostgreConstants.PSQL_EXCEPTION_CLASS_NAME.equals(rootCause.getClass().getName())) {
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) {
        @NotNull JDBCExecutionContext context,
            props.put("prepareThreshold", "0");
    @Override
        databaseCache.setCache(dbList);
            }
                    final Path dst = DBWorkbench.getPlatform().getTempFolder(monitor, "ssl").resolve(container.getId() + ".pk8");
import org.jkiss.code.NotNull;
            {
            }
 * DBeaver - Universal Database Manager
        return !shouldShowStatistics || hasStatistics;
    public boolean supportsRoles() {
    }
    {
    protected JDBCFactory createJdbcFactory() {
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context, @NotNull String purpose) throws DBCException {
    }
        DBUtils.fireObjectSelect(newDatabase, true, context);
            return adapter.cast(new PostgreSessionManager(this));
                    List<String> dbNames = new ArrayList<>();
                        pos.position = ((Number) position).intValue() - 1;
            getContainer().getActualConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_REPLACE_LEGACY_TIMEZONE));
     */
                    log.debug("Error reading pg_enum " + e.getMessage());
    }
        activeDatabaseName = newDatabase.getName();
                serverExtension = serverType.createServerExtension(this);
                throw new IllegalStateException("No databases found on the server");
            return;
        }
            final StackTraceElement element = cause.getStackTrace()[0];
            }
        String legacyTimezoneOverridden = PostgreConstants.REPLACING_TIMEZONE.get(currentTimezoneId);
    public boolean isStatisticsCollected() {
        // Make initial connection to read database list
            }
        if (serverType.turnOffPreparedStatements()
                    }

        } catch (DBException e) {
