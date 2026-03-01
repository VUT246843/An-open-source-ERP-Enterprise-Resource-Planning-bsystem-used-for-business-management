        
 */

                if (options != null && CommonUtils.toBoolean(options.get(OPTION_QUERY_CANCEL))) {

    @NotNull
import org.jkiss.dbeaver.DBException;
                        sessions.add(new PostgreSession(dbResult));
            throw new DBDatabaseException(e, session.getDataSource());

    {

    public List<PostgreSession> getSessions(@NotNull DBCSession session, @NotNull Map<String, Object> options) throws DBException
        return dataSource;
    }
 * Postgre session manager

 *
        StringBuilder sql =  new StringBuilder("SELECT sa.* FROM pg_catalog.pg_stat_activity sa");
 * See the License for the specific language governing permissions and
import java.sql.Statement;
 *


import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public Map<String, Object> getTerminateOptions() {
import java.util.List;
    @Override
        try {
        if (!CommonUtils.getOption(options, OPTION_SHOW_IDLE)) {
import org.jkiss.dbeaver.model.DBPDataSource;
    public String generateSessionReadQuery(@NotNull Map<String, Object> options) {
    }
        
import org.jkiss.dbeaver.model.exec.DBCSession;
    {
    }
            throw new DBDatabaseException(e, session.getDataSource());
        return Map.of();
                } else {
}
import java.sql.SQLException;
        }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
/*
import org.jkiss.code.NotNull;

    }
    public PostgreSessionManager(PostgreDataSource dataSource)
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;

/**
        }
    @Override
        catch (SQLException e) {
    public static final String OPTION_SHOW_IDLE = "showIdle";

 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ext.postgresql.model.session;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
                }
        return sql.toString();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @NotNull
    @Override
                    dbStat.execute("SELECT pg_catalog.pg_cancel_backend(" + sessionId + ")");
    @Override
    private final PostgreDataSource dataSource;
                    }
    public boolean canGenerateSessionReadQuery() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                }
            }
            sql.append(" where sa.state is null or sa.state not like 'idle%'");
    @Override
 * limitations under the License.
 */
import java.util.ArrayList;
                    dbStat.execute("SELECT pg_catalog.pg_terminate_backend(" + sessionId + ")");
 *
    @NotNull
import java.util.Map;
import org.jkiss.dbeaver.DBDatabaseException;
    public DBPDataSource getDataSource()
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(generateSessionReadQuery(options))) {
        } catch (SQLException e) {
    }
    }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManagerSQL;
    public static final String OPTION_QUERY_CANCEL = "isQueryCancel";
                    while (dbResult.next()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            try (Statement dbStat = ((JDBCSession) session).createStatement()) {
        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
    @NotNull
        try {
                    List<PostgreSession> sessions = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
    public static final String PROP_KILL_QUERY = "killQuery";
        this.dataSource = dataSource;
                    return sessions;
    {
 * DBeaver - Universal Database Manager

import org.jkiss.utils.CommonUtils;
        }
 * You may obtain a copy of the License at

public class PostgreSessionManager implements DBAServerSessionManager<PostgreSession>, DBAServerSessionManagerSQL {
 * you may not use this file except in compliance with the License.
    public void alterSession(@NotNull DBCSession session, @NotNull String sessionId, @NotNull Map<String, Object> options) throws DBException
