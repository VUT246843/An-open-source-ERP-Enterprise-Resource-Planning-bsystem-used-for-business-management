                }
package org.jkiss.dbeaver.ui.actions;
            });
            : null;
 */

    {
 * Unless required by applicable law or agreed to in writing, software
    }
 * DatabaseEditorPropertyTester
                    }
        }
                        return false;
                case PROP_PROJECT_RESOURCE_VIEWABLE: {
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.ui.editors.IStatefulEditor;
                    if (context == null || !context.isConnected()) {
 * DBeaver - Universal Database Manager
                case PROP_EDITABLE: {
import org.jkiss.dbeaver.model.app.DBPProject;
            // Get root datasource node (we don't want to

        @Override
     */
        if (workbenchWindow == null) {
                    }
                    return txnManager != null && txnManager.isSupportsTransactions();
    private static @Nullable DBPProject getProject(Object receiver) {
    public static final String PROP_CONNECTED = "connected";
import org.jkiss.code.NotNull;
            return DataSourcePropertyTester.class.getName();
    private static void updateEditorsDirtyFlag() {
            log.debug("Error testing property " + property + ": " + e.getMessage());
//                        return Boolean.valueOf(active).equals(expectedValue);
            UIUtils.asyncExec(runnable);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    DBPProject resourceProject = getProject(receiver);
                QMUtils.unregisterHandler(qmHandler);
                        return providerSynchronizable != null && providerSynchronizable.isSynchronizationEnabled(container);
            qmHandler = new QMEventsHandler();
        @Override
    // QM events handler
    public static final String PROP_SYNCHRONIZABLE = "synchronizable";
    static protected final Log log = Log.getLog(DataSourcePropertyTester.class);
        public synchronized void handleTransactionRollback(@NotNull DBCExecutionContext context, DBCSavepoint savepoint) {
                        final var provider = container.getDriver().getDataSourceProvider();
                    if (context != null && context.isConnected()) {
    }
        }
                    }
                DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTION_ACTIVE);
            @Nullable
        }
                DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTION_ACTIVE);
    private static class QMEventsHandler extends DefaultExecutionHandler {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }

                    if (context != null) {
        }
    /**
     * Making each editor QM listener is too expensive.
                DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTIONAL);
                    } else {
        private void updateUI(Runnable runnable) {
            if (editor instanceof IStatefulEditor) {
                }
        for (IEditorReference ref : editors) {
                    DBPProject resourceProject = getProject(receiver);
                UIUtils.asyncExec(((IStatefulEditor) editor)::updateDirtyFlag);
import org.jkiss.dbeaver.model.exec.*;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.ActionUtils;
    public static final String PROP_TRANSACTION_ACTIVE = "transactionActive";
 * limitations under the License.

            updateUI(() -> {
        IWorkbenchWindow workbenchWindow = UIUtils.findActiveWorkbenchWindow();
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
                    DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
                case PROP_PROJECT_RESOURCE_EDITABLE: {
                        isConnected = container != null && container.isConnected();
import org.jkiss.dbeaver.runtime.qm.DefaultExecutionHandler;
                        return false;
                    if (context == null) {
    public static final String PROP_TRANSACTIONAL = "transactional";
     * This is a hack.
                case PROP_TRANSACTIONAL: {
    public static void firePropertyChange(String propName)
        }
    @Override
    public static final String PROP_CONNECTING = "connecting";
                        if (receiver instanceof IPageChangeProvider pcp) {
            if (qmHandler != null) {

import org.eclipse.ui.IEditorReference;


                        final var providerSynchronizable = GeneralUtils.adapt(provider, DBPDataSourceProviderSynchronizable.class);
                    return Boolean.FALSE.equals(expectedValue);
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
            });
                        return container != null && container.isConnecting();
                            Object selectedPage = pcp.getSelectedPage();
        IEditorReference[] editors = workbenchWindow.getActivePage().getEditorReferences();
    public static final String PROP_SUPPORTS_TRANSACTIONS = "supportsTransactions";
    }
                case PROP_SYNCHRONIZABLE:
                    if (context == null || !context.isConnected()) {
            }
        public synchronized void handleStatementExecuteBegin(@NotNull DBCStatement statement) {
        }
//                        boolean active = QMUtils.isTransactionActive(context);
                        DBPDataSourceContainer container = containerProvider.getDataSourceContainer();
                    }
                    return resourceProject == null || resourceProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
                        return txnManager != null && !txnManager.isAutoCommit();
                        return Boolean.FALSE.equals(expectedValue);
                        return false;
                case PROP_CONNECTING: {
                    try {

                    } else if (receiver instanceof DBPDataSourceContainerProvider containerProvider) {
            }
            if (DBWorkbench.getPlatform().getApplication().isHeadlessMode()) {
 * you may not use this file except in compliance with the License.
     * Editors should listen txn commit/rollback and update their dirty flag (active transaction makes SQL editor dirty).
        @Override

/**
        try {
                        return false;
            QMUtils.registerHandler(qmHandler);
                updateEditorsDirtyFlag();
        @Override
    public static final String PROP_EDITABLE = "editable";
import org.jkiss.dbeaver.Log;
                    }
        private QMEventsHandler qmHandler;
                case PROP_TRANSACTION_ACTIVE: {
 *
                    if (!context.isConnected()) {
            ? EditorUtils.getFileProject(editorPart.getEditorInput())
import org.eclipse.core.expressions.PropertyTester;
import org.jkiss.dbeaver.model.*;
                        final var container = context.getDataSource().getContainer();
                    return resourceProject == null || resourceProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW);
            updateUI(() -> {
                            if (!(selectedPage instanceof ISmartTransactionManager)) {
                        }
                }
                    boolean checkConnected = Boolean.TRUE.equals(expectedValue);
import org.jkiss.dbeaver.model.rm.RMConstants;
            updateUI(() -> {
                    DBPProject resourceProject = getProject(receiver);
        public void activateService() {
        return receiver instanceof IEditorPart editorPart
    }
import org.jkiss.dbeaver.ui.UIUtils;
                    if (receiver instanceof DBPDataSourceContainerProvider containerProvider) {
                        return txnManager != null && Boolean.valueOf(!txnManager.isAutoCommit()).equals(expectedValue);
            return false;
            return false;

        @Override
                    DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);

            updateUI(() -> DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTION_ACTIVE));
        public void deactivateService() {
        @NotNull
        public String getHandlerName() {


        }
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                        DBPDataSourceContainer container = containerProvider.getDataSourceContainer();
                                return Boolean.FALSE.equals(expectedValue);
                        isConnected = false;

    public static class QMService implements IPluginService {
import org.eclipse.jface.dialogs.IPageChangeProvider;
                    return checkConnected == isConnected;
                updateEditorsDirtyFlag();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.IWorkbenchWindow;
                        isConnected = context.getDataSource().getContainer().isConnected();
                }
 */
            final IEditorPart editor = ref.getEditor(false);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                case PROP_SUPPORTS_TRANSACTIONS: {
            }
import org.jkiss.dbeaver.runtime.IPluginService;
                    } catch (DBCException e) {
                    }
                }
                        DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
                }
