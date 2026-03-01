        for (DB2DeleteUpdateRule db2DeleteUpdateRule : DB2DeleteUpdateRule.values()) {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2DeleteUpdateRule;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return foreignKey;
        @NotNull DBRProgressMonitor monitor,
                    colIndex++);
            foreignKey.setDb2UpdateRule(DB2DeleteUpdateRule.getDB2RuleFromDBSRule(updateRule));
        return UITask.run(() -> {
import java.util.Map;
            }

import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
}
                    tableColumn.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others



            DB2TableForeignKeyColumn column;
import org.jkiss.dbeaver.ui.UITask;

            EditForeignKeyPage editDialog = new EditForeignKeyPage(
            for (EditForeignKeyPage.FKColumnInfo tableColumn : editDialog.getColumns()) {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            rules.add(db2DeleteUpdateRule.getRule());
            int colIndex = 1;
            foreignKey.setReferencedConstraint(ukConstraint);
            foreignKey.setDb2DeleteRule(DB2DeleteUpdateRule.getDB2RuleFromDBSRule(deleteRule));
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
 */
        @NotNull DB2TableForeignKey foreignKey,
    public DB2TableForeignKey configureObject(
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
import java.util.ArrayList;
import org.jkiss.dbeaver.ext.db2.model.DB2TableUniqueKey;
    }
 *
        @Nullable DBECommandContext commandContext,
 * you may not use this file except in compliance with the License.

            DB2TableUniqueKey ukConstraint = (DB2TableUniqueKey) editDialog.getUniqueConstraint();
        @NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;
            DBSForeignKeyModifyRule updateRule = editDialog.getOnUpdateRule();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;

        }
public class DB2ForeignKeyConfigurator implements DBEObjectConfigurator<DB2TableForeignKey> {
    static {
                    foreignKey,
                DB2Messages.edit_db2_foreign_key_manager_dialog_title, foreignKey, FK_RULES, options);
import org.jkiss.dbeaver.ext.db2.model.DB2TableForeignKeyColumn;
            DBSForeignKeyModifyRule deleteRule = editDialog.getOnDeleteRule();
 * You may obtain a copy of the License at
/*
                return null;
                columns.add(column);
    @Override
        });
 * DB2 foreign key configurator
        @Nullable Object container,
import org.jkiss.code.Nullable;
/**
                column = new DB2TableForeignKeyColumn(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
            List<DB2TableForeignKeyColumn> columns = new ArrayList<>(editDialog.getColumns().size());
    private static final DBSForeignKeyModifyRule[] FK_RULES;
            foreignKey.setAttributeReferences(columns);
import org.jkiss.dbeaver.ext.db2.model.DB2TableForeignKey;

        List<DBSForeignKeyModifyRule> rules = new ArrayList<>(DB2DeleteUpdateRule.values().length);
package org.jkiss.dbeaver.ext.db2.ui.config;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
        FK_RULES = rules.toArray(new DBSForeignKeyModifyRule[]{});
 */

            if (!editDialog.edit()) {
            }
 *

 * limitations under the License.
