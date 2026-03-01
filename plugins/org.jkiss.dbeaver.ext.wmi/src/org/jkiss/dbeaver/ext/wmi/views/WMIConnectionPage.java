    private Text hostText;
            domainText = new Text(hostGroup, SWT.BORDER);
    private void evaluateURL()
            hostLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
    }
        if (hostText != null) {
            !CommonUtils.isEmpty(hostText.getText()) &&
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        site.updateButtons();

            Label hostLabel = UIUtils.createControlLabel(hostGroup, WMIMessages.wmi_connection_page_label_host);
    @Override
        if (namespaceCombo != null) {
            Label namespaceLabel = UIUtils.createControlLabel(hostGroup, WMIMessages.wmi_connection_page_label_namespace);
 * WMIConnectionPage
    public void loadSettings()
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.SWT;

            namespaceCombo.setLayoutData(gd);

 * Unless required by applicable law or agreed to in writing, software
            !CommonUtils.isEmpty(namespaceCombo.getText());
            namespaceLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
}
        //Composite group = new Composite(composite, SWT.NONE);
            domainText.setText(CommonUtils.notEmpty(connectionInfo.getServerName()));
            gd.grabExcessHorizontalSpace = true;
 * you may not use this file except in compliance with the License.
            hostText.setLayoutData(gd);
import org.eclipse.swt.layout.GridLayout;
        GridLayout gl = new GridLayout(1, false);
import org.eclipse.swt.widgets.Composite;
    public void saveSettings(DBPDataSourceContainer dataSource)
        createDriverPanel(addrGroup);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            connectionInfo.setHostName(hostText.getText().trim());
/**
    public boolean isComplete()
 */
            namespaceCombo.addModifyListener(textListener);
        if (domainText != null) {
import org.eclipse.swt.widgets.Combo;
            connectionInfo.setDatabaseName(DEFAULT_NAMESPACE);
        }
            Composite hostGroup = UIUtils.createTitledComposite(addrGroup, "Server", 4, GridData.FILL_HORIZONTAL);
        }
    @Override
        // Load values from new connection info
    }
    @Override
        {
        super.loadSettings();
        //group.setLayout(new GridLayout(1, true));

            gd.grabExcessHorizontalSpace = true;
        createAuthPanel(addrGroup, 1);
    }
            gd = new GridData(GridData.FILL_HORIZONTAL);
            namespaceCombo.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));
 *
    {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        super.saveSettings(dataSource);
    }
 * See the License for the specific language governing permissions and
    {

            Label domainLabel = UIUtils.createControlLabel(hostGroup, WMIMessages.wmi_connection_page_label_domain);

        GridData gd = new GridData(GridData.FILL_BOTH);

        if (hostText != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    {
        super.dispose();
    public void createControl(Composite composite)
            hostText.addModifyListener(textListener);

        if (domainText != null) {
        }

            namespaceCombo = new Combo(hostGroup, SWT.BORDER);

import org.eclipse.swt.layout.GridData;
        setControl(addrGroup);
        }
        }
    private Text domainText;
        DBPDataSourceContainer activeDataSource = site.getActiveDataSource();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        setImageDescriptor(logoImage);
import org.eclipse.swt.widgets.Text;


    private static final String DEFAULT_HOST = "localhost"; //$NON-NLS-1$
    @Override
 *
import org.jkiss.dbeaver.ext.wmi.WMIMessages;
            gd = new GridData(GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.ui.UIUtils;
    public WMIConnectionPage()

    public void dispose()
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
    {
    private static final String DEFAULT_NAMESPACE = "root/cimv2"; //$NON-NLS-1$
            hostText != null && namespaceCombo != null &&
        addrGroup.setLayoutData(gd);

        DBPConnectionConfiguration connectionInfo = activeDataSource.getConnectionConfiguration();

    private Combo localeCombo;
        if (connectionInfo.getDatabaseName() == null) {
            domainText.addModifyListener(textListener);
import org.eclipse.jface.resource.ImageDescriptor;
    }
            hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
            domainLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

 * DBeaver - Universal Database Manager
 * limitations under the License.
import org.eclipse.swt.widgets.Label;
        if (connectionInfo.getHostName() == null) {
 *
    private static ImageDescriptor logoImage = Activator.getImageDescriptor("icons/wmi_icon_big.png"); //$NON-NLS-1$
        return super.isComplete() &&
    }

{

            gd.horizontalSpan = 3;
            gd.grabExcessHorizontalSpace = true;
        }
            connectionInfo.setDatabaseName(namespaceCombo.getText().trim());
import org.jkiss.dbeaver.ext.wmi.Activator;
        }
            gd = new GridData(GridData.FILL_HORIZONTAL);
    {
        if (namespaceCombo != null) {
    }

        addrGroup.setLayout(gl);
    {

public class WMIConnectionPage extends ConnectionPageWithAuth
        ModifyListener textListener = e -> evaluateURL();
            hostText = new Text(hostGroup, SWT.BORDER);
package org.jkiss.dbeaver.ext.wmi.views;
        }

import org.jkiss.utils.CommonUtils;
            connectionInfo.setHostName(DEFAULT_HOST);
    @Override
 */
            domainText.setLayoutData(gd);
            connectionInfo.setServerName(domainText.getText().trim());
    private Combo namespaceCombo;

        }

 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
        Composite addrGroup = new Composite(composite, SWT.NONE);
