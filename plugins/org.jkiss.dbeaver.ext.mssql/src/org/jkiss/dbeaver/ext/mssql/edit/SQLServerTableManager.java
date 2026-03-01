        return table; //$NON-NLS-1$
            for (SQLServerTableColumn column : CommonUtils.safeCollection(tableBase.getAttributes(monitor))) {
        boolean alter,
            appendTableModifiers(monitor, command.getObject(), command, query, true, options);
                    && ((SQLServerTableUniqueKey) constraint).getIndex() == index
 */
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * you may not use this file except in compliance with the License.
                if (table.isPersisted()) {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    {
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
import org.jkiss.code.NotNull;
                    ddl.append("\nMOVE TABLESPACE ").append(((SQLServerTablespace) tablespace).getName()); //$NON-NLS-1$
 * limitations under the License.
                    && constraint.getConstraintType() == DBSEntityConstraintType.UNIQUE_KEY
            query.append(command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" "); //$NON-NLS-1$
        super.addObjectExtraActions(monitor, executionContext, actionList, command, options);
        SQLServerTableBase tableBase = command.getObject();
    protected SQLServerTable createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
/*
/**
        @NotNull List<DBEPersistAction> actionList,
                    SQLServerTableColumnManager.addColumnCommentAction(actionList, column, false);
        }
        if (!tableBase.isPersisted()) {

package org.jkiss.dbeaver.ext.mssql.edit;
        DBRProgressMonitor monitor,

            DBWorkbench.getPlatform().getEditorsRegistry(),
        StringBuilder ddl,

        SQLServerTable table = new SQLServerTable(schema);
    protected void addObjectExtraActions(
                    (!object.isView() && CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE CONSTRAINTS" : "")
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
                "DROP " + getCreateTableType(object) +  //$NON-NLS-2$
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
        SQLServerTableForeignKey.class,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    }
                if (!CommonUtils.isEmpty(column.getDescription())) {
        @NotNull DBRProgressMonitor monitor,


    @Override
    {

    }
            actionList.add(new SQLDatabasePersistAction(query.toString()));
        @NotNull Map<String, Object> options
            try {
                }

    @Override
import org.jkiss.dbeaver.model.DBConstants;
*/
        return !index.isPrimary() && super.isIncludeIndexInDDL(monitor, index);

            for (DBSEntityConstraint constraint : constraints) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.DBException;
        @NotNull DBCExecutionContext executionContext,
        SQLObjectEditor<SQLServerTableCheckConstraint, SQLServerTableBase> ccm = getObjectEditor(
        @NotNull DBCExecutionContext executionContext,
        if (tableProps.getProperty("tablespace") != null) { //$NON-NLS-1$
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull SQLServerTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException
        processObjectRename(commandContext, object, options, newName);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            } catch (DBException e) {
            Object tablespace = table.getTablespace();
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        @NotNull DBRProgressMonitor monitor,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.mssql.model.*;
        }
        @NotNull NestedObjectCommand<SQLServerTableBase, PropertyHandler> command,
                    ddl.append("\nTABLESPACE ").append(((SQLServerTablespace) tablespace).getName()); //$NON-NLS-1$
        @NotNull ObjectChangeCommand command,
    {
 *

import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;

    @Override
    }
        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            )
import org.jkiss.utils.CommonUtils;
        SQLServerTableCheckConstraint.class,
import java.util.Collection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.sql.edit.SQLStructEditor;
            }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import java.util.Map;
                } else {
                        }
    {
                log.debug(e);
    @Override
                if (table instanceof SQLServerTable) {
        }
                ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        SQLServerExtendedProperty.class
                    if (!CommonUtils.isEmpty(checkConstraints)) {
    }
        SQLServerTableBase table,
    @Override
        Map<String, Object> options) {
            SQLServerTableCheckConstraint.class);
        SQLServerTableBase object = command.getObject();
            // Column comments for the newly created table
        );
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
/*
    protected void addExtraDDLCommands(DBRProgressMonitor monitor, SQLServerTableBase table, Map<String, Object> options, SQLStructEditor.StructCreateCommand createCommand) {
    }
    @Override
    }
}
                // Ignore indexes
        // ALTER
                ModelMessages.model_jdbc_drop_table,
            }
 */
 *
                }
        if (ccm != null) {
public class SQLServerTableManager extends SQLServerBaseTableManager<SQLServerTableBase> {
    protected void addObjectModifyActions(

                        for (SQLServerTableCheckConstraint checkConstraint : checkConstraints) {
        @NotNull Map<String, Object> options) {
    protected boolean isIncludeIndexInDDL(@NotNull DBRProgressMonitor monitor, @NotNull DBSTableIndex index) throws DBException {

                    Collection<SQLServerTableCheckConstraint> checkConstraints = CommonUtils.safeCollection(((SQLServerTable) table).getCheckConstraints(monitor));
                if (constraint instanceof SQLServerTableUniqueKey
    @Override
                }
    protected void appendTableModifiers(
    }
        NestedObjectCommand tableProps,
        if (constraints.size() > 0 && index.isUnique()) {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        
            }
import java.util.List;
            StringBuilder query = new StringBuilder("ALTER TABLE "); //$NON-NLS-1$
        SQLServerTableColumn.class,
                }
        setNewObjectName(monitor, schema, table);
            if (tablespace instanceof SQLServerTablespace) {
        SQLServerTableUniqueKey.class,
                    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        SQLServerTableIndex.class,
    @NotNull
        return CHILD_TYPES;
    }
    public Class<? extends DBSObject>[] getChildTypes()
        @NotNull List<DBEPersistAction> actionList,
 * SQLServer table manager
    @Override
                            createCommand.aggregateCommand(ccm.makeCreateCommand(checkConstraint, options));

        SQLServerSchema schema = (SQLServerSchema) container;
 * Unless required by applicable law or agreed to in writing, software
        Collection<? extends DBSEntityConstraint> constraints = index.getTable().getConstraints(monitor);
                   return false;
            new SQLDatabasePersistAction(
    ) throws DBException {
        actions.add(
                    " " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) +
