 *
            if (txnManager != null) {

        super(title, script, false);
        this.makeAtomic = makeAtomic;
 */
    public void afterExecute(DBCSession session, Throwable error) throws DBCException {
package org.jkiss.dbeaver.model.impl.edit;
        this(title, script, true);
        super.beforeExecute(session);

public class SQLDatabasePersistActionAtomic extends SQLDatabasePersistAction {
    }
 * you may not use this file except in compliance with the License.
 *
        if (wasTransactional) {
    private boolean wasTransactional = false;
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
    @Override
            }
            }
    public SQLDatabasePersistActionAtomic(String title, String script, boolean makeAtomic) {

                wasTransactional = true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
    private boolean makeAtomic;
        }
    }
    public SQLDatabasePersistActionAtomic(String title, String script) {
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
}

 * You may obtain a copy of the License at
    public void beforeExecute(DBCSession session) throws DBCException {
                txnManager.setAutoCommit(session.getProgressMonitor(), false);
/**

 *
        super.afterExecute(session, error);
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
        }
 * Atomic persist action. Executed in auto-commit mode

            if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
 * DBeaver - Universal Database Manager
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;
 * limitations under the License.
                txnManager.setAutoCommit(session.getProgressMonitor(), true);
 */
import org.jkiss.dbeaver.model.exec.DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (this.makeAtomic) {
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
/*
