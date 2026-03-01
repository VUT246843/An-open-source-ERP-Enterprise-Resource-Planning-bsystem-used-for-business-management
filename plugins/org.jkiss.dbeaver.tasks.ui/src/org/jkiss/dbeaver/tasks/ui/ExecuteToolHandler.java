    }
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
                        );
                NLS.bind(TaskUIMessages.task_execute_handler_tool_error_message, tool.getLabel()),
        }
                }
 * Unless required by applicable law or agreed to in writing, software
                    TaskUIMessages.task_execute_handler_tool_error_project_message
                            TaskUIMessages.task_execute_handler_tool_warn_readonly_title,
                            TaskUIMessages.task_execute_handler_tool_error_apply_message
 * distributed under the License is distributed on an "AS IS" BASIS,
                        DBWorkbench.getPlatformUI().showWarningMessageBox(
                } else {
    public void run(IAction action) {
package org.jkiss.dbeaver.tasks.ui;
    private final IWorkbenchWindow window;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                DBWorkbench.getPlatformUI().showWarningMessageBox(
import org.eclipse.core.expressions.EvaluationContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    } else {
import org.jkiss.dbeaver.model.DBPDataSource;

 * limitations under the License.
import org.eclipse.ui.ISources;
public class ExecuteToolHandler implements IActionDelegate {
import java.util.Collections;
                        EvaluationContext context = new EvaluationContext(null, selection);
            } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and

                        context.addVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME, selection);
                TaskUIMessages.task_execute_handler_tool_error_title,
                            window,
                    } else if (taskForObjs.requiresExportPrivileges()
                    if (taskForObjs.requiresMutableDatabase() && DBUtils.isReadOnly(dataSource)) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.eclipse.ui.IWorkbenchWindow;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                    Command cmd = tool.getCommandForObjects(objects);

        this.selection = selection;
                            UIMessages.dialog_policy_data_export_msg
            List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(selection);
                        DBWorkbench.getPlatformUI().showWarningMessageBox(
                        ISelection selection = new StructuredSelection(objects);
            if (dataSource != null) {
    public void selectionChanged(IAction action, ISelection selection) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                            NLS.bind(TaskUIMessages.task_execute_handler_tool_warn_readonly_message, dataSource.getName())
            DBWorkbench.getPlatformUI().showError(
    }
        }
                    } else {
                        && ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
import org.eclipse.ui.IActionDelegate;
 * You may obtain a copy of the License at
                        DBWorkbench.getPlatformUI().showWarningMessageBox(
                            TaskUIMessages.task_execute_handler_tool_error_title, 
                    if (cmd != null) {
 *
import org.eclipse.jface.viewers.ISelection;
    private ISelection selection;
                        ExecutionEvent event = new ExecutionEvent(cmd, Collections.EMPTY_MAP, null, context);
import org.eclipse.core.commands.Command;
        } catch (Throwable e) {
                    }
            DBPDataSource dataSource = objects.get(0).getDataSource();
 * DBeaver - Universal Database Manager
import org.eclipse.jface.viewers.IStructuredSelection;
 */
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
import org.jkiss.dbeaver.model.DBUtils;
        this.window = window;
import org.jkiss.dbeaver.ui.internal.UIMessages;
import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;

                            selectedProject,

                        cmd.executeWithChecks(event);

import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        TaskConfigurationWizardDialog.openNewToolTaskDialog(
                        );
                );
        this.tool = tool;
    private void executeTool(List<DBSObject> objects) {
            );
 *
                        IStructuredSelection selectedObjects = new StructuredSelection(objects.toArray());
import java.util.List;
import org.jkiss.dbeaver.tools.registry.ToolDescriptor;
            executeTool(selectedObjects);
import org.eclipse.core.commands.ExecutionEvent;
                    TaskUIMessages.task_execute_handler_tool_error_title,
    @Override


        if (!selection.isEmpty()) {
                        );
                if (taskForObjs != null) {
}                            UIMessages.dialog_policy_data_export_title,
import org.eclipse.jface.action.IAction;
                        );
                DBPProject selectedProject = dataSource.getContainer().getProject();

                e
    }
import org.jkiss.dbeaver.model.app.DBPProject;
        try {
    public ExecuteToolHandler(IWorkbenchWindow window, ToolDescriptor tool) {
    private final ToolDescriptor tool;
                TaskTypeDescriptor taskForObjs = tool.getTaskForObjects(objects);
                            taskForObjs.getId(),
 *
import org.eclipse.osgi.util.NLS;
                            selectedObjects
/*

import org.eclipse.jface.viewers.StructuredSelection;
                    }
            }
    }
 * you may not use this file except in compliance with the License.
