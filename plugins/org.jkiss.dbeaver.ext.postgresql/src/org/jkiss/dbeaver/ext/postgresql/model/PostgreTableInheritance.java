    public boolean isInherited() {
        return null;

    private int sequenceNum;
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
        boolean persisted)
 *
    @Property(viewable = true)
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        this.setPersisted(persisted);
    public PostgreTableInheritance(
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
 *
        @NotNull PostgreTableBase table,
import org.jkiss.dbeaver.DBException;
        return this.superTable;

    @Override
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    private final PostgreTableBase superTable;
    public PostgreTableBase getAssociatedEntity() {
import java.util.List;
 *
}
public class PostgreTableInheritance extends PostgreTableConstraintBase<PostgreTableConstraintColumn> implements DBSEntityAssociation
    }
{
        this.superTable = superTable;
    }
        @NotNull PostgreTableBase superTable,
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true)
package org.jkiss.dbeaver.ext.postgresql.model;
    @Override
        throw new DBCFeatureNotSupportedException();
        super(table,
    void cacheAttributes(DBRProgressMonitor monitor, List<? extends PostgreTableConstraintColumn> children, boolean secondPass) {
        int sequenceNum,
        return sequenceNum;



    public int getSequenceNum() {

    @Nullable
 * You may obtain a copy of the License at
    public List<PostgreTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
    public void setAttributeReferences(List<PostgreTableConstraintColumn> postgreTableConstraintColumns) throws DBException {
 * PostgreTableInheritance
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    @Override

import org.jkiss.dbeaver.model.DBPEvaluationContext;


    }
/*
    public DBSEntityConstraint getReferencedConstraint() {
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.meta.Property;
    @Nullable

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "->" + superTable.getFullyQualifiedName(DBPEvaluationContext.DDL),
        return false;
import org.jkiss.code.Nullable;
 * limitations under the License.


        return this;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // Inheritance itself can't be inherited
 * See the License for the specific language governing permissions and
        this.sequenceNum = sequenceNum;
    @Nullable
    {
            DBSEntityConstraintType.INHERITANCE);
    }
    @Override
    }
    @Override
 */
 */
    @Override
 * Unless required by applicable law or agreed to in writing, software
    }
