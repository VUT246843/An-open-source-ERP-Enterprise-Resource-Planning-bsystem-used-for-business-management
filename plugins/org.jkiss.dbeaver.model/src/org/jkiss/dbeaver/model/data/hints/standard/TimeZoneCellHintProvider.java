}

        }


 *     http://www.apache.org/licenses/LICENSE-2.0
        if (mm != 0) {
        int mm = offset % 60;
    @Override
        return new String(buf);
        } else {
package org.jkiss.dbeaver.model.data.hints.standard;
 */
import org.jkiss.code.NotNull;
/*
        @NotNull EnumSet<DBDValueHint.HintType> types,
        @NotNull DBDResultSetModel model,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) {
            if (value instanceof Date ts) {
            buf[4] += (char) (hh / 10);
        int options
import org.jkiss.code.Nullable;
                }
        @NotNull DBDAttributeBinding attribute,
            buf[7] += (char) (mm / 10);
                return new DBDValueHint[]{
import org.jkiss.dbeaver.model.data.hints.ValueHintText;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static String toCustomID(int gmtOffset) {
 * See the License for the specific language governing permissions and

                        "Timezone", null)
        }
        int hh = offset / 60;
    public DBDValueHint[] getCellHints(
        }
        char sign;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                    timezone = toCustomID(timezoneOffset);

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 *
            buf[8] += (char) (mm % 10);
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataKind;
                int timezoneOffset = ts.getTimezoneOffset() * -60000;
        }
                };
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
        buf[5] += (char) (hh % 10);
            sign = '+';
            }
            if (timezone != null) {
            offset = -offset;
        if (hh >= 10) {
        int offset = gmtOffset / 60000;
    @Nullable

 * you may not use this file except in compliance with the License.
                    new ValueHintText(
import org.jkiss.dbeaver.model.data.DBDValueRow;
            sign = '-';
    private static final boolean SHOW_TZ_ALWAYS = true;
        if (attribute.getDataKind() == DBPDataKind.DATETIME) {
            String timezone = null;
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;
 *
            }
                if (SHOW_TZ_ALWAYS || timezoneOffset != TimeZone.getDefault().getRawOffset()) {
 */
import java.util.Date;
        @Nullable Object value,
    }

public class TimeZoneCellHintProvider implements DBDCellHintProvider {
        @NotNull DBDValueRow row,
        if (offset >= 0) {
 * You may obtain a copy of the License at
/**
import org.jkiss.dbeaver.model.data.DBDResultSetModel;

 * Time zone hint provider
        char[] buf = new char[] { 'G', 'M', 'T', sign, '0', '0', ':', '0', '0' };
                        timezone,
import java.util.TimeZone;
 * DBeaver - Universal Database Manager
import java.util.EnumSet;
        return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
