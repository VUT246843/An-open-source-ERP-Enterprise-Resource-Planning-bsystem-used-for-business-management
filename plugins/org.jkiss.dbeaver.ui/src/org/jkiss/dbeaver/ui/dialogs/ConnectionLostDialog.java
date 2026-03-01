        setReturnCode(buttonId);
            "Connection lost",
            parentShell,

}
 */
import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Shell;
 * limitations under the License.
            "Connection to '" + container.getName() + "' was lost and cannot be re-established.\nWhat do you want to do?",
    ) {
        @NotNull Throwable error,
 */
        @NotNull String stopButtonName
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * ConnectionLostDialog
        createButton(parent, IDialogConstants.RETRY_ID, IDialogConstants.RETRY_LABEL, false);
import org.eclipse.swt.widgets.Composite;
package org.jkiss.dbeaver.ui.dialogs;
 *
 * Unless required by applicable law or agreed to in writing, software

/*
public class ConnectionLostDialog extends StandardErrorDialog {
    }
 * DBeaver - Universal Database Manager
/**
    private final String stopButtonName;
            return;
        super(
        @NotNull DBPDataSourceContainer container,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;

        this.stopButtonName = stopButtonName;
    protected void buttonPressed(int buttonId) {
import org.jkiss.dbeaver.utils.GeneralUtils;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            IStatus.INFO | IStatus.WARNING | IStatus.ERROR);
        @Nullable Shell parentShell,
 * You may obtain a copy of the License at

    @Override

            GeneralUtils.makeExceptionStatus(error),
        close();
    public ConnectionLostDialog(
        }
        if (buttonId == IDialogConstants.DETAILS_ID) {
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
import org.eclipse.core.runtime.IStatus;
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.IDialogConstants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        createButton(parent, IDialogConstants.STOP_ID, stopButtonName, true);
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
            super.buttonPressed(buttonId);
