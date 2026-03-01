                                DBPDataSourceContainer container,
        DBCExecutionContextDefaults contextDefaults = context.getContextDefaults();
import org.jkiss.dbeaver.model.exec.DBCException;
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
    }
    ) throws DBCException {
    }

    @NotNull

    protected String getConnectionURL(DBPConnectionConfiguration connectionInfo) {

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    }
}
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;

    }
    protected Properties getAllConnectionProperties(
    @Override
 */
            url = url.replaceFirst(DatabricksConstants.JDBC_LEGACY_URL_SUBPROTOCOL, "jdbc:databricks://");
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.utils.GeneralUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
        String purpose,
        if (initFromDefaults != null) {
    @Override
        super(monitor, container, metaModel, new DatabricksSQLDialect());
        return url;
        }
    public JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
 * See the License for the specific language governing permissions and
        if (contextDefaults == null) {
        return super.getAllConnectionProperties(monitor, context, purpose, connectionInfo);
import org.jkiss.dbeaver.Log;
    @Override
        }
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
            contextDefaults.refreshDefaults(monitor, true);
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Nullable JDBCExecutionContext initFrom
        if (initFrom == null) {
 * limitations under the License.
        @NotNull DBRProgressMonitor monitor,
        String url = super.getConnectionURL(connectionInfo);
import org.jkiss.utils.CommonUtils;
        @NotNull DBRProgressMonitor monitor,
                                                            DBException {

            }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (!isLegacyDriver() && url.startsWith(DatabricksConstants.JDBC_LEGACY_URL_SUBPROTOCOL)) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.jkiss.code.NotNull;
                contextDefaults.setDefaultCatalog(monitor, defaultCatalog, null);
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBCExecutionContextDefaults initFromDefaults = initFrom.getContextDefaults();
            log.debug("Detected a legacy connection URL in the Databricks native driver. Updating to the native URL.");
import org.jkiss.code.Nullable;

        return CommonUtils.equalObjects(DatabricksConstants.DRIVER_CLASS_LEGACY, getContainer().getDriver().getDriverClassName());
        String userAgent = GeneralUtils.getProductName().replace(" ", "+") + "/" + GeneralUtils.getProductVersion();
            return;


        return new DatabricksExecutionContext(instance, type);
            GenericCatalog defaultCatalog = (GenericCatalog) initFromDefaults.getDefaultCatalog();
        DBPConnectionConfiguration connectionInfo

    private static final Log log = Log.getLog(DatabricksDataSource.class);

 *
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;


    @Override
public class DatabricksDataSource extends GenericDataSource {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
                                GenericMetaModel metaModel) throws
            if (defaultCatalog != null && contextDefaults.supportsCatalogChange()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        @NotNull JDBCExecutionContext context,
package org.jkiss.dbeaver.ext.databricks;
    }
        JDBCExecutionContext context,
    protected void initializeContextState(
    public DatabricksDataSource(DBRProgressMonitor monitor,
 *
        }
    }
import java.util.Properties;
            return;
        connectionInfo.setProperty(DatabricksConstants.USER_AGENT_ENTRY, userAgent);
    public boolean isLegacyDriver() {
