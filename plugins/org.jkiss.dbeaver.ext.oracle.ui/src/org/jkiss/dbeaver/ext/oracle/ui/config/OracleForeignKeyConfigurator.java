                foreignKey.addColumn(
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and

                SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
    @Override
import org.jkiss.code.Nullable;
                return null;
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,

            String customName = editPage.getName();
                OracleUIMessages.edit_oracle_foreign_key_manager_dialog_title,
import org.jkiss.utils.CommonUtils;
            } else {
import org.jkiss.dbeaver.ext.oracle.model.OracleTableForeignKey;
            return foreignKey;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        });
                    DBSForeignKeyModifyRule.SET_DEFAULT}, options);
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * DBeaver - Universal Database Manager
    public OracleTableForeignKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object table, @NotNull OracleTableForeignKey foreignKey, @NotNull Map<String, Object> options) {
                new DBSForeignKeyModifyRule[]{
 * Licensed under the Apache License, Version 2.0 (the "License");
                        colIndex++));
            foreignKey.setReferencedConstraint((OracleTableConstraint) editPage.getUniqueConstraint());
/**
                        foreignKey,
        return UITask.run(() -> {

package org.jkiss.dbeaver.ext.oracle.ui.config;
/*
            }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    new OracleTableForeignKeyColumn(


public class OracleForeignKeyConfigurator implements DBEObjectConfigurator<OracleTableForeignKey> {
            }
            int colIndex = 1;
            for (EditForeignKeyPage.FKColumnInfo tableColumn : editPage.getColumns()) {
                    DBSForeignKeyModifyRule.SET_NULL,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.UITask;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
                foreignKey,
 *
 * Oracle foreign key manager
            editPage.setSupportsCustomName(true);
import org.jkiss.dbeaver.ext.oracle.model.OracleTableForeignKeyColumn;
            }
 *
            foreignKey.setDeleteRule(editPage.getOnDeleteRule());
import org.jkiss.dbeaver.ext.oracle.model.OracleTableConstraint;
    }
                foreignKey.setName(customName);
                        tableColumn.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
            SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
 */
            if (!editPage.edit()) {
                    DBSForeignKeyModifyRule.CASCADE, DBSForeignKeyModifyRule.RESTRICT,
 */
 * limitations under the License.
                    DBSForeignKeyModifyRule.NO_ACTION,
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
            if (CommonUtils.isNotEmpty(customName)) {
            EditForeignKeyPage editPage = new EditForeignKeyPage(
}
