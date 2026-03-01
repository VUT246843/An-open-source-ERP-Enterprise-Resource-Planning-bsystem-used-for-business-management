    }

import org.jkiss.dbeaver.model.connection.DBPDriver;
            dialogInstance.getShell().forceActive();
        @Nullable DBPConnectionConfiguration initialConfiguration,
    }
    @Override
            try {

            final NewConnectionWizard wizard = new NewConnectionWizard(initialDriver, initialConfiguration);
        @Nullable Consumer<NewConnectionWizard> wizardConfigurer
        ConnectionWizard wizard = (ConnectionWizard) getWizard();
                dialogInstance = null;
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software

        @Nullable DBPDriver initialDriver,
        }
        setAdaptContainerSizeToPages(true);
        if (dialogInstance != null) {
        spacer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return openNewConnectionDialog(window, initialDriver, initialConfiguration, null);
        testButton = createButton(parent, TEST_BUTTON_ID, CoreMessages.dialog_connection_button_test, false);
        } else {
        ConnectionPageSettings settings = wizard.getPageSettings();
    }
    public static boolean openNewConnectionDialog(@NotNull IWorkbenchWindow window) {
    public static boolean openNewConnectionDialog(
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.
    }
        super.createButtonsForButtonBar(parent);

import org.eclipse.jface.dialogs.IDialogConstants;
        super.updateButtons();
                wizardConfigurer.accept(wizard);

    private static final int TEST_BUTTON_ID = 2000;

    }
    private NewConnectionDialog(IWorkbenchWindow window, ConnectionWizard wizard) {
 */
        return openNewConnectionDialog(window, null, null);
            }
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;
/*
 *
            if (wizardConfigurer != null) {
    ) {
            DBWorkbench.getPlatformUI().showError("No active project", "No active project, can't create new connection.\nActivate or create new project.");
            return IDialogConstants.CANCEL_ID;
import java.util.function.Consumer;
import org.jkiss.dbeaver.core.CoreMessages;
    @Override
        ((GridLayout) parent.getLayout()).numColumns++;


    ) {
        @NotNull IWorkbenchWindow window,


        super(window, wizard);
        }
        ConnectionWizard wizard = (ConnectionWizard) getWizard();
    public void updateButtons() {

import org.eclipse.swt.widgets.Composite;
    }
    private Button testButton;
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        @Nullable DBPDriver initialDriver,
        return false;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static volatile NewConnectionDialog dialogInstance;
        @NotNull IWorkbenchWindow window,
            return;
    protected void buttonPressed(int buttonId) {
import org.eclipse.swt.layout.GridData;
 * limitations under the License.
public class NewConnectionDialog extends ActiveWizardDialog {
import org.eclipse.swt.widgets.Button;
        parent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
            DBWorkbench.getPlatformUI().showError("Internal error", "Internal error when opening new connection wizard", e);
        if (DBWorkbench.getPlatform().getWorkspace().getActiveProject() == null) {
import org.eclipse.swt.widgets.Label;

    }
 * DBeaver - Universal Database Manager
            dialogInstance = new NewConnectionDialog(window, wizard);
            testConnection();
 *

        testButton.setEnabled(settings != null && settings.isPageComplete());
        try {
    protected boolean isModalWizard() {
        super.buttonPressed(buttonId);

    @Override
import org.eclipse.ui.IWorkbenchWindow;
 *
    protected void createButtonsForButtonBar(Composite parent) {
    public int open() {
        @Nullable DBPConnectionConfiguration initialConfiguration
            }
            return IDialogConstants.CANCEL_ID;
/**
        testButton.setEnabled(false);

import org.jkiss.code.Nullable;
    private void testConnection() {

package org.jkiss.dbeaver.ui.dialogs.connection;
        } catch (Exception e) {


import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        ((GridLayout) parent.getLayout()).makeColumnsEqualWidth = false;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * It is a modeless dialog. But only one instance can be opened at once.
            return super.open();
import org.eclipse.swt.SWT;
    @Override
        Label spacer = new Label(parent, SWT.NONE);
}
        wizard.testConnection();
    }
        }
                return dialogInstance.open() == IDialogConstants.OK_ID;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return true;
    public static boolean openNewConnectionDialog(
            } finally {
    @Override
        testButton.moveAbove(getButton(IDialogConstants.BACK_ID));
 *
 * NewConnectionDialog.
 * See the License for the specific language governing permissions and
import org.eclipse.swt.layout.GridLayout;
 * You may obtain a copy of the License at
        if (buttonId == TEST_BUTTON_ID) {
