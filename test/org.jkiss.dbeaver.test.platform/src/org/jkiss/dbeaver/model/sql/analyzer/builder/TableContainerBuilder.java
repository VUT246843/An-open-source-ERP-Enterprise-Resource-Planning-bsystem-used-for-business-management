        this.container = mock(tableContainerType);
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 *
    public TableContainerBuilder(
        super(dataSource, parent);
        applier.apply(builder);
    public TableContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull String name) throws DBException {
    private final DBSObjectContainer container;
        when(container.getName()).thenReturn(name);
    @NotNull
    }
import org.jkiss.dbeaver.model.struct.DBSObject;

        this(dataSource, parent, name, DBSSchema.class);
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        this(dataSource, dataSource, name, DBSObjectContainer.class);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        final TableAttributeContainerBuilder builder = new TableAttributeContainerBuilder(dataSource, container, name);

    public TableContainerBuilder table(@NotNull String name, @NotNull Consumer<TableAttributeContainerBuilder> applier) throws DBException {
package org.jkiss.dbeaver.model.sql.analyzer.builder;
import static org.mockito.ArgumentMatchers.any;
        return this;
 */
        @NotNull Class<? extends DBSObjectContainer> tableContainerType

 * You may obtain a copy of the License at
        when(container.getParentObject()).thenReturn(parent);
    public DBSObjectContainer build() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    }
 * Unless required by applicable law or agreed to in writing, software
        when(container.getDataSource()).thenReturn(dataSource);
 *
        when(container.getChild(any(), any())).then(x -> DBUtils.findObject(children, x.getArgument(1, String.class)));
 *

import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
import org.jkiss.code.NotNull;

import static org.mockito.Mockito.mock;
import org.jkiss.dbeaver.model.struct.DBSEntity;

import org.jkiss.dbeaver.model.DBPDataSource;
    }
        @NotNull String name,
        children.add(builder.build());
    public TableContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull DBSObject parent, @NotNull String name) throws DBException {
    ) throws DBException {
}
import org.jkiss.dbeaver.DBException;
    @NotNull

import static org.mockito.Mockito.when;
 * DBeaver - Universal Database Manager

        @NotNull DBPDataSource dataSource,
        when(container.getChildren(any())).then(x -> children);
        @NotNull DBSObject parent,
        return container;
import org.jkiss.dbeaver.model.DBUtils;
public class TableContainerBuilder extends Builder<DBSObjectContainer, DBSEntity> {
        when(container.getPrimaryChildType(any())).thenReturn(null);
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
