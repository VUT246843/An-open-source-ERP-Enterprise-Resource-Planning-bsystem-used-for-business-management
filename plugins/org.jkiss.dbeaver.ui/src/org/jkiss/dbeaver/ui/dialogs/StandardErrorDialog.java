        getDialogBoundsSettings().put("showDetails", isDetailsVisible());

    }
        super(parentShell, dialogTitle, message, status, displayMask);
 * you may not use this file except in compliance with the License.
        return contents;
 * distributed under the License is distributed on an "AS IS" BASIS,

        Composite contents = super.createContents(parent);
//            if (prefSize.y > actualSize.y) {
                        lastMessage = rootStatus.getMessage();
 *
package org.jkiss.dbeaver.ui.dialogs;
 * limitations under the License.
 */
 *
                            lastMessage = status.getMessage();
        int displayMask)
        });
import org.jkiss.code.NotNull;
    }
    }
                                // Let's use exception name then
//            getShell().setSize(actualSize);
        setStatus(status);

        if (getDialogBoundsSettings().getBoolean("showDetails")) {
/**

import org.eclipse.swt.widgets.Button;
 *
        return UIUtils.getDialogSettings(DIALOG_ID);
        @Nullable String message,
import org.eclipse.core.runtime.IStatus;
        @NotNull IStatus status,
                String lastMessage = GeneralUtils.makeStandardErrorMessage(rootStatus.getException());
                    }
public class StandardErrorDialog extends BaseErrorDialog implements BlockingPopupDialog {
//        Point prefSize = getContents().computeSize(SWT.DEFAULT, SWT.DEFAULT);
    @Override
            this.showDetailsArea();
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
    public void create() {
//            if (prefSize.x > actualSize.x) {
                                    lastMessage = rootStatus.getException().getClass().getName();
    {

        this.message = CommonUtils.truncateString(this.message, 64000);
//            }
//        Point actualSize = getShell().getSize();
    @Override
    protected int getDialogBoundsStrategy() {
    @Override
 */
        return super.close();
        // Truncate message to 64kb
    public boolean close() {
                        }

                    }
            if (okButton != null) {
    private static final String DIALOG_ID = "DBeaver.StandardErrorDialog";//$NON-NLS-1$
        super.create();
//            (prefSize.y < MAX_AUTO_SIZE_Y && prefSize.y > actualSize.y)) {
import org.eclipse.swt.widgets.Composite;
//                actualSize.y = prefSize.y;
 * StandardErrorDialog
import org.eclipse.jface.dialogs.IDialogSettings;
            IStatus rootStatus = GeneralUtils.getRootStatus(status);
                }
        }
                                if (rootStatus.getException() != null) {
                            }
                    if (CommonUtils.isEmpty(lastMessage)) {
                if (CommonUtils.isEmpty(lastMessage)) {
        if (message == null) {
                this.message = CommonUtils.cutExtraLines(rootStatus.getMessage(), 20);
import org.jkiss.utils.CommonUtils;
                            lastMessage = e.getMessage();

    public StandardErrorDialog(
 * You may obtain a copy of the License at
                    for (Throwable e = rootStatus.getException(); e != null; e = e.getCause()) {
        UIUtils.asyncExec(() -> {

import org.jkiss.dbeaver.utils.GeneralUtils;
                        }
    }
        @Nullable Shell parentShell,
            this.message = CommonUtils.cutExtraLines(message, 20); //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
                okButton.setFocus();
}//            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            if (CommonUtils.isEmpty(lastMessage)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull String dialogTitle,
            if (rootStatus.getException() != null) {
import org.eclipse.swt.widgets.Shell;
                                }
            } else {
        return DIALOG_PERSISTLOCATION;
    protected Composite createContents(@NotNull Composite parent) {
        }

                                // No message at all. This may happen in case of NPE and other messageless errors.
        } else {
    }
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2026 DBeaver Corp and others

    protected IDialogSettings getDialogBoundsSettings() {
            }
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
import org.jkiss.code.Nullable;
/*
                this.message = CommonUtils.cutExtraLines(lastMessage, 20);
            }
import org.jkiss.dbeaver.ui.UIUtils;
            Button okButton = getButton(IDialogConstants.OK_ID);
    }
                        if (e.getMessage() != null) {

                        if (CommonUtils.isEmpty(lastMessage)) {
//        }
//                actualSize.x = prefSize.x;
    @Override
//        if ((prefSize.x < MAX_AUTO_SIZE_X && prefSize.x > actualSize.x) ||

