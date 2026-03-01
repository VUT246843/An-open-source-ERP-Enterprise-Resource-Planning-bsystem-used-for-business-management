import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You can use this handler for task folder renaming.

        taskFolder.setName(newFolderName);
        if (CommonUtils.isEmpty(newFolderName)) {
package org.jkiss.dbeaver.tasks.ui.view;
        taskManager.updateConfiguration();
import org.jkiss.dbeaver.Log;
                TaskUIViewMessages.task_handler_folder_rename_error_title,
/**

import org.eclipse.osgi.util.NLS;
        if (!(selectedObject instanceof DBTTaskFolder)) {
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(TaskFolderRenameHandler.class);
 *
            HandlerUtil.getActiveShell(event),
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        TaskRegistry.getInstance().notifyTaskFoldersListeners(
            log.error("Can't rename task folder " + taskFolder.getName());
            new DBTTaskFolderEvent(taskFolder, DBTTaskFolderEvent.Action.TASK_FOLDER_UPDATE));
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.eclipse.jface.viewers.IStructuredSelection;
                NLS.bind(TaskUIViewMessages.task_handler_folder_rename_error_message, taskFolder.getName(), newFolderName)
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;
            return null;
        if (!ArrayUtils.isEmpty(tasksFolders)

            DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.registry.task.TaskRegistry;
            return null;
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.core.commands.AbstractHandler;
        return null;
        DBTTaskFolder taskFolder = (DBTTaskFolder) selectedObject;
        }
 * You may obtain a copy of the License at


    }
        DBTTaskFolder[] tasksFolders = taskManager.getTasksFolders();
            return null;
    @Override
            taskFolder.getName());
 * you may not use this file except in compliance with the License.
        DBTTaskManager taskManager = taskFolder.getProject().getTaskManager();
import org.jkiss.dbeaver.model.task.DBTTaskFolder;
            );
import org.eclipse.ui.handlers.HandlerUtil;
        Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
 * Unless required by applicable law or agreed to in writing, software
 */
import org.jkiss.dbeaver.model.task.DBTTaskFolderEvent;
import org.eclipse.core.commands.ExecutionEvent;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;
        ISelection selection = HandlerUtil.getCurrentSelection(event);
public class TaskFolderRenameHandler extends AbstractHandler {
        }
 * limitations under the License.
}
import org.jkiss.utils.ArrayUtils;
        }
        }
import org.jkiss.dbeaver.model.task.DBTTaskManager;

        if (!(selection instanceof IStructuredSelection)) {
import java.util.Arrays;
    public Object execute(ExecutionEvent event) {
            TaskUIViewMessages.task_handler_folder_rename_property_label,
import org.eclipse.jface.viewers.ISelection;
/*
        String newFolderName = EnterNameDialog.chooseName(
            && Arrays.stream(tasksFolders).anyMatch(e -> e.getName().equalsIgnoreCase(newFolderName))) {
