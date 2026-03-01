 * You may obtain a copy of the License at
                if (newFolder.exists()) {
            if (resource instanceof IProject) {
import org.jkiss.code.NotNull;
 *
            Shell activeShell = HandlerUtil.getActiveShell(event);

                }
                    resource = rcpProject.getRootResource();
                String folderName = dialog.getResult();
                if (!CommonUtils.isEmpty(folderName)) {
import org.jkiss.dbeaver.ui.UIUtils;
            }
                    }
public class NavigatorHandlerCreateFolder extends NavigatorHandlerObjectBase {
                    throw new DBException("Folder '" + folderName + "' already exists in project '" + resource.getName() + "'");
    }
                IFolder newFolder = parentFolder.getFolder(folderName);
                }
                return null;
                if (newFolder.exists()) {
                }
            }
import org.eclipse.swt.widgets.Composite;
            }
 * you may not use this file except in compliance with the License.
            if (resource == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    try {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
 * See the License for the specific language governing permissions and
 */
import org.eclipse.jface.viewers.ISelection;
                protected Composite createDialogArea(Composite parent) {
                if (project instanceof RCPProject rcpProject) {
                IFolder newFolder = ((IProject) resource).getFolder(folderName);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                DBPProject project = DBPPlatformDesktop.getInstance().getWorkspace().getProject((IProject) resource);
import org.eclipse.jface.viewers.IStructuredSelection;
    }
                @Override
                if (!parentFolder.exists()) {
            }
package org.jkiss.dbeaver.ui.navigator.actions;
            if (resource instanceof IProject) {
    private static void createNewFolder(@NotNull IResource resource, @NotNull String folderName) throws DBException {
import org.eclipse.osgi.util.NLS;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        try {
                        DBWorkbench.getPlatformUI().showError(

        return null;
import org.eclipse.core.runtime.CoreException;
    public Object execute(ExecutionEvent event) throws ExecutionException {
                    } catch (DBException e) {
import org.eclipse.core.commands.ExecutionException;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.utils.GeneralUtils;

 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.app.DBPProject;
                    UIUtils.createLabelText(area, "Container", resource.getFullPath().toString(), SWT.BORDER | SWT.READ_ONLY);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    final Composite area = super.createDialogArea(parent);
                            NLS.bind(UINavigatorMessages.actions_navigator_create_folder_error_message, folderName),
import org.jkiss.dbeaver.DBException;
    @Override
import org.eclipse.core.resources.IProject;
            };
 *
} *     http://www.apache.org/licenses/LICENSE-2.0
                            e);
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;

import org.eclipse.jface.dialogs.IDialogConstants;
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.NullProgressMonitor;
                }

                    parentFolder.create(true, true, new NullProgressMonitor());
 *
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
            } else if (resource instanceof IFolder parentFolder) {
            throw new DBException("Can't create new folder: " + e.getMessage(), e);
        } catch (CoreException e) {
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IFolder;
            final IResource resource = GeneralUtils.adapt(structSelection.getFirstElement(), IResource.class);
import org.jkiss.dbeaver.model.rcp.RCPProject;
 * Unless required by applicable law or agreed to in writing, software
                    throw new DBException("Folder '" + folderName + "' already exists in '" + resource.getFullPath().toString() + "'");
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
            EnterNameDialog dialog = new EnterNameDialog(activeShell, UINavigatorMessages.actions_navigator_create_folder_folder_name, null) {
                    return area;
                            UINavigatorMessages.actions_navigator_create_folder_error_title,
 * limitations under the License.
                }

                }
                        createNewFolder(resource, folderName);
        if (selection instanceof IStructuredSelection structSelection) {
                newFolder.create(true, true, new NullProgressMonitor());
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.utils.CommonUtils;
                newFolder.create(true, true, new NullProgressMonitor());
import org.eclipse.swt.SWT;
            if (dialog.open() == IDialogConstants.OK_ID) {
/*
