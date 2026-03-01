    }
            if(instanceValue.isEmpty()) {
 * Unless required by applicable law or agreed to in writing, software
    @Override


        databaseText.addModifyListener(e -> site.updateButtons());
 * Copyright (C) 2010-2026 DBeaver Corp and others
 */
    private void instanceUpdated() {

        createAuthPanel(settingsGroup, 1);
        return null;
            databaseText.setEditable(false);
 * you may not use this file except in compliance with the License.
        instanceText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
    }

    
    @Override
        toggleControlVisibility(databaseLabel, visible);
                portText.setText("39015");
            databaseText.setText(databaseValue);

import org.jkiss.utils.CommonUtils;
            return;
        }
            }
        UIUtils.dispose(logoImage);
        for (Entry<String, String> entry : connectionInfo.getProperties().entrySet()) {
        if (CommonUtils.isEmpty(hostText.getText())) {
                connectionInfo.removeProperty(name);
 *  when edition==GENERIC, don't show/touch any driver properties for
            if (edition != HANAEdition.GENERIC) {
    }
        connectionInfo.setProviderProperty(PROV_PROP_EDITION, edition.name());
            editionCombo.select(editionCombo.indexOf(HANAEdition.CLOUD.getTitle()));
    private String databaseValue;

import org.eclipse.swt.SWT;
        String host = hostText.getText().trim();
            hostText.setText(host.substring(0, host.length() - HANAConstants.HTTPS_PORT_SUFFIX.length()));
import org.eclipse.swt.layout.GridData;

        logoImage = createImage("icons/sap_hana_logo.png"); //$NON-NLS-1$
    public void dispose() {
                if(port >= 30000 && port <= 39999)
        hostText.addModifyListener(e -> { hostUpdated(); site.updateButtons(); });
        editionCombo.addSelectionListener(new SelectionAdapter() {
        } else {
            }
    @Override
        }
    }
        instanceLabel = UIUtils.createControlLabel(addrGroup, HANAMessages.label_instance);
        portText.setEditable(edition == HANAEdition.GENERIC || edition == HANAEdition.EXPRESS);
            else
        UIUtils.fixReadonlyTextBackground(portText);
    @Override
        databaseText = new Text(addrGroup, SWT.BORDER);
 * You may obtain a copy of the License at
        if (layoutData instanceof GridData) {
    private boolean created;
    }
            return;
            if (databaseText.getEditable() && CommonUtils.isEmpty(databaseText.getText().trim()))
    @Override
    public void createControl(Composite composite) {
            portText.setText(portValue);
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        }
            break;
    }
 *

        for (HANAEdition edition : HANAEdition.values()) {
        
/*
    @Override
        }
        super.dispose();
            instanceText.setEditable(false);
            if(entry.getKey().equalsIgnoreCase(name)) {
        control.setVisible(visible);
        connectionInfo.setProperty(name, value);

    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            if(entry.getKey().equalsIgnoreCase(name)) {
        toggleControlVisibility(instanceText, visible);
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
        if (CommonUtils.isEmpty(instanceText.getText())) {
        }
            break;
        portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
    
        edition = HANAEdition.fromTitle(editionCombo.getText());
        }

        instanceText = new Text(addrGroup, SWT.BORDER);
    private void setProperty(DBPConnectionConfiguration connectionInfo, String name, String value) {
import org.jkiss.dbeaver.ui.IDialogPageProvider;
        if (created) {
        } else if (edition == HANAEdition.EXPRESS) {
    public HANAConnectionPage() {
        created = true;
public class HANAConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
    private void hostUpdated() {
    }
            portText.setText(portValue);
        portValue = CommonUtils.toString(connectionInfo.getHostPort()/*, site.getDriver().getDefaultPort()*/);
        if (databaseText.getEditable()) {
        for (Entry<String, String> entry : connectionInfo.getProperties().entrySet()) {
        hostText = UIUtils.createLabelText(addrGroup, HANAMessages.label_host, "");
                instanceValue = instanceText.getText().trim();
        if (edition == HANAEdition.GENERIC && CommonUtils.isEmpty(portText.getText()) && host.endsWith(HANAConstants.HTTPS_PORT_SUFFIX)) {
            connectionInfo.setHostPort(portText.getText().trim());
                    removeProperty(connectionInfo, PROP_DATABASE_NAME);
    @Override
            instanceText.setEditable(true);
        }
                portText.setText(portValue);
            portValue = portText.getText().trim();

                    instanceText.setText(String.valueOf((port-30000)/100));
        }
                break;
    /*
            }
        }
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
                return entry.getValue();
    }
                    connectionInfo.setProviderProperty(PROV_PROP_INSTANCE_NUMBER, instanceValue);
        for (Entry<String, String> entry : connectionInfo.getProperties().entrySet()) {
import java.util.Map.Entry;
        toggleControlVisibility(instanceLabel, visible);
        settingsGroup.setLayout(new GridLayout(1, false));
            ((GridData) layoutData).exclude = !visible;
    }
        instanceText.setToolTipText(HANAMessages.tooltip_instance);
        }
        portText = UIUtils.createLabelText(addrGroup, HANAMessages.label_port, "");
            editionCombo.select(edition.ordinal());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Text hostText;
    public boolean isComplete() {
        case CLOUD:
    private void toggleControlVisibility(Control control, boolean visible) {
    // saved custom value while Text is read-only
import org.eclipse.swt.graphics.Image;
            break;
                break;
import java.util.Locale;

        }
        instanceValue = CommonUtils.notEmpty(connectionInfo.getProviderProperty(PROV_PROP_INSTANCE_NUMBER));
            databaseValue = databaseText.getText().trim();
     */

 *  so we do not have to add checkboxes here.
    final static String PROV_PROP_INSTANCE_NUMBER = "instanceNumber";

 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            editionCombo.add(edition.getTitle());
        Object layoutData = control.getLayoutData();
                instanceText.setText(instanceValue);
 *  - full control over all driver properties
            return false;
        }
        if (CommonUtils.isEmpty(portText.getText().trim()))
        databaseText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        

    private String instanceValue;
        case PLATFORM_TENANT_DB:
                if (databaseValue.isEmpty()) {
            databaseText.setEditable(true);
        default:
 */
            } else {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        
            if (instanceText.getEditable() && !CommonUtils.isEmpty(instanceText.getText())) {
        portText.addModifyListener(e -> site.updateButtons());
        Composite settingsGroup = new Composite(composite, SWT.NONE);
    private Label databaseLabel;
import org.eclipse.swt.events.SelectionAdapter;
        case EXPRESS:
        boolean visible = edition != HANAEdition.GENERIC && edition != HANAEdition.CLOUD;
        }
            portText.setText("443");
        instanceText.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
     * HANA driver properties are case insensitive. Reuse and cleanup properties set previously w/o HANA specific connection page
        ((Composite)getControl()).layout(true, true);
        case PLATFORM_SINGLE_DB:
import org.jkiss.dbeaver.ext.hana.model.HANAConstants;
            case PLATFORM_TENANT_DB:
                return false;
        super.loadSettings();

        databaseValue = CommonUtils.notEmpty(getProperty(connectionInfo, PROP_DATABASE_NAME));
import org.eclipse.jface.dialogs.IDialogPage;
    private void editionUpdated() {
            break;
        // save old values
    }
            editionUpdated();
    private String portValue; 
    
                portText.setText(String.format("3%02d13", instance));
        }

            if(portValue.isEmpty())
        if (instanceText.getEditable()) {
        if (edition == HANAEdition.PLATFORM_TENANT_DB) {
        toggleControlVisibility(databaseText, visible);
    public void saveSettings(DBPDataSourceContainer dataSource) {
                    setProperty(connectionInfo, PROP_DATABASE_NAME, databaseValue);
        if (portText.getEditable()) {
 *
        }
import org.jkiss.dbeaver.ext.hana.ui.internal.HANAMessages;
        ((GridData)portText.getLayoutData()).widthHint = UIUtils.getFontHeight(portText) * 5;
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
 *
    private HANAEdition edition;
            hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
                if (instanceValue.isEmpty()) {
        switch (edition) {
            }

        case GENERIC:
            databaseText.setText("");
    private String getProperty(DBPConnectionConfiguration connectionInfo, String name) {
        portText.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    }
            default:
            }
                if(instance < 0 || instance > 99) return false;
                int instance = CommonUtils.toInt(instanceText.getText().trim(), -1);
import org.eclipse.swt.layout.GridLayout;
    public Image getImage() {
        if (created) {
        });
                } else {
        UIUtils.fixReadonlyTextBackground(instanceText);

            @Override public void widgetSelected(SelectionEvent e) { editionUpdated(); site.updateButtons(); }
                portText.setText(String.format("3%02d15", instance));

            return false;
    }
            case PLATFORM_SYSTEM_DB:

        settingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                break;

 *  https://help.sap.com/viewer/79ae9d3916b84356a89744c65793b924/2.6/en-US/22485d2937c4427fbbedefe3cc158571.html
 *  
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        super.saveSettings(dataSource);
    
    private Text instanceText;
    }
    private Combo editionCombo;
            }
        }
        return logoImage;
        edition = HANAEdition.fromName(connectionInfo.getProviderProperty(PROV_PROP_EDITION));
 *  since JDBC 2.6 client the 'encrypt' property is automatically set for connections to port 443 (e.g. HANA Cloud) 
                databaseValue = databaseText.getText().trim();
