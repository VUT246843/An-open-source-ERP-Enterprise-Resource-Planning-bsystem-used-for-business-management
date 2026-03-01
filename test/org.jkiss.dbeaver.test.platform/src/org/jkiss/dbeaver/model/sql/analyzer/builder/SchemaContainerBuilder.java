import org.jkiss.dbeaver.model.DBUtils;
    ) throws DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        applier.apply(builder);
        super(dataSource, parent);
        this(dataSource, parent, name, DBSCatalog.class);
    }
    }
    public SchemaContainerBuilder schema(@NotNull String name, @NotNull Consumer<TableContainerBuilder> applier) throws DBException {
import static org.mockito.Mockito.mock;

import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
 *
    @NotNull
import org.jkiss.code.NotNull;
        return container;
        this(dataSource, dataSource, name, DBSObjectContainer.class);
import org.jkiss.dbeaver.model.DBPDataSource;
/*
 *
import static org.mockito.ArgumentMatchers.any;
public class SchemaContainerBuilder extends Builder<DBSObjectContainer, DBSObjectContainer> {

        @NotNull DBPDataSource dataSource,
        when(container.getName()).thenReturn(name);
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        final TableContainerBuilder builder = new TableContainerBuilder(dataSource, container, name);
import org.jkiss.dbeaver.model.struct.DBSObject;
        children.add(builder.build());
import static org.mockito.Mockito.when;

 *
        when(container.getDataSource()).thenReturn(dataSource);
    }
    public SchemaContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull String name) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

    @NotNull
 * limitations under the License.
    @Override
 * DBeaver - Universal Database Manager
        return this;

        when(container.getChildren(any())).then(x -> children);
    private final DBSObjectContainer container;
        @NotNull DBSObject parent,
 */
        when(container.getChild(any(), any())).then(x -> DBUtils.findObject(children, x.getArgument(1, String.class)));
 * Unless required by applicable law or agreed to in writing, software
    public SchemaContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull DBSObject parent, @NotNull String name) throws DBException {
        when(container.getPrimaryChildType(any())).thenReturn(null);
        @NotNull String name,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;

        @NotNull Class<? extends DBSObjectContainer> tableContainerType

    public DBSObjectContainer build() {

package org.jkiss.dbeaver.model.sql.analyzer.builder;
        when(container.getParentObject()).thenReturn(parent);
    public SchemaContainerBuilder(
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        this.container = mock(tableContainerType);
