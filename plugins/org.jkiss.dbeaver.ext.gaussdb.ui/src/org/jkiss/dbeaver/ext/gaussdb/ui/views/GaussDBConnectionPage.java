 * limitations under the License.
        } else {
        createConnectionModeSwitcher(addrGroup, typeSwitcher);
            4,
package org.jkiss.dbeaver.ext.gaussdb.ui.views;
import org.eclipse.swt.widgets.Label;
                : PostgreMessages.dialog_setting_connection_host);
    public PostgreServerType getServerType(DBPDriver driver) {
}
                    }
                    if (CommonUtils.isEmpty(databaseName)) {
        }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        final DBPDriver driver = site.getDriver();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.eclipse.swt.events.SelectionEvent;
        urlText.addModifyListener(e -> site.updateButtons());
        hostText = new Text(addrGroup, SWT.BORDER);
                && (portText == null || !CommonUtils.isEmpty(portText.getText()));

    public boolean isComplete() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            portText.addModifyListener(textListener);
        return PostgreUtils.getServerType(driver);
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
        Composite addrGroup = UIUtils.createTitledComposite(
 */
            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
 *
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
            dbText.setText(databaseName);

                    databaseName = driver.getDefaultDatabase();
            } else {
        };
import org.jkiss.dbeaver.model.connection.DBPDriver;
                portText.setText(CommonUtils.notEmpty(driver.getDefaultPort()));
        urlText = new Text(addrGroup, SWT.BORDER);
    @Override
        addControlToGroup(GROUP_CONNECTION, dbLabel);
import org.eclipse.jface.dialogs.IDialogPage;

        UIUtils.createControlLabel(addrGroup, UIConnectionMessages.dialog_connection_url_label);
        setControl(mainGroup);
        createAuthPanel(mainGroup, 1);
        super.saveSettings(dataSource);
        dbText.setLayoutData(gd);
 * You may obtain a copy of the License at
    @Override
    }
    @Override

        if (serverType.needsPort()) {
    }
            if (activated) {
import org.jkiss.dbeaver.ui.UIUtils;
    }
    }
        addControlToGroup(GROUP_CONNECTION, dbText);

            UIConnectionMessages.dialog_connection_server_label,


        saveSettings(dataSourceContainer);
        }
        dbText = new Text(addrGroup, SWT.BORDER);
        }
            connectionInfo.setHostPort(portText.getText().trim());
        gd.horizontalSpan = 3;
