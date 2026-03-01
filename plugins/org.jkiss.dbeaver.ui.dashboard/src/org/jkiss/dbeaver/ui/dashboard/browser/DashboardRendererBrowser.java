import org.eclipse.swt.SWT;
    public void updateDashboardData(@NotNull DashboardItemContainer container, @Nullable Date lastUpdateTime, @NotNull DashboardDataset dataset) {
    @Override
                    if (CommonUtils.isEmpty(url)) {
        @NotNull Composite chartComposite,

}
        return browserComposite;
import org.jkiss.dbeaver.ui.UIIcon;
    ) {
    @Override
        @NotNull IContributionManager manager,
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemViewSettings;

        // Do nothing
        // nothing special
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.dashboard.browser;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;

import org.jkiss.dbeaver.ui.dashboard.control.DashboardViewItem;
    }
                    }
    }
 *
                        return;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.jkiss.utils.CommonUtils;
                }
 * See the License for the specific language governing permissions and

import org.eclipse.swt.widgets.Composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return (DashboardBrowserComposite) container.getDashboardControl();
    @Override
import java.util.Date;
 */
/**
    public void moveDashboardView(@NotNull DashboardViewItem toItem, @NotNull DashboardViewItem fromItem, boolean clearOriginal) {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
/*

    }


import org.jkiss.dbeaver.ui.DBeaverIcons;



                    }
    }
    public void resetDashboardData(@NotNull DashboardItemContainer dashboardItem, Date lastUpdateTime) {
 * You may obtain a copy of the License at
            DashboardItemConfiguration dashboard = dashboardConfig.getItemConfiguration();
    @Override
 * limitations under the License.
    @Override
    }
            @Override
            }
                DashboardItemConfiguration dashboard = dashboardConfig.getItemConfiguration();
 *
                    String url = dashboard.getDashboardExternalURL();
                    ShellUtils.launchProgram(dashboard.evaluateURL(url, itemContainer.getProject(), itemContainer.getDataSourceContainer()));
        }

        DashboardBrowserComposite browserComposite = new DashboardBrowserComposite(container, viewContainer, composite, SWT.NONE, preferredSize);
import org.jkiss.code.NotNull;
        @NotNull DashboardItemContainer itemContainer,
 *

        super.fillDashboardToolbar(itemContainer, manager, chartComposite, dashboardConfig);


            public void run() {
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DashboardItemViewSettings dashboardConfig
    protected DashboardBrowserComposite getBrowserComposite(DashboardItemContainer container) {
    public void fillDashboardToolbar(
    }
import org.eclipse.swt.graphics.Point;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public Composite createDashboard(@NotNull Composite composite, @NotNull DashboardItemContainer container, @NotNull DashboardContainer viewContainer, @NotNull Point preferredSize) {
public class DashboardRendererBrowser extends DashboardRendererAbstract {
    }

    public void disposeDashboard(@NotNull DashboardItemContainer container) {
        if (chartComposite instanceof DashboardBrowserComposite bc) {
        });
                if (dashboard != null) {
import org.eclipse.jface.action.IContributionManager;
                    if (CommonUtils.isEmpty(url)) {
import org.jkiss.dbeaver.ui.ShellUtils;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
 */

import org.eclipse.jface.action.Action;
 * DBeaver - Universal Database Manager
    public void updateDashboardView(@NotNull DashboardViewItem dashboardItem) {
 * Browser dashboard renderer
            }
        manager.add(new Action("Open in external browser", DBeaverIcons.getImageDescriptor(UIIcon.LINK)) {
                bc.getBrowser().setUrl(dashboard.evaluateURL(dashboard.getDashboardURL(), itemContainer.getProject(),
import org.jkiss.dbeaver.ui.dashboard.control.DashboardRendererAbstract;
    protected void refreshChart(DashboardItemContainer itemContainer, Composite chartComposite, DashboardItemViewSettings dashboardConfig) {
    @Override
import org.jkiss.dbeaver.model.dashboard.data.DashboardDataset;
                itemContainer.refreshInfo();
                    itemContainer.getDataSourceContainer()));
 * you may not use this file except in compliance with the License.
    }
            if (dashboard != null) {
                        url = dashboard.getDashboardURL();
