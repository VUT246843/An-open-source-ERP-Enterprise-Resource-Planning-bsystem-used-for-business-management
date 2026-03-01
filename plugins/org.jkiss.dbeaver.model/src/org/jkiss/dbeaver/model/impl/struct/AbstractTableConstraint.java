        this.table = table;

    @NotNull

    @NotNull
        this.constraintType = constraintType;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
    @NotNull

        return name;
    public void setName(@NotNull String name) {
        this.description = source.getDescription();

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public boolean isPersisted() {
    protected AbstractTableConstraint(TABLE table, DBSEntityConstraint source) {
}

        this.name = source.getName();
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
    public String getName() {
    private String name;
    public void setDescription(String description) {
        this.constraintType = source.getConstraintType();
    }
    }

 *

    @Override
    @Property(id = "owner", viewable = true, order = 2)
package org.jkiss.dbeaver.model.impl.struct;
import java.util.List;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        this.description = description;
    }
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPNamedObject2;
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
 * GenericConstraint
 *
 * Unless required by applicable law or agreed to in writing, software
        this.name = name;

    }
    implements DBSTableConstraint, DBPNamedObject2
public abstract class AbstractTableConstraint<TABLE extends DBSTable, CON_COLUMN extends DBSTableConstraintColumn>


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return table;
    @Override
 */
import org.jkiss.dbeaver.model.meta.Property;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 3)
    @Property(viewable = true, order = 1)
    public abstract void setAttributeReferences(List<CON_COLUMN> columns) throws DBException;
 *
        throw new DBCFeatureNotSupportedException("Attribute add is not supported for " + getClass().getSimpleName());
    //    @Property(name = "Description", viewable = true, order = 100)
        this.description = description;
    public void setConstraintType(DBSEntityConstraintType constraintType) {
 * you may not use this file except in compliance with the License.
    public void addAttributeReference(DBSTableColumn column) throws DBException {
    private final TABLE table;
    @Override
    public String getDescription() {
        this.table = table;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
/**
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;

        return true;

    public String toString() {
        this.name = name;
    public abstract List<CON_COLUMN> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException;
    public DBSEntityConstraintType getConstraintType() {
    @Override
 */
        return description;

    }
    @Nullable
    // Copy constructor
 * limitations under the License.
{
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    protected AbstractTableConstraint(TABLE table, String name, String description, DBSEntityConstraintType constraintType) {
    }
    @Nullable
        return constraintType;
    }
        return table;
    }
        this.constraintType = constraintType;

 * You may obtain a copy of the License at
    public TABLE getTable() {
    }
    protected String description;

    @Override

/*
import org.jkiss.code.Nullable;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.DBException;
    public TABLE getParentObject() {
        return getName() == null ? "<NONE>" : getName();
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
    protected DBSEntityConstraintType constraintType;
