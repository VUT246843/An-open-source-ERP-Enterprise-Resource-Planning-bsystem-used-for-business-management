public class ClickhouseTupleTypeAttribute extends AbstractAttribute implements DBSEntityAttribute, DBSTypedObjectEx {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Unless required by applicable law or agreed to in writing, software
    private final DBSDataType attributeType;
    @NotNull

    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

        return tupleType.getDataSource();
package org.jkiss.dbeaver.ext.clickhouse.model;

        @NotNull ClickhouseTupleType tuple,
 *
    ) {
    public String getDefaultValue() {
        @NotNull String name,
 *
import org.jkiss.code.NotNull;

    }
import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
    @Override
    @NotNull
    }
        return tupleType;
/*
    public DBSDataType getDataType() {
    public DBSEntity getParentObject() {
    public ClickhouseTupleTypeAttribute(

        return attributeType.getDataKind();
    }
        @NotNull DBSDataType attr,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBPDataSource getDataSource() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
        int position
        this.tupleType = tuple;
        return null;
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntity;
        return attributeType;
    private final ClickhouseTupleType tupleType;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;
    }
    @Nullable
import org.jkiss.dbeaver.model.struct.DBSDataType;
    @NotNull
    public DBPDataKind getDataKind() {
    }
        this.attributeType = attr;
}
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 * limitations under the License.

    @Override
    @Override

 */
import org.jkiss.dbeaver.model.DBPDataKind;
        super(name, attr.getTypeName(), attr.getTypeID(), position, -1, null, null, false, false);
