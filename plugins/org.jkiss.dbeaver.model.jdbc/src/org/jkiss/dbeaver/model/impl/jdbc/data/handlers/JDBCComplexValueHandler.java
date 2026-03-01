    @Override
 *
    protected Object fetchColumnValue(
    }
/**
import java.sql.SQLException;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

        JDBCSession session,
        throw new DBCException("Unsupported value type: " + value);
}    {
 * DBeaver - Universal Database Manager
 * @author Serge Rider
 * Handle complex types.

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        throws DBCException, SQLException
    public static final String PROP_CATEGORY_COMPLEX = "Complex";
        throws DBCException, SQLException
        Object value = resultSet.getObject(index);

        JDBCResultSet resultSet,
 */
        int index)
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBSTypedObject paramType,
        DBCSession session,
        int paramIndex,
        DBSTypedObject type,
 * Complex value handler.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
public abstract class JDBCComplexValueHandler extends JDBCAbstractValueHandler {
 * Unless required by applicable law or agreed to in writing, software
        return getValueFromObject(session, type, value, false, false);
 * limitations under the License.
/*

    private static final Log log = Log.getLog(JDBCComplexValueHandler.class);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

        Object value)

package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
 *
import org.jkiss.dbeaver.model.exec.DBCException;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 */
    protected void bindParameter(
 * See the License for the specific language governing permissions and
    }

        JDBCPreparedStatement statement,
