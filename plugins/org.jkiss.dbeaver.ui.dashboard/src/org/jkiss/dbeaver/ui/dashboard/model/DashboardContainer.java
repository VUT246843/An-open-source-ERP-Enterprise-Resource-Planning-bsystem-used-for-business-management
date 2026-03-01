
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others

    @NotNull
    IWorkbenchPart getWorkbenchPart();

 */
package org.jkiss.dbeaver.ui.dashboard.model;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

import org.eclipse.ui.IWorkbenchSite;
}
 *
    void saveChanges();
import org.jkiss.code.Nullable;
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
    void hideChartCatalog();
import java.util.List;
    DBCExecutionContext getExecutionContext();
    IWorkbenchSite getWorkbenchSite();

import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,


 * you may not use this file except in compliance with the License.
 * Dashboard view container
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
import org.eclipse.ui.IWorkbenchPart;
 */

/*
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
public interface DashboardContainer extends DBPDataSourceContainerProvider {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    DashboardConfiguration getViewConfiguration();
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
    List<? extends DashboardGroupContainer> getGroups();
    void showChartCatalog();


 *
    DashboardConfigurationList getConfiguration();

    void updateSelection();
    boolean isSingleChartMode();

 * limitations under the License.
