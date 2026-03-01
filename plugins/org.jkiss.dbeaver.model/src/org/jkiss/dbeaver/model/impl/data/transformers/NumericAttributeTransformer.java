                object = parseValue((String) object, this.type, this.lenient);
                        return null;
                    case "int":
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCStatement;

            return Object.class;
                        return Long.parseLong(value);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
            }
package org.jkiss.dbeaver.model.impl.data.transformers;
    private static class NumericValueHandler extends ProxyValueHandler {
                        return Byte.parseByte(value);
 * limitations under the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
            if (value instanceof Number) {
        attribute.setTransformHandler(new NumericValueHandler(attribute.getValueHandler(), type, lenient));
                switch (type) {
                }
        }
                    log.trace("Error converting string '" + value + "' to " + type, e);

        }
import org.jkiss.dbeaver.DBException;
/*
        @NotNull
            if (value == null) {
                    default:
            } catch (NumberFormatException e) {
                return object;
 */
        }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.

        }
    }
                return CommonUtils.toString(value);
    private static final String PROP_LENIENT = "lenient";
import org.jkiss.code.Nullable;

            if (value instanceof String) {
            super(target);
    @Override
/**
        @Nullable
                    case "byte":
                        return Short.parseShort(value);
            return super.getValueFromObject(session, type, object, copy, validateValue);
        public NumericValueHandler(@NotNull DBDValueHandler target, @NotNull String type, boolean lenient) {
        final boolean lenient = CommonUtils.getBoolean(options.get(PROP_LENIENT), false);
import org.jkiss.dbeaver.model.exec.DBCException;
        }

            super.bindValueObject(session, statement, type, index, CommonUtils.toString(value));
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
        private final boolean lenient;
        @NotNull
        private static Object parseValue(@NotNull String value, @NotNull String type, boolean lenient) {
import org.jkiss.dbeaver.model.DBPDataKind;
                    case "double":
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            this.type = type;
                return "";
                    case "long":
            return super.getValueDisplayString(column, value, format);
public class NumericAttributeTransformer implements DBDAttributeTransformer {
                value = parseValue((String) value, this.type, this.lenient);

 */
                        return Integer.parseInt(value);
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                        return Float.parseFloat(value);
 * distributed under the License is distributed on an "AS IS" BASIS,
                        return Double.parseDouble(value);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

    private static final Log log = Log.getLog(NumericAttributeTransformer.class);
                return value;
            if (object instanceof Number) {
        private final String type;
 * DBeaver - Universal Database Manager
        public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
                    case "short":
            try {
            }
        final String type = CommonUtils.toString(options.get(PROP_TYPE), "double");
            }
import java.util.Map;
import java.util.List;
        @Override
 * You may obtain a copy of the License at
        @Nullable
            }
        public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {

            }

 *
            this.lenient = lenient;
                if (lenient) {
        }
        @Override
            if (object instanceof String) {
    private static final String PROP_TYPE = "type";
 * Transforms string attribute value into numeric value
        public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
        attribute.setPresentationAttribute(new TransformerPresentationAttribute(attribute, "numeric", -1, DBPDataKind.NUMERIC));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
}

import org.jkiss.utils.CommonUtils;
        @Override
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;

                }
 *
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

 * See the License for the specific language governing permissions and
        @Override
import org.jkiss.code.NotNull;
                    case "float":
