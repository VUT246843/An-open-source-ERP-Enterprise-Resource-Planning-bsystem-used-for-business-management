
        actions.add(
    protected OracleTable createDatabaseObject(
                    ddl.append(delimiter).append("TABLESPACE ").append(((OracleTablespace) tablespace).getName()); //$NON-NLS-1$

    public Class<? extends DBSObject>[] getChildTypes() {
        NestedObjectCommand tableProps,
    }
import org.jkiss.dbeaver.DBException;
        StringBuilder ddl,

        @NotNull ObjectChangeCommand command,
    ) throws DBException {
                "Rename table",
        @NotNull Map<String, Object> options
        );
            appendTableModifiers(monitor, command.getObject(), command, query, true, options);
                }
        processObjectRename(commandContext, object, options, newName);
 * Unless required by applicable law or agreed to in writing, software
        );
import org.jkiss.dbeaver.ext.oracle.model.*;
        OracleTablePartition.class
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (command.getProperties().size() > 1 || command.getProperty("comment") == null) { //$NON-NLS-1$
                if (table.isPersisted()) {
    ) {

    }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
                }
    protected void appendTableModifiers(
 *
    }
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
/**
        OracleTableConstraint.class,
        @NotNull List<DBEPersistAction> actions,
    @Override
import java.util.Map;
        @NotNull DBRProgressMonitor monitor,
 */
            if (tablespace instanceof OracleTablespace) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        @NotNull ObjectRenameCommand command,
    @Override
                } else {
    protected void addObjectExtraActions(
    protected void addObjectRenameActions(
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
        @NotNull Map<String, Object> options
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
            StringBuilder query = new StringBuilder("ALTER TABLE "); //$NON-NLS-1$

/*
        }
 * Oracle table manager
 * See the License for the specific language governing permissions and
        boolean alter,
                "DROP " + (object.isView() ? "VIEW" : "TABLE") +
 *
    @Override
    @NotNull
        OracleTableForeignKey.class,
    ) throws DBException {
    @Override
    @Nullable
        @NotNull NestedObjectCommand<OracleTable, PropertyHandler> command,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    protected void addObjectModifyActions(

    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
                    ddl.append(delimiter).append("MOVE TABLESPACE ").append(((OracleTablespace) tablespace).getName()); //$NON-NLS-1$
    @Override
        @NotNull DBRProgressMonitor monitor,
                    " IS " + SQLUtils.quoteString(table, table.getComment())));

        Object container,
            }
import org.jkiss.dbeaver.model.DBUtils;
    ) throws DBException {
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
    ) {
        OracleTable table = command.getObject();
        @NotNull DBECommandContext context,

    }
        @NotNull List<DBEPersistAction> actionList,
        @NotNull List<DBEPersistAction> actions,

                    OracleTableColumnManager.addColumnCommentAction(actions, column, column.getTable());
 *
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
                    " " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) +
import java.util.List;
        @NotNull DBCExecutionContext executionContext,
        @NotNull DBCExecutionContext executionContext,
        if (!table.isPersisted()) {
        OracleTableIndex.class,
 */
        Map<String, Object> options
        }
        if (tableProps.getProperty("tablespace") != null) { //$NON-NLS-1$
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @NotNull Map<String, Object> options

        return CHILD_TYPES;
        OracleTableColumn.class,
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.oracle.edit;
        Object copyFrom,
        if (command.getProperty("comment") != null) { //$NON-NLS-1$
}
                    " RENAME TO " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())) //$NON-NLS-1$
            String delimiter = getDelimiter(options);
import org.jkiss.dbeaver.model.messages.ModelMessages;
        DBRProgressMonitor monitor,
    );

    }
    public DBSObjectCache<? extends DBSObject, OracleTable> getObjectsCache(OracleTable object) {
        OracleSchema schema = (OracleSchema) container;
        actions.add(
            Object tablespace = table.getTablespace();
            new SQLDatabasePersistAction(
        @NotNull Map<String, Object> options
                "Comment table",
        @NotNull DBRProgressMonitor monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0
        return (DBSObjectCache) object.getSchema().tableCache;
            actionList.add(new SQLDatabasePersistAction(query.toString()));
        return table;
        setNewObjectName(monitor, schema, table);
        OracleTable table = new OracleTable(schema, ""); //$NON-NLS-1$
            for (OracleTableColumn column : CommonUtils.safeCollection(table.getAttributes(monitor))) {
 * limitations under the License.

                if (!CommonUtils.isEmpty(column.getDescription())) {


    @Override
                    (!object.isView() && CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE CONSTRAINTS" : "")
        // ALTER
        @NotNull DBRProgressMonitor monitor,
public class OracleTableManager extends SQLTableManager<OracleTable, OracleSchema> implements DBEObjectRenamer<OracleTable> {
        OracleTable table,
                ModelMessages.model_jdbc_drop_table,
            new SQLDatabasePersistAction(

                "ALTER TABLE " + DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) + //$NON-NLS-1$
            // Column comments for the newly created table
        @NotNull DBCExecutionContext executionContext,
            actions.add(new SQLDatabasePersistAction(
            query.append(command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" "); //$NON-NLS-1$
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                "COMMENT ON TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) +
        }
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull OracleTable object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Override
        }
            }
            )
        OracleTable object = command.getObject();
