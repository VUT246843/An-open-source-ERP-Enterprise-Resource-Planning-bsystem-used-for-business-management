import org.jkiss.dbeaver.model.task.DBTTask;
            return null;
 * Unless required by applicable law or agreed to in writing, software
        super.addPages();

package org.jkiss.dbeaver.ext.postgresql.tools;
/*
        objectsPage = new PostgreBackupAllWizardPageObjects(this);
        addPage(settingsPage);
            SWT.ICON_INFORMATION);
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
import org.eclipse.osgi.util.NLS;
            settingsPage.saveState();
            objectsPage.saveState();
        }
            .forEach(ShellUtils::launchProgram);
            return settingsPage;
        if (objectsPage.getControl() != null) {
            .map(it -> getSettings().getOutputFolder(it))
    @Override

import java.util.Collection;
 * you may not use this file except in compliance with the License.
    public IWizardPage getPreviousPage(IWizardPage page) {
    public void onSuccess(long workTime) {
        }
    }

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * DBeaver - Universal Database Manager
    public String getTaskTypeId() {
        return new PostgreBackupAllSettings();
            PostgreMessages.wizard_backup_msgbox_success_title,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

    protected PostgreBackupAllSettings createSettings() {
    @Override
 */

import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreBackupAllSettings;
    public void addPages() {
    }

        }

    }
    PostgreBackupAllWizard(Collection<DBSObject> objects) {
        settingsPage = new PostgreBackupAllWizardPageSettings(this);
 *
    }
    }

    private PostgreBackupAllWizardPageSettings settingsPage;
            NLS.bind(PostgreMessages.wizard_backup_msgbox_success_description, CommonUtils.truncateString(getObjectsName(), 255)),
    public IWizardPage getNextPage(IWizardPage page) {
import org.eclipse.swt.SWT;
}
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupAllInfo;
import org.jkiss.dbeaver.model.struct.DBSObject;
    private PostgreBackupAllWizardPageObjects objectsPage;
            getShell(),
    }
        return super.getNextPage(page);
        addTaskConfigPages();

import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
 *
        addPage(objectsPage);
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeExportWizard;
import org.eclipse.jface.viewers.IStructuredSelection;

        super(task);
    }
import org.jkiss.dbeaver.ui.ShellUtils;
        super(objects, PostgreMessages.wizard_backup_all_page_global_backup_name);
    @Override
        if (page == settingsPage) {

import java.util.Map;
            .distinct()
    @Override
        getSettings().getExportObjects().stream()
    }
    }
        if (settingsPage.getControl() != null) {

    @Override
import org.eclipse.jface.wizard.IWizardPage;
public class PostgreBackupAllWizard  extends AbstractNativeExportWizard<PostgreBackupAllSettings, PostgreDatabaseBackupAllInfo> {
import org.eclipse.ui.IWorkbench;
        getSettings().fillExportObjectsFromInput();
        if (page == logPage) {
        return super.getPreviousPage(page);

    PostgreBackupAllWizard(DBTTask task) {
 * limitations under the License.
 *
        UIUtils.showMessageBox(
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreSQLTasks;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        return PostgreSQLTasks.TASK_DATABASE_BACKUP_ALL;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
    @Override

        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        super.init(workbench, selection);
    @Override
