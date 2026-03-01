            store.setValue(propName, value.toString());
                return CommonUtils.isEmpty(str) ? null : str;
 *
            store.setValue(propName, f);
        } else {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            store.setDefault(propName, b);
        if (value == null) {
        } else if (value instanceof Double d) {
 */
 *
 * Unless required by applicable law or agreed to in writing, software
        }
            } else if (valueType == Integer.class || valueType == Integer.TYPE ||
            } else if (valueType == Float.class || valueType == Float.TYPE) {
    public static void setPreferenceDefaultValue(@NotNull DBPPreferenceStore store, @NotNull String propName, @Nullable Object value) {
        if (value instanceof CharSequence) {
    public static void savePreferenceStore(@NotNull DBPPreferenceStore store) {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 */
            store.setValue(propName, d);
        }
        } catch (IOException e) {
        } else if (value instanceof Long l) {

            store.setDefault(propName, d);
import java.math.BigInteger;
                valueType == Byte.class || valueType == Byte.TYPE) {
        } else if (value instanceof Float f) {
        }
        } else if (value instanceof Integer || value instanceof Short || value instanceof Byte) {

        try {
    }
                return CommonUtils.toInt(str);
        } else if (value instanceof Integer || value instanceof Short || value instanceof Byte) {
            store.setDefault(propName, ((Number) value).intValue());
package org.jkiss.dbeaver.utils;
                valueType == Short.class || valueType == Short.TYPE ||
            store.setValue(propName, value.toString());
        } else if (value instanceof Boolean b) {
        }
/*
        }

    public static void setDefaultPreferenceValue(@NotNull DBPPreferenceStore store, @NotNull String name, @NotNull Object value) {
            store.setDefault(propName, value.toString());
                return new BigInteger(str);
public class PrefUtils {
            return;
import org.jkiss.code.Nullable;
        }
            } else if (valueType == Double.class || valueType == Double.TYPE) {
import org.jkiss.utils.CommonUtils;
                return CommonUtils.toFloat(store);
    private static final Log log = Log.getLog(PrefUtils.class);
    public static void setPreferenceValue(@NotNull DBPPreferenceStore store, @NotNull String propName, @Nullable Object value) {

 * See the License for the specific language governing permissions and
        final String string = store.getString(propName);
 * Preferences utilities
                return CommonUtils.toDouble(str);
        } else {
        return CommonUtils.isEmpty(string) ? null : string;

                return CommonUtils.toBoolean(str);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
        try {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

            } else if (valueType == BigInteger.class) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else if (value instanceof Long l) {
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.IOException;
            log.error(e);
        } catch (RuntimeException e) {
            }
            if (str == null) {
            store.setDefault(propName, f);
            return;
            store.setDefault(propName, l);
        } else if (value instanceof Boolean b) {
    }
            } else if (valueType == Boolean.class || valueType == Boolean.TYPE) {
        if (value == null) {
    public static Object getPreferenceValue(@NotNull DBPPreferenceStore store, @NotNull String propName, @Nullable Class<?> valueType) {
 *
            if (valueType == null || CharSequence.class.isAssignableFrom(valueType)) {
            store.save();
    }
            } else if (valueType == BigDecimal.class) {
            store.setDefault(propName, value.toString());

        } else if (value instanceof Float f) {
            } else if (valueType == Long.class || valueType == Long.TYPE) {

        } else if (value instanceof Double d) {
            store.setDefault(name, value.toString());
 * You may obtain a copy of the License at
            log.warn(e);
    @Nullable
            store.setValue(propName, b);
                return null;

        if (value instanceof CharSequence) {
            store.setValue(propName, l);
            }
                return CommonUtils.toLong(str);
    }
 * DBeaver - Universal Database Manager
                return new BigDecimal(str);
            store.setValue(propName, ((Number) value).intValue());

import java.math.BigDecimal;
            final String str = store.getString(propName);
        if (CommonUtils.isEmpty(store.getDefaultString(name))) {
}
import org.jkiss.code.NotNull;

