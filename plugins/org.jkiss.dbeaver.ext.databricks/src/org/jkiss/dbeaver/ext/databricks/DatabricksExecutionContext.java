        if (CommonUtils.isEmpty(activeCatalogName)) {
import org.jkiss.code.NotNull;

    }
    ) {
    private static final Log log = Log.getLog(DatabricksExecutionContext.class);
}
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            log.debug("Error setting default catalog for Databricks", e);
                }
        super(instance, purpose);
                        String currentCatalog = dbResult.getString(1);
            return super.getDefaultCatalog();
                                activeCatalogName = currentCatalog;
                try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT CURRENT_CATALOG()")) {
                    if (dbResult != null && dbResult.next()) {
            }
    @Override
                    }
 *
    @Override
        @NotNull DBRProgressMonitor monitor,
 * limitations under the License.
import java.sql.SQLException;
package org.jkiss.dbeaver.ext.databricks;
import org.jkiss.utils.CommonUtils;
    DatabricksExecutionContext(JDBCRemoteInstance instance, String purpose) {
        return isRefreshed;
                log.debug("Failed to get current catalog", e);
    }
        boolean isRefreshed = super.refreshDefaults(monitor, useBootstrapSettings);

 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.dbeaver.Log;
                        }

 *
    public void setDefaultCatalog(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

 *     http://www.apache.org/licenses/LICENSE-2.0
        try {
 * you may not use this file except in compliance with the License.
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * DBeaver - Universal Database Manager
                                isRefreshed = true;
            super.setDefaultCatalog(monitor, catalog, schema);
                        if (CommonUtils.isNotEmpty(currentCatalog)) {
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
        } catch (DBCException e) {
public class DatabricksExecutionContext extends GenericExecutionContext {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Query current catalog")) {
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                            }
 * Unless required by applicable law or agreed to in writing, software
    private String activeCatalogName;
        }


        @NotNull GenericCatalog catalog,
        @Nullable GenericSchema schema
            try (JDBCStatement dbStat = session.createStatement()) {
    public GenericCatalog getDefaultCatalog() {

import org.jkiss.dbeaver.ext.generic.model.GenericExecutionContext;
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.DBException;
    public boolean refreshDefaults(@NotNull DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            activeCatalogName = catalog.getName();
        }
/*
 *
        return getDataSource().getCatalog(activeCatalogName);
 * You may obtain a copy of the License at
 */
    }
                            if (!CommonUtils.equalObjects(currentCatalog, activeCatalogName)) {
    @Nullable
