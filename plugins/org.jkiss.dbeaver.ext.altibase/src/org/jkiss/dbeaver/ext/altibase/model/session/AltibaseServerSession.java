
    public String getLoginTime() {

    @Property(category = CAT_SQL, viewable = true, order = 4)
 * you may not use this file except in compliance with the License.

    @Override
    private String queryTimeLimit;
    public static final String CAT_SQL = "SQL";



        return false;
            return true;

    public int hashCode() {

    public String getLockType() {
        return utransTimeLimit;
        }
    private String sessionId;
    public String getLockTarget() {
    private String nlsTerritory;
        this.commName           = JDBCUtils.safeGetString(dbResult, "comm_name");
        return idleTimeLimit;
    }
    private String clientType;
        return queryTimeLimit;
        return (qry.length() > 0 ? qry + "..." : "");
        return ddlTimeLimit;
    @Override
    public String getQueryTimeLimit() {
        this.ddlTimeLimit       = JDBCUtils.safeGetString(dbResult, "DDL_TIME_LIMIT");

    @Property(category = CAT_WAIT, viewable = true, order = 22)
    }
    public String getTimeZone() {

        this.idleTimeLimit      = JDBCUtils.safeGetString(dbResult, "IDLE_TIME_LIMIT");
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            qry = qry.replaceAll("[\\n\\t]", " ");
    @Property(category = CAT_TIMEOUT, viewable = true, order = 41)
    private String lockType;
 *

        this.stmtId             = JDBCUtils.safeGetString(dbResult, "stmt_id");
    @Property(category = CAT_SESSION, viewable = true, order = 11)
        return txId;
    }
        return stmtId;
    @Property(category = CAT_SESSION, viewable = true, order = 7)
    public String toString() {
            }

    }
    public static final String CAT_TIMEOUT = "Timeout";
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getLockStatus() {
}
    private String loginIdleSince;
        return nlsTerritory;
    private String clientAppInfo;
        this.loginIdleSince     = JDBCUtils.safeGetString(dbResult, "idle_since");

    private String utransTimeLimit;
 */
    @Property(category = CAT_SESSION, viewable = true, order = 3)
        this.utransTimeLimit    = JDBCUtils.safeGetString(dbResult, "UTRANS_TIME_LIMIT");
        this.clientProtocolVersion = JDBCUtils.safeGetString(dbResult, "client_protocol_version");
    }
    @Property(category = CAT_SESSION, viewable = true, order = 2)
        this.clientPid          = JDBCUtils.safeGetString(dbResult, "client_pid");
    private String lockTarget;
        this.lockTarget         = JDBCUtils.safeGetString(dbResult, "lock_target");
        return clientPid;
        this.sysdba             = JDBCUtils.safeGetString(dbResult, "sysda");
/*





    public String getIdleSince() {
    @Override
    public String getIdleTimeLimit() {
    private String txId;
    private String autoCommit;
import java.util.Objects;
    public String getUserName() {
        }
    private String idleTimeLimit;



    public String getIsSysdba() {
            return false;
    }
    private String ddlTimeLimit;
        return lockTarget;
        return fetchTimeLimit;
    @Property(category = CAT_SESSION, viewable = true, order = 32)
 * Unless required by applicable law or agreed to in writing, software
    private String lockStatus;
        return stmtId;
    @Property(category = CAT_SESSION, viewable = true, order = 33)

        return userName;

            qry = qry.replaceAll("[ ]+",  " ");
 * Session
    }
        this.clientType         = JDBCUtils.safeGetString(dbResult, "client_type");
    }
    public String getClientProtocolVersion() {
    }
    private String sql;
 */
 * See the License for the specific language governing permissions and

        return sql;
    @Property(category = CAT_TIMEOUT, viewable = true, order = 40)
        this.queryTimeLimit     = JDBCUtils.safeGetString(dbResult, "QUERY_TIME_LIMIT");

        return loginIdleSince;
    public String getIsAutocommit() {
    }

