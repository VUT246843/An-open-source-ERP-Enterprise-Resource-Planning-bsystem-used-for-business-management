    public MySQLDateTimeValueHandler(DBDFormatSettings formatSettings)
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
    private static final Date ZERO_TIMESTAMP = new Date(0l);
    }
/**
import java.sql.Types;
 * DBeaver - Universal Database Manager
                    dbStat.setInt(index + 1, cal.get(Calendar.YEAR));
            try {
                }
        return super.getValueFromObject(session, type, object, copy, validateValue);
            // Workaround for zero values (#1127)
            // In MySQL driver, negative dates aren't returned when using #getString.

            // Weirdly enough, the expected value is returned when using #getBytes().
            catch (SQLException e) {
            catch (SQLException e) {
                throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
                    return year;
            } catch (SQLException e) {
                    dbStat.setString(index + 1, ZERO_DATE_STRING);
                if (MySQLConstants.TYPE_YEAR.equalsIgnoreCase(type.getTypeName())) {
import org.jkiss.code.Nullable;

}
        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
            try {
        if (value == ZERO_DATE) {
                    cal.setTime((Date) value);
        return super.fetchValueObject(session, resultSet, type, index);
                    break;
 * Licensed under the Apache License, Version 2.0 (the "License");
                } catch (SQLException e) {
    @Override
                }
import java.nio.charset.StandardCharsets;
                if (value instanceof Number) {
            }
            super.bindValueObject(session, statement, type, index, value);
                    }
    }
 *
                  after 24H. We only want this by default for Maria because MySQL5 will
 */
        }

                } else if (value instanceof Date) {
                        return ZERO_TIMESTAMP;
                    int year = dbResults.getInt(index + 1);
                    if (object.equals(ZERO_DATE_STRING)) {
                log.debug("Exception caught when fetching date/time value", e);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            if (!isMariaDB && type.getTypeID() == Types.TIME && formatSettings.isUseNativeDateTimeFormat()) {
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        } else if (MySQLConstants.TYPE_YEAR.equalsIgnoreCase(type.getTypeName())) {
                throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
 *
            try {
import org.jkiss.dbeaver.utils.ContentUtils;
package org.jkiss.dbeaver.ext.mysql.data;
    @Override
                JDBCPreparedStatement dbStat = (JDBCPreparedStatement)statement;
import org.jkiss.dbeaver.model.messages.ModelMessages;

            return ZERO_DATE_STRING;
                 */
        super(formatSettings);
                } else {
                    if (object.equals(ZERO_TIMESTAMP_STRING)) {
                default:
import java.sql.SQLException;
            }

 *     http://www.apache.org/licenses/LICENSE-2.0
                }
 * You may obtain a copy of the License at

                  fail regardless of used method for value bigger than 24h. And MySQL8 will
        }
                    if (dbResults.wasNull()) {
public class MySQLDateTimeValueHandler extends JDBCDateTimeValueHandler {
import org.jkiss.dbeaver.model.exec.DBCResultSet;
                try {
            return ZERO_TIMESTAMP_STRING;
    @NotNull
                    return dbResults.getString(index + 1);
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                    // We want to be extra sure about bytes containing actual text and not binary data
                byte[] bytes = null;
                    dbStat.setString(index + 1, (String) value);
                    }
    private static final String ZERO_TIMESTAMP_STRING = "0000-00-00 00:00:00";
    }
            switch (type.getTypeID()) {
    {
                    // ignored
                if (isMariaDB && type.getTypeID() == Types.TIME) {
                  try to getTime(). If it fails, we will get value via getString()
        } else if (value == ZERO_TIMESTAMP) {
import org.jkiss.dbeaver.model.exec.DBCSession;
                }
        }
import java.util.Calendar;

    private static final Date ZERO_DATE = new Date(0l);
            }
                        return null;
            }
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
                    dbStat.setObject(index + 1, value);
    public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
 * Unless required by applicable law or agreed to in writing, software
 * MySQL datetime handler
                } else if (value instanceof String) {
                    }
 *
    public Object fetchValueObject(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, @NotNull DBSTypedObject type, int index) throws DBCException {

import org.jkiss.dbeaver.ext.mysql.MySQLUtils;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    dbStat.setString(index + 1, ZERO_TIMESTAMP_STRING);
import org.jkiss.code.NotNull;
                    Calendar cal = Calendar.getInstance();
    private static final String ZERO_DATE_STRING = "0000-00-00";
import java.util.Date;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
import org.jkiss.dbeaver.model.exec.DBCException;
        return super.getValueDisplayString(column, value, format);
 * limitations under the License.
                  We want to handle time as a String for MariaDB due to it silently cutting the values
 */
            }
                if (ContentUtils.isAsciiText(bytes)) {
        if (value == ZERO_DATE || value == ZERO_TIMESTAMP) {

                }
import org.jkiss.dbeaver.model.exec.DBCStatement;

                        return ZERO_DATE;
            boolean isMariaDB = MySQLUtils.isMariaDB(session.getDataSource().getContainer().getDriver());
        if (resultSet instanceof JDBCResultSet dbResults) {
                case Types.DATE:
            }
/*
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                } else {
                }
 * you may not use this file except in compliance with the License.
        if (object instanceof String) {
                    bytes = dbResults.getBytes(index + 1);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    }
    @Override
                    break;
 * See the License for the specific language governing permissions and
                if (value == ZERO_DATE) {
                /*
            }
                    return new String(bytes, StandardCharsets.ISO_8859_1);
                    dbStat.setInt(index + 1, ((Number) value).intValue());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                JDBCPreparedStatement dbStat = (JDBCPreparedStatement)statement;
    @Override
