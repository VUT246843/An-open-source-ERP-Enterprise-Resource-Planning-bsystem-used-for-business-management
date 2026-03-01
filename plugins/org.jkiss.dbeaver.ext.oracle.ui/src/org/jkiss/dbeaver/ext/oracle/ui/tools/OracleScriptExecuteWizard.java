 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeScriptExecuteWizard;

    OracleScriptExecuteWizard(@NotNull OracleDataSource oracleSchema, @Nullable Path sourceFile) {
import java.nio.file.Path;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
    @Override

    public String getTaskTypeId() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        addTaskConfigPages();

        mainPage.saveState();
    }
        super(task);
    @Override

    }
import java.util.Collections;
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.ext.oracle.tasks.OracleScriptExecuteSettings;
    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }


import org.eclipse.jface.viewers.IStructuredSelection;
import java.util.Map;
    private OracleScriptExecuteWizardPageSettings mainPage;
 */
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ext.oracle.ui.tools;
    @Override
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.ui.IWorkbench;
        super(Collections.singleton(oracleSchema), OracleUIMessages.tools_script_execute_wizard_page_name, sourceFile);
    protected OracleScriptExecuteSettings createSettings() {


    @Override
/*
        super.addPages();
    }
    OracleScriptExecuteWizard(DBTTask task) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    }

 *
    @Override

    OracleScriptExecuteWizard(OracleDataSource oracleSchema) {


 * See the License for the specific language governing permissions and
    }
        this.mainPage = new OracleScriptExecuteWizardPageSettings(this);
import org.jkiss.code.Nullable;
    public void addPages() {
        return OracleTasks.TASK_SCRIPT_EXECUTE;
        super.init(workbench, selection);

import org.jkiss.dbeaver.ext.oracle.tasks.OracleTasks;
class OracleScriptExecuteWizard extends AbstractNativeScriptExecuteWizard<OracleScriptExecuteSettings, DBSObject, OracleDataSource> {
import org.jkiss.dbeaver.model.task.DBTTask;
        super(Collections.singleton(oracleSchema), OracleUIMessages.tools_script_execute_wizard_page_name);
}
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
        addPage(mainPage);
 * Unless required by applicable law or agreed to in writing, software
        return new OracleScriptExecuteSettings();
