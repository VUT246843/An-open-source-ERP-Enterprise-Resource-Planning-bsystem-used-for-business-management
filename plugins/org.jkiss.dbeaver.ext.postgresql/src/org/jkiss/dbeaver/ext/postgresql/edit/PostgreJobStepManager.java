        values.add(String.valueOf(step.isEnabled()));
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        final PostgreJobStep step = command.getObject();
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import java.util.Map;
import org.jkiss.code.NotNull;
        if (command.getProperty(DBConstants.PARAM_OBJECT_DEFINITION_TEXT) != null) {
/*
    @Override
    protected PostgreJobStep createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {

    }
    }
 * Unless required by applicable law or agreed to in writing, software
            values.add("jstcode=" + SQLUtils.quoteString(step.getDataSource(), step.getObjectDefinitionText(monitor, options)));
        }
    @Override

        values.add(SQLUtils.quoteString(step.getDataSource(), step.getKind().name()));
            "UPDATE pgagent.pga_jobstep\nSET\n\tjstname=" + SQLUtils.quoteString(step.getDataSource(), command.getNewName()) + "\nWHERE jstid=" + step.getObjectId()
        }

 * You may obtain a copy of the License at
        values.add(nested ? "(SELECT jobid FROM job)" : String.valueOf(step.getParentObject().getObjectId()));
        }
        if (values.length() > 0) {
    }
        return FEATURE_EDITOR_ON_CREATE;
        actions.add(new SQLDatabasePersistAction(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw new DBException("Target database or remote connection string must not be set when step kind is 'Batch'");

        if (command.hasProperty("remoteConnectionString")) {
    }
            "DELETE FROM pgagent.pga_jobstep\nWHERE jstid=" + step.getObjectId()
    @Override
        final PostgreJobStep step = command.getObject();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        values.add(SQLUtils.quoteString(step.getDataSource(), step.getTargetDatabase() == null ? "" : step.getTargetDatabase().getName()));
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        values.add(SQLUtils.quoteString(step.getDataSource(), step.getName()));

        }
        }


    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
            values.add("jstconnstr=" + SQLUtils.quoteString(step.getDataSource(), CommonUtils.notEmpty(step.getRemoteConnectionString())));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            throw new DBException("Target database or remote connection string must be set when step kind is 'SQL'");

        ));
    @Override
import org.jkiss.utils.CommonUtils;

        processObjectRename(commandContext, object, options, newName);
    @Override

        values.add(SQLUtils.quoteString(step.getDataSource(), step.getObjectDefinitionText(monitor, options)));
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {

        }
        if (command.getProperty("kind") != null) {
            values.add("jstonerror=" + SQLUtils.quoteString(step.getDataSource(), step.getOnError().name()));

        ));
        return object.getParentObject().getStepCache();
        if (step.getKind() == PostgreJobStep.StepKind.s && (step.getTargetDatabase() == null && CommonUtils.isEmptyTrimmed(step.getRemoteConnectionString()))) {
        values.add(SQLUtils.quoteString(step.getDataSource(), step.getDescription()));

            "Create step",
        if (CommonUtils.isEmptyTrimmed(step.getObjectDefinitionText(monitor, options))) {
public class PostgreJobStepManager extends SQLObjectEditor<PostgreJobStep, PostgreJob> implements DBEObjectRenamer<PostgreJobStep> {
        if (command.getProperty("enabled") != null) {
    }

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        }
    }
 */
        return new PostgreJobStep(job, name);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreJob;
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.struct.DBSObject;

        final PostgreJobStep step = command.getObject();
package org.jkiss.dbeaver.ext.postgresql.edit;

        }
    }

                "Alter step",
    public DBSObjectCache<? extends DBSObject, PostgreJobStep> getObjectsCache(PostgreJobStep object) {
            getCreateDDL(monitor, command.getObject(), options, false)
 * Copyright (C) 2010-2024 DBeaver Corp and others
                "UPDATE pgagent.pga_jobstep\nSET\n\t" + values + "\nWHERE jstid=" + step.getObjectId()

        }

        final StringJoiner values = new StringJoiner(",\n\t");
        }

import org.jkiss.dbeaver.model.DBUtils;

    @Override
        if (command.getProperty("onError") != null) {
        final PostgreJob job = (PostgreJob) container;
import java.util.StringJoiner;
    @NotNull

    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreJobStep object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    private String getCreateDDL(@NotNull DBRProgressMonitor monitor, @NotNull PostgreJobStep step, @NotNull Map<String, Object> options, boolean nested) {
        return "INSERT INTO pgagent.pga_jobstep (jstjobid, jstname, jstdesc, jstenabled, jstkind, jstonerror, jstcode, jstconnstr, jstdbname)\nVALUES " + values;
        }
        values.add(SQLUtils.quoteString(step.getDataSource(), step.getOnError().name()));
        if (step.getKind() == PostgreJobStep.StepKind.b && (step.getTargetDatabase() != null || !CommonUtils.isEmptyTrimmed(step.getRemoteConnectionString()))) {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
            actions.add(new SQLDatabasePersistAction(
        final StringJoiner values = new StringJoiner(", ", "(", ")");
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
}
        return new StringBuilder(getCreateDDL(monitor, command.getObject(), options, true));
    @Nullable
 * you may not use this file except in compliance with the License.
        final PostgreJobStep step = command.getObject();
    @Override
 *
            "Rename step",
    }
        if (command.hasProperty("description")) {

 *
            values.add("jstdbname=" + SQLUtils.quoteString(step.getDataSource(), step.getTargetDatabase() == null ? "" : step.getTargetDatabase().getName()));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreJobStep;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.DBException;
            throw new DBException("Code must not be empty");
 * See the License for the specific language governing permissions and
            values.add("jstkind=" + SQLUtils.quoteString(step.getDataSource(), step.getKind().name()));
            "Delete step",
            values.add("jstdesc=" + SQLUtils.quoteString(step.getDataSource(), CommonUtils.notEmpty(step.getDescription())));
        if (command.hasProperty("targetDatabase")) {

 *
    @Override
        values.add(SQLUtils.quoteString(step.getDataSource(), step.getRemoteConnectionString()));
import org.jkiss.code.Nullable;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
    protected StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, PostgreJob owner, DBECommandAbstract<PostgreJobStep> command, Map<String, Object> options) {
 * limitations under the License.
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import java.util.List;
            ));

        final String name = DBUtils.makeNewObjectName(monitor, "Step{0}", job, PostgreJobStep.class, PostgreJob::getStep, context);
    }
    @Override
        ));
 * DBeaver - Universal Database Manager
            values.add("jstenabled=" + step.isEnabled());
