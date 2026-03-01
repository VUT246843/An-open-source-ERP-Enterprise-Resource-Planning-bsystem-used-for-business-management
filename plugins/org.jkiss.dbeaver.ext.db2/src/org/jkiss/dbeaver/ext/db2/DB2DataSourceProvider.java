
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public long getFeatures()
            url.append(";traceLevel=")
    // Constructors
import org.jkiss.utils.CommonUtils;
            url.append(":traceDirectory=").append(CommonUtils.toString(properties.get(DB2Constants.PROP_TRACE_FOLDER)));
        return FEATURE_SCHEMAS;
    @NotNull
    }
                .append(CommonUtils.escapeFileName(CommonUtils.toString(properties.get(DB2Constants.PROP_TRACE_FILE))));

        boolean traceEnabled = CommonUtils.getBoolean(properties.get(DB2Constants.PROP_TRACE_ENABLED), false);
        }
        String ovrValue = connectionsProps.get(name);
        return new DB2DataSource(monitor, container);
 * See the License for the specific language governing permissions and
import java.util.HashMap;
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
    }
 *
        if (connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL) {
    @Override

    @Override
    }
        }

    {

        url.append("/");
        url.append("jdbc:db2://").append(connectionInfo.getHostName());
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
            url.append(";traceFile=")
            url.append(";");
    }
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
    // ------------
    }

        StringBuilder url = new StringBuilder(128);
 *
import org.jkiss.dbeaver.DBException;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
            url.append(":").append(connectionInfo.getHostPort());
/**
            url.append(connectionInfo.getDatabaseName());
}
    @NotNull
    public static Map<String, String> getConnectionsProps()
 */
 * DBeaver - Universal Database Manager

    {
    public DB2DataSourceProvider()
    }
        return ovrValue != null ? ovrValue : super.getConnectionPropertyDefaultValue(name, value);
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.db2;

        if (traceEnabled) {
import org.jkiss.dbeaver.model.connection.DBPDriver;
    @Override
    {
                .append(CommonUtils.toInt(properties.get(DB2Constants.PROP_TRACE_LEVEL), DB2Constants.TRACE_ALL));

 * limitations under the License.
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
        }
    // ------------
        if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
            url.append(";traceFileAppend=").append(CommonUtils.getBoolean(properties.get(DB2Constants.PROP_TRACE_APPEND), false));
        throws DBException
    {
    private static Map<String, String> connectionsProps = new HashMap<>();

        Map<String, String> properties = connectionInfo.getProviderProperties();
        return url.toString();
import java.util.Map;

            return connectionInfo.getUrl();
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
import org.jkiss.dbeaver.model.DBPDataSource;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
 * Unless required by applicable law or agreed to in writing, software
    protected String getConnectionPropertyDefaultValue(String name, String value)

 * DB2 DataSource provider ddd
        return connectionsProps;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
public class DB2DataSourceProvider extends JDBCDataSourceProvider {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
