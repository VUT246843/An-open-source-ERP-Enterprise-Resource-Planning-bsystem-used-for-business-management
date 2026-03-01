 * You may obtain a copy of the License at
                if (column instanceof DBCAttributeMetaData) {
import org.jkiss.dbeaver.model.sql.SQLConstants;

    public int size() {
        } else {
 *
                log.debug("Can't close array result set", e); //$NON-NLS-1$
                elementType = dataTypeProvider.getLocalDataType(Types.DOUBLE);
            throw new DBCException("Can't extract array data from JDBC array", e, session.getExecutionContext()); //$NON-NLS-1$
        } else if (array instanceof boolean[] || isBoxedObjectArray(array, Boolean.class)) {
                    return type.isInstance(element);
    @NotNull
                String typeName = dataTypeProvider.getDefaultDataTypeName(dataKind);
    }

    public Array getArrayValue() throws DBCException {
    private boolean modified;

            dataKind = DBPDataKind.NUMERIC;
        } catch (DBException e) {
            dataKind = DBPDataKind.NUMERIC;
 * distributed under the License is distributed on an "AS IS" BASIS,
            dataKind = DBPDataKind.STRING;
            if (elementType == null && array == null) {
                        baseTypeName = SQLUtils.stripColumnTypeModifiers(baseTypeName);
            if (elementType == null) {
    }
            try {
                        log.warn("Failed to clone value of type " + value.getClass().getName(), ex);

            return new JDBCCollection(session.getProgressMonitor(), elementType, elementValueHandler, null);
        // This probably was used for pretty-printing, we can't be sure now.
    //////////////////////////////////////////
            } else {
            )) {
            }
 * limitations under the License.
import org.jkiss.dbeaver.model.data.*;
import org.jkiss.dbeaver.Log;
            if (elementType == null) {
        String stringType = DBUtils.getDefaultDataTypeName(session.getDataSource(), DBPDataKind.STRING);
        } catch (DBException e) {
            @Nullable Object arrObject)
                // This may happen in case of multidimensional array
        if (elementType == null) {
    // Utilities
        DBDValueHandler valueHandler;
            }
        this.contents = contents;
        return new JDBCCollectionString(session.getProgressMonitor(), dataType, valueHandler, value);
import org.jkiss.dbeaver.model.DBPDataKind;
            if (arrayType != null) {
    }
        }

            try (DBCResultSet resultSet = JDBCResultSetImpl.makeResultSet(
                while (dbResult.next()) {
            try {
        DBSDataType elementType;
    @NotNull

                true
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCColumnMetaData;
        DBPDataTypeProvider dataTypeProvider = session.getDataSource();
import org.jkiss.dbeaver.model.exec.*;
            for (Object element : objectArray) {
                        DBSEntity docEntity = DBUtils.getEntityFromMetaData(session.getProgressMonitor(), session.getExecutionContext(), entityMetaData);
            dataKind = DBPDataKind.BOOLEAN;
        return type;
                }
        if (elementType == null) {
        return getItem(index);

            return SQLConstants.NULL_VALUE;

        for (int i = 0; i < arrLength; i++) {
    @NotNull
                session,
        } else {
            }
                dbResult,
    private static boolean isBoxedObjectArray(@Nullable Object array, @NotNull Class<?> type) {
        Object arrObject = array.getArray();
                dbResult.close();
                List<String> items = DBUtils.convertArrayStringToList(value);
            }
    }
        if (elementType == null) {
                    }
        if (elementType == null) {
            valueHandler = DBUtils.findValueHandler(session, dataType);
        // } else {
    public boolean isNull() {
    private static JDBCCollection makeCollectionFromJavaArray(
        } catch (DBException e) {
        }
                    if (entityMetaData != null) {
            }
        }
        if (isNull()) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    public int getItemCount() {
                            }
        if (dbResult == null) {
    @NotNull


    @Override
        return new JDBCCollection(monitor, type, valueHandler, contents);
                throw new DBCException("Can't resolve array element data type"); //$NON-NLS-1$

                    throw new DBCException(ex, session.getExecutionContext());
        return str.toString();
import org.jkiss.dbeaver.model.DBUtils;
        }
            if (column instanceof DBSTypedObjectEx) {
    }

        try {
 * you may not use this file except in compliance with the License.
            valueHandler = DBUtils.findValueHandler(session, elementType);
import org.jkiss.dbeaver.DBException;
                    } catch (DBCException ex) {
                this.contents[i] = value;
            Object item = contents[i];
        }
import org.jkiss.dbeaver.model.struct.*;
            SQLUtils.appendValue(str, type, itemString);
    }
                itemValue = makeCollectionFromJavaArray(session, elementType, elementValueHandler, item);
        str.append(brackets[1]);
import java.util.List;
            dataKind = DBPDataKind.OBJECT;
        if (array instanceof int[] || isBoxedObjectArray(array, Integer.class)) {
        } else {
        str.append(brackets[0]);
 * See the License for the specific language governing permissions and
            Object attr = contents[i];
            dataKind = DBPDataKind.NUMERIC;
        }
 * DBeaver - Universal Database Manager
            }
            }
        //     return valueHandler.getValueDisplayString(type, contents[0], format);
    @Override
                    // Array of unknown type.
                arrayType = ((DBSTypedObjectEx) column).getDataType();
            final DBDValueHandler elementValueHandler = DBUtils.findValueHandler(session, elementType);
    @NotNull
            if (elementType == null) {
            this.contents = null;
        }
        return makeCollectionFromJavaArray(session, elementType, elementValueHandler, arrObject);
        try {
        // }
                }

            return makeArrayString('{', '}');
            }
        } else if (array instanceof long[] || isBoxedObjectArray(array, Long.class)) {
            }
    @NotNull
                    }
        if (!CommonUtils.isEmpty(value)) {
                return connection.createArrayOf(dataType.getTypeName(), attrs);

                List<Object> data = new ArrayList<>();
                // Null array of unknown type. Just make NULL read-only array
        } catch (Throwable e) {
                            if (attribute instanceof DBSTypedObjectEx) {
        return contents[index];
                null,
        final DBSDataType dataType = getComponentType();
                throw new DBCException("Error resolving default data type", e);
            return DBConstants.NULL_VALUE_LABEL;
            if (array == null) {
                    arrayType = dataSource.resolveDataType(session.getProgressMonitor(), column.getFullTypeName());
            @NotNull JDBCSession session,

    }
        for (int i = 0; i < contents.length; i++) {
            valueHandler = session.getDataSource().getContainer().getDefaultValueHandler();
        // Try to divide on string elements

            elementType = dataTypeProvider.getLocalDataType(Types.BINARY);
 *
        JDBCDataSource dataSource = session.getDataSource();
package org.jkiss.dbeaver.model.impl.jdbc.data;
        }
            @NotNull DBDValueHandler elementValueHandler,
    }

    }
    @Override
                    // Fetch second column - it contains value
            elementType = dataTypeProvider.getLocalDataType(Types.DOUBLE);
            dataKind = DBPDataKind.NUMERIC;
