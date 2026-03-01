/*
            return null;
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.core.commands.AbstractHandler;
    }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
        }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (WorkbenchInitializerCreateSampleDatabase.isSampleDatabaseExists(registry)) {
            // No active project
    public Object execute(ExecutionEvent event) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.app.DBPProject;
        DBPDataSourceRegistry registry = activeProject.getDataSourceRegistry();
import org.eclipse.swt.widgets.Shell;
 * You may obtain a copy of the License at
 * limitations under the License.
 * See the License for the specific language governing permissions and
        Shell shell = UIUtils.getActiveWorkbenchShell();
        }
 */
import org.eclipse.swt.SWT;
            return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.core.commands.ExecutionEvent;
 * distributed under the License is distributed on an "AS IS" BASIS,

        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        if (WorkbenchInitializerCreateSampleDatabase.showCreateSampleDatabasePrompt(shell)) {
            UIUtils.showMessageBox(shell, SampleDatabaseMessages.dialog_already_created_title, SampleDatabaseMessages.dialog_already_created_description, SWT.ICON_WARNING);
package org.jkiss.dbeaver.ui.config.sample;
 * Unless required by applicable law or agreed to in writing, software
            WorkbenchInitializerCreateSampleDatabase.createSampleDatabase(registry);
 *
public class SampleDatabaseHandler extends AbstractHandler {
}
 *
        }
 *
        if (activeProject == null || !activeProject.isRegistryLoaded()) {
