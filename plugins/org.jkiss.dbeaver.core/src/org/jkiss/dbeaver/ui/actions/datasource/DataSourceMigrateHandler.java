import org.eclipse.core.commands.ExecutionException;
    @Override

 *
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
                    selectedProject.getDataSourceRegistry(),
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * limitations under the License.

            ActiveWizardDialog dialog = new ActiveWizardDialog(
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;

 * DBeaver - Universal Database Manager
 *
                    currentSelection instanceof IStructuredSelection ss ? ss : null));
            dialog.open();
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 */
            DBPProject selectedProject = NavigatorUtils.getSelectedProject(currentSelection, navigatorView);
}import org.eclipse.jface.viewers.IStructuredSelection;
            ISelection currentSelection = navigatorView.getNavigatorViewer().getSelection();
 * you may not use this file except in compliance with the License.

        return null;
                new MigrateConnectionWizard(
        NavigatorViewBase navigatorView = NavigatorUtils.getActiveNavigatorView(event);
import org.eclipse.core.commands.ExecutionEvent;
                HandlerUtil.getActiveWorkbenchWindow(event),
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.ui.dialogs.connection.MigrateConnectionWizard;
        if (navigatorView != null) {

public class DataSourceMigrateHandler extends AbstractHandler {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.actions.datasource;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.AbstractHandler;
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
import org.eclipse.ui.handlers.HandlerUtil;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
