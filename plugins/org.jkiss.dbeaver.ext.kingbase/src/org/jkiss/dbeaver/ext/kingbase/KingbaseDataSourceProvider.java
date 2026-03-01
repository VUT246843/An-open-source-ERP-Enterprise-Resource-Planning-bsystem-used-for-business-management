import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
    }
            return connectionInfo.getUrl();
import org.jkiss.dbeaver.runtime.DBWorkbench;
 */
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
 * Unless required by applicable law or agreed to in writing, software

/*
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    @Override
 * See the License for the specific language governing permissions and
 *

import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            String connectionURL = ((DBPDataSourceURLProvider) authModel).getConnectionURL(driver, connectionInfo);
    }
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (preferenceStore != null) {
        url.append(connectionInfo.getHostName());
    static {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL) {
        return new KingbaseDataSource(monitor, container);
import org.jkiss.dbeaver.model.DBPDataSourceURLProvider;
    @Override
        url.append("jdbc:kingbase8://");
package org.jkiss.dbeaver.ext.kingbase;
            url.append(connectionInfo.getDatabaseName());
 * DBeaver - Universal Database Manager
        StringBuilder url = new StringBuilder();
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.HashMap;
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
        }
 *
    @NotNull
            if (CommonUtils.isNotEmpty(connectionURL)) {

    private static Map<String, String> connectionsProps;


            PrefUtils.setDefaultPreferenceValue(preferenceStore, PostgreConstants.PROP_DD_PLAIN_STRING, false);

import org.jkiss.utils.CommonUtils;

 *
        }


        if (serverType.supportsCustomConnectionURL()) {

import java.util.Map;
}
            url.append(":").append(connectionInfo.getHostPort());
 * distributed under the License is distributed on an "AS IS" BASIS,
        url.append("/");

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
 * limitations under the License.
import org.jkiss.code.NotNull;
        DBAAuthModel authModel = connectionInfo.getAuthModel();
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
        return url.toString();
        return false;
    public boolean providesDriverClasses() {
 * you may not use this file except in compliance with the License.
        }
    }
import org.jkiss.dbeaver.DBException;
    public static Map<String, String> getConnectionsProps() {
 * You may obtain a copy of the License at
            }
        if (authModel instanceof DBPDataSourceURLProvider) {
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @NotNull
    
    @Override
        }
        }
import org.jkiss.dbeaver.model.DatabaseURL;
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseDataSource;
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
 * Licensed under the Apache License, Version 2.0 (the "License");
public class KingbaseDataSourceProvider extends JDBCDataSourceProvider {
    public long getFeatures() {
    }
            return DatabaseURL.generateUrlByTemplate(driver, connectionInfo);
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
                return connectionURL;
        connectionsProps = new HashMap<>();
        PostgreServerType serverType = PostgreUtils.getServerType(driver);
        return connectionsProps;
        if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
            PrefUtils.setDefaultPreferenceValue(preferenceStore, PostgreConstants.PROP_DD_TAG_STRING, false);
import org.jkiss.dbeaver.model.access.DBAAuthModel;
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
        }
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
