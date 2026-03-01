 * Database dashboard context

 * you may not use this file except in compliance with the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.dashboard.DBDashboardProvider;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class WebDashboardProvider implements DBDashboardProvider {
    @NotNull
package org.jkiss.dbeaver.model.dashboard.registry;
        @NotNull DBRProgressMonitor monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
        List<DashboardItemConfiguration> dashboards = new ArrayList<>();
import org.jkiss.dbeaver.model.dashboard.DBDashboardFolder;
 *
    }

    public boolean appliesTo(@NotNull DBPDataSourceContainer dataSource) {
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
/**
 */
    ) {
        return true;

    @NotNull
import org.jkiss.code.NotNull;
 */
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * You may obtain a copy of the License at
    public String getId() {
        return List.of();
 * See the License for the specific language governing permissions and
    @Override
import java.util.ArrayList;

        return dashboards;
        @NotNull DashboardProviderDescriptor provider,
        return DashboardConstants.DEF_DASHBOARD_PROVIDER;
import java.util.List;
 *
import org.jkiss.dbeaver.model.dashboard.DBDashboardContext;
/*

    }
    @Override
 *
 * Unless required by applicable law or agreed to in writing, software

    public List<DashboardItemConfiguration> loadStaticDashboards(@NotNull DashboardProviderDescriptor dp) {

        @NotNull DBDashboardContext context
    public List<DBDashboardFolder> loadRootFolders(
    }
    @Override
    @Override
}
