            throw new DBCException(e, this);
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;

            log.debug("Null current schema");
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.code.NotNull;
        return activeSchemaName;
 * DBeaver - Universal Database Manager
    @Override
    public boolean supportsCatalogChange() {

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        // Send notifications

            if (useBootstrapSettings) {
 */
    @Override
            }
 *
        activeSchemaName = schema.getName();
        return (ExasolDataSource) super.getDataSource();
    }
    }
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
    private String activeSchemaName;
        }
            this.activeSchemaName = schemaName;


import org.jkiss.utils.CommonUtils;

        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, TASK_TITLE_SET_SCHEMA)) {
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
}
        return false;
        } catch (Exception e) {
    }
        super(instance, purpose);
    private static final String SET_CURRENT_SCHEMA = "OPEN SCHEMA \"%s\"";
    @NotNull
    }
    @Override
    }
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } catch (SQLException e) {
    public void setDefaultCatalog(DBRProgressMonitor monitor, DBSCatalog catalog, ExasolSchema schema) throws DBCException {
        return this;
import org.jkiss.dbeaver.Log;
    private void setCurrentSchema(DBRProgressMonitor monitor, String schemaName) throws DBCException {
            return null;

    }
        return true;
        setCurrentSchema(monitor, schema);
        DBUtils.fireObjectSelectionChange(oldSelectedEntity, schema, this);
    }

            // Get active schema
 * ExasolExecutionContext
    ExasolExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
    @Override
 * limitations under the License.
            JDBCUtils.executeSQL(session, String.format(SET_CURRENT_SCHEMA, schemaName));
        return null;
    @NotNull
        setCurrentSchema(monitor, object.getName());
        return defSchema.trim();

    private String determineActiveSchema(JDBCSession session)

    }
public class ExasolExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<DBSCatalog, ExasolSchema> {
        return true;
    }
    }
        String defSchema = JDBCUtils.queryString(session, GET_CURRENT_SCHEMA);
    public String getActiveSchemaName() {
        return activeSchemaName == null ? null : getDataSource().getSchemaCache().getCachedObject(activeSchemaName);
                    setCurrentSchema(monitor, bootstrap.getDefaultSchemaName());
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean supportsSchemaChange() {
package org.jkiss.dbeaver.ext.exasol.model;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private static final String GET_CURRENT_SCHEMA = "/*snapshot execution*/ SELECT CURRENT_SCHEMA";


        }
    private static final Log log = Log.getLog(ExasolExecutionContext.class);
        throw new DBCFeatureNotSupportedException();
    @Override
    }
    @NotNull
        if (schema == null || oldSelectedEntity == schema) {
    @Override
            return;
    public ExasolDataSource getDataSource() {
            throw new DBCException(e, this);
                if (!CommonUtils.isEmpty(bootstrap.getDefaultSchemaName())) {
    {
        if (object == null) {
    public DBSCatalog getDefaultCatalog() {
        return new DBCCachedContextDefaults(null, activeSchemaName);
                }
        }
    @Override

import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    void setCurrentSchema(DBRProgressMonitor monitor, ExasolSchema object) throws DBCException {
            this.activeSchemaName = determineActiveSchema(session);
 *
        if (defSchema == null) {
    @Override
        final ExasolSchema oldSelectedEntity = getDefaultSchema();
            return;

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

import java.sql.SQLException;
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active schema")) {
 *
    }
    public ExasolSchema getDefaultSchema() {
    }
    public void setDefaultSchema(DBRProgressMonitor monitor, ExasolSchema schema) throws DBCException {

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.model.exec.*;

        }
        throws SQLException
        // Check default active schema
    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    @Override
/*

/**

    }
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public DBCCachedContextDefaults getCachedDefault() {
 */
        // First try to get active schema from special register 'CURRENT SCHEMA'
    public ExasolExecutionContext getContextDefaults() {
