            UIUtils.asyncExec(() -> {
 * DBeaver - Universal Database Manager
/**
    {
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;

            case CUSTOM:

                return OCIUtils.readTnsNames(defaultOraHomePath, false).keySet();
        @Override
                connectionInfo.setProviderProperty(OracleConstants.PROP_TNS_PATH, tnsPathText.getText().trim());
import org.eclipse.swt.SWT;
            String tnsPathProperty = connectionInfo.getProviderProperty(OracleConstants.PROP_TNS_PATH);
    }
 * Unless required by applicable law or agreed to in writing, software

//            return false;
        final String sidService = connectionInfo.getProviderProperty(OracleConstants.PROP_SID_SERVICE);
            @Override
        UIUtils.setDefaultTextControlWidthHint(hostText);
        gd.horizontalSpan = 2;
        connectionInfo.setProviderProperty(OracleConstants.PROP_SID_SERVICE, OracleConnectionType.getTypeForTitle(sidServiceCombo.getText()).name());

            if (tnsFile.exists()) {
                connectionInfo.setConfigurationType(DBPDriverConfigurationType.MANUAL);
        connectionInfo.setProviderProperty(OracleConstants.PROP_CONNECTION_TYPE, connectionType.name());

        UIUtils.createControlLabel(addrGroup, OracleUIMessages.dialog_connection_connection_type_group);
            portText.setText(CommonUtils.notEmpty(site.getDriver().getDefaultPort()));
        if (activated) {
    private ControlsListener controlModifyListener;
        gd.widthHint = UIUtils.getFontHeight(bottomControls) * 30;
//        }
    }
                break;
                connectionInfo.setHostName(hostText.getText().trim());
        };
        super.loadSettings();
        sidServiceCombo.select(1);

        }

    }
        UIUtils.createControlLabel(targetContainer, "Network Alias");
        Composite targetContainer = new Composite(protocolFolder, SWT.NONE);
import org.eclipse.swt.widgets.Text;
        Label ph = new Label(bottomControls, SWT.NONE);
        createDriverPanel(addrGroup);
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;

                break;

        } else {
        targetContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

 * you may not use this file except in compliance with the License.
        CTabItem protocolTabCustom = new CTabItem(protocolFolder, SWT.NONE);
        hostText = new Text(targetContainer, SWT.BORDER);

 *
        public void modifyText(ModifyEvent e) {
            for (String alias : serviceNames) {
        }
        portText = new Text(targetContainer, SWT.BORDER);
            }
        if (DBWorkbench.hasFeature(DBConnectionConstants.PRODUCT_FEATURE_ADVANCED_DATABASE_ADMINISTRATION)) {
        oraHomeSelector.getPanel().setLayoutData(gd);
        targetContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            hostText.setText(CommonUtils.notEmpty(connectionInfo.getHostName()));
import org.jkiss.dbeaver.ui.IDialogPageProvider;
        connectionUrlText.setLayoutData(gd);
        controlModifyListener = new ControlsListener();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBConstants;
            sidServiceCombo.setText(OracleConnectionType.valueOf(sidService).getTitle());
        addrGroup.setLayout(new GridLayout(1, false));
    @Override
    @Override
        oraHomeSelector = new ClientHomesSelector(bottomControls, OracleUIMessages.dialog_connection_ora_home) {
import org.jkiss.dbeaver.ui.controls.TextWithOpenFolder;

import java.util.Collections;
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate)
            oraHomeSelector.populateHomes(site.getDriver(), connectionInfo.getClientHomeId(), site.isNew());
    private Combo sidServiceCombo;
        connectionTypeFolder = new CTabFolder(addrGroup, SWT.TOP | SWT.MULTI);
            portText.setText(connectionInfo.getHostPort());
        GridData gd = new GridData(GridData.FILL_BOTH);




            } else {
                for (String alias : getAvailableServiceNames()) {
        gd.horizontalSpan = 3;
                updateUI();
        sidServiceCombo.addModifyListener(controlModifyListener);
    private Combo serviceNameCombo;
        public void widgetDefaultSelected(SelectionEvent e) {
        if (site.isNew() && CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
        connectionUrlText.setText(CommonUtils.notEmpty(connectionInfo.getUrl()));
        gd = new GridData(GridData.FILL_HORIZONTAL);
        }
import org.jkiss.dbeaver.ext.oracle.oci.OracleHomeDescriptor;
 *
import java.util.Locale;
            case BASIC:

                connectionInfo.setConfigurationType(DBPDriverConfigurationType.URL);
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
        serviceNameCombo.addModifyListener(controlModifyListener);
        if (site.isNew() && CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
        protocolTabCustom.setText(OracleUIMessages.dialog_connection_custom_tab);
        }


        public void widgetSelected(SelectionEvent e) {
		createTNSConnectionControls(connectionTypeFolder);
                connectionInfo.setConfigurationType(DBPDriverConfigurationType.MANUAL);
    private void updateUI()
        createAuthPanel(addrGroup, 1);
 */
        if (connectionType == OracleConstants.ConnectionType.TNS) {
        connectionUrlText = new Text(targetContainer, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
        @Override
}
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
        connectionTypeFolder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        protocolTabTNS.setText(OracleUIMessages.dialog_connection_tns_tab);

            createClientHomeGroup(bottomControls);
        UIUtils.createControlLabel(targetContainer, OracleUIMessages.dialog_connection_port);
        sidServiceCombo = new Combo(targetContainer, SWT.DROP_DOWN | SWT.READ_ONLY);
        }

        } else {
        bottomControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageWithAuth;
                connectionInfo.setHostName(hostText.getText().trim());
            if (tnsNameCombo.getSelectionIndex() < 0) {
    private TextWithOpenFolder tnsPathText;
        }
        if (serviceNameCombo.getItemCount() == 0) {
        createCustomConnectionControls(connectionTypeFolder);
        };
        tnsNameCombo.addModifyListener(controlModifyListener);
    public void saveSettings(DBPDataSourceContainer dataSource)

        }

        }

    {
                }

            populateTnsNameCombo();
        protocolTabCustom.setControl(targetContainer);
            default -> false;
            }
        String oldText = tnsNameCombo.getText();


            connectionInfo.setClientHomeId(oraHomeSelector.getSelectedHome());
    }
            case TNS -> !CommonUtils.isEmpty(tnsNameCombo.getText());
            public void widgetSelected(SelectionEvent e)
        tnsPathText.getTextControl().addModifyListener(e -> {

            if (defaultOraHomePath != null) {
public class OracleConnectionPage extends ConnectionPageWithAuth implements IDialogPageProvider {
 */
            tnsNameCombo.setEnabled(false);
    }
        tnsNameCombo = new Combo(targetContainer, SWT.DROP_DOWN);
        return new IDialogPage[] {
            case BASIC -> !CommonUtils.isEmpty(serviceNameCombo.getText());
        CTabItem protocolTabBasic = new CTabItem(protocolFolder, SWT.NONE);
                return OCIUtils.readTnsNames(new File(oraHome), true).keySet();

 * OracleConnectionPage
        gd.widthHint = UIUtils.getFontHeight(connectionUrlText) * 30;
        });
    private void createTNSConnectionControls(CTabFolder protocolFolder)
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        CTabItem protocolTabTNS = new CTabItem(protocolFolder, SWT.NONE);

            updateUI();
        if (!super.isComplete()) {
        final Label urlLabel = UIUtils.createControlLabel(targetContainer, "JDBC URL Template"); //$NON-NLS-1$
        sidServiceCombo.add(OracleConnectionType.SID.getTitle());
//        if (isOCI && CommonUtils.isEmpty(oraHomeSelector.getSelectedHome())) {
        tnsPathText.setToolTipText("Path to TNSNAMES.ora file");
        connectionTypeFolder.addSelectionListener(new SelectionAdapter()
    public boolean isComplete()
        Composite bottomControls = UIUtils.createPlaceholder(addrGroup, 3);
        }
            updateUI();
        if (conTypeProperty != null) {
                    serviceNameCombo.add(alias);
        {
            if (!oldText.isEmpty()) {
import org.eclipse.swt.custom.CTabItem;
                site.getActiveDataSource().getConnectionConfiguration().setProviderProperty(OracleConstants.PROP_CONNECTION_TYPE, connectionType.name());
        protocolTabBasic.setData(OracleConstants.ConnectionType.BASIC);
            tnsNameCombo.setEnabled(true);
        Collection<String> serviceNames = getAvailableServiceNames();
        protocolTabBasic.setControl(targetContainer);

                return OCIUtils.readTnsNames(tnsFile, false).keySet();

        portText.addModifyListener(controlModifyListener);
        connectionUrlText.addModifyListener(controlModifyListener);
        Composite targetContainer = new Composite(protocolFolder, SWT.NONE);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.registry.DBConnectionConstants;
    private void createClientHomeGroup(Composite bottomControls)
        logoImage = createImage("icons/oracle_logo.png"); //$NON-NLS-1
        gd = new GridData(GridData.FILL_HORIZONTAL);
            updateUI();
    }
                UIUtils.setComboSelection(tnsNameCombo, networkAlias);
        protocolTabCustom.setData(OracleConstants.ConnectionType.CUSTOM);
import org.eclipse.swt.events.*;
        switch (connectionType) {
    {
        }
        if (sidService != null) {

    protected boolean isCustomURL()
        UIUtils.setDefaultTextControlWidthHint(serviceNameCombo);
import org.eclipse.swt.layout.GridData;
import java.util.Collection;
    private void populateTnsNameCombo() {
    @Override
            if (tnsPathProperty != null) {
import org.eclipse.jface.dialogs.IDialogPage;
    }
            OracleHomeDescriptor home = OCIUtils.getOraHomeByName(oraHome);
        // FIXME: left for backward compatibility. Replaced by auth model. Remove in future.
        targetContainer.setLayout(new GridLayout(5, false));
                connectionInfo.setUrl(connectionUrlText.getText().trim());
        if (CommonUtils.isEmpty(oraHome)) {
            });

        activated = true;
    {
        boolean aliasAmongServiceNames = Stream.of(serviceNames).anyMatch(sn -> sn.equals(networkAlias));
    }
        } else {
            new DriverPropertiesDialogPage(this),
    }
            return OracleAuthOS.ID;
    private class ControlsListener implements ModifyListener, SelectionListener {
        serviceNameCombo.setLayoutData(gd);
        connectionTypeFolder.setSelection(connectionType.ordinal());
        UIUtils.setDefaultTextControlWidthHint(portText);

    private Collection<String> getAvailableServiceNames()
            site.updateButtons();
            return OCIUtils.readTnsNames(null, true).keySet();
import org.eclipse.swt.graphics.Image;
    @Override
        return OracleAuthModelDatabaseNative.ID;
import org.jkiss.utils.CommonUtils;

                UIUtils.setComboSelection(tnsNameCombo, oldText);
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionType;
        }
    }
            serviceNameCombo.setText(CommonUtils.notEmpty(site.getDriver().getDefaultDatabase()));
    public void createControl(Composite composite)
        }
        DBPConnectionConfiguration connectionInfo = dataSource.getConnectionConfiguration();
        Composite targetContainer = new Composite(protocolFolder, SWT.NONE);
        }
            }
    }
            return Collections.emptyList();
    private Text hostText;
        }
    {
                connectionInfo.setHostPort(portText.getText().trim());
        UIUtils.createControlLabel(targetContainer, "TNS names path");
    public OracleConnectionPage() {

        portText.setLayoutData(gd);
        UIUtils.createControlLabel(targetContainer, OracleUIMessages.dialog_connection_database);
                connectionType = (OracleConstants.ConnectionType) connectionTypeFolder.getSelection().getData();
import org.jkiss.dbeaver.ext.oracle.model.auth.OracleAuthModelDatabaseNative;
            hostText.setText(DBConstants.HOST_LOCALHOST);

        if (!CommonUtils.isEmpty(tnsPath)) {
                connectionInfo.setDatabaseName(tnsNameCombo.getText().trim());
        sidServiceCombo.add(OracleConnectionType.SERVICE.getTitle());
    private boolean activated = false;
    }

import org.eclipse.swt.custom.CTabFolder;
import org.jkiss.dbeaver.ui.dialogs.connection.DriverPropertiesDialogPage;
        targetContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
        });
        serviceNameCombo = new Combo(targetContainer, SWT.DROP_DOWN);
        if (CommonUtils.toBoolean(dataSource.getConnectionConfiguration().getProviderProperty(OracleConstants.OS_AUTH_PROP))) {
            updateUI();

        String conTypeProperty = connectionInfo.getProviderProperty(OracleConstants.PROP_CONNECTION_TYPE);

        gd.heightHint = UIUtils.getFontHeight(connectionUrlText) * 3;
            }
                tnsNameCombo.select(0);
        super.saveSettings(dataSource);
            } else if (aliasAmongServiceNames) {

            case CUSTOM -> !CommonUtils.isEmpty(connectionUrlText.getText());
        portText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        // check if network alias is one of available services
    private Combo tnsNameCombo;
	private CTabFolder connectionTypeFolder;
        }

    private void createCustomConnectionControls(CTabFolder protocolFolder)
            }
    @Override
    }
            }
        return logoImage;
            }

        UIUtils.dispose(logoImage);

                break;
    protected String getDefaultAuthModelId(DBPDataSourceContainer dataSource) {
    }
                return home.getOraServiceNames();
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
        gd.widthHint = UIUtils.getFontHeight(portText) * 5;
        createBasicConnectionControls(connectionTypeFolder);
