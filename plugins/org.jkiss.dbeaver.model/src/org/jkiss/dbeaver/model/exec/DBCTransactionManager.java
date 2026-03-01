public interface DBCTransactionManager {

 * you may not use this file except in compliance with the License.
}


    void releaseSavepoint(@NotNull DBRProgressMonitor monitor, @NotNull DBCSavepoint savepoint) throws DBCException;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 */

 * See the License for the specific language governing permissions and
    boolean isAutoCommit() throws DBCException;
 *
    DBCSavepoint setSavepoint(@NotNull DBRProgressMonitor monitor, String name)
 */



 *
 * You may obtain a copy of the License at
    void rollback(@NotNull DBCSession session, @Nullable DBCSavepoint savepoint) throws DBCException;
/*
package org.jkiss.dbeaver.model.exec;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
    boolean isSupportsTransactions();
* Transaction manager.

 * It can be implemented by execution context.
    DBPTransactionIsolation getTransactionIsolation() throws DBCException;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * DBeaver - Universal Database Manager

    void setTransactionIsolation(@NotNull DBRProgressMonitor monitor, @NotNull DBPTransactionIsolation transactionIsolation) throws DBCException;
/**
        throws DBCException;
    void setAutoCommit(@NotNull DBRProgressMonitor monitor, boolean autoCommit) throws DBCException;
    boolean supportsSavepoints();
 * limitations under the License.
    void commit(@NotNull DBCSession session) throws DBCException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
