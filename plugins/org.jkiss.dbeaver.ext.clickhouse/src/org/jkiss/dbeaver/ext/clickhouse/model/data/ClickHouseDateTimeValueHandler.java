import java.text.SimpleDateFormat;
        @NotNull DBSTypedObject type,
 *
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override

    protected Format getNativeValueFormat(DBSTypedObject type) {
        @NotNull DBCSession session,
import org.jkiss.code.Nullable;
            // ClickHouse DateTime type has no NANOSECONDS part
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBCStatement statement,
    public ClickHouseDateTimeValueHandler(DBDFormatSettings formatSettings) {
 *
import java.sql.Timestamp;
public class ClickHouseDateTimeValueHandler extends JDBCDateTimeValueHandler {
        @Nullable Object value
    public void bindValueObject(
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;

import org.jkiss.dbeaver.model.exec.DBCStatement;
    @Override
        } else {
            JDBCPreparedStatement dbStat = (JDBCPreparedStatement) statement;
    }
        int index,
 * limitations under the License.
        }
    }
        super(formatSettings);

            } catch (SQLException e) {
package org.jkiss.dbeaver.ext.clickhouse.model.data;
import org.jkiss.code.NotNull;
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
/*
        return DEFAULT_DATETIME_FORMAT;
import java.sql.SQLException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
                dbStat.setObject(index + 1, timestamp);
        if (value instanceof Timestamp timestamp) {
    public static final String CLICKHOUSE_TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";
                throw new DBCException(ModelMessages.model_jdbc_exception_could_not_bind_statement_parameter, e);            }
}



    public static final SimpleDateFormat DEFAULT_DATETIME_FORMAT = new SimpleDateFormat("''" + CLICKHOUSE_TIMESTAMP_FORMAT + "''");
 * See the License for the specific language governing permissions and

    ) throws DBCException {
 *
import org.jkiss.dbeaver.model.exec.DBCException;
    @Nullable
            super.bindValueObject(session, statement, type, index, value);
import java.text.Format;
            try {
