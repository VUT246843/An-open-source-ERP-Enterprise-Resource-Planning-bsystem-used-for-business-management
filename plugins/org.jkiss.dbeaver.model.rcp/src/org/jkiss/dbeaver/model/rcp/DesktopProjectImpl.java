                    project.refreshLocal(IFile.DEPTH_ONE, monitor);
                                      public int visit(Bucket.Entry entry) {
        );
            }
                                          if (value instanceof String[][]) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.app.DBPProject;
    }


    @Override
                        // Add nature
import org.eclipse.core.internal.localstore.BucketTree;
        }
    private void checkAndUpdateProjectStructure() {
            flushMetadata();
            return new EFSNIOFolder(root, path);
                }

                    }
                    try {
    @NotNull
        synchronized (resourcesSync) {
 * You may obtain a copy of the License at
        EFSNIOFileSystemRoot root = new EFSNIOFileSystemRoot(
import org.eclipse.core.internal.localstore.Bucket;
    public <T> T adaptResource(DBFVirtualFileSystemRoot fsRoot, Path path, Class<T> adapter) {

    @Override
                }
            try {
 *
                                                  if (resProps.length == 3) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
     */
                // Now project is in modern format

 *
            }
    private IResource createResourceFromPath(DBFVirtualFileSystemRoot fsRoot, Path path) {
    @Override
            return;
 * you may not use this file except in compliance with the License.
        return false;
import org.jkiss.code.Nullable;
        if (cacheChanged) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            flushMetadata();
        } else {
                                          Object value = entry.getValue();
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;

import org.jkiss.utils.CommonUtils;
            } catch (CoreException e) {
        return project.getName();
        }
        } else {
                }
import org.jkiss.dbeaver.model.navigator.DBNModel;
                                                              entry.getPath().makeRelativeTo(projectPath).toString(), s -> new LinkedHashMap<>());
import org.jkiss.dbeaver.registry.DataSourceRegistry;

import org.eclipse.core.runtime.IPath;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import java.io.IOException;
            IFolder metadataFolder = project.getFolder(DBPProject.METADATA_FOLDER);
            } finally {
    @Override
        boolean cacheChanged = false;
                    BucketTree.DEPTH_INFINITE);
                                          }
                            } catch (CoreException e) {

                                              String[][] bucketProps = (String[][]) value;
        super(workspace, sessionContext);
    }
                                                          propsMap.put(resProps[1], resProps[2]);
                        if (!ArrayUtils.contains(natureIds, DBeaverNature.NATURE_ID)) {
import org.eclipse.core.internal.resources.Workspace;
            Map<String, Map<String, Object>> projectResourceProperties = extractProjectResourceProperties();
    protected DBTTaskManager createTaskManager() {
import java.util.Map;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.registry.task.TaskConstants;
import org.jkiss.dbeaver.model.app.DBPWorkspaceEclipse;
                    String newResPath = CommonUtils.normalizeResourcePath(newPath.toString());
            return result;
            return new TreeMap<>(this.resourceProperties);
        if (taskManager != null) {
                    // Check project structure and migrate
                if (getWorkspace().getPlatform().getApplication().isStandalone() &&

                                          return CONTINUE;
        }
        if (taskManager == null) {


    public DBNModel getNavigatorModel() {
            synchronized (metadataSync) {
            if (resourceProperties != null) {
import org.jkiss.dbeaver.registry.task.TaskManagerImpl;
        this.project = project;
                file.setHidden(true);
                setResourceProperties(projectResourceProperties);
    @Override

        }
                String oldResPath = CommonUtils.normalizeResourcePath(oldPath.toString());
    }
                project.open(monitor);
    public boolean isVirtual() {
                    return;
        synchronized (resourcesSync) {
import org.eclipse.core.runtime.CoreException;
            }
                    } else {
                                              for (String[] resProps : bucketProps) {
            return new EFSNIOFile(root, path);
    @Override
import org.jkiss.utils.ArrayUtils;
                if (!DBWorkbench.isDistributed()) {
                }
    public void hideConfigurationFiles() {
        return project.getLocation().toFile().toPath();
    public Path getAbsolutePath() {

    }

        Path mdConfig = getMetadataPath().resolve(BaseProjectImpl.METADATA_STORAGE_FILE);

            IFolder settingsFolder = project.getFolder(SETTINGS_FOLDER);
                                                      if ("org.jkiss.dbeaver".equals(resProps[0])) {
                        }

    }
    protected DBPDataSourceRegistry createDataSourceRegistry() {
    private void hideResource(IResource file) {


                Map<String, Object> props = resourceProperties.remove(oldResPath);
    @NotNull
                final IPath projectPath = project.getFullPath();
    }
    public String getResourcePath(@NotNull IResource resource) {
                                                          Map<String, Object> propsMap = result.computeIfAbsent(
import org.jkiss.code.NotNull;
            BucketTree bucketTree = new BucketTree((Workspace) workspaceEclipse.getEclipseWorkspace(), new PropertyBucket());
            }
                            try {

                                              }
        return resource.getProjectRelativePath().toString();
    public DBTTaskManager getTaskManager(boolean create) {
                if (description != null) {
 * limitations under the License.
        DBPWorkspaceEclipse workspaceEclipse;
    public DBTTaskManager getTaskManager() {
        if (fsRoot.getFileSystem().isDirectory(path)) {
 *
    }
        if (getWorkspace() instanceof DBPWorkspaceEclipse) {
        if (project.getLocation() == null) {
        return new TaskManagerImpl(
    public boolean isOpen() {
        }
 * DBeaver - Universal Database Manager
            return;
    }
import org.jkiss.dbeaver.Log;
        return getWorkspace().getPlatform().getNavigatorModel();
    @NotNull
        }
                    e.getMessage().contains(IProjectDescription.DESCRIPTION_FILE_NAME)) {
    @Override
    }
                    if (getDataSourceRegistry() instanceof DataSourceRegistry<?> dsr && dsr.getDataSourceCount() > 0) {
    }
                }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private static final Log log = Log.getLog(DesktopProjectImpl.class);
                        recoverProjectDescription();
    @Nullable
        if (cacheChanged) {
import org.jkiss.dbeaver.model.auth.SMSessionContext;
    @Override
                    taskManager = createTaskManager();
                    cacheChanged = true;
                                                              continue;
    }
        return taskManager;
                        log.error("Error opening project", e2);
import org.jkiss.dbeaver.model.fs.nio.EFSNIOFolder;
import org.jkiss.dbeaver.model.fs.nio.EFSNIOFile;
                if (isInMemory()) {
        }
                projectInvalidated = true;
            // To avoid accidental corruption of the workspace configuration by search/replace commands,
                }

            }
                                                  }
        return create ? getTaskManager() : null;
import org.jkiss.dbeaver.model.task.DBTTaskManager;
                                                      }
 */
        this.loadMetadata();

import java.util.TreeMap;
import org.jkiss.dbeaver.model.fs.DBFResourceAdapter;
        }
                                                          if ("sql-editor-project-id".equals(resProps[1])) {
            // we need to mark metadata folder as hidden (see dbeaver/dbeaver#20759)
                if (DBWorkbench.getPlatform().getApplication() instanceof DesktopApplicationImpl && !DBWorkbench.isDistributed()) {
/*
                    resourceProperties.put(newResPath, props);
        if (file.exists() && !file.isHidden()) {
    public boolean isUseSecretStorage() {
    }
            // Migrate

 * Licensed under the Apache License, Version 2.0 (the "License");
            IFile file = project.getFile(PROJECT_FILE);
            } catch (CoreException e) {
        return null;
    @NotNull
                log.error(e);
                final IProjectDescription description = eclipseProject.getDescription();
            }
            getEclipseProject(),
    }
            if (eclipseProject != null) {
                    }
    @Nullable
        log.debug("Recovering project '" + project.getName() + "' metadata " + getAbsolutePath().toAbsolutePath());
                                eclipseProject.setDescription(description, new NullProgressMonitor());
                if (props != null) {
    }
                        setFormat(ProjectFormat.LEGACY);

            IProject eclipseProject = this.getEclipseProject();
                setFormat(ProjectFormat.MODERN);
import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystemRoot;
            log.debug(e);
    @Override
        return project.isOpen();
        return getEclipseProject();

    }
    public String getName() {

        }
    public void updateProjectNature() {
        }
    private final IProject project;
     * Validates project files structure.
                String resPath = CommonUtils.normalizeResourcePath(path.toString());
    /**
                                      }
            }
            throw new IllegalStateException("Can't determine the workspace path for project " + project.getName());

    @NotNull


                    projectPath,
    @Override
        }

                        setFormat(ProjectFormat.MODERN);
            hideResource(settingsFolder);
    }
        if (adapter == IResource.class) {
                    if (!Files.exists(mdFolder) && Files.exists(dsConfig)) {
    @Nullable
    public void recoverProjectDescription() throws IOException {
                cacheChanged = (resourceProperties.remove(resPath) != null);
package org.jkiss.dbeaver.model.rcp;
    }
    }

        BaseProjectImpl.updateProjectFile(getAbsolutePath(), project.getName());
    @Override
    }
    @Override


            try {
        }

    @Nullable
    public Map<String, Map<String, Object>> getAllResourceProperties() {
            fsRoot,
                                log.debug("Can't set project nature", e);
            workspaceEclipse = (DBPWorkspaceEclipse) getWorkspace();

            flushMetadata();
                                      @Override
    public void ensureOpen() throws IllegalStateException {
        }
    @Override
    @Override
    private Map<String, Map<String, Object>> extractProjectResourceProperties() {
                            }
                        return;
                            description.setNatureIds(ArrayUtils.add(String.class, natureIds, DBeaverNature.NATURE_ID));
            NullProgressMonitor monitor = new NullProgressMonitor();
import java.nio.file.Files;
        if (!project.isOpen()) {
            }
    private volatile boolean projectInvalidated;
                                  },
        }
     * If project was created in older DBeaver version then converts it to newer format
                    }
    }
import java.util.LinkedHashMap;
            } catch (CoreException e) {
import org.eclipse.core.internal.properties.PropertyBucket;
            getWorkspace().getMetadataFolder().resolve(TaskConstants.TASK_STATS_FOLDER)
            log.error("Error extracting project metadata", e);
}
    public IProject getEclipseProject() {
                        project.refreshLocal(IFile.DEPTH_ONE, monitor);
            hideResource(file);
    public IContainer getRootResource() {
            try {
    private static final String SETTINGS_FOLDER = ".settings";
    }
        }
                    setFormat(ProjectFormat.MODERN);
        return false;
import org.jkiss.dbeaver.model.fs.nio.EFSNIOFileSystemRoot;


                if (taskManager == null) {
    }
                    String[] natureIds = description.getNatureIds();
    @NotNull
                                                          }

    @NotNull
            try {
import org.eclipse.core.runtime.NullProgressMonitor;
    @NotNull
        return result;
        try {
    protected volatile DBTTaskManager taskManager;
import org.jkiss.dbeaver.model.impl.app.BaseProjectImpl;
    }
        try {
import java.nio.file.Path;
        if (!isRegistryLoaded()) {
        boolean cacheChanged = false;
                        project.open(monitor);
                    Path mdFolder = getMetadataFolder(false);
import org.eclipse.core.resources.*;
    public DesktopProjectImpl(@NotNull BaseWorkspaceImpl workspace, @NotNull IProject project, @Nullable SMSessionContext sessionContext) {
import org.jkiss.dbeaver.model.impl.app.BaseWorkspaceImpl;
            fsRoot.getFileSystem().getType() + "/" + fsRoot.getFileSystem().getId() + "/" + fsRoot.getRootId()

            synchronized (metadataSync) {
    }
        );
                        hideConfigurationFiles();
    }
            if (resourceProperties != null) {
        // .project file missing. Let's try to create an empty project config
import org.jkiss.dbeaver.runtime.DBWorkbench;

            }
                    Path dsConfig = getAbsolutePath().resolve(DBPDataSourceRegistry.LEGACY_CONFIG_FILE_NAME);
        }
    @Nullable
        if (getFormat() == ProjectFormat.UNKNOWN || getFormat() == ProjectFormat.MODERN) {
    @NotNull
            return adapter.cast(createResourceFromPath(fsRoot, path));
        if (!projectInvalidated) {
        if (project.isOpen() && DBWorkbench.getPlatform().getApplication().isStandalone()) {
                }
            hideResource(metadataFolder);
        } catch (Throwable e) {
                bucketTree.accept(new Bucket.Visitor() {
    void moveResourceCache(IPath oldPath, IPath newPath) {

        ensureOpen();
                log.error("Error hiding metadata folder", e);
        }
        } catch (Exception e) {
    void removeResourceFromCache(IPath path) {
        return project;
        synchronized (resourcesSync) {
                    } catch (Exception e2) {
                    checkAndUpdateProjectStructure();
public class DesktopProjectImpl extends BaseProjectImpl implements RCPProject, DBFResourceAdapter {
    }
        }
            this,
        Map<String, Map<String, Object>> result = new LinkedHashMap<>();
        if (!Files.exists(mdConfig)) {
                    // Validate project structure only for local desktop apps
        return new DataSourceRegistry<>(this);
            return taskManager;
