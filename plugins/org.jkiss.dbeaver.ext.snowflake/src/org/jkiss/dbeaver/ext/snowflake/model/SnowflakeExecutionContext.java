            isRefreshed = true;
 * See the License for the specific language governing permissions and
            return null;
                if (!CommonUtils.isEmpty(bootstrap.getDefaultSchemaName()) &&
 * Unless required by applicable law or agreed to in writing, software
            return null;
        }
        @NotNull DBRProgressMonitor monitor,
    private static final Log log = Log.getLog(SnowflakeExecutionContext.class);

        @NotNull GenericCatalog catalog,
package org.jkiss.dbeaver.ext.snowflake.model;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
 * You may obtain a copy of the License at
                    CommonUtils.isEmpty(connectionConfiguration.getDatabaseName())
        }
                ) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;

/*
        if (schema != null) {
    @Nullable
        DBUtils.fireObjectSelectionChange(oldActiveSchema, newActiveSchema, this);

        super(instance, purpose);
    @Nullable

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                DBPConnectionConfiguration connectionConfiguration = getDataSource().getContainer().getConnectionConfiguration();
import org.jkiss.utils.CommonUtils;
    }
        }
    public boolean supportsCatalogChange() {
            return null;
import org.jkiss.dbeaver.model.exec.DBCCachedContextDefaults;
        }
        @NotNull DBRProgressMonitor monitor,
                return;
                    setActiveSchema(monitor, bootstrap.getDefaultSchemaName());
        boolean force
    private String activeDatabaseName;
        String catalogName = catalog.getName();
    @Override
    public boolean refreshDefaults(@NotNull DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
        }
    private void setActiveDatabase(DBRProgressMonitor monitor, @NotNull String databaseName) throws DBCException {

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    @Nullable
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
                    currentSchema = bootstrap.getDefaultSchemaName();
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBUtils.fireObjectSelectionChange(oldActiveDatabase, catalog, this);
                if (!CommonUtils.isEmpty(bootstrap.getDefaultCatalogName()) &&
                }
    @Override
                throw new DBException("Unable to refresh defaults for Snowflake execution context", e);
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active database")) {
            try (JDBCStatement dbStat = session.createStatement()) {
        @NotNull DBRProgressMonitor monitor,
        if (!CommonUtils.isEmpty(currentSchema) && !CommonUtils.equalObjects(currentSchema, activeSchemaName)) {
            }
        } catch (DBException e) {
                }
    public void setDefaultCatalog(
                ) {
        }
            if (useBootstrapSettings) {
        @Nullable DBSObject newActiveSchema,
            try (JDBCStatement dbStat = session.createStatement()) {
                    setActiveDatabase(monitor, bootstrap.getDefaultCatalogName());
                        dbResult.next();
            }
            isRefreshed = true;
        if (!force && catalogName.equals(activeDatabaseName) && (schema == null || schema.getName().equals(activeSchemaName))) {

    ) throws DBCException {

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.code.NotNull;

    public GenericSchema getDefaultSchema() {
                    currentDatabase = bootstrap.getDefaultCatalogName();
    }
                    CommonUtils.isEmpty(connectionConfiguration.getProviderProperty(SnowflakeConstants.PROP_SCHEMA))
 *
                log.debug("Exception caught when refreshing defaults for Snowflake execution context", e);
            setActiveSchema(monitor, newSchemaName);
                }
    @NotNull

        if (!CommonUtils.isEmpty(currentDatabase) && !CommonUtils.equalObjects(currentDatabase, activeDatabaseName)) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        String currentSchema = null;
        } catch (SQLException e) {
    ) throws DBCException {

            String newSchemaName = newActiveSchema.getName();
                try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT CURRENT_DATABASE(), CURRENT_SCHEMA()")) {
        return new DBCCachedContextDefaults(activeDatabaseName, activeSchemaName);
    ) throws DBCException {
    @Override
    }
        } catch (SQLException e) {
            activeSchemaName = "PUBLIC";
        if (defaultCatalog == null) {
    public void setDefaultSchema(
        @Nullable GenericSchema schema
            throw new DBCException(e, this);
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
import org.jkiss.dbeaver.model.DBUtils;
                        currentDatabase = dbResult.getString(1);
    public boolean supportsSchemaChange() {

                DBPConnectionBootstrap bootstrap = getBootstrapSettings();
            log.error("Unable to set active database due to unexpected SQLException. databaseName=" + databaseName);
    public GenericCatalog getDefaultCatalog() {
            try (JDBCStatement dbStat = session.createStatement()) {
            return defaultCatalog.getSchema(new VoidProgressMonitor(), activeSchemaName);
import org.jkiss.dbeaver.ext.generic.model.GenericExecutionContext;
    }
        GenericSchema oldActiveSchema = getDefaultSchema();
            throw new DBCException(e, this);
            return null;
        boolean isRefreshed = false;
                        currentSchema = dbResult.getString(2);

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
        GenericCatalog defaultCatalog = getDefaultCatalog();
        String currentDatabase = null;
            activeDatabaseName = currentDatabase;

        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.DBException;
        return true;
    SnowflakeExecutionContext(JDBCRemoteInstance instance, String purpose) {
    @Override
 * DBeaver - Universal Database Manager
            activeSchemaName = null;
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, TASK_TITLE_SET_SCHEMA)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (dbResult != null) {
    void setDefaultCatalog(
        if (newActiveSchema == null) {
            activeSchemaName = newSchemaName;
        setDefaultSchema(monitor, newActiveSchema, false);
    }
        DBSObject oldActiveDatabase = getDefaultCatalog();
 * Copyright (C) 2010-2026 DBeaver Corp and others

            }
            }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Nullable
        setActiveDatabase(monitor, catalogName);

            log.error("Unable to retrieve active schema by its name", e);
    }
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
 *

    }
        @Nullable GenericSchema newActiveSchema
    ) throws DBCException {
            if (!force && newSchemaName.equals(activeSchemaName)) {
            catalog.getSchemas(monitor);
import org.jkiss.dbeaver.Log;
            setDefaultSchema(monitor, schema, force);
        }
        } catch (DBException e) {
            }
        @NotNull GenericCatalog catalog,
        }
}
    private String activeSchemaName;

import org.jkiss.code.Nullable;
    @Override
        }
        if (CommonUtils.isEmpty(activeDatabaseName)) {
    }

    @Override
class SnowflakeExecutionContext extends GenericExecutionContext {
                dbStat.executeUpdate("USE SCHEMA " + DBUtils.getQuotedIdentifier(getDataSource(), schemaName));
        @Nullable DBSObject schema,
 * limitations under the License.
        activeDatabaseName = catalogName;

        boolean force
    }
import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;
        if (CommonUtils.isEmpty(activeSchemaName)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public DBCCachedContextDefaults getCachedDefault() {
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active database and schema")) {
        if (CommonUtils.isEmpty(currentSchema)) {
 */
        } else {
    void setDefaultSchema(
        try {
    @Override
            } catch (SQLException e) {
                    }
            log.error("Unable to set active schema due to unexpected SQLException. schemaName=" + schemaName);
            return;
            log.debug("Error caching database schemas", e);
 *
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;

        return isRefreshed;
        }
            isRefreshed = true;
    }

        try {
import java.sql.SQLException;
        }
            activeSchemaName = currentSchema;
        return true;
        }
                dbStat.executeUpdate("USE DATABASE " + DBUtils.getQuotedIdentifier(getDataSource(), databaseName));
        setDefaultCatalog(monitor, catalog, schema, false);
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void setActiveSchema(DBRProgressMonitor monitor, @NotNull String schemaName) throws DBCException {
        return getDataSource().getCatalog(activeDatabaseName);
