 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                DBSForeignKeyModifyRule.CASCADE, DBSForeignKeyModifyRule.RESTRICT,
                foreignKey);
            super(title, foreignKey, new DBSForeignKeyModifyRule[] {
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;

                DBSForeignKeyModifyRule.NO_ACTION,
import org.eclipse.swt.widgets.Button;
            }
import org.eclipse.swt.events.SelectionAdapter;
                    @Override
            {
    }
 */
                DBSForeignKeyModifyRule.SET_DEFAULT },
                Collections.emptyMap());
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
 * You may obtain a copy of the License at
            foreignKey.setDeferrable(editPage.isDeferrable);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                final Button deferrableCheck = UIUtils.createCheckbox(defGroup, PostgreMessages.postgre_foreign_key_manager_checkbox_deferrable, false);
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        @Override
            return foreignKey;
import org.eclipse.swt.events.SelectionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            return panel;
            editPage.setSupportsCustomName(true);
                        foreignKey,
 * DBeaver - Universal Database Manager

 *
import org.jkiss.code.Nullable;

                    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.postgresql.ui.config;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                final Button deferredCheck = UIUtils.createCheckbox(defGroup, PostgreMessages.postgre_foreign_key_manager_checkbox_deferred, false);
}
            if (CommonUtils.isNotEmpty(customName)) {
        });

            }
            foreignKey.setUpdateRule(editPage.getOnUpdateRule());
            if (!editPage.edit()) {
            EditPGForeignKeyPage editPage = new EditPGForeignKeyPage(
                        isDeferred = deferredCheck.getSelection();
                deferrableCheck.addSelectionListener(new SelectionAdapter() {
                        colIndex++,
                });
                PostgreMessages.postgre_foreign_key_manager_header_edit_foreign_key,
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
            foreignKey.setDeleteRule(editPage.getOnDeleteRule());
/*
/**
                DBSForeignKeyModifyRule.SET_NULL,

            foreignKey.setDeferred(editPage.isDeferred);

    }
            }
                    }
                // Cascades
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableForeignKeyColumn;
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
public class PostgreForeignKeyConfigurator implements DBEObjectConfigurator<PostgreTableForeignKey> {
        return UITask.run(() -> {
            for (EditForeignKeyPage.FKColumnInfo tableColumn : editPage.getColumns()) {
                defGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            foreignKey.setReferencedConstraint(editPage.getUniqueConstraint());
        private boolean isDeferrable;
            }
                        tableColumn.getOrCreateOwnColumn(monitor, commandContext, foreignKey.getTable()),
 * limitations under the License.
            String customName = editPage.getName();
                        tableColumn.getRefColumn()));
import java.util.Map;

                foreignKey.addColumn(
                });
                SQLForeignKeyManager.updateForeignKeyName(monitor, foreignKey);
import org.jkiss.dbeaver.ui.UITask;

import org.jkiss.dbeaver.ui.UIUtils;
            Composite panel = super.createPageContents(parent);

                foreignKey.setName(customName);
            final Composite defGroup = UIUtils.createComposite(panel, 2);
import org.jkiss.utils.CommonUtils;
                deferredCheck.addSelectionListener(new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {

import org.eclipse.swt.layout.GridData;
        public EditPGForeignKeyPage(String title, DBSTableForeignKey foreignKey) {
    @Override
                    }

import java.util.Collections;
    private static class EditPGForeignKeyPage extends EditForeignKeyPage {
 * See the License for the specific language governing permissions and
            int colIndex = 1;
import org.eclipse.swt.widgets.Composite;

                    new PostgreTableForeignKeyColumn(
            } else {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableForeignKey;
        private boolean isDeferred;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * you may not use this file except in compliance with the License.
    public PostgreTableForeignKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object table, @NotNull PostgreTableForeignKey foreignKey, @NotNull Map<String, Object> options) {
                        isDeferrable = deferrableCheck.getSelection();
                return null;
        protected Composite createPageContents(Composite parent) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            addPhysicalKeyComponent(defGroup);
 * Postgre index configurator
                    public void widgetSelected(SelectionEvent e) {
