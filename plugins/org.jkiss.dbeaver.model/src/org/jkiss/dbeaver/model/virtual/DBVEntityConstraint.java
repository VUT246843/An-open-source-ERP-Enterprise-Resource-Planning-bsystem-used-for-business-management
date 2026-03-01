 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
    }
    }
    {

        return type;


    public DBVEntity getParentObject()
        return useAllColumns || !attributes.isEmpty();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean hasAttributes()
 */
        if (attributes.size() == 1) {
        }
import java.util.ArrayList;

    public DBVEntityConstraint(@NotNull DBVEntity entity, DBSEntityConstraintType type, String name)
    public DBVEntity getEntity() {
import org.jkiss.dbeaver.model.struct.*;
/*
    }
    @Nullable
 * limitations under the License.
    }
{
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBPDataSource getDataSource()
        return entity.getDataSource();



        this.name = copy.name;
    @NotNull
            DBSEntityAttribute attribute = attributes.get(0).getAttribute();
    public String getName()
    }


        attributes.add(new DBVEntityConstraintColumn(this, name));
            if (attribute instanceof DBSAttributeEnumerable) {
/**
    public DBSEntityConstraintType getConstraintType()
        }
        for (DBVEntityConstraintColumn col : copy.attributes) {
    @Override
 *
import java.util.List;
    public void setUseAllColumns(boolean useAllColumns) {


    public List<DBVEntityConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
    public boolean isUseAllColumns() {
    public void addAttribute(String name)
        return name;
    {
    private DBSAttributeEnumerable getEnumAttr() {
        this.name = (name == null ? type.getName() : name);
    }
        this.type = copy.type;
    private boolean useAllColumns = false;
import org.jkiss.code.NotNull;
        this.useAllColumns = useAllColumns;
    {
    {
        return null;

    {
    @Override
    private final List<DBVEntityConstraintColumn> attributes = new ArrayList<>();
    private DBSEntityConstraintType type;
    @NotNull
    @Override
public class DBVEntityConstraint implements DBSEntityConstraint, DBSEntityReferrer
    }
        return true;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.entity = entity;
    }
        attributes.clear();
    private final DBVEntity entity;
    {
 *
import java.util.Collection;
    {

    {
    @Override
        return entity;
    private String name;
    }
 * Unless required by applicable law or agreed to in writing, software
        return entity;
    }

    {
 * See the License for the specific language governing permissions and

    public String getDescription()
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull
    }
    public DBVEntityConstraint(@NotNull DBVEntity entity, DBVEntityConstraint copy) {

package org.jkiss.dbeaver.model.virtual;
import org.jkiss.code.Nullable;
    }
 *
    @Override
 * DBeaver - Universal Database Manager

        this.type = type;
    @Override
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public void setAttributes(Collection<DBSEntityAttribute> realAttributes)
            this.attributes.add(new DBVEntityConstraintColumn(this, col));
        return null;
    @NotNull
        }
        return attributes;
                return (DBSAttributeEnumerable) attribute;
        this.name = name;


    @NotNull
            attributes.add(new DBVEntityConstraintColumn(this, attr.getName()));
        this.entity = entity;
            }
        this.useAllColumns = copy.useAllColumns;
        return attributes;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.DBPDataSource;
    }
    public boolean isPersisted()
    {

    @Override
    public List<DBVEntityConstraintColumn> getAttributes() {
}
 */
    public void setName(String name)
    {
    {
        return useAllColumns;
    }
        for (DBSEntityAttribute attr : realAttributes) {
    }
    }
 * Virtual constraint
