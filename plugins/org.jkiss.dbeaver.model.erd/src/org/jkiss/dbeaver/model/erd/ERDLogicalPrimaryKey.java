        this.description = description;
    }

    @Override

    {
    @Override
    {
import org.jkiss.dbeaver.model.DBPDataSource;
        this.name = name;
    @Override
    private final String description;
    {
    public DBSEntityConstraintType getConstraintType()
    public ERDLogicalPrimaryKey(ERDElement<?> entity, String name, String description)

    @NotNull
 *
    private final Object entity;
import org.jkiss.code.Nullable;
    }
    {
 * limitations under the License.
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * you may not use this file except in compliance with the License.
        return entity instanceof DBSEntity ? (DBSEntity) entity : null;
    public String getDescription()
 * Unless required by applicable law or agreed to in writing, software
    public List<? extends DBSEntityAttributeRef> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
    public boolean isPersisted()
    private final String name;
    private final List<? extends DBSTableConstraintColumn> columns = new ArrayList<>();

    {
    @Override
        return description;
    }

 * See the License for the specific language governing permissions and
    {
    }
 *
        return entity instanceof DBSObject ? ((DBSObject) entity).getDataSource() : null;
/*
    @NotNull
        return name;
    @Nullable
    public DBPDataSource getDataSource()
    @Override

        return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 * Logical primary key
public class ERDLogicalPrimaryKey implements DBSEntityConstraint,DBSEntityReferrer {

    {
import java.util.List;
    }


 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
import java.util.ArrayList;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.*;

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.erd;
    }
    {
        this.entity = entity.getObject();
        return columns;
    @NotNull
        return DBSEntityConstraintType.PRIMARY_KEY;

    }
    public String getName()
    public DBSEntity getParentObject()
 *
 * You may obtain a copy of the License at
    @Override

    @NotNull
