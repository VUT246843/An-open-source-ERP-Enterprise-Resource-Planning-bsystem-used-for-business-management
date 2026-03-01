            if (getCurrentTask() == null) {
                    }
    public void addPages() {
public abstract class TaskConfigurationWizard<SETTINGS extends DBTTaskSettings> extends BaseWizard implements IWorkbenchWizard {
        return true;
    private static final String TASKS_VIEW_ID = "org.jkiss.dbeaver.tasks";
    protected abstract String getDefaultWindowTitle();

import org.jkiss.dbeaver.tasks.ui.registry.TaskUIRegistry;
            if (actionsConfigurator != null) {

import org.jkiss.dbeaver.registry.task.TaskConstants;
                // Execute directly in wizard
    }
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
import org.eclipse.swt.widgets.Event;
    }
    }
    public IStructuredSelection getCurrentSelection() {
                DBWorkbench.getPlatformUI().showError("No task type", "Can't find task type " + getTaskTypeId());
        EditTaskVariablesDialog dialog = new EditTaskVariablesDialog(getContainer().getShell(), Map.of(currentTask, variables));
        return (TaskConfigurationWizardDialog) super.getContainer();
        final Button promptTaskVariablesCheckbox = UIUtils.createCheckbox(
                taskType,
                return false;
            UIUtils.createEmptyLabel(parent, hSpan, 1);
    protected boolean saveConfigurationToTask(DBTTask theTask) {
    public boolean isTaskSaveEnabled() {
        if (variables == null) {
        return getCurrentTask() != null && !getCurrentTask().isTemporary() && !getContainer().isSelectorMode();
 * distributed under the License is distributed on an "AS IS" BASIS,
    public IWizardPage getStartingPage() {
    private TaskConfigurationWIzardActionConfigurator<SETTINGS> actionsConfigurator;
        return currentTask;


        }
        return currentSelectedTaskFolder;
        try {
        TaskConfigurationWizardPageTask taskPage = getContainer().getTaskPage();
                getProject(),
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)) {
            return false;

    protected Map<String, Object> getTaskVariables() {
                    public void widgetSelected(SelectionEvent e) {
    }
                    } catch (DBException e) {
    protected void saveTaskContext(DBCExecutionContext executionContext) {
            // Start from second page for task editor

    }
            }

            !TaskUIRegistry.getInstance().supportsConfiguratorPage(getContainer().getTaskPage().getSelectedTaskType()))
            }
            GridLayout layout = new GridLayout(1, false);
            if (context != null) {
            if (actionsConfigurator == null) {
        if (isRunTaskOnFinish()) {


            } else {
                panel,
    public IWizardPage getNextPage(IWizardPage page) {
            TaskUIMessages.task_config_wizard_button_variables_prompt_tip,

 * You may obtain a copy of the License at
    }

            if (isPageNeedsCompletion(page) && isPageValid(page) && !page.isPageComplete()) {
        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

            EditTaskConfigurationDialog dialog = new EditTaskConfigurationDialog(
                return false;
        }
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            // Do not create save buttons
                TaskUIMessages.task_config_wizard_link_open_tasks_view,
        IWizardPage currentPage = getContainer().getCurrentPage();
        if (dialog.open() == IDialogConstants.OK_ID) {
            if (parent.getLayout() instanceof GridLayout) {
    }
            return getNextPage(nextPage);
        if (isTaskEditor()) {
            DBWorkbench.getPlatformUI().showError("Task run error", e.getMessage(), e);
    public boolean canFinish() {
    }
                taskContext = DBTaskUtils.loadTaskContext(currentTask.getProperties());
                panel.setLayoutData(gd);
    }
    boolean saveTask() {
        return currentTask != null ? currentTask.getProject() : NavigatorUtils.getSelectedProject();
import org.jkiss.dbeaver.ui.UIUtils;
        });
            DBTTaskType taskType = getTaskType();
                    }

    @Override

 * limitations under the License.
    protected TaskConfigurationWizard(@Nullable DBTTask task) {
                null,
                }

    @Override
            public void widgetSelected(SelectionEvent e) {
        return new TaskConfigurationWizardDialog(window, this, selection, options);
                    try {
            // Task editor. Add first page
    
            }

    @Override
        if (currentPage instanceof IWizardPageActive) {

    public boolean performFinish() {

            Composite panel = new Composite(parent, SWT.NONE);
        // Save task
import org.eclipse.jface.viewers.IStructuredSelection;
        if (prevPage instanceof TaskConfigurationWizardPageSettings &&
    @Nullable
    protected void updateWizardTitle() {
        IWizardPage prevPage = super.getPreviousPage(page);

                }
    public void setCurrentTask(DBTTask currentTask) {
            // Skip settings page (not supported by task type)
        } catch (DBException e) {

                    }
    }
    }
    public void createTaskActions(Composite parent, int hSpan) {
import org.eclipse.ui.views.IViewDescriptor;
    public boolean isNewTaskEditor() {
                UIUtils.createPushButton(panel,  null, null, UIIcon.SQL_VARIABLE, new SelectionAdapter() {
                        configurator = descriptor.createConfigurator();
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            theTask.getProject().getTaskManager().updateTaskConfiguration(theTask);
            }
            1,
        return true;
    public boolean isRunTaskOnFinish() {
            actionsConfigurator.enableActions(enable);
            group,
        );
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
            TaskWizardExecutor executor = new TaskWizardExecutor(getRunnableContext(), task, log, System.out);
            taskEditorDisabled = true;
            actionsConfigurator.updateActions();
        return taskContext;
import org.eclipse.swt.graphics.Image;
    @Nullable
    }
        Composite group = UIUtils.createTitledComposite(
    private IStructuredSelection currentSelection;
        this.currentSelection = currentSelection;
        }
        DBTTask currentTask = getCurrentTask();
                variables = DBTaskUtils.getVariables(currentTask);
import org.jkiss.code.Nullable;
    @NotNull
            if (!saveTask()) {
                    } catch (PartInitException e1) {
            return getNextPage(startingPage);
import org.eclipse.swt.events.SelectionListener;

                if (descriptor != null) {
import org.jkiss.dbeaver.model.app.DBPProject;
 *
        if (taskContext == null) {

    }
                variables = new LinkedHashMap<>();

        addTaskConfigPages();
        return true;
            TaskUIMessages.task_config_wizard_button_variables,

        promptTaskVariablesCheckbox.addSelectionListener(new SelectionAdapter() {
                    @SuppressWarnings("unchecked")
        }
            }
            taskViewButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        }
                task.getProject().getTaskManager().scheduleTask(task, executor);
        }
        return page instanceof TaskConfigurationWizardPageTask || page instanceof TaskConfigurationWizardPageSettings;
        IWizardPage nextPage = super.getNextPage(page);
                promptVariables = promptTaskVariablesCheckbox.getSelection();
            );
        }
    }
        } else {
import java.util.LinkedHashMap;
            }
    }
    }
                        log.debug("Error creating actions configurator", e);
            panel.setLayout(layout);
            if (supportsVariables) {
        } else {
    protected TaskConfigurationWizard() {
                    .getDescriptor(TaskConfigurationWIzardActionConfigurator.class.getName());
            );


        return true;
    public IWizardPage getPreviousPage(IWizardPage page) {
 * DBeaver - Universal Database Manager
                    state.put(DBTaskUtils.TASK_PROMPT_VARIABLES, true);

    }
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
}            @Override
@SuppressWarnings("rawtypes")
    protected boolean runTask() {
                }
    private boolean taskEditorDisabled;

    @Override
/*
                getContainer().getShell(),
    protected abstract SETTINGS getSettings();
            return runTask();
            if (dialog.open() == IDialogConstants.OK_ID) {
        this.currentTask = task;
        for (IWizardPage page : getPages()) {
import org.eclipse.swt.SWT;
import org.jkiss.code.NotNull;
        setNeedsProgressMonitor(true);
import org.eclipse.swt.layout.GridData;
        setWindowTitle(wizTitle);
            ((IWizardPageActive) currentPage).deactivatePage();

            getCurrentTask().getProperties().getOrDefault(TaskConstants.TOOL_TASK_PROP, false).equals(true);
        DBTTask theTask = currentTask;
            // Create new task
        if (enable) {
            // Run task thru task manager
            currentTask != null && CommonUtils.toBoolean(currentTask.getProperties().get(DBTaskUtils.TASK_PROMPT_VARIABLES)),
        try {
        }
    @Override
                DBTaskUtils.setVariables(state, getTaskVariables());
        }
            boolean supportsVariables = false;//getTaskType().supportsVariables();
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
            }
        }
    public void onWizardActivation() {

import org.jkiss.dbeaver.model.rm.RMConstants;
        return prevPage;
    public TaskConfigurationWizardDialog getContainer() {
                    @Override
                layout.numColumns++;
    ) {
        UIUtils.createDialogButton(
    }

        updateWizardTitle();

            return false;
        if (nextPage instanceof TaskConfigurationWizardPageSettings &&

    }
    }
    }
        return getCurrentTask() != null &&
        return nextPage;
    }
        getContainer().addPageChangedListener(event -> updateWizardTitle());
    private void configureVariables() {
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;

    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
                IObjectPropertyConfigurator<?, ?> configurator = null;

        if (actionsConfigurator != null) {
        );

 *
    protected boolean isPageNeedsCompletion(IWizardPage page) {
                executor.executeTask();
            }
            // Skip settings page (not supported by task type)
    public DBTTaskContext getTaskContext() {
import java.util.Map;
        if (tasksViewDescriptor == null || getContainer().isSelectorMode()) {

        {
import org.jkiss.dbeaver.ui.dialogs.IWizardPageActive;


        Map<String, Object> variables = getTaskVariables();
        }
    private DBTTaskContext taskContext;
                        configureVariables();
            TaskConfigurationWizardPageTask taskPage = getContainer().getTaskPage();
        }
        }
    protected boolean isPageValid(IWizardPage page) {

    public void setCurrentSelectedTaskFolder(@Nullable DBTTaskFolder taskFolder) {
            theTask.setProperties(state);
        }

                currentTask != null ? currentTask.getMaxExecutionTime() : Duration.ZERO

                    try {
    }
    public void createVariablesEditButton(Composite parent) {

 */
    }
            }
            }
            addPage(new TaskConfigurationWizardPageSettings(getCurrentTask()));
                if (configurator instanceof TaskConfigurationWIzardActionConfigurator<?> configurator1) {
            } else {

        if (currentTask == null || currentTask.isTemporary()) {
            return false;
        @NotNull IWorkbenchWindow window,
import org.eclipse.swt.widgets.Button;
        // Save current page settings
    private static final Log log = Log.getLog(TaskConfigurationWizard.class);
            return getPreviousPage(prevPage);
            }
        }
            }
            } else {
                    var actionsConfigurator = (TaskConfigurationWIzardActionConfigurator<SETTINGS>) configurator1;
        return saveConfigurationToTask(theTask);
        }
    }
    private Map<String, Object> variables;
    }
            this.variables = dialog.getVariables(currentTask);
        }

    public DBTTaskType getTaskType() {
        if (isCurrentTaskSaved()) {
        if (taskPage != null && !taskPage.isPageComplete()) {
    protected void addTaskConfigPages() {
            if (currentTask != null) {
        updateWizardTitle();

            wizTitle += " - [" + (taskPage == null ? currentTask.getName() : taskPage.getTaskName()) + "]";
            if (currentTask != null) {
        @NotNull Map<String, Object> options
            DBWorkbench.getPlatformUI().showError("Task save error", "Error saving task configuration", e);
        if (page instanceof TaskConfigurationWizardPageTask) {
        if (getContainer().isEditMode()) {
    }
    private boolean promptVariables;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (task == null) {
            }
    public DBTTaskFolder getCurrentSelectedTaskFolder() {
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.*;
    }
    }

            taskViewButton.setImage(viewImage);
            ((IWizardPageActive) currentPage).activatePage();
            saveTaskState(getRunnableContext(), theTask, state);
            TaskUIMessages.task_config_wizard_button_variables_configure,
            DBTTask task = getCurrentTask();
    }

 * See the License for the specific language governing permissions and
                task = getProject().getTaskManager().createTemporaryTask(getTaskType(), getWindowTitle());

        }
import org.jkiss.dbeaver.Log;
                    this.actionsConfigurator = actionsConfigurator;
                return false;
            if (taskType == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return currentTask != null && getProject().getTaskManager().getTaskById(currentTask.getId()) == null;
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    public DBTTask getCurrentTask() {
            Map<String, Object> state = new LinkedHashMap<>();
    }
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        UIUtils.getActiveWorkbenchWindow().getActivePage().showView(tasksViewDescriptor.getId());
            return false;
        IWizardPage startingPage = super.getStartingPage();
        promptTaskVariablesCheckbox.notifyListeners(SWT.Selection, new Event());
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
    }
        // If we are in task edit mode then add special first page.


    }
import org.eclipse.swt.widgets.Composite;

            return true;
                        DBWorkbench.getPlatformUI().showError("Show view", "Error opening database tasks view", e1);
    public DBPProject getProject() {
                return false;


    protected boolean isTaskConfigPage(IWizardPage page) {
        }
import java.time.Duration;
            TaskConfigurationWizardPageTask taskPage = getContainer() == null ? null : getContainer().getTaskPage();
        } catch (DBException e) {


                SelectionListener.widgetSelectedAdapter(e -> {
            group,
import org.jkiss.utils.CommonUtils;
        taskContext = DBTaskUtils.extractContext(executionContext);
    }
                gd.horizontalSpan = hSpan;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING
            !TaskUIRegistry.getInstance().supportsConfiguratorPage(getContainer().getTaskPage().getSelectedTaskType()))
        return variables;

            layout.numColumns++;
                })
        return true;
    public abstract void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) throws DBException;
        if (isTaskEditor() && !currentTask.isTemporary()) {
import org.eclipse.jface.wizard.IWizardPage;
        return currentTask != null;
        return TaskRegistry.getInstance().getTaskType(getTaskTypeId());

import org.jkiss.dbeaver.ui.dialogs.BaseWizard;
            if (theTask.getType().supportsVariables()) {
        }


        return getCurrentTask() != null && getCurrentTask().getProject().getTaskManager().getTaskById(getCurrentTask().getId()) != null;
    public boolean isTaskEditor() {
                if (promptVariables) {
                setCurrentTask(currentTask = dialog.getTask());
            1
            updateTaskButtons();
    }
                });
            addPage(new TaskConfigurationWizardPageTask(getCurrentTask()));
    public boolean isCurrentTaskSaved() {
        if (actionsConfigurator != null) {
            parent,
                DBTaskUtils.saveTaskContext(state, context);
import org.jkiss.dbeaver.ui.UIIcon;
        return currentSelection;
            SelectionListener.widgetSelectedAdapter(e -> configureVariables()));
            if (taskPage != null) {
                actionsConfigurator.createControl(panel, this, this::updateTaskButtons);
    }
        IViewDescriptor tasksViewDescriptor = PlatformUI.getWorkbench().getViewRegistry().find(TASKS_VIEW_ID);
            taskViewButton.addDisposeListener(e -> viewImage.dispose());
        if (page instanceof IWizardPageNavigable pageNavigable && !pageNavigable.isPageApplicable()) {
        {
            panel.setBackground(parent.getBackground());
        this.currentTask = currentTask;
    @Override
import org.jkiss.dbeaver.registry.task.TaskRegistry;
            page instanceof TaskConfigurationWizardPageTask &&
import org.jkiss.dbeaver.model.task.*;
        }
        // Do not add it if this is an ew task wizard (because this page is added separately)
        if (currentTask != null && !currentTask.isTemporary()) {
    public void updateTaskButtons() {
        }
            DBTTaskContext context = getTaskContext();
    }

        return !taskEditorDisabled;
            // Pass executor to visualize task progress in UI
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
        this.currentSelectedTaskFolder = taskFolder;
    @Override
        getContainer().updateButtons();
    public TaskConfigurationWizardDialog createWizardDialog(

    protected void initializeWizard(Composite parent) {
    public abstract String getTaskTypeId();
            return false;
                taskPage.saveSettings();
    @Nullable private DBTTaskFolder currentSelectedTaskFolder;
    void enableTaskButtons(boolean enable) {

            TaskUIMessages.task_config_wizard_button_variables_prompt,
 * Unless required by applicable law or agreed to in writing, software
        String wizTitle = getDefaultWindowTitle();
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                null,
            Button taskViewButton = UIUtils.createPushButton(
import org.eclipse.swt.events.SelectionAdapter;
    }
 *
    protected boolean isToolTask() {
            }
            Image viewImage = tasksViewDescriptor.getImageDescriptor().createImage();
package org.jkiss.dbeaver.tasks.ui.wizard;
                UIPropertyConfiguratorDescriptor descriptor = UIPropertyConfiguratorRegistry.getInstance()
                saveConfigurationToTask(task);
        super.addPages();

    private DBTTask currentTask;

        return startingPage;
            return;
        }
        }
        @NotNull IStructuredSelection selection,

    }
            }
            }
