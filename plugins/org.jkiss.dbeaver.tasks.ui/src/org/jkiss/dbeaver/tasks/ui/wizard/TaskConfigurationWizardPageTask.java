                return true;

        }
                if (folder != null) {

                    if (widgetToFocus != null && !widgetToFocus.isDisposed()) {
            formPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
                TreeColumn nameColumn = new TreeColumn(taskCategoryTree, SWT.LEFT);


            }
                                }
                taskCategoryTree = new Tree(formPanel, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);

            if (task2 != null) {
        updatePageCompletion();
            // We already have it
                    for (DBTTaskFolder taskFolder : tasksFolders) {
                    @Override
                    taskName = taskLabelText.getText();
                    infoPanel,
                            getWizard().getContainer().buttonPressed(IDialogConstants.NEXT_ID);
import org.eclipse.swt.widgets.*;
        }
            realWizard.setContainer(getContainer());

            DBTTask task2 = selectedProject.getTaskManager().getTaskByName(taskName);
    private Tree taskCategoryTree;
                taskCategoryTree.addPaintListener(e -> {
        if (selectedTaskType == null) {
                                }
    public void saveSettings() {
                null : activePart.getSite().getSelectionProvider().getSelection();
                    task.setTaskFolder(folder);
                DBTTaskFolder folder = DBUtils.findObject(taskFoldersList, selectedTaskFolderName);
                            if (itemData instanceof DBTTaskType) {
    public String getTaskDescription() {
 * See the License for the specific language governing permissions and
        return false;
    }
            item.setImage(0, DBeaverIcons.getImage(cat.getIcon() == null ? DBIcon.TREE_TASK : cat.getIcon()));
        }
import org.jkiss.dbeaver.model.DBUtils;
            if (!isTaskCategoryApplicable(cat)) {
        }
import org.eclipse.jface.dialogs.IDialogConstants;
    }
                    task == null ? "" : CommonUtils.notEmpty(task.getName()),
                if (currentTaskFolder != null) {
                continue;
        updatePageCompletion();
                        if (task.getTaskFolder() == null || !foldersComboText.equals(task.getTaskFolder().getName())) {
import org.jkiss.dbeaver.DBException;
                if (taskSaved) {
            if (task == null) {

                    UIUtils.createLabelText(infoPanel, TaskUIMessages.task_config_wizard_page_task_text_label_task_id, task.getId(), SWT.BORDER | SWT.READ_ONLY);
        TaskConfigurationWizard realWizard = taskWizards.get(selectedTaskType);
                        }
    }
        return false;
        if (!filterTaskTypes || selectedProject == null || !selectedProject.isRegistryLoaded()) {

                return true;
                infoPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
class TaskConfigurationWizardPageTask extends ActiveWizardPage<TaskConfigurationWizard> {
            TreeItem item = new TreeItem(parentItem, SWT.NONE);
                                selectedTaskType = null;

            this.taskDescription = this.task.getDescription();
                taskDescriptionText.setText(task == null ? "" : CommonUtils.notEmpty(task.getDescription()));
                List<DBTTaskFolder> taskFoldersList = Arrays.asList(tasksFolders != null ? tasksFolders : new DBTTaskFolder[0]);
        return isPageComplete();
        return selectedCategory;

            item.setExpanded(true);

            }
                });
                        if (currentSelectedTaskFolder != null) {
import org.eclipse.osgi.util.NLS;
        this.task = (TaskImpl) task;
            }
                task.setProperties(new LinkedHashMap<>());
                    DBTTaskType taskType = task.getType();
 * DBeaver - Universal Database Manager
        for (DBTTaskType child : category.getTaskTypes()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    folder.addTaskToFolder(task);
    }
        if (!(getWizard() instanceof NewTaskConfigurationWizard)) {
            Composite formPanel = UIUtils.createComposite(composite, task == null ? 1 : 2);
    private String taskDescription;
                    Composite catPanel = UIUtils.createComposite(infoPanel, 2);
                    infoPanel,
        }
            }
                    UIUtils.createLabel(catPanel, taskType.getCategory().getName());

                    }
    private String taskName;
                    public void mouseDoubleClick(MouseEvent e) {
                            updateTaskTypeSelection();
                    taskFoldersCombo.add(""); // Empty row as ability to remove task folder from task

    private Map<String, Object> initialProperties = new LinkedHashMap<>();
                                    return;
                                if (selectedCategory == itemData && selectedTaskType == null) {
            addTaskCategories(item, cat.getChildren());
                gd.heightHint = 100;

                    public void controlResized(ControlEvent e) {


                        UIUtils.drawMessageOverControl(taskCategoryTree, e, TaskUIMessages.task_config_wizard_page_task_no_task_types_available, 0);
                // (Because we can create folders with equal names in different projects)
            realWizard.init(workbenchWindow.getWorkbench(), selection instanceof IStructuredSelection ? (IStructuredSelection) selection : null);
    }
    private void updateTaskTypeSelection() {
        if (!filterTaskTypes) {
    @Override
    }
    }
    private boolean filterTaskTypes = true;
            // Change task folder in edit task case
            if (task == null) {
            IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
            this.selectedCategory = selectedTaskType.getCategory();
            }
    private DBTTaskCategory selectedCategory;
            item.setText(0, type.getName());
            this.taskName = this.task.getName();
    public String getTaskName() {
/*
        {
                    task.setTaskFolder(null);
                setErrorMessage(NLS.bind(TaskUIMessages.task_configuration_wizard_page_task_already_exists, taskName, selectedProject.getName()));
                    }
                TreeColumn descColumn = new TreeColumn(taskCategoryTree, SWT.RIGHT);

            }
    }
        return selectedTaskType;
    private final DBPProject selectedProject;
        for (DBTTaskCategory cat : categories) {
        getShell().layout(true, true);
            }
                        }
                });
                // Show only selected project folders list (not all projects folders) to avoid folder naming mess
                    }
                    currentTaskFolder.removeTaskFromFolder(task);
            setErrorMessage(TaskUIMessages.task_configuration_wizard_page_task_error_message_enter_task_name);
            return getWizard();
        for (DBTTaskType type : taskTypes) {
 *
                    });
            }
                if (task != null && !CommonUtils.isEmpty(task.getId())) {
                taskDescriptionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.task.*;
        return true;
                            taskFoldersCombo.setText(currentSelectedTaskFolder.getName());

            setErrorMessage(TaskUIMessages.task_configuration_wizard_page_task_enter_type);
                DBTTaskFolder[] tasksFolders = taskManager.getTasksFolders();
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        if (type.isStandalone()) {
        for (DBTTaskCategory child : category.getChildren()) {

                    modifyListener.modifyText(e);
                    UIUtils.createControlLabel(infoPanel, TaskUIMessages.task_config_wizard_page_task_control_label_category);
                        if (canFlipToNextPage()) {
                taskDescriptionText = new Text(infoPanel, SWT.BORDER | SWT.MULTI);
        }
import org.eclipse.ui.IWorkbenchPart;
            ISelection selection = activePart == null || activePart.getSite() == null || activePart.getSite().getSelectionProvider() == null ?
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Text taskDescriptionText;
            item.setText(1, CommonUtils.notEmpty(cat.getDescription()));
            }
                        UIUtils.packColumns(taskCategoryTree, true, new float[] { 0.3f, 0.7f });
                    public void widgetSelected(SelectionEvent e) {
                    TaskUIMessages.task_config_wizard_page_task_control_label_descr
 * limitations under the License.
import org.jkiss.dbeaver.tasks.ui.registry.TaskUIRegistry;
                    SWT.BORDER
                nameColumn.setText("Task");

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
                    taskDescription = taskDescriptionText.getText();


                        }
                descColumn.setText("Description");
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public Map<String, Object> getInitialProperties() {
                continue;

    TaskConfigurationWizardPageTask(DBTTask task) {
        setPageComplete(this.task != null);
    }

                                    return;
                UIUtils.createControlLabel(infoPanel, TaskUIMessages.task_config_wizard_page_task_create_folder_label);


        setDescription(TaskUIMessages.task_config_wizard_page_settings_descr_set_task);
                }
            item.setText(1, CommonUtils.notEmpty(type.getDescription()));
                return false;
                    UIUtils.createLabel(typePanel, taskType.getName());
                });
                }
import org.jkiss.dbeaver.model.app.DBPProject;
                taskFoldersCombo = new Combo(infoPanel, SWT.DROP_DOWN | SWT.READ_ONLY);
                // Set current task folder name for Edit dialog or selected folder from new created from context menu task
            return false;

        return realWizard;
    private void addTaskTypes(TreeItem parentItem, DBTTaskCategory category) {
package org.jkiss.dbeaver.tasks.ui.wizard;
                }
                });
                    }
            item.setText(0, cat.getName());
    private Text taskLabelText;
            if (type.isDriverApplicable(ds.getDriver())) {
                    @Override
                        if (selection.length == 1) {
                    taskFoldersCombo.addModifyListener(e -> {

    public DBTTaskCategory getSelectedCategory() {
                    taskFoldersCombo.setText(task.getTaskFolder().getName());
                });
                            } else {
            task.setDescription(taskDescriptionText.getText());
                item.setImage(0, DBeaverIcons.getImage(type.getIcon()));

                        String foldersComboText = taskFoldersCombo.getText();

                    Composite typePanel = UIUtils.createComposite(infoPanel, 2);
        }
                }
                    UIUtils.createLabel(typePanel, taskType.getIcon());
                        taskFoldersCombo.add(taskFolder.getName());
                    //taskLabelText.setEnabled(false);
        if (CommonUtils.isEmpty(taskName)) {
    private void addTaskCategories(TreeItem parentItem, DBTTaskCategory[] categories) {
        allCats.sort(Comparator.comparing(DBTTaskCategory::getName));
        if (task == null) {
        }
import org.eclipse.swt.layout.GridData;
        return taskName;
        }
        return taskDescription;
                GridData gd = new GridData(GridData.FILL_BOTH);
        if (task != null) {
    private DBTTaskType selectedTaskType;

                Composite infoPanel = UIUtils.createComposite(formPanel, 2);
    public void createControl(Composite parent) {
        boolean taskSaved = task != null && !CommonUtils.isEmpty(task.getId());
                gd.widthHint = 200;
                                selectedCategory = selectedTaskType.getCategory();

                if (task != null) {
            item.setData(cat);
    private boolean isTaskTypeApplicable(DBTTaskType type) {
import java.util.List;
            if (isTaskCategoryApplicable(child)) {
                            }
        if (this.task != null) {
                }
                if (!ArrayUtils.isEmpty(tasksFolders)) {
        super(task == null ? TaskUIMessages.task_config_wizard_page_settings_create_task : TaskUIMessages.task_config_wizard_page_settings_edit_task);
 *
    private static final Log log = Log.getLog(TaskConfigurationWizardPageTask.class);
import org.jkiss.dbeaver.ui.UIUtils;
import java.util.*;
                    }
            }
                }
 */
                taskCategoryTree.addMouseListener(new MouseAdapter() {
            addTaskTypes(item, cat);
    private Combo taskFoldersCombo;

        setControl(composite);
                    }
                taskCategoryTree.setLayoutData(gd);

                        TreeItem[] selection = taskCategoryTree.getSelection();
            IWorkbenchPart activePart = workbenchWindow.getActivePage().getActivePart();
                                if (selectedTaskType == itemData) {
                }
            realWizard = configurator.createTaskConfigWizard(task);
            this.selectedTaskFolderName = this.task.getTaskFolder() != null ? this.task.getTaskFolder().getName() : null;

            task.setName(taskLabelText.getText());
                taskCategoryTree.addControlListener(new ControlAdapter() {
                if (task != null) {
        List<DBTTaskCategory> allCats = Arrays.asList(categories);
        }
                taskLabelText = UIUtils.createLabelText(
 *
            return true;
            taskWizards.put(selectedTaskType, realWizard);
        Composite composite = UIUtils.createComposite(parent, 1);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private TaskImpl task;
    public boolean canFlipToNextPage() {
    private Map<DBTTaskType, TaskConfigurationWizard> taskWizards = new HashMap<>();
    protected boolean determinePageCompletion() {
                taskFoldersCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Arrays.sort(taskTypes, Comparator.comparing(DBTTaskType::getName));
        return initialProperties;
                ).setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                //((GridData) taskDescriptionText.getLayoutData()).heightHint = taskDescriptionText.getLineHeight() * 6;
    }

                    if (taskCategoryTree.getItemCount() == 0) {
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
    }
import org.eclipse.swt.events.*;
            return true;
import org.jkiss.dbeaver.registry.task.TaskRegistry;
        DBTTaskType[] taskTypes = category.getTaskTypes();
        if (task != null && selectedTaskType != null) {
                    if (wizard != null) {

                    Text widgetToFocus = taskSaved ? taskDescriptionText : taskLabelText;

        setErrorMessage(null);
 * you may not use this file except in compliance with the License.
                    modifyListener.modifyText(e);
            }
                });
            String taskFolderName = taskFoldersCombo.getText();
                            Object itemData = selection[0].getData();
                } else {
            TreeItem item = parentItem == null ? new TreeItem(taskCategoryTree, SWT.NONE) : new TreeItem(parentItem, SWT.NONE);
                }
        }
    public DBTTaskType getSelectedTaskType() {
                    TaskUIMessages.task_config_wizard_page_task_text_label_name,
        for (DBPDataSourceContainer ds : selectedProject.getDataSourceRegistry().getDataSources()) {
                        taskCategoryTree.removeControlListener(this);
                DBTTaskManager taskManager = selectedProject.getTaskManager();

                taskLabelText.addModifyListener(e -> {

 * Create task wizard page
    }
                ModifyListener modifyListener = e -> updatePageCompletion();

import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
            }
    @Override
            if (isTaskTypeApplicable(child)) {
                        }
    }
import org.eclipse.swt.SWT;

            if (selectedTaskFolderName != null) {
                return true;
                task.setType(selectedTaskType);
    @Override
import org.jkiss.dbeaver.registry.task.TaskImpl;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    private boolean isTaskCategoryApplicable(DBTTaskCategory category) {
    private String selectedTaskFolderName;
 */
                    taskLabelText.setEditable(false);
            return true;
 * You may obtain a copy of the License at
        getWizard().getContainer().updateButtons();
    }

            this.selectedTaskType = this.task.getType();
                DBTTaskFolder currentTaskFolder = task.getTaskFolder();
                UIUtils.createControlLabel(
                    @Override
}
        setTitle(task == null ? TaskUIMessages.task_config_wizard_page_task_title_new_task_prop : TaskUIMessages.task_config_wizard_page_settings_title_task_prop);

                UIUtils.asyncExec(() -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            selectedTaskFolderName = foldersComboText;
                DBTTaskFolder[] tasksFolders = selectedProject.getTaskManager().getTasksFolders();
                // Check task folder changing in Edit task dialog
                if (task != null && task.getTaskFolder() != null) {
        }
            if (!isTaskTypeApplicable(type)) {
import org.eclipse.jface.viewers.IStructuredSelection;
        }

                addTaskCategories(null, TaskRegistry.getInstance().getRootCategories());

            DBTTaskConfigurator configurator = TaskUIRegistry.getInstance().createConfigurator(selectedTaskType);
                task = (TaskImpl) selectedProject.getTaskManager().createTask(selectedTaskType, CommonUtils.notEmpty(taskName), taskDescription, taskFolderName, new LinkedHashMap<>());
            //UIUtils.createControlLabel(formPanel, TaskUIMessages.task_config_wizard_page_task_label_task_type, task == null ? 1 : 2);
            if (task.getType() != selectedTaskType) {
            item.setData(type);

                UIUtils.asyncExec(() -> UIUtils.packColumns(taskCategoryTree, true, new float[] { 0.3f, 0.7f}));
/**
        }

                                selectedCategory = (DBTTaskCategory) itemData;
                        DBTTaskFolder currentSelectedTaskFolder = wizard.getCurrentSelectedTaskFolder();
                    TaskConfigurationWizard wizard = getWizard();
        }
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
            if (type.getIcon() != null) {
                TaskRegistry.getInstance().notifyTaskFoldersListeners(new DBTTaskFolderEvent(folder, DBTTaskFolderEvent.Action.TASK_FOLDER_REMOVE));
import org.eclipse.jface.viewers.ISelection;
                taskCategoryTree.addSelectionListener(new SelectionAdapter() {
                    }
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.utils.ArrayUtils;
        }
    public TaskConfigurationWizard getTaskWizard() throws DBException {
    }
                taskDescriptionText.addModifyListener(e -> {
            task.setType(selectedTaskType);
    }
                                selectedTaskType = (DBTTaskType) itemData;
                } else if (task == null) {
            return false;

        if (realWizard == null) {

                });
import org.eclipse.ui.IWorkbenchWindow;
                        widgetToFocus.setFocus();
                    UIUtils.createLabel(catPanel, taskType.getCategory().getIcon());
        this.selectedProject = NavigatorUtils.getSelectedProject();
                );
                    UIUtils.createControlLabel(infoPanel, TaskUIMessages.task_config_wizard_page_task_control_label_type);
            {
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
