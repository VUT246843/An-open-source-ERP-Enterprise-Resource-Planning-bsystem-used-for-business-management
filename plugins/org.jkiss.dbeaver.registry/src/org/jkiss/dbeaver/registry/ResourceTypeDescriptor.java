
        Set<String> extensions = new LinkedHashSet<>();
            this.project = context;
            return root;
            if (context == null)
    public DBPImage getFolderIcon() {
                defaultRoot = folder;
    }
        return manageable;
        @Override
 *
import org.eclipse.core.internal.preferences.EclipsePreferences;

import org.jkiss.code.Nullable;
import org.osgi.service.prefs.BackingStoreException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return folderIcon;
            if (!CommonUtils.isEmpty(contentTypeId)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            IPath location = new Path(project.getAbsolutePath().toString());
        return roots;
    public String toString() {
    public Collection<ObjectType> getResourceTypes() {
            resourceHandlers.flush();
            String root = projectRoots.get(project.getName());
public class ResourceTypeDescriptor extends AbstractDescriptor implements DBPResourceTypeDescriptor {
        } catch (BackingStoreException e) {
                throw new IllegalArgumentException();
        return extensions.toArray(new String[0]);
    @Override
import org.osgi.service.prefs.Preferences;
        public IEclipsePreferences getNode(String qualifier) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }


        }

 */
/**
    }
        }

}
    @Override

                } else {


        return new ProjectScope(project).getNode("org.jkiss.dbeaver.project.resources");
 * Unless required by applicable law or agreed to in writing, software
            if (qualifier == null)
import org.jkiss.code.NotNull;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.registry;
                    eclipsePreferences.flush();
    private final String id;
 * limitations under the License.
        }
        }
 * DBeaver - Universal Database Manager

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
    private final DBPImage folderIcon;
            boolean isInvalidRoot = root != null && CommonUtils.isEmptyTrimmed(root);
        for (IContentType contentType : contentTypes) {
        try {

    private final boolean manageable;

    private final List<IContentType> contentTypes = new ArrayList<>();
/*
        @Override
import org.eclipse.core.runtime.preferences.IPreferencesService;

        }
 * you may not use this file except in compliance with the License.
    }
            Preferences projectNode = scopeNode.node(project.getName());
            if (root != null) {
            }
                try {
        }
    private final List<ObjectType> resourceTypes = new ArrayList<>();
    }


            if ("true".equals(rootConfig.getAttribute("default"))) {

                root = defaultRoot;
        synchronized (projectRoots) {
        public ProjectScope(DBPProject context) {
            log.error(e);
    }

 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(ResourceTypeDescriptor.class);
    public static final class ProjectScope extends AbstractScope {
                }
            if (isInvalidRoot) {
    }
                if (contentType != null) {

    @Override
    @Override
import org.jkiss.utils.ArrayUtils;
            return defaultRoot;
            String[] ctExtensions = contentType.getFileSpecs(IContentType.FILE_EXTENSION_SPEC);
            }
        for (IConfigurationElement contentTypeBinding : ArrayUtils.safeArray(config.getChildren("contentTypeBinding"))) {
import org.eclipse.core.internal.preferences.AbstractScope;
            defaultRoot = roots.get(0);
            if (!CommonUtils.isEmpty(folder)) {
            if (!ArrayUtils.isEmpty(ctExtensions)) {
    @Override
        IEclipsePreferences projectSettings = getProjectPreferences(project);
    public void setDefaultRoot(@NotNull DBPProject project, @Nullable String rootPath) {
 *
            super();
            String contentTypeId = contentTypeBinding.getAttribute("contentTypeId");
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
            return location.append(EclipsePreferences.DEFAULT_PREFERENCES_DIRNAME);
    public String getDefaultRoot(@Nullable DBPProject project) {
        }

        return id;
        return contentTypes;
            }
                roots.add(folder);
            return SCOPE;
 */
            return obj instanceof ProjectScope projectScope &&  project.equals(projectScope.project);
    private static synchronized IEclipsePreferences getProjectPreferences(DBPProject project) {
            IEclipsePreferences eclipsePreferences = getResourceHandlerPreferences(project, DBPResourceTypeDescriptor.RESOURCE_ROOT_FOLDER_NODE);
 * Licensed under the Apache License, Version 2.0 (the "License");
                throw new IllegalArgumentException();
import java.util.*;

        super(config);

        }
    }
    }
                Collections.addAll(extensions, ctExtensions);
    @Override
    @Nullable
