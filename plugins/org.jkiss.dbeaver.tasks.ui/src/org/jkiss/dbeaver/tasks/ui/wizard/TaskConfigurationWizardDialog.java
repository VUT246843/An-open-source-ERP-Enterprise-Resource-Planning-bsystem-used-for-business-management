
        @NotNull Map<String, Object> options
        @NotNull String taskTypeId,
        }
                return dialog.open();
                getShell().setDefaultButton(finishButton);
        }
        getWizard().createTaskActions(pane, 1);
        wizard.updateTaskButtons();
        return openNewTaskDialogImpl(window, project, taskTypeId, selection, Map.of(), true);
import org.eclipse.jface.viewers.StructuredSelection;
        return null;
            createButton(parent, IDialogConstants.BACK_ID, IDialogConstants.BACK_LABEL, false);
        }
            for (IWizardPage page : nestedTaskWizard.getPages()) {
            public void pageChanged(PageChangedEvent event) {
     * @param taskTypeId - task id
        @NotNull IWorkbenchWindow window,
    ) {
        return true;

import org.jkiss.dbeaver.model.task.DBTTask;
    private int getNavPagesCount() {
     * @param window - workbench window to get parent shell from
        @NotNull IStructuredSelection selection,

    }
package org.jkiss.dbeaver.tasks.ui.wizard;
        this.editMode = editMode;

     */
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            getWizard() instanceof NewTaskConfigurationWizard newTaskWizard &&
        if (taskEditPage != null) {
    public void setEditMode(boolean editMode) {




import org.eclipse.swt.widgets.Button;
        super.disableButtonsOnProgress();

    protected void createButtonsForButtonBar(@NotNull Composite parent) {
    private static final int SAVE_BUTTON_ID = IDialogConstants.CLIENT_ID + 1;
                if (page instanceof TaskConfigurationWizardPageSettings) {
        @NotNull IStructuredSelection selection
            for (Object so : selection.toArray()) {
            return;
        addPageChangedListener(new IPageChangedListener() {
        return navPagesNum;
            } else {
    ) {
    @Override
    }
        } catch (DBException e) {
            input.loadSettingsFromInput(inputObjects, options);
        return (TaskConfigurationWizard) super.getWizard();
        }
                    nestedTaskWizard.addPages();
    }
import org.eclipse.jface.viewers.IStructuredSelection;
            Button saveButton = getButton(SAVE_BUTTON_ID);
                saveButton.setEnabled(true);
    protected void buttonPressed(int buttonId) {
    }
            taskEditPage = getTaskPage();
    }
        setFinishButtonLabel(IDialogConstants.PROCEED_LABEL);
    protected void createBottomLeftArea(Composite pane) {
            DBWorkbench.getPlatformUI().showError("Task create error", "Error creating task '" + taskTypeId + "'", e);
    @NotNull
                    ((IWizardPageNavigable) page2).isPageNavigable()) {
     * @return the return code
            }
                        showPage(nextPage);
        return (TaskConfigurationWizard) super.getWizard();
        @NotNull IWorkbenchWindow window,
                if (nextTaskWizard != nestedTaskWizard) {
                removePageChangedListener(this);
        }
            button.setEnabled(true);
     * Opens new task dialog for the tool
        super(window, wizard, selection);
    @SuppressWarnings({"rawtypes", "unchecked"})
    }
    public void setSelectorMode(boolean selectorMode) {
import org.jkiss.dbeaver.ui.dialogs.MultiPageWizardDialog;
                    }
        } else {
                    inputObjects.add(so);
import org.jkiss.dbeaver.tasks.ui.registry.TaskUIRegistry;
     * @param project - project for task execution
    }
                return IDialogConstants.ABORT_ID;
import org.jkiss.code.NotNull;
        TaskTypeDescriptor taskType = TaskRegistry.getInstance().getTaskType(taskTypeId);
    ) {
import org.eclipse.swt.widgets.Composite;
        Control dialogArea = super.createDialogArea(parent);
    }
                TaskConfigurationWizard<?> nextTaskWizard = taskEditPage.getTaskWizard();
 */
    }

    }
import org.eclipse.jface.wizard.IWizardPage;
        ) {
            if (!getCurrentPage().isPageComplete()) {
import org.jkiss.dbeaver.model.app.DBPProject;
    }
    }
            return IDialogConstants.CANCEL_ID;
     */
    }
                return (TaskConfigurationWizardPageTask)pages[0];
            }
