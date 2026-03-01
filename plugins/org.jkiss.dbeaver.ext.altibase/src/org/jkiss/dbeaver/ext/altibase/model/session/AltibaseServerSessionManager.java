

                    + " db_timezone()), 'YYYY-MM-DD HH24:MI:SS')) idle_since"
                    + " 'YYYY-MM-DD HH24:MI:SS') login_time"
                        sessions.add(new AltibaseServerSession(dbResult));

 * DBeaver - Universal Database Manager
                + " , DECODE(is_grant, 1, 'HOLDER', 0, 'WAITER', '') lock_status"
            throw new DBDatabaseException(e, session.getDataSource());
 * limitations under the License.
    }
 * You may obtain a copy of the License at
}

                + " , s.trans_id tx_id"
                dbStat.execute();
            String sql = String.format("ALTER DATABASE %s SESSION CLOSE %s",
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {
                + " (SELECT"
                + " , query_time_limit"
                + " , obj_name lock_target"
                + " , client_pid"
                + " , utrans_time_limit"
                + " , TO_CHAR(conv_timezone(UNIX_TO_DATE( login_time ), '+00:00', db_timezone())," 
                    + " ss.*, st.query"
import java.util.Map;
        } catch (SQLException e) {

 *
                + " , decode(sysdba_flag, 0, 'F', 1, 'T') sysda"
 *
 * See the License for the specific language governing permissions and
        } catch (SQLException e) {
            + " FROM "
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCSession;
                    + " system_.sys_tables_ a, v$lock b, system_.sys_users_ u "
                + " , db_username user_name"
    public AltibaseServerSessionManager(AltibaseDataSource dataSource) {
                    List<AltibaseServerSession> sessions = new ArrayList<>();
    }
                + " s.id session_id"
                    + " ON st.session_id = ss.id AND st.tx_id = ss.trans_id AND st.id = ss.current_stmt_id) s"
            @NotNull Map<String, Object> options) throws DBException {
                    + " AND a.table_oid = b.table_oid) l ON s.trans_id = l.trans_id"
    }
                + " , client_protocol_version"
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
 * Unless required by applicable law or agreed to in writing, software
    public Map<String, Object> getTerminateOptions() {
        return "SELECT"
                    + " u.user_id = a.user_id"
                + " , time_zone"

            @NotNull Map<String, Object> options) throws DBException {
                    + " , b.trans_id "
                + " , fetch_time_limit"
                    + " , b.lock_desc "
                 + " LEFT OUTER JOIN"
        try {
 *
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    return sessions;
/**
package org.jkiss.dbeaver.ext.altibase.model.session;
    @Override
                    dataSource.getDbName((JDBCSession) session), 

                + " , idle_time_limit"
    private final AltibaseDataSource dataSource;

 * Copyright (C) 2010-2024 DBeaver Corp and others
                + " , CURRENT_STMT_ID stmt_id"
                    + " TO_CHAR(conv_timezone(UNIX_TO_DATE( idle_start_time ), '+00:00'," 
        try {
        }
import java.sql.SQLException;
        return Map.of();
                }
        return true;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                + " (SELECT "
import org.jkiss.dbeaver.DBException;
    }
    public Collection<AltibaseServerSession> getSessions(@NotNull DBCSession session, 
                + " WHERE "
public class AltibaseServerSessionManager implements DBAServerSessionManager<AltibaseServerSession>, DBAServerSessionManagerSQL {

 * Altibase session manager
                    + " , b.is_grant "
            }
    public String generateSessionReadQuery(@NotNull Map<String, Object> options) {
    @NotNull
    @NotNull
                    }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManagerSQL;
                + " , client_type"
            }
                + " , ddl_time_limit"
                + " , comm_name"
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(generateSessionReadQuery(options))) {
            
import java.util.List;
    }
    @NotNull
        this.dataSource = dataSource;
                + " , CASE2(autocommit_flag = 1, 'T', 'F') autocommit"

 */
 */
 * you may not use this file except in compliance with the License.
import java.util.ArrayList;
        }
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
import java.util.Collection;
    @Override
                    sessionId);
import org.jkiss.code.NotNull;
/*
                + " , nvl2(s.query, s.query, ' ') AS sql"
                 + " FROM"
        return dataSource;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void alterSession(@NotNull DBCSession session, @NotNull String sessionId, 
 * Licensed under the Apache License, Version 2.0 (the "License");

                    while (dbResult.next()) {
                + " FROM "
    public DBPDataSource getDataSource() {
            throw new DBDatabaseException(e, session.getDataSource());
                + " , nls_territory"
                    + " u.user_name || '.' ||a.table_name obj_name"
    @Override
    public boolean canGenerateSessionReadQuery() {
import org.jkiss.dbeaver.model.DBPDataSource;
                + " , CASE2(IDLE_START_TIME < 1, '',"
    @Override
    @Override
                + " , client_app_info"
                + " , lock_desc lock_type"
            + " ORDER BY login_time";
    }
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    + " v$session ss LEFT OUTER JOIN v$statement st "
    }

import org.jkiss.dbeaver.DBDatabaseException;
