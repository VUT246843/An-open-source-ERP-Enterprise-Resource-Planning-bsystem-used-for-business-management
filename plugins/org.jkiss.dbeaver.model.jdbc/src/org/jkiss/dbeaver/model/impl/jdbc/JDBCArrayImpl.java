    private final String typeName;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    public Object getArray(Map<String, Class<?>> map) throws SQLException {

    }
    }

 *
        this.items = items;
        this.typeName = typeName;
import java.sql.Array;
 * JDBCArrayImpl
        return null;
    public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
    }
    public Object getArray() throws SQLException {
    }


/**
        return items;
 *     http://www.apache.org/licenses/LICENSE-2.0

    private final Object[] items;

    }
 * you may not use this file except in compliance with the License.
 *

    @Override
    public ResultSet getResultSet() throws SQLException {
    }
 *
 */
 */
import java.util.Map;
 * Unless required by applicable law or agreed to in writing, software
    @Override
    @Override
    private final int baseType;
    @Override
    public ResultSet getResultSet(long index, int count) throws SQLException {
import java.util.Arrays;
    public void free() throws SQLException {
import java.sql.SQLException;
    public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
        return Arrays.copyOfRange(items, (int) index, count);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        return null;
    @Override
        return items;
    public String getBaseTypeName() throws SQLException {
import java.sql.ResultSet;


 * limitations under the License.

        return null;
    }
        return null;
    public JDBCArrayImpl(String typeName, int baseType, Object[] items) {
    public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
    @Override
        this.baseType = baseType;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.impl.jdbc;
    @Override


    }
    }
public class JDBCArrayImpl implements Array {

    @Override
        return typeName;

        return Arrays.copyOfRange(items, (int) index, count);
 * DBeaver - Universal Database Manager

/*

        return baseType;

    }
    @Override
    public Object getArray(long index, int count) throws SQLException {
    public int getBaseType() throws SQLException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
