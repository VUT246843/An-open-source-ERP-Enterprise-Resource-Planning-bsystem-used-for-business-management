        // Load dashboards from extensions

import org.jkiss.dbeaver.model.dashboard.DBDashboardProvider;
 * limitations under the License.
                    mapQueries.put(query.getId(), query);

 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * You may obtain a copy of the License at
        return DashboardConstants.DEF_DASHBOARD_PROVIDER;
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;

 * Unless required by applicable law or agreed to in writing, software
        return List.of();
        Map<String, DashboardMapQueryDescriptor> mapQueries = new LinkedHashMap<>();
import org.jkiss.dbeaver.model.dashboard.DBDashboardContext;
    @NotNull
        @NotNull DashboardProviderDescriptor provider,
    public List<DBDashboardFolder> loadRootFolders(
 * Database dashboard context
                if (dashboard.isSupportedByLocalSystem()) {
            }
import java.util.ArrayList;
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.Platform;

        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
/**
    @Override

    ) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if ("mapQuery".equals(ext.getName())) {
        // Load map queries
 *
        IExtensionRegistry registry = Platform.getExtensionRegistry();
            if ("dashboard".equals(ext.getName())) {
    public List<DashboardItemConfiguration> loadStaticDashboards(@NotNull DashboardProviderDescriptor dp) {
        List<DashboardItemConfiguration> dashboards = new ArrayList<>();
                }
        @NotNull DBRProgressMonitor monitor,

                }
 */
                DashboardItemConfiguration dashboard = new DashboardItemConfiguration(dp, mapQueries::get, ext);

    @NotNull
    public boolean appliesTo(@NotNull DBPDataSourceContainer dataSource) {
    public String getId() {
import java.util.Map;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    dashboards.add(dashboard);
import org.jkiss.code.NotNull;

        return dashboards;
    @Override
    }
                DashboardMapQueryDescriptor query = new DashboardMapQueryDescriptor(ext);
        @NotNull DBDashboardContext context
import org.jkiss.dbeaver.model.dashboard.DBDashboardFolder;
import org.eclipse.core.runtime.IConfigurationElement;
        for (IConfigurationElement ext : extElements) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import java.util.List;
        }
import org.jkiss.utils.CommonUtils;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
        for (IConfigurationElement ext : extElements) {
package org.jkiss.dbeaver.model.dashboard.registry;
import java.util.LinkedHashMap;
 * you may not use this file except in compliance with the License.
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DashboardItemConfiguration.EXTENSION_ID);
    }
                if (!CommonUtils.isEmpty(query.getId()) && !CommonUtils.isEmpty(query.getQueryText())) {
 */
import org.eclipse.core.runtime.IExtensionRegistry;
 *
    @Override

public class DatabaseDashboardProvider implements DBDashboardProvider {
            }
 *
/*
    @Override
