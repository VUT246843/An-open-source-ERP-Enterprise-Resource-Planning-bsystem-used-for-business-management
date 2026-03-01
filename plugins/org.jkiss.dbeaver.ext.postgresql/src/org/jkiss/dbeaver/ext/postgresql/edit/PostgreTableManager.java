    }
    }
        PostgreTableConstraint.class,
    }
            command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL) + " ";
        @NotNull PostgreTableBase table,

    }
        @NotNull String tableName,

        }
public class PostgreTableManager extends PostgreTableManagerBase implements DBEObjectRenamer<PostgreTableBase> {
            }
        PostgreTableBase tableBase,
        String script = "DROP " + table.getTableTypeName() +  //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        actions.add(action);
 * distributed under the License is distributed on an "AS IS" BASIS,
        PostgreTableBase table = command.getObject();
            actionList.add(new SQLDatabasePersistAction(
        boolean isCompact = Boolean.TRUE.equals(options.get(DBPScriptObject.OPTION_SCRIPT_FORMAT_COMPACT));
    }

import java.util.List;
    @Override
            List<PostgreTableBase> superTables = postgreTable.getSuperTables(monitor);
        Map<String, Object> options) {
    
        }
    public DBSObjectCache<PostgreTableContainer, PostgreTableBase> getObjectsCache(PostgreTableBase object)
        PostgreTableBase table = command.getObject();
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    protected void appendTableModifiers(
        PostgreIndex.class
        return table;
 *
import org.jkiss.code.NotNull;
/*
                    generateAlterActions(monitor, actionList, command);
                "Rename table",

        if (command.getProperties().size() > 1 || command.getProperty(DBConstants.PROP_ID_DESCRIPTION) == null) {
        }
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
    {
            actionList.add(new SQLDatabasePersistAction(alterPrefix + (table.isHasOids() ? "SET WITH OIDS" : "SET WITHOUT OIDS")));//$NON-NLS-1$ //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBPScriptObject;
                    " RENAME TO " + DBUtils.getQuotedIdentifier(table.getDataSource(), command.getNewName())) //$NON-NLS-1$
    @Override

                    DBUtils.getQuotedIdentifier(table.getSchema()) + "." +
 */
        return null;
        if (childType == PostgreTableColumn.class) {

        }

    }
        return !table.isPartition();
import org.jkiss.dbeaver.model.struct.DBSObject;
        SQLDatabasePersistAction action = table.getSchema().isExternal() ?
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
}
        if (table.isPartition() && table instanceof PostgreTable postgreTable) {

    {
 *
import org.jkiss.utils.CommonUtils;
 *
        PostgreSchema schema = (PostgreSchema)container;
    }
        } else if (childType == PostgreTableForeign.class) {
            return table.getPersistence().getTableTypeClause();
import org.jkiss.dbeaver.DBException;
            if (command.getObject() instanceof PostgreTable) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    protected PostgreTableBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        if (command.hasProperty("partitionKey")) {//$NON-NLS-1$
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            new SQLDatabasePersistAction(
    }
import org.jkiss.dbeaver.model.messages.ModelMessages;
    @Override
 * you may not use this file except in compliance with the License.
            }
 * DBeaver - Universal Database Manager
        );
    @Override

        actions.add(
            return object.getAssociations(monitor);
    }
        return CHILD_TYPES;

 *     http://www.apache.org/licenses/LICENSE-2.0
        PostgreTableBase tableBase = command.getObject();
        }
import java.util.Collection;
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.DBUtils;
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * limitations under the License.
                    DBUtils.getQuotedIdentifier(table.getDataSource(), command.getOldName()) +
                return;
    @Override
    public Class<? extends DBSObject>[] getChildTypes()
 * See the License for the specific language governing permissions and
                "ALTER " + table.getTableTypeName() + " " + //$NON-NLS-1$
        }
                actions.add(0, new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_table, tableDDL));

