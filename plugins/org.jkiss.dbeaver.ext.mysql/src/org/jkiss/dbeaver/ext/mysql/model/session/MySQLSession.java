    public String getDb()
    private long rowsExamined;
            this.tmpTables = JDBCUtils.safeGetLong(dbResult, "tmp_tables");

 * See the License for the specific language governing permissions and
    public String getLastStatementLatency() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import java.sql.ResultSet;
        return lastStatement;
    private String lastStatementLatency;
 * Unless required by applicable law or agreed to in writing, software
        return trxState;
    }
    {
 *
    public String getCommand()

    }
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 18)
    public static class PerformanceReadingValueValidator implements IPropertyValueValidator<MySQLSession, Object> {
    public String getUser()
            this.statementLatency = JDBCUtils.safeGetString(dbResult, "statement_latency");
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 11)
 */
    }
    }
package org.jkiss.dbeaver.ext.mysql.model.session;
 *
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 22)
    @Override
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 13)
    }
    public long getRowsAffected() {
    private long progress;
    public String getLastStatement() {
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 19)
        return programName;
    {

import org.jkiss.utils.CommonUtils;
    private String fullScan;
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 10)
    }
            this.currentMemory = JDBCUtils.safeGetString(dbResult, "current_memory");
    {
/**
    }
            this.progress = JDBCUtils.safeGetLong(dbResult, "progress");
    private String source;
        return pid + "@" + db;

        this.user = JDBCUtils.safeGetString(dbResult, "user");
        this.readPerformanceStats = CommonUtils.getOption(options, MySQLSessionManager.OPTION_SHOW_PERFORMANCE);
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 15)
    public long getTime()
 * DBeaver - Universal Database Manager
        return lockLatency;

    public long getRowsExamined() {
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 16)

            this.lastStatementLatency = JDBCUtils.safeGetString(dbResult, "last_statement_latency");
        }
    public long getRowsSent() {
    }


        return info;
        this.info = JDBCUtils.safeGetString(dbResult, "info");
        return currentMemory;
    public long getTmpDiskTables() {
    }
import org.jkiss.dbeaver.model.meta.Property;
    private String user;

    public int hashCode() {
        return rowsExamined;
/*
    public String getTrxAutocommit() {
    private String state;
            this.lastStatement = JDBCUtils.safeGetString(dbResult, "last_statement");
    @Property(viewable = true, order = 3)
    @Property(viewable = true, order = 4)
}
    private boolean isReadPerformanceStats() {
 * You may obtain a copy of the License at
    @Override
        return db;
    public String getLockLatency() {
public class MySQLSession extends AbstractServerSession {
        MySQLSession that = (MySQLSession) o;
        return lastStatementLatency;
    private long time;
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 14)
        return statementLatency;

    @Override
        return tmpTables;

    }
    }
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 9)
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 25)
    private String currentMemory;
    private final long pid;
    private long tmpDiskTables;
        return host;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
        return String.valueOf(pid);
        if (o == null || getClass() != o.getClass()) return false;
            this.trxAutocommit = JDBCUtils.safeGetString(dbResult, "trx_autocommit");
    public boolean equals(Object o) {
    public String getState()
import org.jkiss.code.Nullable;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        return user;
            this.fullScan = JDBCUtils.safeGetString(dbResult, "full_scan");
    public String getProgramName() {
    public String getCurrentMemory() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String statementLatency;

        return pid;
 */
        this.command = JDBCUtils.safeGetString(dbResult, "command");
 * limitations under the License.
        return readPerformanceStats;
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 20)
    {
        return command;


import org.jkiss.code.NotNull;
        this.db = JDBCUtils.safeGetString(dbResult, "db");
        return Objects.hash(pid, db);
    }

        return tmpDiskTables;
    @Override
import java.util.Objects;
    }
    private boolean readPerformanceStats;
    private String command;
    private String programName;
    private long rowsSent;
    public String getTrxLatency() {
    private long rowsAffected;
            this.source = JDBCUtils.safeGetString(dbResult, "source");
    public long getProgress() {
    }

        }
    private final String db;



    }
    @Property(viewable = true, order = 7)
    public String toString()
        return source;

    }
    {
    }
    {

    private String host;

    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 21)
import java.util.Map;
            return session.isReadPerformanceStats();
    @Property(viewable = true, order = 8)
    public String getHost()
 *     http://www.apache.org/licenses/LICENSE-2.0
        return trxAutocommit;
            this.tmpDiskTables = JDBCUtils.safeGetLong(dbResult, "tmp_disk_tables");
        @Override

    private String trxLatency;
 * you may not use this file except in compliance with the License.
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 17)
    }

    public String getTrxState() {

    private String trxAutocommit;
        this.pid = JDBCUtils.safeGetLong(dbResult, "id");
            this.rowsSent = JDBCUtils.safeGetLong(dbResult, "rows_sent");
    {
    @Property(viewable = true, order = 6)


    static final String CAT_PERFORMANCE = "Performance";
    {
        this.time = JDBCUtils.safeGetLong(dbResult, "time");
 * MySQL session
        this.state = JDBCUtils.safeGetString(dbResult, "state");
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 12)
        return progress;
            this.lockLatency = JDBCUtils.safeGetString(dbResult, "lock_latency");
    public long getTmpTables() {
        return trxLatency;
    private String lockLatency;
    }
    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 24)
    }

    }

    public String getStatementLatency() {
    }
        if (this == o) return true;
    }
    private long tmpTables;
        this.host = JDBCUtils.safeGetString(dbResult, "host");
    }
    {
            this.trxLatency = JDBCUtils.safeGetString(dbResult, "trx_latency");
    }
        return rowsSent;
            this.rowsAffected = JDBCUtils.safeGetLong(dbResult, "rows_affected");

    private String trxState;

    }
            this.programName = JDBCUtils.safeGetString(dbResult, "program_name");
        return time;
    public long getPid()
        return fullScan;
    }
        return rowsAffected;
    }
        return state;

    public String getSource() {


    @Property(category = CAT_PERFORMANCE, visibleIf = PerformanceReadingValueValidator.class, order = 23)
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
    }
            this.trxState = JDBCUtils.safeGetString(dbResult, "trx_state");

    @Property(viewable = true, order = 5)
        return pid == that.pid && Objects.equals(db, that.db);

import org.jkiss.dbeaver.model.admin.sessions.AbstractServerSession;
    public String getFullScan() {
    public String getActiveQuery()


            this.rowsExamined = JDBCUtils.safeGetLong(dbResult, "rows_examined");

    private String info;
    @Override
        public boolean isValidValue(@NotNull MySQLSession session, @Nullable Object value) throws IllegalArgumentException {
    @Property(viewable = true, order = 2)
    @Property(viewable = true, order = 1)
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getSessionId() {
    private String lastStatement;
        if (readPerformanceStats) {
    }
    public MySQLSession(ResultSet dbResult, Map<String, Object> options) {
