            file);
 * limitations under the License.
        super(Collections.singleton(catalog), isImport ? MySQLUIMessages.tools_script_execute_wizard_db_import : MySQLUIMessages.tools_script_execute_wizard_execute_script);
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collections;
    public IWizardPage getNextPage(IWizardPage page) {
        this.getSettings().setImport(isImport);
        return super.getNextPage(page);
    protected MySQLScriptExecuteSettings createSettings() {
    }
}
    @Override

        addPage(settingsPage);
import java.util.Map;
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
    }
            Collections.singleton(catalog),
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
        }
        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));
        this.getSettings().setImport(isImport);
    MySQLScriptExecuteWizard(@NotNull MySQLCatalog catalog, boolean isImport, @Nullable Path file) {
 * You may obtain a copy of the License at
    @Override

    }
        super(
import org.jkiss.code.Nullable;
        addTaskConfigPages();
            ? MySQLUIMessages.tools_script_execute_wizard_db_import
 * Copyright (C) 2010-2025 DBeaver Corp and others


        this.getSettings().setImport(isImport);
    public void addPages() {
    public boolean isImport() {
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLScriptExecuteSettings;
 */
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLTasks;
            settingsPage.saveState();
        return getSettings().getLogLevel();


class MySQLScriptExecuteWizard extends AbstractNativeScriptExecuteWizard<MySQLScriptExecuteSettings, MySQLCatalog, MySQLCatalog> {
 * Unless required by applicable law or agreed to in writing, software
        super.addPages();
    }
 * See the License for the specific language governing permissions and
    }
        return getSettings().isImport() ? MySQLTasks.TASK_DATABASE_RESTORE : MySQLTasks.TASK_SCRIPT_EXECUTE;
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeScriptExecuteWizard;
 * DBeaver - Universal Database Manager

    @Override
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        return new MySQLScriptExecuteSettings();

    public MySQLScriptExecuteSettings.LogLevel getLogLevel() {
    }
 *
    private MySQLScriptExecuteWizardPageSettings settingsPage = new MySQLScriptExecuteWizardPageSettings(this);
    @Override


        if (settingsPage.getControl() != null) {
    }
    public boolean isVerbose() {
        }
    }
import java.nio.file.Path;
 * you may not use this file except in compliance with the License.
            isImport
package org.jkiss.dbeaver.ext.mysql.tools;
    public String getTaskTypeId() {
    }


import org.eclipse.jface.wizard.IWizardPage;
        return getSettings().isImport();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        super(task);

import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
/*
        if (page == settingsPage) {
import org.jkiss.dbeaver.model.task.DBTTask;
    @Override

    MySQLScriptExecuteWizard(DBTTask task, boolean isImport) {

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return null;
    }
    MySQLScriptExecuteWizard(MySQLCatalog catalog, boolean isImport) {
            : MySQLUIMessages.tools_script_execute_wizard_execute_script,
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
 *
        return getSettings().isVerbose();

