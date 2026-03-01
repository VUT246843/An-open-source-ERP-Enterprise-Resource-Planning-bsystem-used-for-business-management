        }
public class UIServiceConnectionsImpl implements DBServiceConnections, UIServiceConnections {
            EditConnectionDialog.openEditConnectionDialog(UIUtils.getActiveWorkbenchWindow(), dataSourceContainer, defaultPageName);
            }

    }
                    if (requestingProtocol.startsWith(pd.getType()) && pd.getUserId() != null && pd.getHost() != null && pd.getPort() == requestingPort && pd.getHost().equalsIgnoreCase(requestingHost)) {
                }
    private final IProxyService proxyService;
/**
    public boolean checkAndCloseActiveTransaction(@NotNull DBCExecutionContext[] contexts) {
                    DBSSecretController secretController = DBSSecretController.getProjectSecretController(dataSourceContainer.getProject());
    public void initConnection(DBRProgressMonitor monitor, DBPDataSourceContainer dataSourceContainer, DBRProgressListener onFinish) {
 * UIServiceConnectionsImpl
 *     http://www.apache.org/licenses/LICENSE-2.0
        BundleContext bundleContext = DBeaverActivator.getInstance().getBundle().getBundleContext();

 */
 * you may not use this file except in compliance with the License.
    @Override
            }
            // Cannot edit connection. Let's open its contents
    @Override
                } catch (DBException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            if (proxyData != null) {
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
            proxyService = bundleContext.getService(proxyServiceRef);
 *

    }
        }
    public void closeActiveTransaction(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, boolean commitTxn) {
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.rm.RMConstants;
import org.eclipse.core.net.proxy.IProxyData;
    @Override
 *
        DataSourceHandler.connectToDataSource(monitor, dataSourceContainer, onFinish);
import org.jkiss.dbeaver.ui.dialogs.connection.EditConnectionDialog;
        DataSourceHandler.disconnectDataSource(dataSourceContainer, null);

            IProxyData[] proxyData = proxyService.getProxyData();
                    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

                for (IProxyData pd : proxyData) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
                    dataSourceContainer.resolveSecrets(secretController);
            proxyService = null;
import java.net.PasswordAuthentication;
        if (proxyServiceRef != null) {
        return null;

 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DataSourceHandler.closeActiveTransaction(monitor, context, commitTxn);
import org.eclipse.core.net.proxy.IProxyService;
        } else {
    @Nullable

/*
import org.jkiss.dbeaver.core.DBeaverActivator;
 *
    @Override
            DBWorkbench.getPlatformUI().openEntityEditor(dataSourceContainer);
import org.jkiss.dbeaver.runtime.DBServiceConnections;
}
            // Try to use Eclipse proxy config for global proxies
        if (dataSourceContainer.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
    public PasswordAuthentication getGlobalProxyConfiguration(@NotNull String requestingProtocol, @Nullable String requestingHost, int requestingPort) {
    @Override
        if (proxyService != null) {
            if (dataSourceContainer.getProject().isUseSecretStorage() && !dataSourceContainer.isSharedCredentials()) {
        DataSourceHandler.connectToDataSource(null, dataSourceContainer, onFinish);

import org.osgi.framework.ServiceReference;

package org.jkiss.dbeaver.ui.actions.datasource;
    }
    public UIServiceConnectionsImpl() {
        ServiceReference<IProxyService> proxyServiceRef = bundleContext.getServiceReference(IProxyService.class);


    }
    public void openConnectionEditor(@NotNull DBPDataSourceContainer dataSourceContainer, String defaultPageName) {
    public void disconnectDataSource(@NotNull DBPDataSourceContainer dataSourceContainer) {
    public void connectDataSource(@NotNull DBPDataSourceContainer dataSourceContainer, DBRProgressListener onFinish) {
import org.jkiss.code.Nullable;
    @Override
                }


        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public boolean confirmTransactionsClose(@NotNull DBCExecutionContext[] contexts) {
                        return new PasswordAuthentication(pd.getUserId(), pd.getPassword().toCharArray());
import org.jkiss.dbeaver.model.secret.DBSSecretController;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return DataSourceHandler.confirmTransactionsClose(contexts);

 * You may obtain a copy of the License at
        return DataSourceHandler.checkAndCloseActiveTransaction(contexts, false);
import org.jkiss.dbeaver.ui.UIUtils;
                    DBWorkbench.getPlatformUI().showError("Secret resolve", "Error loading connection secrets", e);
                try {
    }
    }


 * limitations under the License.
        } else {
 */
import org.osgi.framework.BundleContext;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
