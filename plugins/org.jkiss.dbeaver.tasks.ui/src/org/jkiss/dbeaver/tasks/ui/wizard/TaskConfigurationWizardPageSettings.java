                log.debug(e);
import org.jkiss.dbeaver.tasks.ui.registry.TaskUIRegistry;
import org.eclipse.swt.widgets.Composite;
    public void deactivatePage() {

import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
    public boolean isPageApplicable() {

        }
    }
        if (taskType != null) {

            setTitle(curTaskType.getName());
    private void createTaskSettingsUI() {
    }

import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
            }
        if (curTaskType != null && TaskUIRegistry.getInstance().supportsConfigurator(curTaskType)) {
 *
            if (errorMessage != null) {
                        }
        updatePageCompletion();

        setErrorMessage(null);
        UIUtils.disposeChildControls(taskSettingsPlaceholder);
            taskConfigPanel.saveSettings();
        if (curTaskType == selectedTaskType) {
    public void createControl(Composite parent) {
                        taskConfigPanel.createControl(taskSettingsPlaceholder, taskWizard, this::updatePageCompletion);
    @Override

            }
                        TaskConfigurationWizard taskWizard = getTaskPage().getTaskWizard();
 * Unless required by applicable law or agreed to in writing, software
        }
                        if (getWizard().getCurrentTask() != null) {
        setControl(taskSettingsPlaceholder);
                        taskSettingsPlaceholder.layout(true, true);
    TaskConfigurationWizardPageSettings(DBTTask task) {
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
            String errorMessage = taskConfigPanel.getErrorMessage();
    public boolean isPageNavigable() {
    }
        taskSettingsPlaceholder = new Composite(parent, SWT.NONE);
        return true;
    protected boolean determinePageCompletion() {
        curTaskType = selectedTaskType;
import org.jkiss.dbeaver.model.exec.DBCException;
        super(task == null ? TaskUIMessages.task_config_wizard_page_settings_create_task : TaskUIMessages.task_config_wizard_page_settings_edit_task);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.wizard.IWizard;
    private DBTTaskType curTaskType;
        return currentTask != null ?
            setTitle(TaskUIMessages.task_config_wizard_page_settings_title_task_prop);
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;

        return getSelectedTaskType() != null;

 * limitations under the License.
        } else {
        DBTTaskType selectedTaskType = getSelectedTaskType();
            try {
 *     http://www.apache.org/licenses/LICENSE-2.0
            setDescription(TaskUIMessages.task_config_wizard_page_settings_descr_set_task);

    }

import org.jkiss.dbeaver.model.task.DBTTask;
                if (configurator instanceof DBTTaskConfigPanelProvider) {

    private DBTTaskType getSelectedTaskType() {
        }
    public void activatePage() {

    }
                            taskConfigPanel.loadSettings();
                    if (configPage != null) {

            } else {
            } catch (Exception e) {
/**
    @Override
    }
            getTaskPage().getSelectedTaskType();
                return TaskUIRegistry.getInstance().createConfigurator(selectedTaskType) instanceof DBTTaskConfigPanelProvider;
            } catch (DBCException e) {
        if (selectedTaskType != null && TaskUIRegistry.getInstance().supportsConfigurator(selectedTaskType)) {
    }
        if (curTaskType == null) {
        super.setWizard(newWizard);


        }
            return;
                setErrorMessage(NLS.bind(TaskUIMessages.task_configuration_wizard_page_settings_fill_parameters, curTaskType.getName()));
    @Override
            setDescription(NLS.bind(TaskUIMessages.task_config_wizard_page_settings_config,curTaskType.getName()));

 *
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanelProvider;
                }
    private DBTTaskConfigPanel taskConfigPanel;
                DBTTaskConfigurator configurator = TaskUIRegistry.getInstance().createConfigurator(curTaskType);
                    }
 */
        taskSettingsPlaceholder.setLayout(new FillLayout());
            return true;
            return false;
 * Page for task initial settings
    public void setWizard(IWizard newWizard) {
        if (getWizard() instanceof NewTaskConfigurationWizard) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
                return false;
                    DBTTaskConfigPanel configPage = ((DBTTaskConfigPanelProvider) configurator).createInputConfigurator(
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        if (taskConfigPanel != null && taskConfigPanel.isComplete()) {
    @Override
    }
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanel;
        if (taskConfigPanel != null && !taskConfigPanel.isComplete()) {
        }

import org.eclipse.swt.SWT;
 * See the License for the specific language governing permissions and
                        UIUtils.getDefaultRunnableContext(), curTaskType);
        // Update tree because task info changed
            setTitle(taskType.getName());
        }
import org.eclipse.osgi.util.NLS;
    }
                setErrorMessage(errorMessage);
            try {
        getWizard().getContainer().updateNavigationTree();
        setPageComplete(true);
 *
    @Override
/*
class TaskConfigurationWizardPageSettings extends ActiveWizardPage<TaskConfigurationWizard> implements IWizardPageNavigable {
        DBTTask currentTask = getWizard().getCurrentTask();
        createTaskSettingsUI();
    }
    }
    private static final Log log = Log.getLog(TaskConfigurationWizardPageSettings.class);
}
 */
 * You may obtain a copy of the License at
                        taskConfigPanel = configPage;
                DBWorkbench.getPlatformUI().showError("Task configurator error", "Error creating task configuration UI", e);
            currentTask.getType() :
        DBTTaskType taskType = ((TaskConfigurationWizard) newWizard).getTaskType();
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return false;
    @Override

    private TaskConfigurationWizardPageTask getTaskPage() {

    private Composite taskSettingsPlaceholder;
        }
        } else {
import org.eclipse.swt.layout.FillLayout;
            }
package org.jkiss.dbeaver.tasks.ui.wizard;
    @Override
        setTitle(getName());
        DBTTaskType selectedTaskType = getSelectedTaskType();
import org.jkiss.dbeaver.runtime.DBWorkbench;

        return ((TaskConfigurationWizardDialog) getContainer()).getTaskPage();
        }
import org.jkiss.dbeaver.model.task.DBTTaskType;
