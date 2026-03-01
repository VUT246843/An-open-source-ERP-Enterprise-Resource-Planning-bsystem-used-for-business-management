 * you may not use this file except in compliance with the License.
    }
            String authName = connectionInfo.getAuthProperty(SnowflakeConstants.PROP_AUTHENTICATOR);
        usernameLabel = UIUtils.createLabel(parent, UIConnectionMessages.dialog_connection_auth_label_username);
        GridData gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);

            authTypeCombo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN);
        Label userRoleLabel = UIUtils.createControlLabel(parent, SnowflakeMessages.label_role);
        }

import org.eclipse.swt.events.ModifyListener;
        String roleName = connectionInfo.getAuthProperty(SnowflakeConstants.PROP_AUTH_ROLE);

        super.loadSettings(dataSource);

        super.saveSettings(dataSource);
        }
 *
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
import org.eclipse.swt.widgets.Label;
        // Remove legacy properties
        String roleName = userRoleCombo.getText();
import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;
    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
            authTypeCombo.add("snowflake"); //$NON-NLS-1$
}
        }
        }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
import org.jkiss.dbeaver.ui.UIUtils;

    }
                roleName);
 *
            if (CommonUtils.isEmpty(authName)) {
import org.jkiss.code.NotNull;
import org.eclipse.swt.layout.GridData;
        configuration.removeProviderProperty(SnowflakeConstants.PROP_ROLE_LEGACY);
import org.eclipse.swt.widgets.Combo;
 * limitations under the License.
/*
import org.eclipse.swt.widgets.Composite;
            authTypeCombo.setLayoutData(gd);
public class SnowflakeAuthSnowflakeConfigurator extends DatabaseNativeAuthModelConfigurator {
        userRoleCombo.setLayoutData(gd);
            }
    }
 * See the License for the specific language governing permissions and

        configuration.removeProviderProperty(SnowflakeConstants.PROP_AUTHENTICATOR_LEGACY);
        if (needsAuthTypeSelector()) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        userRoleCombo.select(0);
 * DBeaver - Universal Database Manager
        userRoleLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                authName = CommonUtils.notEmpty(connectionInfo.getProviderProperty(SnowflakeConstants.PROP_AUTHENTICATOR_LEGACY));

            configuration.setAuthProperty(SnowflakeConstants.PROP_AUTHENTICATOR, authTypeCombo.getText().trim());
            gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
    public void createControl(@NotNull Composite parent, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
            UIUtils.createControlLabel(parent, SnowflakeMessages.label_authenticator);
        return true;
 */

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
        if (!CommonUtils.isEmpty(roleName)) {

            authTypeCombo.setText(authName);
import org.eclipse.swt.SWT;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                SnowflakeConstants.PROP_AUTH_ROLE,


        if (authTypeCombo != null) {
 */
    public void resetSettings(@NotNull DBPDataSourceContainer dataSource) {
        if (authTypeCombo != null) {
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    @Override
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
package org.jkiss.dbeaver.ext.snowflake.ui.config;
    private Combo userRoleCombo;
            authTypeCombo.add(""); //$NON-NLS-1$

    }
import org.jkiss.dbeaver.model.access.DBAAuthModel;
            authTypeCombo.add("externalbrowser"); //$NON-NLS-1$
        DBPConnectionConfiguration configuration = dataSource.getConnectionConfiguration();
            configuration.setAuthProperty(
    }
            userRoleCombo.setText(roleName);
        userRoleCombo.addModifyListener(textListener);

 *
    private Combo authTypeCombo;
        createUserNameControls(parent, propertyChangeListener);
import org.jkiss.dbeaver.ui.dialogs.connection.DatabaseNativeAuthModelConfigurator;
            createPasswordControls(parent, propertyChangeListener);
        gd.widthHint = UIUtils.getFontHeight(userRoleCombo) * 20;
    @Override
        usernameLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    protected boolean needsAuthTypeSelector() {

 * Snowflake database native auth model config
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ModifyListener textListener = e -> propertyChangeListener.run();
    @Override
import org.jkiss.dbeaver.ext.snowflake.ui.internal.SnowflakeMessages;
    @Override
        if (roleName != null) {
        }
    protected boolean supportsPassword() {
        return true;
        if (supportsPassword()) {
        super.resetSettings(dataSource);
            authTypeCombo.addModifyListener(textListener);

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software

        userRoleCombo = new Combo(parent, SWT.DROP_DOWN);

