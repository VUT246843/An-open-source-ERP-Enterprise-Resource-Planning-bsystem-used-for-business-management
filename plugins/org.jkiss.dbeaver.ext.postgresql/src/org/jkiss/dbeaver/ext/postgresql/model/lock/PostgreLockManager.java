                " where"+
            Map<Object, PostgreLock> locks = new HashMap<>(10);
                   " real_locks.blocking_pid = root_quest.blocking_pid "
 * distributed under the License is distributed on an "AS IS" BASIS,
                        dbStat.setInt(1, (int) options.get(pidWait));
            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(LOCK_QUERY)) {
        "with locks as ( "+
                "from (values "+
            " select"+
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        locks.put(l.getId(), l);
			" coalesce(lock.relation::regclass::varchar,'') as relation, "+
                 "  real_locks"+
              "     blocking_user, "+
 * 				 2017 Dmitriy.Gurov (dvgurov@gmail.com) 
    }


            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement(LOCK_ITEM_QUERY)) {

    }

                       "('ShareUpdateExclusiveLock','ShareUpdateExclusiveLock',1), ('ShareUpdateExclusiveLock','ShareLock',2),  ('ShareUpdateExclusiveLock','ShareRowExclusiveLock',3), ('ShareUpdateExclusiveLock','ExclusiveLock', 4), ('ShareUpdateExclusiveLock','AccessExclusiveLock',5), "+
                     "pg_locks "+

            throw new DBDatabaseException(e, session.getDataSource());
