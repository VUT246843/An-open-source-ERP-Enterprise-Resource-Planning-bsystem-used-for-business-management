    }

        getProject().ensureOpen();
            IProject eclipseProject = project.getEclipseProject();
    public DBNProjectDesktop(@NotNull DBNNode parentNode, @NotNull RCPProject project) {
    @Override

 *
    }
        project.ensureOpen();
        IProject iProject = getEclipseProject();
            return adapter.cast(getEclipseProject());
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS)) {

 * See the License for the specific language governing permissions and
import org.eclipse.core.resources.IProject;
        newName = newName.trim();
        if (adapter == IResource.class || adapter == IProject.class) {
            }
    private static final Log log = Log.getLog(DBNProjectDesktop.class);

        return getProject().getEclipseProject();

 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
import org.eclipse.core.runtime.CoreException;
    @Override
        if (iProject != null) {
            } else {
    public RCPProject getProject() {
}
    }
            getProject().ensureOpen();
        } catch (Exception e) {
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
    }
    protected void addProjectNodes(DBRProgressMonitor monitor, List<DBNNode> children) throws DBException {
            children.removeIf(node -> node instanceof DBNResource && !((DBNResource) node).isResourceExists());

 */

            return super.getNodeDescription();
                // We need to change the project name in the navigator
            // Remove non-existing resources (placeholders)
    @Nullable
    @Override
            } catch (CoreException e) {
        super.addProjectNodes(monitor, children);
        children.addAll(List.of(DBNResource.readChildResourceNodes(monitor, this)));
        return (RCPProject) super.getProject();
public class DBNProjectDesktop extends DBNProject {

        return super.getAdapter(adapter);
import org.jkiss.dbeaver.model.rcp.RCPProject;

    @Override

import org.jkiss.dbeaver.Log;
 *
 * limitations under the License.
                fireNodeEvent(new DBNEvent(this, DBNEvent.Action.UPDATE, this));

    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            }

        RCPProject project = getProject();
import org.jkiss.code.NotNull;
    }
 * you may not use this file except in compliance with the License.
    }
import java.util.List;
            try {
    }
    @Override
import org.eclipse.core.resources.IProjectDescription;
 */
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
/**
 * You may obtain a copy of the License at
    }
    }
                description.setName(newName);
    public <T> T getAdapter(@NotNull Class<T> adapter) {
        super(parentNode, project);
        } else {
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
            if (DBWorkbench.isDistributed()) {

                return iProject.getDescription().getComment();
 * DBNProjectDesktop

package org.jkiss.dbeaver.model.navigator;
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    private IProject getEclipseProject() {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                throw new DBException("Eclipse project is null");
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                final IProjectDescription description = eclipseProject.getDescription();
import org.jkiss.dbeaver.runtime.DBWorkbench;
    protected void filterChildren(List<DBNNode> children) {
        GeneralUtils.validateResourceNameUnconditionally(newName);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
                return null;
            project.updateProject(newName, null);
            if (eclipseProject == null) {
        NavigatorResources.refreshThisResource(monitor, this);
                eclipseProject.move(description, true, monitor.getNestedMonitor());
        }
                log.debug(e);
 * DBeaver - Universal Database Manager
    public String getNodeDescription() {
        return super.refreshNode(monitor, source);
            throw new DBException("Can't rename project: " + e.getMessage(), e);
    @Nullable
            }
import org.jkiss.dbeaver.ModelPreferences;
import org.eclipse.core.resources.IResource;

