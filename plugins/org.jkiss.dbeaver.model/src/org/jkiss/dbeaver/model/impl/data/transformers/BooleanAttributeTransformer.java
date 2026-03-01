 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Transforms numeric attribute value into epoch time
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static class BooleanValueHandler extends ProxyValueHandler {
import org.jkiss.dbeaver.model.exec.DBCException;
        @Override

        @NotNull
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
            }
            return super.getValueFromObject(session, type, object, copy, validateValue);
        public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
            }
}
        @NotNull

import org.jkiss.dbeaver.model.exec.DBCStatement;
 * See the License for the specific language governing permissions and

        }
/**
                value = 0;
        @Override


 * Licensed under the Apache License, Version 2.0 (the "License");
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
            super(target);
            super.bindValueObject(session, statement, type, index, value);
import org.jkiss.dbeaver.Log;
                return Boolean.valueOf(((Number) value).byteValue() != 0).toString();
        public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {

import java.util.List;
        }
import java.util.Map;
/*
            }
        attribute.setPresentationAttribute(
 */
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            if (value instanceof Number) {
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
            return DBValueFormatting.getDefaultValueDisplayString(value, format);
        }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        @Override

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBValueFormatting;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
public class BooleanAttributeTransformer implements DBDAttributeTransformer {
        }
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.exec.DBCSession;
            } else if (Boolean.FALSE.equals(value)) {
package org.jkiss.dbeaver.model.impl.data.transformers;
            if (Boolean.TRUE.equals(value)) {
            new TransformerPresentationAttribute(attribute, "boolean", -1, DBPDataKind.BOOLEAN));
 *
        public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
            return Boolean.class;

                return ((Number) object).byteValue() != 0;
import org.jkiss.dbeaver.model.DBPDataKind;
 * Unless required by applicable law or agreed to in writing, software
    }
 *
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        @Nullable
import org.jkiss.dbeaver.model.data.DBDValueHandler;

    private static final Log log = Log.getLog(BooleanAttributeTransformer.class);
 * DBeaver - Universal Database Manager
 * limitations under the License.
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
        }
import org.jkiss.code.Nullable;
        attribute.setTransformHandler(new BooleanValueHandler(attribute.getValueHandler()));
        @Override
        BooleanValueHandler(DBDValueHandler target) {
import org.jkiss.dbeaver.DBException;

 */
            if (object instanceof Number) {
                value = 1;
