 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        throws DBCException
        return false;
    {
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
    @Override
    @Override

        return null;
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
        throw new DBCException("Transactions not supported");
    @Override
 */
        throws DBCException
    }

        throws DBCException
public class AbstractTransactionManager implements DBCTransactionManager {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software

 * Licensed under the Apache License, Version 2.0 (the "License");

        throws DBCException
    @Override
    }

        throw new DBCException("Savepoint not supported");
    public boolean isSupportsTransactions() {
    {
        return true;
 *
        throws DBCException
import org.jkiss.code.NotNull;
    {
    {
    }
    }
    public void setTransactionIsolation(@NotNull DBRProgressMonitor monitor, @NotNull DBPTransactionIsolation transactionIsolation)
        }
    {
    public void rollback(@NotNull DBCSession session, DBCSavepoint savepoint)
    @Override
    {
            throw new DBCException("Transactional mode not supported");
/**
/*
 * See the License for the specific language governing permissions and
    public boolean supportsSavepoints()
    public void commit(@NotNull DBCSession session)
import org.jkiss.dbeaver.model.exec.DBCSession;
        return false;
        throws DBCException
* AbstractTransactionManager
*/
    }
        throw new DBCException("Savepoint not supported");
    @Override
}
    public boolean isAutoCommit()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.exec.DBCSavepoint;
import org.jkiss.dbeaver.model.exec.DBCException;
 *
    public DBCSavepoint setSavepoint(@NotNull DBRProgressMonitor monitor, String name)


    }
        throw new DBCException("Transaction isolation change not supported");
    {

    }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    public void releaseSavepoint(@NotNull DBRProgressMonitor monitor, @NotNull DBCSavepoint savepoint)
    public void setAutoCommit(@NotNull DBRProgressMonitor monitor, boolean autoCommit)
package org.jkiss.dbeaver.model.impl;
    @Override

    @Override
        // do nothing
        if (!autoCommit) {
    }

    {
    {

        throws DBCException
 *
        throws DBCException
    public DBPTransactionIsolation getTransactionIsolation()
