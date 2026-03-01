            decl.append(" DEFAULT ").append(SQLUtils.quoteString(column, CommonUtils.notEmpty(column.getDefaultValue())));
    protected CubridTableColumn createDatabaseObject(
        CubridTableColumn column = (CubridTableColumn) command.getObject();
        boolean isView = column.getTable().isView();
        } else if (modifiers == null && typeName.equalsIgnoreCase("VARCHAR")) {
                query = (isView ? "ALTER VIEW " : "ALTER TABLE ") + table + " COMMENT ON COLUMN " + columnName + " = "
        CubridTable table = (CubridTable) container;
        for (ColumnModifier<GenericTableColumn> modifier : new ColumnModifier[] {CubridDataTypeModifier, NotNullModifier}) {
            sql.append(modifiers);
    @NotNull
    @Override
 * limitations under the License.
 * you may not use this file except in compliance with the License.
        String table = column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
        decl.append(columnName);
 * distributed under the License is distributed on an "AS IS" BASIS,
        String query;
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
 *
            String name = "column" + suffix++;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DBECommandAbstract<GenericTableColumn> command,
        @NotNull String newName
    ) {
        return decl;
        @NotNull ObjectChangeCommand command,
            }

import java.util.Map;
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            decl.append(" AUTO_INCREMENT");
        }
    @Override
    }
        @NotNull Map<String, Object> options
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
        String table = column.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.struct.DBSDataType;
            columnName = DBUtils.getQuotedIdentifier(column.getDataSource(), ((ObjectRenameCommand) command).getNewName());
 */
        if (!CommonUtils.isEmpty(column.getDefaultValue()) || ((DBECommandComposite) command).hasProperty("defaultValue")) {
        }

 *
            + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + " AS "
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        @NotNull DBRProgressMonitor monitor,
        @NotNull Map<String, Object> options,
 *
            processObjectRename(commandContext, object, options, newName);
    public boolean canCreateObject(@NotNull Object container) {
        if (container instanceof CubridPartition) {
        @NotNull ObjectRenameCommand command,
    @Override
    @Override
            "Rename column",
        if (((DBECommandComposite) command).hasProperty("required")) {
            modifier.appendModifier(monitor, column, decl, command);
import org.jkiss.dbeaver.ext.cubrid.model.CubridTable;
        ));
        actions.add(new SQLDatabasePersistAction(
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    ) {
    @Override
                actionList.add(new SQLDatabasePersistAction("Modify column", query));
        @Nullable Object container,
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            decl.append(" COMMENT ").append(SQLUtils.quoteString(column, CommonUtils.notEmpty(column.getDescription())));
    public void renameObject(
        @NotNull DBECommandContext context,
    }
        column.setDescription(null);
public class CubridTableColumnManager extends GenericTableColumnManager implements DBEObjectRenamer<GenericTableColumn> {
    ) throws DBException {
    ) throws DBException {
import org.jkiss.dbeaver.ext.cubrid.model.CubridPartition;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @NotNull
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        return !((CubridDataSource) object.getDataSource()).isShard();
        }
    public StringBuilder getNestedDeclaration(
        @NotNull Map<String, Object> options
        @NotNull DBECommandContext commandContext,
                return name;
        String columnName = DBUtils.getQuotedIdentifier(column.getDataSource(), column.getName());

    }
    }


        if (!((CubridDataSource) object.getDataSource()).isShard()) {
import org.jkiss.code.NotNull;
            }

import java.util.List;
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
        return super.canCreateObject(container);
            query = "ALTER TABLE " + table + " MODIFY " + getNestedDeclaration(monitor, column.getTable(), command, options);
    protected void addObjectModifyActions(

        if (!CommonUtils.isEmpty(column.getDescription()) || ((DBECommandComposite) command).hasProperty("description")) {
        sql.append(' ').append(typeName);
        @NotNull CubridTable parent
            if (parent.getAttribute(monitor, name) == null) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
        CubridDataSource dataSource = (CubridDataSource) column.getDataSource();
        }
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
        DBSDataType columnType = findBestDataType(table, DBConstants.DEFAULT_DATATYPE_NAMES);
import org.jkiss.dbeaver.model.DBPDataKind;
    }
        int suffix = 1;
            return false;
        return column;
        }
        final CubridTableColumn column = (CubridTableColumn) command.getObject();
        } else {
    };
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
/*
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        }
        @NotNull List<DBEPersistAction> actionList,
        column.setPersisted(false);
            + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())
    protected void addObjectRenameActions(
            if (command.hasProperty("description")) {
        if (command instanceof SQLObjectEditor.ObjectRenameCommand) {
        @NotNull Map<String, Object> options
}
        @NotNull DBCExecutionContext executionContext,
        CubridTableColumn column = (CubridTableColumn) command.getObject();
        @NotNull GenericTableBase owner,
    @Override
        @Nullable Object copyFrom,
        @NotNull DBRProgressMonitor monitor,
        String modifiers = SQLUtils.getColumnTypeModifiers(column.getDataSource(), column, typeName, dataKind);
        column.setTypeName(columnType == null ? "INTEGER" : columnType.getName());
        @NotNull DBRProgressMonitor monitor,
        column.setAutoIncrement(false);

        column.setDefaultValue(null);
        @NotNull DBECommandContext context,
import org.jkiss.utils.CommonUtils;
        DBPDataKind dataKind = column.getDataKind();
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
 * DBeaver - Universal Database Manager
    @NotNull
            actionList.add(new SQLDatabasePersistAction("Modify column", query));
    }
    public boolean canRenameObject(GenericTableColumn object) {
    ) {
        column.setOrdinalPosition(table.getCachedAttributes().size() + 1);
        @NotNull Map<String, Object> options
    ) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected String getNewColumnName(
                        + SQLUtils.quoteString(column, CommonUtils.notEmpty(column.getDescription()));
package org.jkiss.dbeaver.ext.cubrid.edit;
    }

        CubridTableColumn column = new CubridTableColumn(table, null, null, false, false, null);
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
        column.setRequired(false);
        column.setMaxLength(columnSize);

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        boolean isView = column.getTable().isView();
import org.jkiss.dbeaver.ext.cubrid.model.CubridTableColumn;
        @NotNull DBRProgressMonitor monitor,
        if (column.isAutoIncrement()) {
    public ColumnModifier<GenericTableColumn> CubridDataTypeModifier = (monitor, column, sql, command) -> {
        @NotNull GenericTableColumn object,
        String columnName = DBUtils.getQuotedIdentifier(column.getDataSource(), column.getName());
            sql.append('(').append(column.getPrecision()).append(')');
        @NotNull DBCExecutionContext executionContext,

        StringBuilder decl = new StringBuilder(40);
        if (column.isForeignKey() || isView) {
    }
            (isView ? "ALTER VIEW " : "ALTER TABLE ") + table + " RENAME COLUMN "
import org.jkiss.code.Nullable;
        while (true) {
        if (modifiers != null && !typeName.equalsIgnoreCase("STRING")) {
        }
        final String typeName = column.getTypeName();
        column.setName(getNewColumnName(monitor, context, table));
            decl.append(column.isRequired() ? "" : " NULL");
import org.jkiss.dbeaver.model.sql.SQLUtils;
        }


        }
        int columnSize = columnType != null && columnType.getDataKind() == DBPDataKind.STRING ? 100 : 0;
