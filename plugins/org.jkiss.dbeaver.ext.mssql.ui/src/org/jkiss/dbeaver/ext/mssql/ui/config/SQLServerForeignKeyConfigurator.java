            for (EditForeignKeyPage.FKColumnInfo tableColumn : editPage.getColumns()) {
                foreignKey.addColumn(
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableForeignKey;
 * See the License for the specific language governing permissions and
                    new SQLServerTableForeignKeyColumn(
            if (!editPage.edit()) {
            return foreignKey;
                        colIndex++,
                return null;
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
        });
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
            //foreignKey.setName(getNewConstraintName(monitor, foreignKey));
            foreignKey.setUpdateRule(editPage.getOnUpdateRule());
                foreignKey,
import java.util.Map;
            EditForeignKeyPage editPage = new EditForeignKeyPage(
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            }
                        foreignKey,
    public SQLServerTableForeignKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerTableForeignKey foreignKey, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableForeignKeyColumn;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.dbeaver.ui.UITask;
            }


            SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);

                new DBSForeignKeyModifyRule[] {
            foreignKey.setReferencedConstraint(editPage.getUniqueConstraint());
 * Copyright (C) 2010-2024 DBeaver Corp and others
            foreignKey.setDeleteRule(editPage.getOnDeleteRule());
 * SQL Server foreign key manager
                    DBSForeignKeyModifyRule.SET_DEFAULT }, options);
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
    }
 *
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
                    DBSForeignKeyModifyRule.SET_NULL,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 */
/*

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class SQLServerForeignKeyConfigurator implements DBEObjectConfigurator<SQLServerTableForeignKey> {
                    DBSForeignKeyModifyRule.CASCADE, DBSForeignKeyModifyRule.RESTRICT,
                    DBSForeignKeyModifyRule.NO_ACTION,
/**
    @Override
                        tableColumn.getRefColumn()));

package org.jkiss.dbeaver.ext.mssql.ui.config;
                "Create foreign key",
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
                        tableColumn.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
            int colIndex = 1;
        return UITask.run(() -> {
