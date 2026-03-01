    protected String name;
    @Property(viewable = true, editable = true, order = 2, listProvider = TriggerTimingListProvider.class)
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.DBPSaveableObject;
        @Nullable
{

    {
        return name;
    public void setPersisted(boolean persisted) {
    }
 * you may not use this file except in compliance with the License.
    @Override

 * AbstractTrigger
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
    public DBSActionTiming getActionTiming()
        }
    @Override
    @NotNull
    protected AbstractTrigger(boolean persisted)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    public void setActionTiming(DBSActionTiming actionTiming)
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others


 */
            return new Object[] {
    {
                DBSActionTiming.BEFORE,
    public boolean isPersisted()
import org.jkiss.dbeaver.model.DBPQualifiedObject;

                DBSManipulationType.DELETE
        this.name = tableName;
 *
package org.jkiss.dbeaver.model.impl.struct;
    public static class TriggerTypeListProvider implements IPropertyValueListProvider {
/**
import org.jkiss.code.NotNull;
    }

        @Override
    {
 * You may obtain a copy of the License at
    @Property(viewable = true, editable = true, order = 3, listProvider = TriggerTypeListProvider.class)
        public Object[] getPossibleValues(Object object) {
    {
    }
        @Nullable
        public boolean allowCustomValue() {
        this.description = description;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    }
        this.manipulationType = manipulationType;
import org.jkiss.dbeaver.model.meta.Property;
 */
            return new Object[] {
            return false;

                DBSManipulationType.INSERT,
    @Property(viewable = true, order = 1)
    @Override
    protected void setDescription(String description)
        return actionTiming;

import org.jkiss.code.Nullable;
    }


    private DBSManipulationType manipulationType;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.description = description;
    }

                DBSManipulationType.UPDATE,
        this.persisted = persisted;

    private DBSActionTiming actionTiming;
        return manipulationType;
 * limitations under the License.
            };
    }
    {
    public static class TriggerTimingListProvider implements IPropertyValueListProvider {
    }
        }
    }
    }
        this.actionTiming = actionTiming;
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
        public Object[] getPossibleValues(Object object) {
    {
 * DBeaver - Universal Database Manager
        @Override

    {
    public String getDescription()
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;

        this.name = name;
    {
import org.jkiss.dbeaver.model.meta.PropertyLength;
 *
/*
    public void setManipulationType(DBSManipulationType manipulationType)

 * See the License for the specific language governing permissions and
    public String getName()
    }
import org.jkiss.dbeaver.model.struct.DBSActionTiming;
    }

        this.persisted = persisted;

    protected AbstractTrigger(String name, String description, boolean persisted)
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    {
            return false;
    public DBSManipulationType getManipulationType()
        }
    {
                DBSActionTiming.AFTER
        this.persisted = persisted;

public abstract class AbstractTrigger implements DBSTrigger, DBPQualifiedObject, DBPSaveableObject

    {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return description;
        public boolean allowCustomValue() {
            };
        @Override
    private boolean persisted;
    public void setName(String tableName)
    private String description;


        return persisted;
}
