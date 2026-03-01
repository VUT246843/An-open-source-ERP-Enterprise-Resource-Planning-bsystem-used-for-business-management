 *
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;

 * you may not use this file except in compliance with the License.

 *
    {
 * Handle ARRAY types.
    @NotNull
import java.util.Collection;
/*
    @Override
        } else if (value instanceof DBDCollection) {
    }
        int paramIndex,
            return JDBCCollection.makeCollectionFromArray((JDBCSession) session, type, array);
                final Object arrayValue = collection.getRawValue();
            } else {
 * See the License for the specific language governing permissions and
    {
        JDBCSession session,
        } else {
    protected boolean useSetArray(@NotNull DBCSession session, @NotNull DBSTypedObject type) {
        if (value instanceof JDBCCollection col) {
            } else {
            throw new DBCException("Array parameter type '" + value.getClass().getName() + "' not supported");
        return false;
            }
                }
                if (useSetArray(session, paramType)) {
    public Object createNewValueObject(@NotNull DBCSession session, @NotNull DBSTypedObject type) throws DBCException {
            if (componentType == null) {
            throw new DBCException("Error creating JDBC array " + type.getFullTypeName());
    protected void bindParameter(
        }

                    statement.setObject(paramIndex, arrayValue);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Class<DBDCollection> getValueObjectType(@NotNull DBSTypedObject attribute)
 * You may obtain a copy of the License at
    @Override
            return JDBCCollection.makeCollectionFromArray((JDBCSession) session, type, null);
        } catch (Exception e) {
            statement.setNull(paramIndex, Types.ARRAY);
                    statement.setArray(paramIndex, arrayValue);
        DBSTypedObject paramType,
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
 * limitations under the License.
            return super.fetchColumnValue(session, resultSet, type, index);
import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
import org.jkiss.dbeaver.model.struct.DBSDataType;
                return JDBCCollection.makeCollectionFromString((JDBCSession) session, CommonUtils.toString(object));

    @Override
        } else {
        } else if (object.getClass().isArray()) {
import java.sql.SQLException;
            return object;
import org.jkiss.code.NotNull;
                }
        }
            DBDCollection collection = (DBDCollection) value;
                statement.setNull(paramIndex, Types.ARRAY);

        try {
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    public static final JDBCArrayValueHandler INSTANCE = new JDBCArrayValueHandler();
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                } else {
        JDBCPreparedStatement statement,
        } else if (object instanceof JDBCCollection col) {
    @Override
                throw new DBCException("Can't determine component data type from " + dataType.getFullTypeName());
    }
public class JDBCArrayValueHandler extends JDBCComplexValueHandler {
            return col.makeArrayString('{', '}');
        if (useGetArray(session, type)) {
                    statement.setObject(paramIndex, arrayValue, Types.ARRAY);
    }
 * JDBC Array value handler.
        if (value == null) {
    }
        } else {
                } else {
        } else if (object instanceof Array array) {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCException;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return false;
        Object value)
        if (object == null) {
    }
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)
        } else if (convertSingleValueToArray()) {
        if (type instanceof DBSDataType) {
 */
            }
                final Array arrayValue = ((JDBCCollection) collection).getArrayValue();
        } else if (object instanceof Collection<?> col) {
        }
import org.jkiss.dbeaver.model.data.DBDCollection;
            return JDBCCollection.makeCollectionFromJavaArray((JDBCSession) session, object);
            return getValueFromObject(session, type, resultSet.getArray(index), false, false);
        }
    protected boolean useGetArray(@NotNull DBCSession session, @NotNull DBSTypedObject type) {
                    statement.setArray(paramIndex, (Array) arrayValue);
 * Unless required by applicable law or agreed to in writing, software
                if (useSetArray(session, paramType) && arrayValue instanceof Array) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected boolean convertSingleValueToArray() {

import java.sql.Array;

 */
            if (object instanceof String string) {
 * @author Serge Rider
            Array array = ((JDBCSession) session).createArrayOf(componentType.getFullTypeName(), new Object[0]);
    @Override
    }
    {

            return (JDBCCollection)(copy ? col.cloneValue(session.getProgressMonitor()) : col);
            dataType = (DBSDataType) type;
        }
            return JDBCCollection.makeCollectionFromJavaCollection((JDBCSession) session, type, col);

        }
 *
        } else {
        } else if (type instanceof DBSTypedObjectEx) {
    {
/**
            return getValueFromObject(session, type, array, false, false);
            dataType = ((DBSTypedObjectEx) type).getDataType();
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            if (collection.isNull()) {
import java.sql.Types;

package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
                return JDBCCollection.makeCollectionFromString((JDBCSession) session, string);
    @Override
        return DBDCollection.class;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        throws DBCException, SQLException
        DBSDataType dataType;
        return true;

            DBSDataType componentType = dataType.getComponentType(session.getProgressMonitor());
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @NotNull
    }

            } else if (collection instanceof JDBCCollection) {
        return super.getValueDisplayString(column, value, format);

            throw new DBCException("Can't determine array element data type: " + type.getFullTypeName());
