                if (showPrefix) {
            this.unsigned = unsigned;
                }
                if (radix == 2) {
                        strValue = strValue.substring(1);
    public static final String PROP_RADIX = "radix";
        }
    public static final String PROP_BITS = "bits";
/*
            new TransformerPresentationAttribute(attribute, "StringNumber", -1, DBPDataKind.STRING));
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.DBCSession;
        private final boolean unsigned;

 *
    public static final String PREFIX_HEX = "0x";

                if (strValue.isEmpty()) {
                    } else if (radix == 8 && strValue.startsWith(PREFIX_OCT)) {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
                if (strValue.charAt(0) == '-') {
            return DBValueFormatting.getDefaultValueDisplayString(value, format);
import org.jkiss.dbeaver.model.data.DBDValueHandler;
import java.util.Locale;
            unsigned = CommonUtils.getBoolean(options.get(PROP_UNSIGNED), unsigned);
            super(target);
        }
                final String strValue;
                    }
        @NotNull
/**
        private final int bits;

                    return Long.parseLong(strValueSign + strValue, radix);
                    } else if (radix == 2) {
                    sb.append("-");
package org.jkiss.dbeaver.model.impl.data.transformers;
                    strValue = Long.toString(longValue, radix).substring(1).toUpperCase(Locale.ENGLISH);
                        strValue = strValue.substring(2);
        if (options.containsKey(PROP_RADIX)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.radix = radix;
                } else {

                } catch (NumberFormatException e) {
        }
 *
        if (options.containsKey(PROP_BITS)) {
import java.util.List;
        @Override
}

        }
                }
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
            radix = CommonUtils.toInt(options.get(PROP_RADIX), radix);
    private static final Log log = Log.getLog(RadixAttributeTransformer.class);
                if (unsigned || longValue >= 0) {
                    } else if (radix == 8) {
 * DBeaver - Universal Database Manager
                return sb.toString();
import org.jkiss.dbeaver.model.exec.DBCException;
 */
        }
    public static final String PREFIX_OCT = "0";
            this.showPrefix = showPrefix;
        if (options.containsKey(PROP_UNSIGNED)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                String strValueSign = "";
                } else {
                }
                String strValue = (String) object;
        }
                        sb.append(PREFIX_OCT);
        boolean showPrefix = false;
                final StringBuilder sb = new StringBuilder();
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBValueFormatting;
                if (showPrefix) {
                }

            return super.getValueFromObject(session, type, object, copy, validateValue);
        boolean unsigned = false;
                }
            if (object instanceof String) {
            showPrefix = CommonUtils.getBoolean(options.get(PROP_PREFIX), showPrefix);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }

                    strValueSign = "-";
        private final boolean showPrefix;
 * limitations under the License.
                final long longValue = ((Number) value).longValue();
                    return 0;
        attribute.setTransformHandler(new RadixValueHandler(attribute.getValueHandler(), radix, bits, showPrefix, unsigned));
            }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
                    if (radix == 16) {
    public static final String PREFIX_BIN = "0b";
 *
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * you may not use this file except in compliance with the License.
        public RadixValueHandler(DBDValueHandler target, int radix, int bits, boolean showPrefix, boolean unsigned) {
                    log.debug(e);
                    }
        int radix = 16;
                        sb.append(PREFIX_BIN);
import org.jkiss.dbeaver.model.DBPDataKind;
                try {
            bits = CommonUtils.toInt(options.get(PROP_BITS), bits);
                    sb.append(strValue, 0, CommonUtils.clamp(strValue.length(), 1, bits));
 */
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    strValue = Long.toUnsignedString(longValue, radix).toUpperCase(Locale.ENGLISH);
        }
                    sb.append(strValue);
        if (options.containsKey(PROP_PREFIX)) {
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
 * Transforms numeric attribute value into string in a specified radix
                        strValue = strValue.substring(2);

    public static final String PROP_PREFIX = "prefix";
        private final int radix;

    }
    }
                    strValue = strValue.substring(1);
        int bits = 32;
 * You may obtain a copy of the License at

    @Override
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.code.NotNull;
        @Nullable
import java.util.Map;
 * See the License for the specific language governing permissions and
        @Override
    public static final String PROP_UNSIGNED = "unsigned";

import org.jkiss.utils.CommonUtils;
                    } else if (radix == 2 && strValue.startsWith(PREFIX_BIN)) {
        public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {
            this.bits = bits;
                        sb.append(PREFIX_HEX);
        attribute.setPresentationAttribute(
    private static class RadixValueHandler extends ProxyValueHandler {
public class RadixAttributeTransformer implements DBDAttributeTransformer {

                    if (radix == 16 && strValue.startsWith(PREFIX_HEX)) {
            if (value instanceof Number) {
            }
 * Unless required by applicable law or agreed to in writing, software
