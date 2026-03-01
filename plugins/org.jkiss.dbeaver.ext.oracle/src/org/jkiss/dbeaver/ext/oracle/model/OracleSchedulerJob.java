
    public void setJobClass(String jobClass) {

    }
    }
    }
import org.jkiss.dbeaver.model.*;

        DBSObjectState objectState;

        clientId = JDBCUtils.safeGetString(dbResult, "CLIENT_ID");
    public void setJobPriority(int jobPriority) {
    )
        length = PropertyLength.MULTILINE
                            if (!"null".equals(line)) {
        return state;

    }
        eventQueueAgent = JDBCUtils.safeGetString(dbResult, "EVENT_QUEUE_AGENT");
import org.jkiss.code.NotNull;
    public String getLoggingLevel() {
        this.destination = destination;

    private String scheduleName;
    }
    @Property(category = CAT_EVENTS, viewable = false, order = 30)
    }
    }
        OracleSchema schema = getSchema();
    private String fileWatcherName;
        return stopOnWindowClose;
    //@Property(viewable = false, order = 57)
    public void setProgramName(String programName) {
    }
            args.add("comments => " + SQLUtils.quoteString(this, comments));
    public String getInstanceStickiness() {
 * you may not use this file except in compliance with the License.
                runScript.toString()
                )
        return jobStyle;
        return globalUid;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private String fileWatcherOwner;
    private String allowRunsInRestrictedMode;
    @Override
                    dbStat.setString(2, getName());

        jobStyle = JDBCUtils.safeGetString(dbResult, "JOB_STYLE");
                "Run Job",
        }

 * See the License for the specific language governing permissions and

        jobPriority = JDBCUtils.safeGetInt(dbResult, "JOB_PRIORITY");
