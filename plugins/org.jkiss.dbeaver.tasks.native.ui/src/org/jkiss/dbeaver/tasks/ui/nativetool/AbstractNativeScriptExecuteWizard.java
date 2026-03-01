    protected AbstractNativeScriptExecuteWizard(Collection<BASE_OBJECT> dbObject, String task, @Nullable Path file) {
package org.jkiss.dbeaver.tasks.ui.nativetool;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super(dbObject, task);
import org.jkiss.dbeaver.model.task.DBTTask;

import org.eclipse.jface.viewers.IStructuredSelection;
    }
 * See the License for the specific language governing permissions and
        // Do not add base wizard pages. They can be added explicitly thru addTaskConfigPages

        UIUtils.showMessageBox(getShell(),
    @Override
    }
import org.jkiss.code.Nullable;
import org.eclipse.ui.IWorkbench;
 * You may obtain a copy of the License at
    }
    public void addPages() {
import org.jkiss.dbeaver.tasks.nativetool.AbstractScriptExecuteSettings;
/*
 *
 * Unless required by applicable law or agreed to in writing, software
        super(task);
                        SWT.ICON_INFORMATION);
    }
}
    @Override
        extends AbstractNativeToolWizard<SETTINGS, BASE_OBJECT, PROCESS_ARG> implements IImportWizard
        return false;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
            taskTitle,


import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IImportWizard;
    }
public abstract class AbstractNativeScriptExecuteWizard<SETTINGS extends AbstractScriptExecuteSettings<BASE_OBJECT>, BASE_OBJECT extends DBSObject, PROCESS_ARG>
        super(dbObject, task);
import org.jkiss.dbeaver.ui.UIUtils;
    protected void updateFileSettings(@Nullable Path file) {
        updateFileSettings(file);
 * you may not use this file except in compliance with the License.
        setWindowTitle(taskTitle);
 * DBeaver - Universal Database Manager

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        addPage(logPage);
    public void onSuccess(long workTime) {

 *
import java.util.Collection;
    protected boolean isSingleTimeWizard() {
        getSettings().setInputFile(file != null && Files.exists(file) ? file.toAbsolutePath().toString() : null);



 */
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
                NLS.bind(TaskNativeUIMessages.tools_script_execute_wizard_task_completed, taskTitle, getObjectsName()) , //$NON-NLS-1$
    }

    }
import org.eclipse.swt.SWT;
import java.nio.file.Files;
    }
    protected AbstractNativeScriptExecuteWizard(DBTTask task) {
import java.nio.file.Path;
 *
    protected AbstractNativeScriptExecuteWizard(Collection<BASE_OBJECT> dbObject, String task) {
import org.eclipse.osgi.util.NLS;
{
        setNeedsProgressMonitor(true);
        //super.addPages();
    public void init(IWorkbench workbench, IStructuredSelection selection) {
