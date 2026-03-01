    }
    }
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseArrayType;
            }
                    convertedItems.toArray()
    protected boolean useSetArray(@NotNull DBCSession session, @NotNull DBSTypedObject type) {
                || lowerCaseTypename.contains("uuid")
        if (object == null) {
                return true;
        boolean validateValue
        @NotNull DBSTypedObject type,
        } else if (object instanceof Array array && itemType.getName().startsWith("Tuple")) {
    ) throws DBCException {
        }
            case DATETIME:
                }
            return super.getValueFromObject(session, type, object, copy, validateValue);
            );
                valueHandler,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.sql.SQLConstants;
                    valueHandler,
        @NotNull DBCSession session,
        if (!DBUtils.isNullValue(value) && value instanceof JDBCCollection collection) {
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseTypeParser;

    @Override
        if (value.isEmpty() || value.equalsIgnoreCase(SQLConstants.NULL_VALUE)) {
    @NotNull
    ) throws DBCException, SQLException {
package org.jkiss.dbeaver.ext.clickhouse.model.data;
            case UNKNOWN:
            if (itemType instanceof ClickhouseArrayType arrayItemType) {
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;

                DBDValueHandler valueHandler = DBUtils.findValueHandler(session, arrayItemType);
            throw new IllegalStateException(e);
 * Unless required by applicable law or agreed to in writing, software
        @NotNull JDBCSession session,
                log.warn("Falling back to getString() for type " + type.getTypeName(), exception);
    @Override
        for (int index = 0; index < value.length(); index++) {
import org.jkiss.code.NotNull;

        if (arrayType == null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ) {
        @NotNull DBSDataType itemType,
                Object value = valueHandler.getValueFromObject(session, itemType, tuple, false, false);
                    } else {
            throw new DBCException("Array type " + arrayType.getFullTypeName() + " doesn't have a component type");
        } catch (DBException e) {
        }
                output.add(member);
    protected Object fetchColumnValue(
        } catch (SQLException exception) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBUtils;
    public static final ClickhouseArrayValueHandler INSTANCE = new ClickhouseArrayValueHandler();
    }
                );
 * See the License for the specific language governing permissions and

        }
    private static boolean isQuotingRequired(@NotNull DBSTypedObject type, @NotNull String value) {
                    if (item instanceof Collection<?> collectionItem) {
        } catch (DBCException | SQLException e) {
            arrayType = (ClickhouseArrayType) ClickhouseTypeParser.getType(
 *
            ArrayList<Object> tuples = new ArrayList<>();
        int index
    ) {
                itemType,

    ) {
            return makeCollectionFromTupleArray(session, itemType, array);
    protected boolean convertSingleValueToArray() {
import java.sql.Array;
                    final DBDValueHandler componentHandler = collection.getComponentValueHandler();


        @NotNull DBCSession session,

            return new JDBCCollection(
    @Override
    }
        }
        } catch (DBException e) {
                break;
            );
    ) {
                if (item instanceof DBDCollection) {
            }
        Object value,
                } else {
                (ClickhouseDataSource) session.getDataSource(),
    protected boolean useGetArray(@NotNull DBCSession session, @NotNull DBSTypedObject type) {
        @NotNull DBDValueHandler handler,

        DBSDataType itemType = arrayType.getComponentType(session.getProgressMonitor());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    itemType,

    @NotNull
                        DBDValueHandler valueHandler = DBUtils.findValueHandler(session, arrayItemType);
                    collection.toArray()
        try {
    ) throws DBCException {
        }
    public String getValueDisplayString(
        if (itemType == null) {
                type.getFullTypeName()
                || lowerCaseTypename.contains("ipv6")
public class ClickhouseArrayValueHandler extends JDBCArrayValueHandler {

            String lowerCaseTypename = type.getTypeName().toLowerCase();
                List<Object> convertedItems = new ArrayList<>(collection.size());
                        convertedItems.add(makeCollectionFromNestedJavaCollection(session, arrayItemType, collectionItem));
/*
        // Remove after https://github.com/ClickHouse/clickhouse-java/issues/2711 is fixed
                    arrayItemType.getComponentType(session.getProgressMonitor()),
            for (Object tuple : (Object[]) array.getArray()) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.data.DBDCollection;
            } else {


        return false;
    @Override
        return arrayType;
                throw exception;
                    session.getProgressMonitor(),
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
    public static final String ARRAY_DELIMITER = ",";

            if (QUOTED_CHARS.contains(value.charAt(index))) {
                DBDValueHandler valueHandler = DBUtils.findValueHandler(session, itemType);
        try {
    private Object makeCollectionFromNestedJavaCollection(
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            case ARRAY:
            return super.fetchColumnValue(session, resultSet, type, index);
            for (int i = 0; i < collection.getItemCount(); i++) {
                            valueHandler.getValueFromObject(session, arrayItemType, item, false, true)
                );
 * distributed under the License is distributed on an "AS IS" BASIS,

        if (DBUtils.isNullValue(value)) {
 *
                tuples.add(value);
            throw new DBCException("Can't extract array data from Java array", e);
            final StringJoiner output = new StringJoiner(ARRAY_DELIMITER, "[", "]");
import org.jkiss.dbeaver.model.data.DBDValueHandler;


            return SQLConstants.NULL_VALUE;
            }
            // Tuples are represented as Object[] and need to be handled separately to avoid confusion with nested arrays
    @NotNull
                        convertedItems.add(
    }
        return true;
                return true;
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseDataSource;
    public Object getValueFromObject(
    @Override

        }
        @NotNull DBSTypedObject type,
        return string;
            throw new DBCException("Can't resolve array data type " + type.getFullTypeName());
                }
        @Nullable Object value,

        @NotNull DBSTypedObject type
            }

        return super.getValueDisplayString(column, value, format);
    @NotNull
                        );
                    final DBSDataType componentType = collection.getComponentType();
        @NotNull DBDDisplayFormat format
    }
    @NotNull
    public static final Set<Character> QUOTED_CHARS = Set.of('[', ']', '"', ' ', '\\');
            case STRING:
                return new JDBCCollection(
 *
import org.jkiss.dbeaver.model.struct.DBSDataType;
            throw new DBCException("Can't resolve array data type " + type.getFullTypeName());
            } else {

    }
import org.jkiss.dbeaver.model.exec.DBCException;
    }
    @Override
        try {
            return makeCollectionFromNestedJavaCollection((JDBCSession) session, itemType, list);

        @NotNull JDBCResultSet resultSet,
            if (lowerCaseTypename.contains("ipv4")
        }
        ClickhouseArrayType arrayType = getArrayType(session, type);
}
                session.getProgressMonitor(),
                tuples.toArray()
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCArrayValueHandler;
            return output.toString();
                    valueHandler,
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBSTypedObject type,
        return super.getValueFromObject(session, type, object, copy, validateValue);
        @NotNull DBSDataType itemType,
        try {
                session.getProgressMonitor(),
        }
        Collection<?> collection
                return new JDBCCollection(
        @NotNull DBCSession session,
            return '\'' + string.replaceAll("[\\\\\"]", "\\\\$0") + '\'';
        @NotNull DBSTypedObject column,

                final Object item = collection.getItem(i);
    private static final Log log = Log.getLog(ClickhouseArrayValueHandler.class);
import java.util.*;
        if (object instanceof List<?> list) {
    }
    private static String getArrayMemberDisplayString(

            case NUMERIC:
                return getValueFromObject(session, type, resultSet.getString(index), false, false);
                return false;
import org.jkiss.dbeaver.DBException;
 */
                final String member;
        return true;

                    member = getArrayMemberDisplayString(column, this, item, format);
        final String string = handler.getValueDisplayString(type, value, format);

        }
import org.jkiss.dbeaver.Log;
            }
                    session.getProgressMonitor(),
        }
        }
            default:
        Object object,
 * limitations under the License.
    }
        boolean copy,
        @NotNull DBCSession session,
        DBDValueHandler valueHandler = DBUtils.findValueHandler(session, itemType);
        ClickhouseArrayType arrayType;
                    member = getArrayMemberDisplayString(componentType, componentHandler, item, format);
        if (isQuotingRequired(type, string)) {
        }
        switch (type.getDataKind()) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        @NotNull Array array
    private Object makeCollectionFromTupleArray(

    private ClickhouseArrayType getArrayType(
                    }
        }

import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.code.Nullable;
    }
            return true;
        return value.contains(ARRAY_DELIMITER);
                || lowerCaseTypename.contains("map")
                for (Object item : collection) {
import java.sql.SQLException;

        @NotNull DBDDisplayFormat format
    ) throws DBCException {
