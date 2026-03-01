 * You may obtain a copy of the License at
            if (ar != null) {


        return null;

/**
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
        if (referencedConstraint != null) {
        DB2TableUniqueKey referencedConstraint = ((DB2TableForeignKey) getParentObject()).getReferencedConstraint();
 * DB2 Table Foreign Key Column
import java.util.List;
 *
 * DBeaver - Universal Database Manager
public class DB2TableForeignKeyColumn extends DB2TableKeyColumn implements DBSTableForeignKeyColumn {
    @Override
        super(constraint, tableColumn, ordinalPosition);
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.db2.model;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
    @Property(id = "reference", viewable = true, order = 4)

 * limitations under the License.
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            List<DB2TableKeyColumn> ar = referencedConstraint.getAttributeReferences(new VoidProgressMonitor());
 */
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
import org.jkiss.dbeaver.model.meta.Property;
    public DB2TableColumn getReferencedColumn() {

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
                return ar.get(getOrdinalPosition() - 1).getAttribute();
 */
    public DB2TableForeignKeyColumn(AbstractTableConstraint<DB2Table, ? extends DB2TableKeyColumn> constraint, DB2TableColumn tableColumn, Integer ordinalPosition) {
 *
