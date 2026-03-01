import java.util.List;
                return rhd;
 * You may obtain a copy of the License at
    }
        return null;
/*
        for (IConfigurationElement ext : extElements) {


                return td;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return instance;
 * Unless required by applicable law or agreed to in writing, software
            }
        }
}            if (defaultRoot != null && defaultRoot.equals(path)) {
            if (td.getId().equals(typeId)) {
 *
    public List<ResourceTypeDescriptor> getResourceTypes() {
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public ResourceTypeDescriptor getResourceTypeByRootPath(DBPProject project, String path) {
    }
import org.jkiss.dbeaver.model.app.DBPProject;
    }
            String defaultRoot = rhd.getDefaultRoot(project);
 * Licensed under the Apache License, Version 2.0 (the "License");
        return resourceTypeDescriptors;
            instance = new ResourceTypeRegistry(Platform.getExtensionRegistry());

public class ResourceTypeRegistry {
        return null;
import org.eclipse.core.runtime.Platform;
    }
 *

 * you may not use this file except in compliance with the License.


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;

            }

        if (instance == null) {
 */
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ResourceTypeDescriptor.EXTENSION_ID);
        for (ResourceTypeDescriptor rhd : resourceTypeDescriptors) {
/**
 * See the License for the specific language governing permissions and
            resourceTypeDescriptors.add(new ResourceTypeDescriptor(ext));
 *
package org.jkiss.dbeaver.registry;
        }
import org.eclipse.core.runtime.IConfigurationElement;


    }
    private final List<ResourceTypeDescriptor> resourceTypeDescriptors = new ArrayList<>();
        }
    private static final Log log = Log.getLog(ResourceTypeRegistry.class);
 * Resource type registry
        for (ResourceTypeDescriptor td : resourceTypeDescriptors) {
        }

import org.jkiss.dbeaver.model.app.DBPResourceTypeDescriptor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static ResourceTypeRegistry instance = null;
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0

    private ResourceTypeRegistry(IExtensionRegistry registry) {
import org.eclipse.core.runtime.IExtensionRegistry;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resourceType"; //NON-NLS-1
    public synchronized static ResourceTypeRegistry getInstance() {
    public DBPResourceTypeDescriptor getResourceType(String typeId) {


