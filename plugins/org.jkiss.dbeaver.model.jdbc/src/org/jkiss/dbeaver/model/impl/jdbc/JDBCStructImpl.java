    public String getSQLTypeName() throws SQLException {

 */
        return stringValue;
    public JDBCStructImpl(String typeName, Object[] attributes, String stringValue) {
 */
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
 * See the License for the specific language governing permissions and
}
    public Object[] getAttributes() throws SQLException {
import java.sql.SQLException;

 * you may not use this file except in compliance with the License.
import java.sql.SQLFeatureNotSupportedException;
    }
import java.util.Map;
        throw new SQLFeatureNotSupportedException();
 * Licensed under the Apache License, Version 2.0 (the "License");

    private final String typeName;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public Object[] getAttributes(Map<String, Class<?>> map) throws SQLException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

    }
    @Override
    public String toString() {
 * JDBCStructImpl
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.attributes = attributes;
        return attributes;
public class JDBCStructImpl implements Struct {

    @Override
    }
    private final String stringValue;
/*
        this.typeName = typeName;
package org.jkiss.dbeaver.model.impl.jdbc;
 * You may obtain a copy of the License at
import java.sql.Struct;
        this.stringValue = stringValue;
 * DBeaver - Universal Database Manager
 *
    @Override
 * Unless required by applicable law or agreed to in writing, software
/**
    private final Object[] attributes;
 * limitations under the License.


        return typeName;
