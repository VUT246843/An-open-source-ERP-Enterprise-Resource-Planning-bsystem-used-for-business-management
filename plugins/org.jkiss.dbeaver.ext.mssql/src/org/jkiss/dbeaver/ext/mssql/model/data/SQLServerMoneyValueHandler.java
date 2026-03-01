            statement.setNull(paramIndex, paramType.getTypeID());
        } else {
 */
    protected Object fetchColumnValue(
    public static final SQLServerMoneyValueHandler INSTANCE = new SQLServerMoneyValueHandler();
            int index)
            throws SQLException
 * limitations under the License.
 *
            statement.setObject(paramIndex, value.toString());
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DBSTypedObject type,
import org.jkiss.dbeaver.model.struct.DBSTypedObject;


    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
        }
            DBCSession session,
import org.jkiss.dbeaver.model.exec.DBCSession;

 * See the License for the specific language governing permissions and
 *
            JDBCResultSet resultSet,
        return resultSet.getString(index);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
        if (value == null) {

 *

    @Override
package org.jkiss.dbeaver.ext.mssql.model.data;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
}import java.sql.SQLException;
public class SQLServerMoneyValueHandler extends JDBCStringValueHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
