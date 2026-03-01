            throw new DBCException("Error changing user password", e);
import org.jkiss.code.NotNull;
            throw new DBException("Password change error for user: " + userName + ". New password can not be empty.");
 * you may not use this file except in compliance with the License.
            session.enableLogging(false);
        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Change user password")) {
public class PostgresUserPasswordManager implements DBAUserPasswordManager {
        this.dataSource = dataSource;
 *
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    private PostgreDataSource dataSource;
 * See the License for the specific language governing permissions and
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBUtils;

    public PostgresUserPasswordManager(PostgreDataSource dataSource) {
}
    }

        }
import java.sql.SQLException;
import org.jkiss.utils.CommonUtils;
            // User can set new empty password, but then we will get an error when connecting with an empty password
            JDBCUtils.executeSQL(session, "ALTER USER " + DBUtils.getQuotedIdentifier(dataSource, userName) + " WITH PASSWORD " + SQLUtils.quoteString(dataSource, CommonUtils.notEmpty(newPassword)));

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.postgresql.model;
        if (CommonUtils.isEmpty(newPassword)) {
/*
import org.jkiss.dbeaver.DBException;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
    public void changeUserPassword(@NotNull DBRProgressMonitor monitor, @NotNull String userName, @NotNull String newPassword, @NotNull String oldPassword) throws DBException {

import org.jkiss.dbeaver.model.sql.SQLUtils;
        } catch (SQLException e) {

 */
 * DBeaver - Universal Database Manager
