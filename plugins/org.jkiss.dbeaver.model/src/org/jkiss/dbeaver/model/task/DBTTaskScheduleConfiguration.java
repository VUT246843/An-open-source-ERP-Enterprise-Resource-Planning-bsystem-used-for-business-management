    public static final int DAYS_LAST = 32;

    public int executionMinute;

/*
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
    public List<Short> months;
import java.util.Date;
 */
import java.util.Map;
package org.jkiss.dbeaver.model.task;
    // Refines the schedule type to allow finer control over schedule recurrence
 * You may obtain a copy of the License at
        MINUTELY,
    public String taskName;
import java.util.List;
        DAILY,
 * Unless required by applicable law or agreed to in writing, software
    public static final int ALL_DAYS = 33;
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Specifies day(s) of the week (for WEEKLY) or days of the month (for MONTHLY)

 * distributed under the License is distributed on an "AS IS" BASIS,
    public String taskDescription;
        EVENT // TODO: event-based schedulers not supported yet
        MONTHLY,
    public final Map<String, Object> properties = new HashMap<>();
 * you may not use this file except in compliance with the License.
    // Repetition interval in minutes
    }

    public int maxDuration;
 */

/**

    public int recurrence;
    // Specifies month(s) of the year
    public Frequency frequency;
        HOURLY,
    public int repetitionInterval;
 *

public class DBTTaskScheduleConfiguration {
    public enum Frequency {
    // Specifies the duration to run the task (in seconds)
 *
        WEEKLY,

 * See the License for the specific language governing permissions and
import java.util.HashMap;
 *
 * Scheduled task configuration
    public List<Short> days;
        ONE_TIME,
    public Date startTime;
 * Copyright (C) 2010-2024 DBeaver Corp and others


 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    public Date endTime;
