            urlText.setText(connectionInfo.getUrl());
    public void createControl(Composite composite)
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
 * Unless required by applicable law or agreed to in writing, software
                    setupConnectionModeSelection(urlText, typeURLRadio.getSelection(), GROUP_CONNECTION_ARR);
        if (dbText != null) {



import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                portText.setText(site.getDriver().getDefaultPort());
    public void dispose()
        };

            hostText != null && portText != null &&
        if (dbText != null) {
        setupConnectionModeSelection(urlText, useURL, GROUP_CONNECTION_ARR);
        }
 * DB2ConnectionPage
    }
 * You may obtain a copy of the License at
                @Override
            hostText.addModifyListener(textListener);
import org.eclipse.swt.events.SelectionAdapter;
        Composite control = new Composite(composite, SWT.NONE);

    @Override
        super.loadSettings();
            } else {
/*
        if (isCustomURL()) {



            portText = new Text(addrGroup, SWT.BORDER);
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        activated = true;
            connectionInfo.setDatabaseName(dbText.getText().trim());
        } else {
    }
            gd.horizontalSpan = 3;
            dbText.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));
            SelectionAdapter typeSwitcher = new SelectionAdapter() {
    @Override
                }
    private Text dbText;
        };
    private boolean activated = false;

            urlText.addModifyListener(e -> site.updateButtons());
            gd.widthHint = 355;

        if (useURL) {
        if (portText != null) {
 *
 * DBeaver - Universal Database Manager
    }
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;
            hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
                portText.setText(""); //$NON-NLS-1$
            new DriverPropertiesDialogPage(this),
import java.util.Locale;
            connectionInfo.setConfigurationType(
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
import org.jkiss.dbeaver.ui.IDialogPageProvider;
            connectionInfo.setUrl(urlText.getText());
    private Text portText;
            urlText = new Text(addrGroup, SWT.BORDER);
        if (typeURLRadio != null && typeURLRadio.getSelection()) {
            dbText.addModifyListener(textListener);
import org.eclipse.swt.events.SelectionEvent;
        if (hostText != null) {
        }
    }
import org.eclipse.swt.widgets.Label;
    @Override
 *
        UIUtils.dispose(logoImage);
            addControlToGroup(GROUP_CONNECTION, hostText);
    }
        return super.isComplete() &&
    public DB2ConnectionPage() {
            dbText = new Text(addrGroup, SWT.BORDER);

        }
}
                updateUrl();
            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        ModifyListener textListener = e -> {
            }
        }
import org.eclipse.swt.widgets.Composite;
        }
                control,
            }
            addControlToGroup(GROUP_CONNECTION, portLabel);
        createDriverPanel(control);
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;

        super.dispose();
/**
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            !CommonUtils.isEmpty(hostText.getText()) &&
    private Image logoImage;

            urlText.setLayoutData(gd);
    {
        return new IDialogPage[]{
    }
                    updateUrl();
    }
            createConnectionModeSwitcher(addrGroup, typeSwitcher);
 */
                DB2Messages.db2_connection_page_tab_database,
            addControlToGroup(GROUP_CONNECTION, hostLabel);
                site.updateButtons();
 * Licensed under the Apache License, Version 2.0 (the "License");
                GridData.FILL_HORIZONTAL
            gd.grabExcessHorizontalSpace = true;
        {
                portText.setText(String.valueOf(connectionInfo.getHostPort()));
            portLabel.setLayoutData(gd);
            return !CommonUtils.isEmpty(urlText.getText());
            gd.horizontalSpan = 3;
    public void loadSettings()
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        }
    {
        return logoImage;
        saveSettings(dataSourceContainer);
    }
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
    @Override
        createAuthPanel(control, 1);
    private Text hostText;
            gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
            hostText.setLayoutData(gd);

            hostText = new Text(addrGroup, SWT.BORDER);
                4,
    private Text urlText;

import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.layout.GridLayout;
            };
            urlText.setText(dataSourceContainer.getConnectionConfiguration().getUrl());
            connectionInfo.setHostName(hostText.getText().trim());

            Label hostLabel = UIUtils.createControlLabel(addrGroup, DB2Messages.dialog_connection_host);
            dbLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
            );
            if (activated) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.swt.widgets.Text;
public class DB2ConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate)
        }
        if (hostText != null) {
            Label portLabel = UIUtils.createControlLabel(addrGroup, DB2Messages.dialog_connection_port);
        }
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        }
        }
            !CommonUtils.isEmpty(portText.getText());
            gd.grabExcessHorizontalSpace = true;
            connectionInfo.setHostPort(portText.getText().trim());
import org.eclipse.swt.graphics.Image;

import org.jkiss.utils.CommonUtils;
        control.setLayout(new GridLayout(1, false));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {


    @Override
    public void saveSettings(DBPDataSourceContainer dataSource)
            portText.setLayoutData(gd);
package org.jkiss.dbeaver.ext.db2.ui.views;
            new DB2ConnectionTracePage(),
            UIUtils.setDefaultTextControlWidthHint(hostText);
        control.setLayoutData(new GridData(GridData.FILL_BOTH));
    public boolean isComplete()
                public void widgetSelected(SelectionEvent e) {
        }
        final boolean useURL = connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL;
 *
    {
    {
            Label dbLabel = UIUtils.createControlLabel(addrGroup, DB2Messages.dialog_connection_database);

            UIUtils.setDefaultTextControlWidthHint(dbText);
    private void updateUrl() {
            addControlToGroup(GROUP_CONNECTION, portText);
            Composite addrGroup = UIUtils.createTitledComposite(
    @Override
            addControlToGroup(GROUP_CONNECTION, dbLabel);
        if (portText != null) {
        DBPDataSourceContainer dataSourceContainer = site.getActiveDataSource();
    @Override
            portText.addModifyListener(textListener);
 * you may not use this file except in compliance with the License.
        if (typeURLRadio != null) {
import org.eclipse.jface.dialogs.IDialogPage;
            addControlToGroup(GROUP_CONNECTION, dbText);
 * See the License for the specific language governing permissions and
            gd.grabExcessHorizontalSpace = true;
import org.eclipse.swt.layout.GridData;
        super.saveSettings(dataSource);

            UIUtils.createControlLabel(addrGroup, UIConnectionMessages.dialog_connection_url_label);
            } else if (site.getDriver().getDefaultPort() != null) {
    }
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
 */

            gd = new GridData(GridData.FILL_HORIZONTAL);
            urlText.setText(dataSourceContainer.getDriver().getConnectionURL(site.getActiveDataSource().getConnectionConfiguration()));
import org.eclipse.swt.SWT;
        updateUrl();
                typeURLRadio.getSelection() ? DBPDriverConfigurationType.URL : DBPDriverConfigurationType.MANUAL);
import org.eclipse.swt.events.ModifyListener;

 * distributed under the License is distributed on an "AS IS" BASIS,

    {
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
 * limitations under the License.
            gd = new GridData(GridData.FILL_HORIZONTAL);

    public Image getImage() {
        // Load values from new connection info
            dbText.setLayoutData(gd);
        setControl(control);
        logoImage = createImage("icons/db2_logo.png"); //$NON-NLS-1$

            hostLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
