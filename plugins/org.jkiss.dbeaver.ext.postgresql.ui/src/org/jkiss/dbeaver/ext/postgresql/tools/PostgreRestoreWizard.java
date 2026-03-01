    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
    PostgreRestoreWizard(PostgreDatabase database) {
    }
    public void addPages() {
            return settingsPage;
    }
import org.jkiss.dbeaver.model.task.DBTTask;
        if (settingsPage.getControl() != null) {
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeImportExportWizard;
        }
 * you may not use this file except in compliance with the License.
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.eclipse.jface.viewers.IStructuredSelection;
            settingsPage.saveState();
 *
            SWT.ICON_INFORMATION);
    }
    public void init(IWorkbench workbench, IStructuredSelection selection) {
import java.util.Map;
 */

    }
        if (page == logPage) {
    }
    public String getTaskTypeId() {

        super.init(workbench, selection);
import org.eclipse.jface.wizard.IWizardPage;
import org.jkiss.dbeaver.ui.UIUtils;
    public IWizardPage getNextPage(IWizardPage page) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.swt.SWT;
        if (page == settingsPage) {
 * DBeaver - Universal Database Manager
    @Override
        return new PostgreDatabaseRestoreSettings();
        return super.getNextPage(page);


        UIUtils.showMessageBox(
        settingsPage = new PostgreRestoreWizardPageSettings(this);
    public void onSuccess(long workTime) {
    protected PostgreDatabaseRestoreSettings createSettings() {
        addTaskConfigPages();
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
import java.util.Collections;
 *
 * limitations under the License.
    private PostgreRestoreWizardPageSettings settingsPage;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
package org.jkiss.dbeaver.ext.postgresql.tools;

    @Override
class PostgreRestoreWizard extends AbstractNativeImportExportWizard<PostgreDatabaseRestoreSettings, PostgreDatabaseRestoreInfo> {
        }
/*

            "Restore '" + getObjectsName() + "'",
        getSettings().setRestoreInfo(new PostgreDatabaseRestoreInfo(database));
    }
    @Override

        }
        super.addPages();



    }

        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));
        addPage(settingsPage);
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseRestoreInfo;
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(Collections.singletonList(database), PostgreMessages.wizard_restore_title);
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;


    PostgreRestoreWizard(DBTTask task) {

    @Override
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
            getShell(),
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseRestoreSettings;
    @Override
import org.eclipse.ui.IWorkbench;
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreSQLTasks;
 * See the License for the specific language governing permissions and
    @Override
    @Override
        super(task);
    }
        return PostgreSQLTasks.TASK_DATABASE_RESTORE;

}
    public IWizardPage getPreviousPage(IWizardPage page) {
            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return super.getPreviousPage(page);
            "Database restore",
