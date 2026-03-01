    @Property(viewable = true, order = 13)



    @Property(viewable = true, order = 12)
        return lastDate;

    }
        args.add("next_date => TO_DATE(%s)".formatted(SQLUtils.quoteString(this, CommonUtils.escapeDisplayString(nextDate))));
    @Override
 * You may obtain a copy of the License at
    }
    public long getJob() {
        return OracleSourceType.JOB;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable

    @Property(viewable = true, order = 14)
    @Property(viewable = true, order = 11)
    public DBSObjectState getObjectState() {
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor) {
    @Property(viewable = true, order = 22, updatable = true)

    @NotNull
    @Override
package org.jkiss.dbeaver.ext.oracle.model;
    }
    public OracleJob(OracleSchema schema, String name) {

    }
    public Date getLastDate() {
/*

import java.util.StringJoiner;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getInterval() {
        return new DBEPersistAction[0];
    public boolean supportsCompile() {
 * you may not use this file except in compliance with the License.


        this.schemaUser = JDBCUtils.safeGetString(resultSet, "SCHEMA_USER");
    public OracleJob(@NotNull OracleSchema schema, @NotNull ResultSet resultSet) {
        this.nextDate = JDBCUtils.safeGetString(resultSet, "NEXT_DATE");
    }
        this.loginUser = JDBCUtils.safeGetString(resultSet, "LOG_USER");
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
import java.util.Map;
    private String privilegedUser;
        this.interval = interval;
        final StringJoiner args = new StringJoiner(",\n\t");
    private long instance;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
import java.util.Date;
        this.nlsEnv = JDBCUtils.safeGetString(resultSet, "NLS_ENV");
    @Nullable
        args.add("interval => " + SQLUtils.quoteString(this, CommonUtils.escapeDisplayString(interval)));
    @Nullable
              %s
public class OracleJob extends OracleSchemaObject implements OracleSourceObject {
    @Nullable
    }
        return broken ? DBSObjectState.INVALID : DBSObjectState.NORMAL;
    }
    private String loginUser;
        if (job == 0) {
        return instance;
    }
    public long getFailures() {
    private String nlsEnv;
    }
    }
        return thisDate;
    public String getTotalTime() {
              COMMIT;
        this.instance = JDBCUtils.safeGetLong(resultSet, "INSTANCE");
    @Property(viewable = true, order = 21, updatable = true, editable = true)
    }
    }
    @NotNull
import org.jkiss.dbeaver.model.meta.PropertyLength;
        super(schema, String.valueOf(JDBCUtils.safeGetInt(resultSet, "JOB")), true);
    @Nullable
    @Override
    }
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
        args.add("what => " + SQLUtils.quoteString(this, action));
import org.jkiss.dbeaver.DBException;
    private long failures;
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    public void setObjectDefinitionText(String source) {
        this.action = action;

    @Property(viewable = true, order = 15)
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    }
    }
import org.jkiss.dbeaver.model.meta.Property;
    public String getPrivilegedUser() {
    }

        this.job = JDBCUtils.safeGetLong(resultSet, "JOB");

import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 *
    public String getNlsEnv() {
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;


    private String schemaUser;
        return broken ? null : nextDate;
            """.formatted(args, brokenStatement);
    @Nullable
import org.jkiss.code.NotNull;
    public void setNlsEnv(String nlsEnv) {
    }
        return false;

        this.totalTime = JDBCUtils.safeGetLong(resultSet, "TOTAL_TIME");
                %s
    @Property(viewable = true, order = 17, updatable = true, editable = true)
        return action;

    private String nextDate;
    public Date getThisDate() {
import org.jkiss.dbeaver.utils.RuntimeUtils;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private Date lastDate;
    @Property(viewable = true, order = 18)
import java.sql.ResultSet;


        return RuntimeUtils.formatExecutionTime(totalTime);
    public void setAction(String action) {
    public long getInstance() {
        return nlsEnv;
    private long totalTime;
            return "";
        this.lastDate = JDBCUtils.safeGetTimestamp(resultSet, "LAST_DATE");
    }
        return interval;
    private long job;

    @Property(viewable = true, order = 16, updatable = true, editable = true)

    private String interval;
        String brokenStatement = String.format("DBMS_JOB.BROKEN(%s, %s);", job, broken ? "TRUE" : "FALSE");
        return privilegedUser;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }


 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObjectState;
        return job;
        this.action = JDBCUtils.safeGetString(resultSet, "WHAT");

    private Date thisDate;

import org.jkiss.dbeaver.model.exec.DBCException;
 * Copyright (C) 2010-2025 DBeaver Corp and others

              );
    @Override
        return broken;
import org.jkiss.utils.CommonUtils;
    @Override
        return schemaUser;
    private boolean broken;
    public String getAction() {
    }
        return """
    @Override

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            BEGIN

    private String action;
        this.interval = JDBCUtils.safeGetString(resultSet, "INTERVAL");
import org.jkiss.dbeaver.model.sql.SQLUtils;
    public boolean isBroken() {
        this.nlsEnv = nlsEnv;
        this.thisDate = JDBCUtils.safeGetTimestamp(resultSet, "THIS_DATE");
    public String getLoginUser() {
    public void setNextDate(String nextDate) {
    }

    }
        super(schema, name, false);

 */
        }
    public String getNextDate() {
    }
 *
    public void setBroken(boolean broken) {
        this.broken = JDBCUtils.safeGetBoolean(resultSet, "BROKEN", OracleConstants.RESULT_YES_VALUE);
            END;
    @Override
        args.add("job => " + SQLUtils.quoteString(this, name));
        this.privilegedUser = JDBCUtils.safeGetString(resultSet, "PRIV_USER");
    @Property(viewable = true, order = 23, updatable = true, editable = true, length = PropertyLength.MULTILINE)
        this.failures = JDBCUtils.safeGetLong(resultSet, "FAILURES");
        this.broken = broken;
    public String getSchemaUser() {
        return failures;
    }
              DBMS_JOB.SUBMIT(

    @Property(viewable = true, order = 20)
    }
        this.nextDate = nextDate;
        return loginUser;
    public void setInterval(String interval) {
}
    public OracleSourceType getSourceType() {
    @Property(viewable = true, order = 19)
