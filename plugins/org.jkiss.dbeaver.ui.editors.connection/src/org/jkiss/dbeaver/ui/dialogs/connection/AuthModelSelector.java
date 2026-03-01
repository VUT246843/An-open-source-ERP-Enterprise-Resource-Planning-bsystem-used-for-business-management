    public void clearSettings() {
    private static final Log log = Log.getLog(DataSourceProviderRegistry.class);
            ? UIConnectionMessages.dialog_connection_auth_group
    Composite getAuthPanelComposite() {

                Label descLabel = new Label(modelConfigPlaceholder, SWT.NONE);
            if (redraw) {
                UIUtils.resizeShell(authModelCombo.getShell());

import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;

            authModelCombo.select(allAuthModels.indexOf(selectedAuthModel));
            2,
        UIPropertyConfiguratorDescriptor configDescriptor = UIPropertyConfiguratorRegistry.getInstance()
    public void setModelChangeFilter(IElementFilter<DBPAuthModelDescriptor> modelChangeFilter) {
        authModelCombo = new Combo(authModelComp, SWT.DROP_DOWN | SWT.READ_ONLY);

 *
            UIUtils.createInfoLabel(modelConfigPlaceholder, "Shared credentials cannot be edited", GridData.FILL_BOTH, 1);
        }

            }
        modelConfigPlaceholder.setRedraw(true);
    private final DBPConnectionEditIntention intention;
            }
            panelExtender.run();
            authModelCombo.setToolTipText(CommonUtils.notEmpty(selectedAuthModel.getDescription()));
            try {
            }
        }
    private DBPAuthModelDescriptor selectedAuthModel;
        }
                sharedConfigurator = configDescriptor.createConfigurator();
        }
                currentConfig.setAuthProperties(newConfig.getAuthProperties());
                    break;

            // Set default to native
            if (selectedAuthModel == null || !allAuthModels.contains(selectedAuthModel)) {
        }
        if ((selectedAuthModel == null || !allAuthModels.contains(selectedAuthModel)) && !CommonUtils.isEmpty(defaultAuthModelId)) {
package org.jkiss.dbeaver.ui.dialogs.connection;
        if (sharedConfigurator != null) {
    }
 */

    private List<? extends DBPAuthModelDescriptor> allAuthModels;
    private IElementFilter<DBPAuthModelDescriptor> modelFilter;

        }

    private IObjectPropertyConfigurator<Object, DBPDataSourceContainer> sharedConfigurator;
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
    public void saveSettings(DBPDataSourceContainer dataSource) {

    public DBPDataSourceContainer getActiveDataSource() {
    }
            }
        if (sharedConfigurator != null) {
        return activeDataSource;
            }
            authModelConfigurator.createControl(modelConfigPlaceholder, authModel, changeListener);
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.code.NotNull;
                        if (modelChangeFilter != null && !modelChangeFilter.isValidElement(newAuthModel)) {
        DBAAuthModel<?> authModel = selectedAuthModel.getInstance();
    public AuthModelSelector(
import org.jkiss.dbeaver.model.DBPEventListener;
                currentConfig.setUrl(newConfig.getUrl());
                    authModelConfigurator.loadSettings(activeDataSource);


        for (DBPAuthModelDescriptor model : allAuthModels) {
 * See the License for the specific language governing permissions and
        }
    private boolean authSettingsEnabled = true;
        this.selectedAuthModel = activeAuthModel;
import org.eclipse.swt.layout.GridLayout;
                try {
        showAuthModelSettings();
                if (authModelConfigurator != null && !isDisposed()) {
    public boolean isComplete() {
import org.jkiss.code.Nullable;
        }
                    o1.getName().compareTo(o2.getName()));
        if (activeDataSource instanceof DataSourceDescriptor dsd) {
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.DBException;
        super(parent, SWT.NONE);
                }
    }
        modelConfigPlaceholder.setRedraw(false);
                currentConfig.setProviderProperties(newConfig.getProviderProperties());
                        selectedAuthModel = newAuthModel;
            this,
        modelConfigPlaceholder = UIUtils.createTitledComposite(
        } else {
            if (uiConfiguratorDescriptor != null) {
        if (event.getAction() == DBPEvent.Action.OBJECT_UPDATE &&

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
            0
        DBPConnectionEditIntention intention
                }
import org.jkiss.dbeaver.ui.UIUtils;

    private IObjectPropertyConfigurator<Object, DBPDataSourceContainer> authModelConfigurator;
                    authModelConfigurator = uiConfiguratorDescriptor.createConfigurator();
        changeAuthModel();
        @Nullable DBPAuthModelDescriptor activeAuthModel,
        });
    public void handleDataSourceEvent(@NotNull DBPEvent event) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        UIUtils.updateTitledComposite(modelConfigPlaceholder, authSelectorVisible
        } else {
                }

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPEvent;
        if (selectedAuthModel != null) {
        });
            if (activeDataSource != null) {

                log.error("Error creating shared configurator", e);
                    modelConfigPlaceholder.setFocus();
            }
                currentConfig.setUserPassword(newConfig.getUserPassword());
                    }
            dsd.resetAllSecrets();
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            } else {
        }
    public DBPAuthModelDescriptor getSelectedAuthModel() {
                gd.horizontalSpan = 2;
            });
        if (authSettingsEnabled && !sharedCredsProhibitedByIntention) {
        if (this.activeDataSource != null) {
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
            }
        }
        this.changeListener = changeListener;
        this.allAuthModels = activeDataSource.getDriver() == DriverDescriptor.NULL_DRIVER ?
                if (amd.getId().equals(defaultAuthModelId)) {
                authModelConfigurator.loadSettings(activeDataSource);
                            authModelCombo.select(allAuthModels.indexOf(selectedAuthModel));
        }
 * ConnectionPageWithAuth
                    DBPAuthModelDescriptor newAuthModel = allAuthModels.get(authModelCombo.getSelectionIndex());
    public void enableAuthSettings(boolean enable, boolean redraw) {

            }
                        abstractConfigurator.setEditIntention(this.intention);
    private final Runnable panelExtender;
        Runnable panelExtender,
    @Override

    private void refreshCredentials() {
            authModelConfigurator = null;
        if (sharedCredsProhibitedByIntention) {
                    activeDataSource.getConnectionConfiguration().setAuthModelId(selectedAuthModel.getId());
                    log.error(e);

            DataSourceProviderRegistry.getInstance().getApplicableAuthModels(activeDataSource.getDriver());
        setLayout(new GridLayout(1, false));

                    if (authModelConfigurator instanceof AbstractObjectPropertyConfigurator<?, ?> abstractConfigurator) {
        @NotNull DBPDataSourceContainer dataSourceContainer,
            this.activeDataSource.getRegistry().removeDataSourceListener(this);
    }
        );
public class AuthModelSelector extends Composite implements DBPEventListener {
            sharedConfigurator.loadSettings(activeDataSource);
        if (panelExtender != null) {
        this.activeDataSource = dataSourceContainer;
            sharedConfigurator.createControl(authModelComp, this, this::refreshCredentials);

        if (modelConfigPlaceholder.getSize().x > 0 && parentFolder != null) {
        }
                selectedAuthModel = allAuthModels.getFirst();
                try {
        return modelConfigPlaceholder;
        UIUtils.disposeChildControls(modelConfigPlaceholder);
                dataSourceContainer.getConnectionConfiguration().setAuthModelId(selectedAuthModel.getId());
            parentFolder.layout(true, true);
                    changeListener.run();
    }
import java.util.List;
                } catch (DBException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        ) {
        boolean authSelectorVisible = this.intention.authModelSelectionEnabled && allAuthModels.size() >= 2;

        Composite authModelComp = UIUtils.createComposite(modelConfigPlaceholder, 3);
    }
                }
    ) {
    }
                // First one

 */
