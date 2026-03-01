import org.jkiss.code.Nullable;
        return tableColumn.getName();
        return constraint;
    }
    // -----------------
    // Properties
    private final AbstractTableConstraint<ExasolTable, ? extends ExasolTableKeyColumn> constraint;
    }
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
    }
 *

    @NotNull
        return constraint.getTable().getDataSource();
import org.jkiss.dbeaver.model.DBPDataSource;
    public ExasolTableColumn getAttribute() {
 * DBeaver - Universal Database Manager
    }
    @Override

package org.jkiss.dbeaver.ext.exasol.model;

    public String getName() {
    // -----------------
}
    @Override
 *
    public AbstractTableConstraint<ExasolTable, ? extends ExasolTableKeyColumn> getParentObject() {
    }
    @Nullable
/*
    public DBPDataSource getDataSource() {
    @Property(id = "name", viewable = true, order = 1)
    public int getOrdinalPosition() {

    // Constructors
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)


 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    private final ExasolTableColumn tableColumn;

    public String getDescription() {
    }
    // -----------------
    @NotNull
    @Override

    @NotNull
        this.tableColumn = tableColumn;
import org.jkiss.dbeaver.model.meta.Property;

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.ordinalPosition = ordinalPosition;
public class ExasolTableKeyColumn extends AbstractTableConstraintColumn {
 */

    }
 * You may obtain a copy of the License at
        return ordinalPosition;

    private final Integer ordinalPosition;
    @Override


 * limitations under the License.
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
    public ExasolTableKeyColumn(AbstractTableConstraint<ExasolTable, ? extends ExasolTableKeyColumn> constraint, ExasolTableColumn tableColumn, Integer ordinalPosition) {
 * you may not use this file except in compliance with the License.
        this.constraint = constraint;
        return tableColumn.getDescription();
/**
    // -----------------
 * @author Karl Griesser


    @Property(viewable = true, editable = false, order = 3)
        return tableColumn;
    @Override
 *
