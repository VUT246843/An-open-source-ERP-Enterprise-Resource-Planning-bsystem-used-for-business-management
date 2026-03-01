 *
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    {
 *     http://www.apache.org/licenses/LICENSE-2.0

        JDBCSession session,
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.exec.DBCSession;
    public static final OracleRefCursorValueHandler INSTANCE = new OracleRefCursorValueHandler();
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.DBCException;
 */
    }

    @Override
        return new OracleRefCursor((JDBCSession) session, resultSet.getSourceStatement(), cursorValue);
public class OracleRefCursorValueHandler extends JDBCStructValueHandler {
        throws DBCException, SQLException
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStructValueHandler;
 * Unless required by applicable law or agreed to in writing, software
        Object value)
 * limitations under the License.
        JDBCPreparedStatement statement,
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.SQLException;

/**
        Object cursorValue = resultSet.getObject(index);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
        int paramIndex,
package org.jkiss.dbeaver.ext.oracle.data;

        DBSTypedObject paramType,
 * You may obtain a copy of the License at
}

        throw new DBCException("Cursor value binding not supported");
 *
    }
 * OracleRefCursorValueHandler
    protected void bindParameter(
