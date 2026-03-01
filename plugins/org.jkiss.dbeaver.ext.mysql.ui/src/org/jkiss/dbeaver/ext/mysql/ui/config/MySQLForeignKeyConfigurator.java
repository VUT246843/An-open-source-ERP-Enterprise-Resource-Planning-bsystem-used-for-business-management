            }

            foreignKey.setReferencedConstraint((MySQLTableConstraint) editPage.getUniqueConstraint());
/*
                options);
                        tableColumn.getRefColumn()));

                        colIndex++,
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
    public MySQLTableForeignKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object table, @NotNull MySQLTableForeignKey foreignKey, @NotNull Map<String, Object> options) {
public class MySQLForeignKeyConfigurator implements DBEObjectConfigurator<MySQLTableForeignKey> {

                return null;
    @Override
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * MySQL index configurator
import org.jkiss.dbeaver.ui.UITask;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
 * See the License for the specific language governing permissions and
                    DBSForeignKeyModifyRule.SET_NULL,
 *
/**

                    DBSForeignKeyModifyRule.CASCADE, DBSForeignKeyModifyRule.RESTRICT,
            SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
        });
            foreignKey.setDeleteRule(editPage.getOnDeleteRule());
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.mysql.ui.config;
            foreignKey.setUpdateRule(editPage.getOnUpdateRule());
                    new MySQLTableForeignKeyColumn(
import org.jkiss.code.NotNull;
                foreignKey,
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        foreignKey,
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
                new DBSForeignKeyModifyRule[] {

            EditForeignKeyPage editPage = new EditForeignKeyPage(
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
                MySQLUIMessages.edit_foreign_key_manager_title,
                        tableColumn.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
                    DBSForeignKeyModifyRule.SET_DEFAULT },
            int colIndex = 1;
 */
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableForeignKeyColumn;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
 */
        return UITask.run(() -> {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
                foreignKey.addColumn(
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableConstraint;
            if (!editPage.edit()) {
            for (EditForeignKeyPage.FKColumnInfo tableColumn : editPage.getColumns()) {

    }
            return foreignKey;
 * you may not use this file except in compliance with the License.
            }
                    DBSForeignKeyModifyRule.NO_ACTION,
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableForeignKey;
