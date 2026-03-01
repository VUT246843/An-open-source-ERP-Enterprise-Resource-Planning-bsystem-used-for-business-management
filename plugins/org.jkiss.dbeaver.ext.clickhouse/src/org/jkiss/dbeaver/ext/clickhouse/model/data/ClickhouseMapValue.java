        public List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
            return DBSEntityType.VIRTUAL_ENTITY;
    @Override
    private List<EntryComposite> contents;
        public DBSEntityType getEntityType() {
        modified = true;

}
            .map(Object::toString)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


        @Nullable

        public boolean isNull() {
 *


    private static class EntryAttribute extends AbstractAttribute implements DBSEntityAttribute {
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isNull() {

        @NotNull
        public DBPDataKind getDataKind() {
    @NotNull
    @Override
    private class EntryComposite implements DBDComposite {
    public void release() {
            super(dataSource);
        public int getTypeID() {
            this.key = key;
public class ClickhouseMapValue extends AbstractDatabaseList {
        this.dataSource = dataSource;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
            .collect(Collectors.joining(", "));
    }
        @NotNull
        @Override
        public DBPDataSource getDataSource() {
        public EntryComposite(@Nullable Object key, @Nullable Object value) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public int getItemCount() {
package org.jkiss.dbeaver.ext.clickhouse.model.data;
        @Override
        @Override
import java.util.stream.Collectors;
        @NotNull
import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;

        @Override
        this.modified = true;
            this.parent = parent;
 * See the License for the specific language governing permissions and
        return contents.get(index);
            return entryType;
        @NotNull Map<?, ?> contents
        @NotNull ClickhouseMapType type,

        return DBUtils.findValueHandler(dataSource, entryType);
    public DBDValueHandler getComponentValueHandler() {
    }
        }

        private final DBSDataType type;
/*
 * DBeaver - Universal Database Manager
        }
        public Object getAttributeValue(@NotNull DBSAttributeBase attribute) {
    @Override
        }
    public DBSDataType getComponentType() {
import org.jkiss.dbeaver.model.DBPDataKind;

                this.value = value;

    @Override
        public DBSEntity getParentObject() {
        private Object value;
        @Override

        this.contents.clear();
 * limitations under the License.
        public DBPDataKind getDataKind() {
            return attributes;
            new EntryAttribute(entryType, "Value", type.getValueType(), 1)
    @Override
    }


            return mapType.getTypeID();
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseDataSource;
                return key;
            new EntryAttribute(entryType, "Key", type.getKeyType(), 0),
        public String getDefaultValue() {
 */
        public String getTypeName() {
        public EntryType(@NotNull ClickhouseDataSource dataSource) {
import org.jkiss.code.Nullable;

import org.jkiss.code.NotNull;
        }
        for (Object content : contents) {
 *
import org.jkiss.dbeaver.model.data.DBDComposite;
        }
import java.util.Map;
        @Override
        }
        return modified;
    public void setContents(Object[] contents) {
    public Object getItem(int index) {
    public String toString() {
        this.contents = contents.entrySet().stream()
            return type.getDataKind();
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseMapType;
        contents.set(index, (EntryComposite) value);

        }
    }
        public void setAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) throws DBCException {
        }
            return DBPDataKind.STRUCT;
        @Override
    public ClickhouseMapValue(
import org.jkiss.dbeaver.DBException;
        public DBSDataType getDataType() {
        @NotNull
    @Override
        @Nullable

    private final ClickhouseDataSource dataSource;
        }
            super(name, type.getFullTypeName(), type.getTypeID(), position, 0, null, null, true, false);
        this.entryType = new EntryType(dataSource);
    public Object getRawValue() {
            // do nothing
    }
        return entryType;

    }
        @Override

    }

        contents = null;
            .collect(Collectors.toList());
        }
            .map(entry -> new EntryComposite(entry.getKey(), entry.getValue()))
        this.attributes = new EntryAttribute[]{

        @Override

        }
    @Override
        @NotNull
import java.util.List;
            this.value = value;
        }
            return String.format("{%s : %s}", key, value);
            this.type = type;
            return mapType.getFullTypeName();
    private final EntryType entryType;
    }
    private class EntryType extends AbstractStructDataType<ClickhouseDataSource> implements DBSEntity {
    }

        @Override

import org.jkiss.dbeaver.model.struct.*;
        }
        @Override
    }
            return parent;
import org.jkiss.dbeaver.model.DBPDataSource;
        this.mapType = type;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        };
        }

 * Unless required by applicable law or agreed to in writing, software
        public String toString() {
            return false;
            } else {
        }
        @Override

        private final Object key;
            return modified;
        private final EntryType parent;
        public DBSAttributeBase[] getAttributes() {

    private final EntryAttribute[] attributes;

import org.jkiss.dbeaver.model.exec.DBCException;
                modified = true;
        return contents != null ? contents.size() : 0;
            return value;
    }
        }
    }
        }
            }
        @Override
            return List.of();
 *
            } else {

    @Override
        @Override
 * You may obtain a copy of the License at
    ) {
        return contents.stream()
import org.jkiss.dbeaver.model.impl.data.AbstractDatabaseList;
        @Override
        public Object getRawValue() {

    @Override
import org.jkiss.dbeaver.model.data.DBDValueHandler;


import org.jkiss.dbeaver.model.impl.struct.AbstractStructDataType;
            return parent.getDataSource();

        @Nullable
        }
        public void release() {
    public boolean isModified() {

        @NotNull
            this.contents.add((EntryComposite) content);
            if (attribute.getOrdinalPosition() == 0) {
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        return contents;

                return value;
                throw new DBCException("Key is read-only");
        public boolean isModified() {
            if (attribute.getOrdinalPosition() == 0) {
        @NotNull ClickhouseDataSource dataSource,
    @Override
import org.jkiss.dbeaver.model.DBUtils;
    }
        }
    }
    }
        return contents == null;
            return null;
        public EntryAttribute(@NotNull EntryType parent, @NotNull String name, @NotNull DBSDataType type, int position) {
            }
        }
    public void setItem(int index, Object value) {
    private boolean modified;
 * you may not use this file except in compliance with the License.
    private final ClickhouseMapType mapType;
        @Override
        }
