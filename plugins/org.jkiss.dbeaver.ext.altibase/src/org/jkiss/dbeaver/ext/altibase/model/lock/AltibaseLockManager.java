            String sql = String.format("ALTER DATABASE %s SESSION CLOSE %s",
            + " ,h.id AS h_sid"
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphManager;
            + " ,wobj.stmt AS w_query"
 */
            + " ,w.client_pid AS w_pid"
            + " FROM "
            + " WHERE "

                        + " ,l.trans_id"
            + " ,stmt.query AS h_query"

                    }
    public Collection<AltibaseLockItem> getLockItems(DBCSession session, Map<String, Object> options)
        }
import java.sql.SQLException;
                        + " v$lock l"
            throws DBException {
        return dataSource;

/*
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            + " tbs.name AS tbs_name"
        }
    private static final String LOCK_QUERY = "SELECT"
    @Override
    }
                    + " FROM"
        return AltibaseLock.class;
                        + " t.table_oid = l.table_oid"
            }
                + " ON h.id = stmt.session_id";
import org.jkiss.dbeaver.model.DBPDataSource;
                dbStat.execute();
                        + " v$session ss"
                    + " FROM"
                        + " ,v$lock l"
                    default:

            throw new DBDatabaseException(e, session.getDataSource());
            + " ,w.db_username AS w_user_name"
            + " ) h"
                + " SELECT "
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                String otype = (String) options.get(LockGraphManager.keyType);
        try {
            + " ,w.trans_id AS w_txid"
        } catch (SQLException e) {
            }
            String sql = LOCK_ITEM_QUERY;
            + " ) stmt"
import org.jkiss.dbeaver.DBDatabaseException;
                        + " ,t.table_name AS obj_name"
        }
                + " ON vlw.trans_id = wobj.trans_id LEFT OUTER JOIN ("
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            + " v$lock_wait vlw LEFT OUTER JOIN ("
                        AltibaseLock l = new AltibaseLock(dbResult, dataSource);
                    + " WHERE"
            + " ) wobj"

            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {


 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            List<AltibaseLockItem> locks = new ArrayList<>();
                        dbStat.setInt(1, (int) options.get(sidWait));
            + " ) w"
        + " FROM"
            + " v$lock_statement ls"
                        + " AND l.trans_id = ls.tx_id"
            return locks;
                        dbStat.setInt(1, (int) options.get(sidHold));
                + " SELECT"
    public AltibaseLockManager(AltibaseDataSource dataSource) {
import org.jkiss.dbeaver.model.exec.DBCSession;

    }
                }
            + " ,h.trans_id AS h_txid"
    public Map<Object, AltibaseLock> getLocks(DBCSession session, Map<String, Object> options) throws DBException {
 * DBeaver - Universal Database Manager
                        break;
                        + " AND u.user_id = t.user_id"
                    case LockGraphManager.typeWait:
    @Override
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {
                    while (dbResult.next()) {
    }
    @Override
            super.buildGraphs(locks);
                    }
                + " SELECT"
 * You may obtain a copy of the License at
                switch (otype) {
        this.dataSource = dataSource;
                        + " ,v$lock_statement ls"
            + " LEFT OUTER JOIN (SELECT * FROM v$tablespaces) tbs ON tbs.id = ls.tbs_id"
            throw new DBDatabaseException(e, session.getDataSource());
    }

public class AltibaseLockManager extends LockGraphManager implements DBAServerLockManager<AltibaseLock, AltibaseLockItem> {
            + " lock_desc, lock_cnt, tbs_id, table_oid, dbf_id,"

                + " ON vlw.wait_for_trans_id = h.trans_id LEFT OUTER JOIN ("
                + " FROM "
 * Unless required by applicable law or agreed to in writing, software
            + " session_id = ?";
    public void alterSession(DBCSession session, AltibaseLock lock, Map<String, Object> options) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                + " ON vlw.trans_id = w.trans_id LEFT OUTER JOIN ("
                }
            + " CASE2 (ls.lock_item_type  = 'TBL','TABLE',ls.lock_item_type) AS locked_obj_type,"

                    + " v$statement s"
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public DBPDataSource getDataSource() {
    public Class<AltibaseLock> getLocksType() {
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
import java.util.*;
                    while (dbResult.next()) {
                        + " ss.trans_id = l.trans_id"
 *     http://www.apache.org/licenses/LICENSE-2.0

            String sql = LOCK_QUERY;
    public static final String sidWait = "wsid";
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
                        + " ,system_.sys_users_ u"
    private static final String LOCK_ITEM_QUERY = "SELECT "
            return locks;
                    + " s.* "
 *

                        break;
 * you may not use this file except in compliance with the License.
    @Override
        } catch (SQLException e) {
                    dataSource.getDbName((JDBCSession) session), lock.getWait_sid());
    }
}    private final AltibaseDataSource dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {

        try {
                    + " FROM"
            + " w.id AS w_sid"
                + " SELECT"
                        + " ,ls.query AS stmt"
    }

                        + " ,system_.sys_tables_ t"

import org.jkiss.dbeaver.DBException;
                    + " WHERE"
 * See the License for the specific language governing permissions and
            + " ,h.client_pid AS h_pid"
    @Override
            + " ,wobj.obj_name AS w_obj_name"
                        return locks;
            + " ,wobj.schema_name AS w_obj_schema"
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {
        } catch (SQLException e) {

                        + " *"
            throw new DBDatabaseException(e, session.getDataSource());
                        + " AND l.is_grant = 1"
 *
                        locks.add(new AltibaseLockItem(dbResult));
package org.jkiss.dbeaver.ext.altibase.model.lock;
            Map<Object, AltibaseLock> locks = new HashMap<>(10);
            + " ,h.db_username AS h_user_name"

                        + " v$session"
                        locks.put(l.getId(), l);
            }
                        + " u.user_name AS schema_name"
                        + " ss.*"
    public static final String sidHold = "hsid";
 * limitations under the License.
                    case LockGraphManager.typeHold:
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others

