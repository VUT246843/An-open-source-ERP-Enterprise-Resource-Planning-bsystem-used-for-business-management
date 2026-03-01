package org.jkiss.dbeaver.ext.mssql.ui;
    private String name;
import org.eclipse.swt.widgets.Text;
 *

 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getName() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

        super(parentShell, SQLServerUIMessages.dialog_create_db_title, null);
        Composite groupGeneral = UIUtils.createTitledComposite(composite, SQLServerUIMessages.dialog_create_db_group_general, 2, GridData.FILL_HORIZONTAL);
}
 * distributed under the License is distributed on an "AS IS" BASIS,

        final Text nameText = UIUtils.createLabelText(groupGeneral, SQLServerUIMessages.dialog_create_db_label_db_name, ""); //$NON-NLS-2$
        enableButton(IDialogConstants.OK_ID, false);
 *

    }

import org.eclipse.jface.dialogs.IDialogConstants;
    }
 * See the License for the specific language governing permissions and
public class SQLServerCreateDatabaseDialog extends BaseDialog {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UIUtils;
 */
/*
            name = nameText.getText().trim();
    }
    protected Composite createDialogArea(@NotNull Composite parent) {
        });
        return composite;
    public SQLServerCreateDatabaseDialog(Shell parentShell, SQLServerDataSource dataSource) {
    private final SQLServerDataSource dataSource;


 *
import org.eclipse.swt.widgets.Composite;
        super.createButtonsForButtonBar(parent);
    @NotNull
import org.jkiss.code.NotNull;
    @Override
        Composite composite = super.createDialogArea(parent);
import org.eclipse.swt.widgets.Shell;
 * Unless required by applicable law or agreed to in writing, software
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
import org.eclipse.swt.layout.GridData;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.dataSource = dataSource;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataSource;
        return name;
            enableButton(IDialogConstants.OK_ID, !name.isEmpty());

 * DBeaver - Universal Database Manager
        nameText.addModifyListener(e -> {

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
