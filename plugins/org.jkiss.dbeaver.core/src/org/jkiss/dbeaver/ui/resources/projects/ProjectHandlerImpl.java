}
 * you may not use this file except in compliance with the License.
            UIUtils.getActiveWorkbenchWindow(),

        return "project";
                    features |= FEATURE_DELETE;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            DBWorkbench.getPlatformUI().showError("No project", "Can't get project metadata for resource " + resource.getName());
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.resources.projects;
            }
    }
import org.eclipse.core.resources.IProject;
import org.jkiss.dbeaver.ui.resources.AbstractResourceHandler;

import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
import org.jkiss.dbeaver.ui.project.EditProjectWizard;
 *
    }
public class ProjectHandlerImpl extends AbstractResourceHandler {
                if (!(DBWorkbench.isDistributed() && isPrivateProject)) {
        }
 *

        MultiPageWizardDialog dialog = new MultiPageWizardDialog(
        DBPProject project = DBPPlatformDesktop.getInstance().getWorkspace().getProject((IProject) resource);
    public int getFeatures(IResource resource) {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!(activeProject instanceof RCPProject rcpProject) || resource != rcpProject.getEclipseProject()) {
 *
        if (!(project instanceof RCPProject rcpProject)) {
import org.jkiss.dbeaver.model.rcp.RCPProject;
import org.jkiss.dbeaver.ui.actions.GlobalUIPropertyTester;
                boolean isPrivateProject = false;//activeProject.isPrivateProject()

            new EditProjectWizard(rcpProject));

import org.eclipse.core.resources.IResource;
            features |= FEATURE_RENAME;
    }
            DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Project handler
 */
    @Override
        int features = FEATURE_CREATE_FOLDER;
                }
/**
import org.jkiss.dbeaver.ui.dialogs.MultiPageWizardDialog;
        dialog.open();
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * DBeaver - Universal Database Manager
        return features;
/*
            return;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                // FIXME: restrict private projects delete
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
        if (GlobalUIPropertyTester.canManageProjects()) {
    public String getTypeName(@NotNull IResource resource) {
    public void openResource(@NotNull IResource resource) {
import org.jkiss.dbeaver.model.app.DBPProject;
