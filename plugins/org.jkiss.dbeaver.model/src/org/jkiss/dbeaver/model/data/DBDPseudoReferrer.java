package org.jkiss.dbeaver.model.data;
    @Override
    @Override
        return DBSEntityConstraintType.PSEUDO_KEY;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;

        this.entity = entity;
 *
    public DBSEntity getParentObject()
    {
    {
    public boolean isPersisted()
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBSEntityConstraintType getConstraintType()
    {
        return entity.getDataSource();
    @Override
}
import org.jkiss.code.NotNull;
    public DBPDataSource getDataSource()
    }
    @Nullable
    {
    }
    private final DBSEntity entity;
    }
import org.jkiss.dbeaver.model.struct.*;
    {
    @NotNull
public class DBDPseudoReferrer implements DBSEntityReferrer, DBSEntityAttributeRef {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBSEntityAttribute getAttribute()
    }


        return Collections.singletonList(this);

        return attribute == null ? null : attribute.getDescription();
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
    }
        return binding.getEntityAttribute();
    @Override

        final DBSEntityAttribute attribute = getAttribute();

    {
    @Override
 * Pseudo attribute
        return true;

import java.util.Collections;
    public String getName()
 */
    }
 * DBeaver - Universal Database Manager
    @NotNull
    {
    }
 */
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final DBDAttributeBinding binding;
        this.binding = binding;
    @NotNull

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.model.DBPDataSource;
        return entity;
 * Unless required by applicable law or agreed to in writing, software
/**
    {
    @Override

 *
    @Override
    @NotNull
    @NotNull

    public String getDescription()
    @Override
    public List<? extends DBSEntityAttributeRef> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException

    public DBDPseudoReferrer(DBSEntity entity, DBDAttributeBinding binding) {
        return DBSEntityConstraintType.PSEUDO_KEY.getName();

 * See the License for the specific language governing permissions and
    }
 * You may obtain a copy of the License at
    }
