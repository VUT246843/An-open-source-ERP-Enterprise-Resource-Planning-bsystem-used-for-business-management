 * you may not use this file except in compliance with the License.
    }
 */

    }
}
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSEntity;
 *
    @Nullable

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(wmiClass, attribute);
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;

    {
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
    @Override

    public DBSEntity getAssociatedEntity()
        return DBSEntityConstraintType.ASSOCIATION;
        return refClass;
    private WMIClass refClass;
package org.jkiss.dbeaver.ext.wmi.model;
public class WMIClassReference extends WMIClassAttribute implements DBSEntityAssociation
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull

    }
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

        return null;
    public DBSEntityConstraint getReferencedConstraint()
/**
 * Class association
        this.refClass = refClass;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
{
 */
 *
    @Override
    public DBSEntityConstraintType getConstraintType()
 * You may obtain a copy of the License at
    {
/*
 *
import org.jkiss.code.NotNull;
import org.jkiss.wmi.service.WMIObjectAttribute;
    }
    @Nullable
    {
    protected WMIClassReference(WMIClass wmiClass, WMIObjectAttribute attribute, WMIClass refClass)
