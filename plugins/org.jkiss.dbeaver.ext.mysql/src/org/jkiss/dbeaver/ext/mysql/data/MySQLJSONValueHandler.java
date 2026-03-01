}

import java.sql.SQLException;
    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        // Starting with org.mariadb.jdbc:mariadb-java-client:3.1.0, JSON data is returned as a byte[] when using ResultSet#getObject
 * DBeaver - Universal Database Manager
 * limitations under the License.
package org.jkiss.dbeaver.ext.mysql.data;
    public static final MySQLJSONValueHandler INSTANCE = new MySQLJSONValueHandler();
/*
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentChars;
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.model.data.DBDContent;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

import org.jkiss.dbeaver.model.exec.DBCSession;
 * See the License for the specific language governing permissions and

public class MySQLJSONValueHandler extends JDBCContentValueHandler {
        return new JDBCContentChars(session.getExecutionContext(), resultSet.getString(index));
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected DBDContent fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {
