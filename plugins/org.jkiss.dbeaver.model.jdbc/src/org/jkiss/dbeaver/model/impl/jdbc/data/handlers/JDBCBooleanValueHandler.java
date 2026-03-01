        } else if (object instanceof Number) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * JDBC number value handler
        } else if (object instanceof String) {
/**

import org.jkiss.code.NotNull;
    }

        if (object == null) {
            return object;
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
        } else if (value instanceof Boolean) {
    @Override
        } else if (object instanceof Boolean) {
 */
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    {
            log.warn("Unrecognized type '" + object.getClass().getName() + "' - can't convert to boolean");
        return Boolean.class;
            statement.setBoolean(paramIndex, ((Number)value).byteValue() != 0);
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType,
 * See the License for the specific language governing permissions and
}        return false;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * limitations under the License.
    public Object generateDefaultValue(DBCSession session, DBSTypedObject type) {
    }
            return null;


 */
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Class<Boolean> getValueObjectType(@NotNull DBSTypedObject attribute)
 * You may obtain a copy of the License at
    @Override
        boolean value = resultSet.getBoolean(index);
    public static final JDBCBooleanValueHandler INSTANCE = new JDBCBooleanValueHandler();
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index)
        throws SQLException
        return resultSet.wasNull() ? null : value;
            return null;
    @Override

import java.sql.SQLException;

            statement.setBoolean(paramIndex, (Boolean)value);

    @Override
    private static final Log log = Log.getLog(JDBCBooleanValueHandler.class);
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
        return "False";
        if (value == null) {
            return ((Number) object).byteValue() != 0;

    @Override
import org.jkiss.dbeaver.Log;
            statement.setNull(paramIndex, paramType.getTypeID());

 *
    }
        }
 * DBeaver - Universal Database Manager
 *
        } else if (value instanceof Number) {
public class JDBCBooleanValueHandler extends JDBCAbstractValueHandler implements DBDValueDefaultGenerator {
    @Override
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    {

        } else {
import org.jkiss.dbeaver.model.exec.DBCException;
        } else {
        }
            statement.setBoolean(paramIndex, Boolean.valueOf(value.toString()));
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    @NotNull
import org.jkiss.dbeaver.model.data.DBDValueDefaultGenerator;
    public String getDefaultValueLabel() {
            return Boolean.valueOf((String)object);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    {
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                                 int paramIndex, Object value) throws SQLException
    }
