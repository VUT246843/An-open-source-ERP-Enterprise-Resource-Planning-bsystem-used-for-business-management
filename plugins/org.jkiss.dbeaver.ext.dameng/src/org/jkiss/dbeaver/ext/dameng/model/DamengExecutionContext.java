import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
    }
        } catch (Exception e) {
    }
 * See the License for the specific language governing permissions and
        return this;
        if (schema == null || oldSelectedEntity == schema) {
    public DBSCatalog getDefaultCatalog() {
            DBUtils.fireObjectSelectionChange(oldDefaultSchema, newDefaultSchema, this);
            this.activeSchemaName = activeSchemaName;
 * You may obtain a copy of the License at
        return false;
    @Override
    public boolean supportsSchemaChange() {
    public void setDefaultSchema(DBRProgressMonitor monitor, DamengSchema schema) throws DBCException {
    }
    @NotNull

 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        return true;
        }
 * limitations under the License.
    public boolean supportsCatalogChange() {
            throw new DBCException(e, this);
        super(instance, purpose);
import org.jkiss.code.NotNull;
    }

        setCurrentSchema(monitor, schema.getName());
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, TASK_TITLE_SET_SCHEMA)) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setDefaultCatalog(DBRProgressMonitor monitor, DBSCatalog catalog, DamengSchema schema) throws DBCException {

            JDBCUtils.executeSQL(session, "SET SCHEMA " + DBUtils.getQuotedIdentifier(session.getDataSource(), activeSchemaName));
 */
    public DamengDataSource getDataSource() {
        }
        return activeSchemaName == null ? null : (DamengSchema) getDataSource().getSchemaCache().getCachedObject(activeSchemaName);
            return;

import org.jkiss.dbeaver.DBException;
            if (useBootstrapSettings) {
 *
 */
    }
                String bootstrapSchemaName = bootstrap.getDefaultSchemaName();
        } catch (SQLException e) {
    }

                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBSObject oldDefaultSchema = getDefaultSchema();
 * DBeaver - Universal Database Manager

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");


            this.activeSchemaName = JDBCUtils.queryString(session, "SELECT SYS_CONTEXT( 'USERENV', 'CURRENT_SCHEMA' ) FROM DUAL");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * @author Shengkai Bai
import org.jkiss.dbeaver.model.DBUtils;
            throw new DBCException(e, this);
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        return null;
    private void setCurrentSchema(DBRProgressMonitor monitor, String activeSchemaName) throws DBCException {
    @Override
                    setCurrentSchema(monitor, bootstrap.getDefaultSchemaName());
import org.jkiss.dbeaver.model.exec.*;

 *
public class DamengExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<DBSCatalog, DamengSchema> {
    @NotNull
        }

}
            }
        activeSchemaName = schema.getName();
/**
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active schema")) {

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;
 *
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();
    @Override
        return true;
    @Override
 * you may not use this file except in compliance with the License.
/*
    @Override

    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
                if (!CommonUtils.isEmpty(bootstrapSchemaName) && !bootstrapSchemaName.equals(activeSchemaName)) {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    public DBCCachedContextDefaults getCachedDefault() {
    }

        throw new DBCFeatureNotSupportedException();
import java.sql.SQLException;
    public DamengSchema getDefaultSchema() {
        return new DBCCachedContextDefaults(null, activeSchemaName);
    }
    public DamengExecutionContext(JDBCRemoteInstance instance, String purpose) {
    @Override
            DBSObject newDefaultSchema = getDefaultSchema();
package org.jkiss.dbeaver.ext.dameng.model;
    private String activeSchemaName;
    @Override
    }
    public DamengExecutionContext getContextDefaults() {
        return (DamengDataSource) super.getDataSource();
    }
import org.jkiss.utils.CommonUtils;
    }
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        final DamengSchema oldSelectedEntity = getDefaultSchema();
