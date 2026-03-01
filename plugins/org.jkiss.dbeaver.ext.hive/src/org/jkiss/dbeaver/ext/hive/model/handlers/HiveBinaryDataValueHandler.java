package org.jkiss.dbeaver.ext.hive.model.handlers;
            setBytes(statement, paramIndex, jdbcContentBytes.getRawValue());
        @Nullable Object value
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } else {
import java.sql.SQLException;

import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    public String makeQueryBind(@NotNull DBSAttributeBase attribute, @NotNull Object value) throws DBCException {
 * Unless required by applicable law or agreed to in writing, software
        @NotNull JDBCSession session,
}
 * DBeaver - Universal Database Manager
        int paramIndex,
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    private final BinaryFormatterHex hexFormatter = new BinaryFormatterHex();
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }

import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    @Override
        if (value instanceof JDBCContentBytes jdbcContentBytes && !jdbcContentBytes.isNull()) {
import org.jkiss.dbeaver.model.data.DBDValueBinder;
            super.bindParameter(session, statement, paramType, paramIndex, value);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterHex;

 *     http://www.apache.org/licenses/LICENSE-2.0
        statement.setString(paramIndex, hexFormatter.toString(data, 0, data.length));
        return "unhex(?)";
    @Override

/*

import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentBytes;
import org.jkiss.code.NotNull;
        @NotNull DBSTypedObject paramType,
    }
    private void setBytes(@NotNull JDBCPreparedStatement statement, int paramIndex, @NotNull byte[] data) throws SQLException {

    }
import org.jkiss.code.Nullable;
    ) throws DBCException, SQLException {
 *
    protected void bindParameter(
        }
 * You may obtain a copy of the License at

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull JDBCPreparedStatement statement,
 * See the License for the specific language governing permissions and
public class HiveBinaryDataValueHandler extends JDBCContentValueHandler implements DBDValueBinder {
