            }

 * limitations under the License.
import org.eclipse.core.runtime.content.IContentType;
                    }
        this.typeId = config.getAttribute(RegistryConstants.ATTR_TYPE);

}

 */
                handler = clazz.getConstructor().newInstance();


        if (handler == null) {
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
    @Override
import org.eclipse.core.runtime.IConfigurationElement;
 * ResourceHandlerDescriptor

    }
        }
 * you may not use this file except in compliance with the License.
    private static final Log log = Log.getLog(ResourceHandlerDescriptor.class);
    }
    public boolean isApplicableTo(DBPResourceTypeDescriptor resourceType, @NotNull IResource resource, boolean testContent) {
        return typeId;
            // Check for file extension
        }
    public String getTypeId() {
import org.eclipse.core.runtime.content.IContentDescription;
    public synchronized DBPResourceHandler getHandler() {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    IContentDescription contentDescription = ((IFile) resource).getContentDescription();
    }
/**
            if (clazz == null) {
 * You may obtain a copy of the License at
                return null;
                if (objectType.appliesTo(resource, null)) {
        return "default".equals(typeId);

                } catch (CoreException e) {
    public boolean canHandle(IResource resource) {
            for (IContentType contentType : resourceType.getContentTypes()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
        return false;
import org.eclipse.core.resources.IResource;
    public void dispose() {
                        IContentType fileContentType = contentDescription.getContentType();
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
                        }

                }
                    for (String ext : ctExtensions) {
    private DBPResourceHandler handler;

    public boolean canHandle(IResource resource, boolean testContent) {
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resourceHandler"; //$NON-NLS-1$
        if (!resourceType.getContentTypes().isEmpty() && resource instanceof IFile) {
    }
            if (testContent) {
                String[] ctExtensions = contentType.getFileSpecs(IContentType.FILE_EXTENSION_SPEC);
            String fileExtension = resource.getFileExtension();
 */
                        }
        return handler;

                            return true;
                if (!ArrayUtils.isEmpty(ctExtensions)) {
import org.eclipse.core.resources.IFile;

            } catch (Exception e) {
        this.handlerType = null;
                log.error("Can't instantiate resource handler", e);
package org.jkiss.dbeaver.registry;
            return true;

import org.jkiss.utils.ArrayUtils;
    }
        return canHandle(resource, false);
        if (isDefault()) {
        DBPResourceTypeDescriptor resourceType = getResourceType();
        }
                            return true;
            try {
                try {

/*

 * DBeaver - Universal Database Manager
                    }
 *
        return ResourceTypeRegistry.getInstance().getResourceType(typeId);
import org.jkiss.dbeaver.Log;
import org.jkiss.code.Nullable;
    private final String typeId;
                        if (fileContentType != null && resourceType.getContentTypes().contains(fileContentType)) {
    public DBPResourceTypeDescriptor getResourceType() {
 *
    }
            Class<? extends DBPResourceHandler> clazz = handlerType.getObjectClass(DBPResourceHandler.class);
    }
    public ResourceHandlerDescriptor(IConfigurationElement config) {
    }
import org.jkiss.code.NotNull;
        return typeId;
                    log.debug("Can't obtain content description for '" + resource.getName() + "'", e);
                }


            for (ObjectType objectType : resourceType.getResourceTypes()) {
            return false;
import org.jkiss.dbeaver.model.app.DBPResourceTypeDescriptor;

 * See the License for the specific language governing permissions and
public class ResourceHandlerDescriptor extends AbstractDescriptor implements DBPResourceHandlerDescriptor {
 * Unless required by applicable law or agreed to in writing, software
        this.handlerType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
                }

    public String toString() {
            }
        this.handler = null;
import org.jkiss.dbeaver.model.app.DBPResourceHandlerDescriptor;
        return false;
                        if (ext.equalsIgnoreCase(fileExtension)) {
import org.eclipse.core.runtime.CoreException;
    public boolean isDefault() {
        super(config);
        }
        if (!resourceType.getResourceTypes().isEmpty()) {
    private ObjectType handlerType;
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (contentDescription != null) {
    @Override

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    }
 *
            }
        if (resourceType != null && isApplicableTo(resourceType, resource, testContent)) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    return true;
