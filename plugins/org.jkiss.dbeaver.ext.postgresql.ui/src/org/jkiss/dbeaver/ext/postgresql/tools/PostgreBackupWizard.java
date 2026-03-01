
    public IWizardPage getPreviousPage(IWizardPage page) {
    }

    }
        getSettings().fillExportObjectsFromInput();
        return new PostgreDatabaseBackupSettings();
        addPage(objectsPage);
import org.eclipse.ui.IWorkbench;

    }
import java.util.Collection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
	public void onSuccess(long workTime) {
    }
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeExportWizard;
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
package org.jkiss.dbeaver.ext.postgresql.tools;
/*
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
    protected PostgreDatabaseBackupSettings createSettings() {
import org.jkiss.dbeaver.model.task.DBTTask;
}


    @Override
        return super.getNextPage(page);
 * You may obtain a copy of the License at
        }
        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));


        if (page == logPage) {
        }
    PostgreBackupWizard(DBTTask task) {
        }
    }
        if (settingsPage.getControl() != null) {
            PostgreMessages.wizard_backup_msgbox_success_title,

    public void init(IWorkbench workbench, IStructuredSelection selection) {
            NLS.bind(PostgreMessages.wizard_backup_msgbox_success_description, CommonUtils.truncateString(getObjectsName(), 255)),
        set.forEach(ShellUtils::launchProgram);
        if (objectsPage.getControl() != null) {
    }
    public String getTaskTypeId() {

import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupInfo;
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupSettings;
 *
        if (page == settingsPage) {
        super.addPages();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

class PostgreBackupWizard extends AbstractNativeExportWizard<PostgreDatabaseBackupSettings, PostgreDatabaseBackupInfo> {
 */
    @Override
    @Override
        super(objects, PostgreMessages.wizard_backup_title);
    @Override
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return PostgreSQLTasks.TASK_DATABASE_BACKUP;
import org.eclipse.jface.viewers.IStructuredSelection;
            return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        addPage(settingsPage);
    public void addPages() {
import org.jkiss.utils.CommonUtils;
import org.eclipse.jface.wizard.IWizardPage;
import java.util.Map;
import org.eclipse.swt.SWT;
import java.util.Set;
    @Override
import org.jkiss.dbeaver.ui.ShellUtils;
        UIUtils.showMessageBox(
 *
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
    PostgreBackupWizard(Collection<DBSObject> objects) {
        settingsPage = new PostgreBackupWizardPageSettings(this);
            return settingsPage;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }

            getShell(),
 * Unless required by applicable law or agreed to in writing, software
 *
            settingsPage.saveState();
    }
        objectsPage = new PostgreBackupWizardPageObjects(this);
 * DBeaver - Universal Database Manager
 * limitations under the License.

    public IWizardPage getNextPage(IWizardPage page) {

        return super.getPreviousPage(page);
            SWT.ICON_INFORMATION);
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        super(task);
import java.util.stream.Collectors;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreSQLTasks;
        addTaskConfigPages();
 * you may not use this file except in compliance with the License.
            objectsPage.saveState();
import org.eclipse.osgi.util.NLS;
        }
    @Override
        Set<String> set = getSettings().getExportObjects().stream().map(it -> getSettings().getOutputFolder(it)).collect(Collectors.toSet());
    }
    private PostgreBackupWizardPageSettings settingsPage;

        super.init(workbench, selection);
    private PostgreBackupWizardPageObjects objectsPage;
