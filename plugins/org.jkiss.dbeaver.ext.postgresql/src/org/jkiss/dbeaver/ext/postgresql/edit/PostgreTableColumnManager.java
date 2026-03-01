            try {
            // Remove serial type default value from DDL
        String ddl = "ALTER " + table.getTableTypeName() + " " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) +
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableColumnManager;
            }
        processObjectRename(commandContext, object, options, newName);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    }
                    ((PostgreSequence) table).getSequenceBody(monitor, sql, false);
        DefaultModifier.appendModifier(monitor, column, sql, command);
        if (command.hasProperty("fullTypeName") || command.hasProperty("maxLength") || command.hasProperty("precision") || command.hasProperty("scale")) {
            PostgreDefaultModifier,
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName())));
                actionList.add(new SQLDatabasePersistActionAtomic("Drop column default", prefix + "DROP DEFAULT", isAtomic));
import org.jkiss.code.NotNull;
            String[] foreignTableColumnOptions = column.getForeignTableColumnOptions();


            typeClause += " USING ";

 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
        actions.add(new SQLDatabasePersistAction("Drop table column", ddl));
import org.jkiss.utils.ArrayUtils;
import java.util.Map;
        actions.add(
            addColumnCommentAction(actionList, column);
            sql.append(column.getTypeName());
import java.util.List;
        String defaultValue = column.getDefaultValue();

 *
        }
        if (identity != null) {
        }
        if (!CommonUtils.isEmpty(command.getObject().getDescription())) {

            addColumnCommentAction(actions, command.getObject());
    protected PostgreTableColumn createDatabaseObject(@NotNull final DBRProgressMonitor monitor, @NotNull final DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        }
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreTypeHandler;
            sql.append(column.getStorage());
    protected final ColumnModifier<PostgreTableColumn> PostgreCommentModifier = (monitor, column, sql, command) -> {
/**
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
        if (column.getDepObjectId() != 0) {
    };
            typeClause += "::" + fullTypeName;
            modifiers = ArrayUtils.add(ColumnModifier.class, modifiers, PostgreCommentModifier);
    public DBSObjectCache<? extends DBSObject, PostgreTableColumn> getObjectsCache(PostgreTableColumn object)
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
        options.put(OPTION_NON_STRUCT_CREATE_ACTION, true);
//        ALTER [ COLUMN ] column SET ( attribute_option = value [, ... ] )
 * You may obtain a copy of the License at

import org.jkiss.code.Nullable;
//        ALTER [ COLUMN ] column { SET | DROP } NOT NULL
    };
    };
//        ALTER [ COLUMN ] column SET DEFAULT expression

                "Rename column",

        if (column.getDataSource().getServerType().supportsAlterTableColumnWithUSING()) {
        }
        return true;
        }
        PostgreTableBase table = (PostgreTableBase) column.getTable();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        } else {

        String prefix = "ALTER " + table.getTableTypeName() + " " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) +
            PostgreGeneratedModifier
        }

import org.jkiss.utils.CommonUtils;
            }
            }
        return decl;
            column = new PostgreTableColumn(table);
    }
import org.jkiss.dbeaver.model.*;
            DBUtils.getObjectFullName(column.getTable(), DBPEvaluationContext.DDL) + "." + DBUtils.getQuotedIdentifier(column) +
            " ALTER COLUMN " + DBUtils.getQuotedIdentifier(column) + " ";
            " IS " + SQLUtils.quoteString(column, CommonUtils.notEmpty(column.getDescription()))));
                    sql.append("(");
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
    @Override
        boolean isAtomic = column.getDataSource().getServerType().isAlterTableAtomic();
    }
    }
            modifiers = ArrayUtils.insertArea(ColumnModifier.class, modifiers, 1, new ColumnModifier[]{PostgreStorageModifier});
            }
            }
        if (column.getDataSource().getServerType().supportsStorageModifier()) {

            if (dataType != null) {
 * See the License for the specific language governing permissions and
    public boolean supportsObjectDefinitionOption(@NotNull String option) {

    };
    @Override
                    DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) + " TO " +
        }
    }
    protected final ColumnModifier<PostgreTableColumn> PostgreCollateModifier = (monitor, column, sql, command) -> {
        if (column.getDataSource().getServerType().supportsColumnsRequiring()) {
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreTypeHandlerProvider;
        } catch (DBException e) {

            modifiers = ArrayUtils.add(ColumnModifier.class, modifiers, NullNotNullModifier);
    @Override
    String OPTION_NON_STRUCT_CREATE_ACTION = "non.struct.create.action";
    {
                log.debug("Can't find the depended object.");
    {
        @NotNull ObjectDeleteCommand command,
                if (table instanceof PostgreSequence) {
                return;
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;
            typeClause += column.getDataSource().getSQLDialect().getTypeCastClause(column, DBUtils.getQuotedIdentifier(column), true);
        if (command.hasProperty(DBConstants.PROP_ID_REQUIRED)) {
        String prefix = "ALTER " + table.getTableTypeName() + " " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) +
            new SQLDatabasePersistAction(
        actionList.add(new SQLDatabasePersistActionAtomic("Set column storage", prefix + "SET STORAGE " + column.getStorage(), column.getDataSource().getServerType().isAlterTableAtomic()));
        }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    " RENAME COLUMN " +
            actionList.add(new SQLDatabasePersistActionAtomic("Set column nullability", prefix + (column.isRequired() ? "SET" : "DROP") + " NOT NULL", isAtomic));
            commandContext.addCommand(new EmptyCommand(table), new RefreshObjectReflector(), true);
    ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
 */
        if (column.getTable() instanceof PostgreTableForeign) {
    @Override
    protected final ColumnModifier<PostgreTableColumn> PostgreDefaultModifier = (monitor, column, sql, command) -> {
    {
import org.jkiss.dbeaver.model.edit.DBECommandWithOptions;
        actionList.add(new SQLDatabasePersistAction("Set column comment", "COMMENT ON COLUMN " +
    public boolean canEditObject(@NotNull PostgreTableColumn object) {
            addColumnStorageAction(actions, command.getObject());
        PostgreAttributeIdentity identity = column.getIdentity();

                    sql.append(")");
 * Postgre table column manager
        }
            sql.append(dataType.getFullyQualifiedName(DBPEvaluationContext.DDL));
        }
        if (copyFrom instanceof PostgreTableColumn) {
        PostgreTableBase table = (PostgreTableBase) column.getTable();

            PostgreCollateModifier,
            addColumnStorageAction(actionList, column);
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            column = new PostgreTableColumn(monitor, table, (PostgreTableColumn)copyFrom);

            sql.append(" -- ").append(CommonUtils.getSingleLineString(comment));
            sql.append(" GENERATED ALWAYS AS (").append(generatedValue).append(") STORED");
    };
    protected final ColumnModifier<PostgreTableColumn> PostgreDataTypeModifier = (monitor, column, sql, command) -> {
        }
        implements DBEObjectRenamer<PostgreTableColumn>, DBPScriptObjectExt2 {
        PostgreTableBase table = column.getParentObject();
        PostgreTableBase table = (PostgreTableBase) column.getTable();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            " DROP COLUMN " + DBUtils.getQuotedIdentifier(column);
        @NotNull DBRProgressMonitor monitor,
    protected ColumnModifier[] getSupportedModifiers(PostgreTableColumn column, Map<String, Object> options)
    @Override
    protected final ColumnModifier<PostgreTableColumn> PostgreIdentityModifier = (monitor, column, sql, command) -> {
        }
        ColumnModifier[] modifiers = {

                }
        @NotNull Map<String, Object> options
            }
        }

        PostgreTableBase table = command.getObject().getParentObject();
    @Override
                actionList.add(new SQLDatabasePersistActionAtomic("Set column default", prefix + "SET DEFAULT " + column.getDefaultValue(), isAtomic));
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (command.hasProperty("storage") && column.getStorage() != null) {
                sql.append(" COLLATE \"").append(collation.getName()).append("\"");
        try {
 *
                PostgreTableBase table = column.getSchema().getTable(monitor, column.getDepObjectId());
            if (foreignTableColumnOptions != null && foreignTableColumnOptions.length != 0) {
//        ALTER [ COLUMN ] column SET STATISTICS integer
        if (command.hasProperty(DBConstants.PROP_ID_DEFAULT_VALUE)) {
        return DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option);
    protected final ColumnModifier<PostgreTableColumn> PostgreStorageModifier = (monitor, column, sql, command) -> {
        PostgreTableBase table = (PostgreTableBase) container;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTableColumn object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    }
        if (table.isPersisted() && table instanceof PostgreViewBase) {
            && !table.getDataSource().getServerType().supportsStorageModifier()) {

    }
 */
        actions.add(new SQLDatabasePersistAction("Create new table column", sql));
        String comment = column.getDescription();
        } else {
//        ALTER [ COLUMN ] column RESET ( attribute_option [, ... ] )
    {
        if (!CommonUtils.isEmpty(generatedValue)) {
            final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);
    public StringBuilder getNestedDeclaration(@NotNull DBRProgressMonitor monitor, @NotNull PostgreTableBase owner, @NotNull DBECommandAbstract<PostgreTableColumn> command, @NotNull Map<String, Object> options)
            actionList.add(new SQLDatabasePersistActionAtomic("Set column type", prefix + "TYPE " + typeClause, isAtomic));
import org.jkiss.dbeaver.ext.postgresql.model.*;
    };
        return object.getParentObject().getContainer().getSchema().getTableCache().getChildrenCache(object.getParentObject());
        };
            final PostgreDataType dataType = table.getDatabase().getDataType(monitor, PostgreOid.VARCHAR);
        if (!createNonStructAction && !CommonUtils.isEmpty(comment)) {
        @NotNull DBCExecutionContext executionContext,
    @Override
//        ALTER [ COLUMN ] column DROP DEFAULT
        if (dataType != null) {
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
    public static void addColumnStorageAction(List<DBEPersistAction> actionList, PostgreAttribute column) {

        boolean createNonStructAction = command instanceof DBECommandWithOptions && ((DBECommandWithOptions) command).getOptions().containsKey(OPTION_NON_STRUCT_CREATE_ACTION); // Column already has comment in this action
            PostgreIdentityModifier,
 * Unless required by applicable law or agreed to in writing, software
        final PostgreTableBase table = object.getTable();
 *
        StringBuilder decl = super.getNestedDeclaration(monitor, owner, command, options);
            && table.getDataSource().getServerType().supportsAlterStorageStrategy()
/*
import org.jkiss.dbeaver.DBException;
        sql.append(' ');
    {
import org.jkiss.dbeaver.model.sql.SQLUtils;
package org.jkiss.dbeaver.ext.postgresql.edit;
    @Nullable
    }
    protected final ColumnModifier<PostgreTableColumn> PostgreGeneratedModifier = (monitor, column, sql, command) -> {
    }
            if (CommonUtils.isEmpty(column.getDefaultValue())) {
            PostgreCollation collation = column.getCollation(monitor);
            if (collation != null && !PostgreConstants.COLLATION_DEFAULT.equals(collation.getName())) {
            }




        String generatedValue = column.getGeneratedValue();
            " ALTER COLUMN " + DBUtils.getQuotedIdentifier(column) + " ";
            table.setObjectDefinitionText(null);
        if (command.getObject().getStorage() != null
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * DBeaver - Universal Database Manager
        return column;
    @Override
        final PostgreDataType dataType = column.getDataType();
        final PostgreAttribute column = command.getObject();
public class PostgreTableColumnManager extends SQLTableColumnManager<PostgreTableColumn, PostgreTableBase>
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            if (PostgreConstants.SERIAL_TYPES.containsKey(column.getDataType().getName())) {
    public static void addColumnCommentAction(List<DBEPersistAction> actionList, PostgreAttribute column) {
                sql.append(" OPTIONS").append(PostgreUtils.getOptionsString(foreignTableColumnOptions));
            sql.append(" ").append(identity.getDefinitionClause());
            } catch (DBException e) {

        @NotNull List<DBEPersistAction> actions,

        }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            column.setName(getNewColumnName(monitor, context, table));
    };
        }
            if (handler != null) {
//        ALTER [ COLUMN ] column [ SET DATA ] TYPE data_type [ COLLATE collation ] [ USING expression ]
    @Override
            getNestedDeclaration(monitor, table, command, options);
        }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)

        return modifiers;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        String sql = "ALTER " + table.getTableTypeName() + " " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) + " ADD " +
        if (!CommonUtils.isEmpty(defaultValue) && defaultValue.startsWith("nextval")) {
//        ALTER [ COLUMN ] column SET STORAGE { PLAIN | EXTERNAL | EXTENDED | MAIN }
        final PostgreTableColumn column;
    }
        if (!column.hasDefaultStorage()) {
        final String fullTypeName = column.getFullTypeName();
                column.setDataType(dataType);

            } else {
    }
        // PostgreSQL can't perform all changes by one query
    protected void addObjectDeleteActions(
        }
        }
        }
            log.debug(e);
                sql.append(handler.getTypeModifiersString(dataType, column.getTypeMod()));
            sql.append(" STORAGE ");
        PostgreTableColumn column = command.getObject();
    }
            // This column has dependency with object
            column.setOrdinalPosition(-1);
        final PostgreAttribute column = command.getObject();

        final PostgreAttribute column = command.getObject();
                "ALTER " + table.getTableTypeName() + " " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) +
}
        String typeClause = fullTypeName;

        }
            PostgreDataTypeModifier,
