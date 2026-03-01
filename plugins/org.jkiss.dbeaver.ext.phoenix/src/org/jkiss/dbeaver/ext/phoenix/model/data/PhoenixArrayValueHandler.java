        JDBCPreparedStatement statement,

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCArrayValueHandler;
import java.sql.Array;
            if (collection.isNull()) {
    
                statement.setArray(paramIndex, (Array)collection.getRawValue());
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected void bindParameter(
        throws DBCException, SQLException
        if (object != null && object.getClass().getSimpleName().contains(PHOENIX_ARRAY_TYPE)) {
        return super.getValueFromObject(session, type, object, copy, validateValue);
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
/**
        } else {
    {
 */
            return JDBCCollection.makeCollectionFromArray((JDBCSession) session, type, (Array) object);
    public static final String PHOENIX_ARRAY_TYPE = "PhoenixArray";
        Object value)
        if (value == null) {
 * DBeaver - Universal Database Manager
 *
                statement.setNull(paramIndex, Types.ARRAY);

    
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        }

public class PhoenixArrayValueHandler extends JDBCArrayValueHandler {
            statement.setNull(paramIndex, Types.ARRAY);
import java.sql.SQLException;
    }
        DBSTypedObject paramType,
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
            DBDCollection collection = (DBDCollection) value;
 *
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCException;
 */
        int paramIndex,
import org.jkiss.code.NotNull;
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    
    public static final PhoenixArrayValueHandler INSTANCE = new PhoenixArrayValueHandler();
                statement.setArray(paramIndex, ((JDBCCollection) collection).getArrayValue());
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        } else if (value instanceof DBDCollection) {
            }
    {
            } else if (collection instanceof JDBCCollection) {
 * You may obtain a copy of the License at
    }
 *
import java.sql.Types;
        JDBCSession session,

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDCollection;
package org.jkiss.dbeaver.ext.phoenix.model.data;
 * PhoenixArrayValueHandler
            } else {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * limitations under the License.
    @Override
            throw new DBCException("Array parameter type '" + value.getClass().getName() + "' not supported");
