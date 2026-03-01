    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {
        } else if (adapter == DBCQueryPlanner.class) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
            // Read charsets and collations
    }
        final String cipherSuites = sslConfig.getStringProperty(MySQLConstants.PROP_SSL_CIPHER_SUITES);
    /**
                        privileges.add(user);
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
                @Override

                catalogFilters = new DBSObjectFilter();
        props.put("useSSL", "true");
            }
        }
    @Association
                    return parameters;
                } catch (SQLException ex) {
        return DBUtils.findObject(getUsers(monitor), name);
        } catch (SQLException ex) {
                }
                return "BIGINT";
    public boolean supportsConditionForShowDatabasesStatement() {
     * @return {@code true} if plugins list reading is supported
    public List<MySQLParameter> getGlobalStatus(DBRProgressMonitor monitor)

        return props;
        return this;

    /**
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
                        try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                }
    public MySQLCollation getCollation(String name) {
                    if (dbResult.next()) {
                    0));
            return this.isServerVersionAtLeast(8, 0) && containsCheckConstraintTable;
    }

     * Return true if a special setting about metadata cache reading was enabled in advanced driver parameters or by version number.
                            catalog.setDatabaseSize(dbSize);
        if (version == null) {
    }

    }
    public List<DBSIndexType> supportedIndexTypes() {
                        while (dbResult.next()) {
                            collations.put(collation.getName(), collation);
        } catch (SQLException ex) {
        return dataTypeCache.getCachedObject(typeID);
                                log.warn("Charset '" + charsetName + "' not found.");
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;



            Types.OTHER,
            byte[] caCertData = SSLHandlerTrustStoreImpl.readCertificate(sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT, MySQLConstants.PROP_SSL_CA_CERT);
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM mysql.user ORDER BY user")) {
    public Collection<MySQLPlugin> getPlugins() {
        return false;
        }
import org.osgi.framework.Version;
            && dataTypeCache.getCachedObject(MySQLConstants.TYPE_GEOMETRY) == null) {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        throws DBException {
        } else if (adapter == DBAServerSessionManager.class) {


                    // Engines are not supported. Shame on it. Leave this list empty
        }
        return catalogCache;
    }
    @Override
        return isServerVersionAtLeast(5, 0);
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) {
                            }
    public MySQLCatalog getCatalog(String name) {

        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-users"), true);

    public boolean supportsCharsets() {
        if (hasStatistics && !forceRefresh) {
            log.error("Catalog " + catalogName + " not found");
                            charset.addCollation(collation);
                    Version version = getVersion();
        }
     * @return {@code true} if information_schema is supported
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
     * Returns list of supported index types
                }
        }
        switch (dataKind) {
 */
        return lowerCaseTableNames;
                props.put("trustStorePassword", String.valueOf(ksPass));
        }
            return this.isServerVersionAtLeast(10, 2) && containsCheckConstraintTable;
                throw new DBCException(e, session.getExecutionContext());
