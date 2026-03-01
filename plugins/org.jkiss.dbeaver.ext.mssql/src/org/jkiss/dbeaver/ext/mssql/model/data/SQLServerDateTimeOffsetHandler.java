            && !formatSettings.isUseNativeDateTimeFormat()
    ) throws DBCException {
    /**
            }
    }
        if (value instanceof OffsetDateTime) {
        if (
import org.jkiss.utils.BeanUtils;
 * DBeaver - Universal Database Manager
        return DBDDataFormatter.TYPE_NAME_TIMESTAMP_TZ;
        int index,
    @Override
        @NotNull DBSTypedObject type,
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
        @NotNull DBSTypedObject type,
import java.sql.Timestamp;
        boolean copy,
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.mssql.model.data;
     * {@link <a href="https://learn.microsoft.com/en-us/sql/connect/jdbc/reference/datetimeoffset-members?view=sql-server-ver16">...</a>}
 *     http://www.apache.org/licenses/LICENSE-2.0
                int offsetSeconds = offset * 60;
 * limitations under the License.
                return null;
        ) {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
}
            DBDDataFormatter formatter = getFormatter(type);
    public SQLServerDateTimeOffsetHandler(DBDFormatSettings formatSettings) {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
                }
            String s = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(((OffsetDateTime) value));
        super(formatSettings);
                if (timestamp == null) {
        }
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.NotNull;
            && object.getClass().getName().equals("microsoft.sql.DateTimeOffset")
                log.debug("Error parsing offset datetime value", e);
                return formatter.parseValue(((String) object), OffsetDateTime.class);
import java.time.ZoneOffset;
import org.jkiss.dbeaver.model.exec.DBCSession;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * custom SQL Server type
        boolean validateValue
        Object object,
    @NotNull
    }
    }
            super.bindValueObject(session, statement, type, index, s);
        @Nullable Object value

    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    protected String getFormatterId(DBSTypedObject column) {
    @Override
        return super.getValueFromObject(session, type, object, copy, validateValue);
        super.bindValueObject(session, statement, type, index, value);
        @NotNull DBCSession session,
 */
 *
    @Override
    ) throws DBCException {

            } catch (Throwable e) {
        return super.getFormatter(column);
    public void bindValueObject(
     */
public class SQLServerDateTimeOffsetHandler extends JDBCDateTimeValueHandler {
    protected DBDDataFormatter getFormatter(DBSTypedObject column) {
    @Override
import org.jkiss.dbeaver.model.exec.DBCStatement;
import java.time.OffsetDateTime;
                    log.debug("Extracted timestamp is null");

 *
        if (object instanceof String) {
/*
                    return null;
import org.jkiss.code.Nullable;
    private static final Log log = Log.getLog(JDBCStringValueHandler.class);
    @NotNull
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
    }
            try {
import org.jkiss.dbeaver.Log;

            } catch (ParseException e) {
            return;
                log.debug("error extracting datetimeoffset timestamp", e);
            try {
 * Unless required by applicable law or agreed to in writing, software
import java.text.ParseException;

                return timestamp.toInstant().atOffset(ZoneOffset.ofTotalSeconds(offsetSeconds));
 * You may obtain a copy of the License at
        }
                Timestamp timestamp = (Timestamp) BeanUtils.invokeObjectMethod(object, "getTimestamp");
            object != null
import java.time.format.DateTimeFormatter;
 *
        @NotNull DBCSession session,


        @NotNull DBCStatement statement,
                int offset = (int) BeanUtils.invokeObjectMethod(object, "getMinutesOffset");
    public Object getValueFromObject(
