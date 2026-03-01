            boolean nullable)
    private int ordinalPosition;
}
        if (opClass <= 0) {

        this.index = index;
import org.jkiss.code.NotNull;
    {
    {
        this.ordinalPosition = ordinalPosition;
public class PostgreIndexColumn extends AbstractTableIndexColumn
    public String getName()

/*
    public String toString() {
        return tableColumn;
    public String getDescription()
        return tableColumn == null ? expression : tableColumn.getName();
    @Override
    }
 *
        }
        return ascending;
    }

    {
    }
    public PostgreIndexColumn(DBRProgressMonitor monitor, PostgreIndex index, PostgreIndexColumn srcColumn) throws DBException {
        this.ordinalPosition = srcColumn.ordinalPosition;
        this.ascending = ascending;
    @NotNull
        }
        return index;
    @Property(viewable = true, order = 6)
        this.nullable = nullable;
        this.expression = srcColumn.expression;
 * See the License for the specific language governing permissions and
            return null;
    private boolean nullable;
    public int getOrdinalPosition()
        this.tableColumn = tableColumn;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return index.getDataSource();
        PostgreAccessMethod accessMethod = index.getAccessMethod(monitor);
        return index;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Property(viewable = true, order = 1)
    {
 * DBeaver - Universal Database Manager
        this.opClass = srcColumn.opClass;
{
    public PostgreOperatorClass getOperatorClass(DBRProgressMonitor monitor) throws DBException {
    }
            return null;
        this.index = index;
/**
 */
    @Property(viewable = true, order = 1)
    }
    {
    @Property(viewable = true, order = 3)

    private long opClass;
        this.expression = expression;
        PostgreAttribute srcTableColumn = srcColumn.getTableColumn();
    @NotNull
    public PostgreIndexColumn(
    @NotNull
        return tableColumn == null ? null : tableColumn.getDescription();
    }
    @Property(viewable = false, order = 2)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
    private String expression;
    {


    public PostgreAttribute getTableColumn()
    public PostgreIndex getParentObject()

import org.jkiss.code.Nullable;
        this.tableColumn = srcTableColumn == null ? null : index.getTable().getAttribute(monitor, srcTableColumn.getName());
    @Override
    }
    public boolean isNullable()
    @Property(viewable = true, order = 4)
    private PostgreIndex index;
            PostgreIndex index,
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at

    }

 *
    }
        this.nullable = srcColumn.nullable;

 *
    private PostgreAttribute tableColumn;
 * Unless required by applicable law or agreed to in writing, software
    {
            String expression,

 * GenericIndexColumn
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            PostgreAttribute tableColumn,
    private boolean ascending;
    @Override
    @Nullable
import org.jkiss.dbeaver.model.meta.Property;
        return ordinalPosition;
    }
        this.ascending = srcColumn.ascending;
    @Override
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isAscending()
 * limitations under the License.
    @Nullable

            long opClass,
            boolean ascending,
        return nullable;
    public PostgreDataSource getDataSource()
            int ordinalPosition,
    @Override
        return tableColumn == null ? "NULL" : tableColumn.toString();
 * you may not use this file except in compliance with the License.
        this.opClass = opClass;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    @Override
        return accessMethod.getOperatorClass(monitor, opClass);
    {
    @Override
    }
package org.jkiss.dbeaver.ext.postgresql.model;

        if (accessMethod == null) {

 */
    @Override
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
    public PostgreIndex getIndex()
    {
