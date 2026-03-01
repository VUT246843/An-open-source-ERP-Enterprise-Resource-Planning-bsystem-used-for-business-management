                statement.setObject(paramIndex, value, paramType.getTypeID());

    protected Object fetchColumnValue(
        }
            String typeName = column.getTypeName();
    @Override
    @Override
 * See the License for the specific language governing permissions and
 *
            return value.toString();
}
import org.jkiss.dbeaver.model.DBValueFormatting;
    {
            }
        }
 * Handle STRUCT types.
        throws DBCException, SQLException
    @Override
import java.sql.SQLException;
        return object;
        } else if (value instanceof RowId) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

            if (object instanceof DBDObject) {
    public static final JDBCObjectValueHandler INSTANCE = new JDBCObjectValueHandler();
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCRowId;
                type.getTypeName());
        DBSTypedObject type,
        if (copy && object != null) {
    }
    private static final Log log = Log.getLog(JDBCObjectValueHandler.class);
 * limitations under the License.
        }
/**
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute)
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int index)
            statement.setRowId(paramIndex, ((JDBCRowId) value).getValue());
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
                statement.setObject(paramIndex, value);
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }


    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
import org.jkiss.dbeaver.model.data.DBDValue;
        if (format == DBDDisplayFormat.NATIVE) {
        if (value == null) {
            try {
import java.sql.RowId;
    {
 * JDBC Object value handler.
import java.sql.ResultSet;
                (ResultSet) value,
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * You may obtain a copy of the License at

        }
/*
    }
            value = new JDBCCursor(
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCursor;

    @Override
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.Log;
        if (value instanceof ResultSet) {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager
public class JDBCObjectValueHandler extends JDBCAbstractValueHandler {

 *
        throws DBCException, SQLException
                    return ((DBDValueCloneable) object).cloneValue(session.getProgressMonitor());
        if (value instanceof DBDValue) {
 */
 */

        Object value = resultSet.getObject(index);
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.data.DBDObject;
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
    {
        DBCSession session,
        } else if (value instanceof JDBCRowId) {
        Object value)
    @Override
        return Object.class;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            statement.setNull(paramIndex, paramType.getTypeID());
                return "'" + value + "'";
        } else {
    @NotNull
                if (object instanceof DBDValueCloneable) {
    protected void bindParameter(
                throw new DBCException("Can't copy object value " + object);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.data.DBDValueCloneable;
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)
        JDBCResultSet resultSet,
import org.jkiss.code.NotNull;
        DBSTypedObject paramType,
                (JDBCSession) session,
        int paramIndex,
        }
 * @author Serge Rider
        return DBValueFormatting.getDefaultValueDisplayString(value, format);
        JDBCSession session,
            value = new JDBCRowId((RowId) value);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        JDBCPreparedStatement statement,
            }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBConstants;


            }
import org.jkiss.dbeaver.model.exec.DBCException;
    {
        return value;
    {
                }
            if (value instanceof String && !((String) value).startsWith("'") && (typeName.equals(DBConstants.TYPE_NAME_UUID) || typeName.equals(DBConstants.TYPE_NAME_UUID2))) {
