            final Integer scale = getTypeScale(type, typmod);
        if (precision < 1 || precision > 1000) {
    @NotNull
        if (typmod.length == 1 && type.getObjectId() == PostgreOid.NUMERIC) {
        if (scale < 0 || scale > precision) {
 */
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
    public static final PostgreNumericTypeHandler INSTANCE = new PostgreNumericTypeHandler();
        if (type.getObjectId() == PostgreOid.FLOAT4) {
 *
            if (precision != null && precision > 0) {
                if (scale != null && scale > 0) {
 * You may obtain a copy of the License at
    }
                }
 * limitations under the License.
        if (type.getObjectId() == PostgreOid.FLOAT4) {
    private PostgreNumericTypeHandler() {
        }
 * you may not use this file except in compliance with the License.
    private static int getNumberModifiers(int precision, int scale) throws DBException {
    public Integer getTypePrecision(@NotNull PostgreDataType type, int typmod) {
 *
        }
        }
        }
        if (type.getObjectId() == PostgreOid.FLOAT8) {
        if (typmod < 0) {
                sb.append('(').append(precision);
        if (type.getObjectId() == PostgreOid.FLOAT8) {
    @Override
            throw new DBException("Numeric precision " + +precision + " must be between 1 and 1000");
 *
package org.jkiss.dbeaver.ext.postgresql.model.data.type;
        }
        }
        // disallow constructing singleton class
    }
            final Integer precision = getTypePrecision(type, typmod);


        if (typmod.length == 2 && type.getObjectId() == PostgreOid.NUMERIC) {
            return 6;
 * See the License for the specific language governing permissions and
    }
            }

    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    public String getTypeModifiersString(@NotNull PostgreDataType type, int typmod) {
    }
    public Integer getTypeScale(@NotNull PostgreDataType type, int typmod) {
        }
                    sb.append(", ").append(scale);
    private static final int NUMERIC_MASK_PRECISION  = 0xffff_0000;
            return getNumberModifiers(CommonUtils.toInt(typmod[0]), CommonUtils.toInt(typmod[1]));
/*
        if (typmod.length == 0) {
        }
    @Override

        }

    }
            throw new DBException("Numeric scale " + +scale + " must be between 0 and " + precision);
        return (precision << 16) | (scale + 4);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        return (typmod & NUMERIC_MASK_SCALE) - 4;

import org.jkiss.utils.CommonUtils;
            return 17;
            return EMPTY_MODIFIERS;
        return super.getTypeModifiers(type, typeName, typmod);
            return null;
        final StringBuilder sb = new StringBuilder();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreOid;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                sb.append(')');

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
            return 9;
        if (type.getObjectId() == PostgreOid.NUMERIC && typmod > 0) {

        }
            return (typmod & NUMERIC_MASK_PRECISION) >> 16;
        if (type.getObjectId() == PostgreOid.NUMERIC && typmod >= 0) {
    @Override
    @Nullable

 * Unless required by applicable law or agreed to in writing, software

public class PostgreNumericTypeHandler extends PostgreTypeHandler {
import org.jkiss.dbeaver.DBException;
    private static final int NUMERIC_MASK_SCALE      = 0x0000_ffff;
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
            return getNumberModifiers(CommonUtils.toInt(typmod[0]), 0);
import org.jkiss.code.Nullable;
            return 15;
        return sb.toString();
    @Nullable
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