import org.jkiss.dbeaver.model.admin.sessions.AbstractServerSession;
        this.txId               = JDBCUtils.safeGetString(dbResult, "tx_id");
    }
            if (qry.length() > effectiveLength) {
    }
        if (this == o) { 
/**

    public String getNlsTerritory() {
        return timezone;

    public String getUtransTimeLimit() {
        return sessionId;
        this.sessionId          = JDBCUtils.safeGetString(dbResult, "session_id");
    }
    private String sysdba;
            return sessionId == ((AltibaseServerSession) o).sessionId;
    public String getClientAppInfo() {

import org.jkiss.utils.CommonUtils;
    public String getSql() {

    public static final String CAT_WAIT = "Wait";
        return lockStatus;
    private String timezone;

    public String getStmtId() {
    }
        this.lockType           = JDBCUtils.safeGetString(dbResult, "lock_type");


 *
    }
    @Property(category = CAT_SESSION, viewable = true, order = 8)
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return clientType;

        int effectiveLength = 10;
    public String getDdlTimeLimit() {
        return sessionId;
        return clientAppInfo;
        this.loginTime          = JDBCUtils.safeGetString(dbResult, "login_time");
    private String clientProtocolVersion;
    public boolean equals(Object o) {
    @Property(category = CAT_SESSION, viewable = true, order = 34)
    @Property(category = CAT_SESSION, viewable = true, order = 5)
        this.clientAppInfo      = JDBCUtils.safeGetString(dbResult, "client_app_info");
    }
    @Property(category = CAT_TIMEOUT, viewable = true, order = 42)
    @Property(category = CAT_SESSION, viewable = true, order = 10)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(category = CAT_SESSION, viewable = true, order = 21)

        this.userName           = JDBCUtils.safeGetString(dbResult, "user_name");
    public String getSessionId() {
        return autoCommit;
        return lockType;
    }
        if (o instanceof AltibaseServerSession) {
        this.autoCommit         = JDBCUtils.safeGetString(dbResult, "autocommit");



    public String getClientPID() {
    private String loginTime;
    public static final String CAT_SESSION = "Session";
 * limitations under the License.
    public String getActiveQuery() {
 *
    }
    }
    


        String qry = (sql != null) ? sql.trim() : "";

import java.sql.ResultSet;

        }
        return commName;
    public AltibaseServerSession(ResultSet dbResult) {

    public String getTxId() {
    @Override
        if (o == null || getClass() != o.getClass()) { 

    private String stmtId;
        this.nlsTerritory       = JDBCUtils.safeGetString(dbResult, "NLS_TERRITORY");
    }
    }

    }
        return clientProtocolVersion;
    public String getFetchTimeLimit() {
    private String userName;
    }
 * DBeaver - Universal Database Manager
                qry = sql.trim().substring(0, 7);
        return Objects.hash(sessionId);
    }
    public Object getActiveQueryId() {
    }
    }
    @Property(category = CAT_SESSION, viewable = true, order = 6)
public class AltibaseServerSession extends AbstractServerSession {
    @Property(category = CAT_SESSION, viewable = true, order = 1)
    @Property(category = CAT_SESSION, viewable = true, order = 4)
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.timezone           = JDBCUtils.safeGetString(dbResult, "TIME_ZONE");
    public String getClientType() {

    @Property(category = CAT_TIMEOUT, viewable = true, order = 43)

    @Property(category = CAT_WAIT, viewable = true, order = 20)
    }
    }
        this.fetchTimeLimit     = JDBCUtils.safeGetString(dbResult, "FETCH_TIME_LIMIT");
 * You may obtain a copy of the License at

    private String fetchTimeLimit;
        return loginTime;
        return sysdba;
package org.jkiss.dbeaver.ext.altibase.model.session;
    private String clientPid;
    @Property(category = CAT_SESSION, viewable = true, order = 35)
    @Override
    public String getCommName() {
    }
import org.jkiss.dbeaver.model.meta.Property;
    @Property(category = CAT_SESSION, viewable = true, order = 31)
    @Property(category = CAT_TIMEOUT, viewable = true, order = 36)
        this.lockStatus         = JDBCUtils.safeGetString(dbResult, "lock_status");
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String commName;
        if (CommonUtils.isNotEmpty(qry)) {
        this.sql                = JDBCUtils.safeGetString(dbResult, "sql");
