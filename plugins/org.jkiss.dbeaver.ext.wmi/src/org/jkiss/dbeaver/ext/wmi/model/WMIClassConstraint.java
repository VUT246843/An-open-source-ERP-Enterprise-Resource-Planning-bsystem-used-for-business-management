    }
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return Collections.singletonList(this);
import org.jkiss.dbeaver.model.struct.*;
}
    @NotNull

    public boolean isPersisted()
 * Class constraint
/**

import java.util.Collections;
    @Override
    @NotNull
 *
 */
 * You may obtain a copy of the License at

    @Override

        return null;
 * limitations under the License.
 * See the License for the specific language governing permissions and
    {
    @Override
    {
    {
    @Override
    public DBSEntityAttribute getAttribute()
        this.key = key;
    {
    }
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getName()
    public DBSEntity getParentObject()
/*
        return key;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    }
    public DBPDataSource getDataSource()

 * DBeaver - Universal Database Manager
    public String getDescription()
    public DBSEntityConstraintType getConstraintType()
{
    public List<? extends DBSEntityAttributeRef> getAttributeReferences(DBRProgressMonitor monitor)
import java.util.List;
 */

 *
 * Unless required by applicable law or agreed to in writing, software
        this.owner = owner;
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final WMIClass owner;
    }
    @Override
    @Override

import org.jkiss.dbeaver.model.DBPDataSource;
    @NotNull
    {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.wmi.model;

    @Override
    private final WMIClassAttribute key;
        return owner.getDataSource();
        return true;
 *
        return owner;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return DBSEntityConstraintType.UNIQUE_KEY;
    @Nullable
        return key.getName();

    @Override
    @NotNull
    }
    {

    }

    public WMIClassConstraint(WMIClass owner, WMIClassAttribute key)
    {
import org.jkiss.code.NotNull;
public class WMIClassConstraint implements DBSEntityConstraint, DBSEntityReferrer, DBSEntityAttributeRef
