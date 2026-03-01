            DBWorkbench.getPlatform().getWorkspace().getActiveProject());
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.IWorkbenchWindow;
import org.jkiss.dbeaver.ui.navigator.project.ProjectNavigatorView;
 *
            final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        if (projectNode != null) {
import org.jkiss.dbeaver.Log;
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.ExecutionException;
 *
    @Override
                final ProjectNavigatorView projectsView = (ProjectNavigatorView)workbenchWindow.getActivePage().showView(ProjectNavigatorView.VIEW_ID);

            }
            } catch (PartInitException e) {
public class NavigatorHandlerProjectSelect extends NavigatorHandlerObjectBase {
package org.jkiss.dbeaver.ui.navigator.actions;
                log.error(e);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static final Log log = Log.getLog(NavigatorHandlerProjectSelect.class);

import org.eclipse.core.commands.ExecutionEvent;
 */
 * you may not use this file except in compliance with the License.
    }
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final DBNProject projectNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(
                if (projectsView != null) {
 * See the License for the specific language governing permissions and
/*
                    projectsView.showNode(projectNode);

 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
}
import org.jkiss.dbeaver.model.navigator.DBNProject;
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
            try {
 * You may obtain a copy of the License at
 * limitations under the License.
 * DBeaver - Universal Database Manager
