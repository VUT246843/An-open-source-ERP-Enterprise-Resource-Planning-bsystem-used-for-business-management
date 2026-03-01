    }
        values.add(toCompactArray(schedule.getMonths()));

    @Override
        final StringJoiner joiner = new StringJoiner(",", "'{", "}'");
import java.util.List;
        return FEATURE_EDITOR_ON_CREATE;
        return object.getParentObject().getScheduleCache();
            "UPDATE pgagent.pga_schedule\nSET\n\tjscname=" + SQLUtils.quoteString(schedule.getDataSource(), command.getNewName()) + "\nWHERE jscid=" + schedule.getObjectId()
        if (values.length() > 0) {
    private String toCompactArray(@NotNull boolean[] values) {
 * you may not use this file except in compliance with the License.
                "UPDATE pgagent.pga_schedule\nSET\n\t" + values + "\nWHERE jscid=" + schedule.getObjectId()
        final String name = DBUtils.makeNewObjectName(monitor, "Schedule{0}", job, PostgreJobSchedule.class, PostgreJob::getSchedule, context);
            "DELETE FROM pgagent.pga_schedule\nWHERE jscid=" + schedule.getObjectId()
    @Override
        }
package org.jkiss.dbeaver.ext.postgresql.edit;
public class PostgreJobScheduleManager extends SQLObjectEditor<PostgreJobSchedule, PostgreJob> implements DBEObjectRenamer<PostgreJobSchedule> {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Nullable

 *
            "Rename schedule",
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    }
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreJobSchedule object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
        if (command.hasProperty("description")) {
    @Override
/*
import org.jkiss.dbeaver.ext.postgresql.model.PostgreJob;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        values.add(toCompactArray(schedule.getWeekDays()));
import org.jkiss.code.NotNull;
 *
        values.add(SQLUtils.quoteString(schedule, schedule.getDescription()));
import java.util.Map;
import org.jkiss.utils.CommonUtils;
        return new PostgreJobSchedule(job, name);

        final StringJoiner values = new StringJoiner(",\n\t");
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
            values.add("jscdesc=" + SQLUtils.quoteString(schedule.getDataSource(), CommonUtils.notEmpty(schedule.getDescription())));
        }
    @Override
        actions.add(new SQLDatabasePersistAction(
            getCreateDDL(command.getObject(), false)
        processObjectRename(commandContext, object, options, newName);

        values.add(toCompactArray(schedule.getHours()));
    }
        }
    protected StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, PostgreJob owner, DBECommandAbstract<PostgreJobSchedule> command, Map<String, Object> options) {

    @Override
    public DBSObjectCache<? extends DBSObject, PostgreJobSchedule> getObjectsCache(PostgreJobSchedule object) {

        actions.add(new SQLDatabasePersistAction(
        values.add(toCompactArray(schedule.getMonthDays()));
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
        values.add(SQLUtils.quoteString(schedule, schedule.getName()));
            values.add("jscenabled=" + schedule.isEnabled());
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager


import org.jkiss.dbeaver.ext.postgresql.model.PostgreJobSchedule;
            "Delete schedule",

import org.jkiss.dbeaver.DBException;
            "Create schedule",
        values.add(schedule.getEnd() != null ? SQLUtils.quoteString(schedule, schedule.getEnd().toString()) : SQLConstants.NULL_VALUE);
import org.jkiss.dbeaver.model.sql.SQLConstants;
    }
        final PostgreJobSchedule schedule = command.getObject();
        ));

        final PostgreJobSchedule schedule = command.getObject();
        ));
            ));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        values.add(SQLUtils.quoteString(schedule, schedule.getStart().toString()));


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
        return new StringBuilder(getCreateDDL(command.getObject(), true));
                "Alter schedule",
        if (command.getProperty("enabled") != null) {
 * See the License for the specific language governing permissions and
 */
        final PostgreJob job = (PostgreJob) container;
        final StringJoiner values = new StringJoiner(", ", "(", ")");
}
            actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.code.Nullable;
    @Override
        values.add(toCompactArray(schedule.getMinutes()));
 * Unless required by applicable law or agreed to in writing, software
    }
        ));
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        return joiner.toString();
    }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * limitations under the License.
import java.util.StringJoiner;
    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
    }


 * Copyright (C) 2010-2024 DBeaver Corp and others
        final PostgreJobSchedule schedule = command.getObject();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSObject;
        actions.add(new SQLDatabasePersistAction(
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
    private String getCreateDDL(@NotNull PostgreJobSchedule schedule, boolean nested) {
            joiner.add(value ? "t" : "f");
    }

    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }

 *
        return "INSERT INTO pgagent.pga_schedule (jscjobid, jscname, jscdesc, jscenabled, jscstart, jscend, jscminutes, jschours, jscweekdays, jscmonthdays, jscmonths)\nVALUES " + values;
        values.add(String.valueOf(schedule.isEnabled()));
    @NotNull
    @Override
    protected PostgreJobSchedule createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
        values.add(nested ? "(SELECT jobid FROM job)" : String.valueOf(schedule.getParentObject().getObjectId()));

    @NotNull
        for (boolean value : values) {
    }
