
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    @NotNull
    public String getActiveSchemaName() {
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;
        }
            throw new DBCException(e, this);

                }

        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, TASK_TITLE_SET_SCHEMA)) {
            DBUtils.fireObjectSelectionChange(oldDefaultSchema, newDefaultSchema, this);
        setCurrentSchema(monitor, object.getName());
            throw new DBCException(e, this);
public class OracleExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<DBSCatalog, OracleSchema> {

/**

    OracleExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
                    setCurrentSchema(monitor, bootstrap.getDefaultSchemaName());
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
    private static final Log log = Log.getLog(OracleExecutionContext.class);
        } catch (SQLException e) {
 * Unless required by applicable law or agreed to in writing, software
 *
        return null;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * limitations under the License.

            this.activeSchemaName = OracleUtils.getCurrentSchema(session);
        return (OracleDataSource) super.getDataSource();
        throw new DBCFeatureNotSupportedException();
        setCurrentSchema(monitor, schema);

            log.error(e);
    }
                if (this.activeSchemaName.isEmpty()) {
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active schema")) {
 */
import org.jkiss.dbeaver.DBException;
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
 * You may obtain a copy of the License at

    public boolean supportsCatalogChange() {
    @NotNull
    @Override
import java.sql.SQLException;
 * OracleExecutionContext
        // Check default active schema
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;

    @Override
        } catch (Exception e) {
/*
    }
            return;
 *
                }
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();

            }
    public void setDefaultSchema(DBRProgressMonitor monitor, OracleSchema schema) throws DBCException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            OracleUtils.setCurrentSchema(session, activeSchemaName);

        return true;
        activeSchemaName = schema.getName();
            return null;
}

 * See the License for the specific language governing permissions and
    public boolean supportsSchemaChange() {
    }
            return;
    }

        return false;
                new LocalCacheProgressMonitor(new VoidProgressMonitor()), activeSchemaName);
        return activeSchemaName;
    @Override
    }
import org.jkiss.dbeaver.model.exec.*;
package org.jkiss.dbeaver.ext.oracle.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
            return activeSchemaName == null ? null : getDataSource().getSchema(
        if (object == null) {
import org.jkiss.code.NotNull;
    private String activeSchemaName;
        } catch (Exception e) {
    @Override
 * you may not use this file except in compliance with the License.

    }

import org.jkiss.dbeaver.Log;
        }
    public OracleExecutionContext getContextDefaults() {

        DBUtils.fireObjectSelectionChange(oldSelectedEntity, schema, this);
    public DBCCachedContextDefaults getCachedDefault() {
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        }
        try {
        return true;
import org.jkiss.utils.CommonUtils;
                if (!CommonUtils.isEmpty(bootstrapSchemaName) && !bootstrapSchemaName.equals(activeSchemaName)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return this;
    @Override
    public OracleSchema getDefaultSchema() {
    }
    }

            }
    @Override
    }
            DBSObject newDefaultSchema = getDefaultSchema();
import org.jkiss.dbeaver.model.DBUtils;
                    this.activeSchemaName = null;
    @Override
    @Override
    void setCurrentSchema(DBRProgressMonitor monitor, OracleSchema object) throws DBCException {
    }
    }
        // Send notifications
 * distributed under the License is distributed on an "AS IS" BASIS,
        return new DBCCachedContextDefaults(null, activeSchemaName);
    @Override
        if (schema == null || oldSelectedEntity == schema) {
    }
        super(instance, purpose);
            log.debug("Null current schema");
            if (useBootstrapSettings) {

        }
        DBSObject oldDefaultSchema = getDefaultSchema();
    }
            this.activeSchemaName = activeSchemaName;
            if (this.activeSchemaName != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
    private void setCurrentSchema(DBRProgressMonitor monitor, String activeSchemaName) throws DBCException {
 */
                String bootstrapSchemaName = bootstrap.getDefaultSchemaName();
    public void setDefaultCatalog(DBRProgressMonitor monitor, DBSCatalog catalog, OracleSchema schema) throws DBCException {
    public OracleDataSource getDataSource() {
            // Get active schema
    }
        final OracleSchema oldSelectedEntity = getDefaultSchema();

    public DBSCatalog getDefaultCatalog() {
    @Override
