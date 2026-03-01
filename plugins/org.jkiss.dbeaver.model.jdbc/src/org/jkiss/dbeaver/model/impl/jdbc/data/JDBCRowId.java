

    public String toString()
        this.value = value;
    }

    {
    }
 * limitations under the License.
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.DBCException;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        return false;
        return value;
package org.jkiss.dbeaver.model.impl.jdbc.data;
    @Override
        return value;

    public JDBCRowId(RowId value)
 * See the License for the specific language governing permissions and
}
    public boolean isModified() {
 */
    @Override
/**


import java.sql.RowId;
public class JDBCRowId implements DBDValue {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.DBDValue;
            return "null";
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * Row ID
    private static final Log log = Log.getLog(JDBCRowId.class);
        value = null;
    }

        if (value == null) {

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean isNull()

    public Object getRawValue() {
 *
        return value == null;
 * DBeaver - Universal Database Manager
    public RowId getValue() throws DBCException

 */
        return new String(value.getBytes());
    private RowId value;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    {
    {
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

/*
    }
 *
    public void release()
    {
    }
    @Override
    @Override

 * you may not use this file except in compliance with the License.
