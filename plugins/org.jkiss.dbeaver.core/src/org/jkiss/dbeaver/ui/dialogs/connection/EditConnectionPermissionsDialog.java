    }
import org.eclipse.swt.widgets.Composite;
    private List<DBPDataSourcePermission> accessRestrictions;
 * DBeaver - Universal Database Manager
 *
    public List<DBPDataSourcePermission> getAccessRestrictions() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        accessRestrictions = restrictions;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

    }
/*
public class EditConnectionPermissionsDialog extends BaseDialog {
        super.okPressed();
 * You may obtain a copy of the License at
    }
                permission.getLabel(),
package org.jkiss.dbeaver.ui.dialogs.connection;
            if (permButton.getSelection()) {
import java.util.ArrayList;

        for (Button permButton : restrictedPermissionButtons) {
        }
        List<DBPDataSourcePermission> restrictions = new ArrayList<>();
import org.eclipse.swt.layout.GridData;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite composite = super.createDialogArea(parent);
    private List<Button> restrictedPermissionButtons = new ArrayList<>();
                permission.getDescription(),
                composite,
            }
    @Override
import org.jkiss.dbeaver.model.DBPDataSourcePermission;
import org.jkiss.dbeaver.core.CoreMessages;
        return accessRestrictions;
        this.accessRestrictions = CommonUtils.safeList(accessRestrictions);
    public EditConnectionPermissionsDialog(Shell shell, List<DBPDataSourcePermission> accessRestrictions) {
import org.jkiss.dbeaver.ui.UIUtils;
 *
    protected void okPressed() {

    @Override
import org.eclipse.swt.widgets.Shell;
            Button permButton = UIUtils.createCheckbox(



            restrictedPermissionButtons.add(permButton);
import java.util.List;
    }
        return composite;
}
            permButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

                accessRestrictions.contains(permission),
        }
        super(shell, CoreMessages.dialog_connection_wizard_final_group_security, null);
import org.jkiss.utils.CommonUtils;
                1);
            permButton.setData(permission);
        for (DBPDataSourcePermission permission : DBPDataSourcePermission.values()) {
                restrictions.add((DBPDataSourcePermission) permButton.getData());
    protected Composite createDialogArea(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.swt.widgets.Button;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
