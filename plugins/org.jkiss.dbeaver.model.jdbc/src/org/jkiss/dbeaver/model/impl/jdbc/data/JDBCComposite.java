
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.data.DBDComposite;
    protected DBSEntityAttribute[] attributes;
    private final Struct rawStruct;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.DBPDataKind;
            return Arrays.toString(values);

    {
        @Override
    public boolean isModified() {
                i++;
        }
                setValueType(Types.OTHER);
            return (StructType) type;
            return dataKind;
        }
                setValueType(Types.VARCHAR);
            return str.toString();

    }
        public DBPDataSource getDataSource() {
    @Nullable
    public Object getAttributeValue(@NotNull DBSAttributeBase attribute) {
    {
        try (DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), dataType, "Create JDBC struct")) {
            if (value instanceof DBDValueCloneable) {
            setOrdinalPosition(index);
        public boolean equals(Object obj) {
    protected boolean modified;
        }
            setName(name);
    protected static class StructAttribute extends AbstractAttribute implements DBSEntityAttribute {
        public DBPDataKind getDataKind()
        private String makeStructString() throws SQLException
 * Unless required by applicable law or agreed to in writing, software
        }
            this.values[i] = value;
    public String toString() {
        }
        @Override
                metaData.getColumnName(index + 1),
        public StructAttribute(DBSDataType type, int index, Object value) throws DBException {
                if (!DBUtils.isNullValue(value)) {
            } else {

            log.debug("Index for attribute '" + attribute.getName() + "' is out of range (" + position + ">=" + values.length + ")");
        if (!ArrayUtils.isEmpty(values)) {
        }
        public DBPDataKind getDataKind() {
    }
        final DBSDataType dataType = getDataType();
    public Struct getStructValue() throws DBCException {
    public DBSDataType getDataType()
                (typeName == null ? 0 : typeName.hashCode()) +
import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;
        @Override

        public StructAttribute(String name, DBSDataType type, int index, Object value) throws DBException {
            return CommonUtils.equalObjects(name, attr.name) &&

    @Override
                    return false;
                attr = ((DBDValue) attr).getRawValue();
        }
    }
 *
    public Object[] getValues() {
        }
            DBUtils.releaseValue(value);
            String typeName = getTypeName();
            return (int) ((name == null ? 0 : name.hashCode()) +
import org.jkiss.dbeaver.model.exec.DBCSession;
            return getStructValue();
    @NotNull
            StringBuilder str = new StringBuilder(200);
    protected DBSDataType type;
        @NotNull
                    String strValue = valueHandler.getValueDisplayString(attr, item, DBDDisplayFormat.UI);

        @NotNull
                DBSEntityAttribute attr = attributes[i1];
 * See the License for the specific language governing permissions and
                dataKind = DBPDataKind.ARRAY;
    }
        for (Object value : values) {
import java.util.Date;

        public StructAttribute(DBSDataType type, ResultSetMetaData metaData, int index) throws SQLException
        return rawStruct == null;
        int position = attribute.getOrdinalPosition();
            return "Object";
                metaData.getPrecision(index + 1),
                metaData.getColumnDisplaySize(index + 1),
        this.type = struct.type;
            return Arrays.asList(attributes);
                index,
        @Override
            this.modified = true;
 * You may obtain a copy of the License at
        public int hashCode() {
        for (int i = 0; i < values.length; i++) {
        DBPDataKind dataKind;
            log.error(e);

import org.jkiss.code.NotNull;
        }
        this.values = new Object[struct.values.length];
        @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBSEntityAttribute attribute = DBUtils.findObject(attributes, attrName);
    {

        }
                dataKind = DBPDataKind.BOOLEAN;
import org.jkiss.dbeaver.model.struct.*;
        for (int i = 0; i < struct.values.length; i++) {
                dataKind = DBPDataKind.OBJECT;

        }
    @Override
            str.append(")");
                if (DBUtils.isNullValue(item)) {
    @Override
                //str.append(entry.getKey().getName()).append(':');
    /*
            if (!(obj instanceof StructAttribute attr)) {
    public Struct getRawValue() {
            Object value = struct.values[i];
            } else if (value instanceof Date) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        return type;
                setValueType(Types.STRUCT);
        @NotNull
        }
            this.values[attribute.getOrdinalPosition()] = value;
                setValueType(Types.BOOLEAN);
            Object attr = values[i];

    }
import org.jkiss.utils.CommonUtils;
                setValueType(Types.NUMERIC);
                dataKind = DBPDataKind.STRING;
        }
            this("Attr" + index, type, index, value);
        }

}

        public DBSEntity getParentObject() {
        {
            this.type = type;
        return getStringRepresentation();
            str.append(typeName);
        }
            }
    {
 * abstract struct implementation.
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    @Override
        {
            return null;
        @NotNull

        if (rawStruct != null) {
        @Override

    public void release()
            this.type = type;
        }
 *
                }

        @Override
public abstract class JDBCComposite implements DBDComposite, DBDValueCloneable {
            return rawStruct;
import org.jkiss.dbeaver.DBException;
            for (int i1 = 0; i1 < attributes.length; i1++) {
                CommonUtils.equalObjects(typeName, attr.typeName) &&


                dataKind = DBPDataKind.NUMERIC;
        }
            return DBSEntityType.TYPE;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Arrays;
    @Override
                    break;
    }

    }

    @Nullable
        public String getTypeName() {
import org.jkiss.dbeaver.Log;

                maxLength == attr.maxLength &&
        }
    protected JDBCComposite(@NotNull DBRProgressMonitor monitor, @NotNull JDBCComposite struct) throws DBCException {
        }
                if (i >= MAX_ITEMS_IN_STRING) {
/*
        } catch (Throwable e) {
            return type.getDataSource();
import org.jkiss.dbeaver.model.data.DBDValueCloneable;
        this(struct.rawStruct);
        return CommonUtils.toString(getRawValue());

        if (position >= values.length) {
        if (rawStruct != null) {
import org.jkiss.dbeaver.model.DBUtils;
    }


            } else if (value instanceof byte[]) {
                dataKind = DBPDataKind.BINARY;
        public List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) {
            }
        Object[] attrs = new Object[values.length];
        }
    @Override
import org.jkiss.dbeaver.model.impl.struct.AbstractStructDataType;
        public StructType(DBPDataSource dataSource) {
    protected Object[] values;
    */
            return Types.STRUCT;
        } catch (Throwable e) {
package org.jkiss.dbeaver.model.impl.jdbc.data;
        return attribute == null ? null : getAttributeValue(attribute);
    }
        return values;

        }
            if (attr instanceof DBDValue) {
        this.rawStruct = rawStruct;
                valueType + maxLength + scale + precision +
                dataKind = DBPDataKind.STRUCT;
        {
            }
            } else if (value instanceof JDBCCollection) {
        @NotNull
        }
    }
 * limitations under the License.
                }
            return null;
                metaData.getColumnType(index + 1),

 * you may not use this file except in compliance with the License.

        }
import org.jkiss.dbeaver.model.data.DBDValue;
    }
            str.append("(");
                ordinalPosition == attr.ordinalPosition;
    @NotNull
    }
                setValueType(Types.TIMESTAMP);
        @Override
    }

            attrs[i] = attr;
                setValueType(Types.BINARY);
    public DBSAttributeBase[] getAttributes()
