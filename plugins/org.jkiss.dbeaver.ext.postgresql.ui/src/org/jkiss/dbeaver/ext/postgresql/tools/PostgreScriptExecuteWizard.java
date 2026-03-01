        super(Collections.singleton(catalog), PostgreMessages.wizard_script_title_execute_script);
        addTaskConfigPages();
import org.jkiss.dbeaver.model.struct.DBSObject;
        super.addPages();
import org.eclipse.jface.viewers.IStructuredSelection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        getSettings().setDatabase(catalog);
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreScriptExecuteSettings;
    PostgreScriptExecuteWizard(DBTTask task) {
    private PostgreScriptExecuteWizardPageSettings mainPage;

 *
 * You may obtain a copy of the License at


import org.eclipse.ui.IWorkbench;
    }

    PostgreScriptExecuteWizard(@Nullable PostgreDatabase catalog, @Nullable Path file) {

        getSettings().setDatabase(catalog);
import java.util.Collections;
        mainPage.saveState();

import org.jkiss.code.Nullable;
    @Override
    }
    @Override
import java.nio.file.Path;
 *
        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));
    }
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        super.init(workbench, selection);

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.task.DBTTask;
    @Override
    public boolean isVerbose() {

class PostgreScriptExecuteWizard extends AbstractNativeScriptExecuteWizard<PostgreScriptExecuteSettings, DBSObject, PostgreDatabase> {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {

    @Override
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
 *
        this.mainPage = new PostgreScriptExecuteWizardPageSettings(this);
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import java.util.Map;



    public void addPages() {
package org.jkiss.dbeaver.ext.postgresql.tools;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    }
    }
 */
/*

    public void init(IWorkbench workbench, IStructuredSelection selection) {
        super(task);
    public String getTaskTypeId() {

import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeScriptExecuteWizard;
}
    @Override

        addPage(mainPage);
    }
 * limitations under the License.
        return false;
    protected PostgreScriptExecuteSettings createSettings() {

        return new PostgreScriptExecuteSettings();

        return PostgreSQLTasks.TASK_SCRIPT_EXECUTE;
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreSQLTasks;
        super(Collections.singleton(catalog), PostgreMessages.wizard_script_title_execute_script, file);
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    PostgreScriptExecuteWizard(PostgreDatabase catalog) {
