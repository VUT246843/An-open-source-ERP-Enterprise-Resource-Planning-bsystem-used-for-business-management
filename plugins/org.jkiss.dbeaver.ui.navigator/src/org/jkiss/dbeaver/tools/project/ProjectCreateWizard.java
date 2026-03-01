        final IProgressMonitor nestedMonitor = RuntimeUtils.getNestedMonitor(monitor);

                    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            addPage(projectSettingsPage);
    @Override
 *

            project.open(nestedMonitor);
import org.jkiss.utils.CommonUtils;

}
        if (super.performFinish()) {
            try {

    public IWizardPage getNextPage(IWizardPage page) {

    private ProjectCreateRemotePage remoteProjectPage;

        if (!project.isOpen()) {
import org.jkiss.dbeaver.model.rcp.DBeaverNature;
                DBWorkbench.getPlatformUI().showError(

    public ProjectCreateWizard() {
import org.eclipse.ui.INewWizard;
            remoteProjectPage = new ProjectCreateRemotePage("RemoteProjectCreate");
        super.init(workbench, selection);
/*


        } else {
public class ProjectCreateWizard extends BasicNewProjectResourceWizard implements INewWizard {
                return false;
                            throw new InvocationTargetException(e);
        }
                    public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
import org.jkiss.dbeaver.model.rcp.RCPProject;
        }
    @Override

                    UINavigatorMessages.dialog_project_create_wizard_error_cannot_create_message,
                UIUtils.run(getContainer(), true, true, new DBRRunnableWithProgress() {
                DBPProject newProject = DBPPlatformDesktop.getInstance().getWorkspace().createProject(
                UINavigatorMessages.dialog_project_create_wizard_error_cannot_create,
package org.jkiss.dbeaver.tools.project;
            DBWorkbench.getPlatformUI().showError(
                return false;
import org.eclipse.jface.wizard.IWizardPage;
                    e);
            addPage(remoteProjectPage);
                "You can't manage projects"
        if (!CommonUtils.isEmpty(data.getDescription())) {
            super.addPages();
                    remoteProjectPage.getProjectName(),
                        UINavigatorMessages.dialog_project_create_wizard_error_cannot_create,
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
    private IProject project;
            return true;
        }
            return false;
    }
                        }
                return false;
    }
            projectSettingsPage = new WizardPrefPage(projectSettingsPref, "Resources", "Project resources");
        } else {
	}
            }
            final PrefPageProjectResourceSettings projectSettingsPref = new PrefPageProjectResourceSettings();
                project = ((RCPProject)newProject).getEclipseProject();
 * limitations under the License.
        return project;
import org.eclipse.jface.viewers.IStructuredSelection;
                    remoteProjectPage.getProjectDescription()
 *
            return true;


        return super.getNextPage(page);
        return project;
                    }
        project.setDescription(description, nestedMonitor);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    UINavigatorMessages.dialog_project_create_wizard_error_cannot_create_message,
        }
import org.jkiss.dbeaver.DBException;
                        try {
                    ex.getTargetException());
        final IProject project = getNewProject();
        }
    public IProject getProject() {
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
    @Override
        if (page instanceof WizardNewProjectCreationPage) {
        description.setNatureIds(new String[] {DBeaverNature.NATURE_ID});

            description.setComment(data.getDescription());
            return false;
                    UINavigatorMessages.dialog_project_create_wizard_error_cannot_create,
            } catch (InterruptedException ex) {
import org.jkiss.dbeaver.ui.preferences.WizardPrefPage;
    @Override
        if (!DBWorkbench.getPlatform().getWorkspace().canManageProjects()) {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.app.DBPProject;
            } catch (DBException e) {
 *
import java.lang.reflect.InvocationTargetException;
        setNeedsProgressMonitor(true);
 * you may not use this file except in compliance with the License.
        if (DBWorkbench.isDistributed()) {
    private final ProjectCreateData data = new ProjectCreateData();

    private WizardPrefPage projectSettingsPage;
                });
                DBWorkbench.getPlatformUI().showError(
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void init(IWorkbench workbench, IStructuredSelection selection) {
import org.jkiss.dbeaver.ui.UIUtils;
            } catch (InvocationTargetException ex) {
                );
            );
 */
        final IProjectDescription description = project.getDescription();
import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.ui.project.PrefPageProjectResourceSettings;
    private IProject createProject(DBRProgressMonitor monitor) throws CoreException {
import org.eclipse.core.runtime.IProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
                            project = createProject(monitor);
            }
                        } catch (Exception e) {

        setWindowTitle(UINavigatorMessages.dialog_project_create_wizard_title);
        }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    }
            try {
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
            return projectSettingsPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.resources.IProject;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void addPages() {
	}
        if (DBWorkbench.isDistributed()) {
	public boolean performFinish() {

import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.core.resources.IProjectDescription;

 * DBeaver - Universal Database Manager
