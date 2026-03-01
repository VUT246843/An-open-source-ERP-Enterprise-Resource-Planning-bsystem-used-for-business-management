
import org.eclipse.jface.dialogs.IDialogConstants;
                IDialogConstants.CANCEL_LABEL
            case 0:
                uniqueColumns.add(binding.getEntityAttribute());
            super.buttonPressed(IDialogConstants.OK_ID);
            viewer.getControl().getShell(),
        // Use all columns
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
                    super.buttonPressed(IDialogConstants.OK_ID);
                break;
            if (useAllColumns(viewer)) {
 * Unless required by applicable law or agreed to in writing, software
            viewer.persistConfig();
                ResultSetMessages.validate_unique_key_usage_dialog_use_all_columns_no_valid_columns_found
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 */
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;
import org.jkiss.dbeaver.DBException;
                ResultSetMessages.validate_unique_key_usage_dialog_use_all_columns,

            return true;

            DBUtils.fireObjectUpdate(viewer.getModel().getVirtualEntity(false), constraint);
    private ValidateUniqueKeyUsageDialog(@NotNull ResultSetViewer viewer) {
        constraint.setUseAllColumns(true);
        if (uniqueColumns.isEmpty()) {

    @NotNull
 */
        ValidateUniqueKeyUsageDialog dialog = new ValidateUniqueKeyUsageDialog(viewer);
        for (DBDAttributeBinding binding : viewer.getModel().getAttributes()) {
        if (viewer.editEntityIdentifier()) {
                editCustomKey();
                ResultSetMessages.validate_unique_key_usage_dialog_use_all_columns,
        }
package org.jkiss.dbeaver.ui.controls.resultset;
            case 2:
        List<DBSEntityAttribute> uniqueColumns = new ArrayList<>();
        DBDRowIdentifier identifier = viewer.getVirtualEntityIdentifier();
            viewer.reloadIdentifierAttributes();
        }
            ResultSetMessages.validate_unique_key_usage_dialog_title,
        }
 *
                return true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        DBVEntityConstraint constraint = (DBVEntityConstraint) identifier.getUniqueKey();
    private final ResultSetViewer viewer;
                ResultSetMessages.validate_unique_key_usage_dialog_use_all_columns,
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            if (binding.getEntityAttribute() != null) {
        super.configureShell(shell);
        return true;

        if (executionContext.getDataSource().getContainer().getPreferenceStore().getBoolean(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS)) {
    protected void configureShell(Shell shell) {
            WARNING,
        constraint.setAttributes(uniqueColumns);
        // Edit custom key
            null,

 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 * You may obtain a copy of the License at
            DBWorkbench.getPlatformUI().showError(
    static boolean validateUniqueKey(@NotNull ResultSetViewer viewer, @NotNull DBCExecutionContext executionContext) {
            return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.code.NotNull;
import java.util.List;
                super.buttonPressed(IDialogConstants.CANCEL_ID);
        final DBDRowIdentifier identifier = viewer.getVirtualEntityIdentifier();
                }
            return false;
        }
        try {
import java.util.ArrayList;
    @Override
            );

    }
import org.eclipse.swt.widgets.Shell;
            }
    private static boolean useAllColumns(ResultSetViewer viewer)

import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                if (useAllColumns(viewer)) {
    @Override
        if (identifier == null) {
        super(
            new String[]{
            case 1:
        switch (buttonId) {
        }
    {
        if (!identifier.isIncomplete()) {
    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        this.viewer = viewer;
        }
/**
 *
                ResultSetMessages.validate_unique_key_usage_dialog_use_all_columns_cannot_reload_unique_columns,
    protected void buttonPressed(int buttonId) {

            2
        );
        } catch (DBException e) {
        return result == IDialogConstants.OK_ID;
                break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void editCustomKey()
 *
 * DBeaver - Universal Database Manager
            // Key already defined
 * Confirm virtual key usage dialog
}
            // No key
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;
 * limitations under the License.
    }
        int result = dialog.open();
            DBWorkbench.getPlatformUI().showError(
 * See the License for the specific language governing permissions and
            ResultSetMessages.validate_unique_key_usage_dialog_main_question,
                e
    }
import org.jkiss.dbeaver.model.DBUtils;
                ResultSetMessages.validate_unique_key_usage_dialog_custom_unique_key,
    }

            }

final class ValidateUniqueKeyUsageDialog extends MessageDialog {
import org.eclipse.jface.dialogs.MessageDialog;
 * you may not use this file except in compliance with the License.
            return false;
                break;
            },
            );
    }