import org.jkiss.dbeaver.DBDatabaseException;
        "join pg_catalog.pg_stat_activity blocking_activity  ON blocking_activity.pid = la.blocked "+
			" lock.page as page, "+


    public DBPDataSource getDataSource() {
/**
                }
        try {

 */

    @Override

			" coalesce(lock.mode,'') as mode, "+
    public PostgreLockManager(PostgreDataSource dataSource) {
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

                    case LockGraphManager.typeWait:
            " select blocked_pid, "+
               " select blocked_pid from real_locks ) "+
 *
        "row_number() over(partition by l.pid order by c.prt) rid "+
import org.jkiss.dbeaver.DBException;
			"  lock.pid = ? ";

                       "('RowShareLock','ExclusiveLock',1), ('RowShareLock','AccessExclusiveLock',2),        "+
                "select "+
        try {
			" lock.pid as pid, "+

                   ") as t (mode1,mode2,prt)     "+
 * you may not use this file except in compliance with the License.
                       "('AccessExclusiveLock','AccessShareLock',1), ('AccessExclusiveLock','RowShareLock',2), ('AccessExclusiveLock','RowExclusiveLock',3), ('AccessExclusiveLock','ShareUpdateExclusiveLock',4),   ('AccessExclusiveLock','ShareLock',5), ('AccessExclusiveLock','ShareRowExclusiveLock',6), ('AccessExclusiveLock','ExclusiveLock',7),  ('AccessExclusiveLock','AccessExclusiveLock',8) "+
 */
                        break;
        "join pg_catalog.pg_stat_activity blocked_activity  ON blocked_activity.pid = la.pid "+

            throw new DBDatabaseException(e, session.getDataSource());
			" coalesce(lock.transactionid::varchar,'') as tid, "+
                        dbStat.setInt(1, (int) options.get(pidHold));


            try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement("SELECT pg_catalog.pg_terminate_backend(?)")) {
    }
import org.jkiss.dbeaver.model.exec.DBCSession;

    @Override
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
            super.buildGraphs(locks);
        ") la "+
											;
                        PostgreLock l = new PostgreLock(dbResult);
			" coalesce(db.datname,'') as datname, "+
        "	select 				 "+
                String otype = (String) options.get(LockGraphManager.keyType);
            ", root_quest as ( "+
 * Postgres lock manager
    @Override
                dbStat.execute();
                    default:
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphManager;
        "select 	  "+
            "       blocked_user, "+
			" where  "+
            return locks;
        "c.mode2, "+

        "locks l "+
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                }
 * See the License for the specific language governing permissions and
/*
                       "('RowExclusiveLock','ShareLock', 1), ('RowExclusiveLock','ShareRowExclusiveLock',2),  ('RowExclusiveLock','ExclusiveLock',3), ('RowExclusiveLock','AccessExclusiveLock',4), "+
             "      blocking_pid, "+
        } catch (SQLException e) {

        "c.prt, "+
                       "('AccessShareLock','AccessExclusiveLock',1), "+
                                  "coalesce(l2.tid::text,'*') ||':'|| coalesce(l2.relation::text,'*') ||':'|| coalesce(l2.page::text,'*') ||':'|| coalesce(l2.tuple::text,'*') "+
            "   select blocking_pid as blocking_pid from real_locks "+
        "blocking_activity.query   AS statement_in "+

    }

public class PostgreLockManager extends LockGraphManager implements DBAServerLockManager<PostgreLock,PostgreLockItem> {
        "blocked_activity.query    AS blocked_statement, "+
               "    blocked_statement, "+
	public static final String LOCK_ITEM_QUERY = "select "+
			" coalesce(lock.locktype,'') as locktype, "+
        "where la.rid = 1) "+

                " from"+
        "blocked_activity.usename  AS blocked_user, "+
        "l.*, "+
 * Licensed under the Apache License, Version 2.0 (the "License");

                    case LockGraphManager.typeHold:
        "conflict as ( "+
			"     on db.oid = lock.database "+

			"   left join pg_catalog.pg_database db "+
        }
        "where not l.granted "+
                     "pid,locktype, mode,granted,transactionid tid,relation,page,tuple "+

import org.jkiss.dbeaver.model.DBPDataSource;
                    while (dbResult.next()) {
        "la.pid as blocked_pid, "+
        throws DBException {
    private final PostgreDataSource dataSource;

                    }
                        return locks;
                switch (otype) {
    public static final String pidWait = "wpid";
			" lock.tuple as tuple, "+
                    }

                   " root_quest "+
                       "('ShareRowExclusiveLock','RowExclusiveLock', 1),  ('ShareRowExclusiveLock','ShareUpdateExclusiveLock',    2),  ('ShareRowExclusiveLock','ShareLock',    3),  ('ShareRowExclusiveLock','ShareRowExclusiveLock',4),  ('ShareRowExclusiveLock','ExclusiveLock',5),  ('ShareRowExclusiveLock','AccessExclusiveLock', 6), "+
}
    public Class<PostgreLock> getLocksType() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                       "('ExclusiveLock','RowShareLock',1), ('ExclusiveLock','RowExclusiveLock',2), ('ExclusiveLock','ShareUpdateExclusiveLock',3),  ('ExclusiveLock','ShareLock',4),  ('ExclusiveLock','ShareRowExclusiveLock',5),   ('ExclusiveLock','ExclusiveLock',6),   ('ExclusiveLock','AccessExclusiveLock',7), "+
    public void alterSession(DBCSession session, PostgreLock lock, Map<String, Object> options) throws DBException {
    }
        ")	  "+
 * Unless required by applicable law or agreed to in writing, software
    public Map<Object, PostgreLock> getLocks(DBCSession session, Map<String, Object> options) throws DBException {


        this.dataSource = dataSource;
                    "select  "+
 * You may obtain a copy of the License at
                 "*  "+
                   " real_locks.blocking_pid, "+
 *
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        "join locks l2 on l2.locktype = l.locktype and l2.mode = c.mode2 and l2.granted and l.pid != l2.pid and  "+
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    public static final String pidHold = "hpid";
 * limitations under the License.
                   " real_locks, "+
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

			" lock.granted"+
            }
        return dataSource;
                        locks.add(new PostgreLockItem(dbResult));
            return locks;
               " except "+
                   " real_locks.statement_in, "+
        "join conflict c on l.mode = c.mode1 "+
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com)
            }
import java.util.*;
                   " real_locks.blocking_user, "+
        }
    @Override

                        break;
                   " null::text "+
        }

        ",real_locks as ("+
            }
                    "from "+
                "   statement_in "+
package org.jkiss.dbeaver.ext.postgresql.model.lock;
        } catch (SQLException e) {
        return PostgreLock.class;

    @Override
            List<PostgreLockItem> locks = new ArrayList<>();

                    while (dbResult.next()) {
                   " null::text, "+

                dbStat.setInt(1, lock.getWait_pid());
        "l2.pid blocked, "+
                " from"+
                   " null::integer, "+
        "from   "+
			" from pg_catalog.pg_locks lock "+
         "), "+
            " union"+
        "la.blocked     AS blocking_pid, "+
            throw new DBDatabaseException(e, session.getDataSource());
                       "('ShareLock','RowExclusiveLock',1),  ('ShareLock','ShareUpdateExclusiveLock',2),  ('ShareLock','ShareRowExclusiveLock',3),  ('ShareLock','ExclusiveLock',4),	   ('ShareLock','AccessExclusiveLock',5), "+
 *
        "( "+
	public static final String LOCK_QUERY =
        } catch (SQLException e) {
        "from  "+
                                  "coalesce(l.tid::text,'*') ||':'|| coalesce(l.relation::text,'*') ||':'|| coalesce(l.page::text,'*') ||':'|| coalesce(l.tuple::text,'*') = "+
    public Collection<PostgreLockItem> getLockItems(DBCSession session, Map<String, Object> options)
        "blocking_activity.usename AS blocking_user, "+
        try {
