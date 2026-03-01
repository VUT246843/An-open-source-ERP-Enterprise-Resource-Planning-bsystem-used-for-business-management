 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.SQLException;
package org.jkiss.dbeaver.ext.postgresql.model.data;
 *
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
                statement.setNull(paramIndex, paramType.getTypeID());
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
public class PostgreStringValueHandler extends JDBCStringValueHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import java.sql.Types;
 * DBeaver - Universal Database Manager
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public static final PostgreStringValueHandler INSTANCE = new PostgreStringValueHandler();
        if (paramType.getTypeID() == Types.OTHER || ArrayUtils.contains(PostgreDataType.getOidTypes(), paramType.getTypeName())) {

 * See the License for the specific language governing permissions and
/*
            super.bindParameter(session, statement, paramType, paramIndex, value);
import org.jkiss.utils.ArrayUtils;
            if (value == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * PostgreStringValueHandler
    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
 * limitations under the License.


        } else {
/**
                statement.setObject(paramIndex, value.toString(), Types.OTHER);
 * Unless required by applicable law or agreed to in writing, software
            } else {
 *
    }
 * You may obtain a copy of the License at
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        }
}
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
 */