import org.jkiss.dbeaver.ext.oracle.model.source.OracleStatefulObject;


        this.jobAction = jobAction;
    }
        }

    }
        return nextRunDate;
        public boolean isValidValue(@NotNull OracleSchedulerJob object, @Nullable Object value) throws IllegalArgumentException {
        }
        instanceStickiness = JDBCUtils.safeGetString(dbResult, "INSTANCE_STICKINESS");
        startDate = JDBCUtils.safeGetString(dbResult, "START_DATE");
    private String eventQueueName;
    public void setJobStyle(String jobStyle) {
    private String state;
            }
        }
                    this,

    @Property(category = CAT_ADVANCED, viewable = false, order = 52, editable = true, updatable = true)
        }
    @Association

                        StringBuilder action = null;
    }
            } else if (JobState.valueOf(state).equals(JobState.CHAIN_STALLED)) {
    }
    public long getMaxFailures() {
        destination = JDBCUtils.safeGetString(dbResult, "DESTINATION");
        return source;
    }
            args.add("start_date => TO_TIMESTAMP_TZ(" + SQLUtils.quoteString(this, startDate) + ", 'yyyy-mm-dd hh24:mi:ss.ff tzr')");
        eventRule = JDBCUtils.safeGetString(dbResult, "EVENT_RULE");
        return maxFailures;
    }
    private static final String CAT_ADVANCED = "Advanced";
    }
            args.add("job_type => " + SQLUtils.quoteString(this, jobType));
                    "Load action for " + OracleObjectType.JOB + " '" + this.getName() + "'"
    public String getNlsEnv() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            lineCount++;
        runCount = JDBCUtils.safeGetLong(dbResult, "RUN_COUNT");
    private String source;
    }
        this.nlsEnv = nlsEnv;
    public void setRestartable(String restartable) {
 * DBeaver - Universal Database Manager
    private String credentialName;
package org.jkiss.dbeaver.ext.oracle.model;
public class OracleSchedulerJob extends OracleSchemaObject implements OracleStatefulObject, DBPScriptObject, DBPRefreshableObject {
    }

    public long getNumberOfArguments() {
            ) {
                monitor.done();
    public String getJobSubName() {
        this.numberOfArguments = numberOfArguments;
    }
                            }
                        if (jobState != null) {
    }
        };
    @Property(category = CAT_SETTINGS, viewable = false, order = 53)
    @Property(viewable = false, order = 21, editable = true, updatable = true)
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 42, editable = true, updatable = true)
    public long getRunCount() {
        this.stopOnWindowClose = stopOnWindowClose;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getProgramOwner() {
            return object.getDataSource().supportsSchedulerJobEdit();
        RETRYSCHEDULED,
                }
    @Property(category = CAT_SETTINGS, viewable = false, order = 38, editable = true, updatable = true)
    }
    public void setLoggingLevel(String loggingLevel) {
        try {
    @Property(category = CAT_ADVANCED, viewable = false, order = 51, updatable = true)
    @Property(viewable = true, order = 11, editable = true)
    private String scheduleOwner;
        this.instanceStickiness = instanceStickiness;
import org.jkiss.dbeaver.model.meta.Property;
                        }
    }
                            final String line = dbResult.getString(1);
 * You may obtain a copy of the License at
    }
                        while (dbResult.next()) {
        this.jobType = jobType;
    }



    }
    private long maxRuns;
        if (jobType != null) {

    @Property(viewable = true, order = 10, updatable = true, editable = true)
        instanceId = JDBCUtils.safeGetString(dbResult, "INSTANCE_ID");
        owner = JDBCUtils.safeGetString(dbResult, "OWNER");

    public void setDestination(String destination) {
    }
    }
    @Property(category = CAT_EVENTS, viewable = false, order = 31)
    private String maxRunDuration;
        return retryCount;
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
    private String scheduleType;

            try (
    }
    public void setCredentialName(String credentialName) {
 * Unless required by applicable law or agreed to in writing, software
    private long failureCount;

        }
        this.maxFailures = maxFailures;

                }
    @Property(category = CAT_EVENTS, viewable = false, order = 29)
        programName = JDBCUtils.safeGetString(dbResult, "PROGRAM_NAME");
    }
        this.jobStyle = jobStyle;
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    public boolean getEnabled() {
        system = JDBCUtils.safeGetString(dbResult, "SYSTEM");
    }
            return dbStat;
    }
    private String jobAction;
    @Property(category = CAT_ADVANCED, viewable = false, order = 64, editable = true)
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (IllegalArgumentException e) {
    @Property(viewable = true, order = 22)
    public String getDescription() {
    public String getJobClass() {
    @Property(category = CAT_ADVANCED, viewable = false, order = 15)

    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 44)
                            jobState.append(line);
import java.util.Collection;

        return jobPriority;
    private String jobWeight;
        return jobType;
    public void setScheduleName(String scheduleName) {
        return restartable;
                            }
    @Property(category = CAT_ADVANCED, viewable = false, order = 59, updatable = true)
    @Property(category = CAT_ADVANCED, viewable = false, order = 20)

            monitor.beginTask("Load action for '" + this.getName() + "'...", 1);
        return numberOfArguments;
                objectState = DBSObjectState.NORMAL;
                                break;
    public String getJobAction() {
        return maxRuns;
    }
        scheduleLimit = JDBCUtils.safeGetString(dbResult, "SCHEDULE_LIMIT");
    public void setDescription(String comments) {
                            monitor.subTask("Line " + lineCount);
    }
import java.util.StringJoiner;
        scheduleOwner = JDBCUtils.safeGetString(dbResult, "SCHEDULE_OWNER");
        return repeatInterval;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            args.add("end_date => TO_TIMESTAMP_TZ(" + SQLUtils.quoteString(this, endDate) + ", 'yyyy-mm-dd hh24:mi:ss.ff tzr')");
    public void setInstanceId(String instanceId) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    }
                objectState = DBSObjectState.ACTIVE;
    public DBSObjectState getObjectState() {
                objectState = DBSObjectState.INVALID;
    public void setAllowRunsInRestrictedMode(String allowRunsInRestrictedMode) {
    @Property(category = CAT_ADVANCED, viewable = false, order = 60)
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
        runScript.append("END;");
        COMPLETED,
                        }
        fileWatcherOwner = JDBCUtils.safeGetString(dbResult, "FILE_WATCHER_OWNER");
    @NotNull
        viewable = false, required = true,
    public void setEndDate(String endDate) {
            } finally {
        stopOnWindowClose = JDBCUtils.safeGetString(dbResult, "STOP_ON_WINDOW_CLOSE");
                        }
        jobClass = JDBCUtils.safeGetString(dbResult, "JOB_CLASS");

                    }
        }

    }
        if (endDate != null) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getEventQueueOwner() {
        lastRunDuration = JDBCUtils.safeGetString(dbResult, "LAST_RUN_DURATION");
    private String raiseEvents;

    }
    @Property(category = CAT_EVENTS, viewable = false, order = 25)
    }
                    JDBCPreparedStatement dbStat = session.prepareStatement(

 * Oracle scheduler job
    public Collection<OracleSchedulerJobArgument> getArguments(DBRProgressMonitor monitor) throws DBException {
    public String getLastRunDuration() {
        return eventRule;
        return "BEGIN\n  DBMS_SCHEDULER.CREATE_JOB(\n\t" + args + "\n);\nEND;";
    }
        StringBuffer runScript = new StringBuffer();
        this.restartable = restartable;
                        StringBuilder jobState = null;
    public String getDestinationOwner() {
        if (comments != null) {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {

                            monitor.subTask("Line " + lineCount);
    public void setRaiseEvents(String raiseEvents) {
    public void setInstanceStickiness(String instanceStickiness) {
    @Property(category = CAT_SETTINGS, viewable = false, order = 49, editable = true, updatable = true)
        return system;
        destinationOwner = JDBCUtils.safeGetString(dbResult, "DESTINATION_OWNER");
    public String getRaiseEvents() {
                    }
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 43)
    private String eventRule;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 41)
            } else if (JobState.valueOf(state).equals(JobState.FAILED)) {
                final JDBCSession session = DBUtils.openMetaSession(
        protected OracleSchedulerJobArgument fetchObject(
    }

    //@Property(viewable = false, order = 48)
        return numberOfDestinations;
    @Property(category = CAT_EVENTS, viewable = false, order = 27)
    public void setMaxRuns(long maxRuns) {
    @Property(category = CAT_EVENTS, viewable = false, order = 26)
    }
        return runCount;
                        int lineCount = 0;
        if (jobAction != null) {
    }
    }
        jobCreator = JDBCUtils.safeGetString(dbResult, "JOB_CREATOR");
        this.loggingLevel = loggingLevel;
        return instanceId;
        programOwner = JDBCUtils.safeGetString(dbResult, "PROGRAM_OWNER");
    private String nlsEnv;

        return scheduleOwner;


 * limitations under the License.
        globalUid = JDBCUtils.safeGetString(dbResult, "GLOBAL_UID");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

    public String getJobCreator() {
    public String getMaxRunDuration() {
        return endDate;
    @Property(viewable = true, order = 32, editable = true, updatable = true)
    private String scheduleLimit;

    private static final String CAT_SETTINGS = "Settings";
    public int getJobPriority() {
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 39)

    }
    }

        return allowRunsInRestrictedMode;
    @Property(category = CAT_SETTINGS, viewable = false, order = 46)
    public String getRestartable() {

        final StringJoiner args = new StringJoiner(",\n\t");

    public void setJobAction(String jobAction) {
 *
            )
                            if (monitor.isCanceled()) {
    }

    }
    }
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    }
    @Override
            }
    private String stopOnWindowClose;

        if (monitor != null) {
    public String getEventCondition() {
        this.maxRuns = maxRuns;

    @Property(category = CAT_ADVANCED, viewable = false, order = 58)
    }
    private String system;
    public String getCredentialOwner() {
                )
    private String nextRunDate;

import org.jkiss.dbeaver.model.sql.SQLUtils;
    public String getRepeatInterval() {
    }

                OracleObjectType.JOB,
        this.startDate = startDate;
    public void setEventCondition(String eventCondition) {
        this.eventCondition = eventCondition;
    private String autoDrop;
    }
    }
import java.sql.ResultSet;
        if (repeatInterval != null) {
        return new DBEPersistAction[] {

        maxRuns = JDBCUtils.safeGetLong(dbResult, "MAX_RUNS");
        return jobCreator;
        endDate = JDBCUtils.safeGetString(dbResult, "END_DATE");
        return credentialOwner;
    }
                try (
    }
                            if (jobState == null) {
        order = 18, editable = true,
    private String credentialOwner;
        }
    }
        return this;

                    "ORDER BY ARGUMENT_POSITION");
import java.sql.SQLException;
        this.jobClass = jobClass;
    public void setNlsEnv(String nlsEnv) {
        return nlsEnv;
        @Override
                            final String line = dbResult.getString(1);
    }
    private String jobType;
    private String jobClass;

    @Property(viewable = false, order = 37)
            monitor.beginTask("Load action for '" + this.getName() + "'...", 1);
            args.add("enabled => TRUE");
    private String comments;
        return enabled;
    private String eventCondition;
    private String destination;
        numberOfDestinations = JDBCUtils.safeGetString(dbResult, "NUMBER_OF_DESTINATIONS");
                                jobState = new StringBuilder(15);
    static class ArgumentsCache extends JDBCObjectCache<OracleSchedulerJob, OracleSchedulerJobArgument> {
                objectState = DBSObjectState.INVALID;

        runScript.append("BEGIN\n");
    private String programName;
import org.jkiss.dbeaver.DBException;
    }
            ) {
        return owner;
                            if (action == null) {
        return programName;
        autoDrop = JDBCUtils.safeGetString(dbResult, "AUTO_DROP");
            args.add("job_action => " + SQLUtils.quoteString(this, CommonUtils.escapeDisplayString(jobAction)));
                            }
    @Property(category = CAT_SETTINGS, viewable = false, order = 50, editable = true)
        eventQueueOwner = JDBCUtils.safeGetString(dbResult, "EVENT_QUEUE_OWNER");
        this.endDate = endDate;
    @Property(category = CAT_SETTINGS, viewable = false, order = 47, updatable = true)

 *
    }
        jobSubName = JDBCUtils.safeGetString(dbResult, "JOB_SUBNAME");

                        }
    public DBEPersistAction[] getRunActions() {
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 45)
    private String jobStyle;
    @Property(category = CAT_ADVANCED, viewable = false, order = 56)
    private String instanceId;
        jobType = JDBCUtils.safeGetString(dbResult, "JOB_TYPE");
            } else if (JobState.valueOf(state).equals(JobState.BROKEN)) {
        return eventQueueOwner;
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    public String getEventRule() {
    @Property(category = CAT_ADVANCED, viewable = false, order = 62, editable = true, updatable = true)
    public String getDestination() {

    public void setJobType(String jobType) {

    public String getFileWatcherName() {

import org.jkiss.dbeaver.model.struct.DBSObject;

        this.raiseEvents = raiseEvents;
        this.credentialName = credentialName;
    public String getAllowRunsInRestrictedMode() {
    @Property(category = CAT_EVENTS, viewable = false, order = 28, editable = true)
        return maxRunDuration;
    public String getSystem() {
    private static final String CAT_EVENTS = "Events";
        super(schema, name, false);
        credentialName = JDBCUtils.safeGetString(dbResult, "CREDENTIAL_NAME");
    }
    private String restartable;
    public void setStartDate(String startDate) {
        return lastRunDuration;
/*
                            "WHERE OWNER=? AND JOB_NAME=? ")
                            jobAction = action.toString();
    private int jobPriority;
    public String getScheduleName() {
    }
            } catch (Exception e) {
                    "Load action for " + OracleObjectType.JOB + " '" + this.getName() + "'"
        SCHEDULED,
        return failureCount;
                    monitor,
    }
            args.add("job_class => " + SQLUtils.quoteString(this, jobClass));
                            }

    @Property(viewable = false, order = 200, editable = true, updatable = true)
        @Override
            if (JobState.valueOf(state).equals(JobState.RUNNING)) {
    private String destinationOwner;
    public String getClientId() {
        enabled = JDBCUtils.safeGetBoolean(dbResult, "ENABLED");
        allowRunsInRestrictedMode = JDBCUtils.safeGetString(dbResult, "ALLOW_RUNS_IN_RESTRICTED_MODE");
    private static final String DEFAULT_JOB_CLASS = "DEFAULT_JOB_CLASS";

    }
        this.repeatInterval = repeatInterval;
        this.jobAction = jobAction;
    private String lastStartDate;
                                action.append(line);

                    this,
    public long getMaxRuns() {

    public String getInstanceId() {
    private String numberOfDestinations;
        category = CAT_SETTINGS,

    public String getJobStyle() {
                        while (dbResult.next()) {
        if (CommonUtils.isEmpty(jobAction) && name.equals("NEW_SCHEDULER_JOB")) {
 */
        eventQueueName = JDBCUtils.safeGetString(dbResult, "EVENT_QUEUE_NAME");
            dbStat.setString(2, job.getName());
    private String deferredDrop;
import java.util.Map;
        deferredDrop = JDBCUtils.safeGetString(dbResult, "DEFERRED_DROP");
                    dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
        this.programName = programName;

    }
    public void setScheduleLimit(String scheduleLimit) {
            try (
        }
    public void setEnabled(boolean enabled) {
        return argumentsCache.getAllObjects(monitor, this);
    public String getSource() {

        numberOfArguments = JDBCUtils.safeGetLong(dbResult, "NUMBER_OF_ARGUMENTS");

    @Property(category = CAT_ADVANCED, viewable = false, order = 14)
    public void setAutoDrop(String autoDrop) {
    }

    private String startDate;

    public String getLastStartDate() {
    }
        maxFailures = JDBCUtils.safeGetLong(dbResult, "MAX_FAILURES");
        return raiseEvents;
    protected OracleSchedulerJob(OracleSchema schema, ResultSet dbResult) {
    private String eventQueueOwner;
        comments = JDBCUtils.safeGetString(dbResult, "COMMENTS");
    }
    private String jobCreator;
        raiseEvents = JDBCUtils.safeGetString(dbResult, "RAISE_EVENTS");
    }

    private String loggingLevel;
        }

        ) throws SQLException, DBException {
    public String getEventQueueAgent() {
            }
                    throw new DBCException(e, session.getExecutionContext());
                            }
                            state = jobState.toString();
    }

        scheduleName = JDBCUtils.safeGetString(dbResult, "SCHEDULE_NAME");
    }
                        int lineCount = 0;
    }
        repeatInterval = JDBCUtils.safeGetString(dbResult, "REPEAT_INTERVAL");
        return comments;

        jobWeight = JDBCUtils.safeGetString(dbResult, "JOB_WEIGHT");
    @Property(category = CAT_ADVANCED, viewable = false, order = 61, editable = true, updatable = true)
        }
    private boolean enabled;
        }
    public void setStopOnWindowClose(String stopOnWindowClose) {

        nlsEnv = JDBCUtils.safeGetString(dbResult, "NLS_ENV");
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleSchedulerJob job) throws SQLException {
        return clientId;

    public String getGlobalUid() {
        BROKEN,

        return programOwner;
        return deferredDrop;
                } catch (SQLException e) {
    @Property(category = CAT_ADVANCED, viewable = false, order = 12)
                    dbStat.setString(1, getOwner());

        DISABLED,
    private String instanceStickiness;
                ) {
    }
        eventCondition = JDBCUtils.safeGetString(dbResult, "EVENT_CONDITION");

        return objectState;
        return fileWatcherOwner;

    @Property(viewable = false, order = 16, editable = true, updatable = true)
        return jobAction;

                            "WHERE OWNER=? AND JOB_NAME=? ")


        if (enabled) {
    private String clientId;
        this.comments = comments;
        if (startDate != null) {
                ) {
                            if (monitor.isCanceled()) {
    public String getFileWatcherOwner() {
        jobAction = JDBCUtils.safeGetString(dbResult, "JOB_ACTION");
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
        return eventQueueAgent;
    public String getOwner() {
        nextRunDate = JDBCUtils.safeGetString(dbResult, "NEXT_RUN_DATE");
                    JDBCPreparedStatement dbStat = session.prepareStatement(
    }
        this.instanceId = instanceId;
    @Nullable
    private String repeatInterval;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public String getEndDate() {

    }
        fileWatcherName = JDBCUtils.safeGetString(dbResult, "FILE_WATCHER_NAME");
                                action = new StringBuilder(4000);
    @Property(viewable = true, order = 17, required = true, editable = true, updatable = true)

                monitor.done();
    private String owner;
    }
            } else {

    @Property(category = CAT_ADVANCED, viewable = false, order = 10)
        scheduleType = JDBCUtils.safeGetString(dbResult, "SCHEDULE_TYPE");
    public void setJobWeight(String jobWeight) {
            schema.schedulerJobCache.removeObject(this, false);
    @Override
        @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(category = CAT_SETTINGS, viewable = false, order = 36, updatable = true)
        this.scheduleName = scheduleName;
        super(schema, JDBCUtils.safeGetString(dbResult, "JOB_NAME"), true);
    @Property(category = CAT_ADVANCED, viewable = false, order = 54, editable = true, updatable = true)
    public long getRetryCount() {
        return credentialName;
        }
        args.add("job_name => " + SQLUtils.quoteString(this, name));
 *
    public OracleSchedulerJob(OracleSchema schema, String name, String state, String jobAction) {


}

        return scheduleName;
    public static class OracleSchedulerJobModifyValueValidator implements IPropertyValueValidator<OracleSchedulerJob, Object> {
        REMOTE,
                            lineCount++;

    }
                    dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
        return jobClass;
            } finally {
    }
                        if (action != null) {
        loggingLevel = JDBCUtils.safeGetString(dbResult, "LOGGING_LEVEL");
        retryCount = JDBCUtils.safeGetLong(dbResult, "RETRY_COUNT");
    private String eventQueueAgent;
        return jobWeight;
    public String getJobType() {
            new OracleObjectPersistAction(
    }

    @NotNull
 */
    public String getEventQueueName() {

    public String getScheduleType() {
                    dbStat.setString(2, getName());
        this.scheduleLimit = scheduleLimit;
    @Property(viewable = true, order = 10)
    public String getStartDate() {
    private final ArgumentsCache argumentsCache = new ArgumentsCache();
        credentialOwner = JDBCUtils.safeGetString(dbResult, "CREDENTIAL_OWNER");
    @Property(
    private long retryCount;
        restartable = JDBCUtils.safeGetString(dbResult, "RESTARTABLE");
        state = JDBCUtils.safeGetString(dbResult, "STATE");
    private String programOwner;
        failureCount = JDBCUtils.safeGetLong(dbResult, "FAILURE_COUNT");

                                break;
    }
    private String globalUid;
        if (monitor != null) {

    @Property(category = CAT_SETTINGS, viewable = false, order = 34, updatable = true, editable = true)
    }
    @Property(category = CAT_ADVANCED, viewable = false, order = 63)
    private String endDate;
            @NotNull OracleSchedulerJob job,
            return new OracleSchedulerJobArgument(job, resultSet);
        if (!DEFAULT_JOB_CLASS.equals(jobClass)) {
    private long numberOfArguments;

    public String getScheduleLimit() {
    public String getNextRunDate() {
    public enum JobState {
    }
        }

    @Property(category = CAT_ADVANCED, viewable = false, order = 13)

    private String lastRunDuration;
    }
        return destinationOwner;
        SUCCEEDED,
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 40, editable = true, updatable = true)
    }
        runScript.append(getFullyQualifiedName(DBPEvaluationContext.DDL));
        this.state = state;
    private long maxFailures;
        return startDate;
    }
    }
        this.jobWeight = jobWeight;



        this.jobPriority = jobPriority;
                        "SELECT STATE FROM " + OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_SCHEDULER_JOBS " +
                    "WHERE OWNER=? AND JOB_NAME=? " +
    }
    }
        return fileWatcherName;
            @NotNull JDBCSession session,
        maxRunDuration = JDBCUtils.safeGetString(dbResult, "MAX_RUN_DURATION");
        return lastStartDate;
                objectState = DBSObjectState.INVALID;
        return eventQueueName;
    public String getStopOnWindowClose() {

                    monitor,
    public void setNumberOfArguments(long numberOfArguments) {
    public String getScheduleOwner() {
                        "SELECT JOB_ACTION FROM " + OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_SCHEDULER_JOBS " +

                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            objectState = DBSObjectState.UNKNOWN;


    @Property(category = CAT_SETTINGS, viewable = false, order = 35, editable = true, updatable = true)
        if (schema != null) {

            @NotNull JDBCResultSet resultSet

    public long getFailureCount() {
    private String jobSubName;
    public String getCredentialName() {
            args.add("repeat_interval => " + SQLUtils.quoteString(this, repeatInterval));



    }
    public String getProgramName() {

    }


    private long runCount;
        FAILED,
/**
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {
        this.enabled = enabled;

        return scheduleLimit;
    @Nullable
    @Property(category = CAT_ADVANCED, viewable = false, order = 55, editable = true)
    }
        return eventCondition;
    public void setMaxFailures(long maxFailures) {
    public String getNumberOfDestinations() {
                "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(job.getDataSource()) + "ALL_SCHEDULER_JOB_ARGS " +
    public String getState() {
    }

        CHAIN_STALLED;
            JDBCPreparedStatement dbStat = session.prepareStatement(
                try (
        updatable = true,
        }
                    dbStat.setString(1, getOwner());
        runScript.append("\tDBMS_SCHEDULER.RUN_JOB(JOB_NAME => '");
        this.autoDrop = autoDrop;
        return autoDrop;
    @Property(viewable = false, order = 33, editable = true, updatable = true)
        @Override
    }

        this.allowRunsInRestrictedMode = allowRunsInRestrictedMode;
import org.jkiss.dbeaver.model.exec.DBCException;
        return instanceStickiness;
                monitor.subTask("Error refreshing job state " + e.getMessage());
    public String getJobWeight() {


    @Property(category = CAT_SETTINGS, viewable = false, order = 19, editable = true, updatable = true)
            return "";
    public String getDeferredDrop() {
        runScript.append("', USE_CURRENT_SESSION => FALSE);");
            dbStat.setString(1, job.getSchema().getName());
    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        lastStartDate = JDBCUtils.safeGetString(dbResult, "LAST_START_DATE");
    public void setRepeatInterval(String repeatInterval) {
        return destination;

        return jobSubName;


import org.jkiss.utils.CommonUtils;
    public String getAutoDrop() {

    @Property(viewable = true, order = 24, updatable = true, editable = true)
                final JDBCSession session = DBUtils.openMetaSession(
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.meta.Association;
        return loggingLevel;
        source = JDBCUtils.safeGetString(dbResult, "SOURCE");
        RUNNING,
        return scheduleType;
    }
