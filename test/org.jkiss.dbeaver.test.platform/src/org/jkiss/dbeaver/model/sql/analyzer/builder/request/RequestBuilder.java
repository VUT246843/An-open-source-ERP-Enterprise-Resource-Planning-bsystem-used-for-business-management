        when(dataSource.getSQLDialect()).thenReturn(dialect);
    }
        when(dataSourceContainer.getConnectionConfiguration()).thenReturn(connectionConfiguration);
import org.jkiss.dbeaver.model.DBUtils;
        when(ds.getInfo()).then(x -> dsInfo);
 *
        when(dataSourceContainer.getActualConnectionConfiguration()).thenReturn(connectionConfiguration);
                return true;
    }

 * Unless required by applicable law or agreed to in writing, software
    private final List<? extends DBSObject> children;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
        final TableAttributeContainerBuilder builder = new TableAttributeContainerBuilder(dataSource, "<unnamed>");
        final DatabaseContainerBuilder builder = new DatabaseContainerBuilder(dataSource, "<unnamed>");

import org.jkiss.dbeaver.runtime.DBWorkbench;
        final TableContainerBuilder builder = new TableContainerBuilder(dataSource, "<unnamed>");

        final DBPDataSourceContainer dataSourceContainer = mock(DBPDataSourceContainer.class);
        return new RequestBuilder(dataSource, builder.build(), builder.getChildren());
import org.jkiss.dbeaver.model.struct.DBSObjectType;
            RelationalObjectType.TYPE_VIEW,
            RelationalObjectType.TYPE_INDEX,
            RelationalObjectType.TYPE_DATA_TYPE
            RelationalObjectType.TYPE_VIEW_COLUMN,
import static org.mockito.Mockito.when;

import org.jkiss.dbeaver.model.sql.SQLDialectMetadataRegistry;
 * limitations under the License.
        return ds;
import org.jkiss.dbeaver.model.struct.DBSObject;
import static org.mockito.Mockito.mock;
 *
    }
import static org.mockito.ArgumentMatchers.any;
        when(dataSource.getChildren(any())).then(x -> children);

        };
        DataSource ds = mock(DataSource.class);
    private static DataSource createDataSource() {
    }

    public interface DataSource extends DBPDataSource, DBSObjectContainer {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
            RelationalObjectType.TYPE_TABLE,
            RelationalObjectType.TYPE_PROCEDURE,

    public static RequestBuilder empty() throws DBException {


import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }
            RelationalObjectType.TYPE_SEQUENCE,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        SQLDialect dialect = new GenericSQLDialect() {
/*
    public RequestResult prepare() throws DBException {
    @NotNull
    private RequestBuilder(@NotNull DataSource dataSource, @NotNull DBSObject object, @NotNull List<? extends DBSObject> children) {
        this.dataSource = dataSource;
        this.children = children;
import org.jkiss.dbeaver.model.sql.analyzer.builder.*;
package org.jkiss.dbeaver.model.sql.analyzer.builder.request;
        final DBPConnectionConfiguration connectionConfiguration = new DBPConnectionConfiguration();
 * DBeaver - Universal Database Manager
        });

import org.jkiss.dbeaver.model.DBPDataSourceInfo;
        return new RequestBuilder(dataSource, builder.build(), builder.getChildren());
        final SchemaContainerBuilder builder = new SchemaContainerBuilder(dataSource, "<unnamed>");
            RelationalObjectType.TYPE_TABLE_COLUMN,
        when(dataSource.getContainer()).thenReturn(dataSourceContainer);
    }
    public DBSObject getObject() {
 */
    private final DataSource dataSource;
import org.jkiss.dbeaver.model.DBPDataSource;
 * See the License for the specific language governing permissions and
            }
import org.jkiss.dbeaver.model.sql.SQLDialect;
        final DataSource dataSource = createDataSource();
        when(dsInfo.getSupportedObjectTypes()).then(x -> new DBSObjectType[] {

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
        final DataSource dataSource = createDataSource();
            @Override
    }
}
        final DataSource dataSource = createDataSource();
        final DataSource dataSource = createDataSource();
    public static RequestBuilder tables(Builder.Consumer<TableContainerBuilder> applier) throws DBException {
        final DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();

    private final DBSObject object;

 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public static RequestBuilder databases(Builder.Consumer<DatabaseContainerBuilder> applier) throws DBException {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        when(dataSourceContainer.getPreferenceStore()).thenReturn(preferenceStore);
        return object;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;

    @NotNull
        applier.apply(builder);
        DBPDataSourceInfo dsInfo = mock(DBPDataSourceInfo.class);
            RelationalObjectType.TYPE_CONSTRAINT,
        return new RequestBuilder(dataSource, builder.build(), builder.getChildren());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        when(dataSource.getChild(any(), any())).then(x -> DBUtils.findObject(children, x.getArgument(1, String.class)));
public class RequestBuilder {
        return new RequestBuilder(dataSource, builder.build(), builder.getChildren());

        this.object = object;
        applier.apply(builder);
            RelationalObjectType.TYPE_TRIGGER,
        applier.apply(builder);
            public boolean supportsAliasInSelect() {
    public static RequestBuilder schemas(Builder.Consumer<SchemaContainerBuilder> applier) throws DBException {


import java.util.List;
        return new RequestResult(dataSource);
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
