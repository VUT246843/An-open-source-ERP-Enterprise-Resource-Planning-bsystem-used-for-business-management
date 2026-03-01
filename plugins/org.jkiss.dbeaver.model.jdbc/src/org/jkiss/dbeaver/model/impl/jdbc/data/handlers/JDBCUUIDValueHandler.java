                return UUID.fromString(str);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public static final JDBCUUIDValueHandler INSTANCE = new JDBCUUIDValueHandler();
    {
        return UUID.class;
            final String str = object.toString();
 * limitations under the License.
import org.jkiss.code.NotNull;
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
            if (str.isEmpty()) {
                    value = GeneralUtils.getBytesFromUUID((UUID) value);

    @Override
                    value = value.toString();
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
                    break;
 */
import java.util.UUID;
/**
 * See the License for the specific language governing permissions and

public class JDBCUUIDValueHandler extends JDBCObjectValueHandler {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager
            return object;


        } else if (object instanceof UUID) {
            } else {
            switch (paramType.getDataKind()) {
 * UUID type support
        super.bindParameter(session, statement, paramType, paramIndex, value);
import java.sql.SQLException;
            return GeneralUtils.getUUIDFromBytes((byte[]) object);

    public Class<UUID> getValueObjectType(@NotNull DBSTypedObject attribute) {
                case STRING:
        }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                    break;
    }
        if (value instanceof String && paramType.getDataKind() != DBPDataKind.STRING) {
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
        } else {
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataKind;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            value = UUID.fromString((String) value);
        if (object == null) {
        if (value instanceof UUID) {
/*
                return null;
    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * You may obtain a copy of the License at

        }
 *
            return null;
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;

                case BINARY:
 */
import org.jkiss.dbeaver.model.exec.DBCException;
        } else if (object instanceof byte[]) {
import org.jkiss.dbeaver.utils.GeneralUtils;
    @NotNull

            }
