
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
 * distributed under the License is distributed on an "AS IS" BASIS,
            Control container = super.createDialogArea(parent);
            nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.widgets.Shell;
            Composite composite = UIUtils.createPlaceholder((Composite) container, 2);
 * limitations under the License.
import org.eclipse.swt.layout.GridData;
/*

        return new UITask<DB2Schema>() {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                newSchema.setName(schemaName);
                }
 * You may obtain a copy of the License at
                }
import org.jkiss.dbeaver.ui.UIUtils;

        }
    // --------
import org.eclipse.jface.dialogs.Dialog;
 */
        }.execute();
            nameText = UIUtils.createLabelText(composite, DB2Messages.dialog_schema_edit_schema_name, null);
        private String schemaName;

        private Text nameText;
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));

        public NewSchemaDialog(Shell parentShell)
            return parent;
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.schemaName = nameText.getText().trim().toUpperCase();
                    return null;
        @Override
    
        }
import java.util.Map;
import org.eclipse.swt.widgets.Control;
            getShell().setText(DB2Messages.dialog_schema_edit_title);
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
            return schemaName;
    // Dialog
 * DBeaver - Universal Database Manager
 *
        @Override
 */


 * Copyright (C) 2010-2024 DBeaver Corp and others
        protected boolean isResizable()

                if (dialog.open() != IDialogConstants.OK_ID) {
import org.eclipse.swt.widgets.Text;
                if (schemaName.length() == 0) {

import org.jkiss.dbeaver.model.edit.DBECommandContext;
        protected Control createDialogArea(Composite parent)

            @Override

                return newSchema;
import org.jkiss.code.Nullable;

            super(parentShell);
    }
                String schemaName = dialog.getSchemaName();
            super.okPressed();
    public DB2Schema configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull DB2Schema newSchema, @NotNull Map<String, Object> options) {
        }
    }
        {

 * you may not use this file except in compliance with the License.
        protected void okPressed()

        {
 * See the License for the specific language governing permissions and
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UITask;
package org.jkiss.dbeaver.ext.db2.ui.config;
        {
public class DB2SchemaConfigurator implements DBEObjectConfigurator<DB2Schema> {
import org.eclipse.jface.dialogs.IDialogConstants;
}
    @Override
            	NewSchemaDialog dialog = new NewSchemaDialog(UIUtils.getActiveWorkbenchShell());

            protected DB2Schema runTask() {
    // --------
            }
 *
        // Dialog management
        {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
    private static class NewSchemaDialog extends Dialog {
        public String getSchemaName()
 * Unless required by applicable law or agreed to in writing, software
            return true;
        @Override
import org.jkiss.code.NotNull;
 * DB2SchemaConfigurator
                    return null;

/**
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
        }
import org.eclipse.swt.widgets.Composite;
