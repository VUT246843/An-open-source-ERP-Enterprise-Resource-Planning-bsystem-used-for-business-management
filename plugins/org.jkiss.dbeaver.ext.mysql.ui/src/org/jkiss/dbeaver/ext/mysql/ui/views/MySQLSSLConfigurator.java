}
import org.eclipse.swt.widgets.Button;
                2,
    public void loadSettings(@NotNull DBWHandlerConfiguration configuration) {

        composite.setLayoutData(gd);
        super.loadSettings(configuration);
        composite.setLayout(new GridLayout(1, false));
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
    protected boolean useCACertificate() {
        GridData gd = new GridData(GridData.FILL_BOTH);
/**
 * Unless required by applicable law or agreed to in writing, software

 * Licensed under the Apache License, Version 2.0 (the "License");
            clientCertPath.setText(CommonUtils.notEmpty(configuration.getStringProperty(MySQLConstants.PROP_SSL_CLIENT_CERT)));
    }

        final Composite composite = new Composite(parent, SWT.NONE);
        configuration.setProperty(MySQLConstants.PROP_REQUIRE_SSL, String.valueOf(requireSSQL.getSelection()));
    @Override
        allowPublicKeyRetrieval.setSelection(configuration.getBooleanProperty(MySQLConstants.PROP_SSL_PUBLIC_KEY_RETRIEVE, false));
import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
        {
package org.jkiss.dbeaver.ext.mysql.ui.views;
            requireSSQL = UIUtils.createLabelCheckbox(advGroup, MySQLUIMessages.mysql_ssl_configurator_checkbox_require_ssl, MySQLUIMessages.mysql_ssl_configurator_checkbox_require_ssl_tip, false);
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.utils.CommonUtils;
    private Button requireSSQL;
                GridData.FILL_HORIZONTAL
            veryServerCert.setEnabled(false);
    @Override
        gd.minimumHeight = 200;
 */

import org.eclipse.swt.SWT;
        }

            Composite advGroup = UIUtils.createTitledComposite(
import org.eclipse.swt.widgets.Composite;
            clientKeyPath.setText(CommonUtils.notEmpty(configuration.getStringProperty(MySQLConstants.PROP_SSL_CLIENT_KEY)));
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
import org.jkiss.dbeaver.ui.dialogs.net.SSLConfiguratorTrustStoreUI;
        createTrustStoreConfigGroup(composite);
public class MySQLSSLConfigurator extends SSLConfiguratorTrustStoreUI {
                composite,
            );
 */
    private Button allowPublicKeyRetrieval;
                MySQLUIMessages.mysql_ssl_configurator_legend_advanced,
            cipherSuitesText.setToolTipText(MySQLUIMessages.mysql_ssl_configurator_label_cipher_suites_tip);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        if (CommonUtils.isEmpty(configuration.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD))) {
 *
 * you may not use this file except in compliance with the License.
        return true;
        requireSSQL.setSelection(configuration.getBooleanProperty(MySQLConstants.PROP_REQUIRE_SSL, false));
            veryServerCert = UIUtils.createLabelCheckbox(advGroup, MySQLUIMessages.mysql_ssl_configurator_checkbox_verify_server_certificate, MySQLUIMessages.mysql_ssl_configurator_checkbox_verify_server_certificate_tip, true);
 * limitations under the License.
import org.eclipse.swt.widgets.Text;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        configuration.setProperty(MySQLConstants.PROP_VERIFY_SERVER_SERT, String.valueOf(veryServerCert.getSelection()));
/*
            cipherSuitesText = UIUtils.createLabelText(sslCertComposite, MySQLUIMessages.mysql_ssl_configurator_label_cipher_suites, ""); //$NON-NLS-2$

    }
import org.eclipse.swt.layout.GridLayout;
        createSSLConfigHint(composite, true, 1);
 *
            cipherSuitesText.setEditable(false);
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (this.getEditIntention() == DBPConnectionEditIntention.CREDENTIALS_ONLY) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        }

        configuration.setProperty(MySQLConstants.PROP_SSL_PUBLIC_KEY_RETRIEVE, String.valueOf(allowPublicKeyRetrieval.getSelection()));
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
 *
    private Text cipherSuitesText;
 * You may obtain a copy of the License at
        super.saveSettings(configuration);
    }
        configuration.setProperty(MySQLConstants.PROP_SSL_CIPHER_SUITES, cipherSuitesText.getText());

        }
    @Override
        cipherSuitesText.setText(CommonUtils.notEmpty(configuration.getStringProperty(MySQLConstants.PROP_SSL_CIPHER_SUITES)));
            allowPublicKeyRetrieval.setEnabled(false);
            requireSSQL.setEnabled(false);

            caCertPath.setText(CommonUtils.notEmpty(configuration.getStringProperty(MySQLConstants.PROP_SSL_CA_CERT)));
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
            // Backward compatibility

    }
            allowPublicKeyRetrieval = UIUtils.createLabelCheckbox(advGroup, MySQLUIMessages.mysql_ssl_configurator_checkbox_allow_public_key, MySQLUIMessages.mysql_ssl_configurator_checkbox_allow_public_key_tip, false);
        {
        veryServerCert.setSelection(configuration.getBooleanProperty(MySQLConstants.PROP_VERIFY_SERVER_SERT, true));

    private Button veryServerCert;


        }
 * MySQLSSLConfigurator
