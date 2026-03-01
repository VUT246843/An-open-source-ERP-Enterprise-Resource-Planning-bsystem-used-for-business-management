        @NotNull DBCExecutionContext executionContext,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
            try {

        processObjectRename(commandContext, object, options, newName);
        @NotNull Map<String, Object> options,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    public boolean canEditObject(@NotNull SQLServerTableColumn object) {
    @Override
    {
            totalProps--;

 * DBeaver - Universal Database Manager
                long seedValue = identityInfo.getSeedValue();
                SQLServerTableColumn.IdentityInfo identityInfo = column.getIdentityInfo(monitor);

        @NotNull DBRProgressMonitor monitor,
        return column.getTable() instanceof SQLServerTableType;
import org.jkiss.dbeaver.model.struct.DBSObject;
    ) throws DBException {
import org.jkiss.code.Nullable;
        @NotNull List<DBEPersistAction> actions,
        @NotNull DBRProgressMonitor monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
                "Drop default constraint",

import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
            String defaultValue = column.getDefaultValue();
    }
        if (totalProps > 0) {
            column.setDataType(dt);
}
    @NotNull
        @NotNull List<DBEPersistAction> actions,
                column.getTable().getObjectId(),
    {
        return !isTableType(object) && super.canEditObject(object);
        }
        );
    }
        @NotNull Map<String, Object> options
        }
                sql.append(" IDENTITY(").append(seedValue).append(",").append(incrementValue).append(")");
    protected void addObjectCreateActions(
        addDropConstraintAction(actions, command.getObject());
    {
        @NotNull SQLServerTableColumn object,
import org.jkiss.dbeaver.model.struct.DBSDataType;
        @NotNull DBECommandContext commandContext,
            addDropConstraintAction(actionList, column);
    }
 */
 * limitations under the License.
                sql.append(" FOR ").append(DBUtils.getQuotedIdentifier(column)); //$NON-NLS-1$
        return CHILD_TYPES;
            sql.append(" AS ").append(definition);
            actionList.add(new SQLDatabasePersistAction(

        return null;
        @NotNull Map<String, Object> options)
    @Nullable
        final String definition = column.getComputedDefinition();
                monitor,
 */
            if (commandWithOptions.getOptions().containsKey(DBPScriptObject.OPTION_DDL_SOURCE)){
    protected final ColumnModifier<SQLServerTableColumn> ComputedModifier = (monitor, column, sql, command) -> {
        @NotNull List<DBEPersistAction> actionList,
    public boolean canDeleteObject(@NotNull SQLServerTableColumn object) {
                    " ALTER COLUMN " + getNestedDeclaration(monitor, column.getTable(), command, options))); //$NON-NLS-1$

                "Modify column",
        }
        boolean hasComment = command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null;
                column.getTable().getDatabase(),
            }
    @Override
            DBECommandWithOptions commandWithOptions = (DBECommandWithOptions)command;
    }
        }
        if (!column.isPersisted() || ddlSource) {
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                StringBuilder sql = new StringBuilder();
        if (hasComment) totalProps--;
    public DBSObjectCache<? extends DBSObject, SQLServerTableColumn> getObjectsCache(SQLServerTableColumn object)
 *     http://www.apache.org/licenses/LICENSE-2.0
                actionList.add(new SQLDatabasePersistAction("Alter default value", sql.toString())); //$NON-NLS-1$
        }
import org.jkiss.utils.CommonUtils;
 * SQLServer table column manager
    };
            sql.append(" PERSISTED");
            ));
                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " DROP CONSTRAINT " + DBUtils.getQuotedIdentifier(column.getDataSource(), column.getDefaultConstraintName())
        column.setOrdinalPosition(-1);

                    isUpdate ? "sp_updateextendedproperty" : "sp_addextendedproperty") +
import org.jkiss.dbeaver.model.*;

    @Override
        actions.add(
        @NotNull Map<String, Object> options
        column.setMaxLength(columnType != null && columnType.getDataKind() == DBPDataKind.STRING ? 100 : 0);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        final DBSDataType columnType = findBestDataType(table, "varchar"); //$NON-NLS-1$
    }



        if (CommonUtils.isNotEmpty(column.getComputedDefinition())) {
    }
