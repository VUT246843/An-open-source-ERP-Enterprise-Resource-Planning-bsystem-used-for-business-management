                    }
            } else {
        int schemaIndex = newSearchPath.indexOf(defSchemaName);
                }
            }
            try (JDBCPreparedStatement stat = session.prepareStatement("SELECT current_schema(),session_user")) {
        }
        return (PostgreDatabase) getOwnerInstance();
                }


    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.code.Nullable;
                this.searchPath.add(PostgreConstants.PUBLIC_SCHEMA_NAME);
    private final List<String> searchPath = new ArrayList<>();
            return;
        }
                    disconnect();
        List<String> newSearchPath = new ArrayList<>(searchPath);
    public PostgreExecutionContext(@NotNull PostgreDatabase database, String purpose) {
            throw new DBCException("Error setting search path", e, this);
        return true;
 * PostgreExecutionContext
    private String activeUser;


    }
        } catch (SQLException e) {

            DBExecUtils.tryExecuteRecover(session, session.getDataSource(), param -> {
                    throw new InvocationTargetException(e);
        searchPath.add(path);
import java.sql.SQLException;
        if (reflect) {
        } catch (SQLException e) {
 *
        return activeUser;
        return true;
        return getDefaultCatalog().getSchema(activeSchemaId);
    public PostgreExecutionContext getContextDefaults() {
                // Remove from previous position
                newSearchPath.addFirst(defSchemaName);
            }
    //Get value from cached, used in getCachedDefault()
                        }
package org.jkiss.dbeaver.ext.postgresql.model;
                        String activeSchemaName = JDBCUtils.safeGetString(rs, 1);
            return false;
    @Override
    private void addSearchPath(String path) {
                try (JDBCResultSet rs = stat.executeQuery()) {
    }
        setDefaultCatalog(monitor, catalog, schema, false);
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        return true;

        searchPath.clear();
    }
            this.searchPath.clear();
        }
                }

            if (!spString.isEmpty()) spString.append(",");
                String sql = "SET ROLE " + getDataSource().getSQLDialect().getQuotedIdentifier(roleName, false, true);
/**
                        activeUser = JDBCUtils.safeGetString(rs, 2);
    @Override
            setSearchPath(monitor, schema.getName());
import java.lang.reflect.InvocationTargetException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            if (useBootstrapSettings) {
        if (Objects.equals(newSearchPath, searchPath)) {
                // Change it only for isolated editor contexts
    public boolean supportsCatalogChange() {

 *
    private void setSessionRole(@NotNull DBRProgressMonitor monitor) throws DBCException {
        }
    @Override
    public boolean supportsSchemaChange() {
    }
        }
            return;
    //Get value from cached, used in getCachedDefault()
            }
    boolean changeDefaultSchema(DBRProgressMonitor monitor, PostgreSchema schema, boolean reflect, boolean force) throws DBCException {
        return true;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
                for (String str : searchPathStr.split(",")) {
                        if (!CommonUtils.isEmpty(activeSchemaName)) {
            return false;
            });
        // Check default active schema
                            final PostgreSchema activeSchema = getDefaultCatalog().getSchema(monitor, activeSchemaName);
        try {
                    if (bsSchema != null) {

        if (!schema.isSystem() && !schema.isPublicSchema()) {
            throw new DBCException(e, this);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return new DBCCachedContextDefaults(getOwnerInstance().getName(), schemaName);
    public PostgreSchema getDefaultSchema() {
    }
    }
        if (!path.contains(activeUser)) {
/*
    public List<String> getSearchPath() {
    private void setSearchPath(@NotNull DBRProgressMonitor monitor, String defSchemaName) throws DBCException {
import java.util.ArrayList;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                    String spSchema = DBUtils.getUnQuotedIdentifier(getDataSource(), str);
                    PostgreSchema bsSchema = getDefaultCatalog().getSchema(monitor, bsSchemaName);

        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active role")) {
    }
                    newContext.changeDefaultSchema(monitor, schema, true, force);
            searchPath.add(activeUser);
            }
        super(database, purpose);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        } catch (DBException e) {
            String searchPathStr = JDBCUtils.queryString(session, "SHOW search_path");
 */
public class PostgreExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<PostgreDatabase, PostgreSchema> {
                dbStat.executeUpdate(sql);
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Read context defaults")) {
    }
        return this;

        this.activeSchemaId = 0;

        if (activeSchemaId == schema.getObjectId() && !force) {

    @Override
        }
            throw new DBCException(e, this);
        if (CommonUtils.isEmpty(roleName)) {

    private boolean isolatedContext;
            throw new DBCException("Error changing default database", e);
 * See the License for the specific language governing permissions and
                                activeSchemaId = activeSchema.getObjectId();
import org.jkiss.dbeaver.model.struct.DBSObject;
            try (JDBCStatement dbStat = session.createStatement()) {
    @NotNull
    }

                    // This may happen
        }
                if (!CommonUtils.isEmpty(bsSchemaName)) {
    public DBCCachedContextDefaults getCachedDefault() {
                    getDataSource().setActiveDatabase(catalog, this);
    public PostgreDatabase getDefaultCatalog() {
                if (isolatedContext) {
            catalog.checkInstanceConnection(monitor);
                } catch (SQLException e) {
    }
import org.jkiss.dbeaver.DBException;

                            break;
            throws DBCException {
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
    private long activeSchemaId;
                DBPConnectionBootstrap bootstrap = getBootstrapSettings();
            spString.append(DBUtils.getQuotedIdentifier(getDataSource(), sp));
        return searchPath;
                            getDefaultCatalog().getSchemas(monitor);
                    }
            }

        for (String sp : newSearchPath) {
    }
 *
            if (catalogChanged || schemaChanged) {
                String bsSchemaName = bootstrap.getDefaultSchemaName();
    }
                        if (activeSchema != null) {
                }
    public PostgreDataSource getDataSource() {
                    PostgreExecutionContext newContext = (PostgreExecutionContext) newInstance.getDefaultContext(false);
 *     http://www.apache.org/licenses/LICENSE-2.0
                        activeSchemaId = bsSchema.getObjectId();
        } catch (DBException e) {
import org.jkiss.utils.CommonUtils;
            }
                } else {
        }
        }
        this.isolatedContext = isolatedContext;
    }
                    str = str.trim();
            if (searchPathStr != null) {

    }
                try {
    public void setDefaultCatalog(DBRProgressMonitor monitor, PostgreDatabase catalog, PostgreSchema schema) throws DBCException {
    public void setIsolatedContext(boolean isolatedContext) {

                catalogChanged = true;
        String schemaName = (getDefaultSchema() != null) ? getDefaultSchema().getName() : null;
    }
        {
                // Changing catalog means reconnect
                }
import java.util.Objects;
                    if (!searchPath.contains(spSchema)) {
                }
    @NotNull
            if (schemaIndex < 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
    @Override
                } else {
                    setSearchPath(monitor, bsSchemaName);


    @Nullable
    @NotNull
            DBUtils.fireObjectSelectionChange(oldActiveSchema, schema, this);
                            }
            if (schema != null) {
    @Override
            addSearchPath(schema.getName());
                    }

        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Change search path")) {
 * you may not use this file except in compliance with the License.

                    }
                    connect(monitor, null, null, null, false);
        }
