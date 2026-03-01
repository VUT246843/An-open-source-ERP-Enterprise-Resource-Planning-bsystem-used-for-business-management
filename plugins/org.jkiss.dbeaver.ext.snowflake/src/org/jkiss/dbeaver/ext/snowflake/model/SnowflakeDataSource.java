import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;
    public SnowflakeDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, SnowflakeMetaModel metaModel)
        String authProp = connectionInfo.getProviderProperty(SnowflakeConstants.PROP_AUTHENTICATOR_LEGACY);
    }
        @NotNull DBPDriver driver,
        // Newer versions use auth model
 * you may not use this file except in compliance with the License.
        @NotNull DBPConnectionConfiguration connectionInfo
        @NotNull SnowflakeMetaModel metaModel,
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
    protected Map<String, String> getInternalConnectionProperties(
    ) throws DBException {
}
        @NotNull DBRProgressMonitor monitor,
    protected void initializeContextState(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext context,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        }
 */
    ) {
        @NotNull JDBCExecutionContext context,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
            executionContext.refreshDefaults(monitor, true);
        String purpose,
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        @NotNull SnowflakeSQLDialect dialect
import java.util.HashMap;
        if (!CommonUtils.isEmpty(authProp)) {
import org.jkiss.dbeaver.model.DBUtils;
        DBPConnectionConfiguration connectionInfo
    @Override
import java.util.Map;
    @Override
        super(monitor, container, metaModel, dialect);
 *
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
                                          @Nullable JDBCExecutionContext initFrom) throws DBException {

        JDBCExecutionContext context,
        SnowflakeExecutionContext executionMetaContext = (SnowflakeExecutionContext) initFrom;
    }

    private static final String APPLICATION_PROPERTY = "application";
        // Backward compatibility - use legacy provider property
    }
        super(monitor, container, metaModel, new SnowflakeSQLDialect());
    @NotNull
        if (initFrom == null) {
            return;

            props.put("authenticator", authProp);
            executionContext.setDefaultSchema(monitor, defaultSchema, true);

    protected Properties getAllConnectionProperties(
    }
        props.put(APPLICATION_PROPERTY, appName);
/*
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
        SnowflakeExecutionContext executionContext = (SnowflakeExecutionContext) context;
        final String clientAppName = DBUtils.getClientApplicationName(container, context, null, false);
        Map<String, String> props = new HashMap<>();
 *

        Properties props = super.getAllConnectionProperties(monitor, context, purpose, connectionInfo);

package org.jkiss.dbeaver.ext.snowflake.model;
 * You may obtain a copy of the License at
        final String appName = "DBeaver_" + clientAppName.replace(" ", "");
    }
        @NotNull DBRProgressMonitor monitor,
        return props;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.exec.DBCException;
        throws DBException


        GenericSchema defaultSchema = executionMetaContext.getDefaultSchema();
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.connection.DBPDriver;
        }
import org.jkiss.code.NotNull;
 *

        GenericCatalog defaultCatalog = executionMetaContext.getDefaultCatalog();
        }
            executionContext.setDefaultCatalog(monitor, defaultCatalog, defaultSchema, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    
    public SnowflakeDataSource(
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        @NotNull String purpose,
        return props;
import java.util.Properties;
    ) throws DBCException {
    protected boolean isPopulateClientAppName() {
    @Override
import org.jkiss.utils.CommonUtils;
    @NotNull
        return false;
import org.jkiss.dbeaver.DBException;
public class SnowflakeDataSource extends GenericDataSource {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return new SnowflakeExecutionContext(instance, type);
 * Unless required by applicable law or agreed to in writing, software
        if (defaultCatalog != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else if (defaultSchema != null) {

 * DBeaver - Universal Database Manager
    @Override
        @NotNull DBPDataSourceContainer container,
