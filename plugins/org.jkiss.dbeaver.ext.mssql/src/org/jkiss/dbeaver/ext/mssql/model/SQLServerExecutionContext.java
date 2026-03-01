    @Override
                return null;

    }
            if (activeSchemaName == null || !CommonUtils.equalObjects(currentSchema, activeSchemaName)) {
package org.jkiss.dbeaver.ext.mssql.model;
        } catch (DBException e) {

import org.jkiss.utils.CommonUtils;
        return this;
    @Override
    }

            return false;
*/
 * DBeaver - Universal Database Manager
 */

    public SQLServerExecutionContext getContextDefaults() {
                refreshed = true;
    }
            if (!CommonUtils.isEmpty(currentDatabase) && (activeDatabaseName == null || !CommonUtils.equalObjects(currentDatabase, activeDatabaseName))) {


            setDefaultSchema(monitor, schema);
public class SQLServerExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<SQLServerDatabase, SQLServerSchema> {
                    setCurrentSchema(monitor, bootstrap.getDefaultSchemaName());
        if (object == null) {
import org.jkiss.dbeaver.Log;

            }
    private String activeSchemaName;
import org.jkiss.dbeaver.DBException;
/*
        return activeDatabaseName;
        if (schema != null) {

                        currentSchema = dbResult.getString(2);
    }
    boolean setCurrentDatabase(DBRProgressMonitor monitor, SQLServerDatabase object) throws DBCException {
            log.debug("Error caching database schemas", e);
                if (!CommonUtils.isEmpty(bootstrap.getDefaultCatalogName()) && supportsCatalogChange() && !CommonUtils.equalObjects(bootstrap.getDefaultCatalogName(), activeDatabaseName)) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
        activeSchemaName = schema.getName();
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
            log.error(e);
 * You may obtain a copy of the License at
    SQLServerExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    } else if (SQLServerUtils.isDriverAzure(session.getDataSource().getContainer().getDriver())) {
            activeDatabaseName = databaseName;
        if (CommonUtils.isEmpty(activeSchemaName)) {
    private boolean setCurrentSchema(DBRProgressMonitor monitor, String schemaName) {
            catalog.getSchemas(monitor);
    @Override
            } catch (Throwable e) {
    @Override
                if (!CommonUtils.isEmpty(bootstrap.getDefaultSchemaName()) && supportsSchemaChange()) {
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active schema")) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return !SQLServerUtils.isDriverAzure(getDataSource().getContainer().getDriver())

    public SQLServerDatabase getDefaultCatalog() {
            SQLServerUtils.setCurrentDatabase(session, databaseName);
        } catch (DBException e) {
import org.jkiss.code.Nullable;
import java.sql.SQLException;
                activeDatabaseName = currentDatabase;
    @Override
    }
        // Send notifications
        } catch (SQLException e) {
        } catch (SQLException e) {
            return;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private String activeDatabaseName;
            log.error(e);
                    }
    public SQLServerSchema getDefaultSchema() {
                try (JDBCStatement dbStat = session.createStatement()) {
/*
    public void setDefaultSchema(DBRProgressMonitor monitor, SQLServerSchema schema) throws DBCException {
            }
            if (CommonUtils.isEmpty(currentSchema)) {
            try {
    }
        }
            return null;
    private boolean setCurrentDatabase(DBRProgressMonitor monitor, String databaseName) {
//        }
                        currentDatabase = dbResult.getString(1);
            return schema;
        }
    @Override
                refreshed = true;
    }

    @Nullable
    public DBCCachedContextDefaults getCachedDefault() {
            SQLServerDatabase defaultCatalog = getDefaultCatalog();
                // If DBO is not the default schema and default schema doesn't exist (or was filtered out) let's try DBO though
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active schema and database")) {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        // Send notifications
        }
        }
            String currentDatabase = null;
                    refreshed = true;
 * limitations under the License.
                activeSchemaName = currentSchema;
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active database")) {

        String databaseName = object.getName();
 * SQLServerExecutionContext
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    refreshed = true;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
            return false;
                        query = "SELECT db_name(), schema_name(), CURRENT_USER AS original_login";
        return setCurrentDatabase(monitor, databaseName);
            || (dataSource instanceof SQLServerDataSource sqlServerDataSource
            SQLServerUtils.setCurrentSchema(session, currentUser, schemaName);
        final SQLServerDatabase oldActiveDatabase = getDefaultCatalog();
                }
    //private SQLServerDatabase activeDatabase;
    private String currentUser;
            SQLServerSchema schema = defaultCatalog.getSchema(new VoidProgressMonitor(), activeSchemaName);
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
            }
 * you may not use this file except in compliance with the License.
*/
/*
                        dbResult.next();

    }
 *

        }
    }
                        query = "SELECT db_name(), s.name AS schema_name, session_user AS original_login FROM sys.schemas s";
            }


        DBUtils.fireObjectSelectionChange(oldActiveSchema, schema, this);
        return new DBCCachedContextDefaults(activeDatabaseName, activeSchemaName);

    }
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();
        boolean refreshed = false;
    @Override
            return false;
        if (activeDatabaseName != null && activeDatabaseName.equals(catalog.getName())) {
                        currentUser = dbResult.getString(3);
            && sqlServerDataSource.isDataWarehouseServer(new VoidProgressMonitor()));
 * Unless required by applicable law or agreed to in writing, software
        }
    public boolean supportsCatalogChange() {
                }
    @Override

        // Azure SQL Database doesn't support changing database
                    String query = "SELECT db_name(), schema_name(), original_login()";

            return;
import org.jkiss.dbeaver.model.DBUtils;
        }
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0

            return;
import org.jkiss.dbeaver.model.exec.DBCCachedContextDefaults;
            }
    }
        try {
                    if (SQLServerUtils.isDriverBabelfish(session.getDataSource().getContainer().getDriver())) {
            return true;
    public void setDefaultCatalog(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerDatabase catalog, @Nullable SQLServerSchema schema)
        if (!setCurrentDatabase(monitor, catalog)) {
 *
                schema = defaultCatalog.getSchema(new VoidProgressMonitor(), SQLServerConstants.DEFAULT_SCHEMA_NAME);
    @Override
        }
    public boolean supportsSchemaChange() {
                log.debug("Error getting current user: " + e.getMessage());
        DBUtils.fireObjectSelectionChange(oldActiveDatabase, catalog, this);
        if (activeSchemaName != null && activeSchemaName.equals(schema.getName())) {

            if (schema == null) {
                    setCurrentDatabase(monitor, bootstrap.getDefaultCatalogName());
                currentSchema = SQLServerConstants.DEFAULT_SCHEMA_NAME;
            if (useBootstrapSettings) {
            return true;
                }


    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
//        if (!setCurrentSchema(monitor, schema.getName())) {
    @NotNull
        activeDatabaseName = catalog.getName();
    throws DBCException {
    public String getActiveDatabaseName() {
            String currentSchema = null;
        return getDataSource().getDatabase(activeDatabaseName);

 * Licensed under the Apache License, Version 2.0 (the "License");
            activeSchemaName = schemaName;
        }
    private static final Log log = Log.getLog(SQLServerExecutionContext.class);
import org.jkiss.dbeaver.model.exec.DBCException;
        return refreshed;
                    try (JDBCResultSet dbResult = dbStat.executeQuery(query)) {
            if (defaultCatalog == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        // Check default active schema
        return false;
        super(instance, purpose);
 * See the License for the specific language governing permissions and
/**
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    }
    @NotNull
//            return;
            return null;
            log.debug("Null current schema");
}
            }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 */

                    }
        final SQLServerSchema oldActiveSchema = getDefaultSchema();
        try {

            log.error(e);
        return (SQLServerDataSource) super.getDataSource();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            }
        }
    }
    public SQLServerDataSource getDataSource() {
