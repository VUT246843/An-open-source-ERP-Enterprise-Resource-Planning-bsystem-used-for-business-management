
}            if (element instanceof DBTTask) {
import org.jkiss.dbeaver.tasks.ui.wizard.EditTaskConfigurationDialog;
 * Unless required by applicable law or agreed to in writing, software
        if (selection instanceof IStructuredSelection) {

 *
 *
                dialog.open();
 * you may not use this file except in compliance with the License.
                EditTaskConfigurationDialog dialog = new EditTaskConfigurationDialog(HandlerUtil.getActiveShell(event), (DBTTask) element);

            IStructuredSelection structSelection = (IStructuredSelection)selection;
            Object element = structSelection.getFirstElement();

import org.jkiss.dbeaver.model.task.DBTTask;
        }
import org.eclipse.ui.handlers.HandlerUtil;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
import org.eclipse.core.commands.ExecutionException;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

import org.eclipse.jface.viewers.ISelection;
 * limitations under the License.
        return null;
import org.eclipse.jface.viewers.IStructuredSelection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
public class TaskHandlerProperties extends AbstractHandler {
 *
            }
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.commands.AbstractHandler;
package org.jkiss.dbeaver.tasks.ui.view;
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }

 * See the License for the specific language governing permissions and
 */
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionEvent;
