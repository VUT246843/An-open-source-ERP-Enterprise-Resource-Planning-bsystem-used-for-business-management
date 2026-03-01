 * Copyright (C) 2010-2025 DBeaver Corp and others

    protected DBDContent fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {
    ) throws DBCException {
import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.dbeaver.model.exec.DBCSession;

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    public static final PostgreJSONValueHandler INSTANCE = new PostgreJSONValueHandler();
 */
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            case PostgreContentJSON contentJSON -> copy ? contentJSON.cloneValue(session.getProgressMonitor()) : contentJSON;
import java.sql.SQLException;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCException;
        boolean isPgObject = PostgreUtils.isPgObject(dataSource, object);
    }
    @Override

        };
            object = PostgreUtils.extractPGObjectValue(object, dataSource);
        }
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
        PostgreDataSource dataSource = (PostgreDataSource) session.getDataSource();
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
}
            default -> super.getValueFromObject(session, type, object, copy, validateValue);
            case null -> new PostgreContentJSON(session.getExecutionContext(), null);
    }
        @NotNull DBCSession session,
        String json = resultSet.getString(index);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * limitations under the License.
        @NotNull DBSTypedObject type,
    public DBDContent getValueFromObject(
/**
/*
package org.jkiss.dbeaver.ext.postgresql.model.data;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class PostgreJSONValueHandler extends JDBCContentValueHandler {
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
 *

            case String stringValue -> new PostgreContentJSON(session.getExecutionContext(), stringValue);
 *     http://www.apache.org/licenses/LICENSE-2.0

 */

        return switch (object) {
import org.jkiss.code.NotNull;
        if (isPgObject) {
 * you may not use this file except in compliance with the License.
        @Nullable Object object,
import org.jkiss.code.Nullable;
 * PostgreJSONValueHandler
        boolean validateValue
 *
        boolean copy,
        return new PostgreContentJSON(session.getExecutionContext(), json);
