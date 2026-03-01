
    @Nullable
        boolean copy,
    @Override
}
        return String.class;
    protected void bindParameter(
import java.sql.Types;
    }
    public Object getValueFromObject(
        DBSTypedObject paramType,
 */
import org.jkiss.utils.CommonUtils;
            statement.setNull(paramIndex, Types.VARCHAR);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class PostgreUnknownValueHandler extends JDBCAbstractValueHandler {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
/*
        if (value == null) {
    @Nullable
package org.jkiss.dbeaver.ext.postgresql.model.data;
    ) throws DBCException, SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            statement.setString(paramIndex, CommonUtils.toString(value));
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
        JDBCSession session,
 *
        Object value
    }
    @Override
        DBCSession session,
import org.jkiss.code.NotNull;
        JDBCPreparedStatement statement,
 *
 *
 * limitations under the License.

 */

        int index
 * DBeaver - Universal Database Manager
    }
    @Override
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

    }
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
        @NotNull DBSTypedObject type,
 * A value handler for values of an unknown type. Retrieves/updates value as if it were a string.
    ) throws DBCException {
    public static final PostgreUnknownValueHandler INSTANCE = new PostgreUnknownValueHandler();
        boolean validateValue
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.SQLException;
        DBSTypedObject type,
    @NotNull
/**
        return CommonUtils.toString(object);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable Object object,
        JDBCResultSet resultSet,

        } else {
 * Unless required by applicable law or agreed to in writing, software
    ) throws DBCException, SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        @NotNull DBCSession session,
    protected Object fetchColumnValue(
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return resultSet.getString(index);


    @Override
        int paramIndex,
