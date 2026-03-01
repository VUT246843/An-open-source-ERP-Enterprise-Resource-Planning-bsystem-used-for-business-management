    public static boolean downloadDriverFiles(
        getWizard().init(UIUtils.getActiveWorkbenchWindow().getWorkbench(), null);
    DBPDriver getDriver() {
    public static final int EDIT_DRIVER_BUTTON_ID = 2000;
            button.setImage(DBeaverIcons.getImage(UIIcon.BROWSER));
 * DBeaver - Universal Database Manager
    }
        doDownload = true;
        if (DBWorkbench.getPlatform().isShuttingDown()) {
    }
        }
 *

        }
        }
    }
    @Override
        if (shell == null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public static final int MAX_WIDTH = 800;
    }
        super.buttonPressed(buttonId);
    protected void createButtonsForButtonBar(Composite parent) {

import org.eclipse.swt.graphics.Point;
import org.eclipse.jface.dialogs.IDialogConstants;
    ) {
        dialog.setMinimumPageSize(0, 0);
    void closeWizard() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others

        return (DriverDownloadWizard)super.getWizard();
        @NotNull DBPDriverDependencies dependencies,
        return getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Unless required by applicable law or agreed to in writing, software
    }
        @Nullable Shell shell,

        if (getWizard().isForceDownload()) {
        addPageChangedListener(event -> UIUtils.asyncExec(() -> getWizard().pageActivated(event.getSelectedPage())));
        return super.createButton(parent, id, label, defaultButton);
    ) {

        if (buttonId == EDIT_DRIVER_BUTTON_ID) {
        dialog.open();
        boolean isShowExpanded
            shell = Display.getCurrent().getActiveShell();
        var dialog = new DriverDownloadDialog(shell, driver, dependencies, false, forceDownload, isShowExpanded);
import org.jkiss.dbeaver.model.connection.DBPDriver;
    }

            return false;
    public void buttonPressed(int buttonId) {
        return downloadDriverFiles(shell, driver, dependencies, false, isShowExpanded);
            Button button = super.createButton(parent, id, getWizard().getFinishText(), true);
    ) {
        return dialog.doDownload;
 * See the License for the specific language governing permissions and
        boolean updateVersion,

import org.jkiss.code.NotNull;
    @Override
            cancelPressed();

    }

        @NotNull DBPDriverDependencies dependencies,
    }

        boolean forceDownload,
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBPDriver driver,
    DriverDownloadDialog(
 */
import org.jkiss.dbeaver.ui.UIIcon;
        boolean isShowExpanded

            setButtonLayoutData(button);
            DriverEditDialog dialog = new DriverEditDialog(null, getDriver());
    @Override
 *
            UIUtils.asyncExec(() -> buttonPressed(IDialogConstants.FINISH_ID));

        @Nullable Shell shell,
        super.createButtonsForButtonBar(parent);
    @Override
    @Override
    }
        }
        @NotNull Shell shell,
 */
 * DriverDownloadDialog

public class DriverDownloadDialog extends WizardDialog {
    public DriverDownloadWizard getWizard() {
    }
/**
import org.eclipse.jface.wizard.WizardDialog;
        return getWizard().getDriver();
    @Override
        return dialogArea;

import org.eclipse.swt.widgets.*;
        super(shell, new DriverDownloadWizard(driver, dependencies, updateVersion, forceDownload, isShowExpanded));
        super.finishPressed();
 * You may obtain a copy of the License at
    protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
        @NotNull DBPDriverDependencies dependencies,
import org.eclipse.swt.SWT;
            return button;


import org.jkiss.dbeaver.ui.UIUtils;
        boolean isShowExpanded
        DriverDownloadWizard wizard = getWizard();
/*
        if (id == IDialogConstants.FINISH_ID) {
    protected void finishPressed() {
    @Override
        }
        if (!wizard.isForceDownload() && DriverEditDialog.getDialogCount() == 0) {
}

        @NotNull DBPDriver driver,
package org.jkiss.dbeaver.ui.dialogs.driver;
            createButton(parent, EDIT_DRIVER_BUTTON_ID,
                wizard.isAutoDownloadWizard() ? UIConnectionMessages.dialog_driver_download_button_edit_dirver : UIConnectionMessages.dialog_driver_download_button_add_jars,
            button.setFocus();
            dialog.open(!getWizard().isAutoDownloadWizard());
                false);
    private boolean doDownload = false;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
    protected Control createDialogArea(Composite parent) {
        }
        Control dialogArea = super.createDialogArea(parent);
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean forceDownload,


        @NotNull DBPDriver driver,
 * you may not use this file except in compliance with the License.
    }
 *
        UIUtils.asyncExec(() -> buttonPressed(IDialogConstants.CANCEL_ID));
 * limitations under the License.
    public static boolean downloadDriverFiles(
    protected Point getInitialSize() {
