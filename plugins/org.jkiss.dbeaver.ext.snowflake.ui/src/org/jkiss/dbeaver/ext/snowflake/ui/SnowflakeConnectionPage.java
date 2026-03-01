            combo.setText(oldText);
            }
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
            gd.grabExcessHorizontalSpace = true;
    public void loadSettings()

            }
        }

    }
import org.eclipse.jface.dialogs.IDialogPage;
    }
            gd = new GridData(GridData.FILL_HORIZONTAL);
            new DriverPropertiesDialogPage(this)
            if (CommonUtils.isEmpty(databaseName)) {
    }
    private static void loadDictList(DBCSession session, Combo combo, String query) throws DBException {
            UIUtils.createControlLabel(addrGroup, SnowflakeMessages.label_database);

    private static final Log log = Log.getLog(SnowflakeConnectionPage.class);
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate)
        }
                result.add(0, ""); //$NON-NLS-1$
            dbText = new Combo(addrGroup, SWT.BORDER | SWT.DROP_DOWN);
            UIUtils.createInfoLabel(ph, ""); //$NON-NLS-1$

        try {
                SnowflakeMessages.label_connection,
            UIUtils.createControlLabel(addrGroup, SnowflakeMessages.label_schema);
            UIUtils.setDefaultTextControlWidthHint(dbText);
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new IDialogPage[] {
    @Override
        return SnowflakeAuthModelSnowflake.ID;
                4,
            gd.grabExcessHorizontalSpace = true;

import org.jkiss.dbeaver.Log;
    {
        }
            !CommonUtils.isEmpty(hostText.getText());
    {
            }
                    site.testConnection();

            );
import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;
            });
            }
            gd.horizontalSpan = 3;
            gd.grabExcessHorizontalSpace = true;
    @Override
            combo.setItems(result.toArray(new String[0]));
 * DBeaver - Universal Database Manager
 *
    protected String getDefaultAuthModelId(DBPDataSourceContainer dataSource) {
            UIUtils.createControlLabel(addrGroup, SnowflakeMessages.label_host);
    @Override
            schemaText.addModifyListener(textListener);
        List<String> result = new ArrayList<>();
                result.add(0, oldText);
 */
import java.util.Locale;
                portText.setText(site.getDriver().getDefaultPort());

                GridData.FILL_HORIZONTAL
    public void saveSettings(DBPDataSourceContainer dataSource)
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        createDriverPanel(control);
import org.eclipse.swt.layout.GridData;
    @Override
    private Combo warehouseText;
            UIUtils.createControlLabel(addrGroup, SnowflakeMessages.label_warehouse);
                public void widgetSelected(SelectionEvent e) {
    }
        session.getProgressMonitor().subTask("Exec " + query); //$NON-NLS-1$

        Composite control = new Composite(composite, SWT.NONE);
            loadDictList(session, dbText, "SHOW DATABASES"); //$NON-NLS-1$
            hostText = new Text(addrGroup, SWT.BORDER);
    {
 * See the License for the specific language governing permissions and
        if (warehouseText != null) {
    public void testConnection(DBCSession session) {
import org.eclipse.swt.SWT;
        // Load values from new connection info
            new SnowflakeConnectionPageAdvanced(),
 * you may not use this file except in compliance with the License.
            if (!result.contains(oldText)) {
/**
            try (DBCResultSet dbResult = dbStat.openResultSet()) {
import org.jkiss.dbeaver.ui.UIUtils;
 */
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.DBException;
                }
        if (portText != null) {
            testLink.setLayoutData(gd);
            warehouseText.setLayoutData(gd);
        if (hostText != null) {
    {
        control.setLayout(new GridLayout(1, false));
    }
            gd.horizontalSpan = 3;
import java.util.ArrayList;
 *
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
import org.eclipse.swt.layout.GridLayout;
    private static final ImageDescriptor logoImage = SnowflakeUIActivator.getImageDescriptor("icons/snowflake_logo.png"); //$NON-NLS-1$
            portText = new Text(addrGroup, SWT.BORDER);
            gd = new GridData(GridData.FILL_HORIZONTAL);
        }
        setImageDescriptor(logoImage);
    public void dispose()


        if (hostText != null) {
        super.loadSettings();
        }
import java.util.List;
                portText.setText(String.valueOf(connectionInfo.getHostPort()));
        if (dbText != null) {
            testLink.setText(SnowflakeMessages.label_click_on_test_connection);
import org.eclipse.swt.events.SelectionEvent;
        control.setLayoutData(new GridData(GridData.FILL_BOTH));
    public void createControl(Composite composite)



 * SnowflakeConnectionPage
            String oldText = combo.getText();

            testLink.addSelectionListener(new SelectionAdapter() {
            gd = new GridData(GridData.FILL_HORIZONTAL);
        }
                @Override
import org.jkiss.dbeaver.ext.snowflake.model.auth.SnowflakeAuthModelSnowflake;
    @Override
    private Text hostText;
        }


            connectionInfo.setServerName(warehouseText.getText().trim());
                while (dbResult.nextRow()) {
            schemaText.setLayoutData(gd);
import org.jkiss.dbeaver.ext.snowflake.ui.internal.SnowflakeMessages;
        }
}
            Composite addrGroup = UIUtils.createTitledComposite(
    }
        } catch (Exception e) {
                }

            dbText.addModifyListener(textListener);
    @Override
    public boolean isComplete()
/*

        }
            hostText.addModifyListener(textListener);
            warehouseText = new Combo(addrGroup, SWT.BORDER | SWT.DROP_DOWN);
 *
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
            connectionInfo.setDatabaseName(dbText.getText().trim());
    @NotNull
        createAuthPanel(control, 1);
            connectionInfo.setHostPort(portText.getText().trim());
            gd = new GridData(GridData.FILL_HORIZONTAL);
            schemaText = new Combo(addrGroup, SWT.BORDER);
            warehouseText.addModifyListener(textListener);
            dbText.setLayoutData(gd);
    }
            dbText.setText(databaseName);
            UIUtils.createControlLabel(addrGroup, SnowflakeMessages.label_port);
        }

import org.eclipse.swt.widgets.Text;

            }
            Composite ph = UIUtils.createPlaceholder(control, 2);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (dbText != null) {
    private Combo dbText;
            loadDictList(session, warehouseText, "SHOW WAREHOUSES"); //$NON-NLS-1$
                portText.setText(""); //$NON-NLS-1$
        super.dispose();
import org.jkiss.dbeaver.model.exec.DBCStatement;
        {
import org.jkiss.code.NotNull;

 * Copyright (C) 2010-2026 DBeaver Corp and others
    {
        if (schemaText != null) {
 * You may obtain a copy of the License at
            Link testLink = new Link(ph, SWT.NONE);
            gd.grabExcessHorizontalSpace = true;
            connectionInfo.setHostName(hostText.getText().trim());
            UIUtils.setDefaultTextControlWidthHint(warehouseText);
            log.error(e);
            if (CommonUtils.isEmpty(connectionInfo.getHostName())) {
            schemaText.setText(CommonUtils.notEmpty(connectionInfo.getProviderProperty(SnowflakeConstants.PROP_SCHEMA)));
                    result.add(CommonUtils.toString(dbResult.getAttributeValue("name"))); //$NON-NLS-1$

        }
        }

        });
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ext.snowflake.ui.internal.SnowflakeUIActivator;
            } else if (site.getDriver().getDefaultPort() != null) {

            portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
            UIUtils.setDefaultTextControlWidthHint(schemaText);
        setControl(control);
import org.jkiss.dbeaver.model.exec.DBCResultSet;
package org.jkiss.dbeaver.ext.snowflake.ui;
{
            warehouseText.setText(CommonUtils.notEmpty(connectionInfo.getServerName()));
 *     http://www.apache.org/licenses/LICENSE-2.0
            UIUtils.setDefaultTextControlWidthHint(hostText);

import org.eclipse.swt.events.ModifyListener;
    @Override
        {
            dbStat.executeStatement();
                hostText.setText(connectionInfo.getHostName());
import org.eclipse.swt.widgets.Combo;


            if (!result.contains("")) { //$NON-NLS-1$
import org.jkiss.dbeaver.ui.IDialogPageProvider;
public class SnowflakeConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider, IDataSourceConnectionTester
            portText.setLayoutData(gd);
import org.eclipse.jface.resource.ImageDescriptor;
            gd.widthHint = UIUtils.getFontHeight(portText) * 7;

        if (portText != null) {
        }

        }
import org.eclipse.swt.events.SelectionAdapter;
        if (schemaText != null) {
import org.eclipse.swt.widgets.Link;
 * Unless required by applicable law or agreed to in writing, software
            addrGroup.setLayoutData(gd);
            String databaseName = connectionInfo.getDatabaseName();
            loadDictList(session, schemaText, "SHOW SCHEMAS"); //$NON-NLS-1$
                hostText.setText(SnowflakeConstants.DEFAULT_HOST_PREFIX);
        };
        try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, query, false, false, false)) {

        return hostText != null &&
    @Override
                databaseName = SnowflakeConstants.DEFAULT_DB_NAME;
    }
        if (warehouseText != null) {
import org.jkiss.dbeaver.model.exec.DBCStatementType;
            }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            connectionInfo.setProviderProperty(SnowflakeConstants.PROP_SCHEMA, schemaText.getText().trim());
            } else {
        UIUtils.asyncExec(() -> {
            gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
import org.jkiss.dbeaver.ui.IDataSourceConnectionTester;
            portText.addModifyListener(textListener);
    }

    private Text portText;
        super.saveSettings(dataSource);
    private Combo schemaText;
            hostText.setLayoutData(gd);
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
            //loadDictList(session, roleText, "SHOW ROLES"); //$NON-NLS-1$
            gd.grabExcessHorizontalSpace = true;
            gd.horizontalSpan = 3;
            } else {
            GridData gd = new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING);
        ModifyListener textListener = e -> site.updateButtons();
                control,
