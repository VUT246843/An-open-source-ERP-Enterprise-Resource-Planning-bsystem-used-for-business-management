        "									select\r\n" +
        "	)\r\n" +
        "	end EVALUATION,\r\n" +
    public DBPDataSource getDataSource() {
        "w.SESSION_ID AS w_session_id,w.login_time as w_login_time,\r\n" +
        "			)\r\n" +
        "												'SELECT', 'DESCRIBE', 'OPEN SCHEMA', 'CLOSE SCHEMA', 'FLUSH STATISTICS', 'EXECUTE SCRIPT'\r\n" +
        "                    ELSE NULL\r\n" +
            return locks;
        "                            ''\r\n" +
    public Collection<ExasolLockItem> getLockItems(DBCSession session, Map<String, Object> options) throws DBException {
        }
                    while (dbResult.next()) {

        "h.session_id as h_session_id, h.CLIENT AS h_CLIENT,\r\n" +
        try {
        "					SESSION_ID <> 4\r\n" +
        "					(\r\n" +
                }
        }
        "										when\r\n" +
        "w.session_id as h_session_id, h.CLIENT AS h_CLIENT,\r\n" +
                }
        "		where\r\n" +
        "											)\r\n" +
        "														E.STMT_ID > C.STMT_ID and\r\n" +
        "                    WHEN w.ACTIVITY LIKE 'Waiting for %' THEN CAST(\r\n" +
        "															COMMAND_NAME not in ('COMMIT', 'ROLLBACK', 'NOT SPECIFIED')\r\n" +
        "                        )\r\n" +
        "		from\r\n" +
                    while (dbResult.next()) {
        "									case\r\n" +
        "											select\r\n" +
        "ON  CASE\r\n" +
        "	SESSION_RISKS as (\r\n" +
        "									)\r\n" +
        "w.user_name AS w_user_name,\r\n" +
        "                            20,\r\n" +

        "                            w.ACTIVITY,\r\n" +
    @Override
 */
        "SELECT * FROM locked\r\n" +

    public static final String sidWait = "wsid";
 * DBeaver - Universal Database Manager
import java.math.BigDecimal;
                    }
        "			STMT_ID,\r\n" +
    public Class<ExasolLock> getLocksType() {
        "								(\r\n" +
        "												EXA_SQL C\r\n" +
        "						1,\r\n" +
        "				'CRITICAL',\r\n" +
        "	S.*\r\n" +
        "w.SESSION_ID AS w_session_id,w.login_time as w_login_time,\r\n" +

        "                        REPLACE(\r\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        "			SUCCESS\r\n" +
        "													when\r\n" +
        "order by\r\n" +
        "	LOGIN_TIME;\r\n" +
            return locks;
                    }
        "								EXA_DBA_SESSIONS S\r\n" +
        "							on\r\n" +
        "									group by\r\n" +
                        locks.add(new ExasolLockItem(dbResult));
        "												SESSION_ID,\r\n" +
        "						0,\r\n" +
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;

        "													else\r\n" +
