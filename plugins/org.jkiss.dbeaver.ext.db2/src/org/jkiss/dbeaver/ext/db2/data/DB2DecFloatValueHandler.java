            }
 * Licensed under the Apache License, Version 2.0 (the "License");

        } catch (SQLException e) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            super.bindParameter(session, statement, paramType, paramIndex, value);
        } else if (value instanceof Double) {
package org.jkiss.dbeaver.ext.db2.data;
    @Override
public class DB2DecFloatValueHandler extends JDBCNumberValueHandler {
            statement.setDouble(paramIndex, (Double) value);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        } else {
 */
    }
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 *
    public DB2DecFloatValueHandler(DBSTypedObject type, DBDFormatSettings formatSettings) {
import org.jkiss.dbeaver.model.exec.DBCException;
        try {
    }
    }
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import java.sql.SQLException;
 */
            statement.setBigDecimal(paramIndex, (BigDecimal) value);
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {

        }
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.math.BigDecimal;
        if (value instanceof BigDecimal) {
    final static int DECFLOAT_SPECIALVALUE_ENCOUNTERED = -4231;
        }
    @Override

            return resultSet.getBigDecimal(index);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
            } else {

    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException, DBCException {
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
}
                throw e;

 * you may not use this file except in compliance with the License.
/**
/*

            if (e.getErrorCode() == DECFLOAT_SPECIALVALUE_ENCOUNTERED) {
    @Nullable

 * DECFLOAT type support
                return resultSet.getDouble(index);
        super(type, formatSettings);
