 *

                statement.setObject(paramIndex, value);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        int index) throws SQLException {
}
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        JDBCResultSet resultSet,
            int paramIndex, 
/*
 * So, this data type is handled like string data type. 

public class AltibaseNibbleValueHandler extends JDBCStringValueHandler {
            try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public static final AltibaseNibbleValueHandler INSTANCE = new AltibaseNibbleValueHandler();
 * See the License for the specific language governing permissions and
/*
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0
        
 * Though NIBBLE data type is one of binary data  type, it's unable to handle binary values in hex editor.
        String value = resultSet.getString(index);
    @Override
            value = value.toUpperCase();
            Object value) throws SQLException {
        
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBSTypedObject type,
        
            DBSTypedObject paramType,
        }
    }
import java.sql.SQLException;
    }
 */
 * limitations under the License.
            JDBCPreparedStatement statement, 
        } else {
        DBCSession session,
package org.jkiss.dbeaver.ext.altibase.data;
    @Override
    public void bindParameter(
                statement.setObject(paramIndex, value.toString(), AltibaseConstants.TYPE_NIBBLE);
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
 * you may not use this file except in compliance with the License.
        }

        return value;
 *
    protected Object fetchColumnValue(
        if (value == null) {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
        if (CommonUtils.isNotEmpty(value)) {
            }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            } catch (SQLException e) {
        
            statement.setNull(paramIndex, paramType.getTypeID());
            JDBCSession session, 
