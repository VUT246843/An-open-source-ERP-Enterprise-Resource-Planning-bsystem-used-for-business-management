    private static final Log log = Log.getLog(ProjectCloneHandler.class);
            org.eclipse.egit.ui.Activator.getDefault().getDialogSettings().put(
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Throwable e) {
        GitImportWizard wizard = new GitImportWizard();
 * you may not use this file except in compliance with the License.
import org.eclipse.core.commands.ExecutionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Set new project default option (Create general project. As Create New Project is broken)
 *
package org.jkiss.dbeaver.team.git.ui.handlers;
        wizardDialog.open();
/*
	public Object execute(ExecutionEvent event) {
        wizardDialog.setHelpAvailable(false);
            // FIXME: this is a EGIT hack

	    return null;

            // https://bugs.eclipse.org/bugs/show_bug.cgi?id=324145
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                    GitSelectWizardPage.GENERAL_WIZARD);
                    "org.eclipse.egit.ui.internal.clone.GitSelectWizardPageWizardSel",
 */
		
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.Log;
import org.eclipse.core.commands.AbstractHandler;
 *
public class ProjectCloneHandler extends AbstractHandler {
    @Override


            HandlerUtil.getActiveShell(event), wizard);
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
        IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
import org.eclipse.egit.ui.internal.clone.GitImportWizard;
        wizard.init(workbench, HandlerUtil.getCurrentStructuredSelection(event));


        WizardDialog wizardDialog = new WizardDialog(
        try {
 *
 * DBeaver - Universal Database Manager

	}
import org.eclipse.egit.ui.internal.clone.GitSelectWizardPage;
 * You may obtain a copy of the License at
            log.debug(e);
 * See the License for the specific language governing permissions and
import org.eclipse.ui.handlers.HandlerUtil;
 * Unless required by applicable law or agreed to in writing, software
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
