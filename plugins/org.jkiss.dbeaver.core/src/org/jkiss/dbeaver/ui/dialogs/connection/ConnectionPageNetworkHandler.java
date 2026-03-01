 * See the License for the specific language governing permissions and
        Composite composite = new Composite(parent, SWT.NONE);

    @NotNull
        if (profileConfiguration != null && profileConfiguration.isEnabled()) {
            // Use configuration from the connection
package org.jkiss.dbeaver.ui.dialogs.connection;
    @Nullable

    private final IDataSourceConnectionEditorSite site;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    private Composite configuratorPlaceholder;
        updatePageCompletion();
    private DBWHandlerConfiguration handlerConfiguration;
    }
    public ConnectionPageNetworkHandler(IDataSourceConnectionEditorSite site, NetworkHandlerDescriptor descriptor) {
        composite.setLayout(new GridLayout(1, false));
                configuration.updateHandler(handlerConfiguration);
        } else {
    }
            handlerConfiguration = configuration.getHandler(handlerDescriptor.getId());

    public NetworkHandlerDescriptor getHandlerDescriptor() {
        configuratorPlaceholder.getParent().layout(true, true);
            configuration.getConfigProfileName()
    private ControlEnableState configuratorEnableState;
        }

 * Network handlers edit dialog page
        );

import org.eclipse.jface.dialogs.ControlEnableState;
        setControl(composite);
        } else {
        configuratorPlaceholder = UIUtils.createComposite(composite, 1);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
            profileProvidedHint.setText(NLS.bind(
            return;
            if (configDescriptor == null) {

            if (handlerConfiguration == null) {
    @Override
    private static final Log log = Log.getLog(ConnectionPageNetworkHandler.class);

            configuratorEnableState.restore();

        try {
            configuration.updateHandler(handlerConfiguration);
import org.jkiss.utils.CommonUtils;
        if (handlerConfiguration == null) {
        }
    }
     * If a {@code profile} is present, then the page's controls are disabled,
        if (isPageComplete()) {

            configuration.getConfigProfileSource(),
    /**
             UIUtils.setControlVisible(profileProvidedHint.getParent(), false);
            } else {
 */
            if (profileConfiguration != null && profileConfiguration.isEnabled()) {
        setTitle(descriptor.getCodeName());
        DBPDataSourceContainer dataSource = site.getActiveDataSource();
     * Otherwise, page's controls are enabled, and configuration is loaded

        profileProvidedHint = UIUtils.createInfoLink(
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (configuratorEnableState != null) {
            setPageComplete(true);
        setDescription(descriptor.getDescription());
            if (configuratorEnableState == null) {
        DBPConnectionConfiguration configuration = dataSource.getConnectionConfiguration();
        }

import org.jkiss.code.Nullable;

import org.eclipse.swt.widgets.Composite;
        );
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
            return null;
    // Handler configuration. If null, no configuration is saved nor updated.
    @Override
import org.jkiss.dbeaver.ui.UIUtils;

    @Nullable
    }
    }

        }
import org.eclipse.swt.layout.GridData;
    public void refreshConfiguration(@Nullable DBWNetworkProfile profile) {
                log.warn("Attempt to configure " + handlerDescriptor.getId() + " with profile " + profile.getProfileName()
            () -> PrefPageProjectNetworkProfiles.open(getShell(), site.getProject(), getActiveProfile())
            setPageComplete(false);
     */
    /**
        DBWHandlerConfiguration profileConfiguration = profile != null ? profile.getConfiguration(handlerDescriptor) : null;

    }
        configuratorPlaceholder.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.layout.GridLayout;
     * <p>

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

            }
    protected void updatePageCompletion() {
        return handlerConfiguration == null || !handlerConfiguration.isEnabled() || configurator.isComplete();
        configuration.setConfigProfile(getActiveProfile());
            }
            return;
     * Refreshes the configuration for this page, reverting all modifications made after page is loaded.
/*
        configuratorPlaceholder.setRedraw(false);
            log.error("Can't create network configurator '" + handlerDescriptor.getId() + "'", e);
    @Override
        return handlerConfiguration;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
/**
        configuratorPlaceholder.setRedraw(true);
        refreshConfiguration(getActiveProfile());


 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        loadConfiguration(profile);
                handlerConfiguration = new DBWHandlerConfiguration(profileConfiguration);
            setErrorMessage(configurator.getErrorMessage());


            configuratorEnableState = null;
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
                return;
            UIUtils.setControlVisible(profileProvidedHint.getParent(), true);
    private IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> configurator;
import org.jkiss.dbeaver.Log;
     * <p>
 */
    private Link profileProvidedHint;

            composite,


        configurator.createControl(configuratorPlaceholder, handlerDescriptor, this::updatePageCompletion);
            }
            configurator.loadSettings(handlerConfiguration);
public class ConnectionPageNetworkHandler extends ConnectionWizardPage {
            configurator.saveSettings(handlerConfiguration);
    public DBWHandlerConfiguration getHandlerConfiguration() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final NetworkHandlerDescriptor handlerDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
            UIPropertyConfiguratorDescriptor configDescriptor = UIPropertyConfiguratorRegistry.getInstance().getDescriptor(implName);
    private DBWNetworkProfile getActiveProfile() {
    public void loadConfiguration(@Nullable DBWNetworkProfile profile) {
                    + " set that doesn't provide it");
import org.jkiss.code.NotNull;
     * Returns the handler configuration. It is guaranteed to be {@code null} if the page is not yet loaded.
 *
        return handlerDescriptor;
        }
        if (handlerConfiguration != null) {
    public boolean isPageComplete() {
            configuration.removeHandler(handlerConfiguration.getId());
 * limitations under the License.
            DBPDataSourceContainer dataSource = site.getActiveDataSource();
 *
        if (CommonUtils.isEmpty(configuration.getConfigProfileName())) {
        } else {
import org.jkiss.dbeaver.ui.preferences.PrefPageProjectNetworkProfiles;
    public void createControl(Composite parent) {
    // Shown when a handler is provided by a profile
        }
 * Unless required by applicable law or agreed to in writing, software
        if (profile != null) {
        }

        DBPConnectionConfiguration configuration = dataSource.getConnectionConfiguration();
    }
        return dataSource.getRegistry().getNetworkProfile(
     * from the connection configuration, if present.
 *
import org.eclipse.swt.SWT;
            // It could not exist, let's create it
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
            ));
    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
        } else {
     */

import org.jkiss.dbeaver.ui.IDataSourceConnectionEditorSite;
            DBPConnectionConfiguration configuration = dataSource.getConnectionConfiguration();
}
                "Using configuration from profile ''<a href=\"#\">{0}</a>''",
     * and configuration is loaded from that profile.
import org.eclipse.osgi.util.NLS;
            String implName = handlerDescriptor.getHandlerType().getImplName();
        super(ConnectionPageNetworkHandler.class.getSimpleName() + "." + descriptor.getId());
            // Use configuration from the profile

import org.eclipse.swt.widgets.Link;
        } catch (DBException e) {
                configuratorEnableState = ControlEnableState.disable(configuratorPlaceholder);

            "N/A",
        DBWHandlerConfiguration profileConfiguration = profile != null ? profile.getConfiguration(handlerDescriptor) : null;
    @Override
        if (handlerConfiguration.isEnabled()) {
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;
        this.site = site;
        this.handlerDescriptor = descriptor;

            setErrorMessage(null);

            configurator = configDescriptor.createConfigurator();
        }
                handlerConfiguration = new DBWHandlerConfiguration(handlerDescriptor, dataSource);
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        }
                profile.getProfileName()
            }
