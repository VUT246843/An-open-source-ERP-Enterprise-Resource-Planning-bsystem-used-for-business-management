
            if (!(element instanceof DBNNode)) {
                workbenchWindow.getActivePage().showView(DatabaseBrowserView.VIEW_ID, secondaryId, IWorkbenchPage.VIEW_ACTIVATE);
/*
    @Override
import org.eclipse.ui.IWorkbenchWindow;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.navigator.DBNNode;
            final IStructuredSelection structSelection = (IStructuredSelection)selection;
        if (selection instanceof IStructuredSelection) {
            } catch (Throwable e) {
import org.eclipse.jface.viewers.ISelection;
 * Unless required by applicable law or agreed to in writing, software
            Object element = structSelection.getFirstElement();
            DBNNode node = (DBNNode)element;
import org.eclipse.jface.viewers.IStructuredSelection;
            try {
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.handlers.HandlerUtil;
public class NavigatorHandlerOpenBrowser extends NavigatorHandlerObjectBase {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0



 * Licensed under the Apache License, Version 2.0 (the "License");
            IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
 *
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
}package org.jkiss.dbeaver.ui.navigator.actions;
 * limitations under the License.
import org.eclipse.core.commands.ExecutionEvent;
                return null;
                String secondaryId = DatabaseBrowserView.getSecondaryIdFromNode(node);
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 */
 * You may obtain a copy of the License at
import org.eclipse.core.commands.ExecutionException;

 * DBeaver - Universal Database Manager
            }
                DBWorkbench.getPlatformUI().showError("Database browser", "Error opening database browser", e);
import org.jkiss.dbeaver.ui.navigator.database.DatabaseBrowserView;
