
import org.jkiss.dbeaver.model.DBPSaveableObject;
package org.jkiss.dbeaver.model.impl.jdbc.struct;
        super(table, name, description, constraintType);
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.persisted = persisted;
public abstract class JDBCTableConstraint<TABLE extends JDBCTable, COLUMN extends DBSTableConstraintColumn>


}
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
 */
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
        super(table, source);
    }
 *
    public String getName()
    protected JDBCTableConstraint(TABLE table, DBSEntityConstraint source, boolean persisted) {
    // Copy constructor
/**
        return persisted;
    extends AbstractTableConstraint<TABLE, COLUMN>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        return super.getName();
 * limitations under the License.
import org.jkiss.code.NotNull;

    @Override
import org.jkiss.dbeaver.model.meta.Property;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    implements DBPSaveableObject
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        this.persisted = persisted;

import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * JDBC abstract constraint
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
 * you may not use this file except in compliance with the License.


    {
    @Override
        this.persisted = persisted;
 *
    public void setPersisted(boolean persisted)
 * You may obtain a copy of the License at
    {
    private boolean persisted;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
{
    protected JDBCTableConstraint(TABLE table, String name, @Nullable String description, DBSEntityConstraintType constraintType, boolean persisted) {
    @Override
    @NotNull
    }
 * DBeaver - Universal Database Manager
    }
 *

    public boolean isPersisted()
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
    }
