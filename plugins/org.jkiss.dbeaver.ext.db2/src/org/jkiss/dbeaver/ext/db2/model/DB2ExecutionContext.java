        }
 */
        }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    }
        throw new DBCFeatureNotSupportedException();
                log.warn(
        return true;
 *

            this.activeSchemaName = schemaName;
    }
import java.sql.SQLException;

    DB2ExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
    public boolean supportsCatalogChange() {
 * limitations under the License.
        return true;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;
        return false;
package org.jkiss.dbeaver.ext.db2.model;
                if (!CommonUtils.isEmpty(bootstrap.getDefaultSchemaName())) {
 *
    private static final String                                  SET_CURRENT_SCHEMA = "SET CURRENT SCHEMA = %s";
        return new DBCCachedContextDefaults(null, activeSchemaName);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
    @Override
            }
import org.jkiss.dbeaver.model.DBUtils;
            if (useBootstrapSettings) {


import org.jkiss.dbeaver.model.exec.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            log.debug("Null current schema");
        }
    public String getActiveSchemaName() {
 * You may obtain a copy of the License at
/*
        }
    @Override
            // Get active schema
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, TASK_TITLE_SET_SCHEMA)) {

    public DB2DataSource getDataSource() {

    public void setDefaultCatalog(DBRProgressMonitor monitor, DBSCatalog catalog, DB2Schema schema) throws DBCException {

    private static final Log log = Log.getLog(DB2ExecutionContext.class);


        // Check default active schema
    public DB2ExecutionContext getContextDefaults() {

    @NotNull
    @Override
    private void setCurrentSchema(DBRProgressMonitor monitor, String schemaName) throws DBCException {

    @Override
    private String activeSchemaName;
 * you may not use this file except in compliance with the License.
        // First try to get active schema from special register 'CURRENT SCHEMA'
            log.warn(GET_CURRENT_SCHEMA + " returned null! How can it be? Trying to set active schema to special register 'SYSTEM_USER'");
            throw new DBCException(e, this);
            return;
                    setCurrentSchema(monitor, bootstrap.getDefaultSchemaName());
    public boolean supportsSchemaChange() {
        activeSchemaName = schema.getName();
    }
    public DBSCatalog getDefaultCatalog() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        return null;
        return this;
import org.jkiss.dbeaver.DBException;
 *
        return activeSchemaName;
            throw new DBCException(e, this);
        } catch (Exception e) {
            JDBCUtils.executeSQL(session, String.format(SET_CURRENT_SCHEMA, schemaName));
        if (schema == null || oldSelectedEntity == schema) {

        setCurrentSchema(monitor, schema);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return activeSchemaName == null ? null : getDataSource().getSchemaCache().getCachedObject(activeSchemaName);

import org.jkiss.code.NotNull;
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
                    "Special registers 'CURRENT SCHEMA' and 'SYSTEM_USER' both returned null. Use connection username as active schema");
    private static final String                                  GET_CURRENT_USER   = "VALUES(SYSTEM_USER)";
    public void setDefaultSchema(DBRProgressMonitor monitor, DB2Schema schema) throws DBCException {
 * DBeaver - Universal Database Manager
    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {

        return defSchema.trim();

import org.jkiss.dbeaver.Log;
    }
    }
 * See the License for the specific language governing permissions and
            }
            if (defSchema == null) {
    }
    @Override
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();
    }
 * DB2ExecutionContext
    }
        // Send notifications

public class DB2ExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<DBSCatalog, DB2Schema> {
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active schema")) {

    }
    public DBCCachedContextDefaults getCachedDefault() {
        DBUtils.fireObjectSelectionChange(oldSelectedEntity, schema, this);
        } catch (SQLException e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    void setCurrentSchema(DBRProgressMonitor monitor, DB2Schema object) throws DBCException {
    @Override
    private static final String                                  GET_CURRENT_SCHEMA = "VALUES(CURRENT SCHEMA)";
        return (DB2DataSource) super.getDataSource();
    }
            defSchema = JDBCUtils.queryString(session, GET_CURRENT_USER);
import org.jkiss.utils.CommonUtils;
        final DB2Schema oldSelectedEntity = getDefaultSchema();

        String defSchema = JDBCUtils.queryString(session, GET_CURRENT_SCHEMA);
            this.activeSchemaName = determineActiveSchema(session);
    }
                }

        if (object == null) {
        setCurrentSchema(monitor, object.getName());


    public DB2Schema getDefaultSchema() {
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
    @NotNull
        super(instance, purpose);
    @Override
    }
        if (defSchema == null) {

    }
/**
    private String determineActiveSchema(JDBCSession session) throws SQLException
                defSchema = getDataSource().getContainer().getActualConnectionConfiguration().getUserName();
    @Override
    @Override
            // Then try to get active schema from special register 'SYSTEM_USER'

