}
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
        return this.dataSource;
import org.jkiss.dbeaver.Log;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
    }
    public void alterSession(@NotNull DBCSession session, @NotNull String sessionId, @NotNull Map<String, Object> options)

                    while (dbResult.next()) {

    /**
    // list sessions
        try {
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and

    public Map<String, Object> getTerminateOptions() {
    public static Collection<ExasolServerSession> readSessions(JDBCSession session) throws SQLException {
    }

                        listSessions.add(new ExasolServerSession(dbResult));
import java.sql.PreparedStatement;
    }
    @NotNull
                    }
            }
                try (JDBCResultSet dbResult = dbStat.executeQuery(SESS_ALL_QUERY)) {
        }
    public Collection<ExasolServerSession> getSessions(@NotNull DBCSession session, @NotNull Map<String, Object> options)
    private static final String SESS_ALL_QUERY = "/*snapshot execution*/ select * from exa_ALL_sessions";
    }

import org.jkiss.dbeaver.DBDatabaseException;
                    }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManagerSQL;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        throws DBException {
import java.util.ArrayList;
            return readSessions((JDBCSession) session);
        try {
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @NotNull
        //check dba view
        return Map.of();
            dbStat.execute();
            }
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSource;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        try {
        return SESS_ALL_QUERY;
import org.jkiss.dbeaver.model.exec.DBCSession;
        return true;

 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
    }
     *


import java.util.List;

import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
            throw new DBDatabaseException(e, session.getDataSource());
        } catch (SQLException e) {
        }


 *

    public ExasolServerSessionManager(ExasolDataSource dataSource) {
/**

    @Override
    private static final String KILL_APP_CMD = "kill session %s";
        }
 * Unless required by applicable law or agreed to in writing, software
 */
    private static final String KILL_STMT_CMD = "kill statement in session %s";
        List<ExasolServerSession> listSessions = new ArrayList<>();
        throws DBException {
 *
            try (JDBCStatement dbStat = session.createStatement()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * DBeaver - Universal Database Manager
public class ExasolServerSessionManager implements DBAServerSessionManager<ExasolServerSession>, DBAServerSessionManagerSQL {
                }
    public boolean canGenerateSessionReadQuery() {
        this.dataSource = dataSource;
    private static final String SESS_DBA_QUERY = "/*snapshot execution*/ select * from exa_dba_sessions";


        log.debug("read sessions");
    }
            //now try all view
    private final ExasolDataSource dataSource;
        } catch (SQLException e) {
    @Override

 *

            PreparedStatement dbStat = ((JDBCSession) session).prepareStatement(cmd);
            try (JDBCStatement dbStat = session.createStatement()) {
                }
import java.util.Collection;
    @Override
import java.sql.SQLException;
    public DBPDataSource getDataSource() {
 * @author Karl Griesser
                    while (dbResult.next()) {
package org.jkiss.dbeaver.ext.exasol.model.app;


                try (JDBCResultSet dbResult = dbStat.executeQuery(SESS_DBA_QUERY)) {

import java.util.Map;
    @Override
 * You may obtain a copy of the License at
        return listSessions;
    }
            throw new DBDatabaseException(e, session.getDataSource());
 * limitations under the License.
                        listSessions.add(new ExasolServerSession(dbResult));

     */
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String generateSessionReadQuery(@NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;
            String cmd = String.format(Boolean.TRUE.equals(options.get(PROP_KILL_QUERY)) ? KILL_STMT_CMD : KILL_APP_CMD, sessionId);
    private static final Log log = Log.getLog(ExasolServerSessionManager.class);
        } catch (SQLException e) {
    @Override
    @NotNull
    public static final String PROP_KILL_QUERY = "killQuery";
