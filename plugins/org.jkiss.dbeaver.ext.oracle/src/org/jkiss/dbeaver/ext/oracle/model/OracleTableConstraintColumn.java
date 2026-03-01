        this.ordinalPosition = ordinalPosition;
    }
import org.jkiss.dbeaver.model.meta.Property;
    @Override
        return ordinalPosition;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

    {
    }


    private final AbstractTableConstraint<OracleTableBase, OracleTableConstraintColumn> constraint;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
    public OracleTableColumn getAttribute()


        return tableColumn.getName();
    @Property(viewable = true, order = 1)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.tableColumn = tableColumn;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;

    {
    {
    private final int ordinalPosition;
    @Property(viewable = false, order = 2)
 */
    @NotNull
/**
    public String getDescription()
    {
    }
 *
    {
    private final OracleTableColumn tableColumn;
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
 * GenericConstraintColumn
}
 * Licensed under the Apache License, Version 2.0 (the "License");
    public OracleTableConstraintColumn(AbstractTableConstraint<OracleTableBase, OracleTableConstraintColumn> constraint, OracleTableColumn tableColumn, int ordinalPosition)
        this.constraint = constraint;
    @NotNull
    @Override
    }
    {
    public OracleDataSource getDataSource()
package org.jkiss.dbeaver.ext.oracle.model;
    @Override
        return constraint;
    public AbstractTableConstraint<OracleTableBase, OracleTableConstraintColumn> getParentObject()
    @Override
    @NotNull
    }
    }
    @Nullable
    @Override

    public int getOrdinalPosition()

        return constraint.getTable().getDataSource();
        return tableColumn;
    public String getName()
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
/*
 * limitations under the License.


    {
    @Property(viewable = true, order = 1)
{
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
 * You may obtain a copy of the License at
 *
    @Override
 *
        return tableColumn.getDescription();
public class OracleTableConstraintColumn extends AbstractTableConstraintColumn
