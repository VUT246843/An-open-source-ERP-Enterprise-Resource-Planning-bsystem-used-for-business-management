import org.jkiss.code.Nullable;
    )
    {
        int ordinalPosition,


 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    }

    public MySQLTableColumn getReferencedColumn()
 * Unless required by applicable law or agreed to in writing, software

        @Nullable MySQLTableColumn referencedColumn
        super(constraint, tableColumn, ordinalPosition);
    {
        MySQLTableColumn tableColumn,
 *
 * limitations under the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
}
 */
{
        MySQLTableForeignKey constraint,
 * You may obtain a copy of the License at
    private final MySQLTableColumn referencedColumn;
package org.jkiss.dbeaver.ext.mysql.model;
 * See the License for the specific language governing permissions and
    @Nullable
 *
    public MySQLTableForeignKeyColumn(
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        this.referencedColumn = referencedColumn;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

/*
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(id = "reference", viewable = true, order = 4)
 */
        return referencedColumn;
/**
    }
public class MySQLTableForeignKeyColumn extends MySQLTableConstraintColumn implements DBSTableForeignKeyColumn
 *
 * MySQLTableForeignKeyColumn
import org.jkiss.dbeaver.model.meta.Property;
