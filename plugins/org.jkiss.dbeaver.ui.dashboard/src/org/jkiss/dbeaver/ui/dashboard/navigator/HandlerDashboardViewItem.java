 *
package org.jkiss.dbeaver.ui.dashboard.navigator;

 * Unless required by applicable law or agreed to in writing, software

            }
            viewDialog.open();
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
            if (selectedDashboard != null) {
            DashboardItemViewDialog viewDialog = new DashboardItemViewDialog(
            DashboardItemContainer selectedDashboard = getSelectedDashboard(view);
import org.eclipse.core.commands.ExecutionEvent;
        if (viewItem.getGroupContainer().getView().getWorkbenchPart() instanceof DataSourceDashboardView view) {
public class HandlerDashboardViewItem extends HandlerDashboardAbstract {
                view.getConfigurationList(),
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.ui.dashboard.view.DataSourceDashboardView;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DashboardViewItem viewItem = (DashboardViewItem) itemContainer;
        return null;
    }
                DashboardItemViewDialog viewDialog = new DashboardItemViewDialog(
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
                    view.getConfigurationList(),
import org.jkiss.dbeaver.ui.dashboard.control.DashboardViewItem;
                viewItem);
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
                view.getDashboardListViewer(),
/*
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static void openDashboardViewDialog(DashboardItemContainer itemContainer) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionException;
 * See the License for the specific language governing permissions and
        }
                viewDialog.open();
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemViewDialog;
    @Override
 * limitations under the License.
        DashboardViewer view = getActiveDashboardView(event);
    public static final String CMD_ID = "org.jkiss.dbeaver.ui.dashboard.view";
 *
}        if (view != null) {


        }
                    view.getDashboardListViewer(),
                    (DashboardViewItem) selectedDashboard);

            viewDialog.setModeless(true);
