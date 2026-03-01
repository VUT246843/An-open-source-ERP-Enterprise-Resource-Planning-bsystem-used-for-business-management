import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            NullProgressMonitor monitor = new NullProgressMonitor();
 *
 * limitations under the License.
                DBWorkbench.getPlatformUI().showError("Rename", "Error renaming file '" + file.getName() + "'", e);

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * You may obtain a copy of the License at
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.resources.IFile;
            if (editor instanceof IEditorPart) {
import org.eclipse.ui.IEditorPart;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
        }
            if (divPos != -1) {
            } catch (CoreException e) {
        if (newName.indexOf('.') == -1) {

import org.eclipse.ui.progress.UIJob;
                // We need to reopen editor
        }
            }
        if (!newName.equals(file.getName())) {
import org.jkiss.dbeaver.ui.editors.EditorUtils;

        return null;
import org.eclipse.core.commands.ExecutionException;
        IEditorPart editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActivePart(event), IEditorPart.class);
                UIJob reopenJob = new UIJob("Reopen SQL script") {
import org.jkiss.dbeaver.model.rm.RMConstants;
            int divPos = file.getName().lastIndexOf('.');
                reopenJob.schedule(250);
import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.eclipse.ui.part.FileEditorInput;
            DBWorkbench.getPlatformUI().showError("Rename", "Can't rename - no source file");
 * Unless required by applicable law or agreed to in writing, software
            String oldExtension = file.getFileExtension();
        }
            renameFile(editor, file, "SQL script");
            }
    }
package org.jkiss.dbeaver.ui.editors.sql.handlers;
import org.eclipse.core.runtime.*;
            }

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
                file = file.getWorkspace().getRoot().getFile(newFilePath);
                    public IStatus runInUIThread(IProgressMonitor monitor) {
        DBPProject resourceProject = EditorUtils.getFileProject(editor.getEditorInput());
import org.jkiss.dbeaver.utils.RuntimeUtils;
        Shell shell = editor.getSite().getShell();
                        FileEditorInput editorInput = new FileEditorInput(newFile);
        }

            try {
 * DBeaver - Universal Database Manager
}import org.jkiss.dbeaver.model.app.DBPProject;
        if (resourceProject == null || resourceProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
            IFile newFile = file;

            return;
                        return Status.OK_STATUS;
                IPath newFilePath = file.getParent().getFullPath().append(newName);
 */
                            SQLEditorHandlerOpenEditor.openResource(newFile);
            return null;
        IFile file = EditorUtils.getFileFromInput(editor.getEditorInput());
                ((IEditorPart)editor).doSave(monitor);
                        IEditorPart openEditor = activePage.findEditor(editorInput);
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLEditorHandlerRenameFile extends AbstractDataSourceHandler {

            return null;
                            activePage.closeEditor(openEditor, true);
import org.jkiss.dbeaver.ui.UIUtils;
            String newExtension = file.getFileExtension();
                };
            if (SQLEditorUtils.SCRIPT_FILE_EXTENSION.equals(newExtension) && !newExtension.equals(oldExtension)) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static void renameFile(IWorkbenchPart editor, IFile file, String fileTitle) {
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
        }
                file.move(newFilePath, true, monitor);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
                        IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
        if (file == null) {
 *
                    @Override

                // File become an SQL editor
            }
 *
import org.eclipse.ui.IWorkbenchPage;
    @Override
        String newName = EnterNameDialog.chooseName(shell, "Rename " + fileTitle + " [" + file.getName() + "]", file.getName());
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
            log.error("No active SQL editor");
        if (newName == null) {
                newName += file.getName().substring(divPos);
                        }
        if (editor == null) {
                        if (openEditor != null) {
