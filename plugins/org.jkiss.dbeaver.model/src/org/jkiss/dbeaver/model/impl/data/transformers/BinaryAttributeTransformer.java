import java.nio.ByteBuffer;
    private static final String FORMAT_NATIVE = "native";
        attribute.setTransformHandler(new BinaryValueHandler(attribute.getValueHandler(), charset, formatter));
import java.util.List;
import org.jkiss.code.Nullable;
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
            formatter = dataSource.getSQLDialect().getNativeBinaryFormatter();
            this.formatter = formatter;
        public BinaryValueHandler(DBDValueHandler target, Charset charset, DBDBinaryFormatter formatter) {

package org.jkiss.dbeaver.model.impl.data.transformers;
}
 * limitations under the License.
            charset = Charset.defaultCharset();
        private final Charset charset;
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Exception e) {

        }
        @Override
        if (formatter == null) {
            byte[] bytes = bb.array();
    private class BinaryValueHandler extends ProxyValueHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            log.warn(e);
    private static final String FORMAT_HEX = "hex";
        }
            formatter = DBValueFormatting.getBinaryPresentation(formatterId);
/**
 * you may not use this file except in compliance with the License.
 * Transforms string value into binary

        DBDBinaryFormatter formatter;

 * DBeaver - Universal Database Manager
        private final DBDBinaryFormatter formatter;
    }
import java.util.Map;
            return formatter.toString(bytes, 0, bytes.length);
 */
import org.jkiss.dbeaver.model.data.*;
            }
import org.jkiss.utils.CommonUtils;
    private static final String PROP_ENCODING = "encoding";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.charset = charset;
            charset = Charset.forName(encodingName);

        if (FORMAT_NATIVE.equals(formatterId)) {


 * You may obtain a copy of the License at
public class BinaryAttributeTransformer implements DBDAttributeTransformer {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.utils.GeneralUtils;
            ByteBuffer bb = charset.encode(CommonUtils.toString(value));
        }
        try {
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    private static final String PROP_FORMAT = "format";
        DBPDataSource dataSource = session.getDataSource();
        }





        @NotNull
import org.jkiss.dbeaver.DBException;
        } else {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
            if (value == null) {
    @Override
        String formatterId = CommonUtils.toString(options.get(PROP_FORMAT), FORMAT_HEX);
            super(target);
        Charset charset;
            formatter = new BinaryFormatterString();
 */
    private static final Log log = Log.getLog(BinaryAttributeTransformer.class);
 *
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {

import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
        }
 * See the License for the specific language governing permissions and
import java.nio.charset.Charset;
                return super.getValueDisplayString(column, null, format);
import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterString;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBValueFormatting;
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
        String encodingName = CommonUtils.toString(options.get(PROP_ENCODING), GeneralUtils.UTF8_ENCODING);
