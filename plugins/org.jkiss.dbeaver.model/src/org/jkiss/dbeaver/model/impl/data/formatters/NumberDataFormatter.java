        position = new FieldPosition(0);
            numberFormat.setMinimumIntegerDigits(CommonUtils.toInt(minIntDigits));
    {
    @Override
        nativeSpecialValues = CommonUtils.toBoolean(properties.get(NumberFormatSample.PROP_NATIVE_SPECIAL_VALUES));
    @Override
                numberFormat.setGroupingUsed(false);
            if (nativeSpecialValues) {
        Object groupingSize = properties.get(NumberFormatSample.PROP_GROUPING_SIZE);
                    return numberFormat.format(value, buffer, position).toString();
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    return number.longValue();
                        return number;
    @Override
            // Convert to BigDecimal so we don't have rounding issues with high minimum fraction digits set
                } else if (typeHint == Integer.class) {
    private DecimalFormat numberFormat;

        if (minIntDigits != null) {
import org.jkiss.code.Nullable;
                numberFormat.setMinimumFractionDigits(fractionDigits);
                if (fractionDigits > MAX_DEFAULT_FRACTIONS_DIGITS) fractionDigits = MAX_DEFAULT_FRACTIONS_DIGITS;
 * Unless required by applicable law or agreed to in writing, software
    private boolean nativeSpecialValues;
                boolean isFloat = number instanceof Double || number instanceof Float;
            }

    }
        }
import org.jkiss.utils.CommonUtils;
            }
                    }
            if (number != null && typeHint != null) {
                    if (numberFormat.getRoundingMode() == RoundingMode.UNNECESSARY) {
            return null;
                numberFormat.setMaximumFractionDigits(maxFD);
        if (type != null && CommonUtils.toBoolean(properties.get(NumberFormatSample.PROP_USE_TYPE_SCALE))) {
        if (value == null) {
                numberFormat.setMinimumFractionDigits(CommonUtils.toInt(minFractDigits));
        if (useGrouping != null) {
                    if (isFloat) {
import java.text.NumberFormat;
                return value.toString();
}
                }
    @Nullable
            return number;
        if (type != null && CommonUtils.isBitSet(type.getTypeModifiers(), DBSTypedObject.TYPE_MOD_NUMBER_LEADING_ZEROES)) {
                }
    {
            try {
            }
                        return number;
        numberFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
import java.util.Map;
                    if (isFloat) {
        }
            }
 *
    {
import java.math.BigDecimal;
                if (type.getScale() != null && type.getScale() > 0) {
        try {
 *
                int fractionDigits = type.getScale();
import java.text.DecimalFormat;
            } catch (Exception e) {

            numberFormat.setGroupingUsed(CommonUtils.toBoolean(useGrouping));
                    }
    @Override
        buffer = new StringBuffer();
    private FieldPosition position;
    public Object parseValue(String value, @Nullable Class<?> typeHint) throws ParseException
                    return number.intValue();
import java.math.RoundingMode;
import org.jkiss.dbeaver.Log;
    public void init(DBSTypedObject type, Locale locale, Map<String, Object> properties)
            return value.toString();
        String roundingMode = CommonUtils.toString(properties.get(NumberFormatSample.PROP_ROUNDING_MODE));
            value = new BigDecimal(value.toString());
                        return number;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (Exception e) {
                } else {
            }
        }
 *
import java.text.ParseException;
import java.math.BigInteger;
            numberFormat.setParseBigDecimal(typeHint == BigDecimal.class || typeHint == BigInteger.class);

        if (CommonUtils.isNaN(value) || CommonUtils.isInfinite(value)) {

            // Here is a trick. We can't set max digiter bigger than scale (otherwise long numbers are corrupted)
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (!(value instanceof Number)) {
        }
                } else if (typeHint == Double.class) {
                        numberFormat.setRoundingMode(RoundingMode.HALF_EVEN);

    {
        }
        if (!CommonUtils.isEmpty(roundingMode)) {
                int maxFD = CommonUtils.toInt(maxFractDigits);
            numberFormat.setMaximumIntegerDigits(CommonUtils.toInt(maxIntDigits));
                    maxFD = typeScale;
        }
                } else if (typeHint == Long.class) {
                        log.debug("Disabling UNNECESSARY rounding for numbers (" + e.getMessage() + ")");
            }
 * DBeaver - Universal Database Manager
        synchronized (this) {
                // just skip it
                }
                    return number.byteValue();
            int typeScale = type.getScale() != null ? type.getScale() : 0;
                buffer.setLength(0);
                if (typeScale > 0 && maxFD > typeScale) {

                    return number.shortValue();
 */
                    numberFormat.setMinimumIntegerDigits(type.getPrecision() - type.getScale());
        if (maxIntDigits != null) {
    @Nullable
            Number number = numberFormat.parse(value);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                    if (isFloat) {
            if (minFractDigits != null) {
package org.jkiss.dbeaver.model.impl.data.formatters;
            if (type.getScale() != null && type.getScale() > 0) {
            }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            Object minFractDigits = properties.get(NumberFormatSample.PROP_MIN_FRACT_DIGITS);
                numberFormat.setRoundingMode(RoundingMode.valueOf(roundingMode));
            synchronized (this) {
        } else if (value instanceof Float || value instanceof Double) {
            }

        return null;
    public String getPattern()
            numberFormat.setGroupingSize(CommonUtils.toInt(groupingSize, numberFormat.getGroupingSize()));

        }
                    numberFormat.setMinimumFractionDigits(type.getScale());
        }
    public static final int MAX_DEFAULT_FRACTIONS_DIGITS = 16;
/*
    }
                    return number.doubleValue();
            Object maxFractDigits = properties.get(NumberFormatSample.PROP_MAX_FRACT_DIGITS);
        }
                    }
import org.jkiss.dbeaver.model.data.DBDDataFormatter;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
        }
    private static final Log log = Log.getLog(NumberDataFormatter.class);
        }
    }
            // Override number format style set from properties in favor of type's precision
        if (groupingSize != null) {
                    numberFormat.setMinimumIntegerDigits(type.getPrecision());
                } catch (ArithmeticException e) {
                    }
                        return number;
                try {
                } else if (typeHint == Short.class) {
import java.text.FieldPosition;
                        // This type can't use UNNECESSARY rounding. Let's set default one
        Object useGrouping = properties.get(NumberFormatSample.PROP_USE_GROUPING);
                } else if (typeHint == Float.class) {
            return value.toString();
                numberFormat.setMinimumFractionDigits(0);
 * See the License for the specific language governing permissions and
    }
    private StringBuffer buffer;
        Object maxIntDigits = properties.get(NumberFormatSample.PROP_MAX_INT_DIGITS);
            if (maxFractDigits != null) {
    public NumberDataFormatter() {
    public String formatValue(Object value)
                if (typeHint == Byte.class) {
            if (type.getPrecision() != null && type.getPrecision() > 0) {
        }
            // #6111 + #6914.
public class NumberDataFormatter implements DBDDataFormatter {
import java.util.Locale;
                    if (isFloat) {

                    return number.floatValue();
            } else {
                    return numberFormat.format(value, buffer, position).toString();
 * you may not use this file except in compliance with the License.

 * You may obtain a copy of the License at
        Object minIntDigits = properties.get(NumberFormatSample.PROP_MIN_INT_DIGITS);

                    }
        if (type != null) {
                }
