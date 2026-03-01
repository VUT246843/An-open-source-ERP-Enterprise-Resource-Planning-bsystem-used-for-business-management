        GridData gd = new GridData(GridData.FILL_BOTH);
            return super.isComplete() &&
        dbText.setLayoutData(gd);
        gd.horizontalSpan = 3;
    /**
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        Composite mainGroup = new Composite(composite, SWT.NONE);
import org.eclipse.jface.dialogs.IDialogPage;
    }
    private Text dbText;
        } else {
        }
            public void widgetSelected(SelectionEvent e) {
        urlText.addModifyListener(e -> site.updateButtons());

                hostText.setText(
                (portText == null || !CommonUtils.isEmpty(portText.getText()));
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        setupConnectionModeSelection(urlText, useURL, GROUP_CONNECTION_ARR);
    }
        }
            }
        }

            addrGroup,
        updateUrl();
                hostText.setText(connectionInfo.getHostName());
    private Text hostText;
        if (showNonDefault != null) {
        final DBPDriver driver = site.getDriver();
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    private Text portText;
        gd.grabExcessHorizontalSpace = true;

    @Override
import java.util.Locale;
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;

        SelectionAdapter typeSwitcher = new SelectionAdapter() {
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
 * distributed under the License is distributed on an "AS IS" BASIS,
            2);
        UIUtils.setDefaultTextControlWidthHint(dbText);
        };
        }
            }
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                portText.setText(connectionInfo.getHostPort());
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.events.SelectionEvent;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public PostgreServerType getServerType(DBPDriver driver) {
            4,
            @Override
        gd = new GridData(GridData.FILL_HORIZONTAL);
            urlText.setText(dataSourceContainer.getConnectionConfiguration().getUrl());
            portText.addModifyListener(textListener);
import org.jkiss.dbeaver.ui.UIUtils;
 * you may not use this file except in compliance with the License.
                : PostgreMessages.dialog_setting_connection_host
        urlText = new Text(addrGroup, SWT.BORDER);

import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    private boolean activated = false;
            connectionInfo.setHostPort(portText.getText().trim());

                portText.setText(CommonUtils.notEmpty(driver.getDefaultPort()));
        hostText.addModifyListener(textListener);
        activated = true;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();
            String databaseName = connectionInfo.getDatabaseName();
        final DBPDriver driver = site.getDriver();

    public boolean isComplete() {
    private Button showNonDefault;
        createConnectionModeSwitcher(addrGroup, typeSwitcher);
        addControlToGroup(GROUP_CONNECTION, dbLabel, dbText);
        if (typeURLRadio != null) {
        //addControlToGroup(GROUP_CONNECTION, showNonDefault);
                updateUrl();
 * DBeaver - Universal Database Manager
        }


                if (getSite().isNew()) {
            connectionInfo.setUrl(urlText.getText());
        setControl(mainGroup);
 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.ext.postgresql.ui;
            if (CommonUtils.isEmpty(databaseName)) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
        dbText.addModifyListener(textListener);
        super.loadSettings();
            new DriverPropertiesDialogPage(this)
                site.updateButtons();
     * @param driver to read server type from custom properties

    public void createControl(Composite composite) {
            } else {
        };
            serverType.isCloudServer()
    @Override
                ? PostgreMessages.dialog_setting_connection_cloud_instance
    @Override
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        }
    }

 * See the License for the specific language governing permissions and
        Label dbLabel = UIUtils.createControlLabel(addrGroup, PostgreMessages.dialog_setting_connection_database);
        if (showNonDefault != null) {
        final boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;
     */
        UIUtils.createControlLabel(addrGroup, UIConnectionMessages.dialog_connection_url_label);
            }
                connectionInfo.getProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB),
    private void updateUrl() {
                setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), GROUP_CONNECTION_ARR);
            return DBeaverIcons.getImage(logoImage);

        hostText = new Text(addrGroup, SWT.BORDER);
            Label portLabel = UIUtils.createControlLabel(addrGroup, PostgreMessages.dialog_setting_connection_port);
        if (useURL) {
        };
        if (logoImage != null) {
                    CommonUtils.toString(site.getDriver().getDefaultHost(), PostgreConstants.DEFAULT_HOST));
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
    public Image getImage() {

            PostgreMessages.dialog_setting_connection_nondefaultDatabase_tip,

    }
        if (isCustomURL()) {
            portText.setLayoutData(gd);
        }
    
                DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB)));
            } else if (getSite().isNew()) {
import org.eclipse.swt.widgets.Label;
    public void loadSettings() {
        return DBeaverIcons.getImage(serverType.getIcon());
import org.jkiss.utils.CommonUtils;
                !CommonUtils.isEmpty(hostText.getText()) &&
        } else {
/**

                    }
import org.jkiss.dbeaver.model.DBPImage;
        addControlToGroup(GROUP_CONNECTION, hostLabel, hostText);
            urlText.setText(connectionInfo.getUrl());
    @Override
 */
        mainGroup.setLayout(new GridLayout(1, false));
            false,
                        databaseName = PostgreConstants.DEFAULT_DATABASE;
        return new IDialogPage[] {
import org.jkiss.dbeaver.ui.IDialogPageProvider;
        gd.widthHint = 355;
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        super.saveSettings(dataSource);
            }
public class PostgreConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
        final ModifyListener textListener = e -> {
        );
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
        }
                updateUrl();
        }