import org.eclipse.swt.layout.GridLayout;
    @Override
                        databaseName = PostgreConstants.DEFAULT_DATABASE;

    private void updateUrl() {
        if (dbText != null) {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;

        } else {
        gd.widthHint = 355;
        }
import org.eclipse.swt.events.ModifyListener;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override

        GridData gd = new GridData(GridData.FILL_BOTH);
        PostgreServerType serverType = getServerType(driver);
            if (CommonUtils.isEmpty(databaseName)) {
        super.dispose();
        final DBPDriver driver = site.getDriver();
    @Override
import org.eclipse.swt.events.SelectionAdapter;

            connectionInfo.setDatabaseName(dbText.getText().trim());
    public void loadSettings() {
            }
    }

        if (hostText != null) {
        }
    private Text hostText;
            addControlToGroup(GROUP_CONNECTION, portLabel);
import java.util.Locale;
import org.jkiss.dbeaver.ext.postgresql.ui.PostgreConnectionPageAdvanced;
            gd.horizontalSpan = 3;
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
        UIUtils.setDefaultTextControlWidthHint(dbText);
        gd = new GridData(GridData.FILL_HORIZONTAL);
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
        hostText.setLayoutData(gd);
                site.updateButtons();
            } else if (getSite().isNew()) {
    public Image getImage() {
        if (portText != null) {
            mainGroup,

        createDriverPanel(mainGroup);
 *
    private Text dbText;
    }

        mainGroup.setLayout(new GridLayout(1, false));
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;
        { new PostgreConnectionPageAdvanced(null), new DriverPropertiesDialogPage(this) };
        hostText.addModifyListener(textListener);
                updateUrl();
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
 *

import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            @Override

        updateUrl();
        Label hostLabel = UIUtils.createControlLabel(addrGroup,
        Composite mainGroup = new Composite(composite, SWT.NONE);
        addControlToGroup(GROUP_CONNECTION, hostText);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        };
    private Text urlText;
                updateUrl();
        gd.horizontalSpan = 3;
            addControlToGroup(GROUP_CONNECTION, portText);
                }
    public void saveSettings(DBPDataSourceContainer dataSource) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return true;
import org.eclipse.swt.graphics.Image;
        final DBPDriver driver = site.getDriver();
        PostgreServerType serverType = getServerType(driver);

        SelectionAdapter typeSwitcher = new SelectionAdapter() {

import org.jkiss.dbeaver.ui.IDialogPageProvider;
        activated = false;

        return DBeaverIcons.getImage(serverType.getIcon());
    public void createControl(Composite composite) {
    private boolean activated = false;
            }
        urlText.setLayoutData(gd);
        return new IDialogPage[]
        gd = new GridData(GridData.FILL_HORIZONTAL);
            Label portLabel = UIUtils.createControlLabel(addrGroup, PostgreMessages.dialog_setting_connection_port);

    /**
            String databaseName = connectionInfo.getDatabaseName();
/*
        // Load values from new connection info
            urlText.setText(connectionInfo.getUrl());
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        if (portText != null) {
            return !CommonUtils.isEmpty(urlText.getText());
    }
     */
            GridData.FILL_HORIZONTAL
public class GaussDBConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
        gd.grabExcessHorizontalSpace = true;
        if (useURL) {
        final ModifyListener textListener = e -> {
    @Override
     * Returns server type for correct classes initialization
        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
            connectionInfo.setHostName(hostText.getText().trim());
 * GaussDBConnectionPage

        if (hostText != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                portText.setText(connectionInfo.getHostPort());
                setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), GROUP_CONNECTION_ARR);
        }
        super.loadSettings();
        Label dbLabel = UIUtils.createControlLabel(addrGroup, PostgreMessages.dialog_setting_connection_database);
        final boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;
        setupConnectionModeSelection(urlText, useURL, GROUP_CONNECTION_ARR);


        );
            }
            }
                    databaseName = "";
        }
        UIUtils.setDefaultTextControlWidthHint(hostText);
        gd.grabExcessHorizontalSpace = true;
 * you may not use this file except in compliance with the License.

        if (dbText != null) {

 * Unless required by applicable law or agreed to in writing, software
                hostText.setText(connectionInfo.getHostName());
import org.eclipse.swt.widgets.Composite;

import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        }
    protected boolean isSessionRoleSupported() {
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
            portText = new Text(addrGroup, SWT.BORDER);
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
            return super.isComplete() && hostText != null && !CommonUtils.isEmpty(hostText.getText())
        }
        if (isCustomURL()) {
import org.eclipse.swt.layout.GridData;
        addControlToGroup(GROUP_CONNECTION, hostLabel);
        gd.grabExcessHorizontalSpace = true;
        dbText.setMessage(PostgreMessages.dialog_database_name_hint);

            }
 */


        dbText.addModifyListener(textListener);
            serverType.isCloudServer() ? PostgreMessages.dialog_setting_connection_cloud_instance
    private Text portText;
            portText.setLayoutData(gd);
 * See the License for the specific language governing permissions and
import org.eclipse.swt.SWT;
    public void dispose() {
import org.eclipse.swt.widgets.Text;
    }
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
                } else {
        mainGroup.setLayoutData(gd);

    }
                if (getSite().isNew()) {
            public void widgetSelected(SelectionEvent e) {
                hostText.setText(CommonUtils.toString(site.getDriver().getDefaultHost(), PostgreConstants.DEFAULT_HOST));
