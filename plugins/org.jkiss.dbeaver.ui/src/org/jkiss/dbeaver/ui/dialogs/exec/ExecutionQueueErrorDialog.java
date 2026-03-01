import org.jkiss.dbeaver.ui.internal.UIMessages;
        boolean script)
            true);
import org.eclipse.swt.widgets.Composite;

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
        this.script = script;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (script) {
package org.jkiss.dbeaver.ui.dialogs.exec;
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        createButton(
            createButton(
import org.jkiss.dbeaver.ui.dialogs.StandardErrorDialog;
                false);
    }
        @NotNull IStatus status,
        }
    {
            IDialogConstants.RETRY_ID,
 *     http://www.apache.org/licenses/LICENSE-2.0
            createButton(
}
            parent,
                parent,
        createButton(
    @Override

        @NotNull String dialogTitle,
                IDialogConstants.IGNORE_ID,
            false);
    }
    private final boolean script;
        // create OK and Details buttons
    public ExecutionQueueErrorDialog(
        if (buttonId == IDialogConstants.DETAILS_ID) {
                IDialogConstants.SKIP_LABEL,
                UIMessages.button_skip_all,
        super(parentShell, dialogTitle, message, status, displayMask);
            return;
 * See the License for the specific language governing permissions and
 * ExecutionQueueErrorDialog
        @Nullable String message,
                false);
 *
        close();
    @Override
 */
 * limitations under the License.
            parent,
        }
/*
import org.eclipse.jface.dialogs.IDialogConstants;


import org.jkiss.code.Nullable;
            IDialogConstants.STOP_ID,


            super.buttonPressed(buttonId);
        setReturnCode(buttonId);
 * Unless required by applicable law or agreed to in writing, software
    }
                IDialogConstants.SKIP_ID,
 *
                parent,
import org.eclipse.core.runtime.IStatus;
 * you may not use this file except in compliance with the License.
            IDialogConstants.RETRY_LABEL,
import org.jkiss.code.NotNull;
    protected void buttonPressed(int buttonId) {
import org.eclipse.swt.widgets.Shell;
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
 */
 *
class ExecutionQueueErrorDialog extends StandardErrorDialog {
        int displayMask,
            IDialogConstants.STOP_LABEL,
        @NotNull Shell parentShell,
