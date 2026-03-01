                if (context.getDataSource().getContainer().getPreferenceStore()
 *
        });
import org.jkiss.dbeaver.ModelPreferences;
            if (txnManager != null) {
import org.eclipse.swt.widgets.Shell;
import org.jkiss.dbeaver.ui.controls.txn.TransactionLogDialog;
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.runtime.TasksJob;
                    throw new InvocationTargetException(e);
                        context.getDataSource(),
                    );
 */
import org.jkiss.dbeaver.utils.RuntimeUtils;
                        "Transaction has been committed\n\n" +
import org.eclipse.core.commands.ExecutionEvent;
                }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                            "Duration: " + RuntimeUtils.formatExecutionTime(System.currentTimeMillis() - txnInfo.getTransactionStartTime())
import org.jkiss.dbeaver.model.qm.QMUtils;
        TasksJob.runTask("Commit transaction", monitor -> {
                try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, "Commit transaction")) {

                QMTransactionState txnInfo = QMUtils.getTransactionState(context);
    @Override
import org.jkiss.dbeaver.model.DBUtils;

        if (context != null && context.isConnected()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class DataSourceCommitHandler extends AbstractDataSourceHandler {
                        () -> TransactionLogDialog.showDialog(shell, context, true)
        }
    }
    public static void execute(@NotNull Shell shell, @NotNull DBCExecutionContext context) {
                    .getBoolean(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS)) {
                }

                            + "\n",
}import org.jkiss.dbeaver.runtime.DBeaverNotifications;
import org.jkiss.dbeaver.model.exec.*;


 * See the License for the specific language governing permissions and
 * limitations under the License.
                        null,
 * Licensed under the Apache License, Version 2.0 (the "License");
/*

import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                    txnManager.commit(session);
        return null;
 *
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
    }
package org.jkiss.dbeaver.ui.actions.datasource;
        DBCExecutionContext context = getActiveExecutionContext(event, true);
                    DBeaverNotifications.showNotification(
import org.eclipse.ui.handlers.HandlerUtil;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionException;
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.model.qm.QMTransactionState;
 * You may obtain a copy of the License at
                            "Query count: " + txnInfo.getUpdateCount() + "\n" +
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                        DBeaverNotifications.NT_COMMIT,
            execute(HandlerUtil.getActiveShell(event), context);
                } catch (DBCException e) {
 * DBeaver - Universal Database Manager
