
                sslKeyStoreComposite,
import org.eclipse.swt.events.SelectionEvent;
        configuration.setProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD, method.name());
                SSLConfigurationMethod.KEYSTORE,
                new String[]{"*.jks;*.pfx", "*.*"},
    protected boolean isCertificatesSupported() {

            setCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT, clientCertPath.getText().trim());

        }
            clientKeyPath = new ConfigurationFileSelector(

        }
        if (isCertificatesSupported()) {
            keyStorePath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if (isCertificatesSupported() && isKeystoreSupported()) {
    private void showControl(Control control, boolean flag) {
                UIUtils.createControlLabel(sslCertComposite, UIConnectionMessages.dialog_setting_ssl_configurator_certs_ca_name);
                setCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT, caCertPath.getText().trim());

            clientKeyPath.setText(getCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY));
        final SSLConfigurationMethod method;
import org.eclipse.swt.layout.GridLayout;
            UIUtils.createControlLabel(sslMethodComposite, UIConnectionMessages.dialog_setting_ssl_configurator_method);
                SSLConfigurationMethod.class,
            setCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY, clientKeyPath.getText().trim());
    @Override

import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
            }
                    UIConnectionMessages.dialog_setting_ssl_configurator_certs_ca_title,
                new String[]{"*.*", "*.key", "*"}

            configuration.setProperty(basePropName, propValue);
                sslMethodComposite,
                SSLConfigurationMethod.CERTIFICATES);
                sslCertComposite,
                configuration.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD),

        } else if (this.getEditIntention() == DBPConnectionEditIntention.CREDENTIALS_ONLY) {
            UIUtils.createControlLabel(sslCertComposite, UIConnectionMessages.dialog_setting_ssl_configurator_certs_client_name);
        sslCertComposite.getParent().getParent().layout(true, true);
        }
 * CasSSLConfigurator
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.widgets.Control;
    private void setCertProperty(DBWHandlerConfiguration configuration, String basePropName, String propValue) {
            );
    private void showMethodControls(SSLConfigurationMethod configurationMethod) {
            return CommonUtils.notEmpty(configuration.getStringProperty(basePropName));
 *
        }

            keyStorePassword.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                UIConnectionMessages.dialog_setting_ssl_configurator_certs_client_key_title,
        }
        return true;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private Button keyStoreRadioButton;
        Composite sslParameters = UIUtils.createTitledComposite(
            configuration.setSavePassword(true);
 * distributed under the License is distributed on an "AS IS" BASIS,
                ? SSLConfigurationMethod.CERTIFICATES
 * Licensed under the Apache License, Version 2.0 (the "License");
            );
    }
                    configuration.getPassword()));
    protected Composite createTrustStoreConfigGroup(Composite composite) {
            } else {
    }
}
                    showMethodControls((SSLConfigurationMethod) e.widget.getData());
            keyStorePath.setText(getCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE));
        composite.setLayoutData(gd);
    @Override
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        createTrustStoreConfigGroup(composite);
    }
    }
 * See the License for the specific language governing permissions and
                methodSwitcher
        gd.minimumHeight = 200;
                sslCertComposite,
                sslMethodComposite,
            configuration.setSecureProperty(basePropName + SSLHandlerTrustStoreImpl.CERT_VALUE_SUFFIX, propValue);
