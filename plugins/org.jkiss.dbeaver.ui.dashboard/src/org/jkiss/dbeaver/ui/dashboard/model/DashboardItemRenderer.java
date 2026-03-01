        @NotNull DashboardItemContainer dashboardItem,
import org.jkiss.dbeaver.model.dashboard.data.DashboardDataset;


    void moveDashboardView(

 * Licensed under the Apache License, Version 2.0 (the "License");
}
 *
/**
    void updateDashboardView(@NotNull DashboardViewItem dashboardItem);
import org.eclipse.swt.graphics.Point;
        @Nullable Date lastUpdateTime,
        @NotNull DashboardItemContainer container,
/*
 * DBeaver - Universal Database Manager

    void disposeDashboard(@NotNull DashboardItemContainer container);
        @NotNull DashboardDataset dataset);
    void updateDashboardData(

public interface DashboardItemRenderer {
 * Dashboard renderer
        @Nullable Date lastUpdateTime);
import org.jkiss.code.Nullable;
 */
     */
 */
        @NotNull DashboardItemContainer itemContainer,
 * See the License for the specific language governing permissions and

 *
import org.eclipse.jface.action.IContributionManager;
        @NotNull Composite chartComposite,
     * It may be DashboardChartComposite or DashboardBrowserComposite or some other implementation of DBDashboardControl
     * Returns composite with embedded dashboard.
 * Unless required by applicable law or agreed to in writing, software
 *
 * You may obtain a copy of the License at
    void fillDashboardToolbar(
        @NotNull DashboardViewItem toItem,
import java.util.Date;
        @NotNull DashboardViewItem fromItem,
        @NotNull Point preferredSize);

package org.jkiss.dbeaver.ui.dashboard.model;

 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull IContributionManager manager,

    void resetDashboardData(
import org.jkiss.dbeaver.ui.dashboard.control.DashboardViewItem;
        @NotNull Composite composite,
        @NotNull DashboardContainer viewContainer,

 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DashboardItemViewSettings dashboardConfig);
import org.eclipse.swt.widgets.Composite;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
import org.jkiss.code.NotNull;
        boolean clearOriginal);
        @NotNull DashboardItemContainer container,
    /**
    Composite createDashboard(