public class JDBCCollection extends AbstractDatabaseList implements DBDValueCloneable {

                    return makeCollectionFromArray(session, array, elementType);
            final DBDValueHandler elementValueHandler = DBUtils.findValueHandler(session, elementType);
            elementType = dataTypeProvider.getLocalDataType(Types.FLOAT);
                elementType = arrayType.getComponentType(monitor);
                        }
                String defDataTypeName = dataSource.getDefaultDataTypeName(DBPDataKind.OBJECT);
        }
                return new JDBCCollection(session.getProgressMonitor(), elementType, elementValueHandler, null);
        ResultSet dbResult = array.getResultSet();
        }
    }
                }
/*
    }
            }
        try {
                    return makeCollectionFromJavaArray(session, array.getArray());
    @NotNull
        if (contents == null) {
        return new JDBCCollection(session.getProgressMonitor(), elementType, elementValueHandler, contents);
                return new JDBCCollectionString(session.getProgressMonitor(), dataType, valueHandler, value, items.toArray());
                        // Strip type name [Presto, #6025]
import java.util.Collection;
    public void setContents(Object[] contents) {
                if (value instanceof DBDValueCloneable) {
            } catch (SQLException e) {
        }
            dataKind = DBPDataKind.NUMERIC;
    public String makeArrayString(char ... brackets) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPDataTypeProvider dataTypeProvider = session.getDataSource();
    public static DBDCollection makeCollectionFromString(@NotNull JDBCSession session, String value) throws DBCException {
    public boolean isModified() {
                return new JDBCCollection(session.getProgressMonitor(), elementType, valueHandler, data.toArray());
                DBDValueHandler defValueHandler = session.getDefaultValueHandler();
    public JDBCCollection(@NotNull DBRProgressMonitor monitor, DBSDataType type, DBDValueHandler valueHandler, @Nullable Object[] contents) {
        }
                    elementType = dataTypeProvider.getLocalDataType(typeName);
        //
        if (array instanceof Object[] objectArray) {
            throw new DBCException("Can't extract array data from Java array", e); //$NON-NLS-1$

    @Override
            log.debug("Error getting array component type", e);
            if (item != null && item.getClass().isArray() && elementType.getDataKind() != DBPDataKind.ARRAY) {
        return contents == null ? 0 : contents.length;
                elementType = new JDBCDataType(session.getDataSource(), itemMeta);
    @Override
    }
import java.sql.*;
import org.jkiss.dbeaver.model.impl.data.AbstractDatabaseList;
        Object[] contents = new Object[arrLength];
            try {

    public static JDBCCollection makeCollectionFromArray(@NotNull JDBCSession session, @NotNull DBSTypedObject column, Array array) throws DBCException {
                if (typeName != null) {
            elementType = DBUtils.resolveDataType(session.getProgressMonitor(), session.getDataSource(), itemMeta.getTypeName());
                throw new DBCException("Error resolving default data type", e);
    @Override
    private DBSDataType type;
        this.type = type;
    @NotNull
            valueHandler = DBUtils.findValueHandler(session, itemMeta);
        } else if (array instanceof String[]) {
        } else {
        if (contents != null) {
        contents[index] = value;
/**
            dataKind = DBPDataKind.NUMERIC;
import java.math.BigDecimal;
    public DBSDataType getComponentType() {
    private Object[] contents;
                }
                try {
            contents[i] = itemValue;
            }

                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }


    @NotNull

import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
    public DBDValueHandler getComponentValueHandler() {
        DBDValueHandler valueHandler;
    public static JDBCCollection makeCollectionFromJavaArray(@NotNull JDBCSession session, Object array) throws DBCException {
                        elementType = dataSource.resolveDataType(monitor, baseTypeName);
            Object item = java.lang.reflect.Array.get(arrObject, i);
                return new JDBCArrayImpl(dataType.getTypeName(), dataType.getTypeID(), attrs);
            }
        DBPDataKind dataKind = DBPDataKind.OBJECT;
                        throw new DBCException(e, session.getExecutionContext());
        return valueHandler;
        } else if (array instanceof double[] || isBoxedObjectArray(array, Double.class)) {
    }
        } else if (array instanceof float[] || isBoxedObjectArray(array, Float.class)) {
        StringBuilder str = new StringBuilder(contents.length * 32);
    }
        contents = null;
        if (dataType == null) {
    }
                    if (baseTypeName != null) {
    private static final Log log = Log.getLog(JDBCCollection.class);

                DBSDataType defDataType = dataSource.getLocalDataType(defDataTypeName);
    }
    @Override
            }
 */
        }
        }
