 * limitations under the License.
 * See the License for the specific language governing permissions and
        public NativeClientConfigDialog(Shell parentShell, DBPDataSourceContainer dataSource) {
            if (!dataSource.persistConfiguration()) {
        if (getWizard() instanceof AbstractNativeToolWizard<?, ?, ?> wizard && wizard.isNativeClientHomeRequired()) {

/*
            createButton(parent, CLIENT_CONFIG_ID, TaskNativeUIMessages.tools_wizard_client_button, false);
    protected void buttonPressed(int buttonId) {

            homesSelector.populateHomes(dataSource.getDriver(), dataSource.getConnectionConfiguration().getClientHomeId(), true);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPDataSourceContainer dataSource = toolWizard.getSettings().getDataSourceContainer();
    @Override
        super.buttonPressed(buttonId);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    protected IDialogSettings getDialogBoundsSettings() {
import org.eclipse.jface.dialogs.IDialogSettings;

        // Do not save sizes. It breaks wizard on any UI changes.

 */

            button.setEnabled(true);
        return null;

        }
            button.setEnabled(false);

import org.jkiss.dbeaver.ui.dialogs.connection.ClientHomesSelector;
    public NativeToolWizardDialog(@NotNull IWorkbenchWindow window, @NotNull TaskConfigurationWizard<?> wizard) {
    private void openClientConfiguration() {
        }
                updatePageCompletion();
        super(window, wizard);
    }
            NativeClientConfigDialog dialog = new NativeClientConfigDialog(getShell(), dataSource);
                }
        Button button = getButton(CLIENT_CONFIG_ID);
import org.eclipse.osgi.util.NLS;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
}
        private ClientHomesSelector homesSelector;
        }

        setupDialog();
import java.util.Map;
        if (dataSource != null) {
        }
        super(window, wizard, selection, Map.of());
        if (button != null) {
                updateButtons();

package org.jkiss.dbeaver.tasks.ui.nativetool;
        setHelpAvailable(false);
        @NotNull IStructuredSelection selection
            if (dialog.open() == IDialogConstants.OK_ID) {
    @Override
        super.disableButtonsOnProgress();
    

            homesSelector = new ClientHomesSelector(dialogArea, TaskNativeUIMessages.tools_wizard_client_group_client);
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
            homesSelector.getPanel().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            this.dataSource = dataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Button;
        protected Composite createDialogArea(Composite parent) {

    private static class NativeClientConfigDialog extends BaseDialog {
 * DBeaver - Universal Database Manager
    }
        protected void okPressed() {
import org.eclipse.swt.widgets.Shell;
            String selectedHome = homesSelector.getSelectedHome();
 *
    }

    public void enableButtonsAfterProgress() {
        @Override
import org.eclipse.swt.widgets.Composite;
        Button button = getButton(CLIENT_CONFIG_ID);
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 *
/**
        }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
        @NotNull TaskConfigurationWizard<?> wizard,
        if (buttonId == CLIENT_CONFIG_ID) {
    }
        @NotNull IWorkbenchWindow window,
    }

            dataSource.getConnectionConfiguration().setClientHomeId(selectedHome);
import org.eclipse.jface.viewers.IStructuredSelection;
 * Tool wizard dialog
            return dialogArea;
    }
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.enableButtonsAfterProgress();
    }
public class NativeToolWizardDialog extends TaskConfigurationWizardDialog {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setFinishButtonLabel(UIMessages.button_start);
    @Override

        }
            }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
    public void disableButtonsOnProgress() {
            }
            super(parentShell, NLS.bind(TaskNativeUIMessages.tools_wizard_client_dialog_title, dataSource.getName()), dataSource.getDriver().getIcon());
                return;
            openClientConfiguration();

        if (button != null) {
        }
import org.jkiss.dbeaver.ui.internal.UIMessages;
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
 */
        @Override

    public static final int CLIENT_CONFIG_ID = 1000;

import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;

                if (toolWizard instanceof AbstractNativeToolWizard) {
    }

    protected void setupDialog() {
        setupDialog();
import org.eclipse.swt.SWT;
        AbstractNativeToolWizard<?,?,?> toolWizard = (AbstractNativeToolWizard) getWizard();
    @Override

                    toolWizard.readLocalClientInfo();
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.jface.dialogs.IDialogConstants;
            super.okPressed();
        private final DBPDataSourceContainer dataSource;
    public NativeToolWizardDialog(
        setShellStyle(SWT.CLOSE | SWT.MAX | SWT.TITLE | SWT.BORDER | SWT.RESIZE | getDefaultOrientation());
            Composite dialogArea = super.createDialogArea(parent);
