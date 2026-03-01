    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
        }
        createConnectionModeSwitcher(serverGroup, typeSwitcher);
        }
        };
import org.eclipse.swt.layout.GridLayout;
        activated = true;
        final boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        dbText.addModifyListener(textListener);
            MySQLUIMessages.dialog_connection_show_all_databases_tip,
import org.eclipse.swt.SWT;
    public Image getImage() {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
            ));
            urlText.setText(dataSourceContainer.getConnectionConfiguration().getUrl());
            );
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        gd.widthHint = 355;
            UIConnectionMessages.dialog_connection_server_label,
            return !CommonUtils.isEmpty(urlText.getText());
                updateUrl();
    public void loadSettings() {
    @Override
        gd.grabExcessHorizontalSpace = true;
        urlText.addModifyListener(e -> site.updateButtons());
        addrGroup.setLayoutData(gd);
            }
            connectionInfo.setHostName(hostText.getText().trim());
 */
    }
        if (portText != null) {
import java.util.Locale;
    }
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        showAllDatabases = UIUtils.createCheckbox(
            }
import org.eclipse.swt.widgets.Button;




 */
                updateUrl();
                portText.setText("");
        Composite serverGroup = UIUtils.createTitledComposite(
        return super.isComplete() &&
        // There is a bug in Eclipse which leads to SWTException after wizard image change
        hostText = new Text(serverGroup, SWT.BORDER);
    @Override
        }
                portText.setText(connectionInfo.getHostPort());
            dbText.setText(CommonUtils.toString(
            showAllDatabases.setSelection(CommonUtils.getBoolean(
        if (useURL) {
        } else {
 *
    private Text hostText;
        }
            return LOGO_MYSQL;
                MySQLConstants.PROP_SHOW_ALL_DBS_DEFAULT
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
        urlText.setLayoutData(gd);
                CommonUtils.notEmpty(site.getDriver().getDefaultDatabase())
            ));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
        }
        }
 *
                hostText.setText(connectionInfo.getHostName());
            needsPort ? MySQLUIMessages.dialog_connection_host : MySQLUIMessages.dialog_connection_instance
        setupConnectionModeSelection(urlText, useURL, GROUP_CONNECTION_ARR);
        UIUtils.dispose(LOGO_MYSQL);
    @Override
        );
        createDriverPanel(addrGroup);
