        infoLabel.setLayoutData(gd);
            !CommonUtils.isEmpty(passwordInfo.getUserName()) &&
import org.eclipse.swt.SWT;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(parentShell, title, DBIcon.TREE_USER);
        });
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.access.DBAPasswordChangeInfo;
        ((GridLayout)credGroup.getLayout()).numColumns = 2;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            updateButtons();
 *


    private String verifyText;
    public DBAPasswordChangeInfo getPasswordInfo() {
import org.eclipse.swt.widgets.Shell;
    private boolean userEditable;
import org.eclipse.swt.widgets.Text;
    private boolean oldPasswordVisible;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        this.passwordInfo = new DBAPasswordChangeInfo(userName, oldPassword);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            newPasswordText.setFocus();

 * Password change dialog
        return passwordInfo;
import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    }
        gd.widthHint = 300;

 *
        }
        newPasswordText.addModifyListener(e -> {
import org.jkiss.dbeaver.core.CoreMessages;

import org.eclipse.jface.dialogs.IDialogConstants;
        Text userNameText = UIUtils.createLabelText(credGroup, CoreMessages.dialog_password_change_username, passwordInfo.getUserName(), SWT.BORDER);
    {
        this.userEditable = userEditable;

        if (oldPasswordVisible) {
    private DBAPasswordChangeInfo passwordInfo;
        gd.horizontalSpan = 2;

            updateButtons();
/**
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
            CommonUtils.equalObjects(passwordInfo.getNewPassword(), verifyText));
        getButton(IDialogConstants.OK_ID).setEnabled(
    }
        userNameText.setEditable(userEditable);
 * Unless required by applicable law or agreed to in writing, software


            verifyText = verifyPasswordText.getText();

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.UIUtils;
        return credGroup;
        Control infoLabel = UIUtils.createInfoLabel(credGroup, getTitle());
    private void updateButtons() {
import org.jkiss.dbeaver.model.DBIcon;
        if (!userEditable) {
        UIUtils.asyncExec(this::updateButtons);
 */
import org.eclipse.swt.layout.GridData;
        this.oldPasswordVisible = oldPasswordVisible;
 */
import org.eclipse.swt.widgets.Composite;
        });
        }
            passwordInfo.setNewPassword(newPasswordText.getText());
        verifyPasswordText.addModifyListener(e -> {
    {
    @NotNull
package org.jkiss.dbeaver.ui.dialogs.connection;
        Text verifyPasswordText = UIUtils.createLabelText(credGroup, CoreMessages.dialog_password_change_verify_password, "", SWT.BORDER | SWT.PASSWORD);
    public PasswordChangeDialog(Shell parentShell, String title, String userName, String oldPassword, boolean userEditable, boolean oldPasswordVisible)
        userNameText.addModifyListener(e -> passwordInfo.setUserName(userNameText.getText()));
    protected Composite createDialogArea(Composite parent)
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite credGroup = super.createDialogArea(parent);
    }
}
        Text newPasswordText = UIUtils.createLabelText(credGroup, CoreMessages.dialog_password_change_new_password, "", SWT.BORDER | SWT.PASSWORD);
public class PasswordChangeDialog extends BaseDialog
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.utils.CommonUtils;
            Text oldPasswordText = UIUtils.createLabelText(credGroup, CoreMessages.dialog_password_change_old_password, passwordInfo.getOldPassword(), SWT.BORDER | SWT.PASSWORD);
    @Override
            oldPasswordText.addModifyListener(e -> passwordInfo.setOldPassword(oldPasswordText.getText()));
            !CommonUtils.isEmpty(passwordInfo.getNewPassword()) &&
/*
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
{
