import org.jkiss.dbeaver.ext.postgresql.ui.PostgreConnectionPageAdvanced;
        dbText = new Text(addrGroup, SWT.BORDER);
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
import org.eclipse.swt.widgets.Label;
        Composite addrGroup = UIUtils.createTitledComposite(mainGroup, UIConnectionMessages.dialog_connection_server_label, 4,
    public boolean isComplete() {
        dbText.setLayoutData(gd);
 * KingbaseConnectionPage
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        gd.grabExcessHorizontalSpace = true;
        gd.grabExcessHorizontalSpace = true;
                && (portText == null || !CommonUtils.isEmpty(portText.getText()));
import org.eclipse.swt.layout.GridData;

                }
        UIUtils.createControlLabel(addrGroup, UIConnectionMessages.dialog_connection_url_label);
        return DBeaverIcons.getImage(serverType.getIcon());
        final boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;
            serverType.isCloudServer() ? PostgreMessages.dialog_setting_connection_cloud_instance

    private Text urlText;
        urlText.addModifyListener(e -> site.updateButtons());
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
                : PostgreMessages.dialog_setting_connection_host);
                if (getSite().isNew()) {
        addControlToGroup(GROUP_CONNECTION, hostLabel);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        hostText.addModifyListener(textListener);
    }
            }
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
    @Override
        }
        UIUtils.setDefaultTextControlWidthHint(hostText);
