            ExasolTableColumn.class,
        @NotNull DBCExecutionContext executionContext,
    @Override
            String commentSQL = String.format(SQL_COMMENT, exasolTable.getFullyQualifiedName(DBPEvaluationContext.DDL), exasolTable.getDescription());


    // Helpers
        );

        if (commentAction != null) {
    // ------
 *

    // ------
    public void appendTableModifiers(
 * You may obtain a copy of the License at
        if (command.getProperties().size() > 0) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }

    // ------
        return table;
    @NotNull
 *
        Map<String, Object> options) {
import org.jkiss.code.NotNull;
        super.addStructObjectCreateActions(monitor, executionContext, actions, command, options);
 * Unless required by applicable law or agreed to in writing, software

            return null;
 */
        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        // Eventually add Comment
 * See the License for the specific language governing permissions and
            return new SQLDatabasePersistAction(CMD_COMMENT, commentSQL);
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull ExasolTable object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {

        }
        return object.getSchema().getTableCache();
    }
    }
     */
    private static final String NEW_TABLE_NAME = "NEW_TABLE";
        if (commentAction != null) {
        setNewObjectName(monitor, (ExasolSchema) exasolSchema, table);

    public void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
 * you may not use this file except in compliance with the License.

    // ------
     * This implementation is intentionally left blank.

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
    private static final String CMD_COMMENT = "Comment on Table";

import java.util.List;
 *
            new SQLDatabasePersistAction(CMD_RENAME, sql)
 * Licensed under the Apache License, Version 2.0 (the "License");
                && ((command.getProperties().get("hasPartitionKey").toString()).equals("false"))) {
            } else if (command.getProperties().size() > 1) {
        DBRProgressMonitor monitor,
    // -------
        return CHILD_TYPES;
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                            Object copyFrom, @NotNull Map<String, Object> options) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

        ExasolTable table = new ExasolTable((ExasolSchema) exasolSchema, NEW_TABLE_NAME);
        DBEPersistAction commentAction = buildCommentAction(command.getObject());
        String sql = String.format(SQL_RENAME_TABLE,
    public ExasolTable createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object exasolSchema,

    }
    );
            actions.add(commentAction);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    // Alter

    // -------
    public void addObjectModifyActions(
        }
public class ExasolTableManager extends SQLTableManager<ExasolTable, ExasolSchema> implements DBEObjectRenamer<ExasolTable> {

        ExasolTable exasolTable,
        // no-op

    private DBEPersistAction buildCommentAction(ExasolTable exasolTable) {
import org.jkiss.code.Nullable;
        }

                sb.append(" ");
import org.jkiss.utils.CommonUtils;
    // -----------------

 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull ObjectChangeCommand command,
                appendTableModifiers(monitor, command.getObject(), command, sb, true, options);
            ExasolTableIndex.class

    private static final String SQL_RENAME_TABLE = "RENAME TABLE %s TO %s";
            ExasolTableForeignKey.class,
        DBEPersistAction commentAction = buildCommentAction(exasolTable);
import org.jkiss.dbeaver.DBException;
    @Override
    @SuppressWarnings("rawtypes")
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override

        @NotNull Map<String, Object> options) {
package org.jkiss.dbeaver.ext.exasol.manager;
            ExasolTableUniqueKey.class,
        } else {
            }
        @NotNull List<DBEPersistAction> actionList,
            if (command.getProperties().containsKey("hasPartitionKey")
    // ------

 * limitations under the License.

        actions.add(
    private static final String CMD_RENAME = "Rename Table";
    // -----------------
    }
                StringBuilder sb = new StringBuilder(128);
                actionList.add(new SQLDatabasePersistAction(CMD_ALTER, sb.toString()));
    }
import org.jkiss.dbeaver.model.DBUtils;
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    public DBSObjectCache<ExasolSchema, ExasolTable> getObjectsCache(ExasolTable object) {
    @Override
    /**
 * Copyright (C) 2010-2024 DBeaver Corp and others
        boolean alter,

    }
/*
        ExasolTable exasolTable = command.getObject();
 */
        StringBuilder ddl,
}
            DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName()));
    // Business Contract

    
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * @author Karl
        @NotNull DBRProgressMonitor monitor,
    @Override
    @Override
    private static final String CMD_ALTER = "Alter Table";
/**
    private static final String SQL_ALTER = "ALTER TABLE ";


                actionList.add(new SQLDatabasePersistAction(
    @Nullable
            actionList.add(commentAction);
    public void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
                sb.append(SQL_ALTER);
            DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()),

        NestedObjectCommand tableProps,
    // Rename
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.ext.exasol.model.*;
    }
                sb.append(exasolTable.getFullyQualifiedName(DBPEvaluationContext.DDL));
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        if (CommonUtils.isNotEmpty(exasolTable.getDescription())) {
    @Override

 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
    // Create
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Class<? extends DBSObject>[] getChildTypes() {
import java.util.Map;
    // ------
                    "ALTER TABLE " + exasolTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + " DROP PARTITION KEYS"));
    private static final String SQL_COMMENT = "COMMENT ON TABLE %s IS '%s'";
        }
