    {
                    driverLoader.loadDriver(monitor);
            } catch (Throwable e) {
    protected JDBCDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container, @NotNull SQLDialect dialect)
            }
            case Types.BOOLEAN:
                    log.warn("Couldn't find driver '" + driverSubstitution.getDriverId()
            case Types.ARRAY:
                    log.error("Error initializing dialect driver settings", e);
                return Types.NCLOB;
            }
        }
        }
            case Types.REF:

        if (connection != null) {
     * Note: these properties may be overwritten by connection advanced properties.
                    + "').",
            case Types.SMALLINT:
        this(monitor, container, dialect, true);
                        log.debug(e);

            if (driverInstance instanceof ObjectWithVerification
    protected String saveTrustStoreToFile(byte[] trustStoreData) throws IOException {
                return ErrorType.UNIQUE_KEY_VIOLATION;
            } catch (DBException e) {
                && DBWorkbench.getPlatform().getApplication().isMultiuser()
        if (databaseVersion == null) {
            case Types.DOUBLE:
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
            case STRUCT -> "VARCHAR";
                    authModel.refreshCredentials(monitor, container, connectionInfo, credentials);
            if (!CommonUtils.isEmpty(driverClassName)) {
        };
        defaultRemoteInstance = null;
            case Types.LONGVARBINARY:
                            connectTask.getError());
        } catch (SQLException ex) {
    public DBPDataSourceInfo getInfo()
    public static DBPDataKind getDataKind(@NotNull String typeName, int valueType)
    protected Connection openConnection(
        @NotNull DBPConnectionConfiguration connectionInfo,



import org.jkiss.utils.CommonUtils;

            return container.getDriver().getDriverLoader(getContainer()).getDriverInstance(monitor);
    @Override
                log.warn("NULL datasource info was created");
                    }, "Close JDBC connection " + getContainer().getName() + " (" + purpose + ")",
                    metaData.getDatabaseMajorVersion(),

     * @return predefined connection properties
            }

            }
            if (SQLConstants.DATA_TYPE_TINYINT.equalsIgnoreCase(typeName)) {
        return url;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
            }
                                }
    }
                final String database = connectionInfo.getDatabaseName();
    }
        DBSInstanceContainer,
        @NotNull String query,
 *
                    throw new DBCConnectException("Driver class '" + driverClassName + "' not found", e, this);

        Driver driverInstance = null;
    protected final JDBCFactory jdbcFactory;
                return;
                throw new DBCConnectException("Can't create driver instance"
            JDBCConnectionOpener connectTask = new JDBCConnectionOpener(
            url = getContainer().getDriver().getConnectionURL(connectionInfo);
        }
            } catch (DBException e) {
        {
//
                            connectionInfo,
                } catch (Exception e) {
    public JDBCFactory getJdbcFactory() {
        }
        @NotNull Throwable error
    @NotNull
    }
import org.jkiss.dbeaver.model.exec.*;
                }
        Properties connectProps = new Properties();
            } catch (DBException e) {
    {
        return defaultRemoteInstance;
        final DBPDriverSubstitutionDescriptor driverSubstitution = container.getDriverSubstitution();
 * limitations under the License.

        final JDBCConnectionConfigurer connectionConfigurer = GeneralUtils.adapt(this, JDBCConnectionConfigurer.class);

            } else if (majorVersion == major && driver.getMinorVersion() < minor) {
 */

import org.jkiss.api.ObjectWithContextParameters;
    {
    ) throws DBCException {
        DBSObjectContainer,
                this,
                    }

        @NotNull DBRProgressMonitor monitor,
//        if (type == DBCQueryTransformType.ORDER_BY) {
            try {
                return DBPDataKind.ARRAY;
                SQLState.SQL_28P01.getCode().equals(sqlState)) {
            }
            case Types.STRUCT:

                    } else {
            if (connectionConfigurer != null) {
                driverInstance = getDriverInstance(monitor);
                    closingConnections.remove(connection);
    protected synchronized void readDatabaseServerVersion(Connection session, DatabaseMetaData metaData) {
            // Init authentication first (it may affect driver properties or driver configuration or even driver libraries)
            throw new DBCConnectException(ex.getMessage(), ex, this);
            owcp.setObjectContextParameter(DBConstants.CONTEXT_PARAMETER_PROJECT, getContainer().getProject());
            }
import org.jkiss.dbeaver.utils.RuntimeUtils;
            case Types.DATE:
        defaultInstance.initializeMetaContext(monitor);
            case CONTENT -> "BLOB";


     * @return true on successful connection close
                if (closingConnections.contains(connection)) {
    /////////////////////////////////////////////////
        }
    @Nullable
    public boolean cancelCurrentExecution(@NotNull Connection connection, @Nullable Thread connectionThread) throws DBException {
{

            return driverSubstitution.getInstance().getSubstitutingDriverInstance(monitor);
        try {
        return certPath.toAbsolutePath().toString();
                        url = substitutedUrl;
            case Types.FLOAT:
            case STRING -> "VARCHAR";
                databaseVersion = new Version(0, 0, 0);
            }
                    log.debug("Configuration info was changed after auth initialization. Connection URL was updated to: " + url);
                DBAAuthCredentials credentials = authModel.loadCredentials(container, connectionInfo);
    @Nullable
    {
    protected JDBCDataSource(@NotNull DBPDataSourceContainer container, @NotNull SQLDialect dialect) {
    public ErrorPosition[] getErrorPosition(
    }
    public <T> T getAdapter(@NotNull Class<T> adapter) {
                return Types.BLOB;
            try {
                            try {
    @NotNull
            case Types.CHAR:
    private final transient List<Connection> closingConnections = new ArrayList<>();

    ) {
                    // Refresh credentials
            return false;
    @Override
        {
    }
            return true;
            case Types.ROWID:
    @NotNull
            if ("BLOB".equalsIgnoreCase(typeName)) {

                log.warn("Couldn't find data source provider '" + driverSubstitution.getProviderId()
    {
    }
        if (driverSubstitution != null) {
                connectProps.setProperty(prop.getKey(), CommonUtils.toString(prop.getValue()));
import java.nio.file.Path;
            try {
 * See the License for the specific language governing permissions and
            );

            ) {
    @Override
                    metaData.getDatabaseMinorVersion(),
        JDBCRemoteInstance defaultInstance = getDefaultInstance();
    public ErrorType discoverErrorType(@NotNull Throwable error)
                }

        DBPAuthModelDescriptor authModelDescriptor = driver.getDataSourceProvider().detectConnectionAuthModel(driver, connectionInfo);
                        } catch (Throwable ex) {
        for (JDBCRemoteInstance instance : getAvailableInstances()) {

    }
        // Obtain connection
            try {
        Files.writeString(certPath, rootCertProp);
            if (connectTask.getError() != null) {

        throws DBException
            }
        catch (SQLException ex) {
        catch (Throwable e) {

            }
                    throw new DBCException("Invalid JDBC URL: " + url);
            case BINARY -> "BLOB";
                        if (IOUtils.isFileFromDefaultFS(path)) {
        for (DBSDataType dataType : getLocalDataTypes()) {

    }
    }
                    + "' for driver substitution '" + driverSubstitution.getId() + "', using original driver");
        Properties connectProps = getAllConnectionProperties(monitor, context, purpose, connectionInfo);
                    openTaskFinished = true;
            }
        for (Map.Entry<String, String> prop : connectionInfo.getProperties().entrySet()) {


import org.jkiss.dbeaver.model.*;
                return DBPDataKind.BINARY;
            case Types.REAL:
        @NotNull DBPDriver driver,
//        }

        return null;
        trackTempFile(trustStorePath);
    protected List<Path> tempFiles;
            log.warn(new DBException("Checking server version before connection initialization"));
            case ANY -> "VARCHAR";
    public DBSDataType getLocalDataType(int typeID) {
            }
                return Types.CLOB;
                    0);

        }
                initializeRemoteInstance(monitor);

                    (FileSystemAccessVerifyer) path -> {
                }

    }
            case ROWID -> "ROWID";
        Path certPath = Files.createTempFile(
    protected volatile DBPDataSourceInfo dataSourceInfo;
    }
        } finally {
    }
                }
 * JDBC data source
    }
    @NotNull
        }
                                connection.rollback();
            case Types.BLOB:
    protected String getStandardSQLDataTypeName(@NotNull DBPDataKind dataKind) {
        }
     */
                            }
    {
            throw new DBCException("Can't obtain default instance");
        return null;
            throw new DBDatabaseException(e, this);
            owcp.setObjectContextParameter(DBConstants.CONTEXT_PARAMETER_DATA_SOURCE, getContainer());

                final String host = connectionInfo.getHostName();
            case Types.TIMESTAMP:

     * Closes JDBC connection.
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;


                if (isInvalidURL) {
import org.jkiss.code.Nullable;
    }
    }
                    if (!driverInstance.acceptsURL(url)) {
public abstract class JDBCDataSource extends AbstractDataSource
                    } catch (Exception e) {

        return dataSourceInfo;
     * Do actual close in separate thread.

        Path trustStorePath = Files.createTempFile(
        @Nullable JDBCExecutionContext context,
        String url = getConnectionURL(connectionInfo);
        if (CommonUtils.isEmpty(url)) {
                            connection.close();
            case Types.NVARCHAR:
                return RuntimeUtils.runTask(monitor -> {
                throw new DBCException("Connection has timed out");
        this.tempFiles.add(file);
                instance.getExclusiveLock().releaseExclusiveLock(exclusiveLock);
            } else if ("NCLOB".equalsIgnoreCase(typeName)) {
    }
            purpose);
        JDBCRemoteInstance defaultInstance = getDefaultInstance();
                // Looks like bad driver configuration
    protected JDBCDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container, @NotNull SQLDialect dialect, boolean initContext)
        @NotNull String purpose
 * Unless required by applicable law or agreed to in writing, software
            }
        @NotNull JDBCExecutionContext context,
    public void shutdown(@NotNull DBRProgressMonitor monitor) {
        @NotNull DBPConnectionConfiguration connectionInfo

        } else {
    {
                    !CommonUtils.equalObjects(database, connectionInfo.getDatabaseName())) {
                return Types.TINYINT;
    }

        @NotNull JDBCExecutionContext context,
            try {
            // Try to find first data type of this kind
    @NotNull
        if (driver.isInstantiable() && !CommonUtils.isEmpty(driverClassName)) {
                return DBPDataKind.DATETIME;
            } catch (Throwable e) {
        return connectProps;
        return ErrorType.NORMAL;
        return openConnection(
            if (JDBCUtils.isFeatureNotSupportedError(this, e)) {
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData)

    @NotNull
    }
                .getDataSourceProvider(driverSubstitution.getProviderId());
                }
            case Types.LONGVARCHAR:
    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind)
import org.jkiss.dbeaver.model.app.DBPProject;
 * Licensed under the Apache License, Version 2.0 (the "License");

                        }
        return null;
            if (driverInstance != null) {
    }
import org.jkiss.dbeaver.model.struct.DBSInstanceContainer;
    {

            case Types.SQLXML:
            getContainer().getDriver().getId() + "-" + getContainer().getId(),
                    getContainer().getPreferenceStore().getInt(ModelPreferences.CONNECTION_CLOSE_TIMEOUT));
    @NotNull
    }
            }
        }
                    SQLState.SQL_08007.getCode().equals(sqlState) ||
    private void initializeDriverContext(Driver driverInstance) {
    }
    }
            if (dataSourceProvider != null) {
                    final DBPDriverSubstitution substitution = driverSubstitution.getInstance();
            if (majorVersion < major) {
            context,
                }
    }
        }
        @NotNull DBCExecutionPurpose purpose,
    public boolean closeConnection(final Connection connection, String purpose, boolean doRollback) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.access.DBAAuthModel;
            }
            case Types.VARCHAR:
