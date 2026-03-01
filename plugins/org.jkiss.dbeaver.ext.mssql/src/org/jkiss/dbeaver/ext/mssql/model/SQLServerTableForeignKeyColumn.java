
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;


 *
        SQLServerTableForeignKey constraint,
 * SQLServerTableForeignKeyColumn
 * Licensed under the Apache License, Version 2.0 (the "License");
/**

 */
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    public SQLServerTableColumn getReferencedColumn()
    {
        SQLServerTableColumn referencedColumn)
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    @Property(id = "reference", viewable = true, order = 4)
{
    {
    private SQLServerTableColumn referencedColumn;
    }
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.mssql.model;
 *
        int ordinalPosition,
import org.jkiss.dbeaver.model.meta.Property;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.referencedColumn = referencedColumn;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
        return referencedColumn;
 * limitations under the License.
        super(constraint, tableColumn, ordinalPosition);
 *
    public SQLServerTableForeignKeyColumn(
    @Override
        SQLServerTableColumn tableColumn,
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
public class SQLServerTableForeignKeyColumn extends SQLServerTableUniqueKeyColumn implements DBSTableForeignKeyColumn
