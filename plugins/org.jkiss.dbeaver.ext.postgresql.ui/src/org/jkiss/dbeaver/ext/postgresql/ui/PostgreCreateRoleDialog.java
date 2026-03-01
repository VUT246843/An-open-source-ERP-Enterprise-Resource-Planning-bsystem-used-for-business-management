import org.eclipse.swt.widgets.Text;
 * You may obtain a copy of the License at

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
 *
import org.eclipse.swt.SWT;
        isUserCheck.addSelectionListener(new SelectionAdapter() {
/*
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
            name = nameText.getText().trim();
    }
 */
public class PostgreCreateRoleDialog extends BaseDialog

import org.eclipse.jface.dialogs.IDialogConstants;
        final Text passwordText = UIUtils.createLabelText(groupGeneral, PostgreMessages.dialog_create_role_label_user_password, "", SWT.BORDER | SWT.PASSWORD); //$NON-NLS-2$
        return isUser;
        passwordText.addModifyListener(e -> password = passwordText.getText());
    }

import org.eclipse.swt.events.SelectionAdapter;

    @Override
package org.jkiss.dbeaver.ext.postgresql.ui;
        Button isUserCheck = UIUtils.createCheckbox(groupGeneral, PostgreMessages.dialog_create_role_label_user_role, null, true, 2);
 * Unless required by applicable law or agreed to in writing, software
    public boolean isUser() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        final Composite composite = super.createDialogArea(parent);
            @Override

import org.eclipse.swt.layout.GridData;
        final Text nameText = UIUtils.createLabelText(groupGeneral, PostgreMessages.dialog_create_role_label_role_name, ""); //$NON-NLS-2$

        return composite;

    }

/**

        final Composite groupGeneral = UIUtils.createTitledComposite(composite, PostgreMessages.dialog_create_role_group_general, 2, GridData.FILL_HORIZONTAL);
    public String getName() {
 * See the License for the specific language governing permissions and
    @NotNull

            enableButton(IDialogConstants.OK_ID, !name.isEmpty());
import org.eclipse.swt.widgets.Button;
        enableButton(IDialogConstants.OK_ID, false);
 * PostgreCreateDatabaseDialog
    }
        });
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;

 *
        super.createButtonsForButtonBar(parent);

    }
{
    private String name;
        this.role = role;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
    protected Composite createDialogArea(@NotNull Composite parent) {
    private final PostgreRole role;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            public void widgetSelected(SelectionEvent e) {
 */
}
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Composite;
    public String getPassword() {
        return name;
import org.eclipse.swt.widgets.Shell;
    private boolean isUser = true;

                passwordText.setEnabled(isUser);
    private String password;
    }
        });
    @Override
import org.eclipse.swt.events.SelectionEvent;
    public PostgreCreateRoleDialog(Shell parentShell, PostgreRole role) {
        return password;
                isUser = isUserCheck.getSelection();
        nameText.addModifyListener(e -> {
        super(parentShell, PostgreMessages.dialog_create_role_title, null);

