
                CommonUtils.isNotEmpty(password) &&
            SWT.BORDER | SWT.PASSWORD
    private String name;
            SWT.BORDER | SWT.PASSWORD
import org.eclipse.swt.SWT;
    public String getName() {
            UIMessages.dialogs_name_and_password_dialog_label_name,
    protected Composite createDialogArea(@NotNull Composite parent) {
import org.eclipse.jface.dialogs.IDialogConstants;
        enableButton(
 * Unless required by applicable law or agreed to in writing, software

        verifyPasswordText.addModifyListener(e -> {
        passwordText.addModifyListener(e -> {
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
public class EditUserDialog extends BaseDialog {
 * You may obtain a copy of the License at
            GridData.FILL_HORIZONTAL

            updateButtons();
            UIMessages.dialogs_name_and_password_dialog_label_password,
                CommonUtils.equalObjects(password, verifyText)
            IDialogConstants.OK_ID,
            "",
            updateButtons();
    }
        nameText.addModifyListener(e -> {

    public EditUserDialog(@NotNull Shell parentShell, @NotNull String title) {
            2,
    }
import org.eclipse.swt.widgets.Text;
/*
        });
        Text verifyPasswordText = UIUtils.createLabelText(
        super(parentShell, title, null);
            CommonUtils.isNotEmpty(name) &&
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2026 DBeaver Corp and others
        final Text nameText = UIUtils.createLabelText(
import org.jkiss.dbeaver.ui.UIUtils;
 *
            UIMessages.dialogs_name_and_password_dialog_group_settings,
        return composite;
import org.eclipse.swt.layout.GridData;
        );
        return name;


 *     http://www.apache.org/licenses/LICENSE-2.0
            password = passwordText.getText();
        final Composite composite = super.createDialogArea(parent);

 * DBeaver - Universal Database Manager
            composite,
        });
    private String password;
    @Override
        ); //$NON-NLS-2$
    public String getPassword() {
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    }
            name = nameText.getText().trim();
package org.jkiss.dbeaver.ui.dialogs;
        enableButton(IDialogConstants.OK_ID, false);
        );
 * you may not use this file except in compliance with the License.
    }
        );
            groupGeneral,

    private String verifyText;
 */

 * limitations under the License.
            verifyText = verifyPasswordText.getText();
import org.jkiss.dbeaver.ui.internal.UIMessages;
            groupGeneral,
        super.createButtonsForButtonBar(parent);
            updateButtons();

            groupGeneral,


        final Composite groupGeneral = UIUtils.createTitledComposite(
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.widgets.Composite;
    }
    private void updateButtons() {
            UIMessages.dialogs_name_and_password_dialog_label_verify_password,
    }
            "",

    @Override
        final Text passwordText = UIUtils.createLabelText(
        return password;
        });

            ""
 *
import org.eclipse.swt.widgets.Shell;
 * distributed under the License is distributed on an "AS IS" BASIS,
        ); //$NON-NLS-2$
 *
