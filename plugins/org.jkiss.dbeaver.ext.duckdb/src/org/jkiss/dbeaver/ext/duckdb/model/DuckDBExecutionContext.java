import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.utils.CommonUtils;

        } catch (DBCException e) {

        return changed;
        }
        }
import org.jkiss.dbeaver.model.exec.DBCCachedContextDefaults;
            log.warn("Error initializing defaults from context", e);
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    public boolean refreshDefaults(@NotNull DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
            JDBCUtils.executeSQL(session, "USE " + newCatalogName);

        }
        }
            super.initDefaultsFrom(monitor, context);
 *
 */
    @Override
 * DBeaver - Universal Database Manager
        try {
import org.jkiss.code.NotNull;
    public GenericCatalog getDefaultCatalog() {
        if (supportsCatalogChange() && CommonUtils.isEmpty(activeCatalogName)) {
        String newCatalogName = catalog.getName();
            activeCatalogName = newCatalogName;
    public boolean supportsCatalogChange() {

        super(instance, purpose);
        }

        if (context instanceof DuckDBExecutionContext duckDBContext) {
import org.jkiss.dbeaver.model.exec.DBCException;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            String bootstrapCatalogName = bootstrap.getDefaultCatalogName();
                String currentCatalog = JDBCUtils.queryString(session, "SELECT current_catalog()");

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
    @Override


 * See the License for the specific language governing permissions and
public class DuckDBExecutionContext extends GenericExecutionContext {
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;
 *
import org.jkiss.dbeaver.ext.generic.model.GenericExecutionContext;
                if (!CommonUtils.isEmpty(currentCatalog) && !currentCatalog.equals(activeCatalogName)) {
            DBPConnectionBootstrap bootstrap = getBootstrapSettings();
 *
                log.warn("Error setting active catalog", ex);
    public DuckDBExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setDefaultCatalog(@NotNull DBRProgressMonitor monitor, @NotNull GenericCatalog catalog, @Nullable GenericSchema schema) throws DBCException {

 * Licensed under the Apache License, Version 2.0 (the "License");
                throw new DBException("Failed to set active catalog to " + newCatalogName, e);
        return activeCatalogName == null ? null : getDataSource().getCatalog(activeCatalogName);
import org.slf4j.Logger;
                    activeCatalogName = currentCatalog;
    @NotNull
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
                    changed = true;
            this.activeCatalogName = duckDBContext.activeCatalogName;
 * limitations under the License.
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active catalog")) {
            try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query active catalog")) {
/*
    @Override
        return new DBCCachedContextDefaults(activeCatalogName, getDefaultSchemaCached());
    @Override
            return;
            try {
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
    public DBCCachedContextDefaults getCachedDefault() {
            } catch (DBException ex) {
    private static final Logger log = LoggerFactory.getLogger(DuckDBExecutionContext.class);
        if (CommonUtils.equalObjects(activeCatalogName, newCatalogName)) {
        if (catalog == null) {
 * You may obtain a copy of the License at

    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }




import org.jkiss.dbeaver.DBException;
                activeCatalogName = bootstrapCatalogName;
    }
        } catch (Exception e) {
            } catch (Exception e) {

        super.setDefaultCatalog(monitor, catalog, schema);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;

 * you may not use this file except in compliance with the License.
            if (!CommonUtils.isEmpty(bootstrapCatalogName) && !bootstrapCatalogName.equals(activeCatalogName)) {

        }
            }
                }
}        return true;
import org.slf4j.LoggerFactory;
    }
package org.jkiss.dbeaver.ext.duckdb.model;
    }
        boolean changed = super.refreshDefaults(monitor, useBootstrapSettings);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                log.warn("Error while setting active catalog", e);
        if (useBootstrapSettings) {
                changed = true;

    private String activeCatalogName;
    }
    public void initDefaultsFrom(@NotNull DBRProgressMonitor monitor, @NotNull GenericExecutionContext context) {
    }