import org.jkiss.dbeaver.model.connection.DBPDriver;
            case BINARY:
    /**
    }
 * GenericDataSource
    private transient boolean inServerTimezoneHandle;
    static {
                    List<MySQLUser> userList = new ArrayList<>();

 * Copyright (C) 2010-2025 DBeaver Corp and others
            {
                    getContainer().getDriver()

        protected boolean handleCacheReadError(@NotNull Exception error) {
    public boolean supportsInformationSchema() {
                    throw new DBCException(e, context);
            props.put("verifyServerCertificate", String.valueOf(sslConfig.getBooleanProperty(MySQLConstants.PROP_VERIFY_SERVER_SERT)));
                            }
    public boolean supportsAlterTableRenameSyntax() {
        }
 * you may not use this file except in compliance with the License.
            }
    public boolean supportsPartitions() {
                return true;

import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
            props.put("trustServerCertificate", String.valueOf(!sslConfig.getBooleanProperty(MySQLConstants.PROP_VERIFY_SERVER_SERT)));
            }
                    }
    }
        }
                    stmt.execute("SELECT 1");
            readeAllCaches = CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter(
                    false,
    public Class<? extends MySQLCatalog> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {


                    MySQLConstants.TYPE_UUID,
    @Override
                        if (catalog != null) {
            MySQLConstants.PERFORMANCE_SCHEMA_NAME.equalsIgnoreCase(name) ||
    }
                plugins = new ArrayList<>();
            addGISDatatype(MySQLConstants.TYPE_POLYGON);
    /**
        return dataTypeCache.getCachedObjects();

    @Override
        return users;
                } catch (SQLException e) {
                            MySQLCollation collation = new MySQLCollation(charset, dbResult);
                    supportsCondition ? MySQLConstants.COL_DATABASE_NAME : MySQLConstants.COL_SCHEMA_NAME,
        return engines;
import org.jkiss.dbeaver.model.struct.DBSDataType;
                        parameters.add(parameter);
    }
        this.catalogCache.clearCache();
        throws DBException {
        super.initialize(monitor);
                return connectivityParameters.databaseName();
                        }
        if (!isMariaDB()) {
import org.jkiss.dbeaver.DBException;
                return engine;
                        }
    @NotNull
import org.jkiss.dbeaver.ModelPreferences;
            final char[] ksPass = securityManager.getKeyStorePassword(getContainer(), SSLConstants.SSL_CERT_TYPE);

    private final CatalogCache catalogCache = new CatalogCache() {
    }
        return
            // Newer MySQL servers/connectors requires explicit SSL disable

            case NUMERIC:
                // Workaround for nasty problem with MySQL 8 driver and serverTimezone error
    private Pattern ERROR_POSITION_PATTERN = Pattern.compile(" at line ([0-9]+)");
import org.jkiss.dbeaver.model.impl.jdbc.*;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {


        if (isMariaDB()) {
        } else {
        @Override
                    } catch (SQLException e) {

    public MySQLCatalog getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) {

                DBWUtils.ConnectivityParameters connectivityParameters = DBWUtils.getConnectivityParameters(
            }
            "allowLoadLocalInfile", "false",
                    }
            getContainer().getDriver().getDriverClassName());
    }
                            MySQLEngine engine = new MySQLEngine(this, dbResult);
        if (isMariaDB() && isServerVersionAtLeast(10, 7) && dataTypeCache.getCachedObject(MySQLConstants.TYPE_UUID) == null) {
import org.jkiss.dbeaver.ext.mysql.model.plan.MySQLPlanAnalyser;
            return adapter.cast(new MySQLSessionManager(this));
    };

                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
    private boolean containsCheckConstraintTable;
    }
        @NotNull String purpose,
            // Not supported by MariaDB driver for now (3.0.8). Waiting for the driver support
                            if (charsetName == null) {
        return charsets;
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public List<MySQLParameter> getSessionVariables(DBRProgressMonitor monitor)
 * DBeaver - Universal Database Manager
            if (object != null) {
    }
    private void changeUserPassword(
    }
                    "FROM information_schema.tables \n" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    List<MySQLParameter> parameters = new ArrayList<>();
            addGISDatatype(MySQLConstants.TYPE_GEOMETRY);

        }
                        lowerCaseTableNames = JDBCUtils.safeGetInt(dbResult, 2);
import org.jkiss.dbeaver.model.access.DBAuthUtils;
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW ENGINES")) {
                    return 65535;
    }
import java.util.regex.Pattern;
    int getLowerCaseTableNames() {
    public boolean supportsNativeClients() {
    public JDBCBasicDataTypeCache<MySQLDataSource, JDBCDataType> getDataTypeCache() {
                    java.sql.Types.OTHER,
    }
                        userList.add(user);
        return MySQLConstants.INFO_SCHEMA_NAME.equalsIgnoreCase(name) ||
    /**
                        SQLUtils.quoteString(this, newPassword)
    public MySQLPlugin getPlugin(@NotNull String name) {
    }
    public List<MySQLParameter> getSessionStatus(DBRProgressMonitor monitor)
    public boolean supportsSysSchema() {


        return null;
            return null;
        return isMariaDB() ? isServerVersionAtLeast(10, 6) : isServerVersionAtLeast(5, 7);
        }
    }

        }

            }
    @Association
        return super.getAdapter(adapter);
 *
    @NotNull

import java.nio.file.Path;
        throws DBException {

            }
                engines = new ArrayList<>();
        return MySQLConstants.TABLE_TYPES;
        if (CommonUtils.isEmpty(serverTZ) && inServerTimezoneHandle/*&& getContainer().getDriver().getId().equals(MySQLConstants.DRIVER_ID_MYSQL8)*/) {


                    return 255;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
                        while (dbResult.next()) {
                } catch (SQLException ex) {
            isServerVersionAtLeast(5, 1);

                            MySQLCharset charset = new MySQLCharset(this, dbResult);
            0,
    }
            return dbStat;
                return ErrorType.CONNECTION_LOST;
                    0,
            } catch (DBException e) {
    }
        return loadParameters(monitor, true, false);
            }
            }
                } catch (DBCException e2) {
            return this.isServerVersionAtLeast(10, 3);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        return privileges;
    private static final Pattern VERSION_PATTERN = Pattern.compile("([0-9]+\\.[0-9]+\\.[0-9]+).+");
                if (supportsPlugins()) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
                    }
        if (readeAllCaches == null) {
     * Returns true if the collation information is supported. Ex. for table creation.

                }
            DBPConnectionConfiguration configuration = owner.getContainer().getConnectionConfiguration();
            }
    }
    @Override
                    throw e2;
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-triggers"), true);
            case DBPDataSource.FEATURE_MAX_STRING_LENGTH:
                public boolean isFlipCoordinates() {
        if (!DBWorkbench.getPlatform().getApplication().isMultiuser()) {
                    readeAllCaches = version.getMajor() >= 8 && version.getMinor() >= 0 && version.getMicro() >= 21;
        }
        try {
 * See the License for the specific language governing permissions and
            if (isMariaDB()) {
                try {
        @Override
        return plugins;
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW PRIVILEGES")) {
                            "\tt.TABLE_SCHEMA = 'information_schema'\n" +
    @Override
     * Checks if it is possible to fetch transform
        return super.createQueryTransformer(type);
                    ));
        super.refreshObject(monitor);
    }
            if ("08".equals(SQLState.getStateFromException(error))) {
    }
        return MySQLCatalog.class;


                    String resultSet = JDBCUtils.queryString(session, "SELECT * FROM information_schema.TABLES t\n" +
    public MySQLUser getUser(DBRProgressMonitor monitor, String name)
     */
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-collations"), true);
            return;
            props.put("enabledSSLCipherSuites;", cipherSuites);
                            JDBCUtils.safeGetString(dbResult, "variable_name"),
    private String makeKeyStorePath(Path keyStorePath) throws MalformedURLException {
        String serverTZ = connectionInfo.getProviderProperty(MySQLConstants.PROP_SERVER_TIMEZONE);
        if (!this.isMariaDB() && !this.isServerVersionAtLeast(4, 1)) {
                            }
        }
        @NotNull DBPDriver driver,
    @Override
        }
                true);

    }
        }
                ((MySQLExecutionContext)context).setCurrentDatabase(monitor, object);
    public List<MySQLEngine> getEngines() {
    /**
    public Object getDataSourceFeature(String featureId) {
                "SHOW " +

        else {
    @Override
    @Override
    public String[] getTableTypes() {
    protected Map<String, String> getInternalConnectionProperties(
            if (e.getCause() instanceof SQLException &&
            return keyStorePath.toAbsolutePath().toString();
    /**
import org.jkiss.dbeaver.ext.mysql.model.session.MySQLSessionManager;
 *
        return catalog.getTable(monitor, tableName);
            // Trust keystore

                    }
        MySQLCatalog catalog = getCatalog(catalogName);
                public int getDefaultSRID() {
    @Association
            byte[] clientCertData = SSLHandlerTrustStoreImpl.readCertificate(sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT, MySQLConstants.PROP_SSL_CLIENT_CERT);

 *
    }
                    MySQLConstants.TYPE_UUID,
    public MySQLDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
    
                            props.put(MySQLConstants.PROP_ZERO_DATETIME_BEHAVIOR, "convertToNull");
            } else {
    public ErrorType discoverErrorType(@NotNull Throwable error) {
    public boolean supportsCheckConstraints() {
    }
        if (this.isMariaDB()) {
        return new MySQLDataSourceInfo(metaData);

import org.jkiss.dbeaver.runtime.DBWorkbench;
        return new MySQLCatalog(owner, resultSet);
            }
        if (adapter == DBSStructureAssistant.class) {
        @NotNull

                    // Engines are not supported. Shame on it. Leave this list empty
                            long dbSize = dbResult.getLong(2);
                    MySQLConstants.TYPE_JSON,
        } catch (SQLException e) {
            "allowLocalInfile", "false",
                                plugins.add(new MySQLPlugin(this, dbResult));
            if (matcher.matches()) {
import org.jkiss.code.NotNull;
        return Arrays.asList(MySQLConstants.INDEX_TYPE_BTREE,
        } catch (SQLException ex) {
                throw new DBCException("Error configuring SSL certificates", e);
                isPasswordExpired(e) &&
        @NotNull String newPassword,
        return DBUtils.findObject(engines, name);
        return null;
            // Provide client info
        }
                }
        @NotNull DBRProgressMonitor monitor,
            addGISDatatype(MySQLConstants.TYPE_MULTILINESTRING);
        throws DBException {
    private SQLHelpProvider helpProvider;
            }
            if (plugin.getName().equals(name)) {
                // Execute a dummy statement that will cause an exception to be thrown if the password is expired
import org.jkiss.dbeaver.DBDatabaseException;
            return keyStorePath.toUri().toURL().toString();
        } catch (DBCException e) {
    @Nullable
                pos.line = Integer.parseInt(matcher.group(1)) - 1;
        if ((!isMariaDB() && isServerVersionAtLeast(5, 7))
                } catch (Exception e) {
    public MySQLCharset getDefaultCharset() {
    @NotNull
        throws DBException {
    private Boolean readeAllCaches;
     *
                    try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW PLUGINS")) {
                }

                SQLState.SQL_01S00.getCode().equals (((SQLException) e.getCause()).getSQLState()) &&
    public Collection<? extends MySQLCatalog> getChildren(@NotNull DBRProgressMonitor monitor) {
     * Checks if table partitioning is supported.
    MySQLTable findTable(DBRProgressMonitor monitor, String catalogName, String tableName)
                        while (dbResult.next()) {

        }
    public MySQLDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, SQLDialect dialect)
            true,
     * Return true if WHERE condition can be added for SHOW DATABASES statement
    @NotNull
    }
        final boolean retrievePublicKey = sslConfig.getBooleanProperty(MySQLConstants.PROP_SSL_PUBLIC_KEY_RETRIEVE);
                return "TIMESTAMP";
            // Hacking different MySQL drivers zeroDateTimeBehavior property (#4103)

            }
            } else if (
                    true,
    }
                }
    }
    public MySQLEngine getEngine(String name) {
import org.jkiss.dbeaver.model.sql.SQLState;
        }
    @Override
        this.users = null;
            } catch (SQLException e) {
            setCaseSensitive(!getDataSource().getSQLDialect().useCaseInsensitiveNameLookup());
                return "VARCHAR";
    }
                    }
                if (isMariaDB()) {
                        SQLUtils.quoteString(this, oldPassword)
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-mysql-fetch-transform"), true);
            }

            );
        throws DBException {
            throw new DBDatabaseException(ex, this);
                    inServerTimezoneHandle = false;
 * distributed under the License is distributed on an "AS IS" BASIS,
        final DBACertificateStorage securityManager = DBWorkbench.getPlatform().getCertificateStorage();
        return MySQLConstants.DRIVER_CLASS_MARIA_DB.equals(
                    stmt.execute("SET PASSWORD = %s REPLACE %s".formatted(
        } else if (adapter == SpatialDataProvider.class) {
        return dataTypeCache;
        if (catalog == null) {
            throw new DBDatabaseException(ex, this);
            }
        if (!CommonUtils.isEmpty(message)) {
    }
                            "\tAND t.TABLE_NAME = 'CHECK_CONSTRAINTS'");
            "allowUrlInLocalInfile", "false"
    @Association
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-events"), true);
        }

                    true,
 * Licensed under the Apache License, Version 2.0 (the "License");
                helpProvider = new MySQLHelpProvider(this);
        }
    public List<MySQLPrivilege> getPrivileges(DBRProgressMonitor monitor)
    private List<MySQLPrivilege> loadPrivileges(DBRProgressMonitor monitor)
        return getCharset(defaultCharset);

        }
    }
            DBSObjectFilter catalogFilters = owner.getContainer().getObjectFilter(MySQLCatalog.class, null, false);
        return catalogCache.getCachedObject(name);
                    log.debug("Error reading information schema", e);
    }
    public boolean readKeysWithColumns() {

        int code = SQLState.getCodeFromException(e);
    public void initialize(@NotNull DBRProgressMonitor monitor)
                JDBCUtils.appendFilterClause(
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

            default:
            addGISDatatype(MySQLConstants.TYPE_POINT);

    }
            case ROWID:
    public boolean supportsUserManagement() {
            }
            }
    @Nullable

        if (retrievePublicKey) {
        }
    @Override

        return super.getDataSourceFeature(featureId);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load basic datasource metadata")) {
            // Read catalogs
                    catalogQuery,
 */
                    catalogFilters,
        {
        hasStatistics = !container.getPreferenceStore().getBoolean(ModelPreferences.READ_EXPENSIVE_STATISTICS);
            ((MySQLExecutionContext)context).refreshDefaults(monitor, true);
        return hasStatistics;
        this(monitor, container, new MySQLDialect());

                log.warn("The driver settings contain a prohibited property, this property will be forcibly removed: "
                collations = new LinkedHashMap<>();
        this.users = null;
        for (MySQLPlugin plugin : plugins) {
     *
                DBAuthUtils.promptAndChangePasswordForCurrentUser(monitor, container, this::changeUserPassword)
                return charset;

                privs.add(priv);
            }
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-charsets"), true);
                        }
        return loadParameters(monitor, false, true);

                return null;

                securityManager.addCertificate(getContainer(), SSLConstants.SSL_CERT_TYPE, caCertData, clientCertData, keyData);
        }
            // Read engines
                props.put("trustCertificateKeyStoreUrl", ksPath);
    @Override
            if (catalogFilters != null) {
    }
            addGISDatatype(MySQLConstants.TYPE_LINESTRING);
                    return false;
            users = loadUsers(monitor);
        }
                    0));
                }
    private List<MySQLCharset> charsets;

                    }
    public boolean supportsFetchTransform() {
    @Nullable
     * Returns true if the charsets information is supported. Ex. for table creation.
    private int lowerCaseTableNames = 1;
import org.jkiss.dbeaver.model.exec.DBCException;
                    Driver driverInstance = driver.getDriverLoader(getContainer()).getDriverInstance(monitor);
     * Checks if column statistics is supported.
 * Unless required by applicable law or agreed to in writing, software
    }
                }
                return new ErrorPosition[]{pos};
                log.debug("Error connecting without serverTimezone. Trying to set serverTimezone=UTC. Original error: " + e.getMessage());

    @Override
