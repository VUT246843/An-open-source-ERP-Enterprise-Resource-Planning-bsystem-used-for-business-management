 */
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        usernameText.addModifyListener(e -> propertyChangeListener.run());


        overrideHostname.setText(PostgreMessages.dialog_connection_pgpass_hostname_override);

 *
    }
        this.overrideHostname.setSelection(!CommonUtils.isEmpty(connectionConfiguration.getProviderProperty(
        });
/**
        overrideHostname = UIUtils.createCheckbox(authPanel, false);
            dataSource.getConnectionConfiguration().setProviderProperty(
    @Override
import org.jkiss.utils.CommonUtils;
        if (overrideHostname.getSelection()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

import org.eclipse.swt.widgets.Text;
 * distributed under the License is distributed on an "AS IS" BASIS,
                overriddenHostnameText.setEnabled(overrideHostname.getSelection());
import org.eclipse.swt.events.SelectionAdapter;
}
            public void widgetSelected(SelectionEvent e) {
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        dataSource.setSavePassword(true);
        } else {
    public void loadSettings(@NotNull DBPDataSourceContainer dataSource) {
    private Text overriddenHostnameText;
    protected Text usernameText;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 *

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
    @Override
        overrideHostname.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            this.overriddenHostnameText.setText(
public class PostgreAuthPgPassConfigurator implements IObjectPropertyConfigurator<Object, DBPDataSourceContainer> {
    }
    @Override
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.UIUtils;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return true;

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        dataSource.getConnectionConfiguration().setUserName(this.usernameText.getText());
        if (overrideHostname.getSelection()
 */
import org.eclipse.swt.events.SelectionEvent;
        overriddenHostnameText = new Text(authPanel, SWT.BORDER);
            dataSource.getConnectionConfiguration().setProviderProperty(PostgreConstants.PG_PASS_HOSTNAME, null);
 *     http://www.apache.org/licenses/LICENSE-2.0
        Label usernameLabel = UIUtils.createLabel(authPanel, UIConnectionMessages.dialog_connection_auth_label_username);
        }
            && !CommonUtils.isEmpty(connectionConfiguration.getProviderProperty(PostgreConstants.PG_PASS_HOSTNAME))) {

import org.eclipse.swt.layout.GridData;
    public void createControl(@NotNull Composite authPanel, Object object, @NotNull Runnable propertyChangeListener) {
                connectionConfiguration.getProviderProperty(PostgreConstants.PG_PASS_HOSTNAME));
 * limitations under the License.

        overrideHostname.addSelectionListener(new SelectionAdapter() {
                PostgreConstants.PG_PASS_HOSTNAME,
        usernameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        usernameLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    }
                overriddenHostnameText.getText());

/*
            PostgreConstants.PG_PASS_HOSTNAME)));
import org.jkiss.code.NotNull;
 *
 * PgPass UI config (user name only)
    }
 * you may not use this file except in compliance with the License.
    public void resetSettings(@NotNull DBPDataSourceContainer dataSource) {

    }
import org.eclipse.swt.widgets.Label;
        overriddenHostnameText.setEnabled(overrideHostname.getSelection());
        overriddenHostnameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        usernameText = new Text(authPanel, SWT.BORDER);
        loadSettings(dataSource);
    public boolean isComplete() {
import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
    @Override
    @Override
package org.jkiss.dbeaver.ext.postgresql.ui;
        overrideHostname.setToolTipText(PostgreMessages.dialog_connection_pgpass_hostname_override_tip);
        this.usernameText.setText(CommonUtils.notEmpty(connectionConfiguration.getUserName()));
    private Button overrideHostname;
            @Override
 * DBeaver - Universal Database Manager
        final DBPConnectionConfiguration connectionConfiguration = dataSource.getConnectionConfiguration();
 * You may obtain a copy of the License at

