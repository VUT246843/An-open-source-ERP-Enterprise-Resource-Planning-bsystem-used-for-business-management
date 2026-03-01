
    @NotNull
        return container;
 *
package org.jkiss.dbeaver.model.sql.analyzer.builder;
    public DatabaseContainerBuilder database(@NotNull String name, @NotNull Consumer<SchemaContainerBuilder> applier) throws DBException {
import org.jkiss.dbeaver.model.DBUtils;
        return this;
    public DatabaseContainerBuilder(@NotNull DBPDataSource dataSource, @NotNull String name) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(dataSource, dataSource);

import static org.mockito.Mockito.mock;
        when(container.getDataSource()).thenReturn(dataSource);

    }
    @Override

        when(container.getParentObject()).thenReturn(parent);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import static org.mockito.Mockito.when;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DatabaseContainerBuilder extends Builder<DBSObjectContainer, DBSObjectContainer> {
        applier.apply(builder);
 * See the License for the specific language governing permissions and
}
import static org.mockito.ArgumentMatchers.any;
        when(container.getName()).thenReturn(name);
 * distributed under the License is distributed on an "AS IS" BASIS,
        children.add(builder.build());
 */
        when(container.getPrimaryChildType(any())).thenReturn(null);
 *
    public DBSObjectContainer build() {
        this.container = mock(DBSObjectContainer.class);
    @NotNull
/*
import org.jkiss.dbeaver.model.DBPDataSource;
 * DBeaver - Universal Database Manager

    }
        when(container.getChildren(any())).then(x -> children);
        final SchemaContainerBuilder builder = new SchemaContainerBuilder(dataSource, container, name);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        when(container.getChild(any(), any())).then(x -> DBUtils.findObject(children, x.getArgument(1, String.class)));
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    private final DBSObjectContainer container;