import java.sql.*;
import org.jkiss.dbeaver.model.exec.DBCException;
                dataKind = DBPDataKind.DATETIME;
    public boolean isNull() {
    public String getStringRepresentation()
                }
    }
        public String getDefaultValue() {
                scale == attr.scale &&
/**
            return DBPDataKind.STRUCT;
            return null;


                ordinalPosition);
        return values[position];
            }
            for (Object value : values) {

        }


            return rawStruct;

        final DBSDataType type;
                return false;
        public DBSEntityType getEntityType() {
                    DBDValueHandler valueHandler = DBUtils.findValueHandler(dataSource, attr);
                    str.append("NULL");
    @NotNull
    public String getTypeName()
            setTypeName(dataKind.name());
    public JDBCComposite(@Nullable Struct rawStruct) {

                metaData.isNullable(index + 1) == ResultSetMetaData.columnNoNulls,
                } else {
                valueType == attr.valueType &&
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructImpl;
        return modified;
                metaData.getColumnTypeName(index + 1),
            } else if (value instanceof JDBCComposite) {
        @Override
    @Override
 * DBeaver - Universal Database Manager
        if (values != null) {
            dataKind = JDBCUtils.resolveDataKind(type.getDataSource(), getTypeName(), getTypeID());
    private static final Log log = Log.getLog(JDBCComposite.class);
        return type.getTypeName();
            if (value instanceof CharSequence) {

                value = ((DBDValueCloneable)value).cloneValue(monitor);
import java.util.List;
                if (i > 0) str.append(",");
 */
        @Override
    {
            } else if (value instanceof Number) {
    }
    protected class StructType extends AbstractStructDataType<DBPDataSource> implements DBSEntity {
        @Nullable
            super(
import org.jkiss.utils.ArrayUtils;
    }
                return ((Connection) session).createStruct(dataType.getTypeName(), attrs);
                    SQLUtils.appendValue(str, attr, strValue);
            if (session instanceof Connection) {
        this.attributes = Arrays.copyOf(struct.attributes, struct.attributes.length);
                setValueType(Types.ARRAY);
        return attributes;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
    }
        if (!CommonUtils.equalObjects(values[attribute.getOrdinalPosition()], value)) {
        public int getTypeID() {
            throw new DBCException("Error creating struct", e);
    @Override
 *
            } else {
        @NotNull
    }

        @Override
    public void setAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) throws DBCException {
            }
            super(dataSource);
            int i = 0;
        }
        }
                return new JDBCStructImpl(dataType.getTypeName(), attrs, getStringRepresentation());
    public Object getAttributeValue(@NotNull String attrName) throws DBCException {
        try {
 * distributed under the License is distributed on an "AS IS" BASIS,
                metaData.isAutoIncrement(index + 1));
                Object item = values[i];
import org.jkiss.code.Nullable;
                metaData.getScale(index + 1),
            } else if (value instanceof Boolean) {

            }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    @Override
                precision == attr.precision &&
        @Override
