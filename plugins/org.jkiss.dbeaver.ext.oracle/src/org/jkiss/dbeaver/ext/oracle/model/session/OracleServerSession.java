    @Property(category = CAT_SESSION, order = 10)
    public String getProcess() {
    private String schema;
 * you may not use this file except in compliance with the License.
    public int hashCode() {
    @Property(category = CAT_PROCESS, viewable = true, order = 32)
        return elapsedTime;
    }
    }


    }
    }
        if (this == o) return true;
    }
    @Property(category = CAT_SQL, order = 22) // SergDzh: to show in list
    public String getSchema() {
    }

    private String state;
    @Property(category = CAT_SESSION, order = 11)
    @Property(category = CAT_SQL, order = 21)
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getEvent() {
    private long instId;
        return consistentGets;
        this.sqlId = JDBCUtils.safeGetString(dbResult, "SQL_ID");
    public String toString() {
        this.consistentChanges = JDBCUtils.safeGetLong(dbResult, "CONSISTENT_CHANGES");
    //private final long statCPU;

    public long getBlockChanges() {
    }
    @Override
    public String getActiveQuery() {
    @Override
    }
    private Timestamp logonTime;
        if (instId != 0 && instId != 1) {

    public OracleServerSession(ResultSet dbResult) {
    public Object getActiveQueryId() {
    public static final String CAT_SQL = "SQL";

        OracleServerSession that = (OracleServerSession) o;
        this.sqlChildNumber = JDBCUtils.safeGetLong(dbResult, "SQL_CHILD_NUMBER");
    }
        this.physicalReads = JDBCUtils.safeGetLong(dbResult, "PHYSICAL_READS");
 *
    //    @Property(category = CAT_STAT, viewable = false, order = 80)
    @Property(category = CAT_SESSION, viewable = true, order = 4)
        this.user = JDBCUtils.safeGetString(dbResult, "USERNAME");
    public String getSqlId() {
}
    @Override

    }
        this.logonTime = JDBCUtils.safeGetTimestamp(dbResult, "LOGON_TIME");
        this.blockChanges = JDBCUtils.safeGetLong(dbResult, "BLOCK_CHANGES");
        return sql;
        return module;

    private String module;
    private long serial;
    public long getBlockGets() {
    public boolean equals(Object o) {

        this.clientInfo = JDBCUtils.safeGetString(dbResult, "CLIENT_INFO");
    private String remoteProgram;
        return state;

    }


 * Session
    @Property(category = CAT_WAIT, viewable = true, order = 42)
        this.type = JDBCUtils.safeGetString(dbResult, "TYPE");
        this.serviceName = JDBCUtils.safeGetString(dbResult, "SERVICE_NAME");
    @Property(category = CAT_PROCESS, viewable = true, order = 31)
        this.server = JDBCUtils.safeGetString(dbResult, "SERVER");
        return Objects.hash(sid, event);
        return process;

    public long getConsistentChanges() {
    @Property(category = CAT_SESSION, viewable = false, order = 3)
    }
            sessionId += ",@" + instId;
    private String status;
    private String sqlId;
    private String sql;

import org.jkiss.dbeaver.model.admin.sessions.AbstractServerSession;
    @Override
    }
    public String getState() {
    public String getRemoteUser() {
        return logonTime;
    }
    }
    }

 * Unless required by applicable law or agreed to in writing, software

    }

    }

    @Property(category = CAT_SESSION, viewable = true, order = 7)
    @Property(category = CAT_IO, viewable = false, order = 70)
        return serviceName;
    }

        this.schema = JDBCUtils.safeGetString(dbResult, "SCHEMANAME");
        return serial;
    public long getPhysicalReads() {
        return blockGets;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    }
        return remoteHost;
    }
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
    }
        this.state = JDBCUtils.safeGetString(dbResult, "STATE");
    public String getModule() {

import java.sql.Timestamp;
    private final long blockGets;
    private long elapsedTime;
    public String getRemoteHost() {
    public static final String CAT_PROCESS = "Process";

    private String user;
    @Property(category = CAT_WAIT, viewable = true, order = 41)
        return schema;
    @Property(category = CAT_IO, viewable = false, order = 70)

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        return sid;
    public static final String CAT_WAIT = "Wait";
        this.remoteHost = JDBCUtils.safeGetString(dbResult, "MACHINE");
    }
 * You may obtain a copy of the License at

/**
        return secondsInWait;
    public String getServer() {

    private final String clientInfo;
    private long secondsInWait;

        return sqlChildNumber;
        this.sql = JDBCUtils.safeGetString(dbResult, "SQL_FULLTEXT");
    public static final String CAT_SESSION = "Session";
 * See the License for the specific language governing permissions and
    }
        return action;
    @Property(category = CAT_SESSION, viewable = true, order = 9)

 * DBeaver - Universal Database Manager

    public long getInstId() {
    }
 *
    }

public class OracleServerSession extends AbstractServerSession {
        this.event = JDBCUtils.safeGetString(dbResult, "EVENT");
        return sql;
    }
    @Property(category = CAT_PROCESS, viewable = false, order = 32)
        return user;
        this.remoteUser = JDBCUtils.safeGetString(dbResult, "OSUSER");
    @Property(category = CAT_IO, viewable = false, order = 70)
    @Property(category = CAT_PROCESS, viewable = false, order = 32)
    @Override
    public long getSecondsInWait() {
        this.serial = JDBCUtils.safeGetLong(dbResult, "SERIAL#");
    public Timestamp getLogonTime() {



import java.util.Objects;
    public long getConsistentGets() {
    public long getElapsedTime() {
        return sid == that.sid && Objects.equals(event, that.event);
    public String getServiceName() {
//    }

    private String type;

import java.sql.ResultSet;

        return server;
    private String remoteHost;
        this.remoteProgram = JDBCUtils.safeGetString(dbResult, "PROGRAM");
        return sqlId;
    private final long blockChanges;
    public String getType() {

    private String remoteUser;
    private String server;
 */
    private final long consistentChanges;

    private final long consistentGets;
        this.consistentGets = JDBCUtils.safeGetLong(dbResult, "CONSISTENT_GETS");
    }
        this.elapsedTime = JDBCUtils.safeGetLong(dbResult, "LAST_CALL_ET");
    public long getSerial() {
        return sessionId;
        }
    @Property(category = CAT_PROCESS, viewable = true, order = 30)
    }
