 * DBeaver - Universal Database Manager
    @Override
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.tasks.ui.TaskFeatures;

    }
                    }
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Object execute(ExecutionEvent event) {
                            NLS.bind(TaskUIViewMessages.task_handler_delete_folder_error_message, object.getName()),
        return !UIUtils.confirmAction(HandlerUtil.getActiveShell(event), title, NLS.bind(message, namedObject.getName()));
                            e
                    if (object instanceof DBTTask) {
                            TaskUIViewMessages.task_handler_delete_error_deleting_task_from_scheduler_title,
            IStructuredSelection structSelection = (IStructuredSelection)selection;
 *
                    }

                        taskFolder.getProject().getTaskManager().removeTaskFolder(taskFolder);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
 *
                }
            if (objectsToDelete.size() == 1) {
    private boolean confirmDeleteObjectAction(ExecutionEvent event, String title, String message, DBPNamedObject namedObject) {
                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        return null;
import org.eclipse.osgi.util.NLS;
                    } else {
        if (!objectsToDelete.isEmpty()) {
                } catch (DBException e) {
import org.eclipse.core.commands.AbstractHandler;
/*
                        DBWorkbench.getPlatformUI().showError(
                    objectsToDelete.add((DBTTask) element);
 * You may obtain a copy of the License at
                if (namedObject instanceof DBTTaskFolder) {
            for (DBPNamedObject object : objectsToDelete) {
import org.jkiss.dbeaver.model.task.DBTTaskFolder;
    }
                }
        }
                    if (object instanceof DBTTask) {
                    TaskFeatures.TASKS_DELETE.use();
import org.eclipse.jface.viewers.IStructuredSelection;
                    if (confirmDeleteObjectAction(event, TaskUIViewMessages.task_handler_delete_folder_error_title, TaskUIViewMessages.task_handler_delete_confirm_question_delete_task_folder, namedObject)) {
                    } else {
import org.jkiss.dbeaver.DBException;
import java.util.ArrayList;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.task.DBTTask;
                        return null;
                if (element instanceof DBTTask) {
                        );
            } else {
 * you may not use this file except in compliance with the License.

                try {

 *


                }
                        TaskFeatures.TASKS_DELETE.use();
        }

                        DBTTaskFolder taskFolder = (DBTTaskFolder) object;
            }
 * limitations under the License.
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;
                DBPNamedObject namedObject = objectsToDelete.get(0);

public class TaskHandlerDelete extends AbstractHandler {
} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;
import org.eclipse.jface.viewers.ISelection;
                        );
package org.jkiss.dbeaver.tasks.ui.view;
        return null;
                        DBWorkbench.getPlatformUI().showError(

        if (selection instanceof IStructuredSelection) {
                if (!UIUtils.confirmAction(HandlerUtil.getActiveShell(event), TaskUIViewMessages.task_handler_delete_confirm_title_delete_tasks, NLS.bind(TaskUIViewMessages.task_handler_delete_confirm_question_delete_tasks, objectsToDelete.size()))) {
        List<DBPNamedObject> objectsToDelete = new ArrayList<>();
 *     http://www.apache.org/licenses/LICENSE-2.0
                } else if (element instanceof DBTTaskFolder) {
                } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                }
                        DBTTask task = (DBTTask) object;
                            TaskUIViewMessages.task_handler_delete_folder_error_title,
                    if (confirmDeleteObjectAction(event, TaskUIViewMessages.task_handler_delete_confirm_title_delete_task, TaskUIViewMessages.task_handler_delete_confirm_question_delete_task, namedObject)) {
            }
import org.jkiss.dbeaver.model.DBPNamedObject;
                    }
import org.eclipse.core.commands.ExecutionEvent;
                    return null;
 */
            for (Object element : structSelection) {
                            NLS.bind(TaskUIViewMessages.task_handler_delete_error_deleting_task_from_scheduler_message, ((DBTTask)object).getId()),
                            e
                        task.getProject().getTaskManager().deleteTaskConfiguration(task);
                    objectsToDelete.add((DBTTaskFolder) element);
