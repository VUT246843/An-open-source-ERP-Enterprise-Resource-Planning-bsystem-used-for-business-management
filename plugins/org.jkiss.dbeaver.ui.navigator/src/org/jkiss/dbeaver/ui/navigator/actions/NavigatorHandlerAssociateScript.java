import org.eclipse.jface.dialogs.IDialogConstants;
            DBPDataSourceContainer dataSource = dialog.getDataSource();
import org.jkiss.dbeaver.ui.editors.SimpleDatabaseEditorContext;
import org.eclipse.ui.ide.ResourceUtil;
                    project = dataSource.getProject();
                }
 *
            for (IWorkbenchPage page: window.getPages()) {
                } else  {
                null);

                    project = DBPPlatformDesktop.getInstance().getWorkspace().getProject(script.getProject());
import org.eclipse.ui.PlatformUI;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
                    IResource resource = ((DBNResource) node).getResource();

            if (dialog.open() == IDialogConstants.CANCEL_ID) {
 * See the License for the specific language governing permissions and
        List<IFile> selectedScripts = new ArrayList<>();
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                EditorUtils.setFileDataSource(script, new SimpleDatabaseEditorContext(dataSource));
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
package org.jkiss.dbeaver.ui.navigator.actions;
                final DBNNode node = RuntimeUtils.getObjectAdapter(o, DBNNode.class);
                    }
                }
import org.eclipse.core.resources.IFile;
 * limitations under the License.
            }
import org.jkiss.dbeaver.model.app.DBPProject;
                }
        }

 */
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (resource instanceof IFile) {
import org.eclipse.ui.IWorkbenchWindow;
        if (!selectedScripts.isEmpty()) {
import org.eclipse.ui.handlers.HandlerUtil;
            }
                if (editor instanceof IDataSourceContainerUpdate) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;
                        selectedScripts.add((IFile) resource);
import org.jkiss.dbeaver.ui.IDataSourceContainerUpdate;
                if (project != null) {
                IEditorPart editor = ResourceUtil.findEditor(page, script);
    private static void setEditorDataSource(IFile script, DBPDataSourceContainer dataSource) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (IWorkbenchWindow window: PlatformUI.getWorkbench().getWorkbenchWindows()) {
                }
import org.eclipse.core.commands.ExecutionException;
                DBPProject project;
import java.util.ArrayList;
            for (IFile script : selectedScripts) {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
import org.eclipse.jface.viewers.ISelection;
                if (node instanceof DBNResource) {
                    ((IDataSourceContainerUpdate)editor).setDataSourceContainer(dataSource);
        return null;
            for (Object o : (IStructuredSelection) selection) {
public class NavigatorHandlerAssociateScript extends NavigatorHandlerObjectBase {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.navigator.DBNResource;
                activeShell,
 *
/*
import org.eclipse.swt.widgets.Shell;
    @Override
                setEditorDataSource(script, dataSource);
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
        final Shell activeShell = HandlerUtil.getActiveShell(event);
            SelectDataSourceDialog dialog = new SelectDataSourceDialog(
        if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
import org.jkiss.dbeaver.model.navigator.NavigatorResources;

 * you may not use this file except in compliance with the License.
                if (dataSource != null) {

import org.eclipse.ui.IEditorPart;
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDataSourceDialog;
import org.eclipse.core.resources.IResource;
            }
import org.eclipse.core.commands.ExecutionEvent;
                return null;
} *     http://www.apache.org/licenses/LICENSE-2.0
                DBPPlatformDesktop.getInstance().getWorkspace().getProject(selectedScripts.get(0).getProject()),
    public Object execute(ExecutionEvent event) throws ExecutionException {
            }
import org.eclipse.ui.IWorkbenchPage;
                    NavigatorResources.refreshNavigatorResource(project, script, dataSource);
import org.eclipse.jface.viewers.IStructuredSelection;
        }
        }
 * DBeaver - Universal Database Manager
