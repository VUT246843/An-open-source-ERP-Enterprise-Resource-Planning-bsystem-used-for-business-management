 * distributed under the License is distributed on an "AS IS" BASIS,
            case INTERVAL_TYPE_DAY | INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE | INTERVAL_TYPE_SECOND:
        final StringBuilder sb = new StringBuilder();
                typmod |= INTERVAL_TYPE_HOUR;


            case "interval hour to second":
 * you may not use this file except in compliance with the License.
                return "day to hour";
                break;
                throw new DBException("Unsupported interval type: '" + name + "'");
                break;
            case INTERVAL_TYPE_DAY | INTERVAL_TYPE_HOUR:
            case "interval day to hour":
                return "hour to minute";
    @Override
                return "day to second";
                typmod |= INTERVAL_TYPE_MONTH;

 * Unless required by applicable law or agreed to in writing, software
                typmod |= INTERVAL_TYPE_SECOND;
    public Integer getTypePrecision(@NotNull PostgreDataType type, int typmod) {
                typmod |= INTERVAL_TYPE_DAY;
                break;
    }
            case "interval minute to second":
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        // Only intervals with 'second' have precision
import org.jkiss.utils.CommonUtils;
    public static String getIntervalType(int typmod) {
    @NotNull
    private static final int INTERVAL_MASK_TYPE         = 0xffff_0000;
    }
 * See the License for the specific language governing permissions and
        }
            case "interval day to second":
                break;
            case "interval day to minute":
        }
            case INTERVAL_TYPE_YEAR:
        switch (typmod.length) {
            return (int) (short) (typmod & INTERVAL_MASK_PRECISION);
 *
                return super.getTypeModifiers(type, typeName, typmod);
                typmod |= INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE | INTERVAL_TYPE_SECOND;
        if (!isPreciseInterval(typmod) && precision != 0) {
    private static final int INTERVAL_TYPE_HOUR         = 0x0400_0000;
            default:
/*
                sb.append(' ').append(getIntervalType(typmod));
                typmod |= INTERVAL_TYPE_DAY | INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE | INTERVAL_TYPE_SECOND;
        return null;
        return typmod;
                typmod |= INTERVAL_TYPE_NONE;
    // Intervals are made by combining consecutive units.
    private static int getIntervalModifiers(@NotNull String name, int precision) throws DBException {
                break;


import org.jkiss.code.Nullable;
            if (precision != null && precision > 0) {
            case "interval year":
    private static boolean isTypedInterval(int typmod) {
            case "interval hour to minute":
 * You may obtain a copy of the License at
        }
                break;
                throw new IllegalArgumentException("Error obtaining interval type from typmod: " + Integer.toHexString(typmod));
                break;
        }
            case INTERVAL_TYPE_DAY | INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE:
                break;
    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
        return (typmod & INTERVAL_TYPE_NONE) != INTERVAL_TYPE_NONE;
            case INTERVAL_TYPE_YEAR | INTERVAL_TYPE_MONTH:

        if (precision < 0 || precision > 6) {
                break;
                return "year";
            case "interval":
                break;
            }
                return "year to month";
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
                typmod |= INTERVAL_TYPE_DAY | INTERVAL_TYPE_HOUR;
    private static final int INTERVAL_TYPE_SECOND       = 0x1000_0000;
    }
                break;
    }
                return "day";
                return getIntervalModifiers(typeName, 0);
        switch (name) {
                typmod |= INTERVAL_TYPE_DAY | INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE;
        }
    @Override
            }
    private static final int INTERVAL_TYPE_NONE         = 0x7fff_0000;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;

                typmod |= INTERVAL_TYPE_YEAR;
        }
                sb.append('(').append(precision).append(')');
            case INTERVAL_TYPE_HOUR:
                break;
    }
            case INTERVAL_TYPE_MONTH:
            default:
    private static boolean isPreciseInterval(int typmod) {
            case INTERVAL_TYPE_DAY:
        return (typmod & INTERVAL_TYPE_SECOND) > 0;
            if (type.getName().endsWith(PostgreConstants.TYPE_INTERVAL) && isTypedInterval(typmod)) {
    @Nullable
                typmod |= INTERVAL_TYPE_MINUTE;
        if (typmod > 0) {
                typmod |= INTERVAL_TYPE_MINUTE | INTERVAL_TYPE_SECOND;
    @Nullable
        if (typmod < 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getTypeModifiersString(@NotNull PostgreDataType type, int typmod) {
                break;
        if (isPreciseInterval(typmod)) {
                return getIntervalModifiers(typeName, CommonUtils.toInt(typmod[0]));
 * DBeaver - Universal Database Manager
    }
        }
    private static final int INTERVAL_TYPE_MINUTE       = 0x0800_0000;
            case INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE:
package org.jkiss.dbeaver.ext.postgresql.model.data.type;
            throw new DBException("Interval precision " + precision + " must be between 0 and 6");
                typmod |= INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE;
            case "interval second":
        // disallow constructing singleton class
            case "interval year to month":
            case INTERVAL_TYPE_MINUTE | INTERVAL_TYPE_SECOND:
    public static final PostgreIntervalTypeHandler INSTANCE = new PostgreIntervalTypeHandler();
 *
            case INTERVAL_TYPE_MINUTE:
        switch (typmod & INTERVAL_MASK_TYPE) {
public class PostgreIntervalTypeHandler extends PostgreTypeHandler {
}
            final Integer precision = getTypePrecision(type, typmod);

import org.jkiss.code.NotNull;
    private static final int INTERVAL_MASK_PRECISION    = 0x0000_ffff;
            case "interval minute":
import org.jkiss.dbeaver.DBException;
                return "month";
                typmod |= INTERVAL_TYPE_YEAR | INTERVAL_TYPE_MONTH;
            case INTERVAL_TYPE_HOUR | INTERVAL_TYPE_MINUTE | INTERVAL_TYPE_SECOND:
 */
            case "interval month":
                return "hour";
            case 1:
    private static final int INTERVAL_TYPE_YEAR         = 0x0004_0000;
            throw new DBException("Interval '" + name + "' may not have precision");
 * Copyright (C) 2010-2024 DBeaver Corp and others

                break;
            default:

    private PostgreIntervalTypeHandler() {
    private static final int INTERVAL_TYPE_MONTH        = 0x0002_0000;
                return "minute";
        // Intervals may be untyped (-1)
            case INTERVAL_TYPE_SECOND:

        int typmod = precision;
                return "second";
    }

            case "interval hour":
        }
                return "day to minute";
            return null;
                return "minute to second";
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            case "interval day":
            case 0:
        return sb.toString();
 * limitations under the License.
    // For example: 'day to second' => DAY | HOUR | MINUTE | SECOND
    @Override
                return "hour to second";
    private static final int INTERVAL_TYPE_DAY          = 0x0008_0000;
