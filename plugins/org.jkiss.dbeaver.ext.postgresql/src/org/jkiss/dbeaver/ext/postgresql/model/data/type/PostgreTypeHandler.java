    public Integer getTypeLength(@NotNull PostgreDataType type, int typmod) {


import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable

    @Nullable
/*
 *

    @Nullable
        return null;
import java.util.Arrays;
 *
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected static final int EMPTY_MODIFIERS = -1;
    public abstract String getTypeModifiersString(@NotNull PostgreDataType type, int typmod);
        throw new DBException("Invalid modifiers for '" + type.getName() + "': " + Arrays.toString(typmod));
        return null;
}
    public Integer getTypePrecision(@NotNull PostgreDataType type, int typmod) {
public abstract class PostgreTypeHandler {

import org.jkiss.dbeaver.DBException;

 *
    @NotNull
    }
package org.jkiss.dbeaver.ext.postgresql.model.data.type;


    }
    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
 * you may not use this file except in compliance with the License.
        return null;
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.NotNull;
 * limitations under the License.
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Integer getTypeScale(@NotNull PostgreDataType type, int typmod) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
