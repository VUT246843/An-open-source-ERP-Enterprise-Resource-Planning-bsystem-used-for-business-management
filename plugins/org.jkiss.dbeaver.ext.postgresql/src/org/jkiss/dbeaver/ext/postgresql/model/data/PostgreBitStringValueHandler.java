 */
    @Override

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.utils.CommonUtils;
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
            statement.setObject(paramIndex, strValue, Types.OTHER);
 *
    }
        if (strValue.isEmpty()) {
 * DBeaver - Universal Database Manager
        } else {
            statement.setNull(paramIndex, Types.OTHER);
    }
 * limitations under the License.
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
        return CommonUtils.toString(object);
    public String getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
    @Override

/**
        return String.class;
import java.sql.SQLException;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ext.postgresql.model.data;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    {

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
 * You may obtain a copy of the License at

    }
public class PostgreBitStringValueHandler extends JDBCAbstractValueHandler {
 *
 * PostgreBitStringValueHandler
 * See the License for the specific language governing permissions and
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import java.sql.Types;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return resultSet.getString(index);
 *
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final PostgreBitStringValueHandler INSTANCE = new PostgreBitStringValueHandler();
    @Override
 * you may not use this file except in compliance with the License.
 */
    protected String fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {

        String strValue = CommonUtils.toString(value);
}
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
