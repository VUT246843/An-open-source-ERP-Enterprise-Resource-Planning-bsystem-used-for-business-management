        String taskId = CommonUtils.toString(parameters.get("task"));
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;

 * you may not use this file except in compliance with the License.
    }
                if (element instanceof DBTTask) {
            if (dialog.open() != IDialogConstants.OK_ID) {
    private static boolean confirmTaskVariables(@NotNull DBTTask task) {




import org.jkiss.dbeaver.tasks.ui.wizard.EditTaskVariablesDialog;
                task,

        }
import java.util.LinkedHashMap;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskProcessorUI;
 * limitations under the License.
            final ISelection selection = HandlerUtil.getCurrentSelection(event);
            DBWorkbench.getPlatformUI().showError("Task run", "Error running task '" + task.getName() + "'", e);
 *
 * DBeaver - Universal Database Manager
}        if (!CommonUtils.isEmpty(taskId)) {
            DBTTask task = NavigatorUtils.getSelectedProject().getTaskManager().getTaskById(taskId);
public class TaskHandlerRun extends AbstractHandler implements IElementUpdater {
import java.util.Map;
            if (task != null) {
import org.jkiss.dbeaver.model.task.DBTTask;
        final Map<DBTTask, Map<String, Object>> variables = new LinkedHashMap<>();
        return null;
                Object element = ((IStructuredSelection) selection).getFirstElement();
import org.eclipse.jface.viewers.ISelection;
 * Unless required by applicable law or agreed to in writing, software
            runTask(task);
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!confirmTaskVariables(task)) {
    public static void runTask(DBTTask task) {
import org.jkiss.dbeaver.DBException;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.tasks.ui.view;
 * See the License for the specific language governing permissions and
    public void updateElement(UIElement element, Map parameters) {
        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
        String taskId = event.getParameter("task");
 * You may obtain a copy of the License at

 */

import org.eclipse.ui.handlers.HandlerUtil;
            DBTaskUtils.collectTaskVariables(
            }
                }
import org.jkiss.code.NotNull;

        }
import org.eclipse.core.commands.AbstractHandler;
        DBTTask task = null;
        }

            }
        if (task != null) {
    @Override

                element.setIcon(DBeaverIcons.getImageDescriptor(taskIcon));
                DBPImage taskIcon = task.getType().getIcon();
import org.jkiss.dbeaver.model.DBPImage;
        }
    }
        } catch (Exception e) {
                variables
            final EditTaskVariablesDialog dialog = new EditTaskVariablesDialog(UIUtils.getActiveWorkbenchShell(), variables);
        try {
            }
import org.eclipse.ui.menus.UIElement;

import org.jkiss.dbeaver.ui.UIUtils;
        }

import org.jkiss.dbeaver.model.task.DBTaskUtils;
        if (variables.values().stream().anyMatch(vars -> !vars.isEmpty())) {
                return false;

            DBWorkbench.getPlatformUI().showError("Task variables", "Error collecting task variables", e);
import org.eclipse.ui.commands.IElementUpdater;
        return true;
                DBTaskUtils.setVariables(other, dialog.getVariables(other));
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.model.DBIcon;
 *
            return;
        try {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (selection instanceof IStructuredSelection) {

            }
    @Override
 *
            for (DBTTask other : variables.keySet()) {
    }
import org.eclipse.jface.viewers.IStructuredSelection;
            );
                element.setText(task.getName());
 * Licensed under the Apache License, Version 2.0 (the "License");
            return true;
            task = NavigatorUtils.getSelectedProject().getTaskManager().getTaskById(taskId);
    }

                if (taskIcon == null) taskIcon = DBIcon.TREE_TASK;
                task1 -> CommonUtils.toBoolean(task1.getProperties().get(DBTaskUtils.TASK_PROMPT_VARIABLES)),
        } catch (DBException e) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        if (!CommonUtils.isEmpty(taskId)) {
                    task = (DBTTask) element;
import org.jkiss.utils.CommonUtils;
            task.getProject().getTaskManager().scheduleTask(task, listener);
import org.eclipse.jface.dialogs.IDialogConstants;
            TaskProcessorUI listener = new TaskProcessorUI(UIUtils.getDialogRunnableContext(), task);
import org.eclipse.core.commands.ExecutionEvent;
