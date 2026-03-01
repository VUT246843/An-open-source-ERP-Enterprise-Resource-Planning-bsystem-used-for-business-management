    @Override
                } else {
            case Types.TIMESTAMP:
                return DEFAULT_TIME_FORMAT;
        @NotNull DBCSession session,
                && !formatSettings.isUseNativeDateTimeFormat()) {
    public Format getNativeValueFormat(DBSTypedObject type) {
            if (value == null) {

        return super.fetchValueObject(session, resultSet, type, index);
    @Override
    }

 */
        if (type.getMaxLength() == OracleConstants.DATE_TYPE_LENGTH) {
    @Nullable
import java.text.Format;
        // Column types and lengths are the same. Data type name is the same. Oh, Oracle...
            } else {
                        dbStat.setString(index + 1, (String) value);
    @Override
            JDBCPreparedStatement dbStat = (JDBCPreparedStatement) statement;
        }
                }
                return DEFAULT_DATETIME_FORMAT;
        return super.getValueFromObject(session, type, object, copy, validateValue);
 *
                    log.debug("Exception caught when fetching date value", e);
                    } catch (IllegalArgumentException e) {
                    } catch (IllegalArgumentException e) {
                return DEFAULT_DATE_FORMAT;
        }
    }
            return DBDDataFormatter.TYPE_NAME_DATE;
/*
}

                throw new DBCException("Error extracting Oracle TIMESTAMP value", e);
        // Have to revert DATE format. I can't realize what is difference between TIMESTAMP and DATE without time part.
 * DBeaver - Universal Database Manager
        }
        if (resultSet instanceof JDBCResultSet) {
        }
import org.jkiss.dbeaver.model.DBPDataSource;
                return OracleTimestampConverter.toTimestamp(object, ((JDBCSession) session).getOriginal());
            case Types.TIMESTAMP_WITH_TIMEZONE:
        @NotNull DBSTypedObject type,
        this.dataSource = dataSource;
        if (showDateAsDate && OracleConstants.TYPE_NAME_DATE.equals(column.getTypeName())) {
            session.getDataSource().getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_SHOW_DATE_AS_DATE),
    private static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("'DATE '''yyyy-MM-dd''");
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
                }

            case Types.TIME:

            }
    protected String getFormatterId(DBSTypedObject column) {
                    dbStat.setString(index + 1, (String) value);
        boolean showDateAsDate = CommonUtils.getBoolean(
    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.DBCSession;
                // It can be date/timestamp column. Check it and try to set date/timestamp value. Oracle driver doesn't want to receive a string as an argument #11685
                try {
                super.bindValueObject(session, statement, type, index, value);
                dataSource.getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_SHOW_DATE_AS_DATE),
import org.jkiss.code.Nullable;
        int index
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                dbStat.setNull(index + 1, type.getTypeID());
                    try {
 * limitations under the License.
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
        return super.getValueDisplayString(column, value, format);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    }
    private static final SimpleDateFormat DEFAULT_DATETIME_FORMAT = new ExtendedDateFormat("'TIMESTAMP '''yyyy-MM-dd HH:mm:ss.ffffff''");
        } catch (SQLException e) {

            if (!((String) value).startsWith("TIMESTAMP")) {
            throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
                return DEFAULT_DATETIME_FORMAT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.oracle.data;
                false);
import org.jkiss.dbeaver.model.exec.DBCResultSet;
                        dbStat.setDate(index + 1, java.sql.Date.valueOf(value.toString()));
    OracleTimestampValueHandler(DBDFormatSettings formatSettings, @NotNull DBPDataSource dataSource) {
                        dbStat.setTimestamp(index + 1, java.sql.Timestamp.valueOf(value.toString()));
import org.jkiss.dbeaver.model.messages.ModelMessages;
            } catch (Exception e) {
    @Override
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
                int typeID = type.getTypeID();

    @NotNull
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCStatement;
import org.jkiss.utils.time.ExtendedDateFormat;
            }
    private DBPDataSource dataSource;
            if (showDateAsDate && OracleConstants.TYPE_NAME_DATE.equals(type.getTypeName())
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        @NotNull DBCResultSet resultSet,
            } else {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
*/
        }
        return super.getFormatterId(column);
                } catch (SQLException e) {
            case Types.DATE:
import java.sql.SQLException;
        boolean showDateAsDate = CommonUtils.getBoolean(
            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_LOCAL_TIMEZONE:
    public Object fetchValueObject(
                    return ((JDBCResultSet) resultSet).getDate(index + 1);
            try {
import java.sql.Types;
            }
            false);
                    }
 * Object type support
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }

    @NotNull
public class OracleTimestampValueHandler extends JDBCDateTimeValueHandler {

        }
 *
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
        }
                } else if (typeID == Types.TIMESTAMP) {
/*
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
    public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value) throws DBCException {
/**
                        dbStat.setString(index + 1, (String) value);
                    try {
 */
                return DEFAULT_TIME_FORMAT;
            if (value instanceof String) {

import java.text.SimpleDateFormat;
                return "TIMESTAMP'" + value + "'";

        if (object != null && object.getClass().getName().startsWith(OracleConstants.TIMESTAMP_CLASS_NAME)) {
            case Types.TIME_WITH_TIMEZONE:
import org.jkiss.dbeaver.model.exec.DBCException;
 * You may obtain a copy of the License at
        switch (type.getTypeID()) {

    ) throws DBCException {
        super(formatSettings);
 *
            }
                return (String) value;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

            return DEFAULT_DATE_FORMAT;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return super.getNativeValueFormat(type);
        try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        if (format == DBDDisplayFormat.NATIVE && value instanceof String) {
            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE:
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (typeID == Types.DATE) {
                    }
    private static final SimpleDateFormat DEFAULT_TIME_FORMAT = new SimpleDateFormat("'TIME '''HH:mm:ss.SSS''");
