            return Timestamp.valueOf(value.toString());
            return Timestamp.valueOf(localDateTime);
            }
                        log.error("Error formatting date", e);
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
            } else if (value instanceof LocalDateTime localDateTime) {
            } else {
                return null;
    public static final SimpleDateFormat DEFAULT_DATETIME_FORMAT = new SimpleDateFormat("''" + DBConstants.DEFAULT_TIMESTAMP_FORMAT + "''");
        };
    @NotNull
            case Types.TIMESTAMP_WITH_TIMEZONE -> DEFAULT_DATETIME_FORMAT;

        } else {
            } else {
            return "0" + value;
import java.text.ParseException;
    @Override
    }
        Object value = super.getValueFromObject(session, type, object, copy, validateValue);
    @Nullable
        return switch (column.getTypeID()) {
        } else if (value instanceof LocalDateTime localDateTime) {
                        yield getValueFromObject(session, type, value, false, false);
                        dbStat.setTime(index + 1, getTimeValue(value));
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
 * limitations under the License.
 *
    protected Format getNativeValueFormat(DBSTypedObject type) {
                case Types.DATE -> getDateValue(value);
                    e.getCause() instanceof UnsupportedOperationException) {
            return time;
 * JDBC string value handler
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        } else if (value instanceof OffsetDateTime offsetDateTime) {
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import org.jkiss.dbeaver.model.DBConstants;
            case Types.TIMESTAMP_WITH_TIMEZONE -> DBDDataFormatter.TYPE_NAME_TIMESTAMP_TZ;
    public static final SimpleDateFormat DEFAULT_DATETIME_TZ_FORMAT = new SimpleDateFormat("''" + DBConstants.DEFAULT_TIMESTAMP_TZ_FORMAT + "''");
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    @Override
            } catch (SQLException e1) {
                        return objectValue;

                // It seems that some drivers doesn't support reading date/time values with explicit calendar
                    try {
            }
 */
        if (format == DBDDisplayFormat.NATIVE) {
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
import java.time.OffsetDateTime;
                        SQLState.SQL_S1009.getCode().equals(e.getSQLState()) ||

                value = getTimestampValue(localDateTime);
                        // Perhaps some database-specific timestamp representation. E.lg. H2 TimestampWithTimezone
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.impl.data.DateTimeCustomValueHandler;
        return switch (type.getTypeID()) {
        } catch (SQLException e) {
                // Some custom value format.
        if (value instanceof Date || value instanceof LocalDate || value instanceof LocalDateTime) {
        };
                        break;
            case Types.TIMESTAMP -> DEFAULT_DATETIME_FORMAT;
                        if (isReadDateAsObject()) {
public class JDBCDateTimeValueHandler extends DateTimeCustomValueHandler {
                    SQLState.SQL_42000.getCode().equals(e.getSQLState()) ||
            return timestamp;
        }
                switch (type.getTypeID()) {
                value = getDateValue(localDate);
                case Types.TIME, Types.TIME_WITH_TIMEZONE -> getTimeValue(value);
                };
                        return nativeFormat.format(value);
            return java.sql.Date.valueOf(localDate);
    @Nullable
            if (resultSet instanceof JDBCResultSet dbResults) {
    }
                if (formatSettings.isUseNativeDateTimeFormat()) {
            return null;
                if (e.getCause() instanceof ParseException ||
                    case Types.TIME, Types.TIME_WITH_TIMEZONE -> dbResults.getTime(index + 1);
                    return ((JDBCResultSet) resultSet).getString(index + 1);

        } else if (value != null) {

    protected String getFormatterId(DBSTypedObject column) {

            throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
                        return objectValue;
            return Timestamp.valueOf(localDate.atStartOfDay());
    @Nullable
                    }
            if (value instanceof Date) {
                    case Types.DATE -> {
                if (!strValue.startsWith("'") && !strValue.endsWith("'")) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                }

                    case Types.TIME_WITH_TIMEZONE:
        } else if (value instanceof LocalDateTime localDateTime) {
                        SQLState.SQL_HY000.getCode().equals(e.getSQLState())) {
                default -> getTimestampValue(value);
import org.jkiss.dbeaver.model.sql.SQLState;
                            yield getValueFromObject(session, type, dbResults.getObject(index + 1), false, false);
                    } else if (objectValue != null) {
            }
                        return null;
            return java.sql.Time.valueOf(localDateTime.toLocalTime());
    @Override
import java.sql.Types;
        } else if (value instanceof Date date) {
            return null;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    public JDBCDateTimeValueHandler(DBDFormatSettings formatSettings) {
                    case Types.TIME:
                        break;
    public static final SimpleDateFormat DEFAULT_TIME_FORMAT = new SimpleDateFormat("''" + DBConstants.DEFAULT_TIME_FORMAT + "''");
    @Override
                        // and it will be converted in string at late binding stage making incorrect string value: Date.toString()
    public static final SimpleDateFormat DEFAULT_TIME_TZ_FORMAT = new SimpleDateFormat("''" + DBConstants.DEFAULT_TIME_TZ_FORMAT + "''");
 * DBeaver - Universal Database Manager
            };
        } else if (value != null) {
                dbStat.setNull(index + 1, type.getTypeID());
                    } else if (objectValue instanceof String) {

        if (value instanceof java.sql.Date date) {
                Format nativeFormat = getNativeValueFormat(column);
            return new Timestamp(date.getTime());
    protected static java.sql.Date getDateValue(Object value) {
    public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
        } else {
 *
            case Types.TIME_WITH_TIMEZONE -> DEFAULT_TIME_TZ_FORMAT;
                        break;
            return Timestamp.valueOf((offsetDateTime.toLocalDateTime()));
import java.text.SimpleDateFormat;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
                        log.debug("Can't read date/time value as string: " + e.getMessage());
 * Unless required by applicable law or agreed to in writing, software
                    }
                } else if (
                // So let's use simple version
                }

            JDBCPreparedStatement dbStat = (JDBCPreparedStatement) statement;
            return new java.sql.Time(date.getTime());
        }
 */
            return null;


}    }
        } else {
    protected boolean isReadDateAsObject() {
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
            case Types.TIME -> DEFAULT_TIME_FORMAT;
                        // Do not convert to Date object because table column has STRING type
import java.time.LocalDateTime;
            } else if (value instanceof String) {
 *
                        dbStat.setDate(index + 1, getDateValue(value));
                    }
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                log.debug("Can't retrieve datetime object", e1);
    protected static java.sql.Time getTimeValue(Object value) {
            return String.valueOf(value);
                if (nativeFormat != null) {
    }
            case Types.DATE -> DEFAULT_DATE_FORMAT;
    @Nullable
            } else if (value instanceof String strValue) {
            return java.sql.Date.valueOf(value.toString());
    }
            // JDBC uses 1-based indexes
            if (value == null) {
            try {
            return java.sql.Time.valueOf(value.toString());
                    // [MySQL, Netezza] workaround. Time value may be interval (should be read as string)
                    }
        if (value < 10) {
            return new java.sql.Date(date.getTime());
                    strValue = "'" + strValue + "'";
                        return dbResults.getString(index + 1);

            case Types.TIME -> DBDDataFormatter.TYPE_NAME_TIME;
import org.jkiss.code.NotNull;
        } else if (value instanceof Date date) {
                    // [SQLite] workaround.
        }
import java.sql.SQLException;
        } else if (value instanceof Date date) {

                    try {
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * you may not use this file except in compliance with the License.
            case Types.DATE -> DBDDataFormatter.TYPE_NAME_DATE;


            case Types.TIME_WITH_TIMEZONE -> DBDDataFormatter.TYPE_NAME_TIME_TZ;
                }
                    } catch (Exception e) {
                    }
            default -> DBDDataFormatter.TYPE_NAME_TIMESTAMP;
                return super.getValueDisplayString(column, strValue, format);
    public Object fetchValueObject(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, @NotNull DBSTypedObject type, int index) throws DBCException {
                }
        try {
        } else if (value != null) {
                    default:
                    if (objectValue instanceof Date) {
     */
    public static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("''" + DBConstants.DEFAULT_DATE_FORMAT + "''");
        }
                // Ignore
        } else if (value instanceof LocalDateTime localDateTime) {
                        dbStat.setTimestamp(index + 1, getTimestampValue(value));
            throw new DBCException(e, session.getExecutionContext());
        }
        if (value instanceof Timestamp timestamp) {
                    case Types.DATE:
                        yield dbResults.getDate(index + 1);
/**
        try {
    @NotNull
                        Object value = dbResults.getObject(index + 1);
    }
        return super.getValueDisplayString(column, value, format);
        }
        } else if (value instanceof LocalDate localDate) {
                }
        super(formatSettings);
        }
                        return objectValue.toString();
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
import org.jkiss.dbeaver.model.messages.ModelMessages;
    }
     * Allow to read datatime from LocalTime object
        return value;
import java.sql.Timestamp;
    }
        } catch (SQLException e) {
                        }
            return java.sql.Time.valueOf(localDate.atStartOfDay().toLocalTime());
                return resultSet.getAttributeValue(index);
                    default -> {
    }
            default -> null;
    }
                    } catch (SQLException e) {
import java.util.Date;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.text.Format;
        }
    /**
                    } else {
                // check for native format
            return switch (type.getTypeID()) {
    }
    }
        } else {
            if (value instanceof LocalDate localDate) {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (value instanceof LocalDate localDate) {

    protected static java.sql.Timestamp getTimestampValue(Object value) {
            return java.sql.Date.valueOf(localDateTime.toLocalDate());
import org.jkiss.dbeaver.model.exec.DBCException;
    protected static String getTwoDigitValue(int value) {
                return switch (type.getTypeID()) {
                dbStat.setString(index + 1, (String) value);
            return date;
import java.time.LocalDate;
        if (value instanceof java.sql.Time time) {
                    Object objectValue = ((JDBCResultSet) resultSet).getObject(index + 1);
        } else if (value instanceof LocalDate localDate) {
        return false;
            }
