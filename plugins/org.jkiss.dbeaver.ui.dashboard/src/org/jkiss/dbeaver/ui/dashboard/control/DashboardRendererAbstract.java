            DashboardUIConstants.CMD_REFRESH_CHART,
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        @NotNull DashboardItemViewSettings dashboardConfig
                @Override
 *
import org.jkiss.dbeaver.ui.DBeaverIcons;
                        DashboardUIConstants.CMD_REMOVE_DASHBOARD,
 * You may obtain a copy of the License at
                    refreshChart(itemContainer, chartComposite, dashboardConfig);
            manager.add(new Action("Settings", DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION)) {
 * DBeaver - Universal Database Manager
    public void fillDashboardToolbar(
        @NotNull DashboardItemContainer itemContainer,
                @Override
    }
                    dialog.open();
import org.jkiss.dbeaver.ui.dashboard.navigator.HandlerDashboardViewItem;

        @NotNull IContributionManager manager,
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                @Override

import org.jkiss.dbeaver.ui.ActionUtils;
import org.eclipse.jface.action.Action;
        ActionUtils.runCommand(
import org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants;
        if (!UIUtils.isInDialog(chartComposite)) {
import org.jkiss.dbeaver.ui.UIUtils;

            manager.add(new Action("View in popup", DBeaverIcons.getImageDescriptor(UIIcon.FIT_WINDOW)) {
                @Override
            manager.add(new Action("Close", DBeaverIcons.getImageDescriptor(UIIcon.CLOSE)) {
import org.eclipse.jface.action.Separator;
                    DashboardItemViewSettingsDialog dialog = new DashboardItemViewSettingsDialog(
        itemContainer.getGroup().selectItem(itemContainer);
    ) {
            });

            manager.add(new Separator());
}
/*
            manager.add(new Action("Refresh chart", DBeaverIcons.getImageDescriptor(UIIcon.REFRESH)) {
                        itemContainer.getGroup().getView().getWorkbenchSite());
import org.eclipse.swt.widgets.Composite;
            });
                    ActionUtils.runCommand(
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemViewSettings;
            itemContainer.getGroup().getView().getWorkbenchSite());
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
 * limitations under the License.
                }
import org.eclipse.jface.action.IContributionManager;

                public void run() {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.dashboard.control;
 */
public abstract class DashboardRendererAbstract implements DashboardItemRenderer {
                }
            manager.add(new Separator());
                }
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemViewSettingsDialog;
 * distributed under the License is distributed on an "AS IS" BASIS,
                public void run() {
                public void run() {
        }
/**
                    itemContainer.getGroup().selectItem(itemContainer);
                        UIUtils.getActiveShell(), itemContainer, itemContainer.getItemConfiguration().getViewConfiguration());
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemRenderer;
        @NotNull Composite chartComposite,
                    HandlerDashboardViewItem.openDashboardViewDialog(itemContainer);
            });
                public void run() {
import org.jkiss.code.NotNull;
 *
 * Abstract chart dashboard renderer
    }
            });
 */
    protected void refreshChart(DashboardItemContainer itemContainer, Composite chartComposite, DashboardItemViewSettings dashboardConfig){
 * See the License for the specific language governing permissions and
