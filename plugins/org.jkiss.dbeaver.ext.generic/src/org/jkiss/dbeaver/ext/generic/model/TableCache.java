    @NotNull
    @Nullable
    private final GenericMetaObject tableObject;
 *
    }
    protected GenericTableColumn fetchChild(
        @NotNull JDBCSession session,
    }
public class TableCache extends JDBCStructLookupCache<GenericStructContainer, GenericTableBase, GenericTableColumn> {
        @NotNull GenericStructContainer owner,
        @NotNull GenericTableBase table,
    @NotNull
        @NotNull JDBCSession session,

 *
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
    private final GenericDataSource dataSource;
    @Override

        return tableObject;
        setListOrderComparator(DBUtils.nameComparatorIgnoreCase());
    }
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import java.sql.SQLException;
    }

 * Generic tables cache implementation
    public GenericDataSource getDataSource() {
import org.jkiss.dbeaver.model.DBUtils;
    @Override
    ) throws SQLException {

    ) throws SQLException, DBException {
        @NotNull GenericStructContainer owner,
    private final GenericMetaObject columnObject;
        @NotNull GenericStructContainer owner,
        super(GenericUtils.getColumn(dataSource, GenericConstants.OBJECT_TABLE, JDBCConstants.TABLE_NAME));
        this.tableObject = dataSource.getMetaObject(GenericConstants.OBJECT_TABLE);
        @Nullable GenericTableBase forTable
    public GenericMetaObject getTableObject() {
        @NotNull JDBCSession session,
import org.jkiss.code.Nullable;
        @NotNull GenericStructContainer owner,
    @Override

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    public JDBCStatement prepareLookupStatement(
        return dataSource.getMetaModel().prepareTableLoadStatement(session, owner, object, objectName);
        @Nullable GenericTableBase object,
    ) throws SQLException {
    protected GenericTableBase fetchObject(
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.columnObject = dataSource.getMetaObject(GenericConstants.OBJECT_TABLE_COLUMN);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        this.dataSource = dataSource;
    protected TableCache(@NotNull GenericDataSource dataSource) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

        @NotNull JDBCSession session,

        @NotNull JDBCResultSet dbResult

    }
import org.jkiss.dbeaver.DBException;
    ) throws SQLException, DBException {
        return dataSource.getMetaModel().prepareTableColumnLoadStatement(session, owner, forTable);
        @Nullable String objectName
    protected JDBCStatement prepareChildrenStatement(

    @Override
        return dataSource;

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull JDBCResultSet dbResult
/*
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ext.generic.model;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/**
}

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;
        return dataSource.getMetaModel().fetchTableColumn(session, owner, table, dbResult);
        return getDataSource().getMetaModel().createTableImpl(session, owner, tableObject, dbResult);
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
