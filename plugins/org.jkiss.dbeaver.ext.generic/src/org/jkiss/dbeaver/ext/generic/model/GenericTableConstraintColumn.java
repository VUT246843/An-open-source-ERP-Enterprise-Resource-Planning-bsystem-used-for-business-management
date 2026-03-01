        return ordinalPosition;
        return constraint;
    @Override
    private final JDBCTableConstraint constraint;
 * DBeaver - Universal Database Manager
        this.ordinalPosition = column.ordinalPosition;
package org.jkiss.dbeaver.ext.generic.model;
 * Unless required by applicable law or agreed to in writing, software
    public String getDescription() {
 *
import org.jkiss.dbeaver.model.meta.Property;

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * GenericTableConstraintColumn
    }

public class GenericTableConstraintColumn extends AbstractTableConstraintColumn {
    @Override
    public GenericTableColumn getAttribute() {
    @NotNull
    @Property(id = "name", viewable = true, order = 1)
import org.jkiss.code.NotNull;
        this.tableColumn = column.tableColumn;
    public GenericTableConstraintColumn(GenericTableConstraint constraint, GenericTableConstraintColumn column) {
    @NotNull
 *



    private final int ordinalPosition;
        this.tableColumn = tableColumn;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
    }
        this.constraint = constraint;
    public int getOrdinalPosition() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

    @Override
/*
    @Property(viewable = false, order = 2)
        return tableColumn;
 * limitations under the License.
    public String getName() {

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.constraint = constraint;
 * You may obtain a copy of the License at
    public JDBCTableConstraint getParentObject() {
import org.jkiss.code.Nullable;
 */

        this.ordinalPosition = ordinalPosition;
        return tableColumn.getName();
        return (GenericDataSource) constraint.getDataSource();
    }
        return tableColumn.getDescription();
    }
/**
    public GenericDataSource getDataSource() {

    @Override
 */
    public GenericTableConstraintColumn(JDBCTableConstraint constraint, GenericTableColumn tableColumn, int ordinalPosition) {
    private final GenericTableColumn tableColumn;


}
    }
    @Nullable
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 *
    //    @Property(name = "Description", viewable = true, order = 100)
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
    @Override
