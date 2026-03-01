 *
    {
    public QMMTransactionSavepointInfo getPrevious()
    }
/**
 * You may obtain a copy of the License at
    private boolean committed;
package org.jkiss.dbeaver.model.qm.meta;

 * QM Savepoint info
 * See the License for the specific language governing permissions and
        this.lastExecute = lastExecute;
        return reference;
                default:
        return getTransaction().getConnection();
                    break;
        this.committed = commit;
            public void remove() {
 *
    {

    {
 */
    public QMMTransactionInfo getTransaction()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    }
    private transient DBCSavepoint reference;
    }
                case UTIL:

    }
    public Iterator<QMMStatementExecuteInfo> getExecutions()

    }
        this.reference = reference;

    {
        this.reference = null;
    @Override

    DBCSavepoint getReference()
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    }
                case META_DDL:
                }
            public boolean hasNext() {

 * distributed under the License is distributed on an "AS IS" BASIS,
            }
import java.util.Iterator;
    public QMMStatementExecuteInfo getLastExecute()
    @Override
        return "SAVEPOINT" + (name == null ? "" : name);
            }
            }
public class QMMTransactionSavepointInfo extends QMMObject {
    }
                case USER_FILTERED:
/*
    {
                if (curExec == null || curExec.getSavepoint() != QMMTransactionSavepointInfo.this) {
        return name;
    public String getText() {
}    {
    @Override
 */
    }

                return n;

        return false;

 * Licensed under the Apache License, Version 2.0 (the "License");
                case USER_SCRIPT:
    }

                throw new UnsupportedOperationException();
            @Override
 * DBeaver - Universal Database Manager
                case USER:
    private final String name;
import java.util.NoSuchElementException;
            private QMMStatementExecuteInfo curExec = lastExecute;

                    throw new NoSuchElementException();
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
    public boolean isCommitted()
    }
    {

    }

        return previous;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.close();
import org.jkiss.dbeaver.model.exec.DBCSavepoint;

            @Override
    }
                return curExec != null && curExec.getSavepoint() == QMMTransactionSavepointInfo.this;
        return transaction;
        super(QMMetaObjectType.TRANSACTION_SAVEPOINT_INFO);
 *
    {
                curExec = curExec.getPrevious();
    void setLastExecute(QMMStatementExecuteInfo lastExecute)
            }


    private final transient QMMTransactionSavepointInfo previous;
        this.previous = previous;

    QMMTransactionSavepointInfo(QMMTransactionInfo transaction, DBCSavepoint reference, String name, QMMTransactionSavepointInfo previous)
            @Override
        this.name = name;

            switch (exec.getStatement().getPurpose()) {
    private transient QMMStatementExecuteInfo lastExecute;
    public String getName()
    public QMMConnectionInfo getConnection() {
    private final transient QMMTransactionInfo transaction;

 * limitations under the License.

        return lastExecute;

    }
                QMMStatementExecuteInfo n = curExec;
    }

        return committed;
            public QMMStatementExecuteInfo next() {
                    return true;
        this.transaction = transaction;
    public String toString()
        return transaction.getText();
    public boolean hasUserExecutions()
        return new Iterator<>() {
    {
        }
        };
        for (QMMStatementExecuteInfo exec = lastExecute; exec != null; exec = exec.getPrevious()) {
    {
    protected void close(boolean commit)
