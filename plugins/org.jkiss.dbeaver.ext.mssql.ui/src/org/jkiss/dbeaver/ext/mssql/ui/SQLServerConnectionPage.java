        boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;
    }
                portLabel.setText(SQLServerUIMessages.dialog_connection_port_label);
            UIUtils.setDefaultTextControlWidthHint(hostText);

                gd.horizontalSpan = 3;
        return new IDialogPage[] { new DriverPropertiesDialogPage(this) };
        LOGO_SQLSERVER = createImage("icons/mssql_logo.png");
            return hostText != null && !CommonUtils.isEmpty(hostText.getText());
    @Override
            }
                    false,
    }
    @Override
                hostText.setText(
        createDriverPanel(settingsGroup);
        needsPort = CommonUtils.getBoolean(getSite().getDriver().getDriverParameter("needsPort"), true);
        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();
        return SQLServerUtils.isDriverSqlServer(getSite().getDriver());
                updateUrl();

            dbLabel = new Label(addrGroup, SWT.NONE);
        }
    public Image getImage() {
import org.eclipse.swt.layout.GridLayout;
    @Override
import org.jkiss.dbeaver.ui.DBeaverIcons;
        // Load values from new connection info
                showAllDatabases = UIUtils.createCheckbox(
            connectionInfo.setHostName(hostText.getText().trim());
            hostText.setLayoutData(gd);
            if (isDriverAzure || !needsPort) {

        Composite settingsGroup = new Composite(composite, SWT.NONE);
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            connectionInfo.setDatabaseName(dbText.getText().trim());
import org.eclipse.jface.dialogs.IDialogPage;
        }
                gd.widthHint = UIUtils.getFontHeight(portText) * 7;
            }
                setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), GROUP_CONNECTION_ARR);
    }
        if (hostText != null) {
        }
                String.valueOf(showAllDatabases.getSelection()));
import org.jkiss.utils.CommonUtils;
            UIConnectionMessages.dialog_connection_server_label,
        LOGO_BABELFISH = createImage("icons/babelfish_logo.png");
        }
        gd.grabExcessHorizontalSpace = true;
            }
                gd = new GridData(GridData.CENTER);
