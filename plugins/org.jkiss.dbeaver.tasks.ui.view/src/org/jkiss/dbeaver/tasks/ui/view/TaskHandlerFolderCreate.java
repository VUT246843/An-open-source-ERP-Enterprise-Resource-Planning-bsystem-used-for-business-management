
        protected void createButtonsForButtonBar(Composite parent)
        private String name;
            super.createButtonsForButtonBar(parent);
 *
 * You may obtain a copy of the License at
            }

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;

import java.util.List;
            for (DBPProject project : projects) {
 * limitations under the License.
        }


import org.jkiss.dbeaver.model.task.DBTTaskManager;
import org.eclipse.core.commands.AbstractHandler;
                        TaskUIViewMessages.task_handler_folder_create_error_title,

                    parentFolder = (DBTTaskFolder) selectedObject;
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;
import org.jkiss.dbeaver.DBException;
        }
            final Composite composite = super.createDialogArea(parent);
                name = nameText.getText().trim();


    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
                projectCombo.add(project.getName());
            });

            return project;
        public String getName() {
                taskManager.updateConfiguration();
import org.eclipse.jface.dialogs.IDialogConstants;
        if (createFolderDialog.open() == IDialogConstants.OK_ID) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        CreateFolderDialog(Shell parentShell, DBPProject project) {
        }

            UIUtils.createControlLabel(composite, TaskUIViewMessages.task_handler_folder_create_dialog_text_label_folder_project);
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
            DBTTaskManager taskManager = folderProject.getTaskManager();
                }
import org.jkiss.dbeaver.ui.UIUtils;
                        NLS.bind(TaskUIViewMessages.task_handler_folder_create_error_message, createFolderDialog.getName()),
 * Unless required by applicable law or agreed to in writing, software

            projectCombo.addSelectionListener(new SelectionAdapter() {
            DBTTaskFolder taskFolder = null;
import org.eclipse.swt.events.SelectionAdapter;
                getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());
        CreateFolderDialog createFolderDialog = new CreateFolderDialog(HandlerUtil.getActiveShell(event), project);
/*
            return name;
            final Combo projectCombo = new Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);
            try {

                        e
 */
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Shell;
            // Check selected object. If it is a folder - then add it as parent for tne new folder
package org.jkiss.dbeaver.tasks.ui.view;
            final Text nameText = UIUtils.createLabelText(composite, TaskUIViewMessages.task_handler_folder_create_dialog_text_label_name, ""); //$NON-NLS-2$
            projectCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.task.DBTTaskFolder;
        }
        return null;

        protected Composite createDialogArea(Composite parent) {

 *     http://www.apache.org/licenses/LICENSE-2.0
                if (selectedObject instanceof DBTTaskFolder) {
            super(parentShell, TaskUIViewMessages.task_handler_folder_create_dialog_title, null);

            this.project = project;
import org.eclipse.jface.viewers.ISelection;
            } catch (DBException e) {
            getButton(IDialogConstants.OK_ID).setEnabled(false);
                Object selectedObject = structuredSelection.getFirstElement();
                }
        public DBPProject getProject() {
                DBWorkbench.getPlatformUI().showError(
}
            nameText.addModifyListener(e -> {
            DBPProject folderProject = createFolderDialog.getProject();
 * you may not use this file except in compliance with the License.
            List<? extends DBPProject> projects = DBWorkbench.getPlatform().getWorkspace().getProjects();
 * See the License for the specific language governing permissions and
                @Override
        private DBPProject project;
                log.error("Can't create new task folder", e);
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.Log;
        }
            });
            if (taskFolder != null) {
        {
import org.eclipse.swt.events.SelectionEvent;
    private class CreateFolderDialog extends BaseDialog {
            projectCombo.setText(project.getName());
                );
 * DBeaver - Universal Database Manager
                public void widgetSelected(SelectionEvent e) {
                IStructuredSelection structuredSelection = (IStructuredSelection) selection;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
                taskFolder = taskManager.createTaskFolder(folderProject, createFolderDialog.getName(), parentFolder, null);

            if (selection instanceof IStructuredSelection) {
    public Object execute(ExecutionEvent event) {
import org.eclipse.osgi.util.NLS;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionEvent;
    @Override
            }
            ISelection selection = HandlerUtil.getCurrentSelection(event);
 *


        @Override
            }
            return composite;
    private static final Log log = Log.getLog(TaskHandlerFolderCreate.class);
            }
import org.eclipse.jface.viewers.IStructuredSelection;
        DBPProject project = NavigatorUtils.getSelectedProject();
public class TaskHandlerFolderCreate extends AbstractHandler {
            // Write new task folder name in json file

                    project = projects.get(projectCombo.getSelectionIndex());
            DBTTaskFolder parentFolder = null;
import org.eclipse.ui.handlers.HandlerUtil;
