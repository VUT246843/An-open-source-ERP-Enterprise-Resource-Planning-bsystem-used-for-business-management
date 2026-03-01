    private final DBPProject project;
            task.setDescription(taskDescriptionText.getText());
        ((GridData)taskLabelCombo.getLayoutData()).widthHint = 300;

            NLS.bind("%s [%s]", TaskUIMessages.edit_task_config_dialog_title_edit_task, task.getName()),
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
    {
    @Override
            parentShell,
import org.eclipse.jface.dialogs.IDialogSettings;
            task.setName(taskLabelCombo.getText());

 *
    private static final String DIALOG_ID = "DBeaver.EditTaskConfigurationDialog";//$NON-NLS-1$
import org.jkiss.utils.ArrayUtils;
/*
import org.jkiss.dbeaver.runtime.DBWorkbench;
        this.project = task.getProject();
                @Override

            if (task == null) {
        taskLabelCombo.addModifyListener(modifyListener);

        taskDescriptionText.addModifyListener(modifyListener);
        @NotNull DBTTaskType taskType,
 * you may not use this file except in compliance with the License.
import java.util.Date;
        this.maxExecutionTime = maxExecutionTime;
                        task = (TaskImpl) allTasks[selectionIndex - 1];
import org.eclipse.swt.events.ModifyListener;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    taskFoldersCombo.add(taskFolder.getName());
            taskManager.updateTaskConfiguration(task);
    }
 * See the License for the specific language governing permissions and
        UIUtils.createLabelText(formPanel, TaskUIMessages.edit_task_config_dialog_label_type, taskType.getCategory().getName() + " / " + taskType.getName(), SWT.BORDER | SWT.READ_ONLY);

    public EditTaskConfigurationDialog(
                        setTitle("Edit task " + task.getName());
            DBTTaskFolder[] tasksFolders = taskManager.getTasksFolders();
    }
        super(
 *
        ModifyListener modifyListener = e -> {
                    }

            DBTTaskManager taskManager = project.getTaskManager();
//            UIUtils.createLabelText(formPanel, "ID", task.getId(), SWT.BORDER | SWT.READ_ONLY);
    }
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Objects;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        boolean isReady = !taskLabelCombo.getText().isEmpty();// && !taskDescriptionText.getText().isEmpty();

    public DBTTask getTask() {
        this.maxExecutionTime = task.getMaxExecutionTime();
        DBTTaskManager taskManager = project.getTaskManager();
        };
    private Combo taskFoldersCombo;

        @NotNull Shell parentShell,
import org.jkiss.dbeaver.model.DBIcon;
                    } else {
    protected void createButtonsForButtonBar(Composite parent) {
        return task;
            updateButtons();
            });
    @Override
import org.eclipse.swt.widgets.Composite;
                taskLabelCombo.add(tc.getName());
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
                    int selectionIndex = taskLabelCombo.getSelectionIndex();
import org.eclipse.swt.widgets.Combo;
                task = (TaskImpl) taskManager.createTask(taskType, taskLabelCombo.getText(), taskDescriptionText.getText(), taskFoldersCombo.getText(), state);
    protected IDialogSettings getDialogBoundsSettings() {
                    if (selectionIndex == 0) {
    ) {

            taskLabelCombo.setEnabled(false);
        updateButtons();
 * Create task dialog
    private boolean isTaskEditor() {
}
        taskLabelCombo = UIUtils.createLabelCombo(formPanel, TaskUIMessages.edit_task_config_dialog_label_name, "", SWT.BORDER | (taskSaved ? SWT.READ_ONLY : SWT.NONE));
        this.state = task.getProperties();
            Objects.requireNonNullElse(task.getType().getIcon(), DBIcon.TREE_TASK)
    }
 */
import org.eclipse.swt.layout.GridData;
    }
    private void updateButtons() {
            return;
import org.jkiss.dbeaver.DBException;
        Composite composite = super.createDialogArea(parent);
    private Combo taskLabelCombo;


//        if (!CommonUtils.isEmpty(task.getId())) {
import org.jkiss.utils.CommonUtils;
                        setTitle("Create task " + taskType.getName());
    }
 * limitations under the License.
            }
            if (!ArrayUtils.isEmpty(tasksFolders)) {
    public EditTaskConfigurationDialog(@NotNull Shell parentShell, @NotNull DBTTask task) {

            taskFoldersCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            DBTTask[] allTasks = taskManager.getAllTaskByType(taskType);
        this.state = new LinkedHashMap<>();
        this.task = null;
import java.time.Duration;
        }
import org.jkiss.dbeaver.model.task.DBTTask;
 */
 *
        @NotNull DBPProject project,

import org.jkiss.dbeaver.model.task.DBTTaskFolder;


    }
