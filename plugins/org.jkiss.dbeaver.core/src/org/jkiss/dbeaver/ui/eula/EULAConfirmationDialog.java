                preferences.put(EULAUtils.DBEAVER_EULA, EULAUtils.getEulaVersion());
 * Licensed under the Apache License, Version 2.0 (the "License");
                break;
    }
    }
/*
            case IDialogConstants.YES_ID:
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                close();
        createButton(parent, IDialogConstants.NO_ID, IDialogConstants.CANCEL_LABEL, false);
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
        createButton(parent, IDialogConstants.YES_ID, CoreMessages.core_eula_dialog_accept, false);
    }
    protected boolean canHandleShellCloseEvent() {
                System.exit(0);
import java.util.prefs.Preferences;


                break;
import org.eclipse.swt.widgets.Shell;
        super.buttonPressed(buttonId);
import org.jkiss.dbeaver.core.CoreMessages;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Composite;

    @Override
 * limitations under the License.

 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.eula;
 *
        return false;
 * You may obtain a copy of the License at
    @Override
        switch (buttonId) {
    }
    public EULAConfirmationDialog(@NotNull Shell parentShell, @Nullable String eula) {
 */
    protected void buttonPressed(int buttonId) {
                Preferences preferences = Preferences.userNodeForPackage(DBWorkbench.getPlatform().getApplication().getClass());
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
        //We don't want user to close this window
            case IDialogConstants.NO_ID:
 * See the License for the specific language governing permissions and
                break;
}
        super(parentShell, eula);
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
import org.eclipse.jface.dialogs.IDialogConstants;

import org.jkiss.code.NotNull;


        super.setShellStyle(SWT.TITLE | SWT.APPLICATION_MODAL | SWT.RESIZE);
public class EULAConfirmationDialog extends EULABaseDialog {
            default:
    @Override

        }

