import java.util.List;
 *
        @NotNull DBDashboardContext context);
    String getId();

        @NotNull DBRProgressMonitor monitor,
/**
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
 * DBeaver - Universal Database Manager


 *
    List<DBDashboardFolder> loadRootFolders(
    boolean appliesTo(@NotNull DBPDataSourceContainer dataSource);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBDashboardProvider {
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * you may not use this file except in compliance with the License.
    List<DashboardItemConfiguration> loadStaticDashboards(@NotNull DashboardProviderDescriptor dp);
 */
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
 * Dashboard provider

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 *
    @NotNull
    @NotNull

 * You may obtain a copy of the License at


package org.jkiss.dbeaver.model.dashboard;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.jkiss.dbeaver.model.dashboard.registry.DashboardProviderDescriptor;
        @NotNull DashboardProviderDescriptor provider,

