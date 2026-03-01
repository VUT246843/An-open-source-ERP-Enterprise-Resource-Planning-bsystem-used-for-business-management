        @NotNull DBSTypedObject type,
    @Override
        }

        @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            // JDBC uses 1-based indexes
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
                return resultSet.getAttributeValue(index);
            } else {
 *
        @NotNull DBCSession session,
 */
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.data.BaseValueHandler;
import org.jkiss.dbeaver.model.exec.DBCStatement;
        int index
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                // JDBC uses 1-based indexes
            if (resultSet instanceof JDBCResultSet) {


        @NotNull JDBCResultSet resultSet,
            throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
    @Nullable
     * @param statement     statement
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        catch (SQLException e) {
 * Base JDBC value handler
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    protected abstract Object fetchColumnValue(
        @Nullable Object value
        int index,
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
     * @param session       session
     * @param value         parameter value
import org.jkiss.dbeaver.model.messages.ModelMessages;
            throw new DBCException(e, session.getExecutionContext());
     * @param paramIndex    parameter index (1-based)
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBCSession session,
import org.jkiss.dbeaver.model.exec.DBCSession;
        catch (SQLException e) {
public abstract class JDBCAbstractValueHandler extends BaseValueHandler {
    protected abstract void bindParameter(
        int paramIndex,

 * Copyright (C) 2010-2026 DBeaver Corp and others
                return fetchColumnValue(session, (JDBCResultSet) resultSet, type, index + 1);
 */
        @NotNull DBCResultSet resultSet,
    public final void bindValueObject(
        @NotNull DBCStatement statement,
 * Unless required by applicable law or agreed to in writing, software
 *
     * @param paramType     parameter type
        @Nullable Object value
        int index
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        }
     * @throws DBCException
/*

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    ) throws DBCException {
     * @throws SQLException
    /**

 * You may obtain a copy of the License at
        @NotNull DBSTypedObject columnMetaData,
            this.bindParameter((JDBCSession) session, (JDBCPreparedStatement) statement, columnMetaData, index + 1, value);
    ) throws DBCException {
     * Binds parameter value
        try {
        }
        @NotNull JDBCPreparedStatement statement,
        @NotNull DBSTypedObject type,
}
    }
    @Override
/**
 *
 * limitations under the License.
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
    public final Object fetchValueObject(

            }
    ) throws DBCException, SQLException;
        try {
    ) throws DBCException, SQLException;
        @NotNull DBCSession session,
import java.sql.SQLException;
        @NotNull DBSTypedObject paramType,
