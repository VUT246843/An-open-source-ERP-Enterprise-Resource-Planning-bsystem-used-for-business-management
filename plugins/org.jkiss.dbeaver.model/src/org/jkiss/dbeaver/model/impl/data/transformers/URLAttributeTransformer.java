import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    private static final String PROP_VIEW_PANEL = "view.panel";
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {

                    Object[] parsedValues = messageFormat.parse(object.toString());
import org.jkiss.code.NotNull;
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
        }
 * limitations under the License.
            this.messageFormat = new MessageFormat(this.pattern);
        }
 */
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                    }
public class URLAttributeTransformer implements DBDAttributeTransformer {
            }

            } catch (IllegalArgumentException e) {
 * Transforms string/numeric value into URL
import org.jkiss.dbeaver.model.DBPDataKind;
 * Unless required by applicable law or agreed to in writing, software

            } else {

import org.jkiss.dbeaver.model.DBUtils;
 */
                }
    public static final String URL_TYPE_NAME = "URL.Preview";
import org.jkiss.utils.CommonUtils;
                return super.getValueFromObject(session, type, object, copy, validateValue);
                    return object;
import org.jkiss.dbeaver.Log;
                return null;
        @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (pattern != null && format == DBDDisplayFormat.UI) {
            } else if (DBUtils.isNullValue(object)) {
 *
                    if (parsedValues.length > 0) {
            new TransformerPresentationAttribute(attribute, URL_TYPE_NAME, -1, DBPDataKind.STRING));
            pattern = "http://${value}";
/**
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
 *
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
}
 *
import org.jkiss.dbeaver.model.exec.DBCSession;

                pattern = CommonUtils.toString(options.get(PROP_PATTERN));
/*
            try {
    private static final Log log = Log.getLog(URLAttributeTransformer.class);
        if (pattern == null) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;


        String pattern = null;
import java.text.MessageFormat;
        if (options.containsKey(PROP_PATTERN)) {
import org.jkiss.dbeaver.DBException;
            }
package org.jkiss.dbeaver.model.impl.data.transformers;
                    return object;
                try {
    private static final String PROP_VIEW_INLINE = "view.inline";
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
            super(target);
                } catch (ParseException e) {
    }

            this.pattern = pattern.replace("${value}", "{0}");

            }
import org.jkiss.dbeaver.model.DBValueFormatting;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        private final String pattern;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
                        return super.getValueFromObject(session, type, parsedValues[0], copy, validateValue);
 * distributed under the License is distributed on an "AS IS" BASIS,
    private class URLValueHandler extends ProxyValueHandler {
            } else {
    private static final String PROP_PATTERN = "pattern";
        public URLValueHandler(DBDValueHandler target, String pattern) {
import java.util.Map;
        private final MessageFormat messageFormat;
                return DBValueFormatting.getDefaultValueDisplayString(value, format);
        @Nullable
        attribute.setPresentationAttribute(
                return messageFormat.format(new Object[] { value } );
        }
import java.util.List;
                log.error("Bad unit option", e);
        attribute.setTransformHandler(new URLValueHandler(attribute.getValueHandler(), pattern));
import org.jkiss.dbeaver.model.exec.DBCException;
        public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {
            if (pattern == null) {
        }
        }

        @Override
        @NotNull
import java.text.ParseException;

 * you may not use this file except in compliance with the License.
