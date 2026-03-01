
public class AltibaseBitSetValueHandler extends JDBCObjectValueHandler {
 * You may obtain a copy of the License at
 *
 *
            DBSTypedObject type,
            StringBuilder sb = new StringBuilder(size);
package org.jkiss.dbeaver.ext.altibase.data;
    public static final AltibaseBitSetValueHandler INSTANCE = new AltibaseBitSetValueHandler();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                statement.setObject(paramIndex, value.toString(), Types.BIT);
        if (value == null) {
 *
import org.jkiss.dbeaver.model.exec.DBCException;
            for (int i = 0; i < size; i++) {

        String value = null;
 * DBeaver - Universal Database Manager
            DBCSession session,
            try {
        // binary representation of BitSet
 * See the License for the specific language governing permissions and
    protected Object fetchColumnValue(
        return getValueFromObject(session, type, value, false, false);
 * you may not use this file except in compliance with the License.
        }
            int size = bitSet.size();
                sb.append(bitSet.get(i) ? '1' : '0');

        Object obj = resultSet.getObject(index);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int paramIndex,
        if (obj != null && !resultSet.wasNull()) {

    protected void bindParameter(

    @Override
            }
            value = sb.toString();
                statement.setObject(paramIndex, value);
 * limitations under the License.
    @Override
            } catch (SQLException e) {
import java.sql.SQLException;
        DBSTypedObject paramType,
            JDBCResultSet resultSet,
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCObjectValueHandler;

            BitSet bitSet = (BitSet) obj;
 * Unless required by applicable law or agreed to in writing, software

    
        }
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            statement.setNull(paramIndex, paramType.getTypeID());
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.BitSet;
    }
            int index) throws DBCException, SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        JDBCPreparedStatement statement,
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.sql.Types;
            }
        JDBCSession session,
        Object value) throws DBCException, SQLException {
        } else {
}
 */