import org.jkiss.dbeaver.model.*;
            return new QueryTransformerFetchAll(this);

        List<MySQLPrivilege> privs = new ArrayList<>();
        return null;
            if (engine.getSupport() == MySQLEngine.Support.DEFAULT) {
                        if (CommonUtils.isEmpty(context)) {
            false,
    }
            if (isMariaDB()) {
            }
            serverTZ = "UTC";
        throws DBException {
                    log.debug("Error reading default server charset/collation", ex);
    ) throws DBCException {
                    }
            String databaseName = getDatabaseName(configuration);
import org.jkiss.dbeaver.model.sql.SQLHelpProvider;
        return version;
            CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-partitions"), true) &&
                }
        PROHIBITED_DRIVER_PROPERTIES.put("allowLoadLocalInfileInPath", null);
        }
    public MySQLEngine getDefaultEngine() {
import org.jkiss.dbeaver.model.struct.DBSObject;

    }
    private String defaultCharset, defaultCollation;
        } else {


                            defaultCollation = JDBCUtils.safeGetString(dbResult, 2);
    private List<MySQLParameter> loadParameters(DBRProgressMonitor monitor, boolean status, boolean global) throws DBException {

                    + prohibitedDriverProperty);
                }
        throws DBException {
        }
        }
    }
                                continue;
            //activeCatalogName = MySQLUtils.determineCurrentDatabase(session);
    public boolean supportsAlterView() {

            return code == MySQLConstants.ER_MUST_CHANGE_PASSWORD_LOGIN;
    }
            }
        return privs;

    public void resetUsers() {
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-alter-view"), false);
            return createCatalogInstance(owner, resultSet);
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT @@GLOBAL.character_set_server,@@GLOBAL.collation_server")) {
        PROHIBITED_DRIVER_PROPERTIES.putAll(Map.of(
                } else {
                    mysqlConnection = super.openConnection(monitor, context, purpose);
            case DATETIME:
                // just ignore

        }
            if (charset.getName().equals(name)) {

            privileges = loadPrivileges(monitor);
                        }
    }
        throws DBException {

            byte[] keyData = SSLHandlerTrustStoreImpl.readCertificate(sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY, MySQLConstants.PROP_SSL_CLIENT_KEY);
            try (Statement stmt = connection.createStatement()) {
    @Override
            return null;
                try {

                    while (dbResult.next()) {
                    ));
                return "TINYINT(1)";
                }
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
                );
    /**
            if (caCertData != null || clientCertData != null) {
            }
        throws DBException {
            try {
public class MySQLDataSource extends JDBCDataSource implements DBPObjectStatisticsCollector {
     */
    }
                }
            hasStatistics = true;
    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {
                    return userList;
                if (isServerVersionAtLeast(5, 0)) {
            return;
    public Collection<MySQLCharset> getCharsets() {
                "SELECT table_schema, SUM(data_length + index_length) \n" +
                charsets.sort(DBUtils.<MySQLCharset>nameComparator());
import java.sql.*;
    }
        }

                            charsets.add(charset);
            addGISDatatype(MySQLConstants.TYPE_GEOMETRYCOLLECTION);
                    catalogQuery.setLength(0);

                        }
    public boolean supportsTriggers() {

                        log.debug("Error reading plugins information", e);
            return adapter.cast(new SpatialDataProvider() {
                inServerTimezoneHandle = true;
                }
        } else {
    }
    private Version getVersion() {
    }
            return adapter.cast(helpProvider);
        return collations.get(name);
    }
    private void initSSL(DBRProgressMonitor monitor, Map<String, String> props, DBWHandlerConfiguration sslConfig) throws Exception {
    @Override
                initSSL(monitor, props, sslConfig);
/*
        @Nullable
                throw e;
            throw new DBDatabaseException("Unable to change expired password", e);
                } else if (getVersion() != null) {
        if (users == null) {
 * limitations under the License.
                    configuration,
                    }
                if (isMariaDB()) {
    private volatile boolean hasStatistics;
     */
    }
            // Not supported by MySQL server

                mysqlConnection.setClientInfo(JDBCConstants.APPLICATION_NAME_CLIENT_PROPERTY, DBUtils.getClientApplicationName(getContainer(), context, purpose));
    public List<MySQLParameter> getGlobalVariables(DBRProgressMonitor monitor)
        if (isMariaDB()) {
                        MySQLParameter parameter = new MySQLParameter(
     */
import org.jkiss.dbeaver.model.sql.SQLDialect;
/**
            {

import org.jkiss.dbeaver.ext.mysql.MySQLDataSourceProvider;
            // Even if you through the SQL Editor create a JSON column, it will turn into longtext
        Connection mysqlConnection;
    public boolean supportsCollations() {
    @Override
     * <p>The table was not supported up until MySQL 5.0
    public MySQLCharset getCharset(String name) {
            StringBuilder catalogQuery = new StringBuilder("show databases");
    }

                        }
                log.trace("Set " + prohibitedDriverProperty + ":" + propertyValue);
                        MySQLCatalog catalog = catalogCache.getObject(monitor, this, dbName);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        }
import org.jkiss.code.Nullable;
            // MariaDB-specific. They have bad SQLState support
        }
                return "BINARY";
    public MySQLCatalog createCatalogInstance(@NotNull MySQLDataSource owner, @NotNull JDBCResultSet resultSet) {
    }
     */
import java.util.regex.Matcher;
     * Returns true if different rename table syntax is used
            final String ksPath = makeKeyStorePath(securityManager.getKeyStorePath(getContainer(), SSLConstants.SSL_CERT_TYPE));
            } else {

        protected void detectCaseSensitivity(DBSObject object) {

import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
                    return GisConstants.SRID_4326;
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CHARSET")) {
            // For MariaDB JSON is an alias for LONGTEXT introduced for compatibility reasons with MySQL's JSON data type.
     */

    public MySQLPrivilege getPrivilege(DBRProgressMonitor monitor, String name)
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    }
                            props.put(MySQLConstants.PROP_ZERO_DATETIME_BEHAVIOR, "CONVERT_TO_NULL");
            return adapter.cast(new MySQLStructureAssistant(this));
            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
                        String context = JDBCUtils.safeGetString(dbResult, "context");

    /**
            {
        } else {
        dataTypeCache.getAllObjects(monitor, this);
    @Nullable
                    readeAllCaches = isServerVersionAtLeast(10, 4);
        for (MySQLEngine engine : engines) {
            JDBCPreparedStatement dbStat = session.prepareStatement(catalogQuery.toString());
                    this,
                } else {
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW COLLATION")) {
            || (!isMariaDB() && isServerVersionAtLeast(5, 7))
            String propertyValue = PROHIBITED_DRIVER_PROPERTIES.get(prohibitedDriverProperty);
    @Override
    protected void fillConnectionProperties(DBPConnectionConfiguration connectionInfo, Properties connectProps) {
            ) {
    public List<MySQLUser> getUsers(DBRProgressMonitor monitor)
     * Returns true if local clients using is supported.
            }
                } catch (SQLException ex) {


    }

                    if (driverInstance != null) {
        }
                        String dbName = dbResult.getString(1);
    public boolean supportsPlugins() {
            0,
                props.put("clientCertificateKeyStoreUrl", ksPath);
                }
                return openConnection(monitor, context, purpose);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
                try {
            MySQLConstants.INDEX_TYPE_HASH,
     * @return {@code true} if column statistics is supported
                            MySQLCharset charset = getCharset(charsetName);
        return loadParameters(monitor, false, false);
        } finally {
            } catch (Throwable e) {

    public Collection<? extends DBSDataType> getLocalDataTypes() {
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        if (this.isMariaDB()) {
        @NotNull JDBCExecutionContext context,
                MySQLConstants.PROP_SHOW_ALL_DBS_DEFAULT
        @NotNull String oldPassword
     * Checks if information_schema table is supported.
                    while (dbResult.next()) {
            }

                    log.debug("Error setting MySQL " + MySQLConstants.PROP_ZERO_DATETIME_BEHAVIOR + " property default");
        throws DBException {
                }
    public boolean isSystemCatalog(String name) {
}
        if (CommonUtils.isEmpty(catalogName)) {
        if (!CommonUtils.isEmpty(cipherSuites)) {

        return getCollation(defaultCollation);
    private void addGISDatatype(String typeGeometry) {
            } catch (Exception e) {
            if (readeAllCaches) {
     */
    }
        return mysqlConnection;
    }
                    (status ? "STATUS" : "VARIABLES"))) {
                    catalogQuery.append("SELECT SCHEMA_NAME FROM ").append(MySQLConstants.META_TABLE_SCHEMATA);
            return;
            return adapter.cast(new MySQLPlanAnalyser(this));
            return new QueryTransformerLimit();
        monitor.subTask("Install SSL certificates");
package org.jkiss.dbeaver.ext.mysql.model;
        throws DBException {
        for (MySQLCharset charset : charsets) {
     */
        protected MySQLCatalog fetchObject(@NotNull JDBCSession session, @NotNull MySQLDataSource owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                props.put("trustStore", ksPath);

                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
        this.engines = null;
    @Override
    public Collection<MySQLCatalog> getCatalogs() {
     */
    @Override
import java.util.*;
    }
    }
                    MySQLConstants.TYPE_JSON,
import org.jkiss.dbeaver.model.exec.jdbc.*;
                    false,
                            engines.add(engine);
     */
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
                }
            props.put("serverTimezone", serverTZ);
        return catalogCache.getCachedObjects();
        String message = error.getMessage();
            MySQLConstants.INDEX_TYPE_RTREE);
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context, @NotNull String purpose) throws DBCException {
            case BOOLEAN:
    }