/*
        return physicalReads;
        this.action = JDBCUtils.safeGetString(dbResult, "ACTION");
        return blockChanges;
        return status;
    }
    public String getClientInfo() {
        if (o == null || getClass() != o.getClass()) return false;
        return sqlId;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private String serviceName;


    @Property(category = CAT_SESSION, viewable = false, order = 1)
    public long getSqlChildNumber() {
        return clientInfo;
    public String getSessionId() {
    @Property(category = CAT_IO, viewable = false, order = 70)
//    public long getStatCPU() {
    @Property(category = CAT_PROCESS, viewable = true, order = 30)
    private final long sid;
 */
    @Property(category = CAT_SESSION, viewable = true, order = 2)
        return instId;
        return sid + " - " + event;
    public long getSid() {

    private final String process;

    }
        return event;
//        return statCPU;
    }

    @Property(category = CAT_SESSION, viewable = true, order = 8)
        this.sid = JDBCUtils.safeGetLong(dbResult, "SID");
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return remoteUser;

    private final long physicalReads;
    public String getSql() {
    private final String action;
    }
    @Override
    @Property(category = CAT_SESSION, viewable = true, order = 5)
 * distributed under the License is distributed on an "AS IS" BASIS,
    private long sqlChildNumber; // SergDzh: to show in list
    public String getStatus() {
        //this.statCPU = JDBCUtils.safeGetLong(dbResult, "STAT_CPU") * 10;

    @Property(category = CAT_PROCESS, viewable = false, order = 32)
    @Property(category = CAT_PROCESS, viewable = false, order = 32)
    public String getUser() {
    @Property(category = CAT_SQL, order = 20)
import org.jkiss.dbeaver.model.meta.Property;


        this.module = JDBCUtils.safeGetString(dbResult, "MODULE");
    @Property(category = CAT_SESSION, viewable = true, order = 6)
        return remoteProgram;
    }
        this.secondsInWait = JDBCUtils.safeGetLong(dbResult, "SECONDS_IN_WAIT");
    private final String event;


 *
package org.jkiss.dbeaver.ext.oracle.model.session;
        return type;
        this.blockGets = JDBCUtils.safeGetLong(dbResult, "BLOCK_GETS");
        this.instId = JDBCUtils.safeGetLong(dbResult, "INST_ID");

        return consistentChanges;
    public static final String CAT_IO = "IO";

        this.process = JDBCUtils.safeGetString(dbResult, "PROCESS");
        this.status = JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_STATUS);
    public String getAction() {
    @Property(category = CAT_IO, viewable = false, order = 70)
        String sessionId = sid + "," + serial;
    public String getRemoteProgram() {


