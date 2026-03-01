            List<ExasolTableForeignKeyColumn> columns = new ArrayList<>();
}
                    return null;

import org.jkiss.code.NotNull;
            int cnt = 0;
            foreignKey.setEnabled(editPage.isEnabled());
import org.jkiss.dbeaver.ui.UITask;

import org.jkiss.dbeaver.DBException;
/*
 * Unless required by applicable law or agreed to in writing, software
        return UITask.run(() -> {

                            ++cnt));
import java.util.List;

                return null;
            foreignKey.setAttributeReferences(columns);
package org.jkiss.dbeaver.ext.exasol.ui.config;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    public ExasolTableForeignKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolTableForeignKey foreignKey, @NotNull Map<String, Object> options) {
            if (!editPage.edit()) {
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableForeignKey;
                            refTable.getAttribute(monitor, column.getRefColumn().getName()),
            foreignKey.setName(editPage.getName());
 */
import java.util.ArrayList;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            foreignKey.setReferencedConstraint((ExasolTableUniqueKey)editPage.getUniqueConstraint());
                } catch (DBException e) {
            for (ExasolCreateForeignKeyDialog.FKColumnInfo column : editPage.getColumns()) {
 * You may obtain a copy of the License at
            SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
                try {

import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
 *
 *
                    columns.add(new ExasolTableForeignKeyColumn(
                }
public class ExasolForeignKeyConfigurator implements DBEObjectConfigurator<ExasolTableForeignKey> {
    }
                            column.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected static final Log log = Log.getLog(ExasolForeignKeyConfigurator.class);
import java.util.Map;
            }
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableUniqueKey;
            }
                    log.error("Could not get Attribute Information from Table");
 * Copyright (C) 2010-2024 DBeaver Corp and others
        });
            ExasolCreateForeignKeyDialog editPage = new ExasolCreateForeignKeyDialog(ExasolMessages.dialog_create_foreign_key_title, foreignKey, options);

            return foreignKey;
                    ExasolTable refTable = foreignKey.getReferencedConstraint().getTable();
                            foreignKey,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

import org.jkiss.dbeaver.ext.exasol.model.ExasolTableForeignKeyColumn;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
