                try {
import org.eclipse.core.resources.IFolder;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    DBWorkbench.getPlatformUI().showError(
 * Unless required by applicable law or agreed to in writing, software
                }
 * DBeaver - Universal Database Manager
            Object element = structSelection.getFirstElement();
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
 * See the License for the specific language governing permissions and
    public Object execute(ExecutionEvent event) throws ExecutionException {
            DBPResourceCreator handler = (DBPResourceCreator) workspace.getResourceHandler(resource);
import org.jkiss.dbeaver.model.navigator.DBNResource;
                return null;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
            final IStructuredSelection structSelection = (IStructuredSelection)selection;

 * Copyright (C) 2010-2024 DBeaver Corp and others

            IResource resource = ((DBNResource) element).getResource();
import org.jkiss.dbeaver.model.app.DBPResourceCreator;
}    }
                    handler.createResource((IFolder) resource);
import org.eclipse.jface.viewers.ISelection;
            DBPWorkspaceDesktop workspace = DBPPlatformDesktop.getInstance().getWorkspace();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
/*
import org.eclipse.core.resources.IResource;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (resource instanceof IFolder && handler != null) {
            }
 * limitations under the License.

import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            if (!(element instanceof DBNResource)) {
                        e);
 *


        return null;
import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
 *
                        "Can't create file",
        if (selection instanceof IStructuredSelection) {

public class NavigatorHandlerCreateFile extends NavigatorHandlerObjectBase {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
                        "Error during " + handler.getTypeName(resource) + " creation",
                } catch (Exception e) {
package org.jkiss.dbeaver.ui.navigator.actions;
    @Override
 */
            }
import org.eclipse.ui.handlers.HandlerUtil;