import org.jkiss.dbeaver.DBException;
        "																	'FLUSH STATISTICS',\r\n" +
        "		SESSION_RISKS R\r\n" +
        "														0\r\n" +
        "									(S.STATUS not in ('IDLE', 'DISCONNECTED')) OR\r\n" +
        "														)\r\n" +
        } catch (SQLException e) {
        "                    )\r\n" +
                    case LockGraphManager.typeWait:
        "					SESSION_ID,\r\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

        "		from\r\n" +
        "																	'SELECT',\r\n" +
        "		when\r\n" +
                        dbStat.setBigDecimal(1, new BigDecimal((BigInteger) options.get(sidWait)));
 * Copyright (C) 2010-2024 DBeaver Corp and others
        "								then\r\n" +
        "																	'CLOSE SCHEMA',\r\n" +
        "	left join\r\n" +
    @Override
        "FROM SYS.EXA_DBA_SESSIONS w \r\n" +
        "												case\r\n" +
public class ExasolLockManager extends LockGraphManager
        "					) HAS_LOCKS\r\n" +
            throw new DBDatabaseException(e, session.getDataSource());
        "													then\r\n" +
        "														end\r\n" +
        "			SESSION_ID,\r\n" +
        "                        ) AS DECIMAL(\r\n" +
        "				NULL\r\n" +
        "						'WRITE LOCKS'\r\n" +
        "													select\r\n" +


 * Licensed under the Apache License, Version 2.0 (the "License");
        "										else\r\n" +
 * You may obtain a copy of the License at

        "			--EXA_DBA_AUDIT_SQL                   -- delivers more exact results (if available)\r\n" +
        "			(\r\n" +
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.*;

        "										then\r\n" +
    private final ExasolDataSource dataSource;
        "                            0\r\n" +
        "								) A\r\n" +
                        break;
        "'-' AS oname,\r\n" +
                        ExasolLock l = new ExasolLock(dbResult);
        "/*snapshot execution*/ with\r\n" +
        "			SESSION_ID,\r\n" +
        "w.client AS w_client,\r\n" +
            throw new DBDatabaseException(e, session.getDataSource());
        "						select\r\n" +
        "                            ''\r\n" +
        "                        REPLACE(\r\n" +

        "	on\r\n" +
 *
        "h.USER_NAME AS H_USER_NAME, h.status as h_status\r\n" +
    }
        "w.command_name AS w_command_name,\r\n" +
        "			HAS_LOCKS\r\n" +
        "							S.SESSION_ID,\r\n" +
    }
        "                END = h.SESSION_ID\r\n" +

        "			SESSION_ID in (select SESSION_ID from EXA_DBA_SESSIONS)\r\n" +
    public Map<Object, ExasolLock> getLocks(DBCSession session, Map<String, Object> options) throws DBException {
        "				where\r\n" +
        "w.client AS w_client,\r\n" +
        "																COMMAND_NAME in (\r\n" +
        "												SUCCESS and\r\n" +
        "                    ELSE NULL\r\n" +
                dbStat.execute();
        "																	'OPEN SCHEMA',\r\n" +
        }
        "							zeroifnull(A.ACCESS) LAST_ACCESS\r\n" +
                    default:
        "											2\r\n" +


                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        "																1\r\n" +
        "										)\r\n" +
    }
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(LOCK_QUERY)) {
            }
        "				select\r\n" +
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        "		(S.SESSION_ID = R.SESSION_ID) WHERE S.SESSION_ID = ?\r\n" +
                        dbStat.setBigDecimal(1, new BigDecimal((BigInteger) options.get(sidHold)));
                String otype = (String) options.get(LockGraphManager.keyType);
    @Override
        "														*\r\n" +
        "                            w.ACTIVITY,\r\n" +
        "	HAS_LOCKS,\r\n" +
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
        "								else\r\n" +
        "                            'Waiting for session ',\r\n" +
