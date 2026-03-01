 *
}
        GenericTableForeignKey constraint,
        return getName();
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final GenericTableColumn referencedColumn;
        GenericTableColumn referencedColumn
 * DBeaver - Universal Database Manager
public class GenericTableForeignKeyColumnTable extends GenericTableConstraintColumn implements DBSTableForeignKeyColumn {
 * you may not use this file except in compliance with the License.
    }
 *
package org.jkiss.dbeaver.ext.generic.model;
        int ordinalPosition,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        super(constraint, tableColumn, ordinalPosition);

 * You may obtain a copy of the License at
/*
 * GenericTableConstraintColumn
    public GenericTableForeignKeyColumnTable(


        this.referencedColumn = referencedColumn;
    ) {
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
    public GenericTableColumn getReferencedColumn() {
 * Unless required by applicable law or agreed to in writing, software
/**
    public String toString() {
    @Property(id = "reference", viewable = true, order = 4)
 * limitations under the License.
        GenericTableColumn tableColumn,
 *

import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
        return referencedColumn;
 */
 */
    }
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
