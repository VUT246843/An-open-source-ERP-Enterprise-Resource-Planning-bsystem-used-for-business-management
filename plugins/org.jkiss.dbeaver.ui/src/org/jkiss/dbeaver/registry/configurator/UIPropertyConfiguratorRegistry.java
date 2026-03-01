    private UIPropertyConfiguratorRegistry(@NotNull IExtensionRegistry registry) {
            }
    }
/*
    }
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.Nullable;

        return descriptors.get(className);
    @Nullable
    private static UIPropertyConfiguratorRegistry instance = null;
    public UIPropertyConfiguratorDescriptor getDescriptor(@NotNull Object object) {

        if (instance == null) {
import java.util.HashMap;
    private final Map<String, UIPropertyConfiguratorDescriptor> descriptors = new HashMap<>();
    }
 *


 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            UIPropertyConfiguratorDescriptor descriptor = descriptors.get(theClass.getName());

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.IExtensionRegistry;
 * limitations under the License.
            if (descriptor != null) {
        return instance;
                return descriptor;
    }
 * you may not use this file except in compliance with the License.
        for (Class<?> theClass = object.getClass(); theClass != Object.class; theClass = theClass.getSuperclass()) {
        {

            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(UIPropertyConfiguratorDescriptor.EXTENSION_ID);
 *
 * DBeaver - Universal Database Manager
            instance = new UIPropertyConfiguratorRegistry(Platform.getExtensionRegistry());
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return null;

import org.jkiss.code.NotNull;
public class UIPropertyConfiguratorRegistry {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.registry.configurator;
    @NotNull
        }
import org.eclipse.core.runtime.Platform;
import java.util.Map;
 * See the License for the specific language governing permissions and
            for (IConfigurationElement ext : extElements) {
        // Load data descriptors from external plugins

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    public synchronized static UIPropertyConfiguratorRegistry getInstance() {
                descriptors.put(descriptor.getObjectType(), descriptor);
        }
        }
                UIPropertyConfiguratorDescriptor descriptor = new UIPropertyConfiguratorDescriptor(ext);
            }
 */
    public UIPropertyConfiguratorDescriptor getDescriptor(@Nullable String className) {
    @Nullable
}
