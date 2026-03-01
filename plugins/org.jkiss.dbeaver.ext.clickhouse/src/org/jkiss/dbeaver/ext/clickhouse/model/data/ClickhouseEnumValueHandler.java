 * You may obtain a copy of the License at
import java.util.Map;
            }
        }

 */
        if (type instanceof DBDAttributeBinding) {
package org.jkiss.dbeaver.ext.clickhouse.model.data;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
}
 *
            if (ordinal != null) {
    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
        if (type instanceof ClickhouseTableColumn) {
            final Integer ordinal = entries.get((String) value);
    public static final ClickhouseEnumValueHandler INSTANCE = new ClickhouseEnumValueHandler();
        return resultSet.getString(index);

 *     http://www.apache.org/licenses/LICENSE-2.0
                statement.setInt(paramIndex, ordinal);
    }
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseTableColumn;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                return;
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
        }
            final Map<String, Integer> entries = ((ClickhouseTableColumn) type).getEnumEntries();
/*

import java.sql.SQLException;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
public class ClickhouseEnumValueHandler extends JDBCStringValueHandler {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        DBSTypedObject type = paramType;

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        super.bindParameter(session, statement, paramType, paramIndex, value);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

            type = ((DBDAttributeBinding) type).getAttribute();
 *
