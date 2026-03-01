import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        return connectionURL;
    @Override
import org.jkiss.code.NotNull;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected String getConnectionURL(DBPConnectionConfiguration connectionInfo) {
        @NotNull DBRProgressMonitor monitor,
 * DBeaver - Universal Database Manager
 *
    }
        Map<String, String> props = new LinkedHashMap<>();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (connectionInfo.getUserName() != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public BigQueryDataSource(
 * See the License for the specific language governing permissions and
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
    public String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {
 * you may not use this file except in compliance with the License.
    }
    protected boolean isSessionModeEnabled() {
        }
            (connectionURL.contains("OAuthPvtKeyPath={server};") || connectionURL.contains("OAuthServiceAcctEmail=;"))
        return new BigQueryExecutionContext(instance, type);

    }
            return DBPDataKind.STRUCT;
                return super.getDefaultDataTypeName(dataKind);

import java.util.LinkedHashMap;

/*
}
        @NotNull GenericMetaModel metaModel
    ) throws DBException {

import org.jkiss.dbeaver.DBException;
        return super.resolveDataKind(typeName, valueType);
 * Unless required by applicable law or agreed to in writing, software
                return "STRING";
        if (CommonUtils.isNotEmpty(additionalProjects)) {
    @NotNull
            // Backward compatibility. We do not want to use this incorrect pattern as a URL. Better to create a new URL.
            DBPDriver driver = getContainer().getDriver();
        @NotNull DBPDataSourceContainer container,
import org.jkiss.dbeaver.model.DBPDataKind;
        @NotNull String purpose,
    }
        String additionalProjects = connectionInfo.getProviderProperty(BigQueryConstants.DRIVER_PROP_ADDITIONAL_PROJECTS);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    @Override
import java.util.Map;

        }
    }
    }
            props.put(BigQueryConstants.DRIVER_PROP_ADDITIONAL_PROJECTS, additionalProjects);
            props.put(BigQueryConstants.DRIVER_PROP_ACCOUNT, connectionInfo.getUserName());
 *
public class BigQueryDataSource extends GenericDataSource {
import org.jkiss.utils.CommonUtils;
            case STRING:
        }

        } else {
        if (typeName.equals(BigQueryConstants.DATA_TYPE_STRUCT)) {

        String connectionURL = super.getConnectionURL(connectionInfo);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected Map<String, String> getInternalConnectionProperties(
    }
import org.jkiss.dbeaver.model.connection.DBPDriver;
        if (CommonUtils.isNotEmpty(connectionURL) &&
import org.jkiss.dbeaver.model.exec.DBCException;
        ) {
        @NotNull DBPConnectionConfiguration connectionInfo
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        return props;
        switch (dataKind) {
        return false;
        }
 * You may obtain a copy of the License at
        super(monitor, container, metaModel, new BigQuerySQLDialect());
        props.put(BigQueryConstants.DRIVER_PROP_PROJECT_ID, connectionInfo.getDatabaseName());
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBPDriver driver,

 * Copyright (C) 2010-2025 DBeaver Corp and others

            return driver.getDataSourceProvider().getConnectionURL(driver, connectionInfo);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;

    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) throws DBCException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
 * limitations under the License.
        }
 */
    ) throws DBCException {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull JDBCExecutionContext context,
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    @NotNull
            props.put(BigQueryConstants.DRIVER_PROP_ACCOUNT, "");
    @Override
            default:
package org.jkiss.dbeaver.ext.bigquery.model;
