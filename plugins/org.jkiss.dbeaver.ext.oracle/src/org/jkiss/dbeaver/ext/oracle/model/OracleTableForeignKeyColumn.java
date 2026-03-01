 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
{
        }
            }

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;

            if (ar != null) {
/**
 * you may not use this file except in compliance with the License.
                return ar.get(getOrdinalPosition() - 1).getAttribute();
 * You may obtain a copy of the License at
public class OracleTableForeignKeyColumn extends OracleTableConstraintColumn implements DBSTableForeignKeyColumn
}

 */
    public OracleTableForeignKeyColumn(
 * See the License for the specific language governing permissions and
        int ordinalPosition)
    {
import org.jkiss.dbeaver.model.meta.Property;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
        if (referencedConstraint != null) {
        OracleTableForeignKey constraint,
    public OracleTableColumn getReferencedColumn()
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * GenericConstraintColumn

/*
    {
        OracleTableConstraint referencedConstraint = ((OracleTableForeignKey) getParentObject()).getReferencedConstraint();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 *


        OracleTableColumn tableColumn,
package org.jkiss.dbeaver.ext.oracle.model;
import java.util.List;
            List<OracleTableConstraintColumn> ar = referencedConstraint.getAttributeReferences(new VoidProgressMonitor());
 */
    @Property(id = "reference", viewable = true, order = 4)
 * DBeaver - Universal Database Manager
    }
        super(constraint, tableColumn, ordinalPosition);
