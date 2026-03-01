 * Unless required by applicable law or agreed to in writing, software
}
                try {

 * you may not use this file except in compliance with the License.
                    DBWorkbench.getPlatformUI().showError("Task configuration", "Error opening task '" + task.getName() + "' configuration editor", e);
import org.eclipse.ui.commands.IElementUpdater;
                    DBWorkbench.getPlatformUI().showError("No configurator", "Task '" + taskTypeDescriptor.getName() + "' has no configurator");
import org.jkiss.dbeaver.model.task.DBTTask;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.menus.UIElement;
import org.eclipse.ui.handlers.HandlerUtil;

            if (element instanceof DBTTask) {

 * You may obtain a copy of the License at
                } catch (Throwable e) {
                DBTTask task = (DBTTask) element;
import org.eclipse.core.commands.AbstractHandler;
public class TaskHandlerEdit extends AbstractHandler implements IElementUpdater {
import org.jkiss.dbeaver.model.task.DBTTaskType;
                    }
 * limitations under the License.
                    TaskConfigurationWizard wizard = TaskUIRegistry.getInstance().createConfigurator(taskTypeDescriptor).createTaskConfigWizard(task);

 * See the License for the specific language governing permissions and
                        dialog.open();
 *
            Object element = ((IStructuredSelection)selection).getFirstElement();
                        TaskConfigurationWizardDialog dialog = new TaskConfigurationWizardDialog(HandlerUtil.getActiveWorkbenchWindow(event), wizard);
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
    public void updateElement(UIElement element, Map parameters) {
package org.jkiss.dbeaver.tasks.ui.view;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                    if (wizard != null) {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0

 * DBeaver - Universal Database Manager
 *
    }

                    return null;
        if (selection instanceof IStructuredSelection) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
/*
                if (!TaskUIRegistry.getInstance().supportsConfigurator(taskTypeDescriptor)) {
import java.util.Map;
    @Override
        return null;
import org.jkiss.dbeaver.tasks.ui.registry.TaskUIRegistry;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.runtime.DBWorkbench;
                DBTTaskType taskTypeDescriptor = task.getType();
                }
                        dialog.setEditMode(true);
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
import org.eclipse.jface.viewers.ISelection;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 *
        }
