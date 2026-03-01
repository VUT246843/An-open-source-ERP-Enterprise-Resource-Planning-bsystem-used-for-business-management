 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);
        }
        if (time == POSITIVE_INFINITY || time == POSITIVE_SMALLER_INFINITY) {
/*
import java.sql.SQLException;
        return super.getFormatterId(column);
            case PostgreConstants.TYPE_TIMESTAMPTZ:
        return super.fetchValueObject(session, resultSet, type, index);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    private static final long POSITIVE_INFINITY = 9223372036825200000L;
                }
        @NotNull DBSTypedObject type,
    ) throws DBCException {
        @NotNull DBCResultSet resultSet,
        }
    }
            }
    private static final long NEGATIVE_INFINITY = -9223372036832400000L;
        super(formatSettings);
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
    @Override
 * PostgreDateTimeValueHandler.
        }
    }

            try {
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCStatement;
        int index
 * you may not use this file except in compliance with the License.
        switch (column.getTypeName()) {
                    ((PostgreDataSource)session.getDataSource()).getServerType().getParameterBindType(type, value));
    }
            return NEGATIVE_INFINITY_STRING_REPRESENTATION;
import java.util.Date;
        if (time == NEGATIVE_INFINITY || time == NEGATIVE_SMALLER_INFINITY) {
                ((JDBCPreparedStatement)statement).setObject(index + 1, value.toString(),
        return super.getValueFromObject(session, type, object, copy, validateValue);
import org.jkiss.dbeaver.model.messages.ModelMessages;

                    return jdbc.getObject(index + 1, OffsetTime.class);
    @NotNull
        final long time = date.getTime();

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 */
                } catch (SQLException e) {
    public void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, Object value) throws DBCException {
 * See the License for the specific language governing permissions and
        }
package org.jkiss.dbeaver.ext.postgresql.model.data;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (resultSet instanceof JDBCResultSet jdbc) {

    @Override
                return DBDDataFormatter.TYPE_NAME_TIME_TZ;
    public PostgreDateTimeValueHandler(DBDFormatSettings formatSettings) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
                    log.debug("Exception caught when fetching time value", e);
    @Override
 *
 * You may obtain a copy of the License at

        super.bindValueObject(session, statement, type, index, value);

    }
    protected String getFormatterId(DBSTypedObject column) {

 *
import java.time.OffsetTime;
        @NotNull DBCSession session,
            if (type.getTypeID() == Types.TIME && !formatSettings.isUseNativeDateTimeFormat()) {
            case PostgreConstants.TYPE_TIMETZ:
            catch (SQLException e) {
                try {
        if (value instanceof String) {
    public Object fetchValueObject(
import org.jkiss.dbeaver.model.exec.DBCException;
 * DBeaver - Universal Database Manager
 */
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    private static final String POSITIVE_INFINITY_STRING_REPRESENTATION = "infinity";
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
public class PostgreDateTimeValueHandler extends JDBCDateTimeValueHandler {
                return DBDDataFormatter.TYPE_NAME_TIMESTAMP_TZ;
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    // https://jdbc.postgresql.org/documentation/publicapi/constant-values.html
            return super.getValueFromObject(session, type, object, copy, validateValue);
/**
    private static final long POSITIVE_SMALLER_INFINITY = 185543533774800000L;

        }
    protected boolean isReadDateAsObject() {

 * limitations under the License.
 *
            return POSITIVE_INFINITY_STRING_REPRESENTATION;
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.sql.Types;
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
    @Override
            return;
        return true;
import org.jkiss.code.NotNull;
    private static final long NEGATIVE_SMALLER_INFINITY = -185543533774800000L;
            }
            }
        if (!(object instanceof Date date)) {
    private static final String NEGATIVE_INFINITY_STRING_REPRESENTATION = "-infinity";
}