/*
        "                            20,\r\n" +
        "		select\r\n" +

        "															when\r\n" +
        "											1\r\n" +
        "														(\r\n" +
        "h.USER_NAME AS H_USER_NAME, h.status as h_status\r\n" +
        "								S.SESSION_ID = A.SESSION_ID\r\n" +
    public static final String sidHold = "hsid";
        "													from\r\n" +
        "											from\r\n" +
        "							left join\r\n" +
        "FROM SYS.EXA_DBA_SESSIONS w\r\n" +
        "																	'DESCRIBE',\r\n" +
        "									end\r\n" +
        "										SESSION_ID,\r\n" +



        "		select\r\n" +
        "			EXA_SQL_LAST_DAY\r\n" +
                        locks.put(l.getId(), l);
import java.math.BigInteger;
            Map<Object, ExasolLock> locks = new HashMap<>(10);
package org.jkiss.dbeaver.ext.exasol.model.lock;
        "INNER JOIN SYS.EXA_DBA_SESSIONS h\r\n" +
        } catch (SQLException e) {
        return this.dataSource;
 *
    public static final String LOCK_QUERY =
        "                    WHEN w.ACTIVITY LIKE 'Waiting for %' THEN CAST(\r\n" +
        "select\r\n" +
        "										max(ACCESS) ACCESS\r\n" +

        "														E.COMMAND_CLASS = 'TRANSACTION'\r\n" +

 * See the License for the specific language governing permissions and
    @Override
        "	case\r\n" +
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        "																	'EXECUTE SCRIPT'\r\n" +
        "'-' AS oname,\r\n" +
        "										SESSION_ID\r\n" +
        "                        )\r\n" +

        "																)\r\n" +
        "SELECT \r\n" +
        "									0\r\n" +
        "		EXA_DBA_SESSIONS S\r\n" +
    }
 * Unless required by applicable law or agreed to in writing, software
        "				'VERY CRITICAL',\r\n" +
    public void alterSession(DBCSession session, ExasolLock lock, Map<String, Object> options) throws DBException {
        "						2,\r\n" +
        "												not exists(\r\n" +
        "from\r\n" +
}
    implements DBAServerLockManager<ExasolLock, ExasolLockItem> {
            super.buildGraphs(locks);
        "LEFT OUTER JOIN SYS.EXA_DBA_SESSIONS h\r\n" +
        "								when\r\n" +
    @Override
        "WHERE w.SESSION_ID IN (SELECT h_session_id FROM locked)";
        "									FROM\r\n" +
        "						greatest(CURRENT_ACCESS, LAST_ACCESS),\r\n" +
        "												C.COMMAND_CLASS <> 'TRANSACTION' and\r\n" +
            throw new DBDatabaseException(e, session.getDataSource());
        "							end CURRENT_ACCESS,\r\n" +
        "														case\r\n" +
        "SELECT\r\n" +
        "			COMMAND_NAME,\r\n" +
        "			)\r\n" +

            }
 * you may not use this file except in compliance with the License.
        "														EXA_SQL E\r\n" +
        "w.os_user AS w_os_user,\r\n" +
        "ON  CASE\r\n" +
import java.sql.SQLException;
        return ExasolLock.class;
        "											where\r\n" +
import org.jkiss.dbeaver.model.exec.DBCSession;
        "                        ) AS DECIMAL(\r\n" +
        "												)\r\n" +
        "/*snapshot execution*/ WITH LOCKED AS (\r\n" +
                    case LockGraphManager.typeHold:
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(LOCK_ITEM_QUERY)) {
        "					decode(\r\n" +
        "                    )\r\n" +
        "						from\r\n" +

        "	),\r\n" +
        "			decode(\r\n" +
        "													where\r\n" +
                        return locks;
        } catch (SQLException e) {
        this.dataSource = dataSource;
        "					)\r\n" +
                        break;
                }
        "	EVALUATION desc,\r\n" +

        ") \r\n" +
        "				from\r\n" +
        "									(\r\n" +
        "	EXA_SQL as (\r\n" +
    public static final String LOCK_ITEM_QUERY =
            List<ExasolLockItem> locks = new ArrayList<>();
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphManager;
 * limitations under the License.
        "		then\r\n" +
        "							case\r\n" +
    public ExasolLockManager(ExasolDataSource dataSource) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        "                END = h.SESSION_ID\r\n" +
        "																2\r\n" +
        "UNION ALL\r\n" +
        "w.user_name AS w_user_name,\r\n" +
    }
        "				HAS_LOCKS,\r\n" +
        "															then\r\n" +
import org.jkiss.dbeaver.DBDatabaseException;
                switch (otype) {
        "												end ACCESS\r\n" +
        "				'WRITE LOCKS',\r\n" +
 * distributed under the License is distributed on an "AS IS" BASIS,
        "			DURATION > '1:00:00' and\r\n" +
        "                            'Waiting for session ',\r\n" +
        "                            0\r\n" +
        "															else\r\n" +
        "				'READ LOCKS',\r\n" +
        "w.command_name AS w_command_name,\r\n" +
        "w.os_user AS w_os_user,\r\n" +
        "											S.COMMAND_NAME in (\r\n" +
        "										(\r\n" +
    }
        "			STATUS = 'IDLE'\r\n" +
        "						'NONE',\r\n" +
        "";
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement("KILL SESSION " + lock.getHold_sid())) {
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
        "														E.SESSION_ID = C.SESSION_ID and\r\n" +
        try {
        "			COMMAND_CLASS,\r\n" +
        "										S.COMMAND_NAME not in ('COMMIT', 'ROLLBACK', 'NOT SPECIFIED')\r\n" +
            }
        "						'READ LOCKS',\r\n" +
