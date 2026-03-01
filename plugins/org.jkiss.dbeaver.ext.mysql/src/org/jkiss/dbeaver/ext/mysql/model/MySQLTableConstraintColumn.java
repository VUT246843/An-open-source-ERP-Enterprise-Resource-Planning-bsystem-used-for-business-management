        return constraint.getTable().getDataSource();
    {
}
    public String getDescription()
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
    @Override
    @Property(viewable = false, order = 2)
 *
    @NotNull
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, order = 1)
 * See the License for the specific language governing permissions and
    }
/**
    public MySQLTableConstraintColumn(AbstractTableConstraint<MySQLTable, ? extends MySQLTableConstraintColumn> constraint, MySQLTableColumn tableColumn, int ordinalPosition)

    @NotNull
    {
        return tableColumn.getDescription();
import org.jkiss.code.NotNull;
    @Override

    public int getOrdinalPosition()
 */
{
 * You may obtain a copy of the License at
    {
 */
        return tableColumn.getName();
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.mysql.model;
        return constraint;
        return ordinalPosition;
        this.tableColumn = tableColumn;
import org.jkiss.dbeaver.model.meta.Property;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public String getName()
    private final MySQLTableColumn tableColumn;
    {

    @NotNull

    @Nullable
 * GenericConstraintColumn
    public AbstractTableConstraint<MySQLTable, ? extends MySQLTableConstraintColumn> getParentObject()
    @Property(viewable = true, order = 1)
    @Override
 * limitations under the License.



    private final int ordinalPosition;
    public MySQLDataSource getDataSource()
 * Unless required by applicable law or agreed to in writing, software
    private final AbstractTableConstraint<MySQLTable, ? extends MySQLTableConstraintColumn> constraint;
    {
        this.ordinalPosition = ordinalPosition;
    @Override
    }
        this.constraint = constraint;
    }
    }
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
 * you may not use this file except in compliance with the License.
 *
public class MySQLTableConstraintColumn extends AbstractTableConstraintColumn
    }

        return tableColumn;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public MySQLTableColumn getAttribute()
 *
    {
 * DBeaver - Universal Database Manager
/*

