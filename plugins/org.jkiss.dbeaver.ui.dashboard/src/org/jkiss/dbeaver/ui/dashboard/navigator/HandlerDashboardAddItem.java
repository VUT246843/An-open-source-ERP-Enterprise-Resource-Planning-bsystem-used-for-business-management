 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionException;
/*
                        listViewer.getDefaultGroup().addItem(selectedDashboard);
                    if (selectedDashboard != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
                if (addDialog.open() == IDialogConstants.OK_ID) {
 *
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
 *
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
                DashboardAddItemDialog addDialog = new DashboardAddItemDialog(HandlerUtil.getActiveShell(event), view.getConfiguration());
 * limitations under the License.
        if (view != null) {
            if (listViewer != null) {
}public class HandlerDashboardAddItem extends HandlerDashboardAbstract {
 * you may not use this file except in compliance with the License.
                }
import org.jkiss.dbeaver.ui.dashboard.view.DashboardAddItemDialog;
        DashboardViewer view = getActiveDashboardView(event);
 *
                    DashboardItemConfiguration selectedDashboard = addDialog.getSelectedDashboard();

 * You may obtain a copy of the License at
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
            DashboardListViewer listViewer = view.getDashboardListViewer();
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
                    }


            }
    public Object execute(ExecutionEvent event) throws ExecutionException {
package org.jkiss.dbeaver.ui.dashboard.navigator;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.eclipse.ui.handlers.HandlerUtil;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.dashboard.control.DashboardListViewer;
 * DBeaver - Universal Database Manager
import org.eclipse.core.commands.ExecutionEvent;
 * Unless required by applicable law or agreed to in writing, software
