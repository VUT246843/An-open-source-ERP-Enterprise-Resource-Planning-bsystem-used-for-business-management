    private final ScheduleCache scheduleCache = new ScheduleCache();
            final JDBCPreparedStatement stmt = session.prepareStatement(sql.toString());
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public DBSObject getParentObject() {
    public ScheduleCache getScheduleCache() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.DBPSaveableObject;
    public PostgreJob(@NotNull DBRProgressMonitor monitor, @NotNull PostgreDatabase database, @NotNull String name) throws DBException {
    @NotNull
import java.sql.SQLException;
    public static class StepCache extends JDBCObjectLookupCache<PostgreJob, PostgreJobStep> {
        this.hostAgent = "";
 * DBeaver - Universal Database Manager
    }
        return scheduleCache.getObject(monitor, this, name);
 *

    public void setHostAgent(@NotNull String hostAgent) {
            }
            if (schedule != null) {
        return enabled;
        @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.name = JDBCUtils.safeGetString(dbResult, "jobname");
            }
        this.description = "";


    @Override
    @Property(viewable = true, editable = true, updatable = true, order = 2)
        return hostAgent;
import org.jkiss.dbeaver.model.struct.DBSObject;
/*

    @NotNull
import org.jkiss.dbeaver.model.DBPStatefulObject;
public class PostgreJob implements PostgreObject, DBPStatefulObject, DBPRefreshableObject, DBPSaveableObject, DBPSystemInfoObject {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreJob job, @Nullable PostgreJobSchedule schedule, @Nullable String objectName) throws SQLException {

        @Nullable
    public PostgreDataSource getDataSource() {
        this.jobClass = database.getJobClass(monitor, 1);
    private String hostAgent;


import org.jkiss.dbeaver.DBException;
        return name;
    @Override
    }
        return persisted;

        return stepCache.getAllObjects(monitor, this);
            return stmt;
        this.description = JDBCUtils.safeGetString(dbResult, "jobdesc");
    }
        this.hostAgent = hostAgent;
    }
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreJob job, @Nullable PostgreJobStep step, @Nullable String objectName) throws SQLException {
        @Override
    }
    }
        protected PostgreJobSchedule fetchObject(@NotNull JDBCSession session, @NotNull PostgreJob job, @NotNull JDBCResultSet dbResult) {
    public boolean isPersisted() {
            return stmt;
    public PostgreDatabase getDatabase() {
    }
            return object.getDatabase().getJobClassCache().getCachedObjects().toArray();

    public String getName() {
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

import java.sql.ResultSet;
        return enabled ? DBSObjectState.ACTIVE : DBSObjectState.NORMAL;
        }

            return false;
    @Property(viewable = true, editable = true, updatable = true, listProvider = JobClassListProvider.class, order = 4)
        this.jobClass = database.getJobClass(monitor, JDBCUtils.safeGetLong(dbResult, "jobjclid"));

        return stepCache;
        return database.jobCache.refreshObject(monitor, database, this);
import org.jkiss.code.Nullable;
    }
    @Property(viewable = true, editable = true, updatable = true, order = 1)
    public void setId(long id) {
    public String getHostAgent() {
                sql.append(" AND jscid=?");
 *

    private String name;
    public void setDescription(@NotNull String description) {
import org.jkiss.dbeaver.model.struct.DBSObjectState;

    @NotNull
    @NotNull
    }
        this.jobClass = jobClass;
    public void setEnabled(boolean enabled) {

    }
            return new PostgreJobSchedule(job, dbResult);
 * You may obtain a copy of the License at

    public PostgreJob(@NotNull DBRProgressMonitor monitor, @NotNull PostgreDatabase database, @NotNull ResultSet dbResult) throws DBException {
    public DBSObjectState getObjectState() {
import org.jkiss.dbeaver.model.DBPSystemInfoObject;
    }
        return description;
            stmt.setLong(1, job.getObjectId());
    @Property(viewable = true, editable = true, updatable = true, order = 5)
    @Property(viewable = true, editable = true, updatable = true, order = 3)

    @Override
 * See the License for the specific language governing permissions and
        }

        return database;
import org.jkiss.code.NotNull;
    }

        protected PostgreJobStep fetchObject(@NotNull JDBCSession session, @NotNull PostgreJob job, @NotNull JDBCResultSet dbResult) {
    public StepCache getStepCache() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


    public void setName(@NotNull String name) {
    private final PostgreDatabase database;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
    private boolean enabled;

        @NotNull

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.persisted = true;
    }

    private final StepCache stepCache = new StepCache();
 * Unless required by applicable law or agreed to in writing, software
    public PostgreJobClass getJobClass() {
    @Override

    @NotNull
    @Nullable
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    public String getDescription() {
        this.database = database;
            return new PostgreJobStep(job, dbResult);
    @Override
    @Association
    public boolean isEnabled() {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    @Override
        return stepCache.getObject(monitor, this, name);
import org.jkiss.dbeaver.Log;
    }
        public boolean allowCustomValue() {
    private PostgreJobClass jobClass;
        this.persisted = false;

        @Override
    @Override
        this.enabled = JDBCUtils.safeGetBoolean(dbResult, "jobenabled");
    private boolean persisted;
    }



    }
                stmt.setLong(2, schedule.getObjectId());
    private static final Log log = Log.getLog(PostgreJob.class);
    public List<PostgreJobSchedule> getSchedules(@NotNull DBRProgressMonitor monitor) throws DBException {
            if (schedule != null) {
            }
        @Override
    private long id;
    public List<PostgreJobStep> getSteps(@NotNull DBRProgressMonitor monitor) throws DBException {

        this.hostAgent = JDBCUtils.safeGetString(dbResult, "jobhostagent");
    public PostgreJobStep getStep(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
            if (step != null) {
        this.id = id;
 */

        }
        return database.getDataSource();


 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        return scheduleCache.getAllObjects(monitor, this);
import java.util.List;
package org.jkiss.dbeaver.ext.postgresql.model;
        stepCache.clearCache();
    }
    @Association

 * limitations under the License.
    @NotNull
                sql.append(" AND jstid=?");
        this.enabled = enabled;

        this.enabled = true;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @NotNull
        this.name = name;
    @NotNull
    }
        final PostgreDatabase database = getDatabase();
    @Nullable
                stmt.setLong(2, step.getObjectId());
        @Nullable
