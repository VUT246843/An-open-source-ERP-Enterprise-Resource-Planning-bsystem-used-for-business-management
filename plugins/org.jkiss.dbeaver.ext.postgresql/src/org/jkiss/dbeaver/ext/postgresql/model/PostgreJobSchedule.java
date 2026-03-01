        this.job = job;
        return monthDays;
    }
        this.months = ArrayUtils.unbox(PostgreUtils.safeGetBooleanArray(dbResult, "jscmonths"));
        this.description = "";
    private /* final */ boolean[] monthDays;
    private final PostgreJob job;
    }
        this.enabled = true;

import java.sql.Timestamp;
        this.persisted = true;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        return persisted;
    }
    private String description;

    }
        this.weekDays = ArrayUtils.unbox(PostgreUtils.safeGetBooleanArray(dbResult, "jscweekdays"));
    @Override
        return name;
        this.start = Timestamp.from(Instant.now());
        this.start = JDBCUtils.safeGetTimestamp(dbResult, "jscstart");
    public boolean[] getMonths() {
import org.jkiss.utils.ArrayUtils;
    }
    public long getObjectId() {
import org.jkiss.code.Nullable;
        this.months = new boolean[12];
    private /* final */ boolean[] hours;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
import org.jkiss.dbeaver.model.meta.Property;
    public Timestamp getEnd() {
        this.end = JDBCUtils.safeGetTimestamp(dbResult, "jscend");


    @NotNull
    }
    public boolean[] getHours() {
 * DBeaver - Universal Database Manager
    }
    @Nullable
        return start;
import java.sql.ResultSet;
}




        this.end = null;

        this.hours = ArrayUtils.unbox(PostgreUtils.safeGetBooleanArray(dbResult, "jschours"));
        this.job = job;
    public Timestamp getStart() {

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = true, updatable = true, order = 2)
    public boolean[] getWeekDays() {
        return job;
    @NotNull
        this.persisted = persisted;
        this.id = JDBCUtils.safeGetLong(dbResult, "jscid");
    public String getName() {
    @NotNull
    public PostgreJobSchedule(@NotNull PostgreJob job, @NotNull String name) {
        this.minutes = ArrayUtils.unbox(PostgreUtils.safeGetBooleanArray(dbResult, "jscminutes"));
public class PostgreJobSchedule implements PostgreObject, DBPNamedObject2, DBPRefreshableObject, DBPSaveableObject {
    private /* final */ boolean[] months;
    }
        this.weekDays = new boolean[7];
import org.jkiss.dbeaver.DBException;
        return hours;
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
        this.description = JDBCUtils.safeGetString(dbResult, "jscdesc");
    }
    private final long id;

    public boolean isEnabled() {
import org.jkiss.dbeaver.model.DBPNamedObject2;
        return end;
        this.id = 0;
    @Property(viewable = true, editable = true, updatable = true, order = 3)
        return months;
        this.description = description;
 * You may obtain a copy of the License at



    }
    public void setDescription(@NotNull String description) {
    @Override
    }
    }
        return job.getScheduleCache().refreshObject(monitor, job, this);
import org.jkiss.dbeaver.model.DBPRefreshableObject;

    public PostgreJobSchedule refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.DBPSaveableObject;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return id;
    public boolean[] getMinutes() {
    @NotNull
package org.jkiss.dbeaver.ext.postgresql.model;
    public PostgreDataSource getDataSource() {
    public boolean isPersisted() {

    @Property(viewable = true, order = 5, specific = true)
    public PostgreJob getParentObject() {
    private boolean persisted;

    }
    @Override
        this.name = JDBCUtils.safeGetString(dbResult, "jscname");
    public PostgreDatabase getDatabase() {
    private /* final */ boolean[] minutes;
    private /* final */ Timestamp start;
        return enabled;
    public PostgreJobSchedule(@NotNull PostgreJob job, ResultSet dbResult) {
    private boolean enabled;
    @Override
        this.hours = new boolean[24];
    @NotNull
        return job.getDatabase();
        this.name = name;
 * See the License for the specific language governing permissions and
    @NotNull
    @Override
        this.enabled = enabled;
    @Property(viewable = true, editable = true, updatable = true, order = 1)


    public void setEnabled(boolean enabled) {
    @Override
    @Override
    public void setPersisted(boolean persisted) {
    public boolean[] getMonthDays() {
    @Override
    }
 * limitations under the License.

 */
    @Property(viewable = true, order = 4, specific = true)
        return weekDays;
        this.name = name;
        this.enabled = JDBCUtils.safeGetBoolean(dbResult, "jscenabled");
    public void setName(@NotNull String name) {
        return description;
import org.jkiss.code.NotNull;
    @Override
    @NotNull
        this.persisted = false;
    @NotNull
    public String getDescription() {
 *
/*
    private /* final */ boolean[] weekDays;
    @NotNull
        this.monthDays = new boolean[32];
 * you may not use this file except in compliance with the License.
        return job.getDataSource();

        this.monthDays = ArrayUtils.unbox(PostgreUtils.safeGetBooleanArray(dbResult, "jscmonthdays"));
    }
    }
    @NotNull
    @Nullable
    private /* final */ Timestamp end;
        this.minutes = new boolean[60];

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private String name;

    }
import java.time.Instant;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
        return minutes;
 *


