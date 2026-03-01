 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    private String cursorName;
import org.jkiss.dbeaver.model.exec.DBCSession;

    private static final Log log = Log.getLog(PostgreRefCursor.class);
            }
/**
import org.jkiss.dbeaver.model.exec.DBCResultSet;
import org.jkiss.dbeaver.Log;
            }
import org.jkiss.dbeaver.model.exec.DBCException;
 * you may not use this file except in compliance with the License.
        return cursorName;
    }
import org.jkiss.code.Nullable;
 *
import org.jkiss.dbeaver.model.DBUtils;
        this.cursorName = cursorName;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
}
    public String toString() {
    @Override
    }


    @Override
    }
    public boolean isModified() {
    public boolean isNull() {
        return false;
        return cursorName;
    public void release() {

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
                log.error(e);
    }
    @Override
            throw new DBCException(e, session.getExecutionContext());
 */

 * distributed under the License is distributed on an "AS IS" BASIS,

        return cursorName;
import java.sql.SQLException;
        try {
            cursorStatement = null;
        }
            if (txnManager != null && txnManager.isAutoCommit()) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDCursor;


            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());

    private final JDBCSession session;
        } catch (SQLException e) {
        if (cursorStatement != null) {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
            if (cursorStatement != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
package org.jkiss.dbeaver.ext.postgresql.model.data;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
                cursorStatement.close();
    public Object getRawValue() {
    @Override
    public DBCResultSet openResultSet(@NotNull DBCSession session) throws DBCException {

            }
                JDBCUtils.executeStatement(session, "CLOSE \"" + cursorName + "\"");
    public String getCursorName() {
 *
 * Cursor references (named)
            JDBCUtils.executeStatement(this.session, "MOVE ABSOLUTE 0 IN \"" + cursorName + "\"");
/*
    }

    private boolean isOpen;
                throw new DBCException("Ref cursors are not available in auto-commit mode");
    @Nullable
    @NotNull

            cursorStatement = this.session.createStatement();

            try {
 *
            } catch (Exception e) {
            cursorStatement.close();
    }
import org.jkiss.code.NotNull;
public class PostgreRefCursor implements DBDCursor {
        this.isOpen = true;
    @Override
            return cursorStatement.executeQuery("FETCH ALL IN \"" + cursorName + "\"");
        }
    private JDBCStatement cursorStatement;
        this.session = session;
    public PostgreRefCursor(JDBCSession session, @NotNull String cursorName) throws SQLException {
        return false;
        if (this.isOpen) {
 * You may obtain a copy of the License at
    }
    }