import org.eclipse.core.runtime.content.IContentType;
        @Override
import org.eclipse.core.runtime.Path;
    public boolean isManageable() {
            Preferences scopeNode = preferencesService.getRootNode().node(SCOPE);
            }
    @Override

    private static IEclipsePreferences getResourceHandlerPreferences(DBPProject project, String node) {
    }
import org.jkiss.utils.CommonUtils;
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
    public String getName() {
    @NotNull
            String root = eclipsePreferences.get(id, defaultRoot);
        if (CommonUtils.isEmpty(defaultRoot) && !CommonUtils.isEmpty(roots)) {

import org.eclipse.core.runtime.IConfigurationElement;
        private final DBPProject project;
        public boolean equals(Object obj) {
                IContentType contentType = Platform.getContentTypeManager().getContentType(contentTypeId);
    private final List<String> roots = new ArrayList<>();
                eclipsePreferences.put(id, root);
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.app.DBPProject;
        }
    @NotNull
    }
    @Override
    }
        }
                resourceTypes.add(new ObjectType(resourceType));

    @NotNull
        } catch (Exception e) {
                }
    @Nullable
    }
        @Override
                    contentTypes.add(contentType);
    @Override
                projectRoots.put(project.getName(), isInvalidRoot ? defaultRoot : root);
        for (IConfigurationElement resourceTypeBinding : ArrayUtils.safeArray(config.getChildren("resourceTypeBinding"))) {
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);

        this.manageable = CommonUtils.toBoolean(config.getAttribute(RegistryConstants.ATTR_MANAGEABLE));
    private String defaultRoot;
            return (IEclipsePreferences) projectNode.node(qualifier);
        return resourceTypes;
    private final Map<String, String> projectRoots = new HashMap<>();
 * ResourceHandlerDescriptor
        IEclipsePreferences resourceHandlers = getResourceHandlerPreferences(project, DBPResourceTypeDescriptor.RESOURCE_ROOT_FOLDER_NODE);
            }
        for (IConfigurationElement rootConfig : ArrayUtils.safeArray(config.getChildren("root"))) {
        resourceHandlers.put(getId(), rootPath);
import org.jkiss.dbeaver.Log;
import org.eclipse.core.runtime.Platform;
        if (project == null) {
    public DBPImage getIcon() {
            return defaultRoot;
        return id;
        public String getName() {
 * You may obtain a copy of the License at
                } catch (BackingStoreException e) {
    @Override
        return icon;
    private final DBPImage icon;
    }
            String folder = rootConfig.getAttribute("folder");
        }
        try {
    public List<String> getRoots() {

            projectRoots.put(project.getName(), rootPath);
    @Nullable
    }
import org.eclipse.core.runtime.IPath;
        synchronized (projectRoots) {
    public String getId() {
        return name;
        return (IEclipsePreferences) projectSettings.node(node);
    }
        }
        public static final String SCOPE = "project"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.app.DBPResourceTypeDescriptor;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resourceType"; //$NON-NLS-1$
        this.folderIcon = iconToImage(config.getAttribute("folderIcon"));
            log.error("Can't obtain resource handler preferences", e);

        public IPath getLocation() {

    private final String name;

                return root;
                    log.warn("Content type '" + contentTypeId + "' not recognized");
    public Collection<IContentType> getContentTypes() {
 *
        }
            }
            String resourceType = resourceTypeBinding.getAttribute("resourceType");
            synchronized (projectRoots) {
    public String[] getFileExtensions() {
    public ResourceTypeDescriptor(IConfigurationElement config) {
    }
                    log.error(e);
            IPreferencesService preferencesService = Platform.getPreferencesService();
        }
            if (!CommonUtils.isEmpty(resourceType)) {
