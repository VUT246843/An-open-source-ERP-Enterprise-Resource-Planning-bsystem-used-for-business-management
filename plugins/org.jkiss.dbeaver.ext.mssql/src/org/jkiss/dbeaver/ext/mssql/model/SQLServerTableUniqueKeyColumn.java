    public SQLServerTableUniqueKeyColumn(AbstractTableConstraint<SQLServerTableBase, ? extends DBSTableConstraintColumn> constraint, SQLServerTableColumn tableColumn, int ordinalPosition)

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * DBeaver - Universal Database Manager

        return constraint;
package org.jkiss.dbeaver.ext.mssql.model;
    }
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
    @NotNull
    @Nullable
    public int getOrdinalPosition()
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
    @NotNull

    {
    public SQLServerTableColumn getAttribute()
    {
    }
    @Property(viewable = false, order = 2)
 * Unless required by applicable law or agreed to in writing, software
        return tableColumn.getName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    {
    {
    @Override
    }
    {
    @Override
    public String getName()
    @NotNull
/**

 * See the License for the specific language governing permissions and
        return ordinalPosition;

    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
        return tableColumn;
        return tableColumn.getDescription();
    @Property(viewable = true, order = 1)
 * you may not use this file except in compliance with the License.
 * SQLServerTableUniqueKeyColumn.
}

import org.jkiss.code.Nullable;
 *
    @Override
    {
        this.constraint = constraint;
 * No needed? Unique keys use index columns
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
{

 */
 * You may obtain a copy of the License at
        this.tableColumn = tableColumn;
    private int ordinalPosition;
 *
    @Override
        this.ordinalPosition = ordinalPosition;
    }
import org.jkiss.dbeaver.model.meta.Property;
/*
    public SQLServerDataSource getDataSource()
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, order = 1)
    private SQLServerTableColumn tableColumn;
    }
        return constraint.getTable().getDataSource();
    private AbstractTableConstraint<SQLServerTableBase, ? extends DBSTableConstraintColumn> constraint;
public class SQLServerTableUniqueKeyColumn extends AbstractTableConstraintColumn
    public AbstractTableConstraint<SQLServerTableBase, ? extends DBSTableConstraintColumn> getParentObject()
 *
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
    {
    public String getDescription()

