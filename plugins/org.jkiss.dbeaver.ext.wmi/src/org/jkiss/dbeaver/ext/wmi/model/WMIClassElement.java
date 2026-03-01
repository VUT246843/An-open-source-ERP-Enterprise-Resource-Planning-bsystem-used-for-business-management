

    protected final T element;
        return null;
    public String getName()
 *
/*
    }
public abstract class WMIClassElement<T extends WMIObjectElement> extends WMIPropertySource implements DBSEntityElement
        this.element = element;

    @Property(viewable = true, order = 1)
    }
import org.jkiss.code.Nullable;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected final WMIClass wmiClass;
    {
{
 */
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override

    public boolean isPersisted()
    }
    @Override
        return true;
 * limitations under the License.
import org.jkiss.wmi.service.WMIQualifiedObject;
        return wmiClass.getDataSource();
    protected WMIClassElement(WMIClass wmiClass, T element)
    }
 * See the License for the specific language governing permissions and
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.meta.Property;
 */
    @NotNull



    public String toString()
        this.wmiClass = wmiClass;
    protected WMIQualifiedObject getQualifiedObject()
    }
 * you may not use this file except in compliance with the License.
    public String getDescription()
 * Unless required by applicable law or agreed to in writing, software
        return getName();
    {
 *
 * DBeaver - Universal Database Manager

        return element;
    {
import org.jkiss.dbeaver.model.struct.DBSEntityElement;
    {
import org.jkiss.code.NotNull;
    @NotNull


    @Nullable
package org.jkiss.dbeaver.ext.wmi.model;
    @Override
 * You may obtain a copy of the License at
    @Override
    public WMIClass getParentObject()
    {
    }
        return element.getName();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
    }
    public DBPDataSource getDataSource()
import org.jkiss.wmi.service.WMIObjectElement;
    {
        return wmiClass;
    @Override
    {
    @Override
}
 * Class attribute
    {
