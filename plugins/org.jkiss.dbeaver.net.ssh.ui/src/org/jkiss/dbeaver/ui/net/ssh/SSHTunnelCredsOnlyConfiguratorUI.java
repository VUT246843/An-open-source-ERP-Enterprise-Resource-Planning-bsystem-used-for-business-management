        }
    }
        for (SSHTunnelDefaultConfiguratorUI.ConfigurationWrapper cfg : configurations) {
            DBWorkbench.getPlatformUI().showError("SSH configuration", "Unable to load SSH configuration due to an error", e);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.net.ssh.SSHUtils;
        this.credPanels = new ArrayList<>();
    }
 * limitations under the License.
        );
        this.propertyChangeListener = propertyChangeListener;
            .allMatch(Objects::isNull);
    @Override
    private List<SSHTunnelDefaultConfiguratorUI.CredentialsPanel> credPanels;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.layout.GridData;
 */
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            handlerConfiguration,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                DBPConnectionEditIntention.CREDENTIALS_ONLY
        } catch (DBException e) {
 * you may not use this file except in compliance with the License.
                this.propertyChangeListener,
package org.jkiss.dbeaver.ui.net.ssh;
            );
 *
    public void saveSettings(@NotNull DBWHandlerConfiguration handlerConfiguration) {
        List<SSHTunnelDefaultConfiguratorUI.ConfigurationWrapper> configurations;
        return this.credPanels.stream().map(SSHTunnelDefaultConfiguratorUI.CredentialsPanel::saveSettings)

import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
 * See the License for the specific language governing permissions and
    private Composite credPanelsContainer;
        this.credPanelsContainer = UIUtils.createTitledComposite(parent, "SSH tunnel credentials", 1, GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.DBException;
                .map(SSHTunnelDefaultConfiguratorUI.ConfigurationWrapper::new).toList();
            this.credPanels.add(credsPanel);
    public boolean isComplete() {
 *
import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;

import org.jkiss.code.NotNull;
    }

        Arrays.stream(this.credPanelsContainer.getChildren()).forEach(Widget::dispose);
 * DBeaver - Universal Database Manager
import java.util.ArrayList;
import java.util.List;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

    @Override
                this.credPanelsContainer,
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

import java.util.Objects;
            this.credPanels.stream().map(SSHTunnelDefaultConfiguratorUI.CredentialsPanel::saveSettings).toArray(SSHHostConfiguration[]::new)
            credsPanel.loadSettings(cfg, false);
 * Licensed under the Apache License, Version 2.0 (the "License");

    public void resetSettings(@NotNull DBWHandlerConfiguration handlerConfiguration) {
    public void loadSettings(@NotNull DBWHandlerConfiguration handlerConfiguration) {
import java.util.Arrays;
    }
import org.eclipse.swt.widgets.Widget;
        try {
        }
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        SSHUtils.saveHostConfigurations(
public class SSHTunnelCredsOnlyConfiguratorUI implements IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> {
    public void createControl(@NotNull Composite parent, Object object, @NotNull Runnable propertyChangeListener) {
}            SSHTunnelDefaultConfiguratorUI.CredentialsPanel credsPanel = new SSHTunnelDefaultConfiguratorUI.CredentialsPanel(
/*
    @Override
        this.credPanelsContainer.pack(true);
    @Override
            .map(SSHTunnelDefaultConfiguratorUI::validateConfiguration)
            configurations = Arrays.stream(SSHUtils.loadHostConfigurations(handlerConfiguration, false))

    @Override


            return;

    private Runnable propertyChangeListener;
 *
