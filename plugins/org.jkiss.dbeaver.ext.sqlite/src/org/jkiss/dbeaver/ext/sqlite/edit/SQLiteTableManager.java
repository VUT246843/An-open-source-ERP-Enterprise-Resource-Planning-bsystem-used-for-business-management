
    }
        private DBECommand sourceCommand;
            "\nDROP TABLE "  + schemaPart + "temp"
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
        GenericTableIndex.class
 * limitations under the License.
            new SQLDatabasePersistAction(
        if (CommonUtils.isEmpty(attributes)) {
 *
 */
        NestedObjectCommand tableProps,
            super.validateCommand(monitor, options);
        return false;
            sourceCommand);
        }
    protected boolean isIncludeConstraintInDDL(DBRProgressMonitor monitor, DBSEntityConstraint constraint) {

 * Unless required by applicable law or agreed to in writing, software
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
            this.sourceCommand = sourceCommand;
    }
import java.util.List;

import org.jkiss.dbeaver.model.messages.ModelMessages;
        ));
            }
            ddl.append(" STRICT"); //$NON-NLS-1$
    {
    }
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
            "Table recreation to take into account some alterations (deletion of column, modification of foreign key...)"
            "INSERT INTO " + schemaPart + DBUtils.getQuotedIdentifier(table)
    }
        public void undoCommand(TableRecreateCommand command) {
 * See the License for the specific language governing permissions and
                                  DBUtils.getQuotedIdentifier(dataSource, command.getObject().getSchema().getName())
        @Override
        DBRProgressMonitor monitor,
        }
        final String columns = attributes.stream()
                + (attributes.isEmpty() ? " *" : "\n  " + columns) + "\nFROM " + DBUtils.getQuotedIdentifier(table)
    ) {
        actions.add(
 * distributed under the License is distributed on an "AS IS" BASIS,

        actions.add(new SQLDatabasePersistAction(
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {

                "Rename table",
        return CHILD_TYPES;
    {

                this.sourceCommand.validateCommand(monitor, options);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    @Override
        @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
}
/*
        }
        public void redoCommand(TableRecreateCommand command) {
        }
import org.jkiss.dbeaver.ext.generic.model.GenericTableConstraintColumn;
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteTableForeignKey;
                                      + "." : "") + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) +//$NON-NLS-1$
        SQLiteTableColumn.class,
            }
        public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;

            DBUtils.fireObjectUpdate(command.getObject(), true);

        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException {
package org.jkiss.dbeaver.ext.sqlite.edit;

        @NotNull
            .filter(DBPPersistedObject::isPersisted)
            if (command instanceof DBECommandDeleteObject && command.getObject() instanceof DBSObject object && DBUtils.isParentOf(object, getObject())) {
                    " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Class<? extends DBSObject>[] getChildTypes() {
    protected void appendTableModifiers(
import org.jkiss.utils.CommonUtils;


            DBUtils.fireObjectUpdate(command.getObject(), true);
			List<GenericTableConstraintColumn> columns = key.getAttributeReferences(monitor);
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
            }
    @Override
    public class TableRecreateCommand extends StructCreateCommand {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * DBeaver - Universal Database Manager
        return super.isIncludeConstraintInDDL(monitor, constraint);
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Collection;
        processObjectRename(commandContext, object, options, newName);
import org.jkiss.code.NotNull;
/**
            return super.aggregateCommand(command);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.DBException;

    }
            if (this.sourceCommand != null) {
        ));
    @Override
        ));
        }
    );
        }
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    protected void addTableRecreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull TableRecreateCommand command, @NotNull Map<String, Object> options) throws DBException
    public static class TableRecreateReflector implements DBECommandReflector<GenericTableBase, TableRecreateCommand> {
            .toList();
                return false;
        {
import java.util.ArrayList;
 *
        boolean alter,
            addTableRecreateActions(monitor, executionContext, actions, this, options);
    @Override
        );
        StringBuilder ddl,
            new TableRecreateReflector(),
            if (columns.size() == 1 && columns.get(0).getAttribute().isAutoIncrement()) {
        actions.add(new SQLDatabasePersistActionComment(

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
            "Insert values from temporary table to new table",
        if (object.isView()) {
        GenericUniqueKey.class,
    public void addRecreateCommand(DBECommandContext commandContext, SQLiteTable table, Map<String, Object> options, DBECommand sourceCommand) {
                return true;
        }
        actions.add(new SQLDatabasePersistAction(
    }
            .collect(Collectors.joining(",\n  "));
        ));
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.edit.DBECommand;
        ));
        GenericTableBase table,
        final GenericDataSource dataSource = command.getObject().getDataSource();
        if (constraint.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY && constraint instanceof GenericUniqueKey key) {
        public TableRecreateCommand(SQLiteTable object, String table, Map<String, Object> options, DBECommand sourceCommand)

        actions.add(new SQLDatabasePersistAction(
    }
            "Create temporary table from original table",
            "Drop original table",
            List<DBEPersistAction> actions = new ArrayList<>();
import org.jkiss.dbeaver.model.DBPScriptObject;
        }
            "Drop temporary table",
        SQLiteTableForeignKey.class,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        public boolean aggregateCommand(DBECommand<?> command)
        }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;


    protected boolean isIncludeDropInDDL(@NotNull GenericTableBase tableBase) {
            true,
import org.jkiss.dbeaver.model.DBUtils;

    @NotNull
        GenericSchema schema = table.getSchema();
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
            super(object, table, options);
                "ALTER TABLE " + (command.getObject().getSchema() != null ?
import org.jkiss.dbeaver.model.struct.DBStructUtils;
        {
 * SQLite table manager
        commandContext.addCommand(
        @Override
                + (attributes.isEmpty() ? "" : "\n (" + columns + ")") + "\nSELECT"
    }
        ));
            .map(DBUtils::getQuotedIdentifier)
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
public class SQLiteTableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
            throw new DBException("Table has no attributes");
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
                + (attributes.isEmpty() ? " *" : "\n  " + columns) + "\nFROM temp"
        String schemaPart = schema != null ? DBUtils.getQuotedIdentifier(schema) + "." : "";
            "CREATE TEMPORARY TABLE "  + schemaPart + "temp AS\nSELECT"
            "\nDROP TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DML) + ";\n"
            "Create new table",
import java.util.Map;
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;

        @Override
            throw new DBException("View rename is not supported");
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteTableColumn;
            DBStructUtils.generateTableDDL(monitor, table, DBPScriptObject.EMPTY_OPTIONS, false)
    @Override


        if (table instanceof SQLiteTable sqliteTable && sqliteTable.isHasStrictTyping()) {
        @Override
import org.jkiss.dbeaver.model.DBPPersistedObject;
    }
        final GenericTableBase table = command.getObject();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.edit.prop.DBECommandDeleteObject;
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteTable;
            table.getDataSource(),
        final Collection<? extends GenericTableColumn> attributes = CommonUtils.safeCollection(table.getAttributes(monitor)).stream()
            return actions.toArray(new DBEPersistAction[0]);
 * you may not use this file except in compliance with the License.
            new TableRecreateCommand(table, ModelMessages.model_jdbc_create_new_object, options, sourceCommand),
    @Override

        Map<String, Object> options

