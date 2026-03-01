        "wsession.row_wait_block# row_lock, " +
    @Override

        this.dataSource = dataSource;

            }
        "wsession.logon_time, " +
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphManager;
    }
            "WHERE\n" +
    public static final String sidHold = "hsid";
                sql = LOCK_ITEM_QUERY_8V;
            String sql = LOCK_QUERY;
        "wsession.logon_time, " +
            return locks;
            "(SELECT username\n" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {
    private static final String LOCK_QUERY_FOR_OLD_VERSIONS = "SELECT (SELECT username\n" +
                }
        "nvl(obj.owner,'-') owner, " +
        "nvl(obj.object_name,'-') oname, " +
        "where  " +
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }
                dbStat.execute();


    public Collection<OracleLockItem> getLockItems(DBCSession session, Map<String, Object> options)
 * See the License for the specific language governing permissions and
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {
                }
            "wlsession.sid holding_session\n" +
        "wprocess.pid wait_pid, " +
import java.sql.SQLException;
            "' is blocking ',\n" +
                        break;
    private static final String LOCK_ITEM_QUERY_8V = "SELECT TYPE lock_type, ID1 lock_id1, ID2 lock_id2, CTIME last_convert FROM gv$lock WHERE SID =?";
        "union    " +
 * DBeaver - Universal Database Manager
            "FROM v$session\n" +
            "v$lock wlsession\n" +
    @Override
        "wsession.event, " +
 * Unless required by applicable law or agreed to in writing, software
        } catch (SQLException e) {
    private final OracleDataSource dataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (!dataSource.isAtLeastV9()) {
            "AND hlsession.id1 = wlsession.id1\n" +
    public Map<Object, OracleLock> getLocks(DBCSession session, Map<String, Object> options) throws DBException {
            "sid = wlsession.sid) holding_user,\n" +

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            "hlsession.block > 0\n" +
        "v$session wsession " +
            "FROM v$lock hlsession,\n" +

        "wsession.serial# serial, " +
                }
            if (!dataSource.isAtLeastV10()) {
                    " IMMEDIATE";
    public OracleLockManager(OracleDataSource dataSource) {
                    }
import org.jkiss.dbeaver.model.DBPDataSource;
            String sql =
        "hsession.username holding_user   " +
        "nvl(hprocess.pid,0) hold_pid, " +
        try {
        "left join v$session hsession on wsession.blocking_session = hsession.sid " +
        "left join v$process  hprocess on hprocess.addr = hsession.paddr " +
        "join v$process  wprocess on wprocess.addr = wsession.paddr " +
                    case LockGraphManager.typeHold:
 */
            Map<Object, OracleLock> locks = new HashMap<>(10);
            "WHERE\n" +
        "nvl(hsession.username,'-') holding_user   " +

        "hprocess.pid hold_pid, " +
    }
                sql = LOCK_QUERY_FOR_OLD_VERSIONS;
    @Override
        } catch (SQLException e) {


import org.jkiss.dbeaver.DBException;
        "join v$process  hprocess on hprocess.addr = hsession.paddr " +
            String sql = LOCK_ITEM_QUERY;
            "hlsession.sid waiting_session,\n" +
        "wprocess.pid wait_pid, " +


 *
                    while (dbResult.next()) {
        "wsession.blocking_session holding_session, " +
        }
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com) 

/*

                        break;
            }
            throw new DBDatabaseException(e, session.getDataSource());
            "sid = hlsession.sid) waiting_user,\n" +
        "left join dba_objects obj on obj.object_id = wsession.row_wait_obj# " +
        "wsession.sid waiting_session, " +
    }
        "v$session wsession " +
            "FROM v$session\n" +
        "wsession.username waiting_user, " +
            List<OracleLockItem> locks = new ArrayList<>();
        return dataSource;
 *

        "wsession.sid waiting_session, " +
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        throws DBException {
        "nvl(obj.object_name,'-') oname, " +
        "from " +
                        return locks;
            "WHERE\n" +
import java.util.*;

        "wsession.serial# serial, " +
        try {
        "wsession.row_wait_block# row_lock, " +
        "where  " +
        }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");

    public static final String sidWait = "wsid";
 *
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
                    case LockGraphManager.typeWait:
            throw new DBDatabaseException(e, session.getDataSource());
    @Override

                switch (otype) {
            return locks;
                String otype = (String) options.get(LockGraphManager.keyType);
            }
                    while (dbResult.next()) {
            "AND wlsession.request > 0\n" +

        "select " +
        "join v$process  wprocess on wprocess.addr = wsession.paddr " +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        "wsession.blocking_session is not NULL " +

        "from " +
    private static final String LOCK_QUERY = "select " +
            "AND hlsession.id2 = wlsession.id2";
package org.jkiss.dbeaver.ext.oracle.model.lock;
        "nvl(obj.owner,'-') owner, " +
            "WHERE\n" +
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Class<OracleLock> getLocksType() {
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    default:
 * you may not use this file except in compliance with the License.
    }
        return OracleLock.class;
    }
public class OracleLockManager extends LockGraphManager implements DBAServerLockManager<OracleLock, OracleLockItem> {
                        dbStat.setInt(1, (int) options.get(sidWait));
}





                        OracleLock l = new OracleLock(dbResult, dataSource);
        } catch (SQLException e) {

        "wsession.event, " +
        "left join dba_objects obj on obj.object_id = wsession.row_wait_obj# " +


        "nvl(wsession.blocking_session,0) holding_session, " +

        "wsession.blocking_session_status, " +
            }
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(sql)) {

 * You may obtain a copy of the License at
    public DBPDataSource getDataSource() {
                "ALTER SYSTEM KILL SESSION " + "'" + lock.getWait_sid() + ',' + lock.getSerial() + "'" +

 * limitations under the License.
import org.jkiss.dbeaver.DBDatabaseException;
        "join v$session hsession on wsession.blocking_session = hsession.sid " +
    public void alterSession(DBCSession session, OracleLock lock, Map<String, Object> options) throws DBException {
                        locks.put(l.getId(), l);
        "wsession.sid IN (SELECT blocking_session FROM v$session)";
        try {
import org.jkiss.dbeaver.model.exec.DBCSession;
            "sid = hlsession.sid) serial,\n" +
    }
            throw new DBDatabaseException(e, session.getDataSource());
            super.buildGraphs(locks);
                        dbStat.setInt(1, (int) options.get(sidHold));




    private static final String LOCK_ITEM_QUERY = "select lock_type,mode_held,mode_requested,lock_id1,lock_id2,last_convert,blocking_others from dba_lock where session_id = ?";

            "(SELECT SERIAL#\n" +
            "FROM v$session\n" +

        "wsession.blocking_session_status, " +
                        locks.add(new OracleLockItem(dbResult));
        "wsession.username waiting_user, " +
                    }

