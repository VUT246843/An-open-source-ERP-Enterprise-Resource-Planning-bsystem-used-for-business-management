 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
                    configurationList = view.getConfigurationList();
 * Unless required by applicable law or agreed to in writing, software
                }
                    HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().hideView(viewPart);
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
import org.eclipse.ui.IViewPart;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfigurationList;
                HandlerUtil.getActiveShell(event),
 * DBeaver - Universal Database Manager
import org.eclipse.ui.IEditorPart;
        if (view != null) {
            }
                    HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().closeEditor(editorPart, false);
import org.jkiss.dbeaver.ui.UIUtils;
            ) {
import org.eclipse.ui.handlers.HandlerUtil;
                    configurationList = new DashboardConfigurationList(view.getDataSourceContainer());
import org.eclipse.core.commands.ExecutionEvent;
                configurationList.deleteDashBoard(view.getConfiguration());

            if (UIUtils.confirmAction(
package org.jkiss.dbeaver.ui.dashboard.navigator;
                "Delete dashboard",
/*
 * See the License for the specific language governing permissions and
        DashboardViewer view = getActiveDashboardView(event);

 *     http://www.apache.org/licenses/LICENSE-2.0
public class HandlerDashboardDelete extends HandlerDashboardAbstract {
                "Are you sure you want to delete dashboard '" + view.getConfiguration().getTitle() + "'?")
} * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
import org.eclipse.core.commands.ExecutionException;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
                } else if (view instanceof IEditorPart editorPart) {
                if (view instanceof IViewPart viewPart) {
                DashboardConfigurationList configurationList;

import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
                if (view.getDataSourceContainer() != null) {
        return null;
 * You may obtain a copy of the License at

 * limitations under the License.
                } else {
    @Override
 */
                }