import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull DBCExecutionContext executionContext,
    protected void addObjectRenameActions(
        if (hasComment) {
    static void addColumnCommentAction(List<DBEPersistAction> actionList, SQLServerTableColumn column, boolean isUpdate) {
    }
            // [Re]create default constraint. Classic MS-style pain in the ass

public class SQLServerTableColumnManager extends SQLTableColumnManager<SQLServerTableColumn, SQLServerTableBase> implements DBEStructEditor<SQLServerTableColumn>, DBEObjectRenamer<SQLServerTableColumn> {



import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
        if (columnType instanceof SQLServerDataType dt) {
    }
 * you may not use this file except in compliance with the License.
    @Override
 *
            addColumnCommentAction(actions, command.getObject(), false);
        int totalProps = command.getProperties().size();
    @Override
            return new ColumnModifier[]{ComputedModifier, NotNullModifier};
import java.util.Collection;
        }
    @Override
    protected final ColumnModifier<SQLServerTableColumn> IdentityModifier = (monitor, column, sql, command) -> {
        if (command instanceof DBECommandWithOptions) {
import org.jkiss.dbeaver.DBException;
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBCExecutionContext executionContext,
        SQLServerExtendedProperty.class );
            }
        if (column.isIdentity() && !column.isTimestamp()) {
                "Rename column",
            }
                    " 'MS_Description', " + SQLUtils.quoteString(column, column.getDescription()) + "," +
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
    public void renameObject(

                long incrementValue = identityInfo.getIncrementValue();
                "Add column comment",
import org.jkiss.dbeaver.model.edit.*;
        }
                    " N'" + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DML) + "." + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) +
    };
        @NotNull SQLObjectEditor<SQLServerTableColumn, SQLServerTableBase>.ObjectDeleteCommand command,
        if (column.isPersisted() && command.hasProperty("defaultValue")) {
    ) throws DBException {
    protected ColumnModifier[] getSupportedModifiers(SQLServerTableColumn column, Map<String, Object> options)
            if (!CommonUtils.isEmpty(defaultValue)) {
            DefaultModifier.appendModifier(monitor, column, sql, command);
        @NotNull ObjectChangeCommand command,
        String collationName = column.getCollationName();
        }
                sql.append("ALTER TABLE ").append(column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" ADD "); //$NON-NLS-1$ //$NON-NLS-2$
    @Override
import org.jkiss.code.NotNull;
                    " 'schema', " + SQLUtils.quoteString(column, column.getTable().getSchema().getName()) + "," +
                if (incrementValue <= 0) incrementValue = 1;
            boolean isUpdate = SQLServerUtils.isCommentSet(
        }
    };
                    " 'column', " + SQLUtils.quoteString(column, column.getName())));

            actions.add(new SQLDatabasePersistAction(

        final SQLServerTableColumn column = new SQLServerTableColumn(table);
import org.jkiss.dbeaver.ext.mssql.model.*;
    @Override
    protected void addObjectDeleteActions(
        return new ColumnModifier[] {DataTypeModifier, IdentityModifier, CollateModifier, SQLServerDefaultModifier, NullNotNullModifier};
                    "EXEC " + SQLServerUtils.getSystemTableName(column.getTable().getDatabase(), "sp_rename") +
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableColumnManager;
    }
            new SQLDatabasePersistAction(
 *
        @NotNull DBCExecutionContext executionContext,
                    " 'table', " + SQLUtils.quoteString(column, column.getTable().getName()) + "," +
        if (column.isComputedPersisted()) {
    };
    }
/**
        if (!CommonUtils.isEmpty(collationName)) {
        if (column.getDefaultConstraintName() != null) {
    ) throws DBException {
package org.jkiss.dbeaver.ext.mssql.edit;
        super.addObjectDeleteActions(monitor, executionContext, actions, command, options);
                    "' , N'" + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName()) + "', 'COLUMN'")
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    {
    }
        column.setTypeName(columnType == null ? "varchar" : columnType.getName()); //$NON-NLS-1$

        @NotNull ObjectRenameCommand command,
    public Class<? extends DBSObject>[] getChildTypes() {
        final SQLServerTableColumn column = command.getObject();
                log.error("Error reading identity information", e); //$NON-NLS-1$
        return !isTableType(object) && super.canDeleteObject(object);
    }
    {
        super.addObjectCreateActions(monitor, executionContext, actions, command, options);

                DefaultModifier.appendModifier(monitor, column, sql, command);
 *
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, SQLServerTableColumn object, Class<? extends DBSObject> childType) throws DBException {
    @Override

/*
    private static void addDropConstraintAction(@NotNull List<DBEPersistAction> actions, @NotNull SQLServerTableColumn column) {
        column.setName(getNewColumnName(monitor, context, table));
import java.sql.Types;
        }
        final SQLServerTableColumn column = command.getObject();

        @NotNull DBRProgressMonitor monitor,
import java.util.Map;

                "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + //$NON-NLS-1$
            new SQLDatabasePersistAction(
        if (CommonUtils.isNotEmpty(definition)) {
                    column.getTable().getDatabase(),
    protected final ColumnModifier<SQLServerTableColumn> SQLServerDefaultModifier = (monitor, column, sql, command) -> {
    protected SQLServerTableColumn createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException
            addColumnCommentAction(actionList, column, isUpdate);
            sql.append(" COLLATE ").append(collationName); //$NON-NLS-1$
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        return object.getParentObject().getContainer().getTableCache().getChildrenCache(object.getParentObject());
                if (seedValue <= 0) seedValue = 1;
                "EXEC " + SQLServerUtils.getSystemTableName(
        @NotNull List<DBEPersistAction> actions,
        final SQLServerTableBase table = (SQLServerTableBase) container;
    protected final ColumnModifier<SQLServerTableColumn> CollateModifier = (monitor, column, sql, command) -> {
    protected void addObjectModifyActions(
        }

        boolean ddlSource = false;
        return column;

                ddlSource = true;
        @NotNull String newName
        if (CommonUtils.isNotEmpty(command.getObject().getDescription())) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Nullable
        @NotNull ObjectCreateCommand command,
                column.getObjectId());
        column.setValueType(columnType == null ? Types.VARCHAR : columnType.getTypeID());
        actionList.add(
 * See the License for the specific language governing permissions and
        }
    }

            } catch (DBCException e) {
    private boolean isTableType(SQLServerTableColumn column) {
                SQLServerObjectClass.OBJECT_OR_COLUMN,
        @NotNull Map<String, Object> options)
    @Override
