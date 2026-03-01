import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
import org.jkiss.dbeaver.ui.dialogs.net.SSLConfiguratorTrustStoreUI;

    private Combo sslFactoryCombo;
            if (ENABLE_PROXY) {
        }
                            protected IStatus run(IProgressMonitor monitor) {
    public void saveSettings(@NotNull DBWHandlerConfiguration configuration) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    private boolean sslClassesResolved;
                            @Override
                                        sslFactoryCombo.add(cn);
                                UIUtils.syncExec(() -> {
import org.jkiss.code.NotNull;
                        resolveJob.schedule();
 * Unless required by applicable law or agreed to in writing, software


import org.eclipse.swt.events.PaintListener;
/*
import org.eclipse.core.runtime.jobs.Job;
        super.loadSettings(configuration);
                        sslClassesResolved = true;
                    advGroup,
            Composite advGroup = UIUtils.createTitledComposite(
    @Override
    protected boolean useCACertificate() {
        GridData gd = new GridData(GridData.FILL_BOTH);
            sslModeCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                                final DriverClassFindJob finder = new DriverClassFindJob(

import org.eclipse.core.runtime.IStatus;
    public void loadSettings(@NotNull final DBWHandlerConfiguration configuration) {
                                });
        composite.setLayoutData(gd);
                                    for (String cn : finder.getDriverClassNames()) {
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
        if (this.getEditIntention() != DBPConnectionEditIntention.CREDENTIALS_ONLY) {
                public void paintControl(PaintEvent e) {
import org.eclipse.swt.layout.GridLayout;
            sslModeCombo = UIUtils.createLabelCombo(advGroup, PostgreMessages.dialog_connection_network_postgres_ssl_advanced_ssl_mode, SWT.READ_ONLY | SWT.DROP_DOWN);
            }
                                        false);
 * Copyright (C) 2010-2026 DBeaver Corp and others

            }
public class PostgreSSLConfigurator extends SSLConfiguratorTrustStoreUI {
        gd.minimumHeight = 200;
            configuration.setProperty(PostgreConstants.PROP_SSL_MODE, sslModeCombo.getText());

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
    }
 */
import org.eclipse.swt.events.PaintEvent;
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    @Override
 * PostgreSSLConfigurator

import org.jkiss.dbeaver.registry.driver.DriverClassFindJob;
                composite,

import org.eclipse.swt.widgets.Composite;
    private Combo sslModeCombo;
                sslModeCombo.add(mode);
            clientCertPath.setText(CommonUtils.notEmpty(configuration.getStringProperty(PostgreConstants.PROP_SSL_CLIENT_CERT)));
    }
                        final Job resolveJob = new Job("Find factories") {
                                    final String factoryValue = configuration.getStringProperty(PostgreConstants.PROP_SSL_FACTORY);
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
            caCertPath.setText(CommonUtils.notEmpty(configuration.getStringProperty(PostgreConstants.PROP_SSL_ROOT_CERT)));
    @Override

            );
            sslFactoryCombo.addPaintListener(paintListener);
                                        configuration.getDriver(),
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (this.getEditIntention() != DBPConnectionEditIntention.CREDENTIALS_ONLY) {
            UIUtils.setComboSelection(sslModeCombo, CommonUtils.notEmpty(configuration.getStringProperty(PostgreConstants.PROP_SSL_MODE)));
    @Override
import org.eclipse.core.runtime.IProgressMonitor;
                useProxyService = UIUtils.createCheckbox(
        }
                                    }
                                finder.run(new DefaultProgressMonitor(monitor));
import org.eclipse.swt.layout.GridData;
            }

                        sslFactoryCombo.removePaintListener(this);
                    PostgreMessages.dialog_connection_network_postgres_ssl_advanced_use_proxy_tip,

        createSSLConfigHint(composite, true, 1);
        createTrustStoreConfigGroup(composite);
            }
        }
 *
}
                                    if (!CommonUtils.isEmpty(factoryValue)) {
 * limitations under the License.
import org.eclipse.swt.widgets.Button;
            sslFactoryCombo = UIUtils.createLabelCombo(advGroup, PostgreMessages.dialog_connection_network_postgres_ssl_advanced_ssl_factory, SWT.DROP_DOWN);
    public static final String[] SSL_MODES = {"","disable","allow","prefer","require","verify-ca","verify-full"};

 */

    private Button useProxyService;
            configuration.setProperty(PostgreConstants.PROP_SSL_FACTORY, sslFactoryCombo.getText());
                            }
                                        SSLSocketFactory.class.getName(),
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
import org.eclipse.core.runtime.Status;
        return true;
            PaintListener paintListener = new PaintListener() {
        composite.setLayout(new GridLayout(1, false));
        final Composite composite = new Composite(parent, SWT.NONE);
        if (CommonUtils.isEmpty(configuration.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD))) {
            for (String mode : SSL_MODES) {
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
    }
                                setUser(true);
                                        sslFactoryCombo.setText(factoryValue);
            if (ENABLE_PROXY) {

                                    }
                PostgreMessages.dialog_connection_network_postgres_ssl_advanced,
    private static final boolean ENABLE_PROXY = false;
        if (this.getEditIntention() != DBPConnectionEditIntention.CREDENTIALS_ONLY) {
                @Override
                    if (!sslClassesResolved) {
                            }
import javax.net.ssl.SSLSocketFactory;
                    PostgreMessages.dialog_connection_network_postgres_ssl_advanced_use_proxy,

                GridData.FILL_HORIZONTAL
        super.saveSettings(configuration);
                                    sslFactoryCombo.removeAll();
import org.eclipse.swt.widgets.Combo;
            // Backward compatibility
                                return Status.OK_STATUS;
import org.jkiss.dbeaver.ui.UIUtils;
 *
        }
                    false, 2);
                        };
                useProxyService.setSelection(configuration.getBooleanProperty(PostgreConstants.PROP_SSL_PROXY));
/**
 * See the License for the specific language governing permissions and
    }
                configuration.setProperty(PostgreConstants.PROP_SSL_PROXY, useProxyService.getSelection());
            clientKeyPath.setText(CommonUtils.notEmpty(configuration.getStringProperty(PostgreConstants.PROP_SSL_CLIENT_KEY)));
 * You may obtain a copy of the License at
            if (ENABLE_PROXY) {
                2,
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.ext.postgresql.ui;
            };
                            {
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
