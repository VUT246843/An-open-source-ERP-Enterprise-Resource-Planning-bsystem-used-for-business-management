}
    public static final String PROP_MIN_FRACT_DIGITS  ="minFractionDigits";
        props.put(PROP_MAX_FRACT_DIGITS, Math.max(tmp.getMaximumFractionDigits(), 10));
    public static final String PROP_MAX_INT_DIGITS ="maxIntegerDigits";

    public static final String PROP_EXCLUDE_ID_COLUMNS = "excludeIdColumns";
    {
 * you may not use this file except in compliance with the License.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        props.put(PROP_MIN_FRACT_DIGITS, tmp.getMinimumFractionDigits());
        // Use UNNECESSARY by default [#6493]
 * See the License for the specific language governing permissions and
 * limitations under the License.
import java.text.DecimalFormat;
    public static final String PROP_NATIVE_SPECIAL_VALUES = "nativeSpecialValues";
    public Map<String, Object> getDefaultProperties(Locale locale)
        final DecimalFormat tmp = (DecimalFormat) NumberFormat.getNumberInstance(locale);
 *
        props.put(PROP_USE_GROUPING, tmp.isGroupingUsed());


    public static final String PROP_GROUPING_SIZE = "groupingSize";
        //props.put(PROP_ROUNDING_MODE, RoundingMode.UNNECESSARY.name());
    public Object getSampleValue()
        props.put(PROP_MAX_INT_DIGITS, tmp.getMaximumIntegerDigits());
        props.put(PROP_MIN_INT_DIGITS, tmp.getMinimumIntegerDigits());
    public static final String PROP_USE_TYPE_SCALE  ="useTypeScale";
    public static final String PROP_MAX_FRACT_DIGITS ="maxFractionDigits";
        props.put(PROP_EXCLUDE_ID_COLUMNS, false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        props.put(PROP_NATIVE_SPECIAL_VALUES, false);

        props.put(PROP_GROUPING_SIZE, tmp.getGroupingSize());
import java.util.Map;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String PROP_MIN_INT_DIGITS ="minIntegerDigits";
    public static final String PROP_ROUNDING_MODE ="roundingMode";
package org.jkiss.dbeaver.model.impl.data.formatters;
        // FIX: Use default. The problem in rounding was caused by float->double conversions.
    {
        return 1234567890.012345;
import java.util.HashMap;
        props.put(PROP_USE_TYPE_SCALE, false);
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    public static final String PROP_USE_GROUPING ="useGrouping";
import java.util.Locale;
 * Unless required by applicable law or agreed to in writing, software
public class NumberFormatSample implements DBDDataFormatterSample {
    @Override

import java.text.NumberFormat;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;


        return props;
    }
    }
        final Map<String, Object> props = new HashMap<>();
 *
