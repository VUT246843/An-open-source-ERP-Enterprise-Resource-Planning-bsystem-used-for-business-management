


}
 *
 * See the License for the specific language governing permissions and
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
public class ClickhouseResultSetMetaDataImpl extends JDBCResultSetMetaDataImpl {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return original.getColumnName(column);
    @Override
package org.jkiss.dbeaver.ext.clickhouse.model.jdbc;
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetMetaDataImpl;
    public String getTableName(int column) throws SQLException {
 * JDBCUtils#normalizeIdentifier method is usually used for columns/tables name reading.
/*
    }

/**
 * You may obtain a copy of the License at
 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return original.getTableName(column);
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *
        super(resultSet);
    @Override
import java.sql.SQLException;
 * you may not use this file except in compliance with the License.
 * normalizeIdentifier trim names, but we can create tables/columns with spaces around their names
 * limitations under the License.
    public String getColumnName(int column) throws SQLException {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Let's just read names from the driver directly
 * Unless required by applicable law or agreed to in writing, software

    ClickhouseResultSetMetaDataImpl(JDBCResultSet resultSet) throws SQLException {
