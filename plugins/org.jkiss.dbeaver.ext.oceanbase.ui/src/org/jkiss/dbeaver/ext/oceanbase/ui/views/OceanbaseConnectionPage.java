
        createAuthPanel(addrGroup, 1);

            Label databaseLabel = UIUtils.createControlLabel(hostGroup,
import org.jkiss.dbeaver.Log;
            gd = new GridData(GridData.FILL_HORIZONTAL);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
            gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        return new IDialogPage[] { new DriverPropertiesDialogPage(this) };

		}
			hostText.setText(MySQLConstants.DEFAULT_HOST);
        }
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
import org.jkiss.dbeaver.ui.IDialogPageProvider;
    @Override
    }
    @Override
package org.jkiss.dbeaver.ext.oceanbase.ui.views;
        addrGroup.setLayout(gl);
/*

import org.eclipse.jface.resource.ImageDescriptor;
            connectionInfo.setHostPort(portText.getText().trim());
        } else {
import org.eclipse.swt.widgets.Label;

        return OceanbaseAuthModelDatabaseNative.ID;
        ModifyListener textListener = e -> evaluateURL();
            portText.setLayoutData(gd);

			hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
		if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {


        DBPDataSourceContainer activeDataSource = site.getActiveDataSource();
                    OceanbaseMessages.oceanbase_connection_page_label_port);
        }
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            Label portLabel = UIUtils.createControlLabel(hostGroup,
    @NotNull


import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            UIUtils.setDefaultTextControlWidthHint(hostText);
public class OceanbaseConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
 */
            gd.horizontalSpan = 3;
            hostLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
 * You may obtain a copy of the License at
import org.eclipse.swt.events.ModifyListener;
            databaseLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
    private Text portText;
            databaseText = new Text(hostGroup, SWT.BORDER);

import org.eclipse.swt.SWT;
            UIUtils.setDefaultTextControlWidthHint(tenantText);
 */
                addrGroup,
		if (!CommonUtils.isEmpty(connectionInfo.getServerName())) {
 *
    public boolean isComplete() {
    }
        if (databaseText != null) {
    public void saveSettings(DBPDataSourceContainer dataSource) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
 * distributed under the License is distributed on an "AS IS" BASIS,
        setControl(addrGroup);

        // Composite group = new Composite(composite, SWT.NONE);
import org.eclipse.swt.widgets.Text;
        Composite addrGroup = new Composite(composite, SWT.NONE);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
                4,
    public void loadSettings() {
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
            tenantText.setLayoutData(gd);
    private static final Log log = Log.getLog(OceanbaseConnectionPage.class);
            gd.grabExcessHorizontalSpace = true;
            databaseText.setLayoutData(gd);
 *
        // group.setLayout(new GridLayout(1, true));

            gd = new GridData(GridData.FILL_HORIZONTAL);
    }
            portText.addModifyListener(textListener);
import org.jkiss.code.NotNull;
        // Load values from new connection info
                    OceanbaseMessages.oceanbase_connection_page_label_host);
 * you may not use this file except in compliance with the License.
			portText.setText(CommonUtils.notEmpty(connectionInfo.getHostPort()));
            connectionInfo.setDatabaseName(databaseText.getText().trim());
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
		} else {
import org.eclipse.swt.widgets.Composite;
        return super.isComplete() && hostText != null && databaseText != null && portText != null && tenantText != null
    private static final ImageDescriptor logoImage = Activator.getImageDescriptor("icons/ob_logo.png");
            hostText.setLayoutData(gd);
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ext.oceanbase.model.auth.OceanbaseAuthModelDatabaseNative;
                && !CommonUtils.isEmpty(hostText.getText());

            tenantText.addModifyListener(textListener);
import org.jkiss.dbeaver.ext.oceanbase.ui.internal.OceanbaseMessages;
        if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
                GridData.FILL_HORIZONTAL
        if (portText != null) {
            connectionInfo.setHostName(hostText.getText().trim());
 *
        site.updateButtons();
			databaseText.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));

            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
                    OceanbaseMessages.oceanbase_connection_page_label_tenant);

        }
            databaseText.addModifyListener(textListener);
        setImageDescriptor(logoImage);
            UIUtils.setDefaultTextControlWidthHint(databaseText);
            hostText = new Text(hostGroup, SWT.BORDER);
            Label tenantLabel = UIUtils.createControlLabel(hostGroup,
        super.saveSettings(dataSource);
        DBPConnectionConfiguration connectionInfo = activeDataSource.getConnectionConfiguration();
import java.util.Locale;
import org.jkiss.dbeaver.ui.UIUtils;
            gd.grabExcessHorizontalSpace = true;
import org.eclipse.jface.dialogs.IDialogPage;
            tenantText = new Text(hostGroup, SWT.BORDER);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            hostText.addModifyListener(textListener);
		if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
import org.jkiss.dbeaver.ext.oceanbase.ui.internal.Activator;
            portLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        if (tenantText != null) {


    private void evaluateURL() {
            gd.horizontalSpan = 3;
    }

            connectionInfo.setServerName(tenantText.getText().trim());

			tenantText.setText(CommonUtils.notEmpty(connectionInfo.getServerName()));
            gd.widthHint = UIUtils.getFontHeight(portText) * 5;
    private Text hostText;
            tenantLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        }
    @Override
import org.eclipse.swt.layout.GridData;
        super.loadSettings();

        }
        createDriverPanel(addrGroup);
		}
            portText.setText(site.getDriver().getDefaultPort());
        {
        GridLayout gl = new GridLayout(1, false);
            );
        addrGroup.setLayoutData(gd);
		} else if (site.getDriver().getDefaultPort() != null) {
            Label hostLabel = UIUtils.createControlLabel(hostGroup,
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
    @Override
    protected String getDefaultAuthModelId(DBPDataSourceContainer dataSource) {
    private Text tenantText;
 * Unless required by applicable law or agreed to in writing, software
		}
    private Text databaseText;
        if (hostText != null) {
            gd.grabExcessHorizontalSpace = true;
    public void createControl(Composite composite) {
    }
            Composite hostGroup = UIUtils.createTitledComposite(
 * See the License for the specific language governing permissions and

                OceanbaseMessages.oceanbase_connection_page_label_connection,
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    @Override
 * DBeaver - Universal Database Manager

    @Override
        }
                    OceanbaseMessages.oceanbase_connection_page_label_database);
 * OceanbaseConnectionPage

            portText = new Text(hostGroup, SWT.BORDER);
            portText.setText("");