/*
                addControlToGroup(GROUP_CONNECTION, portLabel, portText);
            public void widgetSelected(SelectionEvent e) {
            dbLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        }
        LOGO_AZURE = createImage("icons/azure_logo.png");
 * See the License for the specific language governing permissions and

                    SQLServerUIMessages.dialog_setting_trust_server_certificate_tip,

            hostLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

    private final Image LOGO_SQLSERVER;
        UIUtils.dispose(LOGO_BABELFISH);
    private final Image LOGO_SYBASE;
                String.valueOf(trustServerCertificate.getSelection()));
        boolean isSqlServer = isSqlServer();
                site.updateButtons();
        if (showAllDatabases != null) {
    private boolean isDriverBabelfish() {
        Label urlLabel = UIUtils.createControlLabel(addrGroup, UIConnectionMessages.dialog_connection_url_label);

    private Text hostText;
    }

                databaseName = CommonUtils.notEmpty(site.getDriver().getDefaultDatabase());

            } else {
        }
        );
            connectionInfo.setUrl(urlText.getText());
        }
        if (useURL) {
    private Text urlText;
import org.jkiss.dbeaver.ui.UIUtils;
            gd.grabExcessHorizontalSpace = true;

            if (!isSqlServer) {
 * You may obtain a copy of the License at
    private boolean needsPort;
    private Text dbText;

            }
                portLabel = new Label(addrGroup, SWT.NONE);
        activated = true;
import org.eclipse.swt.events.SelectionEvent;
        }
            return DBeaverIcons.getImage(logoImage);
import org.eclipse.swt.SWT;
        LOGO_SYBASE = createImage("icons/sybase_logo.png");
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
    }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    CommonUtils.toString(
        }
        };
        }
        if (logoImage != null) {

                String.valueOf(showAllSchemas.getSelection()));
    private final Image LOGO_AZURE;
 */
        } else {
        createConnectionModeSwitcher(addrGroup, typeSwitcher);
 *
        urlText.addModifyListener(e -> site.updateButtons());
 * limitations under the License.
            hostLabel.setText(SQLServerUIMessages.dialog_connection_host_label);
                logo = LOGO_AZURE;
        connectionInfo.setConfigurationType(

import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
            settingsGroup,
        UIUtils.dispose(LOGO_AZURE);
        urlText.setLayoutData(gd);
        return SQLServerUtils.isDriverAzure(getSite().getDriver());

            dbLabel.setText(SQLServerUIMessages.dialog_connection_database_schema_label);

    private boolean isDriverAzure() {
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
import org.eclipse.swt.events.ModifyListener;
                trustServerCertificate = UIUtils.createCheckbox(
 *
        Composite addrGroup = UIUtils.createTitledComposite(
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
            }
        if (trustServerCertificate != null) {
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Button;
            dbText = new Text(addrGroup, SWT.BORDER);



        SelectionAdapter typeSwitcher = new SelectionAdapter() {
 * Copyright (C) 2010-2026 DBeaver Corp and others

        UIUtils.dispose(LOGO_SYBASE);
    private Button encryptPassword;
            } else {
 * DBeaver - Universal Database Manager
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
            if (getSite().isNew() && CommonUtils.isEmpty(databaseName)) {
        }
        settingsGroup.setLayoutData(gd);
 * Unless required by applicable law or agreed to in writing, software
        setControl(settingsGroup);
    private final Image LOGO_BABELFISH;
        } else {
                logo = LOGO_BABELFISH;
            Composite secureGroup = UIUtils.createTitledComposite(settingsGroup, SQLServerUIMessages.dialog_setting_connection_settings, 1, GridData.FILL_HORIZONTAL);
    }

        if (showAllDatabases != null) {
                portText.setText(site.getDriver().getDefaultPort());
        boolean isDriverAzure = isSqlServer && isDriverAzure();
        super.saveSettings(dataSource);
    public void createControl(Composite composite) {
                portText.addModifyListener(textListener);
            showAllSchemas = UIUtils.createCheckbox(secureGroup, SQLServerUIMessages.dialog_setting_show_all_schemas, SQLServerUIMessages.dialog_setting_show_all_schemas_tip, true, 1);
            GridData.FILL_HORIZONTAL

    public boolean isComplete() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
                    SQLServerUIMessages.dialog_setting_show_all_databases,
    @Override
            hostLabel = new Label(addrGroup, SWT.NONE);
    private boolean isSqlServer() {
public class SQLServerConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
        UIUtils.dispose(LOGO_SQLSERVER);
        if (dbText != null) {
            } else {
import org.jkiss.dbeaver.model.DBPImage;
                connectionInfo.getProviderProperty(SQLServerConstants.PROP_SSL_TRUST_SERVER_CERTIFICATE), false));
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    }
        }
            dbText.setLayoutData(gd);
    public void dispose() {
import org.eclipse.swt.graphics.Image;
    public void loadSettings() {
        DBPImage logoImage = site.getDriver().getLogoImage();
        if (isSqlServer()) {

            connectionInfo.setProviderProperty(SQLServerConstants.PROP_SHOW_ALL_SCHEMAS,
    private Label dbLabel;
    public void saveSettings(DBPDataSourceContainer dataSource) {

                hostText.setText(connectionInfo.getHostName());
            connectionInfo.setProviderProperty(SQLServerConstants.PROP_SHOW_ALL_DATABASES,
        if (portText != null) {

        gd.widthHint = 355;
                portLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
            }
 *
    private void updateUrl() {
        {

 * Licensed under the Apache License, Version 2.0 (the "License");
                    );
        }
    private Label hostLabel;
import org.eclipse.swt.layout.GridData;
                portText.setText(String.valueOf(connectionInfo.getHostPort()));
    }
            UIUtils.setDefaultTextControlWidthHint(dbText);
        gd.horizontalSpan = 3;

}
                    secureGroup,
            if (isDriverAzure()) {
            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
            }
        Image logo = LOGO_SYBASE;
            } else if (isDriverBabelfish()) {

        {

import org.eclipse.swt.widgets.Label;
        if (dbText != null) {
            encryptPassword.setSelection(CommonUtils.toBoolean(connectionInfo.getProviderProperty(SQLServerConstants.PROP_ENCRYPT_PASSWORD)));
        

    @Override
            urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
package org.jkiss.dbeaver.ext.mssql.ui;
            if (isSqlServer) {
            urlText.setText(dataSourceContainer.getConnectionConfiguration().getUrl());
import org.jkiss.dbeaver.ui.IDialogPageProvider;

        }
        super.dispose();

            addControlToGroup(GROUP_CONNECTION, dbLabel, dbText);
            addControlToGroup(GROUP_CONNECTION, hostLabel, hostText);
            trustServerCertificate.setSelection(CommonUtils.getBoolean(

    private Text portText;
                portText = new Text(addrGroup, SWT.BORDER);

        }
        }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
    }
        }
            @Override
            4,
                encryptPassword = UIUtils.createCheckbox(secureGroup, SQLServerUIMessages.dialog_setting_encrypt_password, SQLServerUIMessages.dialog_setting_encrypt_password_tip, false, 1);
            return !CommonUtils.isEmpty(urlText.getText());
import org.eclipse.swt.widgets.Composite;
        }
import org.eclipse.swt.widgets.Text;
        return SQLServerUtils.isDriverBabelfish(getSite().getDriver());
        if (showAllSchemas != null) {
                logo = LOGO_SQLSERVER;
    }
        }
    private Button trustServerCertificate;
        gd = new GridData(GridData.FILL_HORIZONTAL);
            } else {
        saveSettings(dataSourceContainer);

    @Override
            hostText.addModifyListener(textListener);
            gd = new GridData(GridData.FILL_HORIZONTAL);
        }
        setupConnectionModeSelection(urlText, useURL, GROUP_CONNECTION_ARR);
                        isDriverAzure ? SQLServerConstants.DEFAULT_HOST_AZURE : SQLServerConstants.DEFAULT_HOST)
                    SQLServerUIMessages.dialog_setting_show_all_databases_tip,
        urlLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

                portText.setText("");
        if (trustServerCertificate != null) {
        if (!isSqlServer() && encryptPassword != null) {
        showAllSchemas.setSelection(CommonUtils.toBoolean(connectionInfo.getProviderProperty(SQLServerConstants.PROP_SHOW_ALL_SCHEMAS)));
        
        }
        return logo;

    private Label portLabel;
                    1);
            dbText.setText(CommonUtils.notEmpty(databaseName));
    @Override
            connectionInfo.setHostPort(portText.getText().trim());
            gd.grabExcessHorizontalSpace = true;
            }
        }
    public SQLServerConnectionPage() {
            if (isDriverAzure || isDriverBabelfish()) {

    private boolean activated;
    private Button showAllDatabases;

        if (hostText != null) {
            gd = new GridData(GridData.FILL_HORIZONTAL);
                    SQLServerUIMessages.dialog_setting_trust_server_certificate,

        if (encryptPassword != null) {
                    false,
            dbText.addModifyListener(textListener);
                        site.getDriver().getDefaultHost(),
        {
import org.eclipse.swt.events.SelectionAdapter;
            } else if (site.getDriver().getDefaultPort() != null) {
            urlText.setText(connectionInfo.getUrl());
                String.valueOf(encryptPassword.getSelection()));
            String databaseName = connectionInfo.getDatabaseName();
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
                updateUrl();
            connectionInfo.setProviderProperty(SQLServerConstants.PROP_SSL_TRUST_SERVER_CERTIFICATE,
        
            if (activated) {
                    1);
                // no port number for Azure
            }
        updateUrl();
    private Button showAllSchemas;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.loadSettings();

        if (portText != null) {
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
                CommonUtils.toBoolean(connectionInfo.getProviderProperty(SQLServerConstants.PROP_SHOW_ALL_DATABASES)));
        };
            hostText = new Text(addrGroup, SWT.BORDER);

        if (isCustomURL()) {

        {

                portText.setLayoutData(gd);
    }
    }
            typeURLRadio != null && typeURLRadio.getSelection() ? DBPDriverConfigurationType.URL : DBPDriverConfigurationType.MANUAL);
                    secureGroup,

            connectionInfo.setProviderProperty(SQLServerConstants.PROP_ENCRYPT_PASSWORD,
            createAuthPanel(settingsGroup, 1);
        GridData gd = new GridData(GridData.FILL_BOTH);
            gd.horizontalSpan = 3;
            showAllDatabases.setSelection(
        boolean isDriverAzure = isSqlServer() && isDriverAzure();
        settingsGroup.setLayout(new GridLayout(1, false));
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
        urlText = new Text(addrGroup, SWT.BORDER);
        }
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
        ModifyListener textListener = e -> {

