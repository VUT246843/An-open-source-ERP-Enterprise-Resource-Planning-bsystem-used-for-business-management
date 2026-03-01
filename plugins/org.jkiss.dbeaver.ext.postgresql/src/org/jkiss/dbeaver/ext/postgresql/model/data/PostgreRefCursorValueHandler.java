        throws DBCException, SQLException
        return new PostgreRefCursor((JDBCSession) session, cursorName);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 */
                type.getTypeName());
import org.jkiss.dbeaver.model.exec.DBCSession;
            JDBCCursor cursor = new JDBCCursor(
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final PostgreRefCursorValueHandler INSTANCE = new PostgreRefCursorValueHandler();
import org.jkiss.dbeaver.model.exec.DBCException;
            // Disable resulset close on cursor release. Otherwise, cursor can't be referred by other queries (#6074)
    {
        Object value)
    @Override
                (ResultSet) object,

public class PostgreRefCursorValueHandler extends JDBCStructValueHandler {

package org.jkiss.dbeaver.ext.postgresql.model.data;
        throw new DBCException("Cursor value binding not supported");
            cursor.setCursorName(cursorName);
 * PostgreArrayValueHandler
 * limitations under the License.
        // Fetch as string (#1735)

 *
/**
        Object object = resultSet.getObject(index);
*/
        int paramIndex,
 * See the License for the specific language governing permissions and
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        JDBCSession session,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
/*
            return cursor;
 * you may not use this file except in compliance with the License.
        String cursorName = resultSet.getString(index);
 *
                (JDBCSession) session,
        if (object instanceof ResultSet) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        // Fetching cursor as object will close it so it won;'t be possible to use cursor in consequent queries

    }
        JDBCPreparedStatement statement,
    @Override
 * You may obtain a copy of the License at
    private static final Log log = Log.getLog(PostgreRefCursorValueHandler.class);
    }
            cursor.setCloseResultsOnRelease(false);
 * Unless required by applicable law or agreed to in writing, software
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStructValueHandler;
 *
    protected void bindParameter(
 */
            // Set cursor name

        return object;
        DBSTypedObject paramType,
