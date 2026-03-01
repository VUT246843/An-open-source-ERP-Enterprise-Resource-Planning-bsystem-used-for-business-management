    {
    }
    {
    private final String description;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSource;

 */

    }
import java.util.List;
        return pk.getParentObject();
    @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    public DBPDataSource getDataSource()


 *     http://www.apache.org/licenses/LICENSE-2.0
/**
        return false;
 * you may not use this file except in compliance with the License.
    {
package org.jkiss.dbeaver.model.erd;
    }
 * Logical foreign key

    {
    }
    }
 *
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    public List<? extends DBSEntityAttributeRef> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
        return description;
        return Collections.emptyList();
    @Override
    @Nullable
    @Override
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


 *
    {
}
    {
    {
    {
    public DBSEntity getAssociatedEntity()
        this.name = name;
    }

import org.jkiss.code.NotNull;

    public ERDLogicalAssociation(ERDElement<?> entity, String name, String description, ERDLogicalPrimaryKey pk)
        this.description = description;
    @Override
    @Override
 *
        return pk;
        return entity instanceof ERDEntity ? ((ERDEntity)entity).getObject() : null;
    public boolean isPersisted()
    public DBSEntity getParentObject()
 * You may obtain a copy of the License at
    @Override
    {
        return ERDConstants.CONSTRAINT_LOGICAL_FK;
    @Nullable
import org.jkiss.code.Nullable;
        this.entity = entity;
 */
    }
    private final String name;
    public DBSEntityConstraint getReferencedConstraint()
public class ERDLogicalAssociation implements DBSEntityAssociation, DBSEntityReferrer {

        this.pk = pk;
import org.jkiss.dbeaver.model.struct.*;
    public String getDescription()

    @NotNull
    public DBSEntityConstraintType getConstraintType()

 * Copyright (C) 2010-2025 DBeaver Corp and others

        return entity instanceof ERDEntity ? ((ERDEntity) entity).getDataSource() : null;
    private final ERDLogicalPrimaryKey pk;
/*
    }
    private ERDElement entity;
    @Override
    @Override
    @NotNull
    public String getName()
 * DBeaver - Universal Database Manager
        return name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
import java.util.Collections;
 * limitations under the License.
 * See the License for the specific language governing permissions and
    @Override
