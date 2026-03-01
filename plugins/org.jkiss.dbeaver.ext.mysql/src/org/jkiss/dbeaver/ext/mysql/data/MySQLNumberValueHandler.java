        super.bindParameter(session, statement, paramType, paramIndex, value);
    }

 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (value instanceof String) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    }
 *
                long longValue;

     * NumberFormat is not thread safe thus this method is synchronized.
    /**
            String strValue = (String) value;
        return true;

 * You may obtain a copy of the License at
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType,
public class MySQLNumberValueHandler extends JDBCNumberValueHandler {
            }
                    longValue = Long.parseLong(strValue, 2);
    @Override
/**
            }

import java.sql.Types;
                    statement.setByte(paramIndex, (byte)longValue);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            if (paramType.getTypeID() == Types.BIT) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                return;
/*
                    statement.setLong(paramIndex, longValue);

        super(type, formatSettings);
                if (CommonUtils.toInt(paramType.getPrecision()) <= 1) {
                return "b'" + value + "'";
 * MySQL number value handler

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            if (format == DBDDisplayFormat.UI || format == DBDDisplayFormat.NATIVE) {
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        return super.getValueDisplayString(column, value, format);
    }
    @Override
 */
                                 int paramIndex, Object value) throws SQLException, DBCException {
                // Binary string
}
 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import java.sql.SQLException;
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.mysql.data;
                }

 */
    {
                } else {
import org.jkiss.code.NotNull;
                } catch (NumberFormatException e) {
                return (String) value;

    public MySQLNumberValueHandler(DBSTypedObject type, DBDFormatSettings formatSettings) {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
 * Unless required by applicable law or agreed to in writing, software
                try {
    public synchronized String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format)
    }
                }
                    throw new SQLException("Can't convert value '" + value + "' into bit string", e);
     */
            } else {
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                // Bit string

import org.jkiss.code.Nullable;
    @NotNull
    protected boolean isReadDecimalsAsDouble() {
        if (value instanceof String) {
        }
