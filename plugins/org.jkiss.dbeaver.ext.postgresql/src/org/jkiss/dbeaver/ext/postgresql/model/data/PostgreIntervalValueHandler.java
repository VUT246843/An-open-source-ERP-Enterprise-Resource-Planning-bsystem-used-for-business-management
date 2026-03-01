                Number seconds = (Number) BeanUtils.readObjectProperty(value, "seconds");
                }
        "(?:(?<time>\\d{2}:\\d{2}:\\d{2}(?:\\.\\d+)?))?\\b";

        long totalSeconds = 0;
        "(?:(?<days>\\d+)\\s+days?)?\\s*" +
    private static final Pattern pattern = Pattern.compile(intervalRegex);
                    isPgObject = PostgreUtils.isPgObject(dataContainer.getDataSource(), value);
import org.jkiss.dbeaver.model.exec.DBCSession;
        SECONDS_FORMAT = new DecimalFormat("0.00####");
    }
    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
                    .append(minutes).append(":")
                totalSeconds += (long) Integer.parseInt(timeParts[0]) * MILLISECONDS_IN_HOUR;
    }
    @Override
        };
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                Number minutes = (Number) BeanUtils.readObjectProperty(value, "minutes");
        DBCSession session,
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
    public static final PostgreIntervalValueHandler INSTANCE = new PostgreIntervalValueHandler();
                totalSeconds += (long) (Double.parseDouble(timeParts[2]) - intValue);
            if (months != null) {
                    .append(seconds).append(SECONDS_FORMAT.format(seconds));
                Number years = (Number) BeanUtils.readObjectProperty(value, "years");
    private long getSecondsFromInterval(String interval) {
        if (value == null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
                Number months = (Number) BeanUtils.readObjectProperty(value, "months");
            if (source != null) {
        if (matcher.find()) {
    @Override
    private static final long MILLISECONDS_IN_HOUR = 60 * MILLISECONDS_IN_MINUTE;
            if (years != null) {
        return super.getValueDisplayString(column, value, format);
                if (months != null && months.intValue() > 0) str.append(months).append(" month").append(months.intValue() > 1 ? "s" : "").append(" ");
 * Interval value handler.
 * you may not use this file except in compliance with the License.
        }
 * DBeaver - Universal Database Manager
            String months = matcher.group("months");
            if ("-".equals(sign)) {
        dfs.setDecimalSeparator('.');
        }
                totalSeconds += Long.parseLong(days) * MILLISECONDS_IN_DAY;
            String days = matcher.group("days");
            }
                return str.toString();
import java.text.DecimalFormatSymbols;
                if (years != null && years.intValue() > 0) str.append(years).append(" year").append(years.intValue() > 1 ? "s" : "").append(" ");
        JDBCResultSet resultSet,
 */
        int index)


/**

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private static final long MILLISECONDS_IN_YEAR = 365 * MILLISECONDS_IN_DAY;
 * See the License for the specific language governing permissions and

    private static final long MILLISECONDS_IN_MINUTE = 60 * MILLISECONDS_IN_SECOND;

        "(?:(?<years>\\d+)\\s+years?)?\\s*" +
    private static final Log log = Log.getLog(PostgreIntervalValueHandler.class);
    }
import java.util.Comparator;
                if (days != null && days.intValue() > 0) str.append(days).append(" day").append(days.intValue() > 1 ? "s" : "").append(" ");
            long rightInterval = getSecondsFromInterval((String) o2);
        SECONDS_FORMAT.setDecimalFormatSymbols(dfs);
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
                str
                totalSeconds += Long.parseLong(months) * MILLISECONDS_IN_MONTH;
    private static final long MILLISECONDS_IN_SECOND = 1000;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            try {
    }
import java.text.DecimalFormat;
} *
                if (dataContainer != null) {
        return resultSet.getString(index);
            }
            String time = matcher.group("time");
                totalSeconds += Long.parseLong(years) * MILLISECONDS_IN_YEAR;
                log.debug(e);
                long intValue = (long) Double.parseDouble(timeParts[2]);
        } else {
    }
        throws SQLException
            }

    public Comparator<Object> getComparator() {
/*
    private static final String intervalRegex = "(?i)(?<sign>-)?\\s*" +
    static {
    {
            if (time != null) {
        return totalSeconds;
 *

    private static final long MILLISECONDS_IN_MONTH = 30 * MILLISECONDS_IN_DAY;
    @Override
public class PostgreIntervalValueHandler extends JDBCStringValueHandler {
import java.util.regex.Pattern;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import org.jkiss.utils.BeanUtils;
                totalSeconds += (long) Integer.parseInt(timeParts[1]) * MILLISECONDS_IN_MINUTE;
        }
                totalSeconds = -totalSeconds;
 * You may obtain a copy of the License at
    @Override
            }
    }
            long leftInterval = getSecondsFromInterval((String) o1);
            }
    // parsing values like: 3 mons 15 days, 00:00:00.12, -9 days

import java.util.regex.Matcher;
            String years = matcher.group("years");
                String[] timeParts = time.split(":");
        DBSTypedObject type,

 */
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return (o1, o2) -> {
            DBCExecutionSource source = columnMetaData.getSource();
 * Unless required by applicable law or agreed to in writing, software
                StringBuilder str = new StringBuilder();
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
                Number days = (Number) BeanUtils.readObjectProperty(value, "days");
            String sign = matcher.group("sign") != null ? "-" : "";
            statement.setNull(paramIndex, paramType.getTypeID());
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                totalSeconds += intValue * MILLISECONDS_IN_SECOND;
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCColumnMetaData;

        "(?:(?<months>\\d+)\\s+mon(?:s|ths)?)?\\s*" +
 * distributed under the License is distributed on an "AS IS" BASIS,
                    .append(hours).append(":")
import org.jkiss.dbeaver.Log;

        DecimalFormatSymbols dfs = SECONDS_FORMAT.getDecimalFormatSymbols();

            }
            statement.setObject(paramIndex, value.toString(), Types.OTHER);
        Matcher matcher = pattern.matcher(interval);

    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
        boolean isPgObject = false;
            return Long.compare(leftInterval, rightInterval);

        if (column instanceof JDBCColumnMetaData columnMetaData) {
import java.sql.Types;
                DBSDataContainer dataContainer = source.getDataContainer();
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
package org.jkiss.dbeaver.ext.postgresql.model.data;
    private static final DecimalFormat SECONDS_FORMAT;
                Number hours = (Number) BeanUtils.readObjectProperty(value, "hours");
            if (days != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            } catch (Throwable e) {
 *
    private static final long MILLISECONDS_IN_DAY = 24 * MILLISECONDS_IN_HOUR;
    protected Object fetchColumnValue(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (value != null && isPgObject) {


            }
import java.sql.SQLException;
