                        DBeaverNotifications.NT_ROLLBACK,

 * See the License for the specific language governing permissions and
 * limitations under the License.
                try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, "Rollback transaction")) {
import org.jkiss.dbeaver.runtime.TasksJob;
        });
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ModelPreferences;
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.ui.handlers.HandlerUtil;
            if (txnManager != null) {
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                        () -> TransactionLogDialog.showDialog(shell, context, true)
import java.lang.reflect.InvocationTargetException;
                    .getBoolean(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS)) {
                            "Duration: " + RuntimeUtils.formatExecutionTime(System.currentTimeMillis() - txnInfo.getTransactionStartTime())

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            "Query count: " + txnInfo.getUpdateCount() + "\n" +
                    throw new InvocationTargetException(e);
    }
/*
                        DBPMessageType.ERROR,
                        "Transaction has been rolled back\n\n" +
    public static void execute(@NotNull Shell shell, DBCExecutionContext context) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
public class DataSourceRollbackHandler extends AbstractDataSourceHandler {
            }
                } catch (DBCException e) {
 */
 * You may obtain a copy of the License at
                    );
                    txnManager.rollback(session, null);
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.actions.datasource;
                        context.getDataSource(),
import org.eclipse.swt.widgets.Shell;
                }
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
        return null;
import org.jkiss.code.NotNull;
                if (context.getDataSource().getContainer().getPreferenceStore()
 *
    @Override
import org.jkiss.dbeaver.model.DBUtils;
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.model.qm.QMTransactionState;
import org.jkiss.dbeaver.model.DBPMessageType;
 *
 *
                QMTransactionState txnInfo = QMUtils.getTransactionState(context);
                }
 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.dbeaver.ui.controls.txn.TransactionLogDialog;

                    DBeaverNotifications.showNotification(
                            + "\n",
 *     http://www.apache.org/licenses/LICENSE-2.0

        TasksJob.runTask("Rollback transaction", monitor -> {
    }
} * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.qm.QMUtils;
        DBCExecutionContext context = getActiveExecutionContext(event, true);
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (context != null && context.isConnected()) {
import org.jkiss.dbeaver.model.exec.*;


            execute(HandlerUtil.getActiveShell(event), context);
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
