            for (DashboardConfiguration dashboard : configurationList.getDashboards()) {
        menuItems.add(new Separator());
            if (configurationList.getDashboards().isEmpty()) {
            super(dashboard.getTitle());
        public ShowDashBoardAction(DashboardConfiguration dashboard) {
        IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
            activePart.getSite().getSelectionProvider().getSelection() : null;
 * DBeaver - Universal Database Manager
            null,

    }
            selection);
import org.eclipse.jface.action.IContributionItem;

                dashboard.getDataSourceContainer(),
                // Add fake default dashboard
            DashboardUIConstants.CMD_CREATE_DASHBOARD,
public class DashboardDynamicMenuContributor extends DataSourceMenuContributor {
                dashboard.getProject(),
                dashboard.getDashboardId());
        IWorkbenchPart activePart = window.getActivePage().getActivePart();
import java.util.List;
 * you may not use this file except in compliance with the License.
        }
 *
        }
 *
                menuItems.add(ActionUtils.makeActionContribution(new ShowDashBoardAction(dashboard), true));
        ISelection selection = activePart.getSite().getSelectionProvider() != null ?
                UIUtils.getActiveWorkbenchWindow(),
} * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfiguration;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfigurationList;
    protected void fillContributionItems(final List<IContributionItem> menuItems) {
        }
 *

            }

        public void run() {


    @Override
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return;
/*
                activePart,
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceMenuContributor;
        menuItems.add(ActionUtils.makeCommandContribution(
            }
            DataSourceDashboardView.openView(
            configurationList.checkDefaultDashboardExistence();
import org.jkiss.dbeaver.ui.ActionUtils;
import org.eclipse.jface.action.Separator;
            Map.of("datasource", String.valueOf(true))));
        if (ds != null) {
import org.jkiss.dbeaver.ui.dashboard.view.DataSourceDashboardView;
        if (ds == null) {
        if (window == null) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants;
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                window.getActivePage().getActiveEditor(),
            this.dashboard = dashboard;
 * You may obtain a copy of the License at
            DashboardConfigurationList configurationList = new DashboardConfigurationList(ds);
package org.jkiss.dbeaver.ui.dashboard.navigator;
        @Override
            window,
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.jface.action.Action;
                configurationList.createDashboard(
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static class ShowDashBoardAction extends Action {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    DashboardConfigurationList.DEFAULT_DASHBOARD_ID,
 * limitations under the License.
                    DashboardConfigurationList.DEFAULT_DASHBOARD_NAME);
        }

            ds = AbstractDataSourceHandler.getActiveDataSourceContainer(
import org.eclipse.ui.IWorkbenchWindow;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.jface.viewers.ISelection;
import java.util.Map;
            activePart,
        private final DashboardConfiguration dashboard;
        DBPDataSourceContainer ds = AbstractDataSourceHandler.getActiveDataSourceContainer(

                selection);
 */
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
