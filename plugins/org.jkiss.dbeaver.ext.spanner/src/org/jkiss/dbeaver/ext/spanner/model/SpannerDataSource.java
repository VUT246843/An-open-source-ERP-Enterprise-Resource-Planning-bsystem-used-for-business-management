        if (CommonUtils.isEmpty(schemaName) &&  !CommonUtils.isEmpty(getSchemas())) {
                    return schema.getTable(monitor, tableName);
	        props.put(SpannerConstants.DRIVER_PROP_PROJECT_ID, connectionInfo.getServerName());
 * Unless required by applicable law or agreed to in writing, software
public class SpannerDataSource extends GenericDataSource {
}
import java.util.HashMap;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPDriver;

 * limitations under the License.
    }
            List<GenericSchema> nonSystemSchemas = getSchemas()

        return super.findTable(monitor, catalogName, schemaName, tableName);

    @Override
                .stream()
		return url;
            if (nonSystemSchemas.size() == 1) {
            // So use default schema as container for this case.
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.DBException;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,

        @NotNull String purpose,

    ) throws DBException {
        @Nullable String catalogName,
	        props.put(SpannerConstants.DRIVER_PROP_DATABASE_ID, connectionInfo.getDatabaseName());
        throws DBException
            }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                if (GenericConstants.DEFAULT_NULL_SCHEMA_NAME.equals(schema.getName())) {
    }
		}
	        props.put(SpannerConstants.DRIVER_PROP_INSTANCE_ID, connectionInfo.getHostName());
                GenericSchema schema = nonSystemSchemas.get(0);

 */
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.utils.CommonUtils;
 *
            // This is very strange case from Spanner. He supports one main empty name schema and system schemas.
        @NotNull DBPConnectionConfiguration connectionInfo
import org.jkiss.code.NotNull;
            props.put(SpannerConstants.DRIVER_PROP_CREDENTIALS_FILE, connectionInfo.getProviderProperty(SpannerConstants.DRIVER_PROP_PVTKEYPATH));
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
        @Nullable String schemaName,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and

    @Override
		if (url != null && url.startsWith("jdbc:cloudspanner:/projects/%s/instances/%s/databases/%s")) {
                .collect(Collectors.toList());
        super(monitor, container, metaModel, new SpannerSQLDialect());
			// Official driver.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		String url = super.getConnectionURL(connectionInfo);
        Map<String, String> props = new HashMap<>();
    }
/*
import java.util.Map;
 *
	}
import java.util.stream.Collectors;
 *     http://www.apache.org/licenses/LICENSE-2.0
                .filter(e -> !e.isSystem())
        return props;
    {
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        } else if (connectionInfo.getProviderProperty(SpannerConstants.DRIVER_PROP_PVTKEYPATH) != null) {
        @NotNull String tableName
			return String.format(url, connectionInfo.getServerName(), connectionInfo.getHostName(), connectionInfo.getDatabaseName());
    public GenericTableBase findTable(
package org.jkiss.dbeaver.ext.spanner.model;
 * You may obtain a copy of the License at
        @NotNull DBPDriver driver,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
import org.jkiss.code.Nullable;
        @NotNull JDBCExecutionContext context,
	protected String getConnectionURL(DBPConnectionConfiguration connectionInfo) {
    @Override
        if (driver.getId().equals(SpannerDataSourceProvider.COMMUNITY_DRIVER_ID)) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
	        props.put(SpannerConstants.DRIVER_PROP_PVTKEYPATH, connectionInfo.getProviderProperty(SpannerConstants.DRIVER_PROP_PVTKEYPATH));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
import org.jkiss.dbeaver.ext.spanner.SpannerDataSourceProvider;
import java.util.List;
import org.jkiss.dbeaver.model.exec.DBCException;
        }
    public SpannerDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, SpannerMetaModel metaModel)
                }
    ) throws DBCException {
    protected Map<String, String> getInternalConnectionProperties(
