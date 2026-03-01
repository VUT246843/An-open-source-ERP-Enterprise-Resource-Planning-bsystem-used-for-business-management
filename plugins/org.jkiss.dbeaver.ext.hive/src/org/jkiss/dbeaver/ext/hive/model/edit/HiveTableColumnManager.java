                }
        try {

                    GenericTableColumn column = attributes.get(i);
        HiveTableColumn hiveTableColumn = (HiveTableColumn) command.getObject();
                        ddl.append(DBUtils.getQuotedIdentifier(column)).append(" ").append(column.getTypeName());
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
    }
            StringBuilder ddl = new StringBuilder();
    @Override
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;

                            ddl.append(typeModifiers);
        return true;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
                        if (i != 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
 * you may not use this file except in compliance with the License.
                                getNestedDeclaration(monitor, table, command, options) + ")") );
public class HiveTableColumnManager extends GenericTableColumnManager {
                        }

    @Override
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
}
                        }
            actions.add(new SQLDatabasePersistAction("Drop table column", ddl.toString()));

                            ddl.append(" ");

                        if (column.getDescription() != null) {
            }
            log.debug("Columns not found in table: " + table.getName(), e);

    @Override
                        if (i != attributes.size() - 1) {
    @Override
                        if (typeModifiers != null) {
 */
    public StringBuilder getNestedDeclaration(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase owner, @NotNull DBECommandAbstract<GenericTableColumn> command, @NotNull Map<String, Object> options) {
                    if (column != hiveTableColumn) {
    }
                        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
    }
        return decl;
    public boolean canCreateObject(@NotNull Object container) {
        StringBuilder decl = super.getNestedDeclaration(monitor, owner, command, options);
            ddl.append("ALTER TABLE ").append(DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL)).append(" REPLACE COLUMNS (");
            List<? extends GenericTableColumn> attributes = table.getAttributes(monitor);
    public boolean canDeleteObject(@NotNull GenericTableColumn object) {
            if (attributes != null) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *
                new SQLDatabasePersistAction(
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
 *
        HiveTable table = (HiveTable) hiveTableColumn.getParentObject();
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                        String description = column.getDescription();
import java.util.List;
import org.jkiss.dbeaver.Log;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.hive.model.HiveTableColumn;
import org.jkiss.dbeaver.model.DBUtils;
                            ddl.append(" COMMENT '").append(description).append("'");
import org.jkiss.code.NotNull;
        actions.add(
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.hive.model.HiveTable;
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                        }
 */

                            ddl.append(",");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * HiveTableColumnManager
            //It may not be the best option. Some of the column data may still be lost. It might be worth using a temporary table
package org.jkiss.dbeaver.ext.hive.model.edit;
            ddl.append(")");
import java.util.Map;
                for (int i = 0; i < attributes.size(); i++) {
        return true;
                    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        HiveTable table = (HiveTable) command.getObject().getParentObject();
/*

                        "ALTER TABLE " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) + " ADD COLUMNS ("  +
 * Unless required by applicable law or agreed to in writing, software
        }

                        String typeModifiers = SQLUtils.getColumnTypeModifiers(table.getDataSource(), column, column.getTypeName(), column.getDataKind());
 * You may obtain a copy of the License at
    private static final Log log = Log.getLog(HiveTableColumnManager.class);
    @Override
import org.jkiss.dbeaver.DBException;
        } catch (DBException e) {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
                        "Add table column",
