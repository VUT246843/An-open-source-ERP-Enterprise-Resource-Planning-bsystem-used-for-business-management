        return authInfo.getUserPassword();
    private String description;
    public void setSavePasswordToolTipText(String text) {
    }
                    usernameText.setText(authInfo.getUserName());
    }
    }
                }
        Composite addrGroup = new Composite(parent, SWT.NONE);
            if (!passwordOnly) {
            gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);

    }
        addrGroup.setLayoutData(gd);
        this.authInfo.setUserName(userName);
 * DBeaver - Universal Database Manager
        if (passwordOnly || !CommonUtils.isEmpty(usernameText.getText())) {
            savePasswordCheck.setLayoutData(gd);
            passwordText = new Text(credGroup, SWT.BORDER | SWT.PASSWORD);
//    @Override
                //gd.horizontalSpan = 3;
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;


            }
 * See the License for the specific language governing permissions and
    }
        this.userNameLabel = userNameLabel;
 *
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
            savePasswordCheck = new Button(addrGroup, SWT.CHECK);

package org.jkiss.dbeaver.ui.dialogs;

import org.jkiss.code.Nullable;
    public boolean isSavePassword() {

        this.passwordLabel = passwordLabel;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }

import org.jkiss.code.NotNull;

//    }
    }
    private String passwordLabel = UIConnectionMessages.dialog_connection_auth_label_password;
            savePasswordCheck.setToolTipText(savePasswordToolTipText);
        this.passwordOnly = passwordOnly;
    public void setUserName(String userName) {

        }
        {
 * Base authentication dialog

    }

                Label usernameLabel = new Label(credGroup, SWT.NONE);

    private String userNameLabel = UIConnectionMessages.dialog_connection_auth_label_username;
 * You may obtain a copy of the License at
    public String getSavePasswordToolTipText() {
    private final boolean passwordOnly;
    private final DBPAuthInfo authInfo = new DBPAuthInfo();
    public String getUserPassword() {
        this.description = description;
    }
        }
            authInfo.setSavePassword(savePasswordCheck.getSelection());
            savePasswordCheck.setEnabled(showSavePassword);


    public void setSavePasswordText(String text) {



    public DBPAuthInfo getAuthInfo() {
        return authInfo;
            passwordLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            Composite credGroup = UIUtils.createTitledComposite(addrGroup, UIConnectionMessages.dialog_connection_auth_group_user_cridentials, 2, GridData.FILL_BOTH);
    public void setUserPassword(String userPassword) {
        super.okPressed();
            !ApplicationPolicyProvider.getInstance()

            if (authInfo.getUserPassword() != null && authInfo.isSavePassword()) {
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
    protected Composite createDialogArea(@NotNull Composite parent) {
            savePasswordCheck.setSelection(authInfo.isSavePassword());
                usernameText = new Text(credGroup, SWT.BORDER);
    @Override
        gl.marginWidth = 10;
            gd.grabExcessHorizontalSpace = true;
 *
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
                usernameLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.ui.UIUtils;
        this.authInfo.setUserPassword(userPassword);
    public void setSavePassword(boolean savePassword) {
            passwordLabel.setText(this.passwordLabel);
        super(parentShell, title, DBIcon.TREE_USER);
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
        return description;
                passwordText.setText(authInfo.getUserPassword());
        return savePasswordText;

    }
        if (!passwordOnly) {

        return addrGroup;
        }

                gd.widthHint = 200;
        }
    }
    public void setDescription(@Nullable String description) {
    @NotNull
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            passwordText.setLayoutData(gd);
import org.eclipse.swt.widgets.*;
 * limitations under the License.
    }
    @Nullable
                if (authInfo.getUserName() != null) {
            passwordText.setFocus();
    private String savePasswordToolTipText;
    public void setPasswordLabel(String passwordLabel) {
 * Unless required by applicable law or agreed to in writing, software
 *
            gd = new GridData(GridData.FILL_HORIZONTAL);
        addrGroup.setLayout(gl);
        }
        if (showSavePassword) {
                usernameLabel.setText(this.userNameLabel);
        GridLayout gl = new GridLayout(1, false);
    protected void okPressed() {

    }
    private final boolean showSavePassword;
    protected Text usernameText;

 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.savePasswordToolTipText = text;
                .isPolicyEnabled(ApplicationPolicyProvider.POLICY_CREDENTIALS_EDIT);
    public BaseAuthDialog(Shell parentShell, String title, boolean passwordOnly, boolean showSavePassword) {
    }

        authInfo.setUserPassword(passwordText.getText());
//    protected IDialogSettings getDialogBoundsSettings() {
            savePasswordCheck.setText(CommonUtils.toString(savePasswordText, UIConnectionMessages.dialog_connection_auth_checkbox_save_password));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    public void setUserNameLabel(String userNameLabel) {
        return savePasswordToolTipText;
            UIUtils.createInfoLabel(addrGroup, description);
    }
    }

        return authInfo.getUserName();
        this.savePasswordText = text;

    private String savePasswordText;
        return authInfo.isSavePassword();
 */
        if (showSavePassword) {
    }
        this.authInfo.setSavePassword(savePassword);
/**
public class BaseAuthDialog extends BaseDialog implements BlockingPopupDialog {
            Label passwordLabel = new Label(credGroup, SWT.NONE);
            authInfo.setUserName(usernameText.getText());
        this.showSavePassword = showSavePassword &&
    private Button savePasswordCheck;

    @Override

/*
        GridData gd = new GridData(GridData.FILL_BOTH);
//        return UIUtils.getDialogSettings(DIALOG_ID);

        gl.marginHeight = 10;
    public String getSavePasswordText() {
                gd = new GridData(GridData.FILL_HORIZONTAL);
                gd.grabExcessHorizontalSpace = true;
import org.eclipse.swt.layout.GridLayout;
    public String getUserName() {
        if (CommonUtils.isNotEmpty(description)) {
    public String getDescription() {
                usernameText.setLayoutData(gd);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }

    protected Text passwordText;
    }
        }
