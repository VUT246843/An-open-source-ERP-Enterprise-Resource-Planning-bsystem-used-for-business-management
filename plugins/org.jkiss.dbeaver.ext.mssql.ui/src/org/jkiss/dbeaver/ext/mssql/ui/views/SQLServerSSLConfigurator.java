}
        gd.minimumHeight = 200;
            keystoreHostname = new Text(sslKeyStoreComposite, SWT.BORDER);
import org.jkiss.dbeaver.ui.dialogs.net.SSLConfiguratorTrustStoreUI;
        }*/


    @Override
        super.loadSettings(configuration);
 * you may not use this file except in compliance with the License.


import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

    private Text keystoreHostname;
    public void loadSettings(@NotNull DBWHandlerConfiguration configuration) {
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
 * You may obtain a copy of the License at
            trustServerCertificate = UIUtils.createCheckbox(settingsGroup, SQLServerUIMessages.dialog_setting_trust_server_certificate, SQLServerUIMessages.dialog_setting_trust_server_certificate_tip, true, 2);

    protected boolean isCertificatesSupported() {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected boolean isKeystoreSupported() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
        }
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
import org.eclipse.swt.layout.GridLayout;
        composite.setLayout(new GridLayout(1, false));
package org.jkiss.dbeaver.ext.mssql.ui.views;
public class SQLServerSSLConfigurator extends SSLConfiguratorTrustStoreUI {

            // Backward compatibility
 *
import org.eclipse.swt.layout.GridData;
        createTrustStoreConfigGroup(composite);

        configuration.setProperty(SQLServerConstants.PROP_SSL_KEYSTORE_HOSTNAME, keystoreHostname.getText().trim());
        keystoreHostname.setText(CommonUtils.notEmpty(configuration.getStringProperty(SQLServerConstants.PROP_SSL_KEYSTORE_HOSTNAME)));
import org.jkiss.dbeaver.ui.UIUtils;
        composite.setLayoutData(gd);
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
        {
        return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager


        /*{
        }
 *
            keystoreHostname.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        super.saveSettings(configuration);

 * Copyright (C) 2010-2026 DBeaver Corp and others
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
            keyStorePath.setText(CommonUtils.notEmpty(configuration.getStringProperty(SQLServerConstants.PROP_SSL_KEYSTORE)));
        final Composite composite = new Composite(parent, SWT.NONE);
            keystoreHostname.setToolTipText(SQLServerUIMessages.dialog_setting_ssl_advanced_hostname_tip);
        createSSLConfigHint(composite, true, 1);
    @Override
    }
import org.jkiss.dbeaver.ext.mssql.ui.SQLServerUIMessages;
 *
    }
 * Unless required by applicable law or agreed to in writing, software
    }
 */
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
        if (CommonUtils.isEmpty(configuration.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD))) {

        return true;
/*
    @Override
            Composite settingsGroup = UIUtils.createTitledComposite(composite, "Settings", 1, GridData.FILL_HORIZONTAL, SWT.DEFAULT);
    }
            UIUtils.createControlLabel(sslKeyStoreComposite, SQLServerUIMessages.dialog_setting_ssl_advanced_hostname_label);
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.eclipse.swt.widgets.Composite;
            keyStorePassword.setText(CommonUtils.notEmpty(configuration.getStringProperty(SQLServerConstants.PROP_SSL_KEYSTORE_PASSWORD)));
