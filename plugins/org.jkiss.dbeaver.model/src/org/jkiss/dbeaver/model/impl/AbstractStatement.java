            try {
    @Nullable
        return statementSource;
    public void close() throws DBException {
    public DBCExecutionSource getStatementSource() {
        }
    private DBCExecutionSource statementSource;
    protected final SESSION connection;
                            co.close();
    @NotNull
                        } else {
        }
                            throw dbe;
 */
        if (this.executeFinalizer != null) {
                    if (firstError != null) {
 */

    }
    }
    private static final Log log = Log.getLog(AbstractStatement.class);
 *
 * You may obtain a copy of the License at

    protected boolean isQMLoggingEnabled() {
                }
    private DBPCloseableObject[] executeFinalizer;
                            }
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
import org.jkiss.dbeaver.model.exec.DBCStatement;
public abstract class AbstractStatement<SESSION extends DBCSession> implements DBCStatement, DBPAutoCloser {
            // Handle close
 * limitations under the License.
            }
            } catch (DBCException e) {
}
/*
            try {
                            if (firstError == null) {

        this.statementSource = source;
            this.executeFinalizer = new DBPCloseableObject[] { dependent };

    // Close dependants will be called AFTER the statement is close
 * you may not use this file except in compliance with the License.
        return connection;
    @Override
    public AbstractStatement(@NotNull SESSION session) {
                    }
                    this.executeFinalizer[0].close();
                        }
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Nullable
        if (isQMLoggingEnabled()) {
                log.debug(e);
    }
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                } else {
import org.jkiss.dbeaver.model.DBPAutoCloser;
    public void runCloseDependants() throws DBException {
import org.jkiss.dbeaver.Log;
    }
                        }
 * See the License for the specific language governing permissions and
            long updateRowCount = 0;
    // May be needed if statement cannot be closed for some reason



 * DBeaver - Universal Database Manager
                    for (DBPCloseableObject co : this.executeFinalizer) {
 * Unless required by applicable law or agreed to in writing, software
        } else {
                        try {
                if (executeFinalizer.length == 1) {
    }
                    Throwable firstError = null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCException;
    @Nullable
            } finally {
        runCloseDependants();
 *     http://www.apache.org/licenses/LICENSE-2.0

                        if (firstError instanceof DBException dbe) {
        }
    }
                            throw new DBException("Internal error during statement close", firstError);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
    @Override
    }
    public void setStatementSource(@Nullable DBCExecutionSource source) {
import org.jkiss.utils.ArrayUtils;
            QMUtils.getDefaultHandler().handleStatementClose(this, updateRowCount);
 *
    public SESSION getSession() {
    // Forcibly run close dependants

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.DBPCloseableObject;
                updateRowCount = getUpdateRowCount();
import org.jkiss.dbeaver.model.qm.QMUtils;
 *
            }
/**
                        } catch (Throwable e) {
    }
        this.connection = session;
    @NotNull

        if (this.executeFinalizer == null) {
                this.executeFinalizer = null;

            this.executeFinalizer = ArrayUtils.add(DBPCloseableObject.class, executeFinalizer, dependent);


    @Override
import org.jkiss.code.Nullable;
 * Manageable result set
    public void autoCloseDependant(@NotNull DBPCloseableObject dependent) {
package org.jkiss.dbeaver.model.impl;
import org.jkiss.dbeaver.DBException;
        return true;
                                firstError = e;

