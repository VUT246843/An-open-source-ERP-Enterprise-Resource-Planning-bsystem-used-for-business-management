    @Override
/*
        return null;
    @Override
    }
        }
    }

 *
        }
    @Override
    public IWizardPage getNextPage(IWizardPage page) {

    @Override

    }
            setControl(new Label(parent, SWT.NONE));
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;

*/
        return false;
    @Override
import org.jkiss.dbeaver.model.task.DBTTask;
 * distributed under the License is distributed on an "AS IS" BASIS,
            super(TaskUIMessages.task_config_wizard_stub_page_name_void);
 * You may obtain a copy of the License at
        if (wizard == null) {
        addPage(new TaskConfigurationWizardPageTask(null));

import java.util.Map;
            return;

import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
 * Once he does we "replace" this wizard with real one om wizard dialog.
import org.eclipse.swt.widgets.Label;
 * DBeaver - Universal Database Manager
        return false;//wizard.performFinish();
        return true;
        addPage(new TaskConfigurationWizardPageSettings(null));
        @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
}    @Override
    protected String getDefaultWindowTitle() {
    private void addTaskWizardPages() {
        @Override
        }
            return false;
            addPage(page);
        return TaskUIMessages.task_config_wizard_stub_title_create_task;
        wizard.addPages();
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
/*
    class TaskConfigurationVoidPage extends ActiveWizardPage implements IWizardPageNavigable


    public boolean canFinish() {
    }
        return super.getNextPage(page);
        @Override
 * See the License for the specific language governing permissions and


    public void addPages() {
    boolean isLastTaskPreconfigPage(IWizardPage page) {
    }

        public boolean isPageApplicable() {
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 * you may not use this file except in compliance with the License.
        }
        public void createControl(Composite parent) {

    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {
            (page instanceof TaskConfigurationWizardPageTask &&
        return new TaskConfigurationSettingsStub();
    {

 */
        for (IWizardPage page : wizard.getPages()) {
        TaskConfigurationVoidPage() {
    public String getTaskTypeId() {

 * Licensed under the Apache License, Version 2.0 (the "License");
        public boolean isPageNavigable() {

    }



import org.jkiss.dbeaver.tasks.ui.registry.TaskUIRegistry;
                ((TaskConfigurationWizardPageTask) page).getSelectedTaskType() != null &&
class NewTaskConfigurationWizard extends TaskConfigurationWizard<TaskConfigurationSettingsStub> {
    @Override
    }
        return page instanceof TaskConfigurationWizardPageSettings ||

 */
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    public boolean isNewTaskEditor() {
            return getPages()[1];
        addPage(new TaskConfigurationVoidPage());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * We need it because there is no wizard before user select some particular task type.
 * limitations under the License.
    }
    @Override

/**
    }
                !TaskUIRegistry.getInstance().supportsConfiguratorPage(((TaskConfigurationWizardPageTask) page).getSelectedTaskType()));
        }
import org.eclipse.jface.wizard.IWizardPage;
package org.jkiss.dbeaver.tasks.ui.wizard;
            return false;
    }
    public boolean performFinish() {
    @Override

 *

    }
 * "Fake" wizard.

            page.setWizard(wizard);
        }
    }
    NewTaskConfigurationWizard() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected TaskConfigurationSettingsStub getSettings() {
    }
        if (page instanceof TaskConfigurationWizardPageTask && getPageCount() == 2) {
