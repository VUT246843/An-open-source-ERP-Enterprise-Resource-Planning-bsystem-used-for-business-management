import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;

    private OracleDataSource dataSource;
package org.jkiss.dbeaver.ext.oracle.model;
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            session.enableLogging(false);
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 */
public class OracleChangeUserPasswordManager implements DBAUserPasswordManager {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Change user password")) {
 * DBeaver - Universal Database Manager
                transformedUserName != null ? transformedUserName : userName) + " IDENTIFIED BY " +
            String transformedUserName = DBObjectNameCaseTransformer.transformName(dataSource, userName);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        this.dataSource = dataSource;
                " REPLACE " + DBUtils.getQuotedIdentifier(dataSource, CommonUtils.notEmpty(oldPassword)));
import org.jkiss.code.NotNull;
    public void changeUserPassword(@NotNull DBRProgressMonitor monitor, @NotNull String userName, @NotNull String newPassword, @NotNull String oldPassword) throws DBException {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
 * Unless required by applicable law or agreed to in writing, software
/*
                DBUtils.getQuotedIdentifier(dataSource, CommonUtils.notEmpty(newPassword)) +

        // Do not use numbers in the password beginning
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            JDBCUtils.executeSQL(session, "ALTER USER " + DBUtils.getQuotedIdentifier(dataSource,
}
            throw new DBCException("Error changing user password", e);
 *

    OracleChangeUserPasswordManager(OracleDataSource dataSource) {


 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBUtils;

        } catch (SQLException e) {
import java.sql.SQLException;
 *
