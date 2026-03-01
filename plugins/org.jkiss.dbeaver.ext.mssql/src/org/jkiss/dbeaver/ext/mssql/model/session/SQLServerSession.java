

    @Override
    public long getMemoryUsage() {
        rowCount = JDBCUtils.safeGetLong(dbResult, "row_count");
    }
    @Property(viewable = false, category = CAT_TIMING, order = 12)

    public int hashCode() {
    }
    public String getHostName() {
}
    private long cpuTime;
    private String hostName;
    @Property(viewable = false, category = DBConstants.CAT_STATISTICS, order = 46)
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Property(viewable = true, order = 1)
import java.util.Date;
        hostName = JDBCUtils.safeGetString(dbResult, "host_name");
        return id;
        return command;
 *
    }

 */
    @Override

    public String getClientInterface() {

    public String getSessionId() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public boolean equals(Object o) {
        return databaseName;
    public long getTotalElapsedTime() {
    private long writesNum;
    @Property(viewable = true, category = DBConstants.CAT_STATISTICS, order = 40)
    private String clientInterface;

    private Date lastRequestStart;
        return ntDomain;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false, order = 9)

    @Property(viewable = true, category = CAT_CLIENT, order = 22)
    @Property(viewable = false, category = CAT_CLIENT, order = 31)
    private String ntDomain;
            return String.valueOf(id);
    }

        ntUserName = JDBCUtils.safeGetString(dbResult, "nt_user_name");
    }
    }
        return lastRequestEnd;
        return readsNum;


    @Property(viewable = false, category = CAT_CLIENT, order = 20)
    @Property(viewable = true, category = DBConstants.CAT_STATISTICS, order = 44)
        programName = JDBCUtils.safeGetString(dbResult, "program_name");
import java.sql.ResultSet;
    @Property(viewable = true, category = CAT_CLIENT, order = 26)

 * DBeaver - Universal Database Manager
        return cpuTime;
        return clientInterface;
    }

    @Property(viewable = false, category = CAT_CLIENT, order = 32)
    }

        return loginName;
    @Property(viewable = true, order = 6)
        ntDomain = JDBCUtils.safeGetString(dbResult, "nt_domain");
public class SQLServerSession extends AbstractServerSession {
        return totalElapsedTime;
    private final long id;
        command = JDBCUtils.safeGetString(dbResult, "command");
    public String getActiveQuery()
    private long readsNum;
    @Property(viewable = false, category = CAT_TIMING, order = 11)
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final String CAT_TIMING = "Timings";
        memoryUsage = JDBCUtils.safeGetLong(dbResult, "memory_usage");
    @Property(viewable = true, category = DBConstants.CAT_STATISTICS, order = 45)
    @Property(viewable = true, category = CAT_CLIENT, order = 25)
    private long totalElapsedTime;

    }
        hostPID = JDBCUtils.safeGetString(dbResult, "host_process_id");


        return clientVersion;
    @Property(viewable = false, category = DBConstants.CAT_STATISTICS, order = 42)
        lastRequestStart = JDBCUtils.safeGetTimestamp(dbResult, "last_request_start_time");
        return memoryUsage;
    @Property(viewable = false, category = CAT_CLIENT, order = 24)
    private final String databaseName;
            return id + "@" + databaseName;
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.id = JDBCUtils.safeGetInt(dbResult, "session_id");
    }
    public String toString()
        language = JDBCUtils.safeGetString(dbResult, "language");
        return ntUserName;
        return totalScheduledTime;
package org.jkiss.dbeaver.ext.mssql.model.session;
    private String clientVersion;
        sqlText = JDBCUtils.safeGetString(dbResult, "sql_text");
        if (this == o) return true;
    @Override
    }
    private static final String CAT_CLIENT = "Client";
    @Property(viewable = false, category = DBConstants.CAT_STATISTICS, order = 43)
        cpuTime = JDBCUtils.safeGetLong(dbResult, "cpu_time");
    public String getClientVersion() {
    }
        return String.valueOf(id);
    }

    private String language;
    @Property(viewable = false, category = CAT_CLIENT, order = 5)

    public String getLoginName() {
    public String getStatus() {
 * SQL Server session
 * limitations under the License.

        totalElapsedTime = JDBCUtils.safeGetLong(dbResult, "total_elapsed_time");
        if (o == null || getClass() != o.getClass()) return false;
 *
        status = JDBCUtils.safeGetString(dbResult, "status");
 * you may not use this file except in compliance with the License.

        totalScheduledTime = JDBCUtils.safeGetLong(dbResult, "total_scheduled_time");
    public long getReadsNum() {
import org.jkiss.dbeaver.model.DBConstants;
    {

        return Objects.hash(id, databaseName);
    }
    public String getLanguage() {

        if (databaseName != null) {

    }


        return hostPID;
        writesNum = JDBCUtils.safeGetLong(dbResult, "writes");

 */
    @Property(viewable = false, category = CAT_CLIENT, order = 27)

    public String getProgramName() {
    public long getRowCount() {
        return writesNum;
    }

    @Property(viewable = false, category = CAT_CLIENT, order = 23)
    public String getCommand() {
        return loginTime;
        return language;
    @Property(viewable = true, category = CAT_CLIENT, order = 21)
    private String status;
    public long getId() {

import java.util.Objects;
    private long memoryUsage;
        clientVersion = JDBCUtils.safeGetString(dbResult, "client_version");
        loginTime = JDBCUtils.safeGetTimestamp(dbResult, "login_time");;


        } else {
    private Date loginTime;
        databaseName = JDBCUtils.safeGetString(dbResult, "database_name");
    private String loginName;

    @Override
        return hostName;
    }
        lastRequestEnd = JDBCUtils.safeGetTimestamp(dbResult, "last_request_end_time");
    public String getNtUserName() {

    public Date getLoginTime() {
/*
        return sqlText;


    private String programName;
    }
    public long getCpuTime() {
    }
    private String sqlText;
    }
    {
    public Date getLastRequestEnd() {
        loginName = JDBCUtils.safeGetString(dbResult, "login_name");
        SQLServerSession that = (SQLServerSession) o;
    }
    private String hostPID;
    @Property(viewable = false, category = CAT_TIMING, order = 10)
        clientInterface = JDBCUtils.safeGetString(dbResult, "client_interface_name");
 * Unless required by applicable law or agreed to in writing, software
    public SQLServerSession(ResultSet dbResult) {
    private String command;

    private Date lastRequestEnd;
    }
/**
        return rowCount;
    private String ntUserName;

import org.jkiss.dbeaver.model.meta.Property;

        readsNum = JDBCUtils.safeGetLong(dbResult, "reads");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    private long totalScheduledTime;
    public long getTotalScheduledTime() {
        return status;
import org.jkiss.dbeaver.model.admin.sessions.AbstractServerSession;
    public long getWritesNum() {

    @Override

    public String getHostPID() {

    }
    public Date getLastRequestStart() {

    public String getDatabaseName() {
    }
 * You may obtain a copy of the License at
    @Property(viewable = true, category = DBConstants.CAT_STATISTICS, order = 41)

        return id == that.id && Objects.equals(databaseName, that.databaseName);
    }
        }
    public String getNtDomain() {
    }
    }
        return lastRequestStart;
    private long rowCount;
        return programName;
 *
