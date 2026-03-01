 *

        for (SSHSessionControllerDescriptor desc : descriptors) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.runtime.IConfigurationElement;
 *     http://www.apache.org/licenses/LICENSE-2.0
{


import java.util.List;
        return instance;

        }
    private final List<SSHSessionControllerDescriptor> descriptors = new ArrayList<>();
            instance = new SSHSessionControllerRegistry(Platform.getExtensionRegistry());
        // Load data descriptors from external plugins
        return descriptors;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
        }
    private SSHSessionControllerRegistry(IExtensionRegistry registry)
                SSHSessionControllerDescriptor descriptor = new SSHSessionControllerDescriptor(ext);
 *
            if (desc.getId().equals(id)) {
        }
            }
            for (IConfigurationElement ext : extElements) {
            }
    private static SSHSessionControllerRegistry instance = null;
        if (instance == null) {
    }

import java.util.ArrayList;
import org.eclipse.core.runtime.Platform;
    {
 * DBeaver - Universal Database Manager
        return null;
    public SSHSessionControllerDescriptor getDescriptor(String id) {

 * limitations under the License.
import org.eclipse.core.runtime.IExtensionRegistry;
 *
    public synchronized static SSHSessionControllerRegistry getInstance()
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
                descriptors.add(descriptor);
public class SSHSessionControllerRegistry
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(SSHSessionControllerDescriptor.EXTENSION_ID);

 * distributed under the License is distributed on an "AS IS" BASIS,
        {
                return desc;
    }
    public List<SSHSessionControllerDescriptor> getDescriptors() {
    }
    {
package org.jkiss.dbeaver.model.net.ssh.registry;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
}


 * you may not use this file except in compliance with the License.
    }