import org.jkiss.dbeaver.ui.UIUtils;
        urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
        } else {
    @Override
                site.updateButtons();
        }
        dbText.addModifyListener(textListener);
                        databaseName = PostgreConstants.DEFAULT_DATABASE;
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (dbText != null) {
    }
        saveSettings(dataSourceContainer);
        // Load values from new connection info
        final ModifyListener textListener = e -> {
    private boolean activated = false;
        if (hostText != null) {
            portText.addModifyListener(textListener);
            Label portLabel = UIUtils.createControlLabel(addrGroup, PostgreMessages.dialog_setting_connection_port);
import org.eclipse.swt.graphics.Image;
        gd = new GridData(GridData.FILL_HORIZONTAL);
        dbText.setMessage(PostgreMessages.dialog_database_name_hint);
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
            portText.setLayoutData(gd);

        Label hostLabel = UIUtils.createControlLabel(addrGroup,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    protected boolean isSessionRoleSupported() {
        setupConnectionModeSelection(urlText, useURL, GROUP_CONNECTION_ARR);
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();

import org.eclipse.swt.events.ModifyListener;
    }
}
        UIUtils.setDefaultTextControlWidthHint(dbText);
        gd.horizontalSpan = 3;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */


import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
            } else if (getSite().isNew()) {
import java.util.Locale;
    private Text portText;
        createDriverPanel(mainGroup);
        final DBPDriver driver = site.getDriver();
            }
 * DBeaver - Universal Database Manager
        if (isCustomURL()) {
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;


        Label dbLabel = UIUtils.createControlLabel(addrGroup, PostgreMessages.dialog_setting_connection_database);
        if (dbText != null) {
        urlText = new Text(addrGroup, SWT.BORDER);
 */
        if (serverType.needsPort()) {
import org.eclipse.swt.widgets.Composite;

import org.jkiss.dbeaver.model.connection.DBPDriver;

    public void saveSettings(DBPDataSourceContainer dataSource) {

        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();
        addControlToGroup(GROUP_CONNECTION, dbText);
 *
                hostText.setText(connectionInfo.getHostName());
                    databaseName = "";
            urlText.setText(connectionInfo.getUrl());
        urlText.setLayoutData(gd);
    }
    
            }
import org.eclipse.swt.events.SelectionEvent;
            }
            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
        mainGroup.setLayout(new GridLayout(1, false));


        };
        super.loadSettings();
                } else {

            String databaseName = connectionInfo.getDatabaseName();
import org.eclipse.swt.events.SelectionAdapter;
        if (portText != null) {

                setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), GROUP_CONNECTION_ARR);
    public void loadSettings() {
                portText.setText(CommonUtils.notEmpty(driver.getDefaultPort()));
 * See the License for the specific language governing permissions and
    }
        setControl(mainGroup);
    
                    if (CommonUtils.isEmpty(databaseName)) {
 * You may obtain a copy of the License at
            portText = new Text(addrGroup, SWT.BORDER);
 * limitations under the License.
/**
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
 * Copyright (C) 2010-2026 DBeaver Corp and others
     */
import org.eclipse.jface.dialogs.IDialogPage;
        if (portText != null) {
            @Override
        hostText.setLayoutData(gd);
import org.eclipse.swt.widgets.Text;
    private void updateUrl() {
                    databaseName = driver.getDefaultDatabase();
    private Text hostText;
        gd = new GridData(GridData.FILL_HORIZONTAL);
        hostText = new Text(addrGroup, SWT.BORDER);
    @Override
        return true;
        PostgreServerType serverType = getServerType(driver);
        return new IDialogPage[]
 * distributed under the License is distributed on an "AS IS" BASIS,
            public void widgetSelected(SelectionEvent e) {
        }
    private Text dbText;
        createAuthPanel(mainGroup, 1);
                hostText.setText(CommonUtils.toString(site.getDriver().getDefaultHost(), PostgreConstants.DEFAULT_HOST));

package org.jkiss.dbeaver.ext.kingbase.ui.views;
        updateUrl();

    }
        }
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            if (activated) {
    @Override
        if (useURL) {
import org.eclipse.swt.SWT;
                    }
        };
/*
        SelectionAdapter typeSwitcher = new SelectionAdapter() {
        } else {
     * Returns server type for correct classes initialization
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.utils.CommonUtils;
            connectionInfo.setDatabaseName(dbText.getText().trim());
 *
        return PostgreUtils.getServerType(driver);
        addControlToGroup(GROUP_CONNECTION, hostText);
    @Override
            return !CommonUtils.isEmpty(urlText.getText());
        super.saveSettings(dataSource);
    }
    }
            dbText.setText(databaseName);
    /**
            addControlToGroup(GROUP_CONNECTION, portLabel);
        final DBPDriver driver = site.getDriver();
    @Override
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;

    @Override
        Composite mainGroup = new Composite(composite, SWT.NONE);
        }
            GridData.FILL_HORIZONTAL);
public class KingbaseConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
 * you may not use this file except in compliance with the License.
        { new PostgreConnectionPageAdvanced(null), new DriverPropertiesDialogPage(this) };
                portText.setText(connectionInfo.getHostPort());
            addControlToGroup(GROUP_CONNECTION, portText);
    
            connectionInfo.setHostPort(portText.getText().trim());
    public void dispose() {
        final DBPDriver driver = site.getDriver();
 *
import org.jkiss.dbeaver.ui.IDialogPageProvider;

        super.dispose();

import org.eclipse.swt.layout.GridLayout;
                updateUrl();

 * Unless required by applicable law or agreed to in writing, software
            } else {
        if (hostText != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 355;
            if (CommonUtils.isEmpty(databaseName)) {
        }
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));

        mainGroup.setLayoutData(gd);
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        createConnectionModeSwitcher(addrGroup, typeSwitcher);
    public PostgreServerType getServerType(DBPDriver driver) {

            gd.horizontalSpan = 3;
    public void createControl(Composite composite) {
        gd.horizontalSpan = 3;

                updateUrl();
        PostgreServerType serverType = getServerType(driver);
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        }
        activated = false;
    
        }


            }
        }
        gd.grabExcessHorizontalSpace = true;
        addControlToGroup(GROUP_CONNECTION, dbLabel);
    public Image getImage() {
            connectionInfo.setHostName(hostText.getText().trim());
            return super.isComplete() && hostText != null && !CommonUtils.isEmpty(hostText.getText())
