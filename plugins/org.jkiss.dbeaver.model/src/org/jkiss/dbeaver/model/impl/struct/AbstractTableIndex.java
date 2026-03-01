 * AbstractTableIndex
 * limitations under the License.
    @Override
 *
    public boolean isPersisted()
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

public abstract class AbstractTableIndex implements DBSTableIndex
{
    }
 */
    public DBSEntityConstraintType getConstraintType()

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }


 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        return DBSEntityConstraintType.INDEX;
    public boolean isPrimary() {
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
import org.jkiss.code.NotNull;
    @Override
 * DBeaver - Universal Database Manager
}
/**
    }
 */
    {
        return false;
 *
 *
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
package org.jkiss.dbeaver.model.impl.struct;
    {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
