    }

 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.app.standalone.actions;
import org.jkiss.dbeaver.model.DBIcon;
import org.eclipse.jface.action.Action;
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
        this.window = window;
 * Licensed under the Apache License, Version 2.0 (the "License");
            CoreApplicationMessages.actions_menu_exit_emergency_message,
    public EmergentExitAction(IWorkbenchWindow window) {

/*
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationMessages;

    private IWorkbenchWindow window;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            System.exit(1);
        setId(getClass().getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            DBIcon.STATUS_WARNING)) {
            CoreApplicationMessages.actions_menu_exit_emergency,
            window == null ? null : window.getShell(),
import org.eclipse.ui.IWorkbenchWindow;
} *
 * limitations under the License.
 */
    public void run() {

        }
    }
        if (UIUtils.confirmAction(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * See the License for the specific language governing permissions and
        super(CoreApplicationMessages.actions_menu_exit_emergency);

public class EmergentExitAction extends Action {
