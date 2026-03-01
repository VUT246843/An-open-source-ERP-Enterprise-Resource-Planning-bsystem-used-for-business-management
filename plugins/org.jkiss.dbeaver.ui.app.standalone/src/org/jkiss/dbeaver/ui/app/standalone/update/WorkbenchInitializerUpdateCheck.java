        new DBeaverVersionChecker(false).schedule();
import org.jkiss.dbeaver.runtime.DBWorkbench;
}
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.IWorkbenchWindowInitializer;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPApplication;
 * DBeaver - Universal Database Manager
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.core.ui.services.ApplicationPolicyService;
    public void initializeWorkbenchWindow(@NotNull IWorkbenchWindowConfigurer configurer) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
public class WorkbenchInitializerUpdateCheck implements IWorkbenchWindowInitializer {
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
 * You may obtain a copy of the License at

 * limitations under the License.
 *
    }
        if (application.isDistributed() || ApplicationPolicyService.getInstance().isInstallUpdateDisabled()) {
package org.jkiss.dbeaver.ui.app.standalone.update;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        DBPApplication application = DBWorkbench.getPlatform().getApplication();

            return;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 */
