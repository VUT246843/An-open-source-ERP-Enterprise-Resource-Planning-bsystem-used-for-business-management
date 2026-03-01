    }
    // -----------------

    @Property(id = "name", viewable = true, order = 1)
 * Licensed under the Apache License, Version 2.0 (the "License");
    {

        return tableColumn;
    @Override
 * You may obtain a copy of the License at
    public String getDescription()
    private final DB2TableCheckConstraintColUsage usage;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    public DB2TableCheckConstraintColumn(
 *     http://www.apache.org/licenses/LICENSE-2.0
    }


 * @author Denis Forveille
    // -----------------
 * 
    @Override
    @Override
        DB2TableColumn tableColumn,
    @NotNull
        return constraint.getTable().getDataSource();
    }
/*
 * See the License for the specific language governing permissions and
    {
        return tableColumn.getDescription();

 * DBeaver - Universal Database Manager
        return 0;
        this.tableColumn = tableColumn;

import org.jkiss.dbeaver.model.meta.Property;
    public AbstractTableConstraint<DB2Table, DB2TableCheckConstraintColumn> getParentObject()
 *
    @Property(hidden = true)
 * DB2 Table Constraint Column
 *
    public DB2DataSource getDataSource()
    private final AbstractTableConstraint<DB2Table, DB2TableCheckConstraintColumn> constraint;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DB2TableCheckConstraintColUsage usage)
    {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableCheckConstraintColUsage;
    {
    }
    // Check Constraint columns do not have ordinal position...
    {
    }
    @Override
    public DB2TableColumn getAttribute()
    @Override
package org.jkiss.dbeaver.ext.db2.model;
    {
    {

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 */
        this.constraint = constraint;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
}

    }
    private final DB2TableColumn tableColumn;

import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;

 * you may not use this file except in compliance with the License.
    // -----------------

    @NotNull
        this.usage = usage;
    @NotNull
/**
        return usage;

    // -----------------
    @Property(viewable = true, order = 2)
    public int getOrdinalPosition()

 */
    // Constructors
 *
    @Nullable
    // Properties
        return tableColumn.getName();
        return constraint;
        AbstractTableConstraint<DB2Table, DB2TableCheckConstraintColumn> constraint,
import org.jkiss.code.Nullable;
    public DB2TableCheckConstraintColUsage getUsage()
    @Override
public class DB2TableCheckConstraintColumn extends AbstractTableConstraintColumn {

 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    public String getName()
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraintColumn;
