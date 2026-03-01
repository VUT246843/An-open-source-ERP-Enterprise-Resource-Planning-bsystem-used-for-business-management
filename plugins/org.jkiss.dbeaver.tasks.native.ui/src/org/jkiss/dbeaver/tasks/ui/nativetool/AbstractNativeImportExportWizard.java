
 * limitations under the License.
        return true;
    public void init(IWorkbench workbench, IStructuredSelection selection) {
    protected AbstractNativeImportExportWizard(DBTTask task) {

    @Override
 *
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IWorkbench;
 * you may not use this file except in compliance with the License.
        setNeedsProgressMonitor(true);
    @Override

    }
        addPage(logPage);
}
    extends AbstractNativeToolWizard<SETTINGS, DBSObject, PROCESS_ARG> implements IExportWizard {
public abstract class AbstractNativeImportExportWizard<SETTINGS extends AbstractImportExportSettings<DBSObject>, PROCESS_ARG>
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.task.DBTTask;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    protected boolean isSingleTimeWizard() {
    }
        super(task);
        super(objects, title);
    public boolean isVerbose() {
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.util.Collection;
    }
    }
    @Override
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        setWindowTitle(taskTitle);
    }

 * DBeaver - Universal Database Manager
        return false;
 * Unless required by applicable law or agreed to in writing, software
    }

    @Override
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.eclipse.jface.viewers.IStructuredSelection;
    protected AbstractNativeImportExportWizard(Collection<DBSObject> objects, String title) {

    public void addPages() {

import org.eclipse.ui.IExportWizard;
package org.jkiss.dbeaver.tasks.ui.nativetool;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