/*
 *
import org.jkiss.dbeaver.ext.oracle.model.auth.OracleAuthOS;
        if (serviceNames.isEmpty()) {
        connectionTypeFolder.setSelection(connectionType.ordinal());

            new OracleConnectionExtraPage(),
        super.dispose();


    private Text connectionUrlText;

            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
        urlLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));

    {
    private final Image logoImage;
import java.io.File;
        }
        tnsNameCombo.removeAll();
        setControl(addrGroup);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        tnsNameCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

import org.eclipse.swt.layout.GridLayout;
            protected void handleHomeChange()
    }
                connectionInfo.setDatabaseName(serviceNameCombo.getText().trim());
        if (oraHomeSelector != null) {
 * limitations under the License.
            case TNS:
            if (home != null) {
            return false;
        addrGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        } else {
    @Override
        hostText.addModifyListener(controlModifyListener);
    public void loadSettings() {
        if (oraHomeSelector != null) {
            connectionType = OracleConstants.ConnectionType.BASIC;
import org.eclipse.swt.widgets.Combo;
        targetContainer.setLayout(new GridLayout(2, false));
    }
            serviceNameCombo.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));
            // check default oraHome before checking tnsAdmin
            File defaultOraHomePath = OCIUtils.getDefaultOraHomePath();
        ph.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private OracleConstants.ConnectionType connectionType = OracleConstants.ConnectionType.BASIC;
    {
        } else {
        if (tnsNameCombo.getItemCount() == 0) {
        String networkAlias = site.getActiveDataSource().getConnectionConfiguration().getDatabaseName();
        String oraHome = oraHomeSelector == null ? null : oraHomeSelector.getSelectedHome();
        }
                connectionInfo.setHostPort(portText.getText().trim());
            File tnsFile = new File(tnsPath);
    @Override
                populateTnsNameCombo();
 * You may obtain a copy of the License at
        tnsPathText = new TextWithOpenFolder(targetContainer, "Oracle TNS names path");
        protocolTabBasic.setText(OracleUIMessages.dialog_connection_basic_tab);
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {

    {
        Composite addrGroup = new Composite(composite, SWT.NONE);
        hostText.setLayoutData(gd);

        protocolTabTNS.setData(OracleConstants.ConnectionType.TNS);
        gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);

import org.eclipse.swt.widgets.Composite;
        protocolTabTNS.setControl(targetContainer);
        };
    @Override
import org.jkiss.dbeaver.ui.dialogs.connection.ClientHomesSelector;
    private void createBasicConnectionControls(CTabFolder protocolFolder)
    {
        targetContainer.setLayout(new GridLayout(2, false));
            {
    public void dispose()
                tnsPathText.setText(tnsPathProperty);
    {
        }
        tnsPathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
        @Override

            connectionType = OracleConstants.ConnectionType.valueOf(CommonUtils.toString(conTypeProperty));
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import java.util.stream.Stream;
import org.jkiss.dbeaver.ui.UIUtils;
        Label hostLabel = UIUtils.createControlLabel(targetContainer, OracleUIMessages.dialog_connection_host);
    private ClientHomesSelector oraHomeSelector;
        return switch (connectionType) {
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
                connectionInfo.setDatabaseName(serviceNameCombo.getText().trim());
    private Text portText;
import org.jkiss.dbeaver.ext.oracle.oci.OCIUtils;
import org.eclipse.swt.widgets.Label;
    public Image getImage() {
    @Override
package org.jkiss.dbeaver.ext.oracle.ui.views;
        }
            @Override
    {
            UIUtils.asyncExec(this::populateTnsNameCombo);
            tnsNameCombo.setText(CommonUtils.notEmpty(connectionInfo.getDatabaseName()));

        // Load values from new connection info
        hostLabel.setLayoutData(gd);
                tnsNameCombo.add(alias);
import org.jkiss.code.NotNull;
        return this.connectionType == OracleConstants.ConnectionType.CUSTOM;
        }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

            }
        } else {
            {
        String tnsPath = tnsPathText.getText();
