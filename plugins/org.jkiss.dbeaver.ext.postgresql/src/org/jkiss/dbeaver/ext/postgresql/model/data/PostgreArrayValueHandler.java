
import java.sql.Types;
import org.jkiss.dbeaver.Log;
    }
        @NotNull DBDValueHandler handler,
import org.jkiss.dbeaver.model.DBUtils;
                            DBUtils.findValueHandler(session, itemType),
        }
import org.jkiss.dbeaver.ext.postgresql.PostgreValueParser;

                } else {
        }
            case NUMERIC:
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                        );
    @Override
 * PostgreArrayValueHandler
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
        if (object != null) {
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
            }
            return '"' + string.replaceAll("[\\\\\"]", "\\\\$0") + '"';
            return SQLConstants.NULL_VALUE;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            switch (value.charAt(index)) {
import java.util.StringJoiner;
            }
                    return convertStringArrayToCollection(session, arrayType, itemType, strValue);
                    DBUtils.findValueHandler(session, itemType),
                    } else {

import org.jkiss.dbeaver.model.sql.SQLConstants;
import java.sql.SQLException;


 *
                    String strValue = object.toString();
        if (format != DBDDisplayFormat.NATIVE && isQuotingRequired(type, string)) {
            statement.setObject(paramIndex, getValueDisplayString(paramType, value, DBDDisplayFormat.NATIVE), Types.OTHER);
/**
            log.error("Can't parse array");
                        return convertStringArrayToCollection(session, arrayType, itemType, stringValue);
            PostgreDataType itemType = arrayType.getElementType(session.getProgressMonitor());
                    member = getArrayMemberDisplayString(componentType, componentHandler, item, format);
                        log.error("Can't parse array");
            }
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
            return new JDBCCollection(session.getProgressMonitor(), itemType, DBUtils.findValueHandler(session, itemType), new Object[]{parsedArray});
                default:
                    }
        @Nullable Object value,
    private static String getArrayMemberDisplayString(
        }
                PostgreUtils.getArrayDelimiter(collection.getComponentType()), "{", "}");

        @NotNull DBSTypedObject type,
                case '{':
    }
 */
        Object object,
            if (itemType == null) {
    public Object getValueFromObject(
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        @NotNull DBDDisplayFormat format
import org.jkiss.dbeaver.model.data.DBDValue;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * Unless required by applicable law or agreed to in writing, software
            if (object instanceof String ||
        if (DBUtils.isNullValue(value)) {
            return new JDBCCollection(session.getProgressMonitor(), itemType, DBUtils.findValueHandler(session, itemType), (Object[]) parsedArray);
    }
                            value == null ? null : new Object[] {value}
    ) {
                    session.getProgressMonitor(),
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
                }
            default:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                } else {
        switch (type.getDataKind()) {
            final PostgreDataType arrayType = PostgreUtils.findDataType(session, dataSource, type);

import org.jkiss.dbeaver.model.exec.DBCException;
            boolean isPgObject = PostgreUtils.isPgObject(dataSource, object);
public class PostgreArrayValueHandler extends JDBCArrayValueHandler {
        boolean copy,
                if (className.equals(PostgreConstants.PG_ARRAY_CLASS)) {
                className.equals(PostgreConstants.PG_ARRAY_CLASS)) {
        if (parsedArray instanceof Object[]){

    @Override
 */
        for (int index = 0; index < value.length(); index++) {
        } else {

                    member = getArrayMemberDisplayString(column, this, item, format);
                    // Convert arrays to string representation (#7468)
                throw new DBCException("Array type " + arrayType.getFullTypeName() + " doesn't have a component type");
        if (value instanceof DBDCollection && !((DBDValue) value).isNull()) {
                final String member;

        }
        }
                    return convertStringArrayToCollection(session, arrayType, itemType, (String) object);
                    break;
            }
                return false;
                final Object item = collection.getItem(i);
            String className = object.getClass().getName();
    }
        return super.getValueDisplayString(column, value, format);
     * @see <a href="https://www.postgresql.org/docs/current/arrays.html#ARRAYS-IO">8.15.6. Array Input and Output Syntax</a>

    @Override
                        return new JDBCCollection(
/*
import org.jkiss.dbeaver.model.exec.DBCSession;
        Object parsedArray = PostgreValueParser.convertStringToValue(session, arrayType, strValue);
    }
        return string;
    /**
     */
                case '}':
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                case '"':
 * limitations under the License.
                case '\\':
        return super.fetchColumnValue(session, resultSet, type, index);
        }
    private static final Log log = Log.getLog(PostgreArrayValueHandler.class);
 * DBeaver - Universal Database Manager
                    final Object value = PostgreUtils.extractPGObjectValue(object, dataSource);
 * See the License for the specific language governing permissions and
                    final DBDValueHandler componentHandler = collection.getComponentValueHandler();
                }
            if (arrayType == null) {
    ) throws DBCException {

                    objects
    }
        if (!DBUtils.isNullValue(value) && value instanceof DBDCollection collection) {
        return value.contains(PostgreUtils.getArrayDelimiter(type));
            return output.toString();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
                    return true;
    private static boolean isQuotingRequired(@NotNull DBSTypedObject type, @NotNull String value) {
                    itemType,
                    if (value instanceof String stringValue) {
package org.jkiss.dbeaver.ext.postgresql.model.data;
            }
        }
 * You may obtain a copy of the License at
        }
    @NotNull
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCArrayValueHandler;
            final StringJoiner output = new StringJoiner(
                );
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
import org.jkiss.code.NotNull;

 * you may not use this file except in compliance with the License.

    @NotNull
                throw new DBCException("Can't resolve data type " + type.getFullTypeName());
                            session.getProgressMonitor(), itemType,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            super.bindParameter(session, statement, paramType, paramIndex, value);
    }
}
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
            PostgreDataSource dataSource = (PostgreDataSource) session.getDataSource();
 *
        } else {
    private JDBCCollection convertStringArrayToCollection(@NotNull DBCSession session, @NotNull PostgreDataType arrayType, @NotNull PostgreDataType itemType, @NotNull String strValue) throws DBCException {
import org.jkiss.dbeaver.model.data.DBDCollection;
                    // Otherwise we may have problems with domain types decoding (as they come in form of PgObject)
                return new JDBCCollection(
            for (int i = 0; i < collection.getItemCount(); i++) {
                isPgObject ||
        final String string = handler.getValueDisplayString(type, value, format);
        }
            } else if (object instanceof Object[] objects) {

                } else if (isPgObject) {
        if (value.isEmpty() || value.equalsIgnoreCase(SQLConstants.NULL_VALUE)) {
            return true;

        @NotNull DBSTypedObject type,
                output.add(member);
                if (item instanceof DBDCollection) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    final PostgreDataType componentType = (PostgreDataType) collection.getComponentType();
        @NotNull DBCSession session,
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        return super.getValueFromObject(session, type, object, copy, validateValue);
    public static final PostgreArrayValueHandler INSTANCE = new PostgreArrayValueHandler();

 *     http://www.apache.org/licenses/LICENSE-2.0



        boolean validateValue
                case ' ':
                break;
            case ARRAY:
