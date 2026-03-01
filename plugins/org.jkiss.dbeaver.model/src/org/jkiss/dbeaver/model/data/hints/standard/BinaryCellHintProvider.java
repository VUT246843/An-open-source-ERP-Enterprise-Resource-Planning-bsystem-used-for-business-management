 */
        ) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return new DBDValueHint[] {
            } else if (value instanceof byte[] bytes) {
    private static final Log log = Log.getLog(BinaryCellHintProvider.class);
                    contentLength = content.getContentLength();
 * Binary hint provider
            } else if (value instanceof CharSequence chars) {
import org.jkiss.dbeaver.utils.ContentUtils;
                    !CommonUtils.isBitSet(options, OPTION_TOOLTIP) ? "[" + formattedLength + "]" : formattedLength,
import java.util.EnumSet;


import org.jkiss.utils.ByteNumberFormat;
                contentLength = bytes.length;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.DBDContent;
        @NotNull DBDValueRow row,
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.DBDValueRow;
import org.jkiss.code.NotNull;
        @NotNull DBDResultSetModel model,
        @NotNull EnumSet<DBDValueHint.HintType> types,
 * you may not use this file except in compliance with the License.

/**
 * You may obtain a copy of the License at
                }
                    "Data length", null)
            String formattedLength = LENGTH_FORMAT.format(contentLength);
                try {
        int options
package org.jkiss.dbeaver.model.data.hints.standard;
    ) {
                return null;
import org.jkiss.dbeaver.model.data.hints.ValueHintText;
            !DBUtils.isNullValue(value)
    @Override
import org.jkiss.code.Nullable;
public class BinaryCellHintProvider implements DBDCellHintProvider {
                } catch (DBCException e) {

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
 *
            }

    private final ByteNumberFormat LENGTH_FORMAT = new ByteNumberFormat();
            };
}
import org.jkiss.dbeaver.model.exec.DBCException;

        @NotNull DBDAttributeBinding attribute,
            if (value instanceof DBDContent content && !ContentUtils.isTextContent(content)) {
    }
                    log.debug("Cannot read content length", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 */
            long contentLength = 0;
        return null;
 * limitations under the License.
        @Nullable Object value,
            if (contentLength == 0) {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
                new ValueHintText(
import org.jkiss.dbeaver.Log;
 * DBeaver - Universal Database Manager
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBDValueHint[] getCellHints(
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
/*
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;

        if (types.contains(DBDValueHint.HintType.STRING) &&
 *
                contentLength = chars.length();
        }
