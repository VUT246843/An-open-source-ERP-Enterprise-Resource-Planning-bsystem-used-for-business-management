        {
import org.eclipse.swt.layout.GridData;
import org.jkiss.code.Nullable;
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            passwordText = UIUtils.createLabelText(composite, OracleUIMessages.dialog_schema_edit_user_password, null, SWT.BORDER | SWT.PASSWORD);
        }
 * limitations under the License.
            protected OracleSchema runTask() {
        @Override
                newSchema.setName(dialog.getUser().getName());
        protected void okPressed()
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.dialogs.IDialogConstants;
/*

}
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

            nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        {
    public OracleSchema configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OracleSchema newSchema, @NotNull Map<String, Object> options) {
            user.setPassword(passwordText.getText());
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    static class NewUserDialog extends Dialog {
            }
 * See the License for the specific language governing permissions and
            UIUtils.createInfoLabel(composite, OracleUIMessages.dialog_schema_edit_label, GridData.FILL_HORIZONTAL, 2);
public class OracleSchemaConfigurator implements DBEObjectConfigurator<OracleSchema> {
        private Text passwordText;


    @Override
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;

        {
        @Override
        private OracleUser user;
        }
                return newSchema;
            this.user = new OracleUser(dataSource);
import org.eclipse.jface.dialogs.Dialog;
import org.jkiss.dbeaver.ext.oracle.model.OracleUser;
                }
import org.jkiss.dbeaver.ui.UIUtils;
                    return null;
        {
package org.jkiss.dbeaver.ext.oracle.ui.config;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    }
                newSchema.setUser(dialog.getUser());

        NewUserDialog(Shell parentShell, OracleDataSource dataSource)


            user.setName(DBObjectNameCaseTransformer.transformObjectName(user, nameText.getText().trim()));
import org.eclipse.swt.widgets.Shell;
                NewUserDialog dialog = new NewUserDialog(UIUtils.getActiveWorkbenchShell(), (OracleDataSource) container);
import org.jkiss.dbeaver.ui.UITask;
        OracleUser getUser()
 *
            return true;
import org.jkiss.code.NotNull;
            passwordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        protected boolean isResizable()

        }.execute();
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        {
            Composite composite = UIUtils.createPlaceholder((Composite) container, 2, 5);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Unless required by applicable law or agreed to in writing, software
 */
import org.eclipse.swt.SWT;
            return parent;
        return new UITask<OracleSchema>() {
 *
            super(parentShell);
            getShell().setText(OracleUIMessages.dialog_schema_edit_title);

            @Override
/**
            return user;
            nameText = UIUtils.createLabelText(composite, OracleUIMessages.dialog_schema_edit_user_name, null);
import org.eclipse.swt.widgets.Text;
        }
        }
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
import org.eclipse.swt.widgets.Control;

 */

        protected Control createDialogArea(Composite parent)
import java.util.Map;
                if (dialog.open() != IDialogConstants.OK_ID) {

            super.okPressed();
            Control container = super.createDialogArea(parent);

 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;

        private Text nameText;
 * OracleSchemaConfigurator
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
