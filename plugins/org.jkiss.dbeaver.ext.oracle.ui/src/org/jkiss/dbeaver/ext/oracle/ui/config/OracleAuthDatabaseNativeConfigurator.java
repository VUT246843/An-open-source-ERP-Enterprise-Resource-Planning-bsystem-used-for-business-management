import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
import org.eclipse.swt.widgets.Composite;

        gd.widthHint = UIUtils.getFontHeight(userRoleCombo) * 10;
 * You may obtain a copy of the License at

        }

        Label usernameLabel = UIUtils.createLabel(parent, UIConnectionMessages.dialog_connection_auth_label_username);
            dataSource.getConnectionConfiguration().setAuthProperties(
            dataSource.getConnectionConfiguration().setAuthProperties(Collections.emptyMap());
        userRoleCombo = new Combo(userGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
    private Combo userRoleCombo;
            userRoleCombo.setText(roleName.toUpperCase(Locale.ENGLISH));
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
        userRoleCombo.add(OracleConnectionRole.SYSOPER.getTitle());
    @Override
public class OracleAuthDatabaseNativeConfigurator extends DatabaseNativeAuthModelConfigurator {
/*
        userRoleCombo.setLayoutData(gd);
        super.saveSettings(dataSource);
 */
package org.jkiss.dbeaver.ext.oracle.ui.config;
                    OracleConstants.PROP_AUTH_LOGON_AS,
        String roleName = dataSource.getConnectionConfiguration().getAuthProperty(OracleConstants.PROP_AUTH_LOGON_AS);
import org.jkiss.dbeaver.model.access.DBAAuthModel;
        super.loadSettings(dataSource);
        createPasswordControls(parent, propertyChangeListener);
 * Oracle database native auth model config
        // Remove legacy properties
        createUserNameControls(userGroup, propertyChangeListener);
}
        usernameLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.eclipse.swt.layout.GridData;
    }
    }
        Label userRoleLabel = UIUtils.createControlLabel(userGroup, OracleUIMessages.dialog_connection_role);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Collections;

import org.eclipse.swt.widgets.Combo;
        userRoleCombo.add(OracleConnectionRole.NORMAL.getTitle());
import org.jkiss.dbeaver.ui.dialogs.connection.DatabaseNativeAuthModelConfigurator;
 */
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        userRoleLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        userRoleCombo.select(0);
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        if (userRoleCombo.getSelectionIndex() > 0) {
        dataSource.getConnectionConfiguration().removeProviderProperty(OracleConstants.PROP_INTERNAL_LOGON);
        }


    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
import org.eclipse.swt.widgets.Label;
    public void createControl(@NotNull Composite parent, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {

        }
        userRoleCombo.add(OracleConnectionRole.SYSDBA.getTitle());

        } else {
 * Unless required by applicable law or agreed to in writing, software
    @Override
        if (roleName != null) {
                    userRoleCombo.getText().toLowerCase(Locale.ENGLISH)));
 *
            roleName = dataSource.getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_INTERNAL_LOGON);

 * See the License for the specific language governing permissions and

        Composite userGroup = UIUtils.createComposite(parent, 3);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;

 * limitations under the License.
import org.jkiss.dbeaver.ui.UIUtils;

    @Override
 * DBeaver - Universal Database Manager
import java.util.Locale;


    @Override
import org.eclipse.swt.SWT;
 * Licensed under the Apache License, Version 2.0 (the "License");
        GridData gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
    public void resetSettings(@NotNull DBPDataSourceContainer dataSource) {
                Collections.singletonMap(
    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionRole;
 * you may not use this file except in compliance with the License.

        if (CommonUtils.isEmpty(roleName)) {
        userGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
        super.resetSettings(dataSource);
/**
