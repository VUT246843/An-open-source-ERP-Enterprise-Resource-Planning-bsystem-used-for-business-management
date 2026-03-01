 *
        switch (typmod.length) {

            default:
    @NotNull
                sb.append('(').append(precision).append(')');
/*
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return sb.toString();
    public String getTypeModifiersString(@NotNull PostgreDataType type, int typmod) {
        final StringBuilder sb = new StringBuilder();
import org.jkiss.code.NotNull;
            throw new DBException("Time precision " + precision + " must be between 0 and 6");
    @Override
        }
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        if (typmod < 0) {
    }
                return getTimeModifiers(CommonUtils.toInt(typmod[0]));
        }

                return super.getTypeModifiers(type, typeName, typmod);
            return null;
    }
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
        // disallow constructing singleton class
public class PostgreTimeTypeHandler extends PostgreTypeHandler {
        }
    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
 * limitations under the License.
    }
    }
        return typmod;
        if (typmod >= 0) {
            if (precision != null) {

    @Nullable
 *
 * DBeaver - Universal Database Manager
        return precision;
            case 0:

        if (precision < 0 || precision > 6) {
    }
    public static final PostgreTimeTypeHandler INSTANCE = new PostgreTimeTypeHandler();
 *
 * See the License for the specific language governing permissions and

    public Integer getTypePrecision(@NotNull PostgreDataType type, int typmod) {
                return EMPTY_MODIFIERS;
 */
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

            final Integer precision = getTypePrecision(type, typmod);
}
        }
    private PostgreTimeTypeHandler() {
            case 1:
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static int getTimeModifiers(int precision) throws DBException {

package org.jkiss.dbeaver.ext.postgresql.model.data.type;
import org.jkiss.dbeaver.DBException;

