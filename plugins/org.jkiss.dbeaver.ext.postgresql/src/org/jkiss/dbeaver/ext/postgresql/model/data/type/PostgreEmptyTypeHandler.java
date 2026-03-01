        // disallow constructing singleton class
    }
    private PostgreEmptyTypeHandler() {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 * Handler for types that don't support modifiers.
public class PostgreEmptyTypeHandler extends PostgreTypeHandler {
 * it and does not accept any modifiers when editing.
 *
 *
    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.ext.postgresql.model.data.type;
/*
 * <p>
 * You may obtain a copy of the License at
 */
 */

}

        }
        if (typmod.length == 0) {
 *
 * limitations under the License.
    public String getTypeModifiersString(@NotNull PostgreDataType type, int typmod) {
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    @Override
/**
            return EMPTY_MODIFIERS;
 * Displays base type name without {@code (...)} after
        return super.getTypeModifiers(type, typeName, typmod);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;

import org.jkiss.dbeaver.DBException;

    public static final PostgreEmptyTypeHandler INSTANCE = new PostgreEmptyTypeHandler();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

        return "";
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
