    @Override
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
/*
        if (workspace.getActiveProject() != project) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.navigator.DBNProject;

 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.dbeaver.model.app.DBPWorkspaceEclipse;
        }
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.app.DBPProject;
 */
 *
    }
            }
import org.eclipse.jface.viewers.IStructuredSelection;

        if (selection instanceof IStructuredSelection) {
    public static void setActiveProject(DBPProject project) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            final IStructuredSelection structSelection = (IStructuredSelection)selection;
            GlobalUIPropertyTester.firePropertyChange(GlobalUIPropertyTester.PROP_HAS_ACTIVE_PROJECT);
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionEvent;

public class NavigatorHandlerProjectSetActive extends NavigatorHandlerObjectBase {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        DBPWorkspaceEclipse workspace = DBPPlatformDesktop.getInstance().getWorkspace();
}            Object element = structSelection.getFirstElement();
        return null;
 * DBeaver - Universal Database Manager
                return null;
            DBNProject projectNode = (DBNProject)element;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.core.commands.ExecutionException;
 * Licensed under the Apache License, Version 2.0 (the "License");


            workspace.setActiveProject(project);

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.actions.GlobalUIPropertyTester;
package org.jkiss.dbeaver.ui.navigator.actions;
 *
 *
            setActiveProject(projectNode.getProject());
import org.eclipse.jface.viewers.ISelection;
 * Unless required by applicable law or agreed to in writing, software
        }
            if (!(element instanceof DBNProject)) {

