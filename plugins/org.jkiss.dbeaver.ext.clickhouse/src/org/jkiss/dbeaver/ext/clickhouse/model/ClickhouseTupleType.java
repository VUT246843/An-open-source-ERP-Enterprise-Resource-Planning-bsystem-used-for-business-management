        return attributes;

            .collect(Collectors.joining(", ", "(", ")"));
    @Nullable

            .toList();
        return DBSEntityType.TYPE;
        return null;
        return attributes;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .map(DBSTypedObject::getFullTypeName)
    public String getTypeName() {
    @NotNull
    }
        return baseName;
        @NotNull List<Pair<String, DBSDataType>> elements

 *
 * You may obtain a copy of the License at
            .mapToObj(index -> new ClickhouseTupleTypeAttribute(
    }
 *
    public DBPDataKind getDataKind() {
                elements.get(index).getFirst(),
    }
    }
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.struct.*;
        @NotNull List<Pair<String, DBSDataType>> elements
    public List<ClickhouseTupleTypeAttribute> getAttributes() {
    @Override

 * Unless required by applicable law or agreed to in writing, software
    @NotNull

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) {
                elements.get(index).getSecond(),
        return null;
    @Override
 * limitations under the License.
        super(dataSource);

/*
import org.jkiss.utils.Pair;
    }

    }
        this.fullName = name + elements.stream()
                this,
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                index
    @Override
    @Nullable

    ) {
        return DBUtils.findObject(attributes, attributeName);
    @Override
    protected ClickhouseTupleType(


    public String getFullTypeName() {

    @Nullable
        this(dataSource, "Tuple", elements);
        return null;

            .map(Pair::getSecond)
    }
import java.util.stream.IntStream;
        this.baseName = name;
    @Override
    public Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) {
    @Override
        @NotNull ClickhouseDataSource dataSource,
 * you may not use this file except in compliance with the License.
    @Override
        return fullName;
}
    }

import java.util.Collection;
    }
    public DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) {
    }
    @NotNull
    ) {
 * Licensed under the Apache License, Version 2.0 (the "License");
public class ClickhouseTupleType extends ClickhouseAbstractDataType implements DBSEntity {
    public DBSEntityType getEntityType() {
import java.util.List;
    @Override
        @NotNull ClickhouseDataSource dataSource,
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) {
package org.jkiss.dbeaver.ext.clickhouse.model;

        return Types.STRUCT;
    @Nullable
    public List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) {
import java.util.stream.Collectors;
import java.sql.Types;
import org.jkiss.dbeaver.model.DBPDataKind;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public ClickhouseTupleType(
    public int getTypeID() {
    private final String fullName;
import org.jkiss.dbeaver.model.DBUtils;
    private final List<ClickhouseTupleTypeAttribute> attributes;
        @NotNull String name,
    @Override
            ))
    @Nullable

    }
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.code.NotNull;
        return DBPDataKind.STRUCT;
    private final String baseName;
    @NotNull
    @NotNull
 * DBeaver - Universal Database Manager
    }
        this.attributes = IntStream.range(0, elements.size())
 *
