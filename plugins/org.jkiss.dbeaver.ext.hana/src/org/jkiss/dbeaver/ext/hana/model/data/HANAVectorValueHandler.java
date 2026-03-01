 * DBeaver - Universal Database Manager
import java.sql.Types;

import org.jkiss.dbeaver.model.data.DBDCollection;
        if (value == null) {
    protected abstract void bindVectorParameter(@NotNull JDBCPreparedStatement statement, int paramIndex,
}

            throw new DBCException("Array parameter type '" + value.getClass().getName() + "' not supported");
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }
            DBDCollection collection = (DBDCollection) value;
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCArrayValueHandler;


            }
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
/*
    protected boolean useGetArray(DBCSession session, DBSTypedObject type) {
    public DBCLogicalOperator[] getSupportedOperators(DBSTypedObject attribute) {
 *
        } else {
    private static DBCLogicalOperator[] SUPPORTED_OPERATORS = {
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
            } else {
            statement.setNull(paramIndex, Types.ARRAY);
    }
                statement.setNull(paramIndex, Types.ARRAY);
                throw new DBCException("Array parameter type '" + value.getClass().getName() + "' not supported");
import org.jkiss.code.NotNull;
import java.sql.SQLException;
            @NotNull JDBCCollection collection)
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType,
        return true;
                bindVectorParameter(statement, paramIndex, (JDBCCollection) collection);
            int paramIndex, Object value) throws DBCException, SQLException {
        DBCLogicalOperator.IS_NULL
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } else if (value instanceof DBDCollection) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCException;

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
            if (collection.isNull()) {
            } else if (collection instanceof JDBCCollection) {
 * limitations under the License.
public abstract class HANAVectorValueHandler extends JDBCArrayValueHandler {
    };
        DBCLogicalOperator.IS_NOT_NULL,

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @Override
    @Override

        return SUPPORTED_OPERATORS;
            throws DBCException, SQLException;
package org.jkiss.dbeaver.ext.hana.model.data;
