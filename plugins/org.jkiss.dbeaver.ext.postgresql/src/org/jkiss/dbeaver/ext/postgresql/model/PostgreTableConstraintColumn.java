    private int ordinalPosition;
 *
 */
    @Override

 *
import org.jkiss.code.Nullable;

/**
 * Unless required by applicable law or agreed to in writing, software
    public PostgreAttribute<?> getAttribute()
        return constraint;
        this.constraint = constraint;
    {
 */
 * GenericConstraintColumn
 * See the License for the specific language governing permissions and
    @Override
    }
 * limitations under the License.
 *
    }

{
    @Override
        return tableColumn.getDescription();
    @Override
    @NotNull
 * DBeaver - Universal Database Manager
/*
    {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0



        return ordinalPosition;
    public String getName()
public class PostgreTableConstraintColumn extends AbstractTableConstraintColumn
    }
    @Property(viewable = true, order = 1)
        this.ordinalPosition = ordinalPosition;
    }
    private PostgreAttribute<?> tableColumn;
        return tableColumn.getName();
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
    }
import org.jkiss.dbeaver.model.meta.Property;
    private PostgreTableConstraintBase<?> constraint;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,

    }
        this.tableColumn = tableColumn;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public PostgreTableConstraintBase<?> getParentObject()
    @NotNull
    public PostgreTableConstraintColumn(@NotNull PostgreTableConstraintBase<?> constraint, @NotNull PostgreAttribute<?> tableColumn, int ordinalPosition)
        return tableColumn;
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 1)
    {
    {

}
        return constraint.getTable().getDataSource();
    public int getOrdinalPosition()
    @Property(viewable = false, order = 2)
    @NotNull
    }
    @Nullable
    @Override
    @NotNull
    @NotNull
    {
    public String getDescription()

    {
    @Override
    public PostgreDataSource getDataSource()
package org.jkiss.dbeaver.ext.postgresql.model;
