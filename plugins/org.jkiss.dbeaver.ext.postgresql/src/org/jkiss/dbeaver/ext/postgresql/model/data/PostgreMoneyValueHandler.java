 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * limitations under the License.
        if (value == null) {
        DBCSession session,
    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
        DBSTypedObject type,
} */
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
        return resultSet.getString(index);
 * JDBC strict string value handler.
        JDBCResultSet resultSet,
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            statement.setObject(paramIndex, value.toString(), Types.OTHER);
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        int index)



    }
 * Unless required by applicable law or agreed to in writing, software
            statement.setNull(paramIndex, paramType.getTypeID());
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }

    @Override
 *
    @Override
 */
import java.sql.SQLException;
    public static final PostgreMoneyValueHandler INSTANCE = new PostgreMoneyValueHandler();
public class PostgreMoneyValueHandler extends JDBCStringValueHandler {

        throws SQLException
import java.sql.Types;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
import org.jkiss.dbeaver.model.exec.DBCSession;

    protected Object fetchColumnValue(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *
package org.jkiss.dbeaver.ext.postgresql.model.data;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    {
/*
