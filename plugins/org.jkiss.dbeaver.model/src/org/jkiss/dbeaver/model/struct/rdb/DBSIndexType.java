    public String toString()
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    public static final DBSIndexType UNKNOWN = new DBSIndexType("UNKNOWN", ModelMessages.model_struct_Unknown); //$NON-NLS-1$
        return obj instanceof DBSIndexType && name.equals(((DBSIndexType)obj).name);
    {
        return id;

 * DBSIndexType
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 */
 * Unless required by applicable law or agreed to in writing, software
/**
        this.id = id;
    }
 *
    {
        this.name = name;
    {
 *
        return name;
 * See the License for the specific language governing permissions and

}
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

public class DBSIndexType implements DBPNamedObject
    private final String id;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final DBSIndexType OTHER = new DBSIndexType("OTHER", ModelMessages.model_struct_Other); //$NON-NLS-1$
 * DBeaver - Universal Database Manager
    {
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
{
    @Override
    }
    public DBSIndexType(String id, String name)

 */
    public String getId()
/*
    public static final DBSIndexType STATISTIC = new DBSIndexType("STATISTIC", ModelMessages.model_struct_Statistic); //$NON-NLS-1$
import org.jkiss.dbeaver.model.DBPNamedObject;
    public boolean equals(Object obj)
        return name;
    @Override

    }
    public String getName()
    {

import org.jkiss.dbeaver.model.messages.ModelMessages;
    @NotNull
 *
import org.jkiss.code.NotNull;
    public int hashCode()
    }
        return name.hashCode();
    @Override

package org.jkiss.dbeaver.model.struct.rdb;
    public static final DBSIndexType CLUSTERED = new DBSIndexType("CLUSTERED", ModelMessages.model_struct_Clustered); //$NON-NLS-1$
    }
    @Override
    private final String name;
    public static final DBSIndexType HASHED = new DBSIndexType("HASHED", ModelMessages.model_struct_Hashed); //$NON-NLS-1$