/*
        final boolean keyStoreSupported = isKeystoreSupported();
            sslCertComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    protected Composite sslCertComposite;
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
                caCertPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 *
        } else {
            );
                public void widgetSelected(SelectionEvent e) {
    protected Text keyStorePassword;
            clientKeyPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            };
        return sslParameters;
            if (!CommonUtils.isEmptyTrimmed(password)) {
 * you may not use this file except in compliance with the License.
    @Override
            UIConnectionMessages.dialog_setting_ssl_configurator_legend_parameters,
 * Unless required by applicable law or agreed to in writing, software
            sslKeyStoreComposite = UIUtils.createComposite(sslParameters, 2);
        if (DBWorkbench.isDistributed()) {
    protected TextWithOpen keyStorePath;
        } else {
            }

/**
    }
            if (useCACertificate()) {

            }
        );

                    configuration.setPassword(password);
                } else {
                @Override
        if (isKeystoreSupported()) {
            clientCertPath = new ConfigurationFileSelector(
            keyStoreRadioButton = UIUtils.createRadioButton(
                );
        {
            keyStorePath = new ConfigurationFileSelector(
        GridData gd = new GridData(GridData.FILL_BOTH);
                }
        if (isCertificatesSupported()) {
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
            sslCertComposite = UIUtils.createComposite(sslParameters, 2);
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration) {
        final Composite composite = new Composite(parent, SWT.NONE);
        assert certificatesSupported || keyStoreSupported;

import org.jkiss.code.NotNull;
    protected SSLConfigurationMethod method;

                    new String[]{"*.*", "*.crt", "*"}
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
        }
        if (certificatesSupported && keyStoreSupported) {
            method = CommonUtils.valueOf(

    public void loadSettings(@NotNull DBWHandlerConfiguration configuration) {
 * You may obtain a copy of the License at

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;


 * limitations under the License.
    protected TextWithOpen clientCertPath;
                UIConnectionMessages.dialog_setting_ssl_configurator_method_certs,
            final String password = keyStorePassword.getText().trim();
        } else {
                new String[]{"*.*", "*.crt", "*"}
        return false;

            1,
    private String getCertProperty(DBWHandlerConfiguration configuration, String basePropName) {

                }
        {
    }
        }
 * DBeaver - Universal Database Manager
                if (DBWorkbench.isDistributed()) {
            );
        if (isKeystoreSupported()) {

            Composite sslMethodComposite = UIUtils.createComposite(sslParameters, 3);
            if (method == SSLConfigurationMethod.CERTIFICATES) {
            certRadioButton = UIUtils.createRadioButton(
                : SSLConfigurationMethod.KEYSTORE;
        if (DBWorkbench.isDistributed()) {
        composite.setLayout(new GridLayout(1, false));
        }
            sslKeyStoreComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            return CommonUtils.notEmpty(configuration.getSecureProperty(basePropName + SSLHandlerTrustStoreImpl.CERT_VALUE_SUFFIX));
 */
                UIConnectionMessages.dialog_setting_ssl_configurator_method_keystore,
                SSLConfigurationMethod.CERTIFICATES,
import org.eclipse.swt.widgets.Button;
        showMethodControls(method);


                certRadioButton.setSelection(true);
    protected TextWithOpen caCertPath;
            final SelectionAdapter methodSwitcher = new SelectionAdapter() {
            UIUtils.createControlLabel(sslKeyStoreComposite, UIConnectionMessages.dialog_setting_ssl_configurator_keystore_name);
import org.jkiss.dbeaver.ui.controls.ConfigurationFileSelector;

            method = isCertificatesSupported()
import org.eclipse.swt.events.SelectionAdapter;
    }
            clientCertPath.setText(getCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT));
                UIConnectionMessages.dialog_setting_ssl_configurator_certs_client_title,
import org.jkiss.dbeaver.model.impl.net.SSLConfigurationMethod;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
            if (caCertPath != null) {
        }

public class SSLConfiguratorTrustStoreUI extends SSLConfiguratorAbstractUI {
 */
                caCertPath.setText(getCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT));
            );
    }
import org.jkiss.dbeaver.ui.controls.TextWithOpen;
            keyStorePassword = new Text(sslKeyStoreComposite, SWT.BORDER | SWT.PASSWORD);
                UIConnectionMessages.dialog_setting_ssl_configurator_keystore_title,
                keyStoreRadioButton.setSelection(true);
import org.eclipse.swt.SWT;
                caCertPath = new ConfigurationFileSelector(
                    sslCertComposite,
    protected Composite sslKeyStoreComposite;
        showControl(sslCertComposite, !keystore);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            GridData.FILL_HORIZONTAL
 *
                configuration.setSavePassword(true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected boolean isKeystoreSupported() {
            UIUtils.createControlLabel(sslCertComposite, UIConnectionMessages.dialog_setting_ssl_configurator_certs_client_key_name);

            keyStorePassword.setText(CommonUtils.notEmpty(

    protected boolean useCACertificate() {
import org.jkiss.dbeaver.ui.UIUtils;
package org.jkiss.dbeaver.ui.dialogs.net;
        return false;
    protected TextWithOpen clientKeyPath;
            clientCertPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        UIUtils.setControlVisible(control, flag);


        }
            if (caCertPath != null) {
                methodSwitcher
                    configuration.getSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE_PASSWORD) :
        showControl(sslKeyStoreComposite, keystore);
    }

            setCertProperty(configuration, SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE, keyStorePath.getText().trim());
                DBWorkbench.isDistributed() ?
            }

        method = configurationMethod;
        boolean keystore = configurationMethod == SSLConfigurationMethod.KEYSTORE;
            composite,
            UIUtils.createControlLabel(sslKeyStoreComposite, UIConnectionMessages.dialog_setting_ssl_configurator_keystore_password_name);

    private Button certRadioButton;


    }
        final boolean certificatesSupported = isCertificatesSupported();
import org.eclipse.swt.layout.GridData;

                    configuration.setSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_KEYSTORE_PASSWORD, password);
                true