import org.eclipse.swt.widgets.Composite;
 *
        mainGroup.setLayoutData(gd);
        return PostgreUtils.getServerType(driver);
        final DBPDriver driver = site.getDriver();
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
        PostgreServerType serverType = getServerType(driver);
        createDriverPanel(mainGroup);
    }
                typeURLRadio.getSelection() ? DBPDriverConfigurationType.URL : DBPDriverConfigurationType.MANUAL);

        hostText.setLayoutData(gd);
            connectionInfo.setDatabaseName(dbText.getText().trim());
        if (hostText != null) {
            GridData.FILL_HORIZONTAL);
            PostgreMessages.dialog_setting_connection_nondefaultDatabase,
    @Override
                }
            portText = new Text(addrGroup, SWT.BORDER);
            gd.horizontalSpan = 3;
        UIUtils.setDefaultTextControlWidthHint(hostText);

        return true;
        gd.grabExcessHorizontalSpace = true;
     * Returns server type for correct classes initialization
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
        }
                    databaseName = driver.getDefaultDatabase();
        createAuthPanel(mainGroup, 1);
        gd = new GridData(GridData.FILL_HORIZONTAL);
import org.eclipse.swt.events.SelectionAdapter;
 *
 * Unless required by applicable law or agreed to in writing, software
            UIConnectionMessages.dialog_connection_server_label,
        } else {
        }
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        // Load values from new connection info
 * limitations under the License.

            new PostgreConnectionPageAdvanced(this),
        if (hostText != null) {
        }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        PostgreServerType serverType = getServerType(driver);
        if (dbText != null) {
            }
        urlText.setLayoutData(gd);
        }
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
import org.eclipse.swt.layout.GridLayout;
    }
        DBPImage logoImage = driver.getLogoImage();
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
        if (serverType.needsPort()) {
    public void saveSettings(DBPDataSourceContainer dataSource) {

            addrGroup,
                    if (CommonUtils.isEmpty(databaseName)) {
                hostText != null &&
            connectionInfo.setProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB, String.valueOf(showNonDefault.getSelection()));
        saveSettings(dataSourceContainer);
        showNonDefault = UIUtils.createCheckbox(
            addControlToGroup(GROUP_CONNECTION, portLabel, portText);
        gd.grabExcessHorizontalSpace = true;
        Label hostLabel = UIUtils.createControlLabel(
            dbText.setText(databaseName);
        if (portText != null) {
    
        if (portText != null) {

        }

    protected boolean isSessionRoleSupported() {
            urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
 * You may obtain a copy of the License at
                    databaseName = "";
import org.jkiss.dbeaver.runtime.DBWorkbench;
            if (activated) {
            connectionInfo.setHostName(hostText.getText().trim());
     *
import org.jkiss.dbeaver.model.connection.DBPDriver;
 */
    }
    }
    }
            return !CommonUtils.isEmpty(urlText.getText());
        }
    public void dispose() {

import org.eclipse.swt.SWT;
    @Override
        
        super.dispose();
        Composite addrGroup = UIUtils.createTitledComposite(
        if (dbText != null) {
    }
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
        dbText = new Text(addrGroup, SWT.BORDER);
        
        dbText.setMessage(PostgreMessages.dialog_database_name_hint);
 * PostgreConnectionPage

            connectionInfo.setConfigurationType(
import org.eclipse.swt.events.ModifyListener;
        gd = new GridData(GridData.FILL_HORIZONTAL);
                } else {
import org.eclipse.swt.graphics.Image;
            showNonDefault.setSelection(CommonUtils.getBoolean(

}
/*
    private Text urlText;
            mainGroup,
