
public class NavigatorHandlerProjectCreate extends NavigatorHandlerObjectBase {
import org.eclipse.core.commands.ExecutionException;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            new ProjectCreateWizard());

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 *
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.tools.project.ProjectCreateWizard;
        ActiveWizardDialog dialog = new ActiveWizardDialog(
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);

 */
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IWorkbenchWindow;
/*
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager

import org.eclipse.jface.dialogs.IDialogConstants;
        createNewProject(window);
    public static boolean createNewProject(IWorkbenchWindow window) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;
 *
            window,
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.navigator.actions;
        return dialog.open() == IDialogConstants.OK_ID;
    @Override

    }
