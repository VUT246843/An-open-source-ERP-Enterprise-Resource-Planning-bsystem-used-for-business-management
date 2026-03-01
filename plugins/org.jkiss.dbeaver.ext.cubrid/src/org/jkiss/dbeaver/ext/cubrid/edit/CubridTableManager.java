    @Nullable
        if ((!alter || command.getProperty("autoIncrement") != null) && table.getAutoIncrement() > 0) {
    @Override
        boolean isDBAGroup = dataSource.isDBAGroup();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;

    ) throws DBException {
        ));
}
        String key = partitions.getFirst().getExpression();
        query.append(String.format("PARTITION BY %s (%s)", type, key));
        @NotNull DBRProgressMonitor monitor,
    }
        GenericUniqueKey.class,
        @NotNull ObjectChangeCommand command,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            } else {
    public void appendPartition(DBRProgressMonitor monitor, StringBuilder query, CubridTable table) throws DBException {
        query.append(" (");
        }
    @Override
 * limitations under the License.
/*
                        value : SQLUtils.quoteString(partition, value)).append(")");
    @Override
package org.jkiss.dbeaver.ext.cubrid.edit;
 *
    ) {
        CubridTableColumn.class,
    public boolean canDeleteObject(GenericTableBase object) {
    }
    public boolean canEditObject(GenericTableBase object) {
        boolean supportsMultiSchema = dataSource.getSupportMultiSchema();
                    query.append("(").append(DBPDataKind.NUMERIC == column.getDataKind() ?
            query.append("\n\tPARTITION ").append(DBUtils.getQuotedIdentifier(partition.getDataSource(), partition.getPartitionName()));
        if ((!alter && !CommonUtils.isEmpty(table.getDescription())) || command.hasProperty("description")) {
public class CubridTableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
        String schemaName = table.getSchema().getName();
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBRProgressMonitor monitor,

            if (!CommonUtils.isEmpty(partition.getDescription())) {
        boolean isDBAGroup = table.getDataSource().isDBAGroup();
import org.jkiss.dbeaver.ext.cubrid.model.*;
            query.append(",");
        List<CubridPartition> partitions = table.getPartitions(monitor);
                return;
 * you may not use this file except in compliance with the License.
    }
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        @NotNull List<DBEPersistAction> actions,
        return CHILD_TYPES;
        String currentUser = table.getDataSource().getCurrentUser();
        @NotNull String newName
        @NotNull NestedObjectCommand command,
            + DBUtils.getQuotedIdentifier(table.getSchema())
        }
    @Override
        @NotNull Map<String, Object> options
                query.append(" VALUES LESS THAN ");
        }
            if (table.getContainer() == table.getSchema()) {
    public void renameObject(
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
        @NotNull Map<String, Object> options
import org.jkiss.code.NotNull;
        boolean alter,
        boolean isCurrentUser = user.getName().equalsIgnoreCase(dataSource.getCurrentUser());
    @Override
    }
    ) throws DBException {
            + " TO " + schemaName + DBUtils.getQuotedIdentifier(table.getDataSource(), command.getNewName())
        GenericTableBase object,
    @Override
            "ALTER TABLE " + (isSupportMultiSchema ? DBUtils.getQuotedIdentifier(table.getContainer()) + "." : "")
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.sql.SQLUtils;

        if (!isCompact(options)) {
            query.append("COLLATE ").append(table.getCollation().getName()).append(suffix);
            "Change Owner",
        String delimiter = getDelimiter(options);
        }
    }
    @NotNull
            query.append(" PARTITIONS ").append(partitions.size());

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull Map<String, Object> options
 * DBeaver - Universal Database Manager
    );
        boolean isSupportMultiSchema = table.getDataSource().getSupportMultiSchema();
        @NotNull NestedObjectCommand<GenericTableBase, PropertyHandler> command,
        @NotNull DBRProgressMonitor monitor,
    }
    @Override
        @NotNull List<DBEPersistAction> actionList,

import org.jkiss.code.Nullable;
            CubridTable table = (CubridTable) command.getObject();
            query.append("COMMENT = ").append(SQLUtils.quoteString(table, CommonUtils.notEmpty(table.getDescription()))).append(suffix);
            if (table.getDataSource().isServerVersionAtLeast(11, 0)) {
        return super.getChildObjects(monitor, object, childType);
import org.jkiss.dbeaver.model.struct.DBSObject;
                return;
                query.append(" COMMENT ").append(SQLUtils.quoteString(partition, partition.getDescription()));
            actionList.add(new SQLDatabasePersistAction(query.toString()));
        return !((CubridDataSource) object.getDataSource()).isShard();
import java.util.Map;
        query.deleteCharAt(query.length() - 1).append("\n)");
        if (command.getProperties().size() > 1 || command.getProperty("schema") == null) {
            "Rename table",

                query.append(table.isReuseOID() ? "REUSE_OID" : "DONT_REUSE_OID").append(suffix);
            }
        if (table.isPersisted()) {
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
            }
        @NotNull DBECommandContext commandContext,
                query.append(" VALUES IN ");
        CubridTable table = (CubridTable) genericTable;
        }
        GenericTableForeignKey.class,
import org.jkiss.utils.CommonUtils;
        actions.add(new SQLDatabasePersistAction(
                } else {
                query.append("(").append(DBPDataKind.NUMERIC == column.getDataKind() ?
        @NotNull List<DBEPersistAction> actions,
        CubridUser user = (CubridUser) container;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBCExecutionContext executionContext,

        @NotNull GenericTableBase object,

                }
    public boolean canCreateObject(@NotNull Object container) {
            return object.getAttributes(monitor);
                query.append(table.isReuseOID() ? "REUSE_OID" + suffix : "");
            StringBuilder query = new StringBuilder("ALTER TABLE ");
    protected void addObjectRenameActions(
        if (!((CubridDataSource) object.getDataSource()).isShard()) {
        if ((!alter && table.getCollation().getName() != null) || (command.getProperty("charset") != null
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

            query.append("AUTO_INCREMENT = ").append(table.getAutoIncrement()).append(suffix);
            + DBUtils.getQuotedIdentifier(table.getDataSource(), table.getName()) + " OWNER TO "
            String tableName = isSupportMultiSchema ? DBUtils.getQuotedIdentifier(table.getContainer()) + "."
 * See the License for the specific language governing permissions and
            }
            appendTableModifiers(monitor, table, command, query, true, options);

    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    ) throws DBException {
            || command.getProperty("collation") != null)) {
    protected void addObjectModifyActions(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        @NotNull Map<String, Object> options,
        } else {

    }

 *
        @NotNull ObjectRenameCommand command,
        }

        CubridDataSource dataSource = (CubridDataSource) user.getDataSource();
        }
        return isDBAGroup || supportsMultiSchema || isCurrentUser || !dataSource.isShard();
            String value = partition.getExpressionValues();
                if ("MAXVALUE".equalsIgnoreCase(value)) {
 * Unless required by applicable law or agreed to in writing, software
                : DBUtils.getQuotedIdentifier(table.getDataSource(), table.getName());
    public Class<? extends DBSObject>[] getChildTypes() {
        if ("HASH".equals(type)) {
        String schemaName = isSupportMultiSchema ? DBUtils.getQuotedIdentifier(table.getContainer()) + "." : "";
        query.append(delimiter);
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
import org.jkiss.dbeaver.model.DBUtils;
        CubridTableIndex.class
            if ("RANGE".equals(type)) {
            boolean isSupportMultiSchema = table.getDataSource().getSupportMultiSchema();
        @NotNull DBCExecutionContext executionContext,
    }
import java.util.Collection;
    ) {
import java.util.List;
    ) throws DBException {
            query.append(tableName);
        return !((CubridDataSource) object.getDataSource()).isShard();
        ));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        }
        }
        }
            processObjectRename(commandContext, object, options, newName);
        }
            query.deleteCharAt(query.length() - 1);
 * You may obtain a copy of the License at
    public Collection<? extends DBSObject> getChildObjects(

        if (childType == CubridTableColumn.class) {
        boolean isSupportMultiSchema = table.getDataSource().getSupportMultiSchema();
        String suffix = alter ? "," : delimiter;
        @NotNull GenericTableBase genericTable,
                    query.append("MAXVALUE");
    @Override
        actions.add(new SQLDatabasePersistAction(
        @NotNull DBCExecutionContext executionContext,
            if (!isDBAGroup || isSupportMultiSchema || currentUser.equalsIgnoreCase(schemaName)) {
        return !((CubridDataSource) object.getDataSource()).isShard();
            query.append(suffix);
 *
        CubridTable table = (CubridTable) command.getObject();

        if (table.isPartitioned() && table.isPersisted()) {
    @Override
                    value : "'" + value.replaceAll(",\\s*", "', '") + "'").append(")");
            } else { //LIST
    @Override
            }
        @NotNull StringBuilder query,
    public boolean canRenameObject(GenericTableBase object) {
            return;
        @NotNull DBRProgressMonitor monitor,

    protected void addObjectExtraActions(
        if (!alter || command.hasProperty("reuseOID")) {
        CubridTable table = (CubridTable) command.getObject();
        Class<? extends DBSObject> childType
            "RENAME TABLE " + schemaName + DBUtils.getQuotedIdentifier(table.getDataSource(), command.getOldName())
    }
        for (CubridPartition partition : partitions) {
            }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;

                + DBUtils.getQuotedIdentifier(table.getDataSource(), table.getName())
    protected void appendTableModifiers(
        @NotNull Map<String, Object> options
 * Copyright (C) 2010-2025 DBeaver Corp and others
        CubridTableColumn column = (CubridTableColumn) table.getAttribute(monitor, key);
        String type = partitions.getFirst().getTableType().toUpperCase();
        }
 */
import org.jkiss.dbeaver.model.DBPDataKind;
    @Override
            appendPartition(monitor, query, table);
