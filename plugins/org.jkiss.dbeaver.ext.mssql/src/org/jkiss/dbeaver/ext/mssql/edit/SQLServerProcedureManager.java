 * DBeaver - Universal Database Manager
            throw new DBException("Procedure body cannot be empty");
            }
    protected SQLServerProcedure createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options) {
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
/**
    @Override
            boolean isUpdate = SQLServerUtils.isCommentSet(

import java.util.Map;
    }
import org.jkiss.code.Nullable;
    }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
            new SQLDatabasePersistAction("Drop procedure", "DROP " + command.getObject().getProcedureType() + " " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
        processObjectRename(commandContext, object, options, newName);
    public void renameObject(
    }

                    "', " + SQLUtils.quoteString(procedure.getDataSource(), command.getNewName())));
            if (procedure.getProcedureType().equals(DBSProcedureType.FUNCTION)) {
import org.jkiss.dbeaver.DBException;
                procedureType = "function";
    protected void addObjectRenameActions(

        @NotNull ObjectRenameCommand command,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
public class SQLServerProcedureManager extends SQLServerObjectManager<SQLServerProcedure, SQLServerSchema>

        if (CommonUtils.isEmpty(command.getObject().getName())) {
                SQLServerObjectClass.OBJECT_OR_COLUMN,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    ) {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            throw new DBException("Procedure name cannot be empty");
                    " N'" + procedure.getContainer().getFullyQualifiedName(DBPEvaluationContext.DML) + "." + DBUtils.getQuotedIdentifier(procedure.getDataSource(), command.getOldName()) +
                        " 'MS_Description', " + SQLUtils.quoteString(procedure, procedure.getDescription()) + "," +
        return object.getContainer().getProcedureCache();
            new SQLDatabasePersistAction(
    }
 *
        createOrReplaceProcedureQuery(monitor, executionContext, actions, command.getObject(), true);
            actions.add(new SQLDatabasePersistAction("Create procedure", procedure.getBody()));
        } else {
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
import org.jkiss.dbeaver.model.DBConstants;
        }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerProcedure;
    }
    ) throws DBException {
    public DBSObjectCache<SQLServerSchema, SQLServerProcedure> getObjectsCache(SQLServerProcedure object) {
            return;

        actions.add(
import org.jkiss.dbeaver.ext.mssql.model.SQLServerObjectClass;
    @Override
    @Override

    @Override
import org.jkiss.dbeaver.ext.mssql.model.SQLServerSchema;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (procedure.getDatabase() == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 */
        @NotNull Map<String, Object> options
        final SQLServerProcedure procedure = command.getObject();

            actions.add(
        @NotNull DBECommandContext commandContext,
    @Override
            } else {
 *
                new SQLDatabasePersistAction(
}

    }
    @Nullable
        @NotNull DBCExecutionContext executionContext,
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
        );
            if (procedure.getDatabase() == null) {
                return;
        @NotNull Map<String, Object> options,
 * limitations under the License.
        @NotNull List<DBEPersistAction> actions,
                    "EXEC " + SQLServerUtils.getSystemTableName(database, isUpdate ? "sp_updateextendedproperty" : "sp_addextendedproperty") +
                        " 'schema', " + SQLUtils.quoteString(procedure, procedure.getContainer().getName()) + "," +


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
            actions.add(new SQLDatabasePersistAction("Alter procedure", SQLServerUtils.changeCreateToAlterDDL(procedure.getDataSource(), procedure.getBody())));
                0);
import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
        addDatabaseSwitchAction2(executionContext, actions, procedure.getContainer().getDatabase());
                "EXEC " + SQLServerUtils.getSystemTableName(procedure.getDatabase(), "sp_rename") +
 *
    }
        }
 * Unless required by applicable law or agreed to in writing, software
        @NotNull SQLServerProcedure object,
                    "Add procedure comment",
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<SQLServerProcedure, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
                        "'" + procedureType + "' ," + SQLUtils.quoteString(procedure, procedure.getName())));
        @NotNull DBRProgressMonitor monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull String newName
                "Rename procedure",
    }
                monitor,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.code.NotNull;
        return new SQLServerProcedure((SQLServerSchema) container);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        }
        actions.add(
    @Override
package org.jkiss.dbeaver.ext.mssql.edit;

 * SQLServerProcedureManager
import org.jkiss.utils.CommonUtils;
    @Override
        addDatabaseSwitchAction2(executionContext, actions, command.getObject().getContainer().getDatabase());
        addDatabaseSwitchAction1(executionContext, actions, command.getObject().getContainer().getDatabase());
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
            String procedureType;
        final SQLServerProcedure procedure = command.getObject();
    @Override
        return FEATURE_EDITOR_ON_CREATE;
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.DBPDataSource;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

 */
            }
 * See the License for the specific language governing permissions and
                database,
        if (create) {
        if (!command.getObject().isPersisted() && CommonUtils.isEmpty(command.getObject().getBody())) {
    }
                procedure.getObjectId(),
        }
import org.jkiss.dbeaver.model.DBUtils;
import java.util.List;

import org.jkiss.dbeaver.ext.mssql.model.SQLServerDatabase;
    @Override
            createOrReplaceProcedureQuery(monitor, executionContext, actionList, command.getObject(), false);
            SQLServerDatabase database = procedure.getContainer().getDatabase();
    private void createOrReplaceProcedureQuery(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, SQLServerProcedure procedure, boolean create) throws DBException {
    implements DBEObjectRenamer<SQLServerProcedure> {
        throws DBException {
                procedureType = "procedure";
        addDatabaseSwitchAction1(executionContext, actions, procedure.getContainer().getDatabase());

/*
