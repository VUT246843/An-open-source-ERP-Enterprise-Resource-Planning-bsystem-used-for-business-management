        this.dataSource = dataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
            throw new DBCException("Error changing user password", e);
    ExasolChangeUserPasswordManager(ExasolDataSource dataSource) {
    public void changeUserPassword(@NotNull DBRProgressMonitor monitor, @NotNull String userName, @NotNull String newPassword, @NotNull String oldPassword) throws DBException {
import org.jkiss.code.NotNull;
import java.sql.SQLException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
            session.enableLogging(false);
 *
    }
 */
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
    private ExasolDataSource dataSource;
 *
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
import org.jkiss.dbeaver.model.DBUtils;
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            JDBCUtils.executeSQL(session, "ALTER USER " + DBUtils.getQuotedIdentifier(dataSource, userName) + " IDENTIFIED BY " + DBUtils.getQuotedIdentifier(dataSource, CommonUtils.notEmpty(newPassword)) +
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Change user password")) {
        }
 * you may not use this file except in compliance with the License.
 *
public class ExasolChangeUserPasswordManager implements DBAUserPasswordManager {

 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.exasol.model;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                " REPLACE " + DBUtils.getQuotedIdentifier(dataSource, CommonUtils.notEmpty(oldPassword)));
}
 *     http://www.apache.org/licenses/LICENSE-2.0

/*