import org.jkiss.dbeaver.model.meta.Association;
    private Map<String, MySQLCollation> collations;
    public List<MySQLPrivilege> getPrivilegesByKind(DBRProgressMonitor monitor, MySQLPrivilege.Kind kind)
                            defaultCharset = JDBCUtils.safeGetString(dbResult, 1);
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW VARIABLES LIKE 'lower_case_table_names'")) {
    }
            if (supportsInformationSchema()) {

                        }

            if (zeroDateTimeBehavior == null) {



            typeGeometry.toUpperCase(Locale.ROOT),

            if (helpProvider == null) {
    public <T> T getAdapter(@NotNull Class<T> adapter) {
                    0,
            if (!showAllDatabases && CommonUtils.isNotEmpty(databaseName)) {
            if (propertyValue == null) {
import org.jkiss.dbeaver.model.impl.net.SSLConstants;
                    this,
    @Association
                        if (driverInstance.getMajorVersion() >= 8) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            return SQLState.SQL_42000.getCode().equals(sqlState);
            Matcher matcher = VERSION_PATTERN.matcher(versionInfo);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load status")) {
            if (connectProps.containsKey(prohibitedDriverProperty)) {
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter(MySQLConstants.DRIVER_PARAM_CLIENTS), true);

    @Override
            dataTypeCache.cacheObject(
    /**
                boolean supportsCondition = owner.supportsConditionForShowDatabasesStatement();
        }
                            JDBCUtils.safeGetString(dbResult, "value"));
    }
            // Read plugins
     *
                new JDBCDataType<>(
    }
                    stmt.execute("SET PASSWORD FOR %s = PASSWORD(%s)".formatted(
                        MySQLUser user = new MySQLUser(this, dbResult);
    private List<MySQLPlugin> plugins;
    }
                            while (dbResult.next()) {
                    containsCheckConstraintTable = (resultSet != null);
            } else {
        }
        if (!CommonUtils.isEmpty(serverTZ)) {
        return DBUtils.findObject(getPrivileges(monitor), name, true);
                        if (dbResult.next()) {
    }
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;


    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
        }

                    Types.CHAR,
                MySQLConstants.PROP_CACHE_META_DATA),
    }
                } catch (Throwable ex) {
                securityManager.deleteCertificate(getContainer(), SSLConstants.SSL_CERT_TYPE);
            typeGeometry.toUpperCase(Locale.ROOT),
    private Version version;
                    owner
                return "BINARY";

import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
        private String getDatabaseName(@NotNull DBPConnectionConfiguration configuration) {
    }
        return readeAllCaches;
        }
                        SQLUtils.quoteString(this, newPassword),
        }
                catalogFilters.addInclude(databaseName);
     */
        }
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
                    }
    private List<MySQLPrivilege> privileges;
    }
        @NotNull String userName,
                } catch (SQLException e) {
    }
            props.put("allowPublicKeyRetrieval", "true");
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @NotNull
            try {
                @Override
    public DBSDataType getLocalDataType(String typeName) {
            }
    public DBSDataType getLocalDataType(int typeID) {
                }
                log.error(e);
        dataTypeCache.cacheObject(new JDBCDataType<>(this,
                log.debug(e);
                if (!supportsCondition) {
            }
            case DBPDataSource.FEATURE_LIMIT_AFFECTS_DML:
                        SQLUtils.quoteString(this, userName),

            }
            addGISDatatype(MySQLConstants.TYPE_MULTIPOLYGON);
            boolean showAllDatabases = CommonUtils.getBoolean(
    public boolean isStatisticsCollected() {
        return null;
        }
                        }
        return super.discoverErrorType(error);
                            continue;
    }
            }
                CommonUtils.isEmpty(getContainer().getActualConnectionConfiguration().getProviderProperty(MySQLConstants.PROP_SERVER_TIMEZONE)))
        if (isMariaDB()) {
                props.put("clientCertificateKeyStorePassword", String.valueOf(ksPass));

            case CONTENT:

    private List<MySQLEngine> engines;
        try (Connection connection = super.openConnection(monitor, null, "Change expired password")) {
            } else {
    /**

     * @return {@code true} if table partitioning is supported

import org.jkiss.dbeaver.Log;

    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context, JDBCExecutionContext initFrom) throws DBException {
    public boolean supportsColumnStatistics() {
            if (priv.getKind() == kind) {
        throws DBException {
                log.debug("Error reading default server charset/collation", ex);
    @Association
                                continue;
            MySQLCatalog object = ((MySQLExecutionContext)initFrom).getDefaultCatalog();
                version = new Version(matcher.group(1));
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        }
            throws DBException {
    public MySQLCollation getDefaultCollation() {
        } else if (type == DBCQueryTransformType.FETCH_ALL_TABLE) {
    }
    }
        @NotNull DBRProgressMonitor monitor,
                    (global ? "GLOBAL " : "") +
        @NotNull DBPConnectionConfiguration connectionInfo
import org.jkiss.utils.CommonUtils;

    }
    }
                    true,
            hasStatistics = true;
            });
        }
            }
    }
    }
                    0,
     * Returns true if table/catalog triggers are supported.
    }

    @Override

    public class CatalogCache extends JDBCObjectCache<MySQLDataSource, MySQLCatalog> {
    }
            String versionInfo = getInfo().getDatabaseProductVersion(); // getInfo().getDatabaseVersion() can return incorrect value

        return getCatalog(childName);
                );
        {
                    "GROUP BY table_schema"))

    private static final Log log = Log.getLog(MySQLDataSource.class);
        return Collections.singletonList(this);
import java.net.MalformedURLException;
        return false;
            && dataTypeCache.getCachedObject(MySQLConstants.TYPE_JSON) == null)
            }
        dataTypeCache = new JDBCBasicDataTypeCache<>(this);
        }
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } else {
        Map<String, String> props = new LinkedHashMap<>(MySQLDataSourceProvider.getConnectionsProps());
                configuration.getProviderProperty(MySQLConstants.PROP_SHOW_ALL_DBS),
        super.fillConnectionProperties(connectionInfo, connectProps);
    private boolean isPasswordExpired(@NotNull DBCException e) {
    private final JDBCBasicDataTypeCache<MySQLDataSource, JDBCDataType> dataTypeCache;
        switch (featureId) {
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
            }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLDataSource owner) throws SQLException {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load users")) {
    }
            throw new DBDatabaseException(ex, this);
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
    }
        if ((isMariaDB() && isServerVersionAtLeast(5, 4))
                        MySQLPrivilege user = new MySQLPrivilege(this, context, dbResult);
            catalogCache.getAllObjects(monitor, this);
    @NotNull
        if (sslConfig != null && sslConfig.isEnabled()) {
     */
    }
            props.put("requireSSL", String.valueOf(sslConfig.getBooleanProperty(MySQLConstants.PROP_REQUIRE_SSL)));
    public boolean supportsEvents() {
    }
    }
                            this,
        if (initFrom != null && !context.getDataSource().getContainer().isConnectionReadOnly()) {
        for (MySQLPrivilege priv : getPrivileges(monitor)) {
            return code == MySQLConstants.MARIA_ER_MUST_CHANGE_PASSWORD_LOGIN;
            mysqlConnection = super.openConnection(monitor, context, purpose);
                try (Statement stmt = mysqlConnection.createStatement()) {
    public boolean supportsSequences() {
        for (String prohibitedDriverProperty : PROHIBITED_DRIVER_PROPERTIES.keySet()) {
                            if (charset == null) {
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;

        return true;
            MySQLConstants.MYSQL_SCHEMA_NAME.equalsIgnoreCase(name);
     *
                JDBCUtils.setFilterParameters(dbStat, 1, catalogFilters);
                    return privileges;
            "autoDeserialize", "false",
                connectProps.remove(prohibitedDriverProperty);

            dataTypeCache.cacheObject(
     */
        @Override
    }
        return !isMariaDB() && isServerVersionAtLeast(8, 0);
        }
    public CatalogCache getCatalogCache() {
        container.getActualConnectionConfiguration().setProperty("disconnectOnExpiredPasswords", "false");
    private List<MySQLUser> loadUsers(DBRProgressMonitor monitor)

        }
                new JDBCDataType<>(
                            "WHERE\n" +
        throws DBException {
            }
            MySQLConstants.INDEX_TYPE_FULLTEXT,
    }
import org.jkiss.dbeaver.model.net.DBWUtils;
        @Override
    ) throws DBException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

                            log.debug("Skip privilege with an empty context.");
    @Override
                    0,
            {

        if (privileges == null) {
        this.initialize(monitor);

    @Override
        }
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
                            String charsetName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_CHARSET);
                    // Engines are not supported. Shame on it. Leave this list empty
    private List<MySQLUser> users;
    /**
            {
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
    }
            props.put("useSSL", "false");
                    List<MySQLPrivilege> privileges = new ArrayList<>();
    }
            addGISDatatype(MySQLConstants.TYPE_MULTIPOINT);
            try {
        }
                    while (dbResult.next()) {
    public boolean isMariaDB() {
            String sqlState = SQLState.getStateFromException(error);
        if (isMariaDB()) {
        ));
        return getCatalogs();
     * Checks plugins list reading is supported.
        }
                connectProps.put(prohibitedDriverProperty, propertyValue);
        }
import org.jkiss.dbeaver.model.gis.SpatialDataProvider;
        return new MySQLExecutionContext(instance, type);
                    }
        super(monitor, container, dialect);
                return plugin;
    }
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;

     *
 * You may obtain a copy of the License at
        return CommonUtils.getBoolean(getContainer().getDriver().getDriverParameter("supports-plugins"), true);
                        } else {
        }

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load privileges")) {
                // Check check constraints in base
            } catch (Throwable ex) {
                    while (dbResult.next()) {
    }
                return "LONGBLOB";
import org.jkiss.dbeaver.model.app.DBACertificateStorage;
                }
            if (matcher.find()) {
        return dataTypeCache.getCachedObject(typeName);
    public List<MySQLDataSource> getInformation() {

    /**
            }
                }
                props.put("trustCertificateKeyStorePassword", String.valueOf(ksPass));
        }


            String zeroDateTimeBehavior = connectionInfo.getProperty(MySQLConstants.PROP_ZERO_DATETIME_BEHAVIOR);
    private static final Map<String, String> PROHIBITED_DRIVER_PROPERTIES = new HashMap<>();
            if (catalogFilters != null) {
        } else if (adapter == SQLHelpProvider.class) {
import org.jkiss.dbeaver.model.gis.GisConstants;
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    }
                charsets = new ArrayList<>();
        return loadParameters(monitor, true, true);
        final DBWHandlerConfiguration sslConfig = getContainer().getActualConnectionConfiguration().getHandler(MySQLConstants.HANDLER_SSL);
            0));
