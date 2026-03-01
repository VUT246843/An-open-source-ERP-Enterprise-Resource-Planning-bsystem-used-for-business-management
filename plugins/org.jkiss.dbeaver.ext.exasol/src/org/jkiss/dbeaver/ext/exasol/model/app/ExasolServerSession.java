        return encrypted;
    }
        this.encrypted = JDBCUtils.safeGetBoolean(dbResult, "ENCRYPTED");
            return null;
 * You may obtain a copy of the License at
public class ExasolServerSession extends AbstractServerSession {
        return loginTime;


    private final BigDecimal sessionID;
    @Override
    private String driver;
    }
    public String getScopeSchema() {
        this.loginTime = JDBCUtils.safeGetTimestamp(dbResult, "LOGIN_TIME");
    }
    private Integer stmtId;
    }
    @Property(viewable = true, editable = false, order = 17)
        return commandName;
package org.jkiss.dbeaver.ext.exasol.model.app;
        this.osUser = JDBCUtils.safeGetString(dbResult, "OS_USER");
import java.util.Objects;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public ExasolServerSession(ResultSet dbResult) {
    public String getDriver() {
    @Override

    private BigDecimal tempDbRam;
    @Property(viewable = true, editable = false, order = 2)
        return tempDbRam;
import java.sql.Timestamp;
    @Override
        return status;
        if (o == null || getClass() != o.getClass()) return false;
    }

    public String getActiveQuery() {
    @Property(viewable = true, editable = false, order = 7)
        if (this == o) return true;
/*
 *
        this.commandName = JDBCUtils.safeGetString(dbResult, "COMMAND_NAME");
 * @author Karl Griesser
import java.sql.ResultSet;
        return stmtId;
    @Property(viewable = true, editable = false, order = 9)
        this.driver = JDBCUtils.safeGetString(dbResult, "DRIVER");
        return osUser;
        return activity;
    @Property(viewable = true, editable = false, order = 19)
    private String Duration;

    public Boolean getNice() {
    }
    }
    public String getOsName() {
    }
    @Property(viewable = true, editable = false, order = 4)
    public String getSqlText() {
        this.tempDbRam = JDBCUtils.safeGetBigDecimal(dbResult, "TEMP_DB_RAM");
    public String getClient() {
    }
    }
import org.jkiss.code.Nullable;
        return sessionID != null && sessionID.compareTo(that.sessionID) == 0;
        return String.valueOf(sessionID);
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

    public String getSessionId() {

    private String osUser;
    public BigDecimal getTempDbRam() {

    public String getPriority() {
    private String commandName;
    public BigDecimal getSessionID() {
        this.client = JDBCUtils.safeGetString(dbResult, "CLIENT");
    public Integer getQueryTimeout() {
    private Integer resources;
    @Property(viewable = true, editable = false, order = 6)
        this.sqlText = JDBCUtils.safeGetString(dbResult, "SQL_TEXT");
        return host;
        this.queryTimeout = JDBCUtils.safeGetInteger(dbResult, "QUERY_TIMEOUT");
        return sqlText;
 */
        return resources;

        return driver;
    @Property(viewable = true, editable = false, order = 20)
        return client;
    @Property(viewable = true, editable = false, order = 14)

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.host = JDBCUtils.safeGetString(dbResult, "HOST");
    @Property(viewable = true, editable = false, order = 10)
    @Property(viewable = true, editable = false, order = 3)
import org.jkiss.dbeaver.model.admin.sessions.AbstractServerSession;
        if ("IDLE".equals(status)) { //$NON-NLS-1$

    public String getCommandName() {
    public String getOsUser() {
    }

    private String sqlText;


        return osName;
 * See the License for the specific language governing permissions and
    }
 *
    public String getHost() {

    @Property(viewable = true, editable = false, order = 8)
    private Boolean nice;



    }
import java.math.BigDecimal;
    public Boolean getEncrypted() {
    private String userName;
    @Property(viewable = true, editable = false, order = 1)
    @Property(viewable = true, editable = false, order = 18)
    public String getDuration() {
        this.resources = JDBCUtils.safeGetInteger(dbResult, "RESOURCES");
        return sessionID;
        this.nice = JDBCUtils.safeGetBoolean(dbResult, "NICE");
    }
        return nice;
    private String client;
    private String activity;
    }
        return Duration;

    @Nullable
    @Override
    private String priority;

    private String host;

 * Licensed under the Apache License, Version 2.0 (the "License");

}

        ExasolServerSession that = (ExasolServerSession) o;

    private String osName;
        this.status = JDBCUtils.safeGetString(dbResult, "STATUS");
        }
    private String scopeSchema;
    }
        this.stmtId = JDBCUtils.safeGetInteger(dbResult, "STMT_ID");

 * DBeaver - Universal Database Manager
    private Timestamp loginTime;
    private Boolean encrypted;
    private String status;
    public Timestamp getLoginTime() {
    @Override

        return userName;
    public boolean equals(Object o) {
    @Property(viewable = true, editable = false, order = 11)
        this.sessionID = JDBCUtils.safeGetBigDecimal(dbResult, "SESSION_ID");
        this.userName = JDBCUtils.safeGetString(dbResult, "USER_NAME");

    public String getActivity() {
/**
    }
        return sqlText;
    @Property(viewable = true, editable = false, order = 5)
    @Property(viewable = true, editable = false, order = 12)
    public Integer getStmtId() {
    }
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
        return priority;
    }
        return queryTimeout;
 * Unless required by applicable law or agreed to in writing, software
    }
    public String getStatus() {
        this.priority = JDBCUtils.safeGetString(dbResult, "PRIORITY");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String toString() {
    @Property(viewable = true, editable = false, order = 13)
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, editable = false, order = 2)

    }

    private Integer queryTimeout;
        return Objects.hash(sessionID);
        return this.sessionID.toString();
    public int hashCode() {
    public Integer getResources() {
        this.osName = JDBCUtils.safeGetString(dbResult, "OS_NAME");
 */
    }
        this.scopeSchema = JDBCUtils.safeGetString(dbResult, "SCOPE_SCHEMA");
    }
    @Property(viewable = true, editable = false, order = 16)
        return scopeSchema;
    }
    }

        this.activity = JDBCUtils.safeGetString(dbResult, "ACTIVITY");
    public String getUserName() {
 * you may not use this file except in compliance with the License.
        this.Duration = JDBCUtils.safeGetString(dbResult, "DURATION");
    @Property(viewable = true, editable = false, order = 15)

