    private Object value;
        this.type = type;
 * @author Serge Rider
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public Object getValue()
 * You may obtain a copy of the License at
        return value;

}
    public int getType()

package org.jkiss.dbeaver.model.impl.jdbc;
    private int type;
public class JDBCUnknownType {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public JDBCUnknownType(int type, Object value)
    public String toString()

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    {
        return type;
 *
    }
 * you may not use this file except in compliance with the License.


        this.value = value;

/*
 */
 * DBeaver - Universal Database Manager
    }
 * limitations under the License.
    }
    {


    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * JDBCUnknownType
 *
    {
        return "Unsupported JDBC type: " + type;
    {
