            }
package org.jkiss.dbeaver.ext.gaussdb;
        return false;
        if (authModel instanceof DBPDataSourceURLProvider) {
        return new GaussDBDataSource(monitor, container);
        url.append("/");
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            String connectionURL = ((DBPDataSourceURLProvider) authModel).getConnectionURL(driver, connectionInfo);
    }
            return DatabaseURL.generateUrlByTemplate(driver, connectionInfo);
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
        if (connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL) {
    }
    public long getFeatures() {
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;

        if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {

}

import java.util.Map;
 *

 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
        StringBuilder url = new StringBuilder();
        }
        }
        }

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private static Map<String, String> connectionsProps;
    @Override
        return url.toString();
import org.jkiss.dbeaver.model.connection.DBPDriver;
 *
            url.append(":").append(connectionInfo.getHostPort());
 * You may obtain a copy of the License at
        }
 * Unless required by applicable law or agreed to in writing, software
        url.append("jdbc:postgresql://");
    public static Map<String, String> getConnectionsProps() {

            PrefUtils.setDefaultPreferenceValue(preferenceStore, PostgreConstants.PROP_DD_PLAIN_STRING, false);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DatabaseURL;
        url.append(connectionInfo.getHostName());
    }
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
        }
        DBAAuthModel<DBAAuthCredentials> authModel = connectionInfo.getAuthModel();
        }
    @NotNull
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.DBException;
        if (preferenceStore != null) {

    }
    static {
public class GaussDBDataSourceProvider extends JDBCDataSourceProvider {
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

            return connectionInfo.getUrl();
    }

import org.jkiss.dbeaver.model.access.DBAAuthModel;
            if (CommonUtils.isNotEmpty(connectionURL)) {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSourceURLProvider;
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return connectionsProps;
    @Override
                return connectionURL;
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
 */
    @Override
    @NotNull
import java.util.HashMap;
        if (serverType.supportsCustomConnectionURL()) {
    }
    public boolean providesDriverClasses() {
import org.jkiss.code.NotNull;
        PostgreServerType serverType = PostgreUtils.getServerType(driver);
 *

            url.append(connectionInfo.getDatabaseName());

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDataSource;
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {

            PrefUtils.setDefaultPreferenceValue(preferenceStore, PostgreConstants.PROP_DD_TAG_STRING, false);
        connectionsProps = new HashMap<>();

        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();