import org.eclipse.jface.dialogs.IDialogPage;
            @Override
        if (portText != null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
            2
            connectionInfo.setProviderProperty(
import org.jkiss.dbeaver.ui.DBeaverIcons;
        updateUrl();
            Label portLabel = UIUtils.createControlLabel(serverGroup, MySQLUIMessages.dialog_connection_port);
        gd.grabExcessHorizontalSpace = true;
            if (activated) {
        gd.grabExcessHorizontalSpace = true;
        if (driver.getId().equalsIgnoreCase(MySQLConstants.DRIVER_ID_MARIA_DB)) {
    private Button showAllDatabases;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        super.dispose();
        // We set image only once at activation
        LOGO_MYSQL = createImage("icons/mysql_logo.png");
    }
            urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
    private boolean activated = false;
        }
        if (hostText != null) {
    }
        } else {
    public void createControl(Composite composite) {
                site.updateButtons();
import org.eclipse.swt.layout.GridData;
        gd = new GridData(GridData.FILL_HORIZONTAL);
                portText.setText(site.getDriver().getDefaultPort());
            4,
        addControlToGroup(GROUP_CONNECTION, dbLabel, dbText);
                String.valueOf(showAllDatabases.getSelection())
        UIUtils.setDefaultTextControlWidthHint(hostText);
        saveSettings(dataSourceContainer);
        }
        hostText.setLayoutData(gd);
        if (isCustomURL()) {
        }
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
import org.eclipse.swt.widgets.Label;
import org.jkiss.dbeaver.ui.IDialogPageProvider;
import org.eclipse.swt.graphics.Image;
            urlText.setText(connectionInfo.getUrl());
    }
    @Override

        gd.horizontalSpan = 3;
            false,
            public void widgetSelected(SelectionEvent e) {
package org.jkiss.dbeaver.ext.mysql.ui.views;
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
                setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), GROUP_CONNECTION_ARR);
    public MySQLConnectionPage() {

                connectionInfo.getProviderProperty(MySQLConstants.PROP_SHOW_ALL_DBS),
    }

        dbText = new Text(serverGroup, SWT.BORDER);
            portText = new Text(serverGroup, SWT.BORDER);
        Label dbLabel = UIUtils.createControlLabel(serverGroup, MySQLUIMessages.dialog_connection_database);
            connectionInfo.setDatabaseName(dbText.getText().trim());
    @Override
        Label hostLabel = UIUtils.createControlLabel(
        Composite addrGroup = new Composite(composite, SWT.NONE);
    private void updateUrl() {
        LOGO_MARIADB = createImage("icons/mariadb_logo.png");
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;


        if (logoImage != null) {
    private Text urlText;
 * DBeaver - Universal Database Manager



        GridData gd = new GridData(GridData.FILL_BOTH);
/*

    private Text dbText;
                hostText.setText(
    @Override
}
            connectionInfo.setConfigurationType(
        urlText = new Text(serverGroup, SWT.BORDER);
        );
        } else {
            gd.horizontalSpan = 3;
    public void dispose() {
        DBPImage logoImage = driver.getLogoImage();
            return DBeaverIcons.getImage(logoImage);
            addrGroup,
 * Copyright (C) 2010-2026 DBeaver Corp and others

        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();

        setControl(addrGroup);
    private Text portText;

        UIUtils.createControlLabel(serverGroup, UIConnectionMessages.dialog_connection_url_label);
import org.jkiss.dbeaver.model.connection.DBPDriver;
    private final Image LOGO_MARIADB;
        DBPDriver driver = getSite().getDriver();
            addControlToGroup(GROUP_CONNECTION, portLabel, portText);
        if (needsPort) {
        }
import org.eclipse.swt.events.ModifyListener;
        super.loadSettings();

                connectionInfo.getDatabaseName(),
        super.saveSettings(dataSource);
        hostText.addModifyListener(textListener);
import org.jkiss.dbeaver.model.DBPImage;
    public boolean isComplete() {
                MySQLConstants.PROP_SHOW_ALL_DBS,
        return new IDialogPage[] {
                typeURLRadio.getSelection() ? DBPDriverConfigurationType.URL : DBPDriverConfigurationType.MANUAL);

/**
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.eclipse.swt.events.SelectionAdapter;
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
        }
 * MySQLConnectionPage
        gd = new GridData(GridData.FILL_HORIZONTAL);
            } else {
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        }
 * See the License for the specific language governing permissions and

            } else if (site.getDriver().getDefaultPort() != null) {
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
        if (hostText != null) {
        addrGroup.setLayout(new GridLayout(1, false));
            (!needsPort || !CommonUtils.isEmpty(portText.getText()));
            connectionInfo.setHostPort(portText.getText().trim());
        needsPort = CommonUtils.getBoolean(driver.getDriverParameter("needsPort"), true);
        DBPDriver driver = getSite().getDriver();
            gd.widthHint = UIUtils.getFontHeight(portText) * 10;
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
            return LOGO_MARIADB;
import org.eclipse.swt.widgets.Text;
        addControlToGroup(GROUP_CONNECTION, hostLabel, hostText);
    private boolean needsPort;
            !CommonUtils.isEmpty(hostText.getText()) &&
 *
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
        UIUtils.dispose(LOGO_MARIADB);
        }
            }
            GridData.FILL_HORIZONTAL
        if (typeURLRadio != null) {

 * You may obtain a copy of the License at
            portText.addModifyListener(textListener);
            connectionInfo.setUrl(urlText.getText());
        if (showAllDatabases != null) {
                    CommonUtils.toString(site.getDriver().getDefaultHost(), MySQLConstants.DEFAULT_HOST));
        }
        };
    private final Image LOGO_MYSQL;
        if (showAllDatabases != null) {
import org.jkiss.dbeaver.ui.UIUtils;
        }
    public void saveSettings(DBPDataSourceContainer dataSource) {
        if (dbText != null) {

            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
            } else {
        if (dbText != null) {
        };
        UIUtils.setDefaultTextControlWidthHint(dbText);
            new MySQLConnectionPageAdvanced(),
            MySQLUIMessages.dialog_connection_show_all_databases,

public class MySQLConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {

        ModifyListener textListener = e -> {
            }
        createAuthPanel(addrGroup, 1);

import org.eclipse.swt.widgets.Composite;
        SelectionAdapter typeSwitcher = new SelectionAdapter() {
            new DriverPropertiesDialogPage(this)
        );
import org.eclipse.swt.events.SelectionEvent;
            serverGroup,
            serverGroup,
    }
        gd = new GridData(GridData.FILL_HORIZONTAL);
 * distributed under the License is distributed on an "AS IS" BASIS,
        dbText.setLayoutData(gd);
        // Load values from new connection info

            hostText != null &&
 * limitations under the License.

