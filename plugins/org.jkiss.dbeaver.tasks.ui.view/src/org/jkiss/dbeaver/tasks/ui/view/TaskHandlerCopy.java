 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 */
                    break;
            }
                                }
                            UIUtils.asyncExec(() -> {
                                tasksTree.getViewer().setSelection(new StructuredSelection(newTask), true);
                            oldTask.getTaskFolder() != null ? oldTask.getTaskFolder().getName() : null,
            Object firstElement = structSelection.getFirstElement();
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
        if (selection instanceof IStructuredSelection) {
import org.eclipse.swt.SWT;
                        DBTTask newTask = taskManager.createTask(
                        UIUtils.showMessageBox(HandlerUtil.getActiveShell(event), "Duplicate task name", "Task '" + newTaskName + "' already exists", SWT.ICON_ERROR);
                        taskManager.updateTaskConfiguration(newTask);

 * DBeaver - Universal Database Manager
    }
import org.eclipse.jface.viewers.ISelection;

                for (;;) {
                    } catch (DBException e) {
                                ActionUtils.runCommand(DatabaseTasksView.EDIT_TASK_CMD_ID, activePart.getSite());
import org.eclipse.core.commands.ExecutionException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                    return;
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
import org.eclipse.ui.handlers.HandlerUtil;
 *

import org.jkiss.dbeaver.model.task.DBTTask;
        return null;
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    }
import org.jkiss.dbeaver.DBException;
                            BeanUtils.deepCopy(oldTask.getProperties())
public class TaskHandlerCopy extends AbstractHandler {
                            });
}import org.eclipse.jface.viewers.StructuredSelection;
import org.jkiss.dbeaver.ui.ActionUtils;
                        continue;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionEvent;
                                if (tasksTree == null) {
                        );

                    try {
                        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
            if (firstElement instanceof DBTTask) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
                            oldTask.getDescription(),
                            oldTask.getType(),
import org.jkiss.utils.BeanUtils;
                        }
                                DatabaseTasksTree tasksTree = ((DatabaseTasksView) activePart).getTasksTree();
                    DBTTaskManager taskManager = oldTask.getProject().getTaskManager();
 * See the License for the specific language governing permissions and
 *
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

        final ISelection selection = HandlerUtil.getCurrentSelection(event);
package org.jkiss.dbeaver.tasks.ui.view;
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.jface.viewers.IStructuredSelection;
                        return null;
                DBTTask oldTask = (DBTTask) firstElement;
            IStructuredSelection structSelection = (IStructuredSelection)selection;
 *
                    EnterNameDialog taskNameDialog = new EnterNameDialog(HandlerUtil.getActiveShell(event), TaskUIViewMessages.task_handler_copy_name_dialog_enter_task, oldTask.getName());

                            newTaskName,
import org.eclipse.ui.IWorkbenchPart;
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;
                }
import org.jkiss.dbeaver.model.task.DBTTaskManager;
                    String newTaskName = taskNameDialog.chooseName();
                    if (newTaskName == null) {
                        if (activePart instanceof DatabaseTasksView) {
import org.jkiss.dbeaver.ui.UIUtils;
                    if (taskManager.getTaskByName(newTaskName) != null) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.AbstractHandler;
                        DBWorkbench.getPlatformUI().showError("Task copy error", "Error copying task '" + oldTask.getName() + "'", e);