import org.jkiss.code.NotNull;
                                arrayType = ((DBSTypedObjectEx) attribute).getDataType();
import org.jkiss.dbeaver.model.DBPDataTypeProvider;
    public JDBCCollection() {
            throw new DBCException("Error creating struct", e);
    public static JDBCCollection makeCollectionFromJavaCollection(@NotNull JDBCSession session, @NotNull DBSTypedObject column, Collection<?> coll) throws DBCException {

        } finally {
            }
            elementType = dataTypeProvider.getLocalDataType(Types.TIMESTAMP);
        for (int i = 0; i < contents.length; i++) {
            this.contents = new Object[contents.length];
        }
        DBPDataKind dataKind;
                elementType = dataTypeProvider.getLocalDataType(Types.FLOAT);
    public Object getRawValue() {
        DBRProgressMonitor monitor = session.getProgressMonitor();
        } else if (array instanceof BigDecimal[]) {
            return null;
                    }
    {
        try {
    private DBDValueHandler valueHandler;
        if (isNull()) {
            if (i > 0) str.append(','); //$NON-NLS-1$

            if (arrayType == null) {
    @Override
                }
            if (attr instanceof DBDValue) {
            elementType = dataTypeProvider.getLocalDataType(Types.STRUCT);
                Object value = contents[i];
        }
                } catch (SQLException e) {
    }
    public String toString() {
    public Object getItem(int index) {
        }

                        value = ((DBDValueCloneable) value).cloneValue(monitor);
                return new JDBCCollection(monitor, defDataType, defValueHandler, null);
import org.jkiss.utils.CommonUtils;
    }

                itemValue = elementValueHandler.getValueFromObject(session, elementType, item, false, true);
    @Override


            }
    }
        return modified;
            elementType = dataTypeProvider.getLocalDataType(Types.DECIMAL);
    public DBDValueCloneable cloneValue(DBRProgressMonitor monitor) {
            throw new DBCException("JDBC array type was not resolved and result set was not provided by driver. Return NULL.");
        }
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCArrayImpl;
            elementType = dataTypeProvider.getLocalDataType(Types.BOOLEAN);
    @Override
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            }
        Object[] attrs = new Object[contents.length];
    }
                    DBCEntityMetaData entityMetaData = ((DBCAttributeMetaData) column).getEntityMetaData();
    @NotNull
            if (elementType == null) {

import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetImpl;
    public void release() {
                try {
            }
            return makeCollectionFromJavaArray(session, elementType, elementValueHandler, array);
            throw new DBCException("Can't extract array data from Java array", e); //$NON-NLS-1$
        } else if (array instanceof short[] || isBoxedObjectArray(array, Short.class)) {
            attrs[i] = attr;
            try {
 * Unless required by applicable law or agreed to in writing, software
            } catch (SQLException e) {

        return getItemCount();
            JDBCColumnMetaData itemMeta = new JDBCColumnMetaData(session.getDataSource(), dbResult.getMetaData(), 1);
            dataKind = DBPDataKind.DATETIME;
        // if (contents.length == 0) {

            elementType = dataTypeProvider.getLocalDataType(Types.BIGINT);
        Object itemValue;

                    try {
        if (array == null) {
        }
        // In any way, this makes interpreting empty and one-length arrays

    public Object get(int index) {
            } catch (Exception e) {
            if (value.startsWith("[") && value.endsWith("]")) {
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        DBSDataType arrayType = null, elementType = null;
        return contents == null;

                if (element != null) {
import org.jkiss.code.Nullable;
                } catch (SQLException ex) {
        } else if (array instanceof Date[]) {
            } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @NotNull DBSDataType elementType,
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setItem(int index, Object value) {
            dataKind = DBPDataKind.NUMERIC;
    @Override
            for (int i = 0; i < contents.length; i++) {
        // hard by eye, and some databases complain about malformed format.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }

                        if (docEntity != null) {
            }
        int arrLength = arrObject == null ? 0 : java.lang.reflect.Array.getLength(arrObject);
    @Override
 * Array holder
                    if (array == null) {
        this.valueHandler = valueHandler;
                }
                throw new DBCException("Error resolving data type", e);
                return makeCollectionFromResultSet(session, array, null);
                throw new DBCException("Can't resolve array element data type"); //$NON-NLS-1$
            log.debug("String data type '" + stringType + "' not supported by database");
 */
            elementType = dataTypeProvider.getLocalDataType(Types.SMALLINT);
        } else if (array instanceof byte[] || isBoxedObjectArray(array, Byte.class)) {
    private static JDBCCollection makeCollectionFromResultSet(@NotNull JDBCSession session, @NotNull Array array, @Nullable DBSDataType elementType) throws SQLException, DBException {
import java.util.ArrayList;
    @Override
                    data.add(valueHandler.fetchValueObject(session, resultSet, elementType, 1));
    }
        } else {
            elementType = dataTypeProvider.getLocalDataType(Types.INTEGER);

    }
            try {
            if (elementType == null) {
                            DBSEntityAttribute attribute = docEntity.getAttribute(session.getProgressMonitor(), ((DBCAttributeMetaData) column).getName());


            }
    /////////////////////////////////////////////////////////////////////////////////////
        final DBDValueHandler elementValueHandler = DBUtils.findValueHandler(session, elementType);
            return makeCollectionFromJavaArray(session, elementType, elementValueHandler, coll.toArray());
        this.modified = true;
        DBSDataType elementType = dataTypeProvider.getLocalDataType(Types.STRUCT);
    // List implementation
                if (arrayType == null) {
    }
            }
        DBSDataType dataType = DBUtils.getLocalDataType(session.getDataSource(), stringType);
                if (array != null) {
            }
        try (DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), dataType, "Create JDBC array")) {
                }
            } catch (Exception e) {
        return false;
            if (elementType != null) {
        return contents;
                }
                    elementType = dataTypeProvider.getLocalDataType(typeName);
            } catch (Exception e) {
            String itemString = valueHandler.getValueDisplayString(type, item, DBDDisplayFormat.NATIVE);
        }
                String typeName = dataTypeProvider.getDefaultDataTypeName(dataKind);
                if (typeName != null) {
}
            throws DBCException
        // } else if (contents.length == 1) {
                }
        modified = true;
    }
        } catch (DBException e) {
    }
            if (session instanceof Connection connection) {
        //     return "";
            elementType = dataTypeProvider.getLocalDataType(Types.VARCHAR);
                attr = ((DBDValue) attr).getRawValue();
    private static JDBCCollection makeCollectionFromArray(@NotNull JDBCSession session, @Nullable Array array, @NotNull DBSDataType elementType) throws SQLException, DBCException {

                    String baseTypeName = array.getBaseTypeName();
    /////////////////////////////////////////////////////////////////////////////////////
                    }
        try {

        }
            }
 *
