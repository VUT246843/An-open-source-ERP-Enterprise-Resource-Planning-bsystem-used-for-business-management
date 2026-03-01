 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.ui.UIServiceConnections;
    }

 *
        this.txnToEnd = txnToEnd;
                    return Status.CANCEL_STATUS;
    private static final Object CONFIRM_SYNC = new Object();

        setUser(false);
        if (serviceConnections != null) {
        UIServiceConnections serviceConnections = DBWorkbench.getService(UIServiceConnections.class);
import org.eclipse.core.runtime.Status;
 */
import org.eclipse.core.runtime.IStatus;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    EndIdleTransactionsJob(DBPDataSource dataSource, Map<DBCExecutionContext, DBCTransactionManager> txnToEnd) {
            } catch (DBException e) {
        log.debug("End idle " + txnToEnd.size() + " transactions for " + dataSource.getContainer().getId());
    private final DBPDataSource dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
                if (!serviceConnections.confirmTransactionsClose(txnToEnd.keySet().toArray(new DBCExecutionContext[0]))) {

 * EndIdleTransactionsJob
                log.error("Error ending idle transaction", e);
import org.jkiss.dbeaver.DBException;
/**
class EndIdleTransactionsJob extends DataSourceUpdaterJob {
 */
    }
        return Status.OK_STATUS;
            "Transactions have been rolled back after long idle period (" + dataSource.getContainer().getName() + ")",
            DBeaverNotifications.NT_ROLLBACK_IDLE,
import java.util.Map;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
            }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        setSystem(true);
    public DBPDataSource getDataSource() {
            DBPMessageType.ERROR);
                tee.getValue().rollback(session, null);
            }

        DBeaverNotifications.showNotification(
import org.jkiss.dbeaver.model.DBPMessageType;
        for (Map.Entry<DBCExecutionContext, DBCTransactionManager> tee : txnToEnd.entrySet()) {
/*
                }
package org.jkiss.dbeaver.runtime.jobs;

import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
            dataSource,
        return dataSource;
 * Unless required by applicable law or agreed to in writing, software
 *
            try (DBCSession session = tee.getKey().openSession(monitor, DBCExecutionPurpose.UTIL, "End idle transaction")) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        this.dataSource = dataSource;
        super("End idle transaction for (" + dataSource.getContainer().getName() + ")");
            synchronized (CONFIRM_SYNC) {
 *
    protected IStatus updateDataSource(DBRProgressMonitor monitor) {
 * See the License for the specific language governing permissions and
    }
    private final Map<DBCExecutionContext, DBCTransactionManager> txnToEnd;

    private static final Log log = Log.getLog(EndIdleTransactionsJob.class);
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;


import org.jkiss.dbeaver.model.exec.DBCSession;
        }

