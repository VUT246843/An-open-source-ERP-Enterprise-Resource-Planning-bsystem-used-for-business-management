 */
 * DBeaver - Universal Database Manager
        super(resultSet);
 *
/*
{
import java.sql.SQLException;
    }
    public String getColumnName(int column) throws SQLException {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.ext.hive.model.jdbc;
            if (divPos > 0 && divPos < columnName.length() - 1) {
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        if (!CommonUtils.isEmpty(columnName)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }

}
 * See the License for the specific language governing permissions and

        }
    public String getColumnLabel(int column) throws SQLException {
/**
 *
 *
public class HiveResultSetMetaDataImpl extends JDBCResultSetMetaDataImpl
 * HiveResultSetMetaDataImpl.
        return removeTableNamePrefix(super.getColumnName(column));
 * distributed under the License is distributed on an "AS IS" BASIS,

        return removeTableNamePrefix(super.getColumnLabel(column));
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetMetaDataImpl;
    public HiveResultSetMetaDataImpl(JDBCResultSet resultSet) throws SQLException {
    @Override
            }
 * limitations under the License.
                return columnName.substring(divPos + 1);
 */
        return columnName;
    @Override

            int divPos = columnName.indexOf('.');
 * Fixes Hive driver results metadata. All column names/labels have table name prefix (weird)

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private String removeTableNamePrefix(String columnName) throws SQLException {

 * Licensed under the Apache License, Version 2.0 (the "License");
                // Remove table name prefix