/*
    final static String PROP_DATABASE_NAME = "databaseName";
import org.jkiss.dbeaver.ext.hana.ui.internal.HANAEdition;
        setControl(settingsGroup);

            instanceValue = instanceText.getText().trim();
        createDriverPanel(settingsGroup);
        instanceText.addModifyListener(e -> { instanceUpdated(); site.updateButtons(); });

                }
            editionUpdated();
package org.jkiss.dbeaver.ext.hana.ui.views;
import org.eclipse.swt.widgets.*;
    private Text databaseText;
        Composite addrGroup = UIUtils.createTitledComposite(settingsGroup, HANAMessages.label_connection, 2, GridData.FILL_HORIZONTAL);
            instanceText.setEditable(false);
        }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
import org.eclipse.swt.events.SelectionEvent;
            instanceUpdated();
        case PLATFORM_SYSTEM_DB:
    private final Image logoImage;
    public void loadSettings() {
        if (edition == HANAEdition.PLATFORM_SINGLE_DB || edition == HANAEdition.PLATFORM_SYSTEM_DB || edition == HANAEdition.PLATFORM_TENANT_DB) {

            databaseText.setText(databaseValue);
                int port = CommonUtils.toInt(portValue);
    }
        return new IDialogPage[] { new DriverPropertiesDialogPage(this) };
        int instance = CommonUtils.toInt(instanceText.getText().trim(), 0);
            case PLATFORM_SINGLE_DB:
    private void removeProperty(DBPConnectionConfiguration connectionInfo, String name) {
 *  - compatibility with previous configuration
        UIUtils.fixReadonlyTextBackground(databaseText);
            instanceText.setText(instanceValue);

        switch (edition) {
        if (edition != HANAEdition.GENERIC) {
            break;
                }
        editionCombo = new Combo(addrGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
                } else {
            connectionInfo.setHostName(hostText.getText().trim());
import org.jkiss.dbeaver.ui.UIUtils;
            if(entry.getKey().equalsIgnoreCase(name) && !entry.getKey().equals(name)) {
    final static String PROV_PROP_EDITION = "edition";
        databaseLabel = UIUtils.createControlLabel(addrGroup, HANAMessages.label_database);
 * limitations under the License.
    private Label instanceLabel;
            instanceText.setText("");
        UIUtils.createControlLabel(addrGroup, HANAMessages.label_edition);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  
        } else {
        ((GridData) instanceText.getLayoutData()).widthHint = UIUtils.getFontHeight(instanceText) * 5;
                connectionInfo.removeProperty(name);
    private Text portText;
            instanceText.setText("90");

        return super.isComplete();
                    connectionInfo.removeProviderProperty(PROV_PROP_INSTANCE_NUMBER);
        if (CommonUtils.isEmpty(hostText.getText().trim()))
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
