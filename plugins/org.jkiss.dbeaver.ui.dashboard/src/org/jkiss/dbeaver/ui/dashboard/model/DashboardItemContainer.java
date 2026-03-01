 * DBeaver - Universal Database Manager

 *

        boolean singleChartMode);
    void disableAutoUpdate();

import org.eclipse.jface.action.IMenuManager;
    String[] getMapLabels();
    /**

 * Dashboard container
import org.jkiss.dbeaver.model.app.DBPProject;

    DBPProject getProject();
    JexlExpression getMapFormula();
     * Maximum age in ms
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.apache.commons.jexl3.JexlExpression;
/**
 *     http://www.apache.org/licenses/LICENSE-2.0


 */
    int getDashboardMaxItems();
    /**
import org.jkiss.dbeaver.model.dashboard.DBDashboardMapQuery;
 *
    long getUpdatePeriod();

    DashboardItemViewSettings getItemConfiguration();
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.dashboard.DBDashboardQuery;
import org.eclipse.swt.widgets.Control;
        @NotNull IMenuManager manager,
 * Unless required by applicable law or agreed to in writing, software
     * Dashboard update period in seconds



    DBPDataSourceContainer getDataSourceContainer();
package org.jkiss.dbeaver.ui.dashboard.model;

     * Maximum item counts
    /**
 * See the License for the specific language governing permissions and
     */
    void resetDashboardData();
import org.jkiss.code.NotNull;

    List<? extends DBDashboardQuery> getQueryList();

     */

    void refreshInfo();

    DashboardGroupContainer getGroup();
    void fillDashboardContextMenu(


import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
    Date getLastUpdateTime();
import java.util.Date;
     */
 */

import java.util.List;
/*

 * limitations under the License.
    long getDashboardMaxAge();
    void updateDashboardData(DashboardDataset dataset);


 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
public interface DashboardItemContainer {
    DashboardItemConfiguration getItemDescriptor();
import org.jkiss.dbeaver.model.dashboard.data.DashboardDataset;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    String[] getMapKeys();
    Control getDashboardControl();
    void updateDashboardView();

 * distributed under the License is distributed on an "AS IS" BASIS,

    DBDashboardMapQuery getMapQuery();
    boolean isAutoUpdateEnabled();
