        when(attribute.getTypeName()).thenReturn("Unknown");
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSEntityType;
    public TableAttributeContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull DBSObject parent, @NotNull String name) throws DBException {
    public TableAttributeContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull String name) throws DBException {
            .then(x -> DBUtils.getFullyQualifiedName(
        when(entity.getParentObject()).thenReturn(parent);
    }
    public TableAttributeContainerBuilder attribute(@NotNull String name) {
package org.jkiss.dbeaver.model.sql.analyzer.builder;

import org.jkiss.dbeaver.model.DBPDataKind;
    @Override
        when(entity.getAttribute(any(), any())).then(x -> DBUtils.findObject(children, x.getArgument(1, String.class)));
        when(attribute.getParentObject()).thenReturn(entity);
}
    }
        when(entity.getFullyQualifiedName(any()))
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItem;
        when(attribute.getDataSource()).thenReturn(dataSource);
        when(attribute.getName()).thenReturn(name);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSource;

 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        super(dataSource, parent);
        this.entity = mock(DBSTable.class);
import org.jkiss.dbeaver.DBException;
            ));
import static org.mockito.ArgumentMatchers.any;

    @NotNull
 * See the License for the specific language governing permissions and
        when(entity.getName()).thenReturn(name);
        children.add(attribute);
 *

import static org.mockito.Mockito.when;
        return entity;
 *

                SQLQueryCompletionItem.prepareQualifiedNameParts(entity, null).toArray(String[]::new)
        when(entity.getDataSource()).thenReturn(dataSource);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import static org.mockito.Mockito.mock;
    public DBSTable build() {
 * limitations under the License.
                dataSource,
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        final DBSEntityAttribute attribute = mock(DBSEntityAttribute.class);
        when(entity.getEntityType()).thenReturn(DBSEntityType.TABLE);
 *
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
        return this;
 * distributed under the License is distributed on an "AS IS" BASIS,

        when(entity.getAttributes(any())).then(x -> children);
    }
    private final DBSTable entity;
import org.jkiss.code.NotNull;
        when(attribute.getDataKind()).thenReturn(DBPDataKind.UNKNOWN);
 */
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
        this(dataSource, dataSource, name);

public class TableAttributeContainerBuilder extends Builder<DBSTable, DBSEntityAttribute> {
