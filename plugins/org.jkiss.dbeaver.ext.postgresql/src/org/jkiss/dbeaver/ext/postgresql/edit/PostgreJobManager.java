        } else {
            }
            "Rename job",
        }
                }

        values.add(SQLUtils.quoteString(job.getDataSource(), job.getHostAgent()));
            }
    }
        final PostgreDatabase database = ((PostgreDataSource) container).getDefaultInstance();
import org.jkiss.dbeaver.model.sql.SQLUtils;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
            "UPDATE pgagent.pga_job\nSET\n\tjobname=" + SQLUtils.quoteString(job.getDataSource(), command.getNewName()) + "\nWHERE jobid=" + job.getObjectId()
        }

    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
            values.add("jobhostagent=" + SQLUtils.quoteString(job.getDataSource(), CommonUtils.notEmpty(job.getHostAgent())));
        if (command.hasProperty("description")) {
package org.jkiss.dbeaver.ext.postgresql.edit;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLStructEditor;
        final StringJoiner values = new StringJoiner(", ", "(", ")");
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        final PostgreJob job = command.getObject();
        return object.getDatabase().jobCache;

        final String name = DBUtils.makeNewObjectName(monitor, "Job{0}", database, PostgreJob.class, PostgreDatabase::getJob, context);
        return new PostgreJob(monitor, database, name);
        if (command.getProperty("enabled") != null) {
        }
    }
        }
        }
    @NotNull
        final StringBuilder buffer = new StringBuilder();
import org.jkiss.dbeaver.model.struct.DBSObject;
    protected PostgreJob createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        values.add(String.valueOf(job.isEnabled()));
    @Override
    }
                if (stmt == null || error != null) {
}
        PostgreJobSchedule.class);
            }

        ));
            buffer.append(queries.get(0));
import java.util.StringJoiner;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
                }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            "DELETE FROM pgagent.pga_job\nWHERE jobid=" + job.getObjectId()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


                queries.add(nestedDeclaration);
        });
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
            }
    @Nullable
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.ext.postgresql.model.*;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        if (queries.size() > 1) {


    @Override
            values.add("jobdesc=" + SQLUtils.quoteString(job.getDataSource(), CommonUtils.notEmpty(job.getDescription())));
import org.jkiss.utils.CommonUtils;
        actions.add(new SQLDatabasePersistAction(

            ));

        final PostgreJob job = command.getObject();
            public void afterExecute(@NotNull DBCSession session, @Nullable DBCStatement stmt, @Nullable Throwable error) throws DBException {
        actions.add(new SQLDatabasePersistAction(
            buffer.append("SELECT jobid FROM job");
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
        final StringJoiner values = new StringJoiner(",\n\t");
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        }
            buffer.append("WITH\n\n");
            if (!CommonUtils.isEmpty(nestedDeclaration)) {
            for (int i = 0; i < queries.size(); i++) {
        return FEATURE_EDITOR_ON_CREATE;
                buffer.append(" AS (\n").append(queries.get(i)).append(")");
                "UPDATE pgagent.pga_job\nSET\n\t" + values + "\nWHERE jobid=" + job.getObjectId()
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) {

    @Override
    @Override
            values.add("jobenabled=" + job.isEnabled());
    public Class<? extends DBSObject>[] getChildTypes() {
import java.util.List;
 */
        if (command.getProperty("jobClass") != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
                    return;
        }
/*

 * limitations under the License.
                    buffer.append(",");
                    }
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
        values.add(String.valueOf(job.getJobClass().getObjectId()));

        values.add(SQLUtils.quoteString(job.getDataSource(), job.getName()));
            "Delete job",
        PostgreJobStep.class,
                continue;
                buffer.append("job");
            final String nestedDeclaration = nestedCommand.getNestedDeclaration(monitor, job, options);
        final List<String> queries = new ArrayList<>();

                buffer.append("\n\n");
                    buffer.append("_").append(i);
        return CHILD_TYPES;

 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
                try (DBCResultSet resultSet = stmt.openResultSet()) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        actions.add(new SQLDatabasePersistAction("Create job", buffer.toString()) {
        values.add(SQLUtils.quoteString(job.getDataSource(), job.getDescription()));
    }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.code.NotNull;
                "Alter job",
import org.jkiss.dbeaver.model.exec.DBCStatement;
            values.add("jobjclid=" + job.getJobClass().getObjectId());

            if (nestedCommand.getObject() == job) {
                if (i > 0) {

    @Override
    public DBSObjectCache<? extends DBSObject, PostgreJob> getObjectsCache(PostgreJob object) {
                    if (resultSet != null && resultSet.nextRow()) {

 *
    @Override
                        command.getObject().setId(CommonUtils.toLong(resultSet.getAttributeValue(0)));
        processObjectRename(commandContext, object, options, newName);
        ));
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreJob object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
import org.jkiss.dbeaver.model.DBPDataSource;
            @Override

public class PostgreJobManager extends SQLStructEditor<PostgreJob, PostgreDataSource> implements DBEObjectRenamer<PostgreJob> {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * You may obtain a copy of the License at
            actions.add(new SQLDatabasePersistAction(
 *
        if (command.hasProperty("hostAgent")) {
 * Unless required by applicable law or agreed to in writing, software
    }
        for (NestedObjectCommand<?, ?> nestedCommand : getNestedOrderedCommands(command)) {
        queries.add("INSERT INTO pgagent.pga_job(jobjclid, jobname, jobdesc, jobhostagent, jobenabled)\nVALUES " + values + "\nRETURNING jobid");

import org.jkiss.dbeaver.model.exec.DBCSession;

    }
                }
    @Override



        final PostgreJob job = command.getObject();
        if (values.length() > 0) {
                if (i < queries.size() - 1) {
    @Override
import org.jkiss.dbeaver.DBException;
import java.util.Map;
 *
        final PostgreJob job = command.getObject();
