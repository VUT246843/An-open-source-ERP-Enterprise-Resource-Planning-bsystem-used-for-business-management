                    if (resource.getName().startsWith(DBPDataSourceRegistry.LEGACY_CONFIG_FILE_PREFIX) && resource.getName().endsWith(DBPDataSourceRegistry.LEGACY_CONFIG_FILE_EXT)) {
            element.setText(NLS.bind(GITMessages.project_share_handler_menu_element_text_add, project.getName()));
import org.eclipse.osgi.util.NLS;
                resources.add(resource);
                GITMessages.project_share_handler_notifications_title_project_added,
                "Select a project or resource to share");
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.menus.UIElement;
        if (wizardDialog.open() == IDialogConstants.OK_ID) {
        try {
 *
package org.jkiss.dbeaver.team.git.ui.handlers;
            }
        for (IResource resource : container.members(IContainer.INCLUDE_HIDDEN)) {
import org.eclipse.egit.ui.internal.sharing.SharingWizard;
        IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
                    }
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.


                }

    }
            DBeaverNotifications.showNotification(
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
                }
        } catch (CoreException e) {
        Shell shell = HandlerUtil.getActiveShell(event);
                // Add dbeaver configs
    private void addFolderToIndex(IContainer container, List<IResource> resources) throws CoreException {

            // Add content
                "Nothing to share - no active project",
        }
                    if (cfgResource instanceof IFile) {
import org.eclipse.jface.viewers.IStructuredSelection;
 *
import org.eclipse.jface.viewers.StructuredSelection;
import java.util.List;
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
    private void addProjectContentsToRepository(ExecutionEvent event, IProject project) {
    }
import org.jkiss.dbeaver.model.app.DBPProject;
                        resources.add(cfgResource);
import org.eclipse.core.commands.ExecutionEvent;
        wizard.init(workbench, project);
                            continue;
        IProject project = GitUIUtils.extractActiveProject(event);
                        continue;
 * DBeaver - Universal Database Manager
        List<IResource> resources = new ArrayList<>();

 * limitations under the License.
        }
                for (IResource cfgResource : ((IFolder) resource).members(IContainer.INCLUDE_HIDDEN)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            } else {
                continue;
                DBPMessageType.INFORMATION,
        wizardDialog.setHelpAvailable(false);
/*
        return null;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.team.git.ui.utils.GitUIUtils;
        }
                continue;
                if (resource instanceof IFolder && resource.getName().equals(".settings")) {
import org.eclipse.core.commands.AbstractHandler;

            addFolderToIndex(project, resources);
                }
import org.eclipse.ui.IWorkbench;
import org.jkiss.dbeaver.ui.ActionUtils;
        IProject project = GitUIUtils.extractActiveProject(element.getServiceLocator());
import java.util.Map;
        SharingWizard wizard = new SharingWizard();
import org.jkiss.dbeaver.ui.UIUtils;
        IStructuredSelection selection = new StructuredSelection(resources);
        WizardDialog wizardDialog = new WizardDialog(shell, wizard);
            DBWorkbench.getPlatformUI().showError(
                if (resource instanceof IFile) {
import org.eclipse.jface.wizard.WizardDialog;
            if (resource instanceof IFolder) {
            if (container instanceof IProject) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.resources.*;
    public void updateElement(UIElement element, Map parameters) {
            } else if (resource.isHidden() || resource.isTeamPrivateMember() || resource.isLinked() || resource.isVirtual() || !resource.exists()) {
import org.eclipse.swt.widgets.Shell;
        if (project != null) {
            log.error(e);
import org.jkiss.dbeaver.model.DBPMessageType;
import org.eclipse.core.runtime.CoreException;
                        if (cfgResource.getFileExtension().equals("bak")) {
        }
                "git.project.added",
            }

                        }
    }

            return null;
                    continue;
                addFolderToIndex((IFolder) resource, resources);
        }
    public Object execute(ExecutionEvent event) {
import org.eclipse.jface.dialogs.IDialogConstants;

    @Override
                () -> ActionUtils.runCommand(GITCommandIds.CMD_COMMIT, workbench));

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    }
import java.util.ArrayList;
 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(ProjectShareHandler.class);
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
            if (container instanceof IProject && resource instanceof IFolder && resource.getName().equals(DBPProject.METADATA_FOLDER)) {
        if (project == null) {
            addProjectContentsToRepository(event, project);

        ActionUtils.runCommand(GITCommandIds.EGIT_CMD_ADD_TO_INDEX, selection, UIUtils.getActiveWorkbenchWindow());
                NLS.bind(GITMessages.project_share_handler_notifications_text_project_added, project.getName()),
import org.eclipse.ui.handlers.HandlerUtil;
public class ProjectShareHandler extends AbstractHandler implements IElementUpdater {
import org.eclipse.ui.commands.IElementUpdater;
import org.jkiss.dbeaver.team.git.ui.internal.GITMessages;
}