import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;
        @NotNull TaskConfigurationWizard<?> wizard
            createButton(parent, IDialogConstants.NEXT_ID, IDialogConstants.NEXT_LABEL, true);
    @Override
                        return;
        return selectorMode;
    @NotNull
    }
            }
        return dialogArea;
                    nestedTaskWizard.initializeWizard(this.getShell().getParent());
    }
            DBTTask task = project.getTaskManager().createTemporaryTask(taskType, taskType.getName());
                ((IWizardPageNavigable) page2).isPageApplicable() &&
import org.eclipse.jface.dialogs.IDialogConstants;
                return;
            if (!(page2 instanceof IWizardPageNavigable) ||
    public TaskConfigurationWizard<?> getWizard() {

    public TaskConfigurationWizardDialog(
     * @return the return code
    @Override
                TaskConfigurationWizardDialog dialog = configWizard.createWizardDialog(window, selection, options);
    /**
            return EnumSet.of(PageCompletionMark.COMPLETE, PageCompletionMark.ERROR);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

     * @param options - additional options for the task

            getWizard().saveTask();
     * @param project - project for task execution
            Button finishButton = getButton(IDialogConstants.OK_ID);
    }
     * @param project - project for task execution
 *
    }
     *
        if (button != null) {
     * @param taskTypeId - task id
                setErrorMessage(NLS.bind(TaskUIMessages.task_configuration_wizard_dialog_configuration_error, e.getMessage()));
import org.jkiss.dbeaver.model.task.DBTTaskSettingsInput;
        return openNewTaskDialogImpl(window, project, taskTypeId, selection, options, false);
}
            try {
                }

     */

                    setWizard(nestedTaskWizard);
    @Override
import org.jkiss.dbeaver.Log;
        if (button != null) {
            if (saveButton != null && !saveButton.isDisposed()) {
                    if (nextPage != null) {


        getWizard().initializeWizard(parent);
    private static final Log log = Log.getLog(TaskConfigurationWizardDialog.class);
    /**
    ) {

 *

    public static int openNewToolTaskDialog(
    @Override
    protected Set<PageCompletionMark> getShownCompletionMarks() {
        int navPagesNum = 0;
 *
        @NotNull DBPProject project,
     * @param selection - database objects to apply the task to
                }
        super.updateButtons();
        @NotNull IWorkbenchWindow window,
import org.eclipse.ui.IWorkbenchWindow;
    public TaskConfigurationWizardDialog(IWorkbenchWindow window) {
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
            }
    private boolean editMode;
        if (!selection.isEmpty() && wizard.getSettings() instanceof DBTTaskSettingsInput input) {
        return RuntimeUtils.isLinux();
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
     *

                getWizard().onWizardActivation();
 * You may obtain a copy of the License at


    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * you may not use this file except in compliance with the License.
    protected Control createContents(Composite parent) {
        Button button = getButton(IDialogConstants.BACK_ID);
            return taskEditPage;
 * limitations under the License.
        Button button = getButton(IDialogConstants.BACK_ID);
            button.setEnabled(false);
                log.error("Can't create task " + taskEditPage.getSelectedTaskType().getName() + " configuration wizard", e);
    @Override
        @NotNull String taskTypeId,
            }
        @NotNull IStructuredSelection selection,
        if (buttonId == IDialogConstants.NEXT_ID &&
     * @param window - workbench window to get parent shell from
    public boolean isEditMode() {
        if (selectorMode) {
            setFinishButtonLabel(TaskUIMessages.task_config_wizard_dialog_button_save);
    @Override
            newTaskWizard.isLastTaskPreconfigPage(getCurrentPage())
     * @return the return code
        });
        }
        if (wizard.canFinish()) {
 * Unless required by applicable law or agreed to in writing, software
    public TaskConfigurationWizardDialog(
 */
public class TaskConfigurationWizardDialog extends MultiPageWizardDialog {

                task.getProperties().put(TaskConstants.TOOL_TASK_PROP, true);
        return editMode;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param window - workbench window to get parent shell from
            List<Object> inputObjects = new ArrayList<>();

        if (getWizard().isNewTaskEditor() || getNavPagesCount() > 1) {
import java.util.*;
        }

     * Opens new task dialog
     * @param selection - database objects to apply the task to
        }

        @NotNull IWorkbenchWindow window,
     * @param taskTypeId - task id

    }

                    // Now we need to create real wizard, initialize it and inject in this dialog
    @Override
    public static int openNewTaskDialog(
    }
        setHelpAvailable(false);
        return getWizard().getCurrentTask();
    @Override
        @NotNull String taskTypeId,
    }
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
    protected Control createDialogArea(Composite parent) {

            DBTTaskConfigurator configurator = TaskUIRegistry.getInstance().createConfigurator(taskType);
            if (finishButton != null && !finishButton.isDisposed()) {

    public void updateButtons() {

        var wizard = getWizard();
        @NotNull DBPProject project,
    public TaskConfigurationWizard<?> getTaskWizard() {
import org.eclipse.jface.dialogs.IPageChangedListener;
        super.buttonPressed(buttonId);
    }
        getWizard().enableTaskButtons(true);
        }

    private TaskConfigurationWizard<?> nestedTaskWizard;
        }
            return EnumSet.noneOf(PageCompletionMark.class);
        this(window, wizard, StructuredSelection.EMPTY, Map.of());
        return getWizard().getStartingPage();
 * Copyright (C) 2010-2026 DBeaver Corp and others
            IWizardPage[] pages = getWizard().getPages();
        @NotNull DBPProject project,
    private boolean selectorMode;
            }
import org.eclipse.osgi.util.NLS;
        @NotNull TaskConfigurationWizard<?> wizard,
    }
    public DBTTask getTask() {
    @Override
                return;
        @NotNull String taskTypeId,
        super.createButtonsForButtonBar(parent);
        try {
     *
import org.jkiss.dbeaver.DBException;
    }
    protected boolean isDisableControlsOnRun() {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
            TaskConfigurationWizard<?> configWizard = configurator.createTaskConfigWizard(task);
        getWizard().enableTaskButtons(false);
import org.eclipse.swt.widgets.Control;
        }
        if (buttonId == SAVE_BUTTON_ID) {
            createButton(parent, SAVE_BUTTON_ID, TaskUIMessages.task_configuration_wizard_dialog_button_save, false).setEnabled(false);
    private static int openNewTaskDialogImpl(
                }

    /**
            task.setProperties(new HashMap<>());

/*
            }
        for (IWizardPage page2 : getWizard().getPages()) {
        }
    }
            return IDialogConstants.CANCEL_ID;
    ) {
    public void enableButtonsAfterProgress() {
            if (pages.length > 0 && pages[0] instanceof TaskConfigurationWizardPageTask) {

            return;

        if (getWizard().isCurrentTaskSaved()) {
/**
                if (wizard.getTaskType().isObjectApplicable(so)) {
        @NotNull DBPProject project,
        this(window, new NewTaskConfigurationWizard(), StructuredSelection.EMPTY, Map.of());
            @Override
        this.selectorMode = selectorMode;
        boolean isToolTask
import org.eclipse.jface.dialogs.PageChangedEvent;
            }
                    nestedTaskWizard = nextTaskWizard;
    protected boolean isModalWizard() {
    TaskConfigurationWizardPageTask getTaskPage() {

            }
            if (isToolTask) {
 * See the License for the specific language governing permissions and
                    IWizardPage nextPage = nestedTaskWizard.getNextPage(page);
    }
            if (configWizard != null) {
        @NotNull IWorkbenchWindow window,
        if (taskType == null) {
        @NotNull Map<String, Object> options,
import org.jkiss.dbeaver.registry.task.TaskConstants;
        } else {
    public void disableButtonsOnProgress() {
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;

        }
        @NotNull IWorkbenchWindow window,

    public static int openNewTaskDialog(
        super.enableButtonsAfterProgress();
        return super.createContents(parent);
 * DBeaver - Universal Database Manager
            }
    @Override
 * Task configuration wizard dialog
import org.jkiss.dbeaver.registry.task.TaskRegistry;
    @Override
    ) {


        @NotNull IStructuredSelection selection,
        @NotNull IStructuredSelection selection
     * Opens new task dialog
            showPage(nestedTaskWizard.getStartingPage());
            } catch (Exception e) {
            // Show first page of new wizard
            DBWorkbench.getPlatformUI().showError("Bad task type", "Task type '" + taskTypeId + "' not found");
        // Task management controls
    }
        return openNewTaskDialog(window, project, taskTypeId, selection, Map.of());
    protected IWizardPage getStartingPage() {
     * @param selection - database objects to apply the tool task to
        if (getWizard().isTaskSaveEnabled()) {
    }
    private TaskConfigurationWizardPageTask taskEditPage;
                navPagesNum++;
    public boolean isSelectorMode() {
