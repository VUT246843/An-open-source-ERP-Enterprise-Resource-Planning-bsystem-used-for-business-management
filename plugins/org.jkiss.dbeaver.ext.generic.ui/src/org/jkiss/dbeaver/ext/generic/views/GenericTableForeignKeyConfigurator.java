            int colIndex = 1;
                    DBSForeignKeyModifyRule.SET_NULL,
            }
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKeyColumnTable;
            foreignKey.setDeleteRule(editPage.getOnDeleteRule());
 *
        @Nullable Object table,
 * you may not use this file except in compliance with the License.
public class GenericTableForeignKeyConfigurator implements DBEObjectConfigurator<GenericTableForeignKey> {
                    DBSForeignKeyModifyRule.CASCADE, DBSForeignKeyModifyRule.RESTRICT,
            foreignKey.setReferencedConstraint((DBSEntityReferrer) editPage.getUniqueConstraint());
 *
            return foreignKey;

    ) {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

 * You may obtain a copy of the License at
    }
            foreignKey.setUpdateRule(editPage.getOnUpdateRule());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
            foreignKey.setDeferability(DBSForeignKeyDeferability.NOT_DEFERRABLE);
/**
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
    public GenericTableForeignKey configureObject(
 *
                foreignKey,

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
                "Create foreign key",
 */
            for (EditForeignKeyPage.FKColumnInfo tableColumn : editPage.getColumns()) {

        });
/*

                    DBSForeignKeyModifyRule.SET_DEFAULT }, options);
                return null;
import org.jkiss.code.Nullable;
                new DBSForeignKeyModifyRule[] {
                    DBSForeignKeyModifyRule.NO_ACTION,
                foreignKey.addColumn(
        @Nullable DBECommandContext commandContext,

import java.util.Map;
                    new GenericTableForeignKeyColumnTable(
                        foreignKey,
            SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Generic table foreign key configurator
        @NotNull Map<String, Object> options
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull GenericTableForeignKey foreignKey,
import org.jkiss.dbeaver.ui.UITask;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
package org.jkiss.dbeaver.ext.generic.views;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
                        tableColumn.getRefColumn()));
        return UITask.run(() -> {

                        tableColumn.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
import org.jkiss.code.NotNull;
            if (!editPage.edit()) {
                        colIndex++,
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBRProgressMonitor monitor,
 * DBeaver - Universal Database Manager
 */
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
}
 * limitations under the License.
            EditForeignKeyPage editPage = new EditForeignKeyPage(
 * See the License for the specific language governing permissions and
