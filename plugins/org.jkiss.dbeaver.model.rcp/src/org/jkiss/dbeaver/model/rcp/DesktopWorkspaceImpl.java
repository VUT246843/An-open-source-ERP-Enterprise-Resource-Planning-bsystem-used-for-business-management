        DBPResourceHandler handler = null;
                handlerDescriptors.add(handlerDescriptor);
    public IFolder getResourceDefaultRoot(@NotNull DBPProject project, @NotNull Class<? extends DBPResourceHandler> handlerType, boolean forceCreate) {
                    try (ObjectInputStream ois = new ObjectInputStream(is)) {
    }
        }
                }
            }
}            if (!workspaceLocation.exists()) {
                eclipseProject.move(description, true, null);
                        }

            secretController.deleteProjectSecrets(project.getId());
        if (resource.getParent() instanceof IProject && resource.getName().startsWith(DBPDataSourceRegistry.LEGACY_CONFIG_FILE_PREFIX)) {
        super.dispose();
import org.jkiss.utils.CommonUtils;

            return null;
                fileProps.remove(property);
        }
                        String projectName = wsFile.getName();
            if (value == null) {
                    if (projectConfig.exists()) {
                        realFolder.create(true, true, new NullProgressMonitor());
        }
            NullProgressMonitor monitor = new NullProgressMonitor();
    public DBPProject createProject(@NotNull String name, @Nullable String description) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            File[] wsFiles = workspaceLocation.listFiles();

    private final List<ResourceHandlerDescriptor> handlerDescriptors = new ArrayList<>();
        }
        if (project instanceof DesktopProjectImpl projectImpl) {
                try (OutputStream os = Files.newOutputStream(propsFile)) {
                        }

            super("External files metadata saver");

    public DBPResourceHandler getDefaultResourceHandler() {
    public void refreshWorkspaceContents(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.registry.ResourceTypeRegistry;
            throw new DBException("Error deleting Eclipse project '" + project.getName() + "'", e);
            } catch (CoreException e) {
            project = getEclipseWorkspace().getRoot().getProject(name);
        }
    @Override
                    // No root
            if (handler != null && handler.getClass() == handlerType) {
        }

    private void saveExternalFileProperties() {
                if (resourceType == null) {
                fileProps = new HashMap<>();
                }
        }
    @Nullable
                return realFolder;
                        final Object object = ois.readObject();
    }
                }
            try {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
                try (InputStream is = Files.newInputStream(propsFile)) {
            project.setDescription(pDescription, monitor);
        if (DBWorkbench.getPlatform().getApplication().isExclusiveMode()) {
        // Check resource is synced

            synchronized (externalFileProperties) {

//        if (resource instanceof IFile && !resource.isSynchronized(IResource.DEPTH_ZERO)) {
    }

            return Status.OK_STATUS;
            throw new DBException("Error creating Eclipse project", e);
                if (rootResource == null) {

    }
        synchronized (externalFileProperties) {
        return getProject(project);
            final IProjectDescription pDescription = getEclipseWorkspace().newProjectDescription(project.getName());
    }
                if (resType != null) {
//            ContentUtils.syncFile(new VoidProgressMonitor(), resource);
import org.jkiss.dbeaver.model.impl.app.BaseWorkspaceImpl;
                description.setName(newName);
                    }
    }
    public Map<String, Map<String, Object>> getAllFiles() {
        {
 * distributed under the License is distributed on an "AS IS" BASIS,
            return null;
            final IProject eclipseProject = resource.getProject();
                        } catch (CoreException e) {
 * See the License for the specific language governing permissions and
    public void deleteProject(@NotNull DBPProject project, boolean deleteContents) throws DBException {
    @Override

            if (rhd.getTypeId().equals(resourceType.getId())) {
 * You may obtain a copy of the License at
        if (project == activeProject) {
    @Override

    }
    public DBPResourceHandler getResourceHandler(@Nullable IResource resource) {
                handler = rhd.getHandler();


            if (fileProps == null) {

        }
        for (ResourceHandlerDescriptor rhd : handlerDescriptors) {
    @Override
        @NotNull
                    if (!wsFile.isDirectory() || wsFile.isHidden() || wsFile.getName().startsWith(".")) {
import org.jkiss.code.Nullable;
        String defaultRoot = resourceType.getDefaultRoot(project);
                for (File wsFile : wsFiles) {
import org.jkiss.dbeaver.model.secret.DBSSecretController;
        // Find handler

        return null;
        saveExternalFileProperties();
            return externalFileProperties.get(file.getAbsolutePath());
import org.jkiss.dbeaver.model.DBPExternalFileManager;
 *
        }
    @Override
            return null;
    }
                    }
            // Skip connections settings file
                        if (project.exists()) {



        IProject project = null;
                File projectDir = project.getLocation().toFile();
import org.jkiss.dbeaver.model.DBPAdaptable;
        return defaultHandler;


                externalFileProperties.put(filePath, fileProps);
            }
                project.create(monitor);
        if (project.isUseSecretStorage()) {
            throw new DBException("You cannot delete active project");
 *
        if (handler == null) {
            } catch (CoreException e) {

            }
        }
                            externalFileProperties.putAll((Map) object);

    }
    }
        }
    @Override
                return;
        }
                .resolve(EXT_FILES_PROPS_STORE);

    private static final Log log = Log.getLog(DesktopWorkspaceImpl.class);
        if (eclipseProject == null) {
        if (resource == null || resource.isHidden() || resource.isPhantom()) {

        if (resourceType == null) {
    }
                            log.error("Error adding project '" + projectName + "' to workspace");
    }
        }
        if (!(project instanceof RCPProject rcpProject)) {

            }
            }
            return new LinkedHashMap<>(externalFileProperties);
import org.eclipse.core.runtime.*;
        try {
        }
                String folderPath = relativePath.toString();
        return handler;
    public DBPResourceHandlerDescriptor[] getAllResourceHandlers() {
        for (ResourceHandlerDescriptor handlerDescriptor : this.handlerDescriptors) {
            return null;
                throw new DBException("Error renaming project", e);
    @Override
            handlerDescriptor.dispose();
            root.refreshLocal(IResource.DEPTH_ONE, monitor.getNestedMonitor());
    @Override
        }
            return null;
                pDescription.setComment(description);
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ResourceHandlerDescriptor.EXTENSION_ID);
 */
        super(platform, eclipseWorkspace);
        DBPResourceTypeDescriptor resourceType = rhd.getResourceType();
    }
                realFolder.create(true, true, new NullProgressMonitor());
 *     http://www.apache.org/licenses/LICENSE-2.0
            var secretController = DBSSecretController.getProjectSecretController(project);
                }

            final String filePath = file.getAbsolutePath();
        for (ResourceHandlerDescriptor rhd : handlerDescriptors) {

                        // skip regular files
                        oos.writeObject(externalFileProperties);
            if (Files.exists(propsFile)) {
import java.util.*;
        }
        final IFolder realFolder = rcpProject.getRootResource().getFolder(new org.eclipse.core.runtime.Path(defaultRoot));
import org.jkiss.dbeaver.model.app.*;
            throw new DBException("Project '" + project.getName() + "' is not an RCP project");
        loadExtensions(Platform.getExtensionRegistry());
 * DBeaver desktop workspace.
 *
                fileProps.put(property, value);
    }
            Map<String, Object> fileProps = externalFileProperties.get(filePath);
            } else {
        public WorkspaceFilesMetadataJob() {
        }


        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        synchronized (externalFileProperties) {
            if (project.exists()) {
    @Override
                IContainer rootResource = rcpProject.getRootResource();
                break;
            java.nio.file.Path propsFile = GeneralUtils.getMetadataFolder(getAbsolutePath())
    private DBPResourceHandler defaultHandler;
        }
            for (IConfigurationElement ext : extElements) {
        if (handler == null && resource instanceof IFolder) {
        @Override
                IProjectDescription description = eclipseProject.getDescription();

                        return realFolder;
    private class WorkspaceFilesMetadataJob extends AbstractJob {
    @Override
        for (ResourceHandlerDescriptor rhd : handlerDescriptors) {
            throw new DBException("Project '" + project.getName() + "' is not an Eclipse project");
            // Remove unexistent projects
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    throw new IllegalStateException("Project " + project.getName() + " doesn't have resource root");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DesktopWorkspaceImpl(@NotNull DBPPlatform platform, @NotNull IWorkspace eclipseWorkspace) {
    public void renameProject(@NotNull DBPProject project, @NotNull String newName) throws DBException {
                ResourceTypeDescriptor resType = ResourceTypeRegistry.getInstance().getResourceTypeByRootPath(project, folderPath);
                if (!projectDir.exists()) {
            eclipseProject.delete(deleteContents, true, new NullProgressMonitor());
    public void setFileProperty(File file, String property, Object value) {
    @Override
                if (defaultRoot == null) {
            if (!ArrayUtils.isEmpty(wsFiles)) {
                monitor.beginTask("Refreshing workspace contents", wsFiles.length);
            DesktopProjectImpl project = projects.get(eclipseProject);
            }
                ResourceHandlerDescriptor handlerDescriptor = new ResourceHandlerDescriptor(ext);
        if (resource != null) {
            }
                    log.error("Error saving external files properties", e);
    }
            // No root
        return null;
                            continue;
        synchronized (externalFileProperties) {
        if (!(project instanceof RCPProject rcpProject) || rcpProject.getRootResource() == null) {
                    log.error("Error saving external files properties", e);
            }
            return null;
    @Override
    public Map<String, Object> getFileProperties(File file) {
    }
                return rhd.getHandler();
import java.nio.file.Files;
        }
                        log.error("Can not create '" + resourceType.getName() + "' root folder '" + realFolder.getName() + "'", e);
        }
        try {
                // Add missing projects
        } catch (Exception e) {
            pDescription.setNatureIds(new String[]{DBeaverNature.NATURE_ID});
    @NotNull
    public void dispose() {
                } catch (Exception e) {

            // Skip not accessible hidden and phantom resources
                if (rootResource == null) {
        synchronized (externalFileProperties) {
            project.open(monitor);
        IResource resource = resourceAdapter.getAdapter(IResource.class);
/**
            final Map<String, Object> fileProps = externalFileProperties.get(file.getAbsolutePath());
            }
                    return null;
import org.jkiss.dbeaver.model.DBPImage;
    private void loadExtensions(@NotNull IExtensionRegistry registry) {

            }
    private void loadExternalFileProperties() {
        loadExternalFileProperties();
        synchronized (externalFileProperties) {
    }
            }
        }
            }

        synchronized (externalFileProperties) {
    }
                log.error("Can't create '" + resourceType.getName() + "' root folder '" + realFolder.getName() + "'", e);

            return null;

                }
    @NotNull
                        continue;
                    defaultHandler = handlerDescriptor.getHandler();
 * Unless required by applicable law or agreed to in writing, software
                            log.error("Bad external files properties data format: " + object);

                DBPResourceTypeDescriptor resourceType = rhd.getResourceType();
        return handlerDescriptors.toArray(new DBPResourceHandlerDescriptor[0]);
        } catch (CoreException e) {
                if (forceCreate && !realFolder.exists()) {
            // Resource handlers are disabled in exclusive mode
            }
                    monitor.subTask("Removing unexistent project '" + project.getName() + "'");
        return rcpProject.getEclipseProject().getFolder(BaseWorkspaceImpl.DEFAULT_RESOURCES_ROOT);
            while (relativePath.segmentCount() > 0) {
 */
            return fileProps == null ? null : fileProps.get(property);
    private final Map<String, Map<String, Object>> externalFileProperties = new HashMap<>();
    }
        }

                        }
    @Override
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    return null;
        }
            handler = getDefaultResourceHandler();

                org.eclipse.core.runtime.Path defaultRootPath = new org.eclipse.core.runtime.Path(defaultRoot);
                project.updateProject(newName, null);
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.model.rcp;
            if (!CommonUtils.isEmpty(description)) {
    @Nullable
        return realFolder;
            DBPResourceHandler handler = rhd.getHandler();
import org.jkiss.dbeaver.registry.ResourceTypeDescriptor;

        // Dispose resource handlers

    @NotNull
import org.jkiss.dbeaver.registry.ResourceHandlerDescriptor;
    private DBPResourceHandler getResourceHandler(DBPResourceTypeDescriptor resourceType) {
            log.error("Error refreshing workspace contents", e);
 * you may not use this file except in compliance with the License.
                }
            if (rhd.canHandle(resource)) {
        if (forceCreate && !realFolder.exists()) {
                final IFolder realFolder = rootResource.getFolder(defaultRootPath);
            }
    }
    }
    public DBPImage getResourceIcon(DBPAdaptable resourceAdapter) {
        this.handlerDescriptors.clear();
                relativePath = relativePath.removeLastSegments(1);
            return defaultHandler.getResourceIcon(resource);
                    }
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
                } catch (Exception e) {
import org.eclipse.core.resources.*;
            }
                        try {

        }
                }
    public IFolder getResourceDefaultRoot(@NotNull DBPProject project, @NotNull DBPResourceHandlerDescriptor rhd, boolean forceCreate) {
                            monitor.subTask("Adding project '" + projectName + "'");
                    }

    @Override
            // TODO: remove in some older version
                }
                }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
//        }
                    File projectConfig = new File(wsFile, IProjectDescription.DESCRIPTION_FILE_NAME);
                    } catch (CoreException e) {
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (defaultRoot == null) {

    private static final String EXT_FILES_PROPS_STORE = "dbeaver-external-files.data";
                if (handlerDescriptor.isDefault()) {
                    rootResource = rcpProject.getEclipseProject();
                return realFolder;
    @Override
        IProject eclipseProject = rcpProject.getEclipseProject();
                    try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
        }


import java.io.*;
        }
        }
        }
        }
    private final AbstractJob externalFileSaver = new WorkspaceFilesMetadataJob();
        }
                }
                            project.create(monitor.getNestedMonitor());
                    .resolve(EXT_FILES_PROPS_STORE);
                        IProject project = root.getProject(projectName);
    public Object getFileProperty(File file, String property) {
            try {
            }
    }
            File workspaceLocation = root.getLocation().toFile();
            externalFileSaver.schedule(100);
            externalFileProperties.clear();
            IProject eclipseProject = projectImpl.getEclipseProject();
                    project.delete(false, true, monitor.getNestedMonitor());
public class DesktopWorkspaceImpl extends EclipseWorkspaceImpl implements DBPWorkspaceDesktop, DBPExternalFileManager {
    @Override
            for (IProject project : root.getProjects()) {
/*
        if (!(project instanceof RCPProject rcpProject)) {
                String defaultRoot = resourceType.getDefaultRoot(project);
    @NotNull
        }
                        if (object instanceof Map) {
                // Nothing to refresh
import org.jkiss.utils.ArrayUtils;
            IPath relativePath = resource.getFullPath().makeRelativeTo(project.getRootResource().getFullPath());
        } catch (Throwable e) {
        try {
                        } else {
                    try {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        refreshWorkspaceContents(monitor);
            IWorkspaceRoot root = getEclipseWorkspace().getRoot();
                java.nio.file.Path propsFile = GeneralUtils.getMetadataFolder(getAbsolutePath())
                    }
    protected void reloadWorkspace(DBRProgressMonitor monitor) {
                    handler = getResourceHandler(resType);
