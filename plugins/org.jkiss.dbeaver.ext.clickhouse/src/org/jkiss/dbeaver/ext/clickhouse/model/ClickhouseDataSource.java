                }
                        properties.put(ClickhouseConstants.SSL_KEY_PASSWORD, saveCertificateToFile(clientKeyProp));
 *
    }
    @Override
        dataTypeMap.put(Short.class.getName(), "Int16");
            @NotNull JDBCSession session,
            log.debug(e);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            default:
import java.sql.SQLException;
    boolean isSupportTableComments() {
                String getLastQueryId = (String) BeanUtils.invokeObjectDeclaredMethod(
        protected ClickhouseTableEngine fetchObject(
        return isDriverVersionAtLeast(0, 8);
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;

    public DBSDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull String typeFullName) throws DBException {
        }
            throw new DBCException("Error during cancelling query", e);
        if (typeName.startsWith(ClickhouseConstants.DATA_TYPE_ARRAY)) {
    {
                        } else {
                String mode = sslConfig.getStringProperty(ClickhouseConstants.SSL_MODE_CONF);
    }
                Statement original = ((JDBCStatementImpl) statement).getOriginal();
    }


                properties.put(ClickhouseConstants.SSL_MODE,


    @NotNull
    }
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseConstants;
        } else if (typeName.startsWith(ClickhouseConstants.DATA_TYPE_TUPLE)) {
    }
        return new ClickhouseDataSourceInfo(metaData);
    static class TableEnginesCache extends JDBCObjectCache<ClickhouseDataSource, ClickhouseTableEngine> {
    protected Properties getAllConnectionProperties(@NotNull DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose, DBPConnectionConfiguration connectionInfo) throws DBCException {
                    new Object[0]
                fallbackForServerID(monitor, statement);

            return super.getCatalogsNames(monitor, metaData, catalogObject, catalogFilters);
    @Override
                    databaseVersion = new Version(version);

        } catch (Throwable ex) {
        @Override
            }

                }
            @NotNull JDBCSession session,
    private final TableEnginesCache engineCache = new TableEnginesCache();
                log.error("Failed to set readonly mode", e);

                return new ClickhouseTableEngine(engineName, clickhouseDataSource);
        if (databaseVersion == null) {
            if (customTimeZone.equals(DBConstants.DEFAULT_TIMEZONE)) {
            try (JDBCStatement dbStat = session.createStatement()) {
            } else {
    }
    @Override
        protected JDBCStatement prepareObjectsStatement(
        } catch (Throwable e) {
    }
 * limitations under the License.
import org.jkiss.utils.CommonUtils;

            final DBSDataType type = ClickhouseTypeParser.getType(monitor, this, typeFullName);
            }
                            monitor.subTask("Extract catalogs - " + catalogName);
                        if (catalogFilters == null || catalogFilters.matches(catalogName)) {
    // So we need to temporarily create a new one
        @Nullable DBSObjectFilter catalogFilters
            } else {
                if (mode != null) {
    public void cancelStatementExecute(DBRProgressMonitor monitor, JDBCStatement statement) throws DBException {
            }

 * distributed under the License is distributed on an "AS IS" BASIS,
                    );
        return isDriverVersionAtLeast(0, 8);
                String caCertProp = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT_VALUE);
        }
                    properties.put(ClickhouseConstants.SSL_KEY_PASSWORD,
    private void configureSession(@NotNull Properties properties) {
                        sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY)
        dataTypeMap.put(Date.class.getName(), "DateTime");
                stmt.execute("SET readonly=1");
import java.util.*;

                properties.put(ClickhouseConstants.SSL_ROOT_CERTIFICATE,
            }
    public JDBCFactory getJdbcFactory() {
    @Override

        }
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    @NotNull
            String customTimeZone = preferenceStore.getString(ModelPreferences.CLIENT_TIMEZONE);

        try {
            }
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
    }
                    ClickhouseConstants.DRIVER_GET_LAST_QUERY_METHOD,
    @Override
    @Override
        // We use custom catalog read because of https://github.com/ClickHouse/clickhouse-java/issues/1921
        }
    @NotNull
            final String engineName = JDBCUtils.safeGetString(dbResult, 1);
                if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {

    public List<String> getCatalogsNames(
                            catalogsFiltered = true;
                        properties.put(ClickhouseConstants.SSL_PATH, saveCertificateToFile(clientCertProp));
 */
    private static final Log log = Log.getLog(ClickhouseDataSource.class);
/*
    }

import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
        Properties properties = super.getAllConnectionProperties(monitor, context, purpose, connectionInfo);

        Connection connection = super.openConnection(monitor, context, purpose);
import java.sql.DatabaseMetaData;
    @Override
    public ClickhouseDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
                    }
            if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                    if (!CommonUtils.isEmpty(clientCertProp)) {
            try (Statement dbStat = connection.createStatement()) {
                    String clientCertProp =
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;

            throw new DBException("Can not configure SSL", e);
        dataTypeMap.put(Byte.class.getName(), "Int8");
import org.jkiss.dbeaver.runtime.DBWorkbench;
        dataTypeMap.put(Float.class.getName(), "Float32");
        return engineCache.getCachedObject(engineName);
    @Override
                    );

                try (JDBCResultSet dbResults = dbStat.executeQuery("SHOW DATABASES")) {
import org.jkiss.code.NotNull;
            }

            if (type != null) {
                super.readDatabaseServerVersion(session, metaData);
                    }
            }
        }
        return engineCache.getCachedObjects();
                );

        switch (dataKind) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.setCaseSensitive(true);
            DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
            case STRING:
                String version = JDBCUtils.executeQuery(session, "SELECT VERSION()");
        
import org.jkiss.dbeaver.ModelPreferences;
        @Override
        return connection;
    ) throws DBException {
                }
        dataTypeMap.put(Double.class.getName(), "Float64");
import org.jkiss.dbeaver.model.exec.DBCException;
    List<ClickhouseTableEngine> getTableEngines() {
            }
        String shortName = dataTypeMap.get(typeFullName);
import java.sql.Statement;
 * See the License for the specific language governing permissions and
                customTimeZone = TimeZone.getDefault().getID();
            @NotNull ClickhouseDataSource clickhouseDataSource) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.*;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        try (Connection connection = openConnection(monitor, statement.getConnection().getExecutionContext(), "Close Query")) {
        if (type != null) {
    }
    @NotNull
        }
            !CommonUtils.toBoolean(properties.getProperty(ClickhouseConstants.PROP_USE_TIME_ZONE))
        }
            } catch (Throwable e) {
                if (version != null) {
                    properties.put(ClickhouseConstants.SSL_MODE, mode.toLowerCase());
    }
            if (CommonUtils.isNotEmpty(engineName)) {
                    properties.put(ClickhouseConstants.SSL_PATH,

        engineCache.getAllObjects(monitor, this);



            @NotNull ClickhouseDataSource clickhouseDataSource,
                    properties.put(ClickhouseConstants.SSL_ROOT_CERTIFICATE, saveCertificateToFile(caCertProp));
        }
        }
        @Override
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
        }
 *
                if (!CommonUtils.isEmpty(caCertProp)) {
        DBSDataType type = super.resolveDataType(monitor, typeFullName);
    @Override
            @NotNull JDBCResultSet dbResult) {
                );
    private void initSSL(DBRProgressMonitor monitor, Properties properties, DBWHandlerConfiguration sslConfig) throws DBException {
            return DBPDataKind.ARRAY;
                    String clientKeyProp = sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY_VALUE);
        } catch (SQLException e) {
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return null;
        return properties;

                } else {
import org.jkiss.dbeaver.model.struct.DBSDataType;
        if (shortName != null) {
                    if (!CommonUtils.isEmpty(clientKeyProp)) {
        dataTypeMap.put(String.class.getName(), "String");

    }
            }
        }
        TableEnginesCache() {
    protected Connection openConnection(@NotNull DBRProgressMonitor monitor, @Nullable JDBCExecutionContext context, @NotNull String purpose) throws DBCException {
        }
        properties.put(ClickhouseConstants.CLICKHOUSE_SETTING_SESSION_ID, "sess_" + UUID.randomUUID());
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import java.io.IOException;
package org.jkiss.dbeaver.ext.clickhouse.model;
        return super.resolveDataType(monitor, baseTypeName);
    }
            if (databaseVersion == null) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
            } catch (Exception e) {
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseDataSourceInfo;
        dataTypeMap.put(Long.class.getName(), "Int64");
        ) {


        return isServerVersionAtLeast(21, 6);
        dataTypeMap.put(Integer.class.getName(), "Int32");
    ClickhouseTableEngine getEngineByName(@NotNull String engineName) {
        if (sslConfig != null && sslConfig.isEnabled()) {
    }
    // Canceling
        @Nullable
import org.osgi.framework.Version;
        }
public class ClickhouseDataSource extends GenericDataSource {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;

    @Override
            }
import java.sql.Connection;
            }
import org.jkiss.dbeaver.model.*;

            typeFullName = shortName;
            try (Statement stmt = connection.createStatement()) {
        }
        // As a last resort, try to find the type without modifiers
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
                    return catalogNames;
    @Override
            try {

        GenericMetaObject catalogObject,
                // Old clickhouse used lowercase for sslmode, we should send it in the lowercase
            if (ex.getMessage().contains(ClickhouseConstants.SESSION_BUSY_ERROR_CODE_MESSAGE)) {
                    original,
            try {
 * DBeaver - Universal Database Manager

    }
    public boolean isOmitCatalog() {
        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
                initSSL(monitor, properties, sslConfig);
            super.cancelStatementExecute(monitor, statement);
        if (getContainer().isConnectionReadOnly() && isConnectionReadOnlyBroken()) {
        return super.resolveDataKind(typeName, valueType);
    private static Map<String, String> dataTypeMap = new HashMap<>();
    }
                throw new DBCException("Error configuring SSL certificates", e);
            return DBPDataKind.STRUCT;
    protected synchronized void readDatabaseServerVersion(Connection session, DatabaseMetaData metaData) {
        throws DBException
        }

                    sslConfig.getStringProperty(ClickhouseConstants.SSL_MODE_CONF)
        final DBWHandlerConfiguration sslConfig = getContainer().getActualConnectionConfiguration().getHandler("clickhouse-ssl");
                        String catalogName = dbResults.getString(1);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read Clickhouse databases")) {
                }
        properties.put(ClickhouseConstants.SSL_PARAM, "true");
    protected void fallbackForServerID(@NotNull DBRProgressMonitor monitor, @NotNull JDBCStatement statement) throws DBCException {
                    }
    }
 * you may not use this file except in compliance with the License.
    protected boolean isConnectionReadOnlyBroken() {
        if (ClickhouseTypeParser.isComplexType(typeFullName)) {
            return type;
        return new ClickhouseJdbcFactory();
        if (!CommonUtils.toBoolean(properties.getProperty(ClickhouseConstants.PROP_USE_SERVER_TIME_ZONE)) &&
                        }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
                return super.getDefaultDataTypeName(dataKind);
            setListOrderComparator(DBUtils.nameComparator());
                log.error("Error determining server version", e);
                return ClickhouseConstants.DATA_TYPE_STRING;
                );

            return session.prepareStatement("SELECT name FROM system.table_engines");
                        sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT)
import org.jkiss.code.Nullable;
        @NotNull DBRProgressMonitor monitor,
        monitor.subTask("Initialising SSL configuration");
    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {
                        sslConfig.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT_VALUE);

        } catch (IOException e) {
    }
            properties.put(ClickhouseConstants.PROP_USE_TIME_ZONE, customTimeZone);
    static {
import org.jkiss.dbeaver.DBException;
        }

 *
        super(monitor, container, metaModel, new ClickhouseSQLDialect());
        @NotNull JDBCDatabaseMetaData metaData,
            } catch (SQLException e) {
    @Override
    // same session_id will lead to impossibility of cancelling the query, because the session is already busy...
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.BeanUtils;
    }
                    sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT)

        protected void detectCaseSensitivity(DBSObject object) {
                    while (dbResults.next()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return type;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                    new Class[0],
                }
import org.jkiss.dbeaver.ext.clickhouse.model.jdbc.ClickhouseJdbcFactory;
        configureSession(properties);
    @Nullable
    }
        @NotNull
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseTypeParser;
                            catalogNames.add(catalogName);
        String baseTypeName = ClickhouseTypeParser.getTypeNameWithoutModifiers(typeFullName);
        }
    }
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCStatementImpl;
 * You may obtain a copy of the License at
            if ("com_clickhouse".equals(getContainer().getDriver().getId())) {
                dbStat.execute("KILL QUERY WHERE query_id='%s'".formatted(getLastQueryId));
                    List<String> catalogNames = new ArrayList<>();
