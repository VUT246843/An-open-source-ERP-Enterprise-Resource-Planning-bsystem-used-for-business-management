        }
            case Types.DATE:
 * DBeaver - Universal Database Manager
                try {
    public Object fetchValueObject(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, @NotNull DBSTypedObject type, int index) throws DBCException {
            } else if (value instanceof TemporalAccessor) {
    public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
            if (resultSet instanceof JDBCResultSet) {
        try {
import org.jkiss.code.Nullable;
                    }
                    log.error("Error formatting date", e);
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)
                    return dbResults.getObject(index + 1, ZonedDateTime.class);
    public static final DateTimeFormatter DEFAULT_TIME_FORMAT = DateTimeFormatter.ofPattern("''" + DBConstants.DEFAULT_TIME_FORMAT + "''");
                    return nativeFormat.format((TemporalAccessor) value);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

            // JDBC uses 1-based indexes
import org.jkiss.code.NotNull;
            case Types.TIMESTAMP:

                return DBDDataFormatter.TYPE_NAME_DATE;
import org.jkiss.dbeaver.model.impl.data.TemporalAccessorValueHandler;
    {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            case Types.TIME_WITH_TIMEZONE:

                return false;
 * See the License for the specific language governing permissions and
            }
    public static final DateTimeFormatter DEFAULT_TIMESTAMP_FORMAT = DateTimeFormatter.ofPattern("''" + DBConstants.DEFAULT_TIMESTAMP_FORMAT + "''");
import org.jkiss.dbeaver.model.messages.ModelMessages;
                }

 * you may not use this file except in compliance with the License.
    {
                dbStat.setObject(index + 1, value);
            } else {
            if (nativeFormat != null) {
                    try {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Copyright (C) 2010-2024 DBeaver Corp and others

            case Types.TIMESTAMP_WITH_TIMEZONE:
                return DBDDataFormatter.TYPE_NAME_TIME;

            }
            default:
    public static final DateTimeFormatter DEFAULT_TIMESTAMP_TZ_FORMAT = DateTimeFormatter.ofPattern("''" + DBConstants.DEFAULT_TIMESTAMP_TZ_FORMAT + "''");
    }
/**
                return DEFAULT_DATE_FORMAT;
    protected boolean isZonedType(DBSTypedObject type) {
                return DBDDataFormatter.TYPE_NAME_TIME_TZ;
            JDBCPreparedStatement dbStat = (JDBCPreparedStatement)statement;
                dbStat.setNull(index + 1, type.getTypeID());
    @Override
        catch (SQLException e) {
    public JDBCTemporalAccessorValueHandler(DBDFormatSettings formatSettings)
                return DEFAULT_TIMESTAMP_TZ_FORMAT;
 */
    }
        return null;
        }
                } else {

    }
            if (value == null) {
    protected String getFormatterId(DBSTypedObject column)
    }
            case Types.TIME_WITH_TIMEZONE:
            case Types.TIME:
    public static final DateTimeFormatter DEFAULT_TIME_TZ_FORMAT = DateTimeFormatter.ofPattern("''" + DBConstants.DEFAULT_TIME_TZ_FORMAT + "''");
}
                    return dbResults.getObject(index + 1, LocalDateTime.class);
                return DBDDataFormatter.TYPE_NAME_TIMESTAMP;
        catch (SQLException e) {
        if (value instanceof TemporalAccessor && format == DBDDisplayFormat.NATIVE) {
import java.sql.Types;
            throw new DBCException(e, session.getExecutionContext());
        }
        }

 *
    protected DateTimeFormatter getNativeValueFormat(DBSTypedObject type) {
                if (isZonedType(type)) {
    }
import java.time.format.DateTimeFormatter;
import org.jkiss.dbeaver.model.DBConstants;
                } catch (Exception e) {
 * Unless required by applicable law or agreed to in writing, software
            throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
    {
import java.time.temporal.TemporalAccessor;
 * You may obtain a copy of the License at
        switch (type.getTypeID()) {
public class JDBCTemporalAccessorValueHandler extends TemporalAccessorValueHandler {
    @NotNull
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
import org.jkiss.dbeaver.model.exec.DBCException;
        }
        try {
    public static final DateTimeFormatter DEFAULT_DATE_FORMAT = DateTimeFormatter.ofPattern("''" + DBConstants.DEFAULT_DATE_FORMAT + "''");
                if (session.isUseNativeDateTimeFormat()) {
                return true;
        }
 * limitations under the License.
import java.time.ZonedDateTime;
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
        }
                return DEFAULT_TIME_FORMAT;
 * JDBC zoned datetime value handler
    @Override
                        log.debug("Can't read date/time value as string: " + e.getMessage());
            case Types.TIME:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            DateTimeFormatter nativeFormat = getNativeValueFormat(column);
        switch (column.getTypeID()) {
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
    @NotNull


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                    } catch (SQLException e) {

import org.jkiss.dbeaver.model.exec.DBCResultSet;
                return DEFAULT_TIMESTAMP_FORMAT;
 */
            case Types.DATE:
    @Nullable
                return resultSet.getAttributeValue(index);
                return DEFAULT_TIME_TZ_FORMAT;
            default:
 *
        super(formatSettings);
 *

            }
                        return dbResults.getString(index + 1);
                JDBCResultSet dbResults = (JDBCResultSet) resultSet;
            case Types.TIMESTAMP_WITH_TIMEZONE:
            case Types.TIMESTAMP_WITH_TIMEZONE:
    @Override
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * Licensed under the Apache License, Version 2.0 (the "License");
                return DBDDataFormatter.TYPE_NAME_TIMESTAMP_TZ;
    }
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
                }
import java.sql.SQLException;
        }
            case Types.TIME_WITH_TIMEZONE:
    @Override
import java.time.LocalDateTime;
                }
        return super.getValueDisplayString(column, value, format);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        switch (type.getTypeID()) {
