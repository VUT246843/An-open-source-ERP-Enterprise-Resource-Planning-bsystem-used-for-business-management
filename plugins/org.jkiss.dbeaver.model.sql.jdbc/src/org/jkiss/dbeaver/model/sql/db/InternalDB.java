
import org.jkiss.dbeaver.model.connection.DBPDriver;

    protected abstract void initializeSchema(@NotNull DBRProgressMonitor monitor, @Nullable Connection connection) throws Exception;
    protected DataSource dataSource;
import org.jkiss.code.Nullable;
        DatabaseMetaData metaData = connection.getMetaData();
        }
            }
    public DBPConnectionInformation getMetaDataInfo() {
                databaseConfig,
        return databaseConfig;
            schemaManager.updateSchema(monitor);
        for (int i = 0; i < schemaConfigList.size(); i++) {
    protected List<SQLSchemaConfig> getSchemaConfigList() {
    @NotNull
            SQLSchemaManager schemaManager = new SQLSchemaManager(

                new ClassLoaderScriptSource(
            );
        return dbConnectionInformation;

                    conn.setAutoCommit(true);
 * Unless required by applicable law or agreed to in writing, software

        return connection;
        Connection connection = tryGetDatabaseConnection();
        return dialect;
                log.info("Schema " + schemaName + " not exist, create new one");
        return conProperties;
import org.jkiss.dbeaver.model.sql.schema.SQLSchemaConfig;
 * you may not use this file except in compliance with the License.
    protected final List<SQLSchemaConfig> schemaConfigList;
    protected Properties getProperties() {
        if (connection == null) {
        if (!CommonUtils.isEmpty(databaseConfig.getUser())) {
        List<SQLSchemaConfig> schemaConfigList = getSchemaConfigList();
        this.databaseConfig = databaseConfig;
    protected DBPDriver getDatabaseDriver(@NotNull DBPDataSourceProviderRegistry dataSourceProviderRegistry) throws DBException {
import java.util.List;
    }
    protected final T databaseConfig;

                    schemaConfig.getCreateScriptPath(),
import javax.sql.DataSource;
            databaseConfig.getUrl(),
    }
                ),
    protected InternalDB(@NotNull String name, @NotNull T databaseConfig, @NotNull List<SQLSchemaConfig> configList) {
 */
            var schemaExistQuery = schemaController.getSchemaExistQuery(schemaName);
import org.jkiss.dbeaver.model.DBPConnectionInformation;
            }
                return null;
    }
            try {
            throw new DBException("Driver '" + databaseConfig.getDriver() + "' not found");
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
    public T getDatabaseConfig() {

            var conn = new InternalProxyConnection(dataSource.getConnection(), databaseConfig);
                }
    protected void updateSchema(
        final String schemaName = databaseConfig.getSchema();
    }
            if (!CommonUtils.isEmpty(databaseConfig.getPassword())) {
    public synchronized Connection tryGetDatabaseConnection() {
 * DBeaver - Universal Database Manager
    public synchronized Connection getDatabaseConnection() throws DBCException {
            return null;
    }
        log.debug("\t" + name + " DB server started (" + dbName + " " + dbVersion + ")");

            } catch (Exception e) {
 *
                log.warn("Error while stopping " + name + " database", e);
            databaseConfig.getDriver(),
                closeable.close();
    protected void createSchemaIfNotExists(@NotNull Connection connection) throws SQLException {
            }
        } catch (SQLException e) {
        if (dialect instanceof SQLDialectSchemaController schemaController && CommonUtils.isNotEmpty(schemaName)) {
        this.name = name;
        initializeSchema(monitor, connection);
        try {
            //todo throw it?
     * Returns internal database metadata.
            }
    protected abstract DataSource initConnectionPool(@NotNull Driver driverInstance, @NotNull String fullName);
                conProperties.put(DBConstants.DATA_SOURCE_PROPERTY_PASSWORD, databaseConfig.getPassword());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                try {

    @NotNull
    }
        dbConnectionInformation = new DBPConnectionInformation(
                    log.error("Failed to create schema: " + schemaName, e);
        if (driver == null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @NotNull
        @NotNull Connection connection
                schemaConfig.getSchemaVersionObsolete(),


                schemaConfig.getSchemaVersionActual(),
                    schemaConfig.getClassLoader(),
            try {
    }
        }
import java.sql.Driver;
            if (!schemaExist) {
public abstract class InternalDB<T extends InternalDatabaseConfig> {
        DBPDriver driver = dataSourceProviderRegistry.findDriver(databaseConfig.getDriver());
    protected DBPConnectionInformation dbConnectionInformation;
                schemaConfig.getVersionManager(),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        }

            throw new DBException("No database driver configured for CloudBeaver database");
import org.jkiss.dbeaver.model.connection.InternalDatabaseConfig;
import java.sql.Connection;
import java.util.Properties;
    private final String name;
    ) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
            dbName,

import org.jkiss.dbeaver.Log;

import java.sql.SQLException;
    /**
import org.jkiss.dbeaver.model.sql.schema.ClassLoaderScriptSource;
 *
    @Nullable
            }
                    schemaConfig.getUpdateScriptPrefix()
                    JDBCUtils.executeStatement(connection, createSchemaQuery);
            log.error(e.getMessage(), e);
                    closeConnection();
        Properties conProperties = new Properties();
    private static final Log log = Log.getLog(InternalDB.class);
    public SQLDialect getDialect() {
            boolean schemaExist = JDBCUtils.executeQuery(connection, schemaExistQuery) != null;
import org.jkiss.dbeaver.model.sql.SQLDialectSchemaController;
                schemaConfig.getSchemaId(),
            conProperties.put(DBConstants.DATA_SOURCE_PROPERTY_USER, databaseConfig.getUser());
import org.jkiss.dbeaver.model.exec.DBCException;
            } catch (SQLException e) {
                    throw e;

        this.schemaConfigList = configList;

        }
        }
    }
/*
     */
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;
    }
                String createSchemaQuery = schemaController.getCreateSchemaQuery(schemaName);
    }
        }
    protected SQLDialect dialect;
}
        );
        if (dataSource instanceof AutoCloseable closeable) {

        return schemaConfigList;
import org.jkiss.dbeaver.model.sql.SQLDialect;
            dataSource = null;

import org.jkiss.dbeaver.model.DBConstants;
 * limitations under the License.
                }
        }
    protected void initSchema(@NotNull DBRProgressMonitor monitor, @NotNull Connection connection) throws Exception {
import org.jkiss.dbeaver.model.sql.schema.SQLSchemaManager;
    @NotNull
        String dbVersion = metaData.getDatabaseProductVersion();
import java.sql.DatabaseMetaData;
        }
                dialect,

                monitor1 -> connection,
            if (dataSource == null) {
        String dbName = metaData.getDatabaseProductName();
import org.jkiss.code.NotNull;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (CommonUtils.isEmpty(databaseConfig.getDriver())) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            SQLSchemaConfig schemaConfig = schemaConfigList.get(i);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
            return conn;
                } catch (SQLException e) {
        return driver;
                if (!conn.getAutoCommit()) {
    }
            throw new DBCException("Internal database not initialized (" + databaseConfig.getUrl() + ")");
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.sql.db;
 *
    protected void closeConnection() {
        @NotNull DBRProgressMonitor monitor,
            dbVersion
                schemaConfig.getInitialSchemaFiller()
                log.error("Error setting auto-commit state", e);
