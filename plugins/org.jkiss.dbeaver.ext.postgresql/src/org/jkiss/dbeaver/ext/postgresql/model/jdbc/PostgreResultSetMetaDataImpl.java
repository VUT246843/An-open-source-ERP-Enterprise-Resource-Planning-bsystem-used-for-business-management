        } catch (Exception e) {
 *
            throw new SQLException("Error getting table name", e);
 *
            schemaName = (String)original.getClass().getMethod("getBaseSchemaName", Integer.TYPE).invoke(original, column);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getCatalogName(int column) throws SQLException {
        try {
    }
    }
 * Unless required by applicable law or agreed to in writing, software

        return JDBCUtils.normalizeIdentifier(tableName);
import java.lang.reflect.InvocationTargetException;
 * See the License for the specific language governing permissions and
        super(resultSet);
            throw new SQLException("Error getting schema name", e.getTargetException());
        } catch (Exception e) {
    @Override
    /**
    }

}
 */
    public String getTableName(int column) throws SQLException {
    public String getSchemaName(int column) throws SQLException {
        String schemaName;
        }
    }
/*
 * DBeaver - Universal Database Manager

 * limitations under the License.

     * Always return current instance as catalog name
            tableName = (String)original.getClass().getMethod("getBaseTableName", Integer.TYPE).invoke(original, column);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
{
public class PostgreResultSetMetaDataImpl extends JDBCResultSetMetaDataImpl
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public PostgreResultSetMetaDataImpl(JDBCResultSet resultSet) throws SQLException {
 */
 * You may obtain a copy of the License at
        }
        return JDBCUtils.normalizeIdentifier(schemaName);
        return resultSet.getSession().getExecutionContext().getOwnerInstance().getName();
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetMetaDataImpl;
        } catch (InvocationTargetException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * PostgreResultSetMetaDataImpl
            throw new SQLException("Error getting table name", e.getTargetException());
 * you may not use this file except in compliance with the License.
import java.sql.SQLException;
/**
    @Override

package org.jkiss.dbeaver.ext.postgresql.model.jdbc;
        } catch (InvocationTargetException e) {
            throw new SQLException("Error getting schema name", e);
    @Override
        String tableName;