import org.jkiss.dbeaver.model.exec.*;
    public void setDefaultSchema(DBRProgressMonitor monitor, PostgreSchema schema) throws DBCException {
    }

                if (activeSchemaId == 0) {
        final PostgreSchema oldActiveSchema = getDefaultSchema();
            boolean catalogChanged = false, schemaChanged = false;
    public String getActiveUser() {
        setSessionRole(monitor);
 * DBeaver - Universal Database Manager
                        }
                        final PostgreSchema activeSchema = getDefaultCatalog().getSchema(monitor, schemaName);
                    JDBCUtils.executeSQL(session, "SET search_path = " + spString);
                    // Catalog has been changed. Get the new one and change schema there
                    PostgreDatabase newInstance = getDataSource().getDefaultInstance();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                            if (activeSchema != null) {
                    schemaChanged = changeDefaultSchema(monitor, schema, true, force);
        final String roleName = getDataSource().getContainer().getConnectionConfiguration().getProviderProperty(PostgreConstants.PROP_CHOSEN_ROLE);
    }
                            activeSchemaId = activeSchema.getObjectId();
        //Method get cashed value
            if (oldInstance != catalog) {
                    setOwnerInstance(catalog);
            }
import java.util.List;
                }
 */
        }
    void setDefaultCatalog(@NotNull DBRProgressMonitor monitor, @NotNull PostgreDatabase catalog, @Nullable PostgreSchema schema, boolean force)
import org.jkiss.dbeaver.model.DBUtils;
                    if (rs.nextRow()) {
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        StringBuilder spString = new StringBuilder();

    }
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
                    for (String schemaName : searchPath) {
                DBUtils.fireObjectSelectionChange(oldInstance, catalog, this);
        return (PostgreDataSource) super.getDataSource();
                            // Pre-cache schemas, we need them anyway
    @Override
                if (catalogChanged && !isolatedContext) {
        if (schema.isExternal() || schema.isSystem()) {
    public boolean refreshDefaults(DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
        this.activeSchemaId = schema.getObjectId();
        }
                        this.searchPath.add(spSchema);
    @Override
        setDefaultCatalog(monitor, schema.getDatabase(), schema, false);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            DBSObject oldInstance = getOwnerInstance();

}
