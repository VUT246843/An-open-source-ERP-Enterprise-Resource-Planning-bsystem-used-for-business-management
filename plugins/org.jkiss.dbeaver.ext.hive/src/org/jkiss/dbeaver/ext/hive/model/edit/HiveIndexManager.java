import org.jkiss.code.NotNull;
 * limitations under the License.
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    ddl.append(DBUtils.getQuotedIdentifier(indexColumns.get(i)));
        List<GenericTableIndexColumn> indexColumns = tableIndex.getAttributeReferences(monitor);
                            " ON " + tableIndex.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL))); //$NON-NLS-2$
    public boolean canDeleteObject(@NotNull GenericTableIndex object) {
import org.jkiss.dbeaver.ext.hive.model.HiveTable;
        actions.add(new SQLDatabasePersistAction("Create table index", ddl.toString()));
import java.util.List;
    protected GenericTableIndex createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object from, @NotNull Map<String, Object> options) {
        }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        } else {
        String hiveIndexType;
import org.jkiss.dbeaver.model.DBUtils;
    public boolean canCreateObject(@NotNull Object container) {
package org.jkiss.dbeaver.ext.hive.model.edit;

public class HiveIndexManager extends GenericIndexManager {
        ddl.append("CREATE INDEX ").append(indexName).append(" ON TABLE ").append(tableName).append(" (");
                if (i == 0) {
 * Unless required by applicable law or agreed to in writing, software
    @Override

        String indexName = tableIndex.getName();
        if (indexType.getId().equals("COMPACT")) {
        GenericTableIndex tableIndex = command.getObject();
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                    ddl.append(", ").append(DBUtils.getQuotedIdentifier(indexColumns.get(i)));
    @Override
        return new HiveIndex((HiveTable) container, "NewIndex",false, "", "Compact", null);
            for (int i = 0; i < indexColumns.size(); i++) {
        return true;
                } else {
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndexColumn;
import org.jkiss.dbeaver.ext.generic.edit.GenericIndexManager;

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override
        String tableName = tableIndex.getTable().getName();
        actions.add(new SQLDatabasePersistAction("ALTER INDEX " + indexName + " ON " + tableName + " REBUILD"));
 *
        ddl.append(") AS ").append(hiveIndexType).append(" WITH DEFERRED REBUILD");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        StringBuilder ddl = new StringBuilder();
    }
    }
 * See the License for the specific language governing permissions and

        actions.add(new SQLDatabasePersistAction("Drop index table", "DROP INDEX " + tableIndex.getName() +
import org.jkiss.dbeaver.model.edit.DBECommandContext;
/*

 *

        }
        if (indexColumns != null) {
                }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBSIndexType indexType = tableIndex.getIndexType();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
}
 * You may obtain a copy of the License at

    }
import java.util.Map;
import org.jkiss.dbeaver.ext.hive.model.HiveIndex;
    @Override

 */
        return true;
 *     http://www.apache.org/licenses/LICENSE-2.0
        HiveIndex tableIndex = (HiveIndex) command.getObject();
            hiveIndexType = "\'COMPACT\'";
    @Override
    }
            hiveIndexType = "\'BITMAP\'";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
