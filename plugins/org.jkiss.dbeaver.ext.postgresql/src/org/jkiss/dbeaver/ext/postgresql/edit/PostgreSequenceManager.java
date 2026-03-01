
import org.jkiss.utils.CommonUtils;
            actions.add(new SQLDatabasePersistAction(
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    protected PostgreSequence createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
    @Override
 *
        return FEATURE_SAVE_IMMEDIATELY;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    @Override
    @Override
 */
        }
            ddl.append("\n\t");
        if (options.containsKey("cacheValue")) {
    }

                ddl.append("NO ");
                "COMMENT ON SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL) +
import org.jkiss.dbeaver.model.messages.ModelMessages;
    @Override
        return schema.getDataSource().getServerType().createSequence(schema);
    @Override
                    " IS " + SQLUtils.quoteString(command.getObject(), CommonUtils.notEmpty(command.getObject().getDescription()))));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
    }
            new SQLDatabasePersistAction("Rename sequence",
            actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.DBException;
            }
        }
        actions.add(
        PostgreSchema schema = (PostgreSchema) container;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 */


    }
/*
    }
        final StringBuilder sequenceOptions = new StringBuilder();
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
            ));
        if (options.get("lastValue") != null) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        addSequenceOptions(sequenceOptions, command.getProperties());
import org.jkiss.dbeaver.model.DBUtils;
        }
            ddl.append("\n\tCACHE ").append(options.get("cacheValue"));
    }
public class PostgreSequenceManager extends SQLObjectEditor<PostgreTableBase, PostgreSchema> implements DBEObjectRenamer<PostgreTableBase> {
    }
import org.jkiss.code.NotNull;

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {


            "CREATE SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * you may not use this file except in compliance with the License.

        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
        final String sequenceName = sequence.getFullyQualifiedName(DBPEvaluationContext.DDL);
                "Alter sequence",
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        }
            "Create sequence",
    }
        }
 * Postgre sequence manager
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (options.containsKey("maxValue")) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
    public DBSObjectCache<? extends DBSObject, PostgreTableBase> getObjectsCache(PostgreTableBase object) {
        final PostgreSequence sequence = (PostgreSequence) command.getObject();
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        return object.getContainer().getSchema().getTableCache();
 * Unless required by applicable law or agreed to in writing, software
    }
 *
            ddl.append("\n\tMINVALUE ").append(options.get("minValue"));
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreTableBase, PropertyHandler> command, @NotNull Map<String, Object> options) {
        }


    {
    @Override
        actions.add(
        if (options.containsKey("startValue")) {
        }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSequence;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
        ));
        if (options.containsKey("cycled")) {
        if (options.containsKey("incrementBy")) {
            ddl.append("\n\tRESTART ").append(options.get("lastValue"));
        actions.add(new SQLDatabasePersistAction(
            ddl.append("CYCLE");
        if (sequenceOptions.length() > 0) {
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                "ALTER SEQUENCE " + DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) +
    {
            ddl.append("\n\tINCREMENT BY ").append(options.get("incrementBy"));
 * You may obtain a copy of the License at
    @Override
        if (CommonUtils.isEmpty(command.getObject().getName())) {
import org.jkiss.dbeaver.model.struct.DBSObject;
        ObjectRenameCommand command = new ObjectRenameCommand(object, ModelMessages.model_jdbc_rename_object, options, newName);
                "Comment sequence",
}

        commandContext.addCommand(command, new RenameObjectReflector(), true);
        throws DBException

    @Override
            ddl.append("\n\tSTART ").append(options.get("startValue"));
            if (!CommonUtils.toBoolean(options.get("cycled"))) {
                    " RENAME TO " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())));

    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
        if (options.containsKey("minValue")) {
/**
    }
    private void addSequenceOptions(StringBuilder ddl, Map<Object, Object> options) {
            new SQLDatabasePersistAction("Drop sequence", "DROP SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
 * limitations under the License.
import java.util.List;

    {
import java.util.Map;
        }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            ddl.append("\n\tMAXVALUE ").append(options.get("maxValue"));
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.sql.SQLUtils;
                "ALTER SEQUENCE " + sequenceName + sequenceOptions

            throw new DBException("Sequence name cannot be empty");
        );
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
package org.jkiss.dbeaver.ext.postgresql.edit;
 * DBeaver - Universal Database Manager
