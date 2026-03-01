    }
/*
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLDatabaseExportInfo;
import org.jkiss.utils.CommonUtils;
import java.util.stream.Collectors;
 *
            MySQLUIMessages.tools_db_export_wizard_title,
        return new MySQLExportSettings();
        Set<String> set = getSettings().getExportObjects().stream().map(it -> getSettings().getOutputFolder(it)).collect(Collectors.toSet());
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package org.jkiss.dbeaver.ext.mysql.tools;
        if (settingsPage.getControl() != null) {
        if (page == logPage) {
            getShell(),
    @Override
        return super.getPreviousPage(page);
import java.util.Map;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
 * Unless required by applicable law or agreed to in writing, software
            objectsPage.saveState();
    public IWizardPage getNextPage(IWizardPage page) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,


    }
	public void onSuccess(long workTime) {
 *
            return settingsPage;
    MySQLExportWizard(DBTTask task) {
    }
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
 * you may not use this file except in compliance with the License.
    }
            CommonUtils.truncateString(NLS.bind(MySQLUIMessages.tools_db_export_wizard_message_export_completed, getObjectsName()), 255),
        }
import org.jkiss.dbeaver.model.task.DBTTask;

import org.jkiss.dbeaver.model.struct.DBSObject;
        addPage(objectsPage);
import java.util.Collection;
    public IWizardPage getPreviousPage(IWizardPage page) {
        set.forEach(ShellUtils::launchProgram);

    protected MySQLExportSettings createSettings() {

import java.util.Set;
        getSettings().saveSettings(runnableContext, new TaskPreferenceStore(state));
    @Override

    private MySQLExportWizardPageObjects objectsPage;
    MySQLExportWizard(Collection<DBSObject> objects) {
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLExportSettings;

        super.init(workbench, selection);
    }
        }
        addTaskConfigPages();

        if (objectsPage.getControl() != null) {
        super(objects, MySQLUIMessages.tools_db_export_wizard_task_name);
    }
        super.addPages();
import org.jkiss.dbeaver.ui.ShellUtils;
        return MySQLTasks.TASK_DATABASE_BACKUP;
    private MySQLExportWizardPageSettings settingsPage;
 *
        }
import org.eclipse.swt.SWT;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLTasks;
        settingsPage = new MySQLExportWizardPageSettings(this);
}

import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
 * You may obtain a copy of the License at
 * limitations under the License.
    }

            settingsPage.saveState();
    @Override
import org.eclipse.jface.wizard.IWizardPage;
        objectsPage = new MySQLExportWizardPageObjects(this);

        addPage(settingsPage);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
        UIUtils.showMessageBox(
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        return super.getNextPage(page);
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getTaskTypeId() {
import org.eclipse.ui.IWorkbench;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * See the License for the specific language governing permissions and
    @Override
import org.eclipse.osgi.util.NLS;
        super(task);
 * DBeaver - Universal Database Manager

            SWT.ICON_INFORMATION);
        getSettings().fillExportObjectsFromInput();
    @Override
    @Override
        if (page == settingsPage) {
            return null;
    public void addPages() {

class MySQLExportWizard extends AbstractNativeExportWizard<MySQLExportSettings, MySQLDatabaseExportInfo> {
    }

        }
    @Override
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeExportWizard;