import java.util.Map;
        @NotNull DBRProgressMonitor monitor,
        return object.getContainer().getSchema().getTableCache();
        boolean alter,
                String parent = superTables.get(0).getFullyQualifiedName(DBPEvaluationContext.DDL);
 * Licensed under the Apache License, Version 2.0 (the "License");
        NestedObjectCommand tableProps,
    @Override
        if (CommonUtils.isEmpty(table.getName())) {
        } else if (childType == PostgreTableConstraint.class) {
    {
import org.jkiss.dbeaver.ext.postgresql.model.*;
            actionList.add(new SQLDatabasePersistAction(alterPrefix + "SET TABLESPACE " + table.getTablespace(monitor).getName()));//$NON-NLS-1$

        }
        processObjectRename(commandContext, object, options, newName);
    );
            ));
    protected boolean hasAttrDeclarations(PostgreTableBase table) {
import org.jkiss.dbeaver.model.DBConstants;
        DBRProgressMonitor monitor,
            new SQLDatabasePersistAction(ModelMessages.model_jdbc_drop_table, script);

        final PostgreTableBase table = schema.getDataSource().getServerType().createNewRelation(monitor, schema, PostgreClass.RelKind.r, copyFrom);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected String getCreateTableType(PostgreTableBase table) {
            if (superTables == null || superTables.size() != 1) {
            } else {
 * You may obtain a copy of the License at
            if (tableDDL != null) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            }
        PostgreTablePolicy.class,

    @NotNull
            return "FOREIGN TABLE";//$NON-NLS-1$
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, PostgreTableBase object, Class<? extends DBSObject> childType) throws DBException {
        if (command.hasProperty("hasOids") && table.getDataSource().getServerType().supportsHasOidsColumn()) {//$NON-NLS-1$
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        final String alterPrefix = "ALTER " + table.getTableTypeName() + " " + //$NON-NLS-1$
        } else {
        String statement = "CREATE " + getCreateTableType(table) + " "; //$NON-NLS-1$ //$NON-NLS-2$
            new SQLDatabasePersistActionAtomic(ModelMessages.model_jdbc_drop_table, script) :
    }
    {
        final PostgreTable table = (PostgreTable) command.getObject();
    }
                    log.error(e);
                }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        } else {
    {
                } catch (DBException e) {
 * Unless required by applicable law or agreed to in writing, software
                return statement + tableName + " PARTITION OF " + parent + " " + range; //$NON-NLS-1$ //$NON-NLS-2$
    @Override
    {
        if (table instanceof PostgreTableForeign) {
    @Override
        if (command.hasProperty("tablespace")) {//$NON-NLS-1$
        }
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException
    @Nullable

        }
        ddl.append(tableBase.getDataSource().getServerType().getTableModifiers(monitor, tableBase, alter, getDelimiter(options)));
                alterPrefix + (table.isHasRowLevelSecurity() ? "ENABLE" : "DISABLE") + " ROW LEVEL SECURITY"


import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
        PostgreTableForeignKey.class,
        } else if (childType == PostgreIndex.class) {
import org.jkiss.code.Nullable;
        super.addStructObjectCreateActions(monitor, executionContext, actions, command, options);
        StringBuilder ddl,
    private void generateAlterActions(DBRProgressMonitor monitor, List<DBEPersistAction> actionList, ObjectChangeCommand command) throws DBException {
            String tableDDL = tableBase.getDataSource().getServerType().readTableDDL(monitor, tableBase);
import org.jkiss.dbeaver.model.DBPDataSource;
            " " + tableName +  //$NON-NLS-1$
    }
                String range = postgreTable.getPartitionRange(monitor);

    @Override
    }
        if (tableBase.isPersisted()) {
            table.setName(getNewChildName(monitor, schema, table.getName()));

    }
        }
        @NotNull Map<String, Object> options) throws DBException {
    @Override
            return object.getConstraints(monitor);
                log.error("Cant't read partition parent table name for table " + table.getFullyQualifiedName(DBPEvaluationContext.DDL));
    protected String beginCreateTableStatement(
 */
    }
package org.jkiss.dbeaver.ext.postgresql.edit;
            return object.getAttributes(monitor);
                try {

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;
    @Override
        PostgreTableColumn.class,
        return super.getMakerOptions(dataSource) | FEATURE_SUPPORTS_COPY;

        final String tableName = DBUtils.getEntityScriptName(table, options);
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        if (command.hasProperty("hasRowLevelSecurity") && table.getDataSource().getServerType().supportsRowLevelSecurity()) {
            (CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE" : "");
            actionList.add(new SQLDatabasePersistAction(alterPrefix + "PARTITION BY " + table.getPartitionKey()));//$NON-NLS-1$
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)

    @Override
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
            return object.getIndexes(monitor);
        return statement + tableName + " (" + (isCompact ? "" : GeneralUtils.getDefaultLineSeparator()); //$NON-NLS-1$
            setNewObjectName(monitor, schema, table);
 * Postgre table manager
