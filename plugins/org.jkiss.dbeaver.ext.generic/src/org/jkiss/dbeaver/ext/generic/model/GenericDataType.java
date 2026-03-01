    @Property(viewable = true, order = 1)
import org.jkiss.dbeaver.model.DBPDataKind;
        return super.getPrecision();
 * You may obtain a copy of the License at
    @NotNull
    }
    public GenericDataType(GenericStructContainer owner, int valueType, String name, @Nullable String remarks, boolean unsigned, boolean searchable, int precision, int minScale, int maxScale) {
        return super.getDescription();
 *
    }
import org.jkiss.dbeaver.model.meta.Property;
    {
    @Override
    }

    public GenericDataType(GenericStructContainer owner, DBSTypedObject typed) {
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Property(viewable = true, order = 25)
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
 * Unless required by applicable law or agreed to in writing, software
    @Override
        super(owner, typed);
    @Nullable
        return super.getMaxScale();
    public Integer getPrecision()
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * GenericDataType
    @Override
        return super.getName();
}

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return super.getMinScale();

public class GenericDataType extends JDBCDataType<GenericStructContainer> {
    @Override

 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.generic.model;

    {
    {
    @Override
 *
        super(owner, valueType, name, remarks, unsigned, searchable, precision, minScale, maxScale);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 20)
    public int getMinScale()
    @Override
    }
    @Property(viewable = true, order = 26)
    }

    public DBPDataKind getDataKind() {
    @NotNull
 * you may not use this file except in compliance with the License.
    public String getDescription()
    public int getMaxScale()

    public String getName()
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable

 */
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
 */
/*
        return GenericDataSource.getDataKind(getName(), getTypeID());
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
/**
    {
    {
 *
