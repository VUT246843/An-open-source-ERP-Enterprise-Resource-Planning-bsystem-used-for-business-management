        if (log.isDebugEnabled()) {
    private String computeDeltaSQL(DBRProgressMonitor monitor, ObjectChangeCommand command) {
        if (!CommonUtils.isEmpty(command.getObject().getDescription())) {
        }
    ) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.model.DBUtils;
 */

 *


        return object.getParentObject().getContainer().getTableCache().getChildrenCache((DB2Table) object.getParentObject());
    public DBSObjectCache<? extends DBSObject, DB2TableColumn> getObjectsCache(DB2TableColumn object) {
            return "";
    // ------
        String comment = db2Column.getDescription();
                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME COLUMN " +
    }
        if (command.hasProperty("dataType") || command.hasProperty("maxLength") || command.hasProperty("scale")) {

    }
        if ((db2TableBase != null) && (db2TableBase.getClass().equals(DB2Table.class))) {
}
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
        if (required != null) {
            }
                    DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) + " TO " + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName()))

    // Helpers
    }

        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        }
            if (required) {
        return sb.toString();
    @Nullable
        }
        processObjectRename(commandContext, object, options, newName);
        super.addObjectCreateActions(monitor, executionContext, actions, command, options);

    }

        boolean hasColumnChanges = false;
 * See the License for the specific language governing permissions and
 *

                sb.append(CLAUSE_DROP_NULL);
        if (command.getProperties().isEmpty() ||
    private static final String LINE_SEPARATOR = GeneralUtils.getDefaultLineSeparator();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

        @NotNull DBRProgressMonitor monitor,
        @NotNull List<DBEPersistAction> actions,

        return new SQLDatabasePersistAction(CMD_REORG, reorgSQL);
*/
    // -----

            actionList.add(buildReorgAction(db2Column));
/*

        String commentSQL = String.format(SQL_COMMENT, tableName, columnName, comment);
            actions.add(buildCommentAction(command.getObject()));

import java.util.Map;
    // Business Contract
            DataTypeModifier.appendModifier(monitor, column, sb, command);
    private static final String CLAUSE_DROP_NULL = " DROP NOT NULL";
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    // ------
            } else {
            for (Map.Entry<Object, Object> entry : command.getProperties().entrySet()) {
        if (CommonUtils.isNotEmpty(db2Column.getDescription())) {
    private static final String SQL_ALTER = "ALTER TABLE %s ALTER COLUMN %s ";

import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
        DB2TableColumn column = command.getObject();
 * limitations under the License.
 *
    private static final String CMD_COMMENT = "Comment on Column";
    @Override

            sb.append(CLAUSE_SET_TYPE);
                                                  Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
    public boolean canEditObject(@NotNull DB2TableColumn object) {
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableColumnManager;
    private static final String CMD_REORG = "Reorg table";
                log.debug(entry.getKey() + "=" + entry.getValue());
        DB2TableColumn db2Column = command.getObject();
    @Override
    private static final String CMD_ALTER = "Alter Column";
import org.jkiss.dbeaver.DBException;
        }
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ext.db2.model.DB2Table;
        DB2TableBase db2TableBase = object.getParentObject();

    }
        // Edit is only available for DB2Table and not for other kinds of tables (View, MQTs, Nicknames..)
        String tableName = db2Column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
    @Override
    @Override
        @NotNull Map<String, Object> options
    // -----------------
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.utils.CommonUtils;
                hasColumnChanges = true;

        @NotNull ObjectCreateCommand command,
            sb.append(LINE_SEPARATOR);
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        }
        }
    private static final String CLAUSE_SET_NULL = " SET NOT NULL";
        actions.add(
    }
    private static final String SQL_REORG = "CALL SYSPROC.ADMIN_CMD('REORG TABLE %s')";
        // Comment
    }
 */
            return true;
 * DB2 Table Column Manager
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        if (!command.getProperties().isEmpty()) {
        String reorgSQL = String.format(SQL_REORG, tableName);
        if (hasColumnChanges) {
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
            // Be Safe, Add a reorg action
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import java.util.List;
            return false;
                String sqlAlterColumn = String.format(SQL_ALTER, db2Column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL), deltaSQL);
            sb.append(LINE_SEPARATOR);
            new SQLDatabasePersistAction(

    // -----
package org.jkiss.dbeaver.ext.db2.manager;
    }
 * DBeaver - Universal Database Manager
    private static final String SQL_COMMENT = "COMMENT ON COLUMN %s.%s IS '%s'";
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    private DBEPersistAction buildReorgAction(DB2TableColumn db2Column) {
                actionList.add(new SQLDatabasePersistAction(CMD_ALTER, sqlAlterColumn));
        Boolean required = (Boolean) command.getProperty("required");
    // -----------------
    // Alter
        column.setName(getNewColumnName(monitor, context, (DB2TableBase) container));
    // -------

 * distributed under the License is distributed on an "AS IS" BASIS,
                "Rename column",


        } else {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull DB2TableColumn object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {

        }
    // Create
    // -------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return new SQLDatabasePersistAction(CMD_COMMENT, commentSQL);
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
            if (!deltaSQL.isEmpty()) {
            actionList.add(buildCommentAction(db2Column));
            final String deltaSQL = computeDeltaSQL(monitor, command);
    protected DB2TableColumn createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container,

        DB2TableColumn column = new DB2TableColumn((DB2TableBase) container);
 * @author Denis Forveille
    private static final String CLAUSE_SET_TYPE = " SET DATA TYPE ";
    private DBEPersistAction buildCommentAction(DB2TableColumn db2Column) {
        final DB2TableColumn column = command.getObject();
        return column;
    }
import org.jkiss.code.Nullable;
        String columnName = db2Column.getName();
 * you may not use this file except in compliance with the License.
        );
        StringBuilder sb = new StringBuilder(128);
public class DB2TableColumnManager extends SQLTableColumnManager<DB2TableColumn, DB2TableBase> implements DBEObjectRenamer<DB2TableColumn> {
        }

                sb.append(CLAUSE_SET_NULL);
/**
    @Override
            (command.getProperties().size() == 1 && command.getProperty("description") != null)) {
    protected void addObjectCreateActions(
    @Override
        sb.append(column.getName());
        String tableName = db2Column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
