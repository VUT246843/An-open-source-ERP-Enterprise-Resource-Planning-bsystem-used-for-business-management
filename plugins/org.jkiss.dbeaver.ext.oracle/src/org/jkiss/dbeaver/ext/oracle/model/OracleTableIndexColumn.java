    {
import org.jkiss.code.Nullable;
    }
    public OracleTableIndex getIndex()
        this.tableColumn = tableColumn;
        this.tableColumn = source.tableColumn;

    @Override
        this.ascending = source.ascending;
    private OracleTableColumn tableColumn;
    public OracleTableColumn getTableColumn()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    public String getDescription()
    @Override
 * GenericIndexColumn
    }

 */
    public String getName()
    private String columnExpression;
        return tableColumn.getName();
        return ordinalPosition;
    }
 *
    @Override
    {
    public String getColumnExpression() {
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
        return tableColumn.getDescription();

        this.index = toIndex;
import org.jkiss.dbeaver.model.meta.Property;
/**
    private int ordinalPosition;
    @Override
    {

    @Override
 * Unless required by applicable law or agreed to in writing, software
        OracleTableColumn tableColumn,
 * limitations under the License.
}
 */
import org.jkiss.code.NotNull;
    {
    public int getOrdinalPosition()
    @Property(viewable = true, order = 4)

        this.columnExpression = columnExpression;
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
{
    }
    public OracleDataSource getDataSource()
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
    }
        this.columnExpression = source.columnExpression;
        this.ordinalPosition = ordinalPosition;
 * DBeaver - Universal Database Manager
        return columnExpression;
    @Nullable
    }
    @NotNull
        return index;

    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false, order = 2)
    @Property(viewable = true, order = 1)

    public boolean isAscending()
    }
        return index.getDataSource();
    @NotNull

        this.ordinalPosition = source.ordinalPosition;
    @Property(viewable = true, order = 1)
    @Override
    private OracleTableIndex index;

        this.ascending = ascending;
    @Override
    @Property(viewable = true, order = 3)
    {

    private boolean ascending;
    {
 * You may obtain a copy of the License at
    OracleTableIndexColumn(OracleTableIndex toIndex, OracleTableIndexColumn source)
 * See the License for the specific language governing permissions and
    {
    public OracleTableIndexColumn(
    {
    public OracleTableIndex getParentObject()
        return index;
        this.index = index;

        boolean ascending,
        return tableColumn;
        String columnExpression)
    }
    @Override
        int ordinalPosition,

public class OracleTableIndexColumn extends AbstractTableIndexColumn
    {
 * you may not use this file except in compliance with the License.
/*
        return ascending;
    {
package org.jkiss.dbeaver.ext.oracle.model;
    }
        OracleTableIndex index,
