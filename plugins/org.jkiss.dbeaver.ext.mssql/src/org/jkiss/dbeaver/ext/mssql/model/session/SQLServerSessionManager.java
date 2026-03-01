        sql.append("JOIN sys.dm_exec_connections c ON c.session_id=s.session_id\n");
    @NotNull
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return dataSource;
 *
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.dbeaver.model.DBPDataSource;
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
        return sql.toString();
            sql.append("LEFT OUTER ");
        catch (SQLException e) {
 *
        return true;
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManagerSQL;
    @Override
        sql.append("c.connection_id,(select text from sys.dm_exec_sql_text(c.most_recent_sql_handle)) as sql_text\n")
    {
            throw new DBDatabaseException(e, session.getDataSource());
                dbStat.execute("KILL " + sessionId + "");
    }
            sql.append("NULL as database_name,");
        }
            sql.append("db.name as database_name,");


import org.jkiss.utils.CommonUtils;
    public DBPDataSource getDataSource()
        this.dataSource = dataSource;
    @Override
    @NotNull
        boolean supportsDatabaseInfo = dataSource.isServerVersionAtLeast(SQLServerConstants.SQL_SERVER_2012_VERSION_MAJOR, 0);
 * SQLServer session manager
import java.util.Map;
    {
                    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public void alterSession(@NotNull DBCSession session, @NotNull String sessionId, @NotNull Map<String, Object> options) throws DBException
import java.util.ArrayList;
    @Override
                    while (dbResult.next()) {
        }
    public static final String OPTION_SHOW_ONLY_CONNECTIONS = "showOnlyConnections";
    public Map<String, Object> getTerminateOptions() {
        sql.append("SELECT s.*,");
                    List<SQLServerSession> sessions = new ArrayList<>();
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    private final SQLServerDataSource dataSource;
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.Statement;

        return Map.of();
            throw new DBDatabaseException(e, session.getDataSource());
        StringBuilder sql = new StringBuilder();

import org.jkiss.code.NotNull;
    public String generateSessionReadQuery(@NotNull Map<String, Object> options) {
 * You may obtain a copy of the License at
    }
import java.sql.PreparedStatement;
package org.jkiss.dbeaver.ext.mssql.model.session;
                        sessions.add(new SQLServerSession(dbResult));

/*
    @NotNull
 */
                }
    @Override
    public SQLServerSessionManager(SQLServerDataSource dataSource)
    }
            }

        }
        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

        }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataSource;
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(generateSessionReadQuery(options))) {

        sql.append("ORDER BY s.session_id DESC");
        } catch (SQLException e) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            sql.append("LEFT OUTER JOIN sys.sysdatabases db on db.dbid=s.database_id\n");
        if (supportsDatabaseInfo) {

    @NotNull
        try {
    @Override
    public boolean canGenerateSessionReadQuery() {
                    return sessions;
import org.jkiss.dbeaver.DBException;
    {
    {
import java.util.List;
    public Collection<SQLServerSession> getSessions(@NotNull DBCSession session, @NotNull Map<String, Object> options) throws DBException
}
        } else {
 * limitations under the License.
/**
        if (!onlyConnections) {
        boolean onlyConnections = CommonUtils.getOption(options, OPTION_SHOW_ONLY_CONNECTIONS);
public class SQLServerSessionManager implements DBAServerSessionManager<SQLServerSession>, DBAServerSessionManagerSQL {
 * See the License for the specific language governing permissions and
import java.sql.SQLException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            .append("FROM sys.dm_exec_sessions s\n");
 *
import java.util.Collection;
            try (Statement dbStat = ((JDBCSession) session).createStatement()) {

 */
    }
            }
        if (supportsDatabaseInfo) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
