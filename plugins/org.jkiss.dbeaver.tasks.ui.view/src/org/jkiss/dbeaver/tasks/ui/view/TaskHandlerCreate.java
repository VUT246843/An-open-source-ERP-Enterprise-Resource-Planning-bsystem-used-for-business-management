 */
                DBTTaskConfigurator configurator = dialog.getSelectedCategory().createConfigurator();
                    taskManager.deleteTaskConfiguration(task);
    @Override
                if (structuredSelection.size() == 1 && structuredSelection.getFirstElement() instanceof DBTTaskFolder) {
                    dialog.getTaskDescription(),
}import org.eclipse.ui.handlers.HandlerUtil;
        TaskConfigurationWizardDialog dialog = new TaskConfigurationWizardDialog(HandlerUtil.getActiveWorkbenchWindow(event));
 * You may obtain a copy of the License at
import org.eclipse.jface.viewers.IStructuredSelection;
                DBTTask task = taskManager.createTask(
 * Unless required by applicable law or agreed to in writing, software

                if (!configurator.createTaskConfigWizard(task)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
*/
        TaskConfigurationWizard taskWizard = dialog.getTaskWizard();
        }
                    dialog.getTaskName(),
 * See the License for the specific language governing permissions and
 * limitations under the License.

            } else {

                    // We need to throw this information about the choice of task folder in TaskConfigurationWizardPageTask
        return null;
                DBWorkbench.getPlatformUI().showError("Create task failed", "Error while creating new task", e);
    public Object execute(ExecutionEvent event) {
                IStructuredSelection structuredSelection = (IStructuredSelection) selection;
    }
            }
                    dialog.getInitialProperties());
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        if (dialog.open() == IDialogConstants.OK_ID) {
import org.eclipse.core.commands.ExecutionEvent;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (task != null) {
                taskWizard.setCurrentSelectedTaskFolder(null);
                TaskFeatures.TASKS_CREATE.use(Map.of("type", task.getType().getId()));
            DBTTask task = dialog.getTask();
        }
            final ISelection selection = HandlerUtil.getCurrentSelection(event);
                    dialog.getSelectedTaskType(),
 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.tasks.ui.view;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.tasks.ui.TaskFeatures;
import org.eclipse.jface.viewers.ISelection;
            if (selection instanceof IStructuredSelection) {
                }

 * distributed under the License is distributed on an "AS IS" BASIS,
public class TaskHandlerCreate extends AbstractHandler {
                    taskWizard.setCurrentSelectedTaskFolder((DBTTaskFolder) structuredSelection.getFirstElement());
 * DBeaver - Universal Database Manager

        if (taskWizard != null) {
import org.eclipse.core.commands.AbstractHandler;
/*
/*
            try {
import java.util.Map;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            } catch (Exception e) {
import org.eclipse.jface.dialogs.IDialogConstants;
 *
            }
                }
import org.jkiss.dbeaver.model.task.DBTTaskFolder;
import org.jkiss.dbeaver.model.task.DBTTask;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
