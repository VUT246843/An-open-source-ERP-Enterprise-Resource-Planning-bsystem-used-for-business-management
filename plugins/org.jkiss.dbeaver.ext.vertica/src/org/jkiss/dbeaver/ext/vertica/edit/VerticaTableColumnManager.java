
    public void addIncrementClauseToNestedDeclaration(DBECommandAbstract<GenericTableColumn> command, StringBuilder decl) {
import org.jkiss.code.NotNull;
        DataTypeModifier.appendModifier(monitor, column, sql, command);

        if (command.getProperty(DBConstants.PROP_ID_REQUIRED) != null) {
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
                                " TO " + DBUtils.getQuotedIdentifier(column.getDataSource(), command.getNewName())));
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    };
                                DBUtils.getQuotedIdentifier(column.getDataSource(), command.getOldName()) +
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericTableColumn object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    }
            return new ColumnModifier[]{VerticaDataTypeModifier, VerticaDefaultModifier, VerticaNotNullModifier};

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
package org.jkiss.dbeaver.ext.vertica.edit;
    @Override
        }
        }
    @Override
            sql.append(" SET DEFAULT ");
     * TODO: Vertica is originally based on PG. Maybe we should refactor this stuff somehow.

                actionList.add(new SQLDatabasePersistAction("Set column default", prefix + "SET DEFAULT " + column.getDefaultValue()));
            // According to SQL92 DEFAULT comes before constraints
}
            if (CommonUtils.isEmpty(column.getDefaultValue())) {
     */
                new SQLDatabasePersistAction(
        String prefix = "ALTER TABLE " + DBUtils.getObjectFullName(column.getTable(), DBPEvaluationContext.DDL) + " ALTER COLUMN " + DBUtils.getQuotedIdentifier(column) + " ";
    }
                        "Rename column",


        sql.append(" SET DATA TYPE ");
        // Increment clause already append with the IncrementModifier
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.DBException;
    protected ColumnModifier[] getSupportedModifiers(GenericTableColumn column, Map<String, Object> options) {
 * See the License for the specific language governing permissions and
        } else {
 *
        if (command.getProperty(DBConstants.PROP_ID_DEFAULT_VALUE) != null) {
/**

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
    private final ColumnModifier<GenericTableColumn> IncrementModifier = (monitor, column, sql, command) -> {
 *
                actionList.add(new SQLDatabasePersistAction("Drop column default", prefix + "DROP DEFAULT"));
    };
    private final ColumnModifier<GenericTableColumn> VerticaDataTypeModifier = (monitor, column, sql, command) -> {
            sql.append(" SET NOT NULL");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.utils.CommonUtils;
            sql.append(" IDENTITY"); //$NON-NLS-1$
     * Copy-pasted from PostgreSQL implementation.
    }
            }
        if (column.isAutoIncrement()) {
        }
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
    }
 * Unless required by applicable law or agreed to in writing, software
    {
        if (CommonUtils.isEmpty(command.getObject().getDefaultValue())) {
        super.addObjectModifyActions(monitor, executionContext, actionList, command, options);
        actions.add(
            sql.append(" DROP DEFAULT");
    /**
    private final ColumnModifier<GenericTableColumn> VerticaNotNullModifier = (monitor, column, sql, command) -> {
            actionList.add(new SQLDatabasePersistAction("Set column nullability", prefix + (column.isRequired() ? "SET" : "DROP") + " NOT NULL"));
        if (command.getProperty(DBConstants.PROP_ID_TYPE_NAME) != null || command.getProperty("maxLength") != null || command.getProperty("precision") != null || command.getProperty("scale") != null) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 */

 * DBeaver - Universal Database Manager

import java.util.List;

        final GenericTableColumn column = command.getObject();
        if (command.getObject().isRequired()) {
    };
        if (column.isPersisted()) {
 * You may obtain a copy of the License at
                        "ALTER TABLE " + column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " RENAME COLUMN " +
    private final ColumnModifier<GenericTableColumn> VerticaDefaultModifier = (monitor, column, sql, command) -> {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        }
        }
            // DefaultModifier and DataTypeModifier not supported in this case, IncrementModifier must be before NotNullModifier
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String typeClause = column.getFullTypeName();
    }
import java.util.Map;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException
            actionList.add(new SQLDatabasePersistAction("Set column type", prefix + "SET DATA TYPE " + typeClause));

 * Vertica table column manager
        final GenericTableColumn column = command.getObject();
    @Override
            } else {
    @Override

 * limitations under the License.
public class VerticaTableColumnManager extends GenericTableColumnManager implements DBEObjectRenamer<GenericTableColumn> {
import org.jkiss.dbeaver.model.DBConstants;
    };
        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 * distributed under the License is distributed on an "AS IS" BASIS,
            sql.append(" DROP NOT NULL");
/*
 */
        return super.getSupportedModifiers(column, options);
            DefaultModifier.appendModifier(monitor, column, sql, command);
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        if (column.isAutoIncrement() && !column.isPersisted()) {
    {
 *

            return new ColumnModifier[] {IncrementModifier, NotNullModifier};
        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
