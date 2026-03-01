    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStringValueHandler;
import java.sql.SQLException;
/*
package org.jkiss.dbeaver.ext.clickhouse.model.data;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Unless required by applicable law or agreed to in writing, software
        // Use getString instead of getObject to avoid incorrect result of toString method

 * limitations under the License.

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * DBeaver - Universal Database Manager

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and

        return resultSet.getString(index);
    }
 *
public class ClikhouseInetTypeValueHandler extends JDBCStringValueHandler {
}
 */
    @Override
    static final ClikhouseInetTypeValueHandler INSTANCE = new ClikhouseInetTypeValueHandler();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