import org.eclipse.swt.SWT;
    private Text taskDescriptionText;
*/

        } else {
        taskDescriptionText = UIUtils.createLabelText(formPanel, TaskUIMessages.edit_task_config_dialog_label_descr, task == null ? "" : CommonUtils.notEmpty(task.getDescription()), SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
import org.jkiss.dbeaver.model.task.DBTTaskManager;
        Composite formPanel = UIUtils.createComposite(composite, 2);
            task.setMaxExecutionTime(maxExecutionTime);

            DBWorkbench.getPlatformUI().showError("Create task", "Error creating data transfer task", e);
            UIUtils.createControlLabel(formPanel, TaskUIMessages.edit_task_config_dialog_task_folders_label_name);
import org.jkiss.dbeaver.model.app.DBPProject;
            for (DBTTask tc : allTasks) {
        return UIUtils.getDialogSettings(DIALOG_ID);
            taskLabelCombo.setText(task.getName());
package org.jkiss.dbeaver.tasks.ui.wizard;
                }
        ((GridData)taskDescriptionText.getLayoutData()).heightHint = taskDescriptionText.getLineHeight() * 5;
        if (task != null) {
import org.jkiss.dbeaver.ui.UIUtils;
//        }
        }
        return composite;
public class EditTaskConfigurationDialog extends BaseDialog

    protected void okPressed() {
/**
        } catch (DBException e) {
            }

            taskLabelCombo.addSelectionListener(new SelectionAdapter() {
import org.eclipse.jface.dialogs.IDialogConstants;
                public void widgetSelected(SelectionEvent e) {
    @Override
                taskFoldersCombo.add(""); // Empty row as ability to remove task folder from task
    private final DBTTaskType taskType;
    @Override
import org.eclipse.osgi.util.NLS;
        getButton(IDialogConstants.OK_ID).setEnabled(isReady);
        super(parentShell, TaskUIMessages.edit_task_config_dialog_title_create_task, DBIcon.TREE_TASK);
    private final Duration maxExecutionTime;
        if (taskSaved) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.registry.task.TaskImpl;
                for (DBTTaskFolder taskFolder : tasksFolders) {
        super.okPressed();
    private TaskImpl task;
                        task = null;
import java.util.Map;
    }
        );
            }
        }
        this.taskType = taskType;
 * Unless required by applicable law or agreed to in writing, software
        this.taskType = task.getType();

        this.task = (TaskImpl) task;
    private final Map<String, Object> state;
            task.setUpdateTime(new Date());
        boolean taskSaved = task != null && !CommonUtils.isEmpty(task.getId());
        @NotNull Duration maxExecutionTime
                        taskDescriptionText.setText(CommonUtils.notEmpty(task.getDescription()));

            taskLabelCombo.add("");
        this.project = project;
            taskFoldersCombo = new Combo(formPanel, SWT.DROP_DOWN | SWT.READ_ONLY);
            task.setProperties(state);

 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.task.DBTTaskType;

{
        UIUtils.asyncExec(() -> taskLabelCombo.setFocus());
        super.createButtonsForButtonBar(parent);
        formPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        return task != null;

    protected Composite createDialogArea(Composite parent)
import org.eclipse.swt.widgets.Shell;
        try {
import org.jkiss.code.NotNull;
import org.eclipse.swt.widgets.Text;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
import java.util.LinkedHashMap;

