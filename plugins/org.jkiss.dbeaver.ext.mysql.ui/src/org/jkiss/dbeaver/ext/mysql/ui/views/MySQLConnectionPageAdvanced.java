            }
    }
    public void saveSettings(DBPDataSourceContainer dataSource) {
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (MANAGE_SERVER_TIME_ZONE) {
        if (serverTimezoneCombo != null) {

            gd = new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING);
        saveConnectionURL(connectionCfg);
                connectionInfo.setProviderProperty(MySQLConstants.PROP_SERVER_TIMEZONE, serverTimeZone);
 *
            if (CommonUtils.isEmpty(tzProp)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        // Load values from new connection info
import org.jkiss.dbeaver.registry.DBConnectionConstants;
/*
        GridLayout gl = new GridLayout(1, false);


public class MySQLConnectionPageAdvanced extends ConnectionPageAbstract {
            }
            {

 * MySQLPageAdvanced
    public MySQLConnectionPageAdvanced() {
        }
    }
            cfgGroup,
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();

    // as now we use server timestamp format by default
    }
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;

    private ClientHomesSelector homesSelector;
            homesSelector.populateHomes(site.getDriver(), connectionInfo.getClientHomeId(), site.isNew());
            serverTimezoneCombo.add(MySQLUIMessages.dialog_connection_auto_detect);
        Composite advancedGroup = UIUtils.createTitledComposite(

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        Composite cfgGroup = new Composite(parent, SWT.NONE);
                    serverTimezoneCombo.add(tzID);
    }
    public void dispose() {
 * DBeaver - Universal Database Manager

 * limitations under the License.
 * You may obtain a copy of the License at
                }
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
import org.jkiss.dbeaver.ui.dialogs.connection.ClientHomesSelector;
            String serverTimeZone = serverTimezoneCombo.getText();
                for (String tzID : tzList) {
        super.dispose();
        if (homesSelector != null) {
    }

import org.jkiss.dbeaver.ui.UIUtils;
            }
        boolean supportsClients = CommonUtils.getBoolean(getSite().getDriver().getDriverParameter(MySQLConstants.DRIVER_PARAM_CLIENTS), true);
        DBPConnectionConfiguration connectionCfg = dataSource.getConnectionConfiguration();
        setTitle("Advanced");
            } else {
}
            serverTimezoneCombo = UIUtils.createLabelCombo(advancedGroup, MySQLUIMessages.dialog_connection_server_timezone, SWT.DROP_DOWN);
        if (DBWorkbench.hasFeature(DBConnectionConstants.PRODUCT_FEATURE_ADVANCED_DATABASE_ADMINISTRATION) && supportsClients) {

/**

 */

        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();

import org.eclipse.swt.layout.GridData;
        cfgGroup.setLayout(gl);
        setDescription("MySQL advanced connection setting");
        cfgGroup.setLayoutData(gd);

import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;

        if (serverTimezoneCombo != null) {

 * you may not use this file except in compliance with the License.
    @Override
        }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Combo;

        setControl(cfgGroup);
            homesSelector.getPanel().setLayoutData(gd);
            GridData.HORIZONTAL_ALIGN_BEGINNING);
    public void createControl(Composite parent) {
            if (CommonUtils.isEmpty(serverTimeZone) || serverTimeZone.equals(MySQLUIMessages.dialog_connection_auto_detect)) {

                serverTimezoneCombo.setText(tzProp);
        }
    @Override
            } else {
    public void loadSettings() {
    private static final boolean MANAGE_SERVER_TIME_ZONE = true;

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                String[] tzList = TimeZone.getAvailableIDs();

 *
package org.jkiss.dbeaver.ext.mysql.ui.views;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            2,
        }
        loadSettings();
            String tzProp = connectionInfo.getProviderProperty(MySQLConstants.PROP_SERVER_TIMEZONE);
        return true;
    public boolean isComplete() {
            MySQLUIMessages.dialog_connection_group_advanced,
import org.eclipse.swt.widgets.Composite;
 */
                    //TimeZone timeZone = TimeZone.getTimeZone(tzID);

                serverTimezoneCombo.select(0);
            serverTimezoneCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            homesSelector = new ClientHomesSelector(advancedGroup, MySQLUIMessages.dialog_connection_local_client, false);
 *
import java.util.TimeZone;
    @Override
                connectionInfo.removeProviderProperty(MySQLConstants.PROP_SERVER_TIMEZONE);
    private Combo serverTimezoneCombo;
        if (homesSelector != null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.swt.SWT;
    @Override
    // disable Server time zone manage - it confuses users and makes very little sense
            connectionInfo.setClientHomeId(homesSelector.getSelectedHome());
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.utils.CommonUtils;
