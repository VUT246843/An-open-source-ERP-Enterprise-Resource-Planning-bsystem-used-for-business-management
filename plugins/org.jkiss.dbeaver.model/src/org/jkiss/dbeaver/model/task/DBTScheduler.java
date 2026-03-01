    DBTTaskScheduleInfo getScheduledTaskInfo(@NotNull DBTTask task);

     */
    String FEATURE_FREQUENCY_HOURLY_EXECUTION_MINUTE = FEATURE_FREQUENCY_HOURLY + ".executionMinute";
    /**
    String FEATURE_FREQUENCY_DAILY_START_DATE = FEATURE_FREQUENCY_DAILY + ".startDate";
    boolean supportsFeature(String feature);
    void removeTaskSchedule(@NotNull DBTTask task, DBTTaskScheduleInfo scheduleInfo) throws DBException;
    @Nullable
import java.util.List;

    default boolean canSchedule(@NotNull DBTTask task, List<String> warnings) throws DBException {
    @NotNull

    DBTTaskScheduleConfiguration getScheduledTaskConfiguration(@NotNull DBTTask task) throws DBException;

    enum RecurrenceType {
package org.jkiss.dbeaver.model.task;
    String FEATURE_FREQUENCY_MINUTELY_RECURRENCE_GREATER_THAN_59 = FEATURE_FREQUENCY_MINUTELY + ".recurrence.greaterThan59";

    String FEATURE_FREQUENCY_MINUTELY = "frequency.minutely";
     */
     * Opens scheduler settings.
     * @return {@code true} if task schedule was set successfully, or {@code false} if the operation was cancelled.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

    String FEATURE_FREQUENCY_HOURLY = "frequency.hourly";
 */
    /**
     *

/*
    String FEATURE_FREQUENCY_MONTHLY_LAST_DAY = FEATURE_FREQUENCY_MONTHLY + ".last_day";
    String FEATURE_FREQUENCY_DAILY_RECURRENCE_GREATER_THAN_31 = FEATURE_FREQUENCY_DAILY + ".recurrence.greaterThan31";
    String FEATURE_FREQUENCY_MINUTELY_START_DATETIME = FEATURE_FREQUENCY_MINUTELY + ".startDatetime";
/**
    RecurrenceType getRecurrenceType();
    String FEATURE_FREQUENCY_MONTHLY = "frequency.monthly";
    DBTSchedulerExternalSettings openSchedulerSettings() throws DBException;
     * Sets task schedule.
 *
 * Unless required by applicable law or agreed to in writing, software
     * @return settings information to show in DBeaver UI. Null if scheduler uses some proprietary way to show settings.
    String FEATURE_FREQUENCY_WEEKLY = "frequency.weekly";
    String FEATURE_FREQUENCY_WEEKLY_START_DATE = FEATURE_FREQUENCY_WEEKLY + ".startDate";
public interface DBTScheduler {
    String FEATURE_OPEN_EXTERNAL_SETTINGS = "openExternalSettings";
    String FEATURE_FREQUENCY_HOURLY_RECURRENCE_GREATER_THAN_23 = FEATURE_FREQUENCY_HOURLY + ".recurrence.greaterThan23";
 * You may obtain a copy of the License at
    }
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

        Cron

import org.jkiss.code.Nullable;

    String FEATURE_FREQUENCY_HOURLY_START_DATETIME = FEATURE_FREQUENCY_HOURLY + ".startDatetime";

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    String getSchedulerName();
    String FEATURE_FREQUENCY_EVENT = "frequency.event";
        Interval,
 */
    List<DBTTaskScheduleInfo> getAllScheduledTasks() throws DBException;
    String FEATURE_FREQUENCY_DAILY_RECURRENCE = FEATURE_FREQUENCY_DAILY + ".recurrence";
    boolean setTaskSchedule(@NotNull DBTTask task, @NotNull DBTTaskScheduleConfiguration scheduleConfiguration) throws DBException;

 * limitations under the License.

    String FEATURE_FREQUENCY_MONTHLY_START_DATE = FEATURE_FREQUENCY_MONTHLY + ".startDate";
 * Scheduler
    String FEATURE_FREQUENCY_ONETIME = "frequency.onetime";
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return true;
    String FEATURE_FREQUENCY_WEEKLY_RECURRENCE = FEATURE_FREQUENCY_WEEKLY + ".recurrence";
    String FEATURE_FREQUENCY_ONETIME_START_DATETIME = FEATURE_FREQUENCY_ONETIME + ".startDatetime";
    String FEATURE_FREQUENCY_DAILY = "frequency.daily";
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
    @Nullable

    @NotNull
    }
}
    void refreshScheduledTasks(@NotNull DBRProgressMonitor monitor) throws DBException;
     * @throws DBException on any error
 *

