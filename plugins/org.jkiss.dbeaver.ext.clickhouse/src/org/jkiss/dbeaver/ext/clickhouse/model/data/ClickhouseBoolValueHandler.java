import org.jkiss.dbeaver.model.exec.DBCSession;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
 *

        @NotNull JDBCResultSet resultSet,
 * See the License for the specific language governing permissions and
    public static final ClickhouseBoolValueHandler INSTANCE = new ClickhouseBoolValueHandler();

 * limitations under the License.
 * DBeaver - Universal Database Manager
 *
}
        @Nullable DBSTypedObject type,
import org.jkiss.utils.CommonUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        return resultSet.wasNull() ? null : value;
        int index
 * You may obtain a copy of the License at
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        boolean value = CommonUtils.toBoolean(resultSet.getObject(index));
        @Nullable DBCSession session,

    ) throws SQLException {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @Override
    protected Object fetchColumnValue(
/*
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ClickhouseBoolValueHandler extends JDBCBooleanValueHandler {
import java.sql.SQLException;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
 *
package org.jkiss.dbeaver.ext.clickhouse.model.data;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCBooleanValueHandler;
 * you may not use this file except in compliance with the License.
