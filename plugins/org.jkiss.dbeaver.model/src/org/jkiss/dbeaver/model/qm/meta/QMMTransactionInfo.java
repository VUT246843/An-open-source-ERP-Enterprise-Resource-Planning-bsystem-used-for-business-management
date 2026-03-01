    }
        this.committed = false;

            sp.close(false);
    }
        return previous;
                // Commit all non-finished savepoints
    }
        for (QMMTransactionSavepointInfo sp = savepointStack; sp != null; sp = sp.getPrevious()) {
    {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
    }
    public String toString()
            }
        }
        this.connection = connection;
 */
    private final transient QMMTransactionSavepointInfo savepointStack = new QMMTransactionSavepointInfo(this, null, null, null);

    }
    }
    private boolean committed;
            }
public class QMMTransactionInfo extends QMMObject {
        return connection.getText();

    }
        for (QMMTransactionSavepointInfo sp = savepointStack; sp != null; sp = sp.getPrevious()) {
    @Override
        super(QMMetaObjectType.TRANSACTION_INFO);
            }
/*
    }
 *
        this.previous = null;
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    QMMTransactionInfo(QMMConnectionInfo connection, QMMTransactionInfo previous) {
    @Override
        this.committed = true;


            if (sp.getReference() == savepoint) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.model.qm.meta;

 * You may obtain a copy of the License at
    private final transient QMMTransactionInfo previous;
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * QM Transaction info

    }
/**
    public boolean isCommitted() {
    public QMMConnectionInfo getConnection() {
 *

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                sp.close(true);
        }
        this.previous = previous;
    public QMMTransactionSavepointInfo getCurrentSavepoint()
    public String getText() {
    private final QMMConnectionInfo connection;
 *     http://www.apache.org/licenses/LICENSE-2.0
                break;
        return committed;
        super.close();
 * distributed under the License is distributed on an "AS IS" BASIS,

    void commit() {

    }
    public QMMTransactionInfo(QMMConnectionInfo connection, long openTime) {
        super(QMMetaObjectType.TRANSACTION_INFO, openTime, openTime);
        return null;
            if (!sp.isClosed()) {
        for (QMMTransactionSavepointInfo sp = this.savepointStack; sp != null; sp = sp.getPrevious()) {
        return "TRANSACTION";

    {
    public QMMObject getSavepoint(DBCSavepoint savepoint)
                return sp;
    public QMMTransactionInfo getPrevious() {
    {
        super.close();
        this.connection = connection;
 *
import org.jkiss.dbeaver.model.exec.DBCSavepoint;
}
        return savepointStack;
        return connection;
        }
 */
            if (toSavepoint != null && sp.getReference() == toSavepoint) {



    void rollback(DBCSavepoint toSavepoint)

