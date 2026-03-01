 * Unless required by applicable law or agreed to in writing, software
/*
        ISelection selection = view.getSite().getSelectionProvider().getSelection();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.viewers.ISelection;
    }

        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
            Object firstElement = ss.getFirstElement();
            if (firstElement instanceof DashboardItemContainer dc) {
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.ExecutionEvent;
 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
public abstract class HandlerDashboardAbstract extends AbstractHandler {
 */
import org.eclipse.ui.IWorkbenchPart;
    }
 *
                return dc;
            return dv;
    protected DashboardViewer getActiveDashboardView(ExecutionEvent event) {
        if (activePart instanceof DashboardViewer dv) {
import org.eclipse.core.commands.AbstractHandler;
            }
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;

package org.jkiss.dbeaver.ui.dashboard.navigator;
 *
 * limitations under the License.
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * DBeaver - Universal Database Manager
}        return null;
        if (!selection.isEmpty() && selection instanceof IStructuredSelection ss) {
 * See the License for the specific language governing permissions and
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected DashboardItemContainer getSelectedDashboard(DashboardViewer view) {
        }
