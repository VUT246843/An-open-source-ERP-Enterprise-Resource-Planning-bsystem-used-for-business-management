
}
    public static final PostgreHStoreValueHandler INSTANCE = new PostgreHStoreValueHandler();
import java.sql.SQLException;
        return resultSet.getString(index);
 */
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.ext.postgresql.model.data;
    private static final Log log = Log.getLog(PostgreHStoreValueHandler.class);
    }
            statement.setObject(paramIndex, value.toString(), Types.OTHER);
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        if (value == null) {
 * limitations under the License.
/*
        } else {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
/**
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            statement.setNull(paramIndex, paramType.getTypeID());
 * You may obtain a copy of the License at
public class PostgreHStoreValueHandler extends JDBCStringValueHandler {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;

 *     http://www.apache.org/licenses/LICENSE-2.0
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {
 * PostgreHStoreValueHandler
    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

import java.sql.Types;
 * See the License for the specific language governing permissions and
    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

    @Override
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
