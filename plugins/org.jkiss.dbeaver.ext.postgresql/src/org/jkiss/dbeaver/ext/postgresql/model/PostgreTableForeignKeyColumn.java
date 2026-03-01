import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
    public PostgreAttribute getReferencedColumn()
        PostgreTableForeignKey constraint,
        this.referencedColumn = referencedColumn;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.meta.Property;
 *
package org.jkiss.dbeaver.ext.postgresql.model;
}
 *
        int ordinalPosition,
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
        super(constraint, tableColumn, ordinalPosition);
{
    @Property(id = "reference", viewable = true, order = 4)
        return referencedColumn;
 * Unless required by applicable law or agreed to in writing, software
 *
 */
/*
/**
 */
    {
    @Override
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    private PostgreAttribute referencedColumn;
 * limitations under the License.


    public PostgreTableForeignKeyColumn(
public class PostgreTableForeignKeyColumn extends PostgreTableConstraintColumn implements DBSTableForeignKeyColumn
 * GenericConstraintColumn
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        PostgreAttribute referencedColumn)
        PostgreAttribute tableColumn,
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 * DBeaver - Universal Database Manager
