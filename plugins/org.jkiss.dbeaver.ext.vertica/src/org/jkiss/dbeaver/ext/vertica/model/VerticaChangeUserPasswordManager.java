 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
import org.jkiss.dbeaver.DBException;
/*

 *
    VerticaChangeUserPasswordManager(VerticaDataSource dataSource) {
import org.jkiss.dbeaver.model.exec.DBCException;
}
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.DBUtils;
    }
 * See the License for the specific language governing permissions and
 */
 * Unless required by applicable law or agreed to in writing, software
 *
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void changeUserPassword(@NotNull DBRProgressMonitor monitor, @NotNull String userName, @NotNull String newPassword, @NotNull String oldPassword) throws DBException {
            session.enableLogging(false);
public class VerticaChangeUserPasswordManager implements DBAUserPasswordManager {
            JDBCUtils.executeSQL(session, "ALTER USER " + DBUtils.getQuotedIdentifier(dataSource, userName)
                + " IDENTIFIED BY " + SQLUtils.quoteString(dataSource, CommonUtils.notEmpty(newPassword))
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }

 *

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private VerticaDataSource dataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        this.dataSource = dataSource;
 * you may not use this file except in compliance with the License.
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Change user password")) {
 * DBeaver - Universal Database Manager
                + " REPLACE " + SQLUtils.quoteString(dataSource, CommonUtils.notEmpty(oldPassword)));
            throw new DBCException("Error changing user password", e);
package org.jkiss.dbeaver.ext.vertica.model;
