    private static final DateTimeFormatter DEFAULT_TIME_FORMAT = DateTimeFormatter.ofPattern("'TIME '''HH:mm:ss.SSS''");
    }
import org.jkiss.code.NotNull;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    }
}
 * Licensed under the Apache License, Version 2.0 (the "License");

            case Types.TIME:
 *

    @Override
        switch (type.getTypeID()) {
    private static final DateTimeFormatter DEFAULT_DATE_FORMAT = DateTimeFormatter.ofPattern("'DATE '''yyyy-MM-dd''");
            case Types.DATE:
        if (type.getTypeID() == OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE) {
    @Override
                return DEFAULT_DATE_FORMAT;
    public OracleTemporalAccessorValueHandler(DBDFormatSettings formatSettings)
        }
    }
                return OracleTimestampConverter.toTimestamp(object, ((JDBCSession) session).getOriginal());
            if (!((String) value).startsWith("TIMESTAMP")) {
    protected boolean isZonedType(DBSTypedObject type) {
        if (object != null && object.getClass().getName().startsWith(OracleConstants.TIMESTAMP_CLASS_NAME)) {
        return super.getValueDisplayString(column, value, format);
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
    }


 *
    @Override
            } else {
 * Object type support
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    {
            default:
    private static final DateTimeFormatter DEFAULT_DATETIME_FORMAT = DateTimeFormatter.ofPattern("'TIMESTAMP '''yyyy-MM-dd HH:mm:ss.nnnnnn''");
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.exec.DBCException;

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        }
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE:
            case Types.TIMESTAMP_WITH_TIMEZONE:
                throw new DBCException("Error extracting Oracle TIMESTAMP value", e);

 * See the License for the specific language governing permissions and
                return super.getFormatterId(column);
                return DEFAULT_TIME_FORMAT;
    private static final DateTimeFormatter DEFAULT_DATETIME_TZ_FORMAT = DateTimeFormatter.ofPattern("'TIMESTAMP '''yyyy-MM-dd HH:mm:ss.nnnnnn X''");
                return (String) value;
                return "TIMESTAMP'" + value + "'";
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DateTimeFormatter getNativeValueFormat(DBSTypedObject type) {
            return true;
            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_LOCAL_TIMEZONE:

                return DEFAULT_DATETIME_TZ_FORMAT;
                return DEFAULT_TIME_TZ_FORMAT;
 */
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCTemporalAccessorValueHandler;
/*
            case Types.TIME_WITH_TIMEZONE:
import org.jkiss.dbeaver.model.exec.DBCSession;
public class OracleTemporalAccessorValueHandler extends JDBCTemporalAccessorValueHandler {
        switch (column.getTypeID()) {
            }
import org.jkiss.code.Nullable;
    protected String getFormatterId(DBSTypedObject column) {
                return DEFAULT_DATETIME_FORMAT;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (format == DBDDisplayFormat.NATIVE && value instanceof String) {
            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_LOCAL_TIMEZONE:
        }
 * You may obtain a copy of the License at
import java.time.format.DateTimeFormatter;

        }
 *

        }
        return super.getValueFromObject(session, type, object, copy, validateValue);
        super(formatSettings);
    @NotNull
                return DBDDataFormatter.TYPE_NAME_TIMESTAMP_TZ;
            try {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
            }
 * Unless required by applicable law or agreed to in writing, software
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {

            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE:
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
/**
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }

    @NotNull
import java.sql.Types;
    }
            case Types.TIMESTAMP:
        return super.getNativeValueFormat(type);
package org.jkiss.dbeaver.ext.oracle.data;
    @Nullable
        return super.isZonedType(type);
 */
            } catch (Exception e) {
