
        return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.AbstractStatement;
    }
    public Throwable[] getStatementWarnings() throws DBCException {
            QMUtils.getDefaultHandler().handleStatementOpen(this);
package org.jkiss.dbeaver.model.impl.local;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.text = text;
        return false;
{
    @Override


    }
import org.jkiss.dbeaver.model.qm.QMUtils;
    @Override
    public long[] executeStatementBatch() throws DBCException {



    }
        return new LocalResultSet<>(connection, this);

    @Override

    @Override
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public void setLimit(long offset, long limit) throws DBCException {
 * You may obtain a copy of the License at

    public void addToBatch() throws DBCException {

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

    }

 * DBeaver - Universal Database Manager
    }
    @Override

    public DBCResultSet openResultSet() throws DBCException {
    }

    private String text;
 */
    public void setStatementTimeout(int timeout) throws DBCException {
    public LocalStatement(DBCSession session, String text) {

}
import org.jkiss.dbeaver.model.exec.DBCException;

        super(session);
    }
    @Override
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
        return text;
/*
    @Override
        return 0;
    public boolean nextResults() throws DBCException {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    public boolean executeStatement() throws DBCException {
    @Override
        if (isQMLoggingEnabled()) {
 *
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        }
    @Override
    }
import org.jkiss.dbeaver.DBException;

    @Override

    }
    public String getQueryString() {
    public void setResultsFetchSize(int fetchSize) throws DBCException {
    public long getUpdateRowCount() throws DBCException {
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCResultSet;

 *
public class LocalStatement extends AbstractStatement<DBCSession>

    public void cancelBlock(@NotNull DBRProgressMonitor monitor, Thread blockThread) throws DBException {
import org.jkiss.code.NotNull;
        return new Throwable[0];
 * Unless required by applicable law or agreed to in writing, software
 *

 * LocalResultSet
        return new long[0];

    }
 */
    }