import org.jkiss.dbeaver.model.DBPRefreshableObject;
        this.name = name;
    }
    }
        this.description = description;
    }
    public void setJobClass(@NotNull PostgreJobClass jobClass) {
import org.jkiss.dbeaver.model.meta.Property;
    }
    }
 * you may not use this file except in compliance with the License.
    @Override
    public long getObjectId() {
    @Override
        this.id = 0;
        return scheduleCache;
        return id;
        this.database = database;
            }
    @NotNull
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return jobClass;
            final JDBCPreparedStatement stmt = session.prepareStatement(sql.toString());
        this.persisted = persisted;
    @Nullable
    }
        }
import org.jkiss.dbeaver.model.meta.Association;
    public void setPersisted(boolean persisted) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    @Nullable
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {
    public PostgreJobSchedule getSchedule(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
}
            final StringBuilder sql = new StringBuilder("SELECT * FROM pgagent.pga_jobstep WHERE jstjobid=?");
    @NotNull
    public static class JobClassListProvider implements IPropertyValueListProvider<PostgreJob> {
    }

            final StringBuilder sql = new StringBuilder("SELECT * FROM pgagent.pga_schedule WHERE jscjobid=?");
        scheduleCache.clearCache();
    public static class ScheduleCache extends JDBCObjectLookupCache<PostgreJob, PostgreJobSchedule> {
    private String description;
            // Classes are already loaded at this moment, so we are free to use void monitor here
    }
        // not implemented
    }
        @Nullable
        this.id = JDBCUtils.safeGetLong(dbResult, "jobid");
        return database;

        }
        @NotNull
            stmt.setLong(1, job.getObjectId());
    @Nullable
        @Override
    }
        }
            if (step != null) {

        public Object[] getPossibleValues(@NotNull PostgreJob object) {