public class DataSourcePropertyTester extends PropertyTester {
                    } else {
}        public synchronized void handleTransactionCommit(@NotNull DBCExecutionContext context) {
            }
    }
                    return resourceProject == null || resourceProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
            while (receiver instanceof DBNDatabaseNode node && !(receiver instanceof DBNDataSource)) {
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                return;
            DBCExecutionContext context = contextProvider.getExecutionContext();
                    boolean isConnected;
                    }
                        log.debug("Error checking auto-commit state", e);
                    return false;
        @Override
import org.jkiss.dbeaver.model.qm.QMUtils;
            if (!(receiver instanceof DBPContextProvider contextProvider)) {

import org.eclipse.ui.IEditorPart;
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
        } catch (Exception e) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
import org.jkiss.dbeaver.ui.ISmartTransactionManager;
                            }
        }
            }


        }
                // Fire transactional mode change
            });
            switch (property) {
            return;

                return false;
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.datasource";

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                ActionUtils.fireCommandRefresh(ConnectionCommands.CMD_TOGGLE_AUTOCOMMIT);
                receiver = node.getParentNode();
    public static final String PROP_PROJECT_RESOURCE_VIEWABLE = "projectResourceViewable";
        @Override
/*

import org.jkiss.dbeaver.model.navigator.DBNDataSource;
                case PROP_CONNECTED:
                DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTION_ACTIVE);
        }
            }
    public static final String PROP_PROJECT_RESOURCE_EDITABLE = "projectResourceEditable";
        public synchronized void handleTransactionAutocommit(@NotNull DBCExecutionContext context, boolean autoCommit) {
