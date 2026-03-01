        if (object == null) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBUtils;
        } catch (DBException e) {
        }
            return new JDBCCompositeStatic(session, dataType, (Struct) object);
        try {
            }
    public static final JDBCStructValueHandler INSTANCE = new JDBCStructValueHandler();
        if (dataType == null) {
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
        }
import org.jkiss.dbeaver.model.DBValueFormatting;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    @Override
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (SQLException e) {
            }
 */
            if (format == DBDDisplayFormat.UI) {
            } else {
 *
            }
 * you may not use this file except in compliance with the License.
            return ((JDBCComposite) value).getStringRepresentation();
import java.sql.Types;
            } else {
        throws DBCException, SQLException
 * @author Serge Rider
                statement.setNull(paramIndex, Types.STRUCT);
        String typeName;
        if (object instanceof JDBCComposite) {

    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute)
                typeName = type.getTypeName();
 *
    @Override
     * NumberFormat is not thread safe thus this method is synchronized.
        if (value == null) {
        DBSTypedObject paramType,
    {
    {

                statement.setObject(paramIndex, struct.getRawValue());
import org.jkiss.dbeaver.model.impl.jdbc.data.*;
            }
        }
    {
            return new JDBCCompositeStatic(session, dataType, new JDBCStructImpl(dataType.getTypeName(), null, ""));
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
            throw new DBCException("Struct parameter type '" + value.getClass().getName() + "' not supported");
                return new JDBCCompositeDynamic(session, (Struct) object, null);
    }
import org.jkiss.dbeaver.model.data.DBDComposite;
            return new JDBCCompositeMap(session, dataType, (Map<?,?>) object);
            dataType = DBUtils.resolveDataType(session.getProgressMonitor(), session.getDataSource(), typeName);
                statement.setObject(paramIndex, ((JDBCComposite) struct).getStructValue(), Types.STRUCT);
        } else if (object instanceof Map) {

        } else {
    @Override
        } else {
 *
import org.jkiss.dbeaver.model.data.DBDValueHandlerComposite;
import org.jkiss.dbeaver.model.struct.DBSDataType;
        } else if (object instanceof Struct) {
            if (object instanceof Struct) {
        }
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.exec.DBCSession;
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
        JDBCPreparedStatement statement,

import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
            DBDComposite struct = (DBDComposite) value;
    public synchronized String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)

    @NotNull
import org.jkiss.dbeaver.DBException;
        DBSDataType dataType = null;

        }

            }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            } else {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            if (struct.isNull()) {
        } else {
            return new JDBCCompositeUnknown(session, object);
public class JDBCStructValueHandler extends JDBCComplexValueHandler implements DBDValueHandlerComposite {
            throw new DBCException(e, session.getExecutionContext());
 * Unless required by applicable law or agreed to in writing, software
            } else if (struct instanceof JDBCComposite) {
            return DBValueFormatting.getDefaultValueDisplayString(value, format);
    @NotNull
    protected void bindParameter(

            return copy ? ((JDBCComposite) object).cloneValue(session.getProgressMonitor()) : object;
 * JDBC Struct value handler.
        if (value instanceof JDBCComposite) {
 * Handle STRUCT types.
            log.debug("Error resolving data type '" + typeName + "'", e);
            statement.setNull(paramIndex, Types.STRUCT);
                typeName = ((Struct) object).getSQLTypeName();

import java.sql.Struct;
}        int paramIndex,
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructImpl;
    private static final Log log = Log.getLog(JDBCStructValueHandler.class);


    }
import java.util.Map;
        Object value)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/**
 */
import org.jkiss.code.NotNull;
            if (DBUtils.isNullValue(value)) {
        } else if (value instanceof DBDComposite) {
        JDBCSession session,
    @Override
 *
        }
                return DBValueFormatting.getDefaultValueDisplayString(value, format);
import java.sql.SQLException;
        try {
        return JDBCComposite.class;
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
    }
                return new JDBCCompositeUnknown(session, object);
            if (object instanceof Struct) {
        }
