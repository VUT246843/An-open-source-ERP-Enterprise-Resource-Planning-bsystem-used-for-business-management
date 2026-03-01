    }
    public int getScale(int column)
            tableMetaData = new JDBCTableMetaData(this, catalogName, schemaName, tableName);
    public boolean isDefinitelyWritable(int column)
    public boolean isWrapperFor(Class<?> iface)
        throws SQLException


        throws SQLException
    }
        throws SQLException
    @Override
    public String getColumnClassName(int column)

    {
        return original.isSigned(column);
package org.jkiss.dbeaver.model.impl.jdbc.exec;
    @Override
        throws SQLException
 *
        throws SQLException
    public String getTableName(int column)
    public String getSchemaName(int column)
    @Override
    {
        throws SQLException
    @Override
    }
        throws SQLException
        throws SQLException
import java.sql.SQLException;
    {
    {
        return original.getColumnCount();

    public boolean isReadOnly(int column)
        throws SQLException
        return original.isAutoIncrement(column);
            tables.put(fullQualifiedName, tableMetaData);
    public JDBCResultSetMetaDataImpl(JDBCResultSet resultSet)
        return JDBCUtils.normalizeIdentifier(original.getTableName(column));
    public String getColumnName(int column)
    @Override
    public boolean isCurrency(int column)
        return original.isReadOnly(column);
        }
    public int getColumnDisplaySize(int column)
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * Licensed under the Apache License, Version 2.0 (the "License");
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSetMetaData;
    }
    @Override
        throws SQLException
        return original;

        return original.getPrecision(column);
    }
        }
    {
    protected List<DBCAttributeMetaData> columns = new ArrayList<>();
        for (int i = 0; i < count; i++) {
    @Override
    }
        return original.isDefinitelyWritable(column);
import org.jkiss.code.Nullable;
    public boolean isSigned(int column)
    {

        JDBCTableMetaData tableMetaData = tables.get(fullQualifiedName);
    {
    @Override
        return columns;
import java.util.HashMap;

    @Override
    @Override
    {
    {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getColumnLabel(int column)
        return JDBCUtils.normalizeIdentifier(original.getSchemaName(column));
 *
 * JDBCResultSetMetaDataImpl
        throws SQLException
 * DBeaver - Universal Database Manager
        return original.unwrap(iface);
 * Unless required by applicable law or agreed to in writing, software
        return original.isCaseSensitive(column);
    public boolean isWritable(int column)

    {
    {
    }
    {
    {
            // some constant instead of table name
}
    @Override
    @Override
        throws SQLException
    }
        return JDBCUtils.normalizeIdentifier(original.getColumnClassName(column));
        return JDBCUtils.normalizeIdentifier(original.getColumnLabel(column));
        throws SQLException
    }

    }
    {
    @Override
 * See the License for the specific language governing permissions and
        if (CommonUtils.isEmpty(tableName)) {


        throws SQLException


    public int getPrecision(int column)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public boolean isCaseSensitive(int column)
        throws SQLException
    public int getColumnCount()
    @Override
    public int isNullable(int column)
    @Override
        return resultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public boolean isAutoIncrement(int column)
import java.util.ArrayList;
    protected ResultSetMetaData original;
/**
{
public class JDBCResultSetMetaDataImpl implements JDBCResultSetMetaData
        return original.isWritable(column);
    public String getColumnTypeName(int column)
        throws SQLException
    }

    }
        throws SQLException
    {
        return original.isCurrency(column);
        return tableMetaData;
        return original.isNullable(column);
    @Override
        this.resultSet = resultSet;
    protected JDBCColumnMetaData createColumnMetaDataImpl(int index) throws SQLException

import java.sql.ResultSetMetaData;
    public JDBCResultSet getResultSet()
 */
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
    @Override
        return JDBCUtils.normalizeIdentifier(original.getCatalogName(column));
            return null;
/*

        if (tableMetaData == null) {
    public List<? extends DBCAttributeMetaData> getAttributes()
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 */
    }
    {
    {
    {
    @Override

 * You may obtain a copy of the License at



import org.jkiss.dbeaver.model.DBUtils;
    @Override
    public String getCatalogName(int column)
    {
        throws SQLException
    public int getColumnType(int column)




    public boolean isSearchable(int column)
    {
        String fullQualifiedName = DBUtils.getSimpleQualifiedName(catalogName, schemaName, tableName);

            columns.add(createColumnMetaDataImpl(i));
        return original.getScale(column);
        return JDBCUtils.normalizeIdentifier(original.getColumnTypeName(column));
        return original.getColumnDisplaySize(column);
    }
    {
    public JDBCTableMetaData getTableMetaData(String catalogName, String schemaName, String tableName)
    }
        return JDBCUtils.normalizeIdentifier(original.getColumnName(column));
    }
    }
    @Override
    {
    {
        throws SQLException
        return original.getColumnType(column);
 * you may not use this file except in compliance with the License.
    {
    }

    }
import java.util.List;
    @Override
        int count = original.getColumnCount();
        throws SQLException
import java.util.Map;
    }
    {
        throws SQLException
        return new JDBCColumnMetaData(this, index);
    @Override
    @Nullable
    }
        this.original = resultSet.getOriginal().getMetaData();
        throws SQLException
    protected Map<String, JDBCTableMetaData> tables = new HashMap<>();
    {
    public ResultSetMetaData getOriginal()
    }
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
    }
    @Override
    public <T> T unwrap(Class<T> iface)
        return original.isSearchable(column);
    }
        return original.isWrapperFor(iface);
 *
    }



    }
    {

    @Override
    }

        throws SQLException
        throws SQLException
    protected JDBCResultSet resultSet;
