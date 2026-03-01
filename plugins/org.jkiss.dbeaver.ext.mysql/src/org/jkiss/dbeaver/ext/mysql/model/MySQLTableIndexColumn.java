

        return subPart;

    @Override
    {
    @Nullable
        this.ordinalPosition = ordinalPosition;
    @Property(viewable = false, order = 2)
    }
    public String getName()
    private boolean ascending;
    @Override

    @NotNull
 * limitations under the License.
    public MySQLTableIndex getIndex()
        }
    }
    {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public MySQLTableIndexColumn(
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.code.NotNull;
 *
 * GenericIndexColumn
    public MySQLTableColumn getTableColumn()
    private MySQLTableColumn tableColumn;
    @Property(viewable = true, order = 5)
    }
    public MySQLTableIndex getParentObject()

        return index;
        return ascending;
    }
package org.jkiss.dbeaver.ext.mysql.model;
import org.jkiss.dbeaver.DBException;
        if (source.getTableColumn() != null) {
}
        return tableColumn;
        boolean nullable,
    @Property(viewable = true, order = 1)
    {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
    @Override
    @Property(viewable = true, order = 4)
        boolean ascending,
        this.index = toIndex;

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    public String getSubPart() {
    @Override
        }
        MySQLTableIndex index,
    {
 * Unless required by applicable law or agreed to in writing, software
 *

    {
 * DBeaver - Universal Database Manager
        this.nullable = nullable;
 * you may not use this file except in compliance with the License.
    {
 * You may obtain a copy of the License at
        return tableColumn.getName();
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
    }

            this.subPart = ((MySQLTableIndexColumn)source).subPart;
 * See the License for the specific language governing permissions and
        this.index = index;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private MySQLTableIndex index;
    public String getDescription()
        int ordinalPosition,
    @Override
        return tableColumn.getDescription();

    public int getOrdinalPosition()
        return index.getDataSource();
 */
    private String subPart;

        this.ascending = ascending;
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
        if (source instanceof MySQLTableIndexColumn) {
        MySQLTableColumn tableColumn,
    }
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

    private boolean nullable;
        this.tableColumn = tableColumn;
    public MySQLDataSource getDataSource()
    @NotNull

    public boolean isNullable()
{
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;

    }
    }
    private int ordinalPosition;
/*
    {
        return nullable;
            this.tableColumn = toIndex.getTable().getAttribute(monitor, source.getTableColumn().getName());
        return index;
    @Property(viewable = true, order = 3)
        this.ordinalPosition = source.getOrdinalPosition();
            this.nullable = ((MySQLTableIndexColumn)source).nullable;
import org.jkiss.code.Nullable;
    MySQLTableIndexColumn(DBRProgressMonitor monitor, MySQLTableIndex toIndex, DBSTableIndexColumn source) throws DBException {
        return ordinalPosition;
        this.subPart = subPart;
    @NotNull
    }
 *
    }
        this.ascending = source.isAscending();
    @Override
    public boolean isAscending()
public class MySQLTableIndexColumn extends AbstractTableIndexColumn
    @Property(viewable = true, order = 1)
    {

    @Override
    }
    {
        String subPart)
 */
