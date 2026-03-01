            return dbStat;
    @Property(viewable = false, order = 49)
        }
        return programName;
	private long maxFailures;
import java.sql.SQLException;
    public String getScheduleLimit() {
    public String getPriority() {
	private String scheduleLimit;
    public String getDetached() {
    public Collection<OracleSchedulerProgramArgument> getArguments(DBRProgressMonitor monitor) throws DBException
    }

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchedulerProgram program) throws SQLException
    private final ArgumentsCache argumentsCache = new ArgumentsCache();
        return detached;
        return programAction;

        detached = JDBCUtils.safeGetString(dbResult, "DETACHED");

import org.jkiss.dbeaver.DBException;

                "SELECT * FROM ALL_SCHEDULER_PROGRAM_ARGS " +
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.Association;
    @Association
 * DBeaver - Universal Database Manager
            dbStat.setString(2, program.getName());
    @Property(category = CAT_ADVANCED, viewable = false, order = 48)
import org.jkiss.code.Nullable;
        {
    }

    }
    @Nullable
 * Oracle scheduler program
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * See the License for the specific language governing permissions and

        comments = JDBCUtils.safeGetString(dbResult, "COMMENTS");
	private String detached;
	private String weight;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	private String enabled;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return comments;
        }
    public String getMaxRunDuration() {
        scheduleLimit = JDBCUtils.safeGetString(dbResult, "SCHEDULE_LIMIT");
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;

        return owner;

    @Property(viewable = true, order = 16)
    }

    @Property(viewable = false, order = 40)
	private long numberOfArguments;

	private String programType;
        @Override
 *
        {

        programName = JDBCUtils.safeGetString(dbResult, "PROGRAM_NAME");

    public long getMaxFailures() {
        return programType;
 * you may not use this file except in compliance with the License.
    @Property(viewable = true, order = 35)
    }
    }
    }
    public String getProgramAction() {


                        "ORDER BY ARGUMENT_POSITION");
            JDBCPreparedStatement dbStat = session.prepareStatement(

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
        maxRunDuration = JDBCUtils.safeGetString(dbResult, "MAX_RUN_DURATION");
    }
        return maxFailures;
    public long getNumberOfArguments() {
import java.util.Collection;

        return maxRuns;
        @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.ResultSet;
 */
    public String getWeight() {
        priority = JDBCUtils.safeGetString(dbResult, "PRIORITY");
    }

    OracleSchedulerProgram(OracleSchema schema, ResultSet dbResult) {
    }
}
        return scheduleLimit;
        maxRuns = JDBCUtils.safeGetLong(dbResult, "MAX_RUNS");
    private String comments;
    }
                        "WHERE OWNER=? AND PROGRAM_NAME=? " +
        return numberOfArguments;

        return priority;
    @Override
        nlsEnv = JDBCUtils.safeGetString(dbResult, "NLS_ENV");
import org.jkiss.dbeaver.model.meta.Property;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public String getOwner() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
/*
    @Property(viewable = true, order = 48)
    @Property(viewable = false, order = 19)
/**
        owner = JDBCUtils.safeGetString(dbResult, "OWNER");
    @Property(viewable = false, order = 42)
    private static final String CAT_ADVANCED = "Advanced";
    }
	private long maxRuns;


    @Property(viewable = true, order = 200)
    public String getProgramType() {
        @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public long getMaxRuns() {
 *
 * You may obtain a copy of the License at
        programAction = JDBCUtils.safeGetString(dbResult, "PROGRAM_ACTION");

        enabled = JDBCUtils.safeGetString(dbResult, "ENABLED");
    public String getNlsEnv() {
    private String owner;
        weight = JDBCUtils.safeGetString(dbResult, "WEIGHT");
        return enabled;
	private String programName;
    static class ArgumentsCache extends JDBCObjectCache<OracleSchedulerProgram, OracleSchedulerProgramArgument> {
        return argumentsCache.getAllObjects(monitor, this);

            dbStat.setString(1, program.getSchema().getName());
    }
    @Property(category = CAT_ADVANCED, viewable = false, order = 55)
    {
	private String maxRunDuration;

 *
        return maxRunDuration;

        maxFailures = JDBCUtils.safeGetLong(dbResult, "MAX_FAILURES");
        super(schema, JDBCUtils.safeGetString(dbResult, "PROGRAM_NAME"), true);


public class OracleSchedulerProgram extends OracleSchemaObject {
    }

	private String nlsEnv;
    @Property(viewable = true, order = 34)
    @Property(viewable = false, order = 47)
 */
    public String getDescription() {
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = false, order = 18)
package org.jkiss.dbeaver.ext.oracle.model;
    @Property(viewable = false, order = 10)
	private String priority;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        programType = JDBCUtils.safeGetString(dbResult, "PROGRAM_TYPE");
        return nlsEnv;
    public String getEnabled() {
        numberOfArguments = JDBCUtils.safeGetLong(dbResult, "NUMBER_OF_ARGUMENTS");
        protected OracleSchedulerProgramArgument fetchObject(@NotNull JDBCSession session, @NotNull OracleSchedulerProgram program, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
 * distributed under the License is distributed on an "AS IS" BASIS,
	private String programAction;
            return new OracleSchedulerProgramArgument(program, resultSet);
        return weight;
    }
    @Property(viewable = true, order = 17)
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getProgramName() {
