        }
import org.eclipse.ui.IEditorPart;

 * Unless required by applicable law or agreed to in writing, software
            setChecked(smartTransactionManager != null ?
        if (executionContext != null) {
import org.jkiss.dbeaver.core.CoreMessages;
                            monitor.done();
                }.schedule();
                txnLevelCurrent = txnManager.getTransactionIsolation();
import org.jkiss.utils.CommonUtils;
            this.level = level;
            setChecked(enabled);
        TransactionIsolationAction(DBCExecutionContext executionContext, DBPTransactionIsolation level, boolean checked) {
        }
        }
import org.jkiss.dbeaver.ModelPreferences;

            this.smartTransactionManager = smartTransactionManager;
                    continue;

            dataSource = executionContext.getDataSource();
            menuItems.add(ActionUtils.makeActionContribution(

/*
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            return CoreMessages.action_menu_transaction_smart_auto_commit_tip;

                }
 * See the License for the specific language governing permissions and
        }

            return;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.Log;
                        } finally {
                log.warn("Can't determine current auto-commit mode", e);
                    true));
            }
        }
 *
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
        public int getStyle() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
        public int getStyle() {
                    }

        @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
                        try {
            }
            ISmartTransactionManager smartTransactionManager = DBUtils.getAdapter(ISmartTransactionManager.class, activePart);
    }
 * You may obtain a copy of the License at

            try {
            try {
    }
        @Override
                        return Status.OK_STATUS;

        public void run() {
                    new SmartAutoCommitAction(dataSource, smartTransactionManager),
    private static class TransactionIsolationAction extends Action {
        public void run() {
import org.eclipse.jface.action.Separator;
        public String getText() {
        if (txnManager != null) {
         SmartAutoCommitAction(DBPDataSource dataSource, ISmartTransactionManager smartTransactionManager) {

 *
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                        } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
        @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
            setEnabled(smartTransactionManager != null);
            this.autoCommit = autoCommit;
        }
            String isolationName = isolation == null ? "?" : isolation.getTitle();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                                txnManager.setTransactionIsolation(monitor, level));
        private final DBPTransactionIsolation level;

            }
                smartTransactionManager.isSmartAutoCommit() :
                return;
        }

                        } finally {
                new AbstractJob("Set auto-commit") {
                autoCommit = txnManager.isAutoCommit();
                        monitor.beginTask("Change transaction isolation level to " + level.getTitle(), 1);
             }
            smartTransactionManager.setSmartAutoCommit(!smartTransactionManager.isSmartAutoCommit());
        @Override
        @Override
    }
            }
            if (txnManager != null) {
                                txnManager.setAutoCommit(monitor, autoCommit));
                    new TransactionAutoCommitAction(executionContext, false, !autoCommit, txnLevelCurrent),
        }
            this.executionContext = executionContext;
            } catch (DBCException e) {
                }.schedule();
                        }
        final DBPDataSourceInfo dsInfo = dataSource.getInfo();
        }
                            return GeneralUtils.makeExceptionStatus(e);
                            DBExecUtils.tryExecuteRecover(monitor, executionContext.getDataSource(), param ->
    private static class SmartAutoCommitAction extends Action {
            boolean autoCommit = false;
                            DBExecUtils.tryExecuteRecover(monitor, executionContext.getDataSource(), param ->
            return AS_RADIO_BUTTON;
    @Override
                            return GeneralUtils.makeExceptionStatus(e);
            } catch (DBCException ex) {
                        try {
            for (DBPTransactionIsolation txi : CommonUtils.safeCollection(dsInfo.getSupportedTransactionsIsolation())) {
                    @NotNull
        }
import org.eclipse.jface.action.Action;
            return AS_RADIO_BUTTON;
                    @Override
        @Override
    private static final Log log = Log.getLog(DataSourceTransactionModeContributor.class);

        }
                return;
import org.jkiss.code.NotNull;

            if (txnManager != null) {
    protected void fillContributionItems(final List<IContributionItem> menuItems) {
                        } catch (Exception e) {
            this.isolation = isolation;
        private final ISmartTransactionManager smartTransactionManager;
        TransactionAutoCommitAction(DBCExecutionContext executionContext, boolean autoCommit, boolean enabled, DBPTransactionIsolation isolation) {

            return AS_CHECK_BOX;

        }
        public String getText() {
import org.jkiss.dbeaver.ui.UIUtils;
 */
        @Override
                dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT));
                            container.getConnectionConfiguration().getBootstrap().setDefaultTransactionIsolation(level.getCode());
        private final boolean autoCommit;
        IEditorPart activePart = UIUtils.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
            DBPTransactionIsolation txnLevelCurrent = null;
                new AbstractJob("Set transaction isolation level") {
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import org.eclipse.core.runtime.IStatus;
                 return smartTransactionManager.isSmartAutoCommit();
                        true));
 * you may not use this file except in compliance with the License.
            menuItems.add(ActionUtils.makeActionContribution(

                menuItems.add(ActionUtils.makeActionContribution(


                log.warn("Can't determine current transaction isolation level", ex);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBExecUtils;
            }
import org.eclipse.core.runtime.Status;
        DBCExecutionContext executionContext = AbstractDataSourceHandler.getExecutionContextFromPart(activePart);
public class DataSourceTransactionModeContributor extends DataSourceMenuContributor {
import org.jkiss.dbeaver.ui.ActionUtils;
                            monitor.done();


                    true));
            if (!isChecked()) {

                        }
        public int getStyle() {
import org.eclipse.jface.action.IContributionItem;
                    @Override
            if (!isChecked()) {
                    new TransactionAutoCommitAction(executionContext, true, autoCommit, txnLevelCurrent),
        private final DBCExecutionContext executionContext;
                if (!txi.isEnabled()) {
            setChecked(checked);
                    }
                            monitor.subTask("Change context '" + executionContext.getContextName() + "' auto-commit state");
        }
package org.jkiss.dbeaver.ui.actions.datasource;
                        new TransactionIsolationAction(executionContext, txi, txi.equals(txnLevelCurrent)),
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                    @NotNull
            // Transactions


        if (dataSource == null) {
                            monitor.subTask("Change context '" + executionContext.getContextName() + "' transaction isolation level");
        }

        DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
            return CoreMessages.action_menu_transaction_smart_auto_commit;
            }
                            DBPDataSourceContainer container = executionContext.getDataSource().getContainer();
        }
            menuItems.add(new Separator());
            menuItems.add(ActionUtils.makeActionContribution(

            return autoCommit ? CoreMessages.action_menu_transaction_autocommit_description : NLS.bind(CoreMessages.action_menu_transaction_manualcommit_description, isolationName);
    private static class TransactionAutoCommitAction extends Action {
        public String getText() {
import org.jkiss.dbeaver.ui.ISmartTransactionManager;
                            container.persistConfiguration();
        public boolean isChecked() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        private final DBPTransactionIsolation isolation;
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
        @Override
import org.eclipse.osgi.util.NLS;
        public String getToolTipText() {
        }
    }
        @Override
            return level.getTitle();
                        return Status.OK_STATUS;
        public void run() {
        DBPDataSource dataSource = null;
             if (smartTransactionManager != null) {
                    true));
        }
            this.executionContext = executionContext;
        private final DBCExecutionContext executionContext;

        @Override
 *
}                        monitor.beginTask("Change connection auto-commit to " + autoCommit, 1);
import org.jkiss.dbeaver.model.*;

             return false;
import java.util.List;