import org.jkiss.dbeaver.Log;
                descLabel.setLayoutData(gd);
            sharedConfigurator.saveSettings(dataSource);
        UIUtils.createEmptyLabel(authModelComp, 1, 1).setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        authModelComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (authModelConfigurator != null) {
        authModelCombo.addSelectionListener(new SelectionAdapter() {
    }
                        ? ""
 * Unless required by applicable law or agreed to in writing, software
            UIPropertyConfiguratorDescriptor uiConfiguratorDescriptor = UIPropertyConfiguratorRegistry.getInstance()

 *
            event.getData() instanceof DBPConnectionConfiguration newConfig &&
                    if (selectedAuthModel != newAuthModel) {
            @Override
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Shell;
        authModelConfigurator.loadSettings(activeDataSource);

                .getDescriptor(authModel);

            }

 *
        this.panelExtender = panelExtender;
        addDisposeListener(e -> {
import org.eclipse.swt.widgets.Label;
        if (authModelConfigurator != null) {

        this.activeDataSource.getRegistry().addDataSourceListener(this);
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    dataSourceContainer.getConnectionConfiguration().setAuthModelId(selectedAuthModel.getId());
                    selectedAuthModel = amd;
    }
    }
                activeDataSource.getRegistry().removeDataSourceListener(this);
import org.eclipse.swt.widgets.Combo;
    }
            UIUtils.asyncExec(() -> {

                descLabel.setText(selectedAuthModel.getDescription());
                if (selectedAuthModel != null) {
    }
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
                changeAuthModel();
/*
import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
import org.jkiss.dbeaver.model.access.DBAAuthModel;

import org.eclipse.swt.SWT;

        @Nullable String defaultAuthModelId
    public boolean isAuthSettingsEnabled() {
            UIUtils.createEmptyLabel(authModelComp, 1, 1);
        }
        this.allAuthModels.sort((Comparator<DBPAuthModelDescriptor>) (o1, o2) ->
/**
import java.util.Comparator;
}

    public void loadSettings(

                authModelConfigurator = null;


        if (authSettingsEnabled != enable) {
        Runnable changeListener,
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
            public void widgetSelected(SelectionEvent e) {
                    authModelCombo.setToolTipText(selectedAuthModel == null
        modelFilter = filter;
import org.eclipse.swt.widgets.Composite;
                        : CommonUtils.notEmpty(selectedAuthModel.getDescription()));
            o1.isDefaultModel() && !o2.isDefaultModel() ? -1 :
        this.authSettingsEnabled = !dataSourceContainer.isSharedCredentials();
                        activeDataSource.getConnectionConfiguration().setAuthModelId(selectedAuthModel.getId());
        }

        return selectedAuthModel;
    private Combo authModelCombo;
            authModelCombo.add(model.getName());
                DBPConnectionConfiguration currentConfig = activeDataSource.getConnectionConfiguration();
            .getDescriptor(DBAAuthModel.class.getName());
            if (activeDataSource != null) {

        authModelCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    private DBPDataSourceContainer activeDataSource;
    protected void showAuthModelSettings() {
    }
        this.modelChangeFilter = modelChangeFilter;
    private IElementFilter<DBPAuthModelDescriptor> modelChangeFilter;
        boolean enableShared,
        UIUtils.disposeChildControls(modelConfigPlaceholder);
        if (sharedConfigurator != null && isEnableSharedConfigurator) {
            parentFolder = UIUtils.getParentOfType(modelConfigPlaceholder, Shell.class);
        }
        Composite parent,
            for (DBPAuthModelDescriptor amd : allAuthModels) {
    }
    public void setModelFiler(IElementFilter<DBPAuthModelDescriptor> filter) {
                } finally {
        return authSettingsEnabled;
                    }
import org.jkiss.dbeaver.ui.AbstractObjectPropertyConfigurator;
import org.jkiss.dbeaver.ui.IElementFilter;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
import org.eclipse.swt.custom.CTabFolder;
        boolean sharedCredsProhibitedByIntention = this.intention == DBPConnectionEditIntention.CREDENTIALS_ONLY && this.activeDataSource.isSharedCredentials();

                        showAuthModelSettings();
            : UIConnectionMessages.dialog_connection_auth_group + " (" + selectedAuthModel.getName() + ")");
            authModelConfigurator.saveSettings(dataSource);
        Composite parentFolder = UIUtils.getParentOfType(modelConfigPlaceholder, CTabFolder.class);
        this.allAuthModels.removeIf(o -> modelFilter != null && !modelFilter.isValidElement(o));
        this.isEnableSharedConfigurator = enableShared;
    private void changeAuthModel() {
        UIUtils.setControlVisible(authModelLabel, authSelectorVisible);
 * limitations under the License.
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
            GridData.FILL_HORIZONTAL,
                    // Set selected auth model to datasource config
        Label authModelLabel = UIUtils.createControlLabel(modelConfigPlaceholder, UIConnectionMessages.dialog_connection_auth_group);
        if (configDescriptor != null && isEnableSharedConfigurator) {
            } catch (Exception e) {
            event.getObject() == activeDataSource
        UIUtils.setControlVisible(authModelComp, authSelectorVisible);
        }
        this.intention = intention;
            UIConnectionMessages.dialog_connection_auth_group,
    private final boolean isEnableSharedConfigurator;

    private final Composite modelConfigPlaceholder;
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;
        if (parentFolder == null) {
                currentConfig.setUserName(newConfig.getUserName());
            if (selectedAuthModel != null && !CommonUtils.isEmpty(selectedAuthModel.getDescription())) {
    private final Runnable changeListener;
                log.debug("No UI configurator for auth model " + selectedAuthModel.getId());
        }
    }
            DataSourceProviderRegistry.getInstance().getAllAuthModels() :
                }
        return authModelConfigurator == null || authModelConfigurator.isComplete();
                o2.isDefaultModel() && !o1.isDefaultModel() ? 1 :
                            return;
    }

                        }

            authSettingsEnabled = enable;
