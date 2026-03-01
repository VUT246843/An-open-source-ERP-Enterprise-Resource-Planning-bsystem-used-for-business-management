 *
import org.jkiss.utils.CommonUtils;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    SQLServerLoginPasswordManager(SQLServerDataSource dataSource) {
 * See the License for the specific language governing permissions and
                " OLD_PASSWORD =" + SQLUtils.quoteString(dataSource, CommonUtils.notEmpty(oldPassword)));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.mssql.model;
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
            session.enableLogging(false);

 * Licensed under the Apache License, Version 2.0 (the "License");
 */

        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Change user login password")) {

            throw new DBCException("Error changing user password", e);
/*

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
 * limitations under the License.

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } catch (SQLException e) {

 *
import java.sql.SQLException;
import org.jkiss.code.NotNull;
            JDBCUtils.executeSQL(session, "ALTER LOGIN " + DBUtils.getQuotedIdentifier(dataSource, loginName) + " WITH PASSWORD =" + SQLUtils.quoteString(dataSource, CommonUtils.notEmpty(newPassword)) +
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        this.dataSource = dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
public class SQLServerLoginPasswordManager implements DBAUserPasswordManager {
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.exec.DBCException;
    private final SQLServerDataSource dataSource;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBUtils;
    public void changeUserPassword(@NotNull DBRProgressMonitor monitor, @NotNull String loginName, @NotNull String newPassword, @NotNull String oldPassword) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
