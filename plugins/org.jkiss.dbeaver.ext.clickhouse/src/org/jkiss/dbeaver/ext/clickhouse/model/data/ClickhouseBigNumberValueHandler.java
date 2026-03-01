 * DBeaver - Universal Database Manager
        JDBCResultSet resultSet,
        DBCSession session,
    @Override
import java.sql.SQLException;
            return super.fetchColumnValue(session, resultSet, type, index);
    }
        DBSTypedObject type,
 * Unless required by applicable law or agreed to in writing, software
        } catch (SQLException e) {
/*
        int index) throws DBCException, SQLException
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected Object fetchColumnValue(
    }

 *
    ClickhouseBigNumberValueHandler(DBSTypedObject type, DBDFormatSettings formatSettings) {
}
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 *
 * limitations under the License.
        super(type, formatSettings);

 * Copyright (C) 2010-2024 DBeaver Corp and others
public class ClickhouseBigNumberValueHandler extends JDBCNumberValueHandler {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

            // First we will try to get this value as Big Decimal
 */
            return resultSet.getBigDecimal(index);
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
    {
 * You may obtain a copy of the License at
        try {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.ext.clickhouse.model.data;
    @Nullable