import java.nio.file.Files;
        return databaseVersion;
                if (substitutedDriver != null) {
                    SQLState.SQL_08006.getCode().equals(sqlState) ||
    }
                            return path.normalize().startsWith(project.getAbsolutePath());
                return false;
 * You may obtain a copy of the License at
     * Could be overridden by extenders. May contain any additional connection properties.
            for (Map.Entry<String, Object> prop : driverProperties.entrySet()) {
            try {
                        try {
    protected Version databaseVersion = null;
                final String port = connectionInfo.getHostPort();
        return typeName;
                                // If we in transaction - rollback it.
    public List<? extends JDBCRemoteInstance> getAvailableInstances() {
        this.jdbcFactory = createJdbcFactory();
/*
    @Nullable
            return false;
        Files.write(trustStorePath, trustStoreData);
                                    log.debug("Warning during active transaction close: " + e.getMessage());
            monitor,
                    // Declared as numeric but actually it's a boolean
        }
                initializeDriverContext(driverInstance);
        String typeName = getStandardSQLDataTypeName(dataKind);
            case Types.CLOB:
import org.jkiss.dbeaver.model.sql.SQLDialect;
            return false;

                    openTaskFinished = RuntimeUtils.runTask(connectTask, "Opening database connection", openTimeout + 2000);
        if (databaseVersion == null) {
                log.error("Error determining server version", e);
        }
        }
                    });
    Version getDatabaseServerVersion() {
        return sqlDialect;
            }
    // Certs

                return DBPDataKind.STRING;
                    final String substitutedUrl = substitution.getConnectionURL(container, connectionInfo);
                            connectProps,
    /////////////////////////////////////////////////
            final DBPDataSourceProviderDescriptor dataSourceProvider = DBWorkbench.getPlatform().getDataSourceProviderRegistry()

import org.jkiss.api.verification.FileSystemAccessVerifyer;
                shutdown(monitor);

                } else {
            case DATETIME -> "TIMESTAMP";
            case Types.TIME_WITH_TIMEZONE:
                connectionConfigurer.beforeConnection(monitor, connectionInfo, connectProps);
                // TODO: really?
                } else {
    private static final boolean REFRESH_CREDENTIALS_ON_CONNECT = false;
                    if (substitutedProperties != null) {
        } else if (databaseVersion.getMajor() == major && databaseVersion.getMinor() < minor) {
        if (CommonUtils.getRootCause(error) instanceof SocketException) {
            boolean isInvalidURL = false;
import org.jkiss.dbeaver.model.sql.SQLState;
import org.jkiss.dbeaver.ModelPreferences;
            case Types.VARBINARY:
            }
        DBSDataType dataType = getLocalDataType(typeName);
                    + " (class '"
            case Types.TIME:

        return defaultInstance == null ?
            }
        return new JDBCExecutionContext(instance, type);
        return false;
        // HERE!
            case ARRAY -> "VARCHAR";
            case Types.OTHER:
        }
import org.osgi.framework.Version;
        return driverInstance;
    protected String getConnectionURL(DBPConnectionConfiguration connectionInfo) {
            try {


        } else if (valueType == Types.BIT) {
            ".cert");
                } catch (Throwable e) {
import org.jkiss.dbeaver.model.connection.*;
                throw e;
                    connectTask.run(monitor);

        switch (getValueTypeByTypeName(typeName, valueType)) {

        } else if (adapter == DBCQueryTransformProvider.class) {
    public DBSDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull String typeFullName) throws DBException


            Collections.emptyList() :


    @Override
    @NotNull
            } else {
        return new JDBCFactoryDefault();
            case Types.BINARY:
        // [JDBC: SQLite driver uses VARCHAR value type for all LOBs]
                    }
                connectProps.putAll(internalProps);
    protected JDBCFactory createJdbcFactory() {
            throw new DBCConnectException("Unexpected driver error occurred while connecting to the database", e);
            case Types.LONGNVARCHAR:
    @Nullable
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
    protected Connection openConnection(
                        Files.delete(tmpFile);
            if (rootCause instanceof ClassNotFoundException) {
                        }
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCConnectionImpl;
        @NotNull DBRProgressMonitor monitor,
    private String substituteDriverIfNeeded(@NotNull DBRProgressMonitor monitor, @NotNull DBPConnectionConfiguration connectionInfo, Properties connectProps, String url) {
            new DBPConnectionConfiguration(container.getActualConnectionConfiguration()),
    public JDBCRemoteInstance getDefaultInstance() {
                }

        }
            DBWorkbench.getPlatform().getCertificateStorage().getStorageFolder(),
                log.error("Error obtaining database info", e);

            } finally {
                return DBPDataKind.ROWID;
        trackTempFile(certPath);
//        } else if (type == DBCQueryTransformType.FILTER) {
            for (Path tmpFile : tempFiles) {
                return ErrorType.DRIVER_CLASS_MISSING;
            }
            JDBCDatabaseMetaData metaData = session.getMetaData();
    }
    protected Driver getDriverInstance(@NotNull DBRProgressMonitor monitor)
        this.sqlDialect = dialect;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            // Use driver properties
import org.jkiss.dbeaver.DBException;
                if (typeName.toLowerCase().contains("bool")) {
                return DBPDataKind.CONTENT;
            this.tempFiles = new ArrayList<>();
            case OBJECT -> "VARCHAR";
        return valueType;
    }
                } catch (IOException e) {
                            monitor,
        DBSObject,
            Driver driverInstance = createDriverInstance(monitor, driver);
            int openTimeout = container.getPreferenceStore().getInt(ModelPreferences.CONNECTION_OPEN_TIMEOUT);
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context, JDBCExecutionContext initFrom) throws DBException {
    {
            }
        }
    protected boolean isConnectionReadOnlyBroken() {
    @Override
import java.io.IOException;
            connectionThread.interrupt();
    ) throws DBCException {
        }
        }
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType)

        final DBPDriverSubstitutionDescriptor driverSubstitution = container.getDriverSubstitution();
        return trustStorePath.toAbsolutePath().toString();
                            log.debug("Error closing connection", ex);
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type)

    }
    }
                dataSourceInfo = new JDBCDataSourceInfo(container);
                    if (Files.isDirectory(tmpFile)) {
    @NotNull
                if (openTimeout <= 0) {
        super(container);
            getContainer().getDriver().getId() + "-" + getContainer().getId(),
            log.debug("Can't obtain driver instance", e);
        return getDataKind(typeName, valueType);
        return url;
    private Driver createDriverInstance(@NotNull DBRProgressMonitor monitor, DBPDriver driver) throws DBCException {
            readDatabaseServerVersion(session, metaData);
        if (initContext) {
    /////////////////////////////////////////////////
    }
        DBPDriver driver = container.getDriver();
                monitor.subTask("Disconnect from '" + instance.getName() + "'");
        DBPDataTypeProvider,
        DBPErrorAssistant,

            case BOOLEAN -> "BOOLEAN";
//
        }


    @Override
        this(container, dialect);
    @Nullable
                    }
            // Workaround for MySQL (and maybe others) when TINYINT(1) == BOOLEAN
    @NotNull
            int majorVersion = driver.getMajorVersion();

                return false;
        this.defaultRemoteInstance = new JDBCRemoteInstance(monitor, this, true);
                    return DBPDataKind.BOOLEAN;
                owcp.setObjectContextParameter(ObjectWithVerification.CONTEXT_PARAMETER_FILE_SYSTEM_VERIFIER,
        DBCQueryTransformProvider
                return DBPDataKind.STRUCT;
        } catch (SQLException e) {
    }
            }
        @NotNull String purpose
    }
    @NotNull
    @Override
                if (!CommonUtils.equalObjects(host, connectionInfo.getHostName()) ||
    protected void initializeRemoteInstance(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
                        IOUtils.deleteDirectory(tmpFile);
            case Types.DECIMAL:
        @NotNull DBCExecutionContext context,
    }
        String driverClassName = driver.getDriverClassName();
            DBWorkbench.getPlatform().getCertificateStorage().getStorageFolder(),
        if (databaseVersion.getMajor() < major) {

    }
            }
    }
            if (SQLState.SQL_08000.getCode().equals(sqlState) ||
            } finally {
        @NotNull DBRProgressMonitor monitor,
                            } catch (Throwable e) {
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
            case Types.BIT:
                        connectionConfigurer.afterConnection(
                        + "' for driver substitution '" + driverSubstitution.getId() + "', using original driver");
            if (dataSourceInfo == null) {
                    log.debug("Error deleting temp file for '" + getContainer().getName() + "'", e);
            }
                try {
    }

                    + driverClassName
                    !CommonUtils.equalObjects(port, connectionInfo.getHostPort()) ||

        if (adapter == DBCTransactionManager.class) {
        // It MUST be a JDBC driver
    @NotNull
                } catch (Throwable e) {
            log.debug("Null connection parameter");
                return DBPDataKind.NUMERIC;
        if (error instanceof DBCConnectException) {
}
                    SQLState.SQL_08S01.getCode().equals(sqlState)) {
            boolean openTaskFinished;
    }
            try {
            default -> "VARCHAR";
            connectProps.setProperty(CommonUtils.toString(prop.getKey()), CommonUtils.toString(prop.getValue()));
        return DBPDataKind.UNKNOWN;
import java.sql.*;
    @Override
    {
        this.dataSourceInfo = new JDBCDataSourceInfo(container);
                return DBPDataKind.OBJECT;
    public boolean isServerVersionAtLeast(int major, int minor) {
            case Types.INTEGER:
    private static final Log log = Log.getLog(JDBCDataSource.class);
    @Override
            synchronized (closingConnections) {
                            connectTask.getConnection(),
import org.jkiss.dbeaver.model.exec.jdbc.JDBCFactory;
import org.jkiss.api.verification.ObjectWithVerification;
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;

                monitor.worked(1);
    }

        DBAAuthModel<DBAAuthCredentials> authModel = authModelDescriptor.getInstance();

                connectTask.getConnection().setReadOnly(true);
    }
 *
        }

        catch (DBCException ex) {
            return adapter.cast(DBUtils.getDefaultContext(getDefaultInstance(), false));
    implements
            }
package org.jkiss.dbeaver.model.impl.jdbc;
                                    // ignore

                        //allow all files from external storage
                    jdbcDialect.initDriverSettings(session, this, metaData);
                    return true;
                return DBPDataKind.BOOLEAN;

        if (connectionThread != null) {
                try {
            if (SQLState.SQL_28000.getCode().equals(sqlState) ||
            case REFERENCE -> "VARCHAR";
    @Nullable
                url,
    @Override

                return DBPDataKind.CONTENT;
    @NotNull
        fillConnectionProperties(connectionInfo, connectProps);

                                // so here we do it just in case to avoid error messages on close with open transaction
                    try {
    /**
                }
            } else if ("CLOB".equalsIgnoreCase(typeName)) {
    protected String saveCertificateToFile(String rootCertProp) throws IOException {
        } else {
            statement.cancel();
        throws DBException
    @Nullable
                                // Any valuable transaction changes should be committed by UI
        return getLocalDataType(typeFullName);
    protected Properties getAllConnectionProperties(@NotNull DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose, DBPConnectionConfiguration connectionInfo) throws DBCException {
 */
            case Types.BIGINT:
            // Use properties defined by datasource itself
    // Canceling
    }
            throw new DBDatabaseException("Error getting JDBC meta data", ex, this);
        }
    }
            case Types.TIMESTAMP_WITH_TIMEZONE:
                    e, this);
                    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
            }

                closingConnections.add(connection);

            case Types.NUMERIC:
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
     * After ModelPreferences.CONNECTION_CLOSE_TIMEOUT delay returns false.


        return new JDBCDataSourceInfo(metaData);
            return adapter.cast(this);
            }
        @NotNull String purpose,
            case NUMERIC -> "NUMERIC";
            return connectTask.getConnection();
    public SQLDialect getSQLDialect() {
        }
    @NotNull

                }
    @Override
        }
                return ErrorType.CONNECTION_LOST;
    @Nullable
                    Class.forName(driverClassName, true, driverLoader.getClassLoader());
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, ModelMessages.model_jdbc_read_database_meta_data)) {
                                if (e instanceof SQLException se && JDBCUtils.isRollbackWarning(se)) {
    // Error assistance
                synchronized (closingConnections) {

     */
        return this;
                instance.shutdown(monitor);
    {
        }
            for (DBSDataType type : getLocalDataTypes()) {
import org.jkiss.dbeaver.model.sql.SQLConstants;
            DBPProject project = getContainer().getProject();

                if (REFRESH_CREDENTIALS_ON_CONNECT) {
        DBPRefreshableObject,
                }
                                    // Do not write warning because connection maybe broken before the moment of close
    }
        return true;
        return true;
        } catch (DBException e) {
            Object exclusiveLock = instance.getExclusiveLock().acquireExclusiveLock();
    }
import org.jkiss.dbeaver.DBDatabaseException;
 * you may not use this file except in compliance with the License.
        String sqlState = SQLState.getStateFromException(error);
    private JDBCRemoteInstance defaultRemoteInstance;
            Driver driver = getDriverInstance(new VoidProgressMonitor());
                return dataType;
            if (internalProps != null) {
        if (dataType == null) {
                // Close datasource (in async task)
                connectProps,

                databaseVersion = new Version(
            }
        if (driverInstance instanceof ObjectWithContextParameters owcp) {
        // Set properties
        if (valueType == Types.OTHER || valueType == Types.VARCHAR) {
import java.net.SocketException;
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) throws DBCException {
    }
 *
            }
    }
            case Types.TINYINT:
            Throwable rootCause = CommonUtils.getRootCause(error);
                        connectProps.putAll(substitutedProperties);
                                } else {
                driverInstance,
                dataSourceInfo = createDataSourceInfo(monitor, metaData);
    @Override
import org.jkiss.code.NotNull;
        }
    }
    // Overridable functions
                        isInvalidURL = true;
            throw ex;
                final DBPDriver substitutedDriver = dataSourceProvider.getDriver(driverSubstitution.getDriverId());
        if (driverSubstitution != null) {
            // Set read-only flag
        }
                }
                return ErrorType.AUTHENTICATION_FAILED;
            if (!openTaskFinished) {
                        // Just set the mark. Some drivers are poorly coded and always returns false here.
            ".jks");
            Collections.singletonList(defaultInstance);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    /////////////////////////////////////////////////
        @NotNull String taskTitle)
 * distributed under the License is distributed on an "AS IS" BASIS,
                } else {
            monitor.subTask("Connecting " + purpose);

    public boolean isDriverVersionAtLeast(int major, int minor) {
        throws DBException
            if (container.isConnectionReadOnly() && !isConnectionReadOnlyBroken()) {
import java.util.*;
    ) throws DBCException {
            }
    /**
                    DBPDriverLoader driverLoader = driver.getDriverLoader(getContainer());
                if (type.getDataKind() == dataKind) {
        try {
                    throw new DBCException("Null connection returned");
            case Types.NCLOB:
    }
/**
        }

        if (tempFiles != null) {
            if (SQLState.SQL_23000.getCode().equals(sqlState) ||
            Object authResult;
                try {
                try {
                throw connectTask.getError();
        }
    public void trackTempFile(Path file) {
    protected final SQLDialect sqlDialect;
    {
import org.jkiss.dbeaver.Log;
                        return true;
                authResult = authModel.initAuthentication(monitor, this, credentials, connectionInfo, connectProps);
            return false;
import org.jkiss.dbeaver.model.struct.DBSDataType;
                        }
        }

        return jdbcFactory;
        }
    protected Map<String, String> getInternalConnectionProperties(
                }


        try {
        return null;
    {
        @Nullable JDBCExecutionContext context,
            tempFiles = null;
                    final Properties substitutedProperties = substitution.getConnectionProperties(monitor, container, connectionInfo);
        }
        }
                return DBPDataKind.REFERENCE;
        return new JDBCConnectionImpl(context, monitor, purpose, taskTitle);
        if (this.tempFiles == null) {

                authResult
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCFactoryDefault;
    }
            if (this.sqlDialect instanceof JDBCSQLDialect jdbcDialect) {
            }
            final Map<String, Object> driverProperties = container.getDriver().getConnectionProperties();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (connectTask.getConnection() == null) {
        return switch (dataKind) {
                    SQLState.SQL_08003.getCode().equals(sqlState) ||
    protected JDBCConnectionImpl createConnection(
 * DBeaver - Universal Database Manager
    public void cancelStatementExecute(DBRProgressMonitor monitor, JDBCStatement statement) throws DBException {
            // No such data type
                if (connectionConfigurer != null) {
            } finally {

                        if (doRollback) {
                                    log.debug("Error closing active transaction", e);
                    return type.getName();
        if (sqlState != null) {
                }
    }

                SQLState.SQL_23505.getCode().equals(sqlState)) {
            if (dataType.getTypeID() == typeID) {
                driver,
        url = substituteDriverIfNeeded(monitor, connectionInfo, connectProps, url);
        @NotNull DBRProgressMonitor monitor,
            }
            }
            Map<String,String> internalProps = getInternalConnectionProperties(monitor, getContainer().getDriver(), context, purpose, connectionInfo);
                throw new DBCException("Authentication error: " + e.getMessage(), e);
import org.jkiss.dbeaver.model.impl.AbstractDataSource;
import org.jkiss.utils.IOUtils;
    private static int getValueTypeByTypeName(@NotNull String typeName, int valueType)
    protected void fillConnectionProperties(DBPConnectionConfiguration connectionInfo, Properties connectProps) {
        } else {
import org.jkiss.dbeaver.model.struct.DBSObject;
            return true;
            return ErrorType.CONNECTION_LOST;
                }
        @NotNull DBRProgressMonitor monitor,
        String url = connectionInfo.getUrl();
                // ignore
                    url = getConnectionURL(connectionInfo);
        return null;
                    log.debug("Error in " + driverInstance.getClass().getName() + ".acceptsURL() - " + url, e);
                    if (substitutedUrl != null) {
                authModel.endAuthentication(container, connectionInfo, connectProps);
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                return DBPDataKind.NUMERIC;
        this.dataSourceInfo = new JDBCDataSourceInfo(container);
        if (defaultInstance == null) {
