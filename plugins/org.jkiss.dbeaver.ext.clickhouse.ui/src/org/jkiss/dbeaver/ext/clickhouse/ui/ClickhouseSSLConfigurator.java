
 *     http://www.apache.org/licenses/LICENSE-2.0
        createSSLConfigHint(parent, true, 0);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseConstants;
import org.jkiss.dbeaver.ext.clickhouse.ui.internal.ClickhouseMessages;


        STRICT,
        sslModeCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

import org.jkiss.code.Nullable;
        if (sslModeCombo != null) {
    enum SSLModes {
        String mode = configuration.getStringProperty(ClickhouseConstants.SSL_MODE_CONF);
    }
    }
        sslModeCombo = UIUtils.createLabelCombo(sslComposite,
    private Combo sslModeCombo;
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration) {
        if (mode != null && sslModeCombo != null) {
        );
        sslComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        return true;
import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
            if (!CommonUtils.isEmpty(sslModeCombo.getText())) {

import org.eclipse.swt.widgets.Combo;
        sslModeCombo.add(SSLModes.STRICT.name()); //$NON-NLS-1$


 * You may obtain a copy of the License at
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
    @Override
        if (this.getEditIntention() == DBPConnectionEditIntention.CREDENTIALS_ONLY) {
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
            SWT.READ_ONLY
package org.jkiss.dbeaver.ext.clickhouse.ui;
    }
 * limitations under the License.
    }
public class ClickhouseSSLConfigurator extends SSLConfiguratorTrustStoreUI {
                configuration.setProperty(ClickhouseConstants.SSL_MODE_CONF, sslModeCombo.getText());
}
        super.loadSettings(configuration);
    @Override
        sslModeCombo.select(0);
        return true;
            GridData.FILL_HORIZONTAL);
            1,
 * Unless required by applicable law or agreed to in writing, software
    }
            ClickhouseMessages.dialog_connection_page_advanced_settings,
import org.jkiss.dbeaver.ui.UIUtils;
 * DBeaver - Universal Database Manager
            sslModeCombo.setEnabled(false);

            ClickhouseMessages.dialog_connection_page_text_ssl_mode_tip,
        createTrustStoreConfigGroup(parent);
            ClickhouseMessages.dialog_connection_page_text_ssl_mode,
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
        return false;
    @Override
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.saveSettings(configuration);
        }
        sslModeCombo.add(SSLModes.NONE.name()); //$NON-NLS-1$

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    }
import org.jkiss.utils.CommonUtils;
    public void loadSettings(@NotNull DBWHandlerConfiguration configuration) {
import org.jkiss.dbeaver.ui.dialogs.net.SSLConfiguratorTrustStoreUI;
        Composite sslComposite = UIUtils.createPlaceholder(advancedSettingsGroup, 2);
 *
    @Override

    protected boolean isKeystoreSupported() {
    protected boolean useCACertificate() {
        }
import org.eclipse.swt.SWT;
            sslModeCombo.select(SSLModes.valueOf(mode).ordinal());
 *

    protected boolean isCertificatesSupported() {
        Composite advancedSettingsGroup = UIUtils.createTitledComposite(parent,
        NONE
        }
import org.jkiss.dbeaver.Log;
import org.eclipse.swt.layout.GridData;
 *
    @Override
 * you may not use this file except in compliance with the License.
    private static final Log log = Log.getLog(ClickhouseSSLConfigurator.class);
import org.eclipse.swt.widgets.Composite;
/*
    @Nullable
