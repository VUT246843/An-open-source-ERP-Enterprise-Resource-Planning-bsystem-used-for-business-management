import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.included = included;
        this.ordinalPosition = ordinalPosition;
 *
    }
    }
    @NotNull
    }
public class SQLServerTableIndexColumn extends AbstractTableIndexColumn implements SQLServerObject, DBSTableConstraintColumn
    }
    @Nullable
/*
 * DBeaver - Universal Database Manager
    @Property(id = "name", viewable = true, order = 1)
import org.jkiss.dbeaver.model.meta.Property;
 * Unless required by applicable law or agreed to in writing, software
        int ordinalPosition,
    @NotNull
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
        return index.getDataSource();
    {
    {

    private SQLServerTableIndex index;
import org.jkiss.code.NotNull;
    {
    public String getDescription()


        boolean included)
        this.ascending = ascending;
 * SQLServerTableIndexColumn
 * limitations under the License.
    {
//    }
 *
 */
    {

    public long getObjectId() {


    @Override
    }
//        return nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
//    {
    private boolean included;
    @Nullable

        this.index = index;
    @Nullable

    public SQLServerTableIndexColumn(
        }
    }
        return ordinalPosition;
        SQLServerTableColumn tableColumn,
    }
    public boolean isIncluded() {
    private long objectId;
        boolean ascending,
package org.jkiss.dbeaver.ext.mssql.model;
        this.ordinalPosition = source.getOrdinalPosition();
    @Override

    public SQLServerTableIndex getIndex()
    }
            this.tableColumn = toIndex.getTable().getAttribute(monitor, source.getTableColumn().getName());
        return tableColumn.getName();
        if (source.getTableColumn() != null) {
        return tableColumn;
    }
    @Override
 */
    @Property(viewable = true, order = 1)
        return included;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
    @Override
    public SQLServerDatabase getDatabase() {
        this.ascending = source.isAscending();
        this.index = toIndex;
    public SQLServerDataSource getDataSource()
        long objectId,
    @Property(viewable = true, order = 4)
    SQLServerTableIndexColumn(DBRProgressMonitor monitor, SQLServerTableIndex toIndex, DBSTableIndexColumn source) throws DBException {
//    public boolean isNullable()
        return tableColumn.getDescription();
        this.objectId = objectId;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
        if (source instanceof SQLServerTableIndexColumn) {
    @Override

        return ascending;
        return objectId;
 * You may obtain a copy of the License at
    @Override


 * you may not use this file except in compliance with the License.
            this.included = ((SQLServerTableIndexColumn) source).isIncluded();
{
    private boolean ascending;
        SQLServerTableIndex index,
            //this.nullable = ((SQLServerTableIndexColumn)source).nullable;
        return tableColumn;
        //this.nullable = nullable;
    @Property(viewable = false, order = 2)
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
        this.tableColumn = tableColumn;
    private SQLServerTableColumn tableColumn;
    public String getName()
    public SQLServerTableColumn getTableColumn()
    //private boolean nullable;

    }
    }
        return index;
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    public boolean isAscending()
    public DBSTableColumn getAttribute() {
    private int ordinalPosition;

    public SQLServerTableIndex getParentObject()
    @Override
    @Override
    @NotNull
        return index;
    @Property(viewable = true, order = 3)
    }
    @Override
//    @Property(viewable = true, order = 4)
    @Override
}
    {
import org.jkiss.code.Nullable;
    @Nullable
 * See the License for the specific language governing permissions and
        return index.getDatabase();
        }
    public int getOrdinalPosition()

    }

    {
/**
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
