import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
            throw new DBCException("Error changing user password", e);

 *
        this.dataSource = dataSource;
            JDBCUtils.executeSQL(session, "ALTER USER " + userName + " PASSWORD " + DBUtils.getQuotedIdentifier(dataSource, CommonUtils.notEmpty(newPassword)));
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
/*
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Change user password")) {
        }
 * you may not use this file except in compliance with the License.
            session.enableLogging(false);

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
 */
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;



 * DBeaver - Universal Database Manager
    private HANADataSource dataSource;
import org.jkiss.code.NotNull;
 * limitations under the License.
 *
import java.sql.SQLException;
package org.jkiss.dbeaver.ext.hana.model;
    @Override
    public HANAUserPasswordManager(HANADataSource dataSource) {
    }
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.utils.CommonUtils;
    public void changeUserPassword(@NotNull DBRProgressMonitor monitor, @NotNull String userName, @NotNull String newPassword, @NotNull String oldPassword) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCException;
}
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public class HANAUserPasswordManager implements DBAUserPasswordManager {
