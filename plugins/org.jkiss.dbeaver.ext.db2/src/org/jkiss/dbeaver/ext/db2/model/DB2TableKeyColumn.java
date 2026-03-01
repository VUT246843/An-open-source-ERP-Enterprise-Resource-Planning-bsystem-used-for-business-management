 * @author Denis Forveille
    }

    @Override

        this.constraint = constraint;
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

    }
        return constraint.getTable().getDataSource();
 * Unless required by applicable law or agreed to in writing, software
 */
    }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        return tableColumn;
    @Nullable
    @NotNull


import org.jkiss.code.NotNull;
 * DB2 Table Constraint Column
    // -----------------
 *
 */

    }
import org.jkiss.dbeaver.model.meta.Property;
 *
    {
        return tableColumn.getDescription();
    private DB2TableColumn tableColumn;
    public DB2TableKeyColumn(AbstractTableConstraint<DB2Table, ? extends DB2TableKeyColumn> constraint, DB2TableColumn tableColumn, Integer ordinalPosition)
        this.tableColumn = tableColumn;
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
/**
    // -----------------
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
    @Property(id = "name", viewable = true, order = 1)
package org.jkiss.dbeaver.ext.db2.model;
        return constraint;
 * You may obtain a copy of the License at



    // Constructors
    {
    {
public class DB2TableKeyColumn extends AbstractTableConstraintColumn {
    public AbstractTableConstraint<DB2Table, ? extends DB2TableKeyColumn> getParentObject()
 * limitations under the License.
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
    public DB2DataSource getDataSource()
    public int getOrdinalPosition()
    {
    // -----------------
    public String getName()
    {
    // -----------------
    @Override
 *
    private Integer ordinalPosition;
import org.jkiss.code.Nullable;
    }
    @NotNull
        return ordinalPosition;
    }
        this.ordinalPosition = ordinalPosition;
    public String getDescription()
    @Override
    @Override

 * DBeaver - Universal Database Manager
    private AbstractTableConstraint<DB2Table, ? extends DB2TableKeyColumn> constraint;
    @Property(viewable = true, editable = false, order = 3)
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {
    }
 * See the License for the specific language governing permissions and
    public DB2TableColumn getAttribute()

 * you may not use this file except in compliance with the License.
    // Properties
        return tableColumn.getName();
 * 
