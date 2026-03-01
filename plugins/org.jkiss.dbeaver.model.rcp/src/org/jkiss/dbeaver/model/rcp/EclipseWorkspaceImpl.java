/*
                            if (delta.getKind() == IResourceDelta.REMOVED) {
            }
            eclipseWorkspace.save(true, monitor.getNestedMonitor());
                    projectMetadata = createProjectFrom(project);
    public String getWorkspaceId() {
        for (DBPProjectListener listener : getListenersCopy()) {
            platform.getPreferenceStore().setValue(
    @NotNull
        }
        }
import java.nio.file.Path;
    protected DesktopProjectImpl createProjectFrom(IProject project) {
                    @Override
    }
            throw new DBRuntimeException(ex);
import java.lang.reflect.InvocationTargetException;
            }

                log.error(e);
            }
    }
        }
        return readWorkspaceId(workspaceConfigPath);
                                    activeProject = projectMetadata;
            allProjects = root.getProjects();

        // Try to read workspace config from workspace root and from metadata

    @Nullable
                log.error("Can't create default project", e);
            this.projectListener = new ProjectListener();
            try {
                    });
        synchronized (projectListeners) {
        } catch (CoreException e) {
            return project;


        }
        return new DesktopProjectImpl(this, project, this.getAuthContext());
    }
                    public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
    protected String initWorkspaceId() {
            try {
 *
        }
import org.eclipse.core.runtime.NullProgressMonitor;



                log.error("Error opening active project", e);
 * Basically just a wrapper around Eclipse workspace.
        this.workspaceId = initWorkspaceId();
    @Override
        }
    @Nullable
        if (!CommonUtils.equalObjects(oldActiveProject, project)) {

        if (activeProject != null && !activeProject.isOpen()) {
        final String baseProjectName = DBWorkbench.getPlatform().getApplication().getDefaultProjectName();
            project.open(monitor);

 * Identified by unique ID (random UUID).

    public void save(DBRProgressMonitor monitor) throws DBException {
    private class ProjectListener implements IResourceChangeListener {
 *
                activeProject.ensureOpen();
import org.jkiss.dbeaver.model.DBConstants;
    }
                PROP_PROJECT_ACTIVE, project == null ? "" : project.getName());
    }

            }
                createDefaultProject();
            if (movedToPath != null) {
            project.setDescription(description, monitor);
                }
            loadWorkspaceProjects();
                                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.registry.internal.RegistryMessages;
                // Higher delta kind is processed first. See IResourceDelta constants
    protected boolean isDefaultProjectNeeded() {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (project.exists() && !project.isHidden() && isProjectAccessible(project)) {
        }

        if (ArrayUtils.isEmpty(allProjects)) {

import org.eclipse.core.runtime.IPath;
                IPath newPath = movedToPath.makeRelativeTo(projectMetadata.getEclipseProject().getFullPath());
            for (IResourceDelta childDelta : delta.getAffectedChildren(IResourceDelta.ALL_WITH_PHANTOMS, IContainer.INCLUDE_HIDDEN)) {
                                if (projectMetadata == activeProject) {
import org.jkiss.dbeaver.model.app.DBPProjectListener;
                                if (projectMetadata != null) {
            } else {
            //DBWorkbench.getPlatformUI().showError("Error loading projects", "Error loading workspace projects", ex);

        synchronized (projects) {
    public DBPProject getProject(@NotNull String projectName) {
import org.jkiss.dbeaver.model.impl.app.BaseWorkspaceImpl;
 * you may not use this file except in compliance with the License.
            description.setNatureIds(new String[]{DBeaverNature.NATURE_ID});
    protected boolean isProjectAccessible(IProject project) {
            workspaceConfigPath = getMetadataFolder();
        public void resourceChanged(IResourceChangeEvent event) {
        return projects.get(project);
                                }
        for (int i = 1; ; i++) {


        }
                IPath oldPath = delta.getProjectRelativePath();
        return eclipseWorkspace;
            }
package org.jkiss.dbeaver.model.rcp;
                            } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void reloadWorkspace(DBRProgressMonitor monitor) {
    private static final Log log = Log.getLog(EclipseWorkspaceImpl.class);
            listener.handleActiveProjectChange(oldActiveProject, activeProject);

 * DBeaver workspace.

        return true;
    }
    protected void fireActiveProjectChange(DBPProject oldActiveProject, DBPProject activeProject) {
    public DBPProject getProject(@NotNull IProject project) {
            final IProject project = getEclipseWorkspace().getRoot().getProject(projectName);

        String projectName = baseProjectName;
                        }
                project.dispose();
        return new ArrayList<>(projects.values());
        }
 * See the License for the specific language governing permissions and
    }
                projectMetadata.removeResourceFromCache(delta.getProjectRelativePath());
    }
    @Override
                    .equals(activeProjectName))) {
 *
 * Additionally, holds information about remote workspace.
            log.warn("Some project listeners are still register: " + projectListeners);
                        reloadWorkspace(monitor);
        super(platform, eclipseWorkspace.getRoot().getLocation().toPath());
import org.jkiss.dbeaver.model.access.DBAPermissionRealm;
                                if (activeProject == null) {
                                fireProjectRemove(projectMetadata);
            try {

    public EclipseWorkspaceImpl(DBPPlatform platform, IWorkspace eclipseWorkspace) {
        synchronized (projectListeners) {
                DBWorkbench.getPlatformUI().executeWithProgressBlocking("Reload", new DBRRunnableWithResult<>() {


 * DBeaver - Universal Database Manager
    public void addProjectListener(@NotNull DBPProjectListener listener) {
                projectName = baseProjectName + i;
            for (BaseProjectImpl project : this.projects.values()) {
    protected void fireProjectAdd(BaseProjectImpl project) {
            fireActiveProjectChange(oldActiveProject, this.activeProject);
    private final ProjectListener projectListener;
        }
                this.projects.put(project, projectMetadata);
                            if (delta.getKind() == IResourceDelta.ADDED) {
        if (DBWorkbench.getPlatform().getApplication().isStandalone() && CommonUtils.isEmpty(projects) && isDefaultProjectNeeded() && !isReadOnly()) {
import org.jkiss.utils.CommonUtils;
        IWorkspaceRoot root = getEclipseWorkspace().getRoot();
        if (getActiveProject() == null && !projects.isEmpty() && !isReadOnly()) {
                                    fireActiveProjectChange(null, activeProject);
        IProject[] allProjects = root.getProjects();

        return getProject(eProject);
    private final IWorkspace eclipseWorkspace;
    public void removeProjectListener(@NotNull DBPProjectListener listener) {


 * Unless required by applicable law or agreed to in writing, software
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.ArrayUtils;
public abstract class EclipseWorkspaceImpl extends BaseWorkspaceImpl implements DBPWorkspaceEclipse {
                Arrays.stream(event.getDelta().getAffectedChildren())
    public List<DBPProject> getProjects() {
import java.nio.file.Files;
            projectListeners.add(listener);
        }

        }
    private DBPProjectListener[] getListenersCopy() {
                                // Project deleted
import org.jkiss.code.NotNull;
        
            if (project.exists()) {
                                fireProjectAdd(projectMetadata);
                DesktopProjectImpl projectMetadata = projects.get(project);
    }
        if (!isReadOnly()) {
            return null;

                // Process removed projects first and added projects afterwards to properly update current active project
            listeners = projectListeners.toArray(new DBPProjectListener[0]);
    }
        } else {
    }
 * You may obtain a copy of the License at

            // Dispose all DS registries
            this.getEclipseWorkspace().addResourceChangeListener(projectListener);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
            }
    @Override
        return workspaceId;
        }
import org.eclipse.core.resources.*;
    public IWorkspace getEclipseWorkspace() {
                                    activeProject = null;
                                // Some changes within project - reflect them in metadata cache
        }
 * limitations under the License.
                if (activeProject == null || (!CommonUtils.isEmpty(activeProjectName) && projectMetadata.getName()
        return listeners;
        }
    @Override
    private final List<DBPProjectListener> projectListeners = new ArrayList<>();
    @NotNull

        } else {


            setActiveProject(projects.values().iterator().next());

            } catch (Throwable e) {
                                    handleResourceChange(projectMetadata, delta);
            this.projects.clear();
import org.eclipse.core.runtime.CoreException;
        initializeWorkspaceSession();

        if (projectListener != null) {
            this.projectListener = null;

                    .sorted(Comparator.comparingInt(IResourceDelta::getKind).reversed())
    }
            }
        @Override
        }
}
    private final String workspaceId;
            project.create(monitor);
import org.jkiss.code.Nullable;
        try {
                        } else {
        }
            final IProjectDescription description = getEclipseWorkspace().newProjectDescription(project.getName());
        String activeProjectName = getPlatform().getPreferenceStore().getString(PROP_PROJECT_ACTIVE);

import org.jkiss.dbeaver.DBRuntimeException;
        try {
                                DesktopProjectImpl projectMetadata = projects.get(project);
                            }
    @Override
                                projectMetadata.dispose();
        }
                        if (!projects.containsKey(project)) {
    protected final Map<IProject, DesktopProjectImpl> projects = new LinkedHashMap<>();
        Path workspaceConfigPath = getAbsolutePath();
        for (IProject project : allProjects) {
            }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
                                DesktopProjectImpl projectMetadata = projects.remove(project);

        return DBWorkbench.getPlatform().getApplication().getDefaultProjectName() != null;
    @NotNull

        DBPProject oldActiveProject = this.activeProject;
        } catch (DBException ex) {
            projectListeners.remove(listener);

        return hasRealmPermission(DBAPermissionRealm.PERMISSION_ADMIN);
                });
                                }
    }
import org.jkiss.dbeaver.model.app.DBPPlatform;
import org.jkiss.dbeaver.model.impl.app.BaseProjectImpl;
        synchronized (projectListeners) {
    }
import org.jkiss.dbeaver.model.app.DBPWorkspaceEclipse;
import java.util.*;
        }
        }
            NullProgressMonitor monitor = new NullProgressMonitor();
                projectMetadata.moveResourceCache(oldPath, newPath);
    }

    public void setActiveProject(@NotNull DBPProject project) {
    @NotNull
    public boolean isAdmin() {
 */
            } catch (IllegalStateException e) {
            } catch (CoreException e) {
    protected void fireProjectRemove(BaseProjectImpl project) {
            listener.handleProjectAdd(project);
import org.jkiss.dbeaver.DBException;
                            }
    @Override
    @Override
        // and read from workspace if config exists

        IProject eProject = eclipseWorkspace.getRoot().getProject(projectName);
    public void dispose() {
import org.jkiss.dbeaver.model.app.DBPProject;
            listener.handleProjectRemove(project);
            projectListeners.clear();

        }
        if (!eProject.exists()) {

        this.eclipseWorkspace = eclipseWorkspace;
                continue;
    }
            this.getEclipseWorkspace().removeResourceChangeListener(projectListener);
        // Metedata is the default path but we keep backward compatibility
                }
        if (!Files.exists(workspaceConfigPath.resolve(DBConstants.WORKSPACE_PROPS_FILE))) {
        for (DBPProjectListener listener : getListenersCopy()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    activeProject = projectMetadata;
    }
    protected void loadWorkspaceProjects() throws DBException {
        if (delta.getKind() == IResourceDelta.REMOVED) {
    }
    private IProject createDefaultProject() throws CoreException {
    }
 *
                    .forEach(delta -> {
                                DesktopProjectImpl projectMetadata = createProjectFrom(project);
            throw new DBException("Error saving Eclipse workspace", e);

    public final void initializeProjects() {

        for (DBPProjectListener listener : getListenersCopy()) {
                        IProject project = (IProject) delta.getResource();
    }
    }
/**
    @Override
    @Override
    private void handleResourceChange(DesktopProjectImpl projectMetadata, IResourceDelta delta) {
                    }
                if (projectMetadata == null) {
            if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
                projectMetadata.hideConfigurationFiles();
            // Set active project

            description.setComment(RegistryMessages.project_description_comment);
    }
                    .filter(delta -> delta.getResource() instanceof IProject)
    }
        this.activeProject = project;
        if (!projectListeners.isEmpty()) {
    }
        }
                                projects.put(project, projectMetadata);
        super.dispose();
            }
    }
                                    fireActiveProjectChange(projectMetadata, null);
        }
        DBPProjectListener[] listeners;
import org.jkiss.dbeaver.Log;
            IPath movedToPath = delta.getMovedToPath();
                handleResourceChange(projectMetadata, childDelta);
    @Override
