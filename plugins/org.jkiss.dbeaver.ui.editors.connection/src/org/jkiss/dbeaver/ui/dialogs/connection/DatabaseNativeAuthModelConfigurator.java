package org.jkiss.dbeaver.ui.dialogs.connection;
 *
    }
                this.passwordText.setEnabled(dataSource.isSavePassword());
            savePasswordCheck.setEnabled(!isForceSaveCredentials());

import org.jkiss.dbeaver.ui.UIUtils;
        passwordLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
}
                dataSource == null || dataSource.isSavePassword() || isForceSaveCredentials(),
        }
        return UIConnectionMessages.dialog_connection_auth_label_password;
        if (!userNameApplicable) {
        if (supportsPasswordView && canEditCredentialsPerPolicy) {
    }
    protected boolean isPasswordApplicable() {
    }
        boolean userPasswordApplicable = true;
        if (!canEditCredentialsPerPolicy) {
    }
public class DatabaseNativeAuthModelConfigurator implements IObjectPropertyConfigurator<DBAAuthModel<?>, DBPDataSourceContainer> {
            if (canEditCredentialsPerPolicy) {
    public void createControl(@NotNull Composite authPanel, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {
    protected final boolean canEditCredentialsPerPolicy;
                }
        } else {
        return gd;
        passwordText.addModifyListener(e -> propertyChangeListener.run());
        if (this.usernameText != null && !this.usernameText.isDisposed()) {
            showPasswordButton = UIUtils.createPushButton(
            }

 *
import org.jkiss.dbeaver.ui.UIIcon;
        passwordText.setLayoutData(makeAuthControlLayoutData(ph));
import org.jkiss.dbeaver.runtime.DBWorkbench;
/*
 * You may obtain a copy of the License at
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        int colCount = 1;
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            }));

            if (this.passwordText != null) {
                panel,
    }
        passwordText = UIUtils.recreateTextControl(

    }
        }
        usernameLabel = UIUtils.createLabel(authPanel, UIConnectionMessages.dialog_connection_auth_label_username);
                    return;

        canEditCredentialsPerPolicy = !ApplicationPolicyProvider.getInstance()

import org.jkiss.code.NotNull;

            UIUtils.createControlLabel(parent, label);
        if (label != null) {
    protected String getPasswordFieldLabel() {
                    this.showPasswordButton.setEnabled(dataSource.isSavePassword() || isForceSaveCredentials());
                if (showPasswordButton != null) {
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        passwordText = new Text(ph, SWT.BORDER | SWT.PASSWORD);
    }
    protected DBPDataSourceContainer dataSource;
            }
    protected Label passwordLabel;
            DataSourceHandlerUtils.resolveSharedCredentials(dsd, null);
 * DBeaver - Universal Database Manager
        usernameLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        UIServiceSecurity serviceSecurity = DBWorkbench.getService(UIServiceSecurity.class);

                if (this.savePasswordCheck != null) {

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.SWT;
        } else if (this.savePasswordCheck != null) {
    protected Label usernameLabel;
import org.jkiss.utils.CommonUtils;
            createPasswordControls(authPanel, propertyChangeListener);

        return passwordText;
                }
        if (dataSource instanceof DataSourceDescriptor dsd && dataSource.isSharedCredentials()) {
                this.savePasswordCheck.setEnabled(false);


import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;

        loadSettings(dataSource);
            if (dataSource.getRegistry().getDataSource(dataSource.getId()) != null) {
    @NotNull
import org.eclipse.swt.widgets.Text;

                UIIcon.SHOW_ALL_DETAILS, SelectionListener.widgetSelectedAdapter(e -> showPasswordText(serviceSecurity))
    protected Button showPasswordButton;
 * Unless required by applicable law or agreed to in writing, software
            } else {
            );

    @Override
            .isPolicyEnabled(ApplicationPolicyProvider.POLICY_CREDENTIALS_EDIT);
                panel,
        boolean resetPassword = !canEditCredentialsPerPolicy || (this.savePasswordCheck != null && !this.savePasswordCheck.getSelection());
        }
        this.dataSource = dataSource;
            passwordText,
 * Licensed under the Apache License, Version 2.0 (the "License");

            this.passwordText.setText(CommonUtils.notEmpty(dataSource.getConnectionConfiguration().getUserPassword()));
                this.showPasswordButton.setEnabled(false);

    private void showPasswordText(UIServiceSecurity serviceSecurity) {

        return true;
            this.usernameText.setText(CommonUtils.notEmpty(dataSource.getConnectionConfiguration().getUserName()));
        panel.setLayoutData(gd);
        if (passHidden) {
                    dataSource.getProject(),
        passPlaceholder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return false;
    public void resetSettings(@NotNull DBPDataSourceContainer dataSource) {
    }
                    true)) {
    public boolean isComplete() {
        usernameText.addModifyListener(e -> propertyChangeListener.run());

import org.jkiss.dbeaver.model.access.DBAAuthModel;
                }


    @Override
 */
 * limitations under the License.

            if (this.showPasswordButton != null) {

        passwordLabel = UIUtils.createLabel(parent, getPasswordFieldLabel());
            resetPassword = false;

        createPasswordText(passPlaceholder, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.eclipse.swt.events.SelectionListener;
    }
        }
            }
    protected Text createPasswordText(Composite parent, String label) {
                passwordText.setEnabled(savePasswordCheck.getSelection());
        boolean userNameApplicable = true;
        if (userPasswordApplicable) {
import org.jkiss.dbeaver.ui.actions.DataSourceHandlerUtils;
        usernameText = new Text(authPanel, SWT.BORDER);
    }
            );
import org.jkiss.dbeaver.runtime.ui.UIServiceSecurity;
            dataSource.setSavePassword(dataSource.isSharedCredentials());
    }
        }
    protected Text usernameText;
        }
 *
        if (supportsPasswordView) colCount++;
        if (canEditCredentialsPerPolicy) {
                    this.savePasswordCheck.setSelection(false);
        if (dataSource.isSharedCredentials()) {
 * Database native auth model config
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others
            dataSource.setSavePassword(this.savePasswordCheck.getSelection());
        }
    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
        // We don't support password preview in standard project secure storage (as we need password encryption)
                    "Enter project password",

                this.passwordText.setEnabled(true);
            savePasswordCheck = UIUtils.createCheckbox(
        gd.widthHint = fontHeight * 20;
                UIConnectionMessages.dialog_connection_wizard_final_checkbox_save_password,
        return this.passwordText != null;
        if (object instanceof AuthModelDatabaseNative<?> amd) {
            }
    }
        }
    }
    protected GridData makeAuthControlLayoutData(@NotNull Composite authPanel) {
            if (this.savePasswordCheck != null) {
            dataSource.getConnectionConfiguration().setUserPassword(null);
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;

        passPlaceholder = UIUtils.createComposite(parent, 2);
import org.eclipse.swt.widgets.Label;
            savePasswordCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {

                null,
                UIConnectionMessages.dialog_connection_auth_label_show_password,
    @Override
        }
                UIConnectionMessages.dialog_connection_wizard_final_checkbox_save_password,

                }

            userNameApplicable = amd.isUserNameApplicable();
                }
 * See the License for the specific language governing permissions and
    protected void createPasswordControls(Composite parent, Runnable propertyChangeListener) {
        }
    @Override
                    this.showPasswordButton.setEnabled(false);

        }
    protected Text passwordText;

        }
        createUserNameControls(authPanel, propertyChangeListener);

            }
                    showPasswordButton.setEnabled(savePasswordCheck.getSelection());
        if (this.passwordText != null && !this.passwordText.isDisposed()) {
                if (!serviceSecurity.validatePassword(
        usernameText.setLayoutData(makeAuthControlLayoutData(authPanel));
    protected Composite passPlaceholder;

    }
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
                    "Enter project password to unlock connection password view",
        ph.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        boolean passHidden = (passwordText.getStyle() & SWT.PASSWORD) == SWT.PASSWORD;
            passHidden ? SWT.BORDER : SWT.BORDER | SWT.PASSWORD
        }
import org.eclipse.swt.widgets.Composite;
            userPasswordApplicable = amd.isUserPasswordApplicable();
            dataSource.getConnectionConfiguration().setUserPassword(GeneralUtils.trimAllWhitespaces(this.passwordText.getText()));
import org.jkiss.dbeaver.utils.GeneralUtils;
    protected void createUserNameControls(Composite authPanel, Runnable propertyChangeListener) {
import org.eclipse.swt.layout.GridData;
    protected boolean isForceSaveCredentials() {
        );
                    this.savePasswordCheck.setEnabled(false);

import org.eclipse.swt.widgets.Button;

        if (this.usernameText != null) {
    public DatabaseNativeAuthModelConfigurator() {
                    this.savePasswordCheck.setSelection(dataSource.isSavePassword() || isForceSaveCredentials());
        Composite panel = UIUtils.createComposite(passPlaceholder, colCount);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
                1
                if (showPasswordButton != null) {
/**
            return;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    protected Button savePasswordCheck;
        if (dataSource.isTemporary()) {
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;

                if (showPasswordButton != null) {
                this.savePasswordCheck.setSelection(true);
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
                }
        }
                if (this.savePasswordCheck != null) {
        Composite ph = UIUtils.createPlaceholder(parent, 1);
        if (this.passwordText != null && isPasswordApplicable() && !resetPassword) {
        boolean supportsPasswordView = serviceSecurity != null;
            dataSource.getConnectionConfiguration().setUserName(GeneralUtils.trimAllWhitespaces(this.usernameText.getText()));
        int fontHeight = UIUtils.getFontHeight(authPanel);
