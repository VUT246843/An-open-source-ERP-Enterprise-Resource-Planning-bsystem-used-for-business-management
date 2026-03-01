 *
    @Override
    public DBPDataSource getDataSource()
public class DB2ServerApplicationManager implements DBAServerSessionManager<DB2ServerApplication>, DBAServerSessionManagerSQL {
import org.jkiss.dbeaver.DBDatabaseException;
    @Override
            return DB2Utils.readApplications(session.getProgressMonitor(), (JDBCSession) session);

    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.dataSource = dataSource;
        return dataSource;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
import org.jkiss.code.NotNull;

    public Collection<DB2ServerApplication> getSessions(@NotNull DBCSession session, @NotNull Map<String, Object> options) throws DBException
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    private final DB2DataSource dataSource;
        try {
import java.util.Collection;
    public String generateSessionReadQuery(@NotNull Map<String, Object> options) {
        } catch (SQLException e) {
 *
        return DB2Utils.SEL_APP;
    @NotNull

 */
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
    @Override
/*
 * you may not use this file except in compliance with the License.
 */
    }
import java.sql.SQLException;
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

import java.util.Map;
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;

    @Override
        return true;

    {
    @Override
            throw new DBDatabaseException(e, session.getDataSource());
    }
    public Map<String, Object> getTerminateOptions() {
    @NotNull
package org.jkiss.dbeaver.ext.db2.model.app;
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
 * 
    }
}
            throw new DBDatabaseException(e, session.getDataSource());
 * @author Denis Forveille
        try {
        return Map.of();
import org.jkiss.dbeaver.ext.db2.DB2Utils;
            DB2Utils.callAdminCmd(session.getProgressMonitor(), dataSource, cmd);
    }
    @NotNull
        }
            String cmd = String.format(FORCE_APP_CMD, sessionId);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    private static final String FORCE_APP_CMD = "FORCE APPLICATION (%s)";
    public void alterSession(@NotNull DBCSession session, @NotNull String sessionId, @NotNull Map<String, Object> options) throws DBException
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManagerSQL;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public boolean canGenerateSessionReadQuery() {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at


    }
    public DB2ServerApplicationManager(DB2DataSource dataSource)
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DB2 Application Manager

    {

    }
