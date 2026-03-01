    @Override
import org.eclipse.jface.dialogs.IDialogConstants;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        if (view != null) {
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (dialog.open() == IDialogConstants.OK_ID) {
    }
package org.jkiss.dbeaver.ui.dashboard.navigator;

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
                HandlerUtil.getActiveShell(event), view);
 * Licensed under the Apache License, Version 2.0 (the "License");
        DashboardViewer view = getActiveDashboardView(event);

 *
 */
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
    public Object execute(ExecutionEvent event) {
import org.eclipse.core.commands.ExecutionEvent;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
                view.updateStatus();

import org.eclipse.ui.handlers.HandlerUtil;
 *
public class HandlerDashboardConfiguration extends HandlerDashboardAbstract {

import org.jkiss.dbeaver.ui.dashboard.view.DashboardViewConfigDialog;
 * limitations under the License.
            DashboardViewConfigDialog dialog = new DashboardViewConfigDialog(
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
}        return null;
            }
