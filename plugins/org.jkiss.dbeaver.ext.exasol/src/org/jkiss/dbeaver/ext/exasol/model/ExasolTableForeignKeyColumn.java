 * See the License for the specific language governing permissions and
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        ExasolTableForeignKey foreignKey,

 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
/*
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        super(foreignKey, tableColumn, ordinalPosition);
 * Foreign key column
    }
    private final ExasolTableColumn refColumn;

        return refColumn;
public class ExasolTableForeignKeyColumn extends ExasolTableKeyColumn implements DBSTableForeignKeyColumn {

 * DBeaver - Universal Database Manager
 *
    {
/**
        ExasolTableColumn refColumn,

}
 * limitations under the License.

 *
 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.ext.exasol.model;
    public ExasolTableForeignKeyColumn(
 * You may obtain a copy of the License at
        Integer ordinalPosition)
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
        this.refColumn = refColumn;

        ExasolTableColumn tableColumn,
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 */
    public DBSEntityAttribute getReferencedColumn() {
