 *
        final StringBuilder sb = new StringBuilder();
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        // disallow constructing singleton class
package org.jkiss.dbeaver.ext.postgresql.model.data.type;

        if (length < 0) {
    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
                return typmod;
                sb.append('(').append(length).append(')');
public class PostgreStringTypeHandler extends PostgreTypeHandler {
    }
    @Override
 * limitations under the License.
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    private static int getStringModifiers(@NotNull PostgreDataType type, int length) throws DBException {
 * You may obtain a copy of the License at
        }
/*
 * Unless required by applicable law or agreed to in writing, software
        }
        switch ((int) type.getObjectId()) {
        }
            case PostgreOid.VARBIT:
    public Integer getTypeLength(@NotNull PostgreDataType type, int typmod) {
    }

        switch (typmod.length) {
    public static final PostgreStringTypeHandler INSTANCE = new PostgreStringTypeHandler();

            default:
        }

    @Nullable
        }
                return length;
                return getStringModifiers(type, CommonUtils.toInt(typmod[0]));
    @NotNull
            case 1:

    public String getTypeModifiersString(@NotNull PostgreDataType type, int typmod) {
        switch ((int) type.getObjectId()) {
 * DBeaver - Universal Database Manager

    private PostgreStringTypeHandler() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
            final Integer length = getTypeLength(type, typmod);
            default:
            default:
            return null;
            case 0:
                return length + 4;

                return typmod - 4;
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreOid;
import org.jkiss.dbeaver.DBException;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
 * Licensed under the Apache License, Version 2.0 (the "License");
                return super.getTypeModifiers(type, typeName, typmod);
 * you may not use this file except in compliance with the License.
            case PostgreOid.BIT:
        }
    @Override
 *
            case PostgreOid.VARBIT:
    }
        if (typmod > 0) {
 */
            case PostgreOid.BIT:
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;
                return EMPTY_MODIFIERS;
 * See the License for the specific language governing permissions and
        if (typmod < 0) {
            }
    @Override
        return sb.toString();
            if (length != null) {
            throw new DBException("Length for type '" + type.getName() + "' must be at least 1");
