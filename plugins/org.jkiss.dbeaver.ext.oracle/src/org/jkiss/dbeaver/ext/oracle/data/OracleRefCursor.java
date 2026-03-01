            }
            } catch (SQLException e) {
 *

        }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.sql.ResultSet;
    @Nullable
        return cursorValue == null;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return cursorValue == null ? DBConstants.NULL_VALUE_LABEL : OracleConstants.TYPE_NAME_REFCURSOR;
            JDBCUtils.executeStatement(this.session, "MOVE ABSOLUTE 0 IN \"" + cursorName + "\"");
 * Cursor references (named)
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                throw new DBCException("Ref cursors are not available in auto-commit mode");
            try {
    }
    }
        if (cursorValue instanceof ResultSet) {
    private static final Log log = Log.getLog(OracleRefCursor.class);
                log.error(e);
    }
import org.jkiss.dbeaver.model.data.DBDCursor;
    public String getCursorName() {
public class OracleRefCursor implements DBDCursor {
    public OracleRefCursor(JDBCSession session, JDBCStatement sourceStatement, @Nullable Object cursorValue) throws SQLException {
        }
 * Unless required by applicable law or agreed to in writing, software
            cursorStatement = this.session.createStatement();
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
    @Override
 * limitations under the License.
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import java.sql.SQLException;

            }
                return ((ResultSet) cursorValue).getCursorName();
    @NotNull
            try {
    }
/*
            }
 * you may not use this file except in compliance with the License.
        this.session = session;
    public boolean isModified() {
            }
                log.error(e);
/*
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
            if (cursorStatement != null) {
        return null;
    @Override
        this.cursorValue = cursorValue;
                ((ResultSet) cursorValue).close();
            return cursorStatement.executeQuery("FETCH ALL IN \"" + cursorName + "\"");


 * Copyright (C) 2010-2025 DBeaver Corp and others
        return false;
    @Override
        try {

/**
*/
    @Override
                cursorStatement.close();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public DBCResultSet openResultSet(@NotNull DBCSession session) throws DBCException {
import org.jkiss.code.Nullable;
    public boolean isNull() {
            try {

 * See the License for the specific language governing permissions and
    public String toString() {
    }
        if (cursorValue instanceof ResultSet) {
package org.jkiss.dbeaver.ext.oracle.data;
            throw new DBCException(e, session.getExecutionContext());
    private final JDBCSession session;
import org.jkiss.code.NotNull;
        } catch (SQLException e) {
            }
 * You may obtain a copy of the License at

    private final JDBCStatement sourceStatement;
import org.jkiss.dbeaver.Log;
                throw new DBCException(e, session.getExecutionContext());
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetImpl;

    public void release() {
    private final Object cursorValue;
    }
        }
 */
}

    public Object getRawValue() {
            if (txnManager != null && txnManager.isAutoCommit()) {

            } catch (SQLException e) {

 *
 * distributed under the License is distributed on an "AS IS" BASIS,

        return cursorValue;
        }
import org.jkiss.dbeaver.model.DBConstants;

 * DBeaver - Universal Database Manager
        this.sourceStatement = sourceStatement;
                return JDBCResultSetImpl.makeResultSet((JDBCSession) session, sourceStatement, (ResultSet) cursorValue, false);
    }
        if (cursorValue instanceof ResultSet) {
        throw new DBCException("Unsupported cursor value: " + cursorValue);
