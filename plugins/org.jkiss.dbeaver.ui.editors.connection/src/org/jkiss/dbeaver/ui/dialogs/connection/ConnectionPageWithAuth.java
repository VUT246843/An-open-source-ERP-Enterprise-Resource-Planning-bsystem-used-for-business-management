        authModelSelector.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * you may not use this file except in compliance with the License.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.dialogs.connection;
    @Override

        authModelSelector = new AuthModelSelector(parent, () -> {
                DBPAuthModelDescriptor amReplace = selectedAuthModel.getReplacedBy(dataSource.getDriver());

            // Apply font on auth mode change
/**
import org.jkiss.dbeaver.ui.UIUtils;

            // Additional auth controls
        if (site.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
                serviceConnectionEditor.createControl(parent,
 *

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

                DBPAuthModelDescriptor selectedAuthModel = authModelSelector.getSelectedAuthModel();
                }
            if (selectedAuthModel != null) {

import org.eclipse.swt.widgets.Composite;

            }

                    getSite().getActiveDataSource(),
            serviceConnectionEditor.saveSettings(dataSource);
                    configuration.setAuthModelId(selectedAuthModel.getId());
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (authModelSelector != null) {
                authModelSelector.saveSettings(dataSource);
            DBPConnectionConfiguration configuration = dataSource.getConnectionConfiguration();
    private AuthModelSelector authModelSelector;

import org.eclipse.jface.dialogs.Dialog;
    }
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return authModelSelector;
        super.saveSettings(dataSource);
import org.jkiss.dbeaver.runtime.DBWorkbench;

    @NotNull

        return !site.getDriver().isAnonymousAccess();
            serviceConnectionEditor.loadSettings(dataSource);
        DBPDataSourceContainer dataSource = getSite().getActiveDataSource();
    protected void createAuthPanel(Composite parent, int hSpan) {
            }
                authModelSelector.loadSettings(dataSource, selectedAuthModel, getDefaultAuthModelId(dataSource));
        return DBPConnectionEditIntention.DEFAULT;
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridData;
    }
    private UIServiceConnectionEditor serviceConnectionEditor;
/*
 */
        return !isAuthEnabled() || (authModelSelector != null && authModelSelector.isComplete());
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        return AuthModelDatabaseNative.ID;
 *
import org.jkiss.dbeaver.ui.UIServiceConnectionEditor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    }
        if (isAuthEnabled()) {
                configuration.setUserName(dataSource.getDriver().getDefaultUser());
    @Override
    }

                dataSource.getConnectionConfiguration().setAuthModelId(
 * You may obtain a copy of the License at
    protected String getDefaultAuthModelId(DBPDataSourceContainer dataSource) {
 * limitations under the License.
            if (serviceConnectionEditor != null) {
 */


import org.jkiss.code.NotNull;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        ((GridData)authModelSelector.getLayoutData()).horizontalSpan = hSpan;
            }
    }
import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;
 *
        if (isAuthEnabled()) {
        UIUtils.setDefaultTextControlWidthHint(authModelSelector);

        if (serviceConnectionEditor != null) {
    protected DBPConnectionEditIntention getIntention() {
    }
    public boolean isExternalConfigurationProvided() {
            }
    protected boolean isAuthEnabled() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                dataSource.getDriver(), configuration);
 * ConnectionPageWithAuth
        }
        }, () -> getSite().updateButtons(), true, this.getIntention());
                    selectedAuthModel = amReplace;
import org.jkiss.dbeaver.Log;
        return serviceConnectionEditor != null && serviceConnectionEditor.isExternalConfigurationProvided();
        if (serviceConnectionEditor != null) {
            if (site.isNew() && CommonUtils.isEmpty(configuration.getUserName())) {
            if (authModelSelector != null) {

 * See the License for the specific language governing permissions and

    protected Composite getAuthPanelComposite() {
        super.loadSettings();
                if (amReplace != null) {
            Dialog.applyDialogFont(authModelSelector);

    }
    private static final Log log = Log.getLog(DataSourceProviderRegistry.class);
    public boolean isComplete() {
    public void loadSettings() {

            }

        }
}
        }
public abstract class ConnectionPageWithAuth extends ConnectionPageAbstract {
    }
    }
        }
 * Unless required by applicable law or agreed to in writing, software
            serviceConnectionEditor = DBWorkbench.getService(UIServiceConnectionEditor.class);

import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;

                    () -> site.updateButtons());
        }
    public void saveSettings(DBPDataSourceContainer dataSource) {

                    selectedAuthModel == null ? null : selectedAuthModel.getId());
import org.jkiss.dbeaver.model.rm.RMConstants;
            DBPAuthModelDescriptor selectedAuthModel = dataSource.getDriver().getDataSourceProvider().detectConnectionAuthModel(
                    log.debug("Auth model '" + selectedAuthModel.getId() + "' was replaced by '" + amReplace.getId() + "'");
import org.jkiss.utils.CommonUtils;
