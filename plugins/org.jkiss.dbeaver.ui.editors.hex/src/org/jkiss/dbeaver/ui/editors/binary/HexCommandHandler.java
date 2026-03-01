        HexEditControl hexControl = null;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
    }
                hexControl.copy();

import org.eclipse.swt.widgets.Shell;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.eclipse.ui.ISources;
        while (control != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.swt.widgets.Control;
 * HexCommandHandler
            if (control instanceof HexEditControl) {
        }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 */
            control = control.getParent();

                break;
public class HexCommandHandler extends AbstractHandler {
import org.eclipse.ui.handlers.HandlerUtil;
 * you may not use this file except in compliance with the License.
                hexControl.paste();
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.editors.binary;
        }
        }
import org.eclipse.core.commands.AbstractHandler;
        String actionId = event.getCommand().getId();
 *
 *
 */
        switch (actionId) {
        Control control = (Control)HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
import org.jkiss.dbeaver.ui.IActionConstants;
/*

            case IWorkbenchCommandConstants.EDIT_COPY:
        return null;
/**
            return null;
            }
    @Override

        if (hexControl == null) {
                break;
            case IActionConstants.CMD_PASTE_SPECIAL:
 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.code.Nullable;
}import org.eclipse.ui.IWorkbenchCommandConstants;
            case IWorkbenchCommandConstants.EDIT_PASTE:
    @Nullable

        Shell activeShell = HandlerUtil.getActiveShell(event);
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * Licensed under the Apache License, Version 2.0 (the "License");
                hexControl = (HexEditControl) control;
                break;
