 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        super(sqLiteDataSource, affinity.getValueType(), affinity.name(), null, false, false, affinity.getPrecision(), 0, affinity.getScale());
 * Copyright (C) 2010-2024 DBeaver Corp and others
}

    public SQLiteDataType(SQLiteDataSource sqLiteDataSource, SQLiteAffinity affinity) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
 * you may not use this file except in compliance with the License.
    @Nullable
    public DBPDataKind getDataKind() {
 *
    public String getName()
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return super.getName();
    }
    @Property(order = 10)
 * You may obtain a copy of the License at
 * limitations under the License.

    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
        return affinity;

 *
    @Property(order = 20)
        return super.getDescription();
    {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 1)
    private final SQLiteAffinity affinity;

    @Override

package org.jkiss.dbeaver.ext.sqlite.model;
import org.jkiss.dbeaver.model.meta.Property;
        this.affinity = affinity;
    public SQLiteAffinity getAffinity() {
 *
import org.jkiss.dbeaver.model.DBPDataKind;
    }
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    {
    }
    @Override

public class SQLiteDataType extends JDBCDataType<SQLiteDataSource> {

import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
    }

 */
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @NotNull
    @NotNull
        return affinity.getDataKind();
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    public String getDescription()
