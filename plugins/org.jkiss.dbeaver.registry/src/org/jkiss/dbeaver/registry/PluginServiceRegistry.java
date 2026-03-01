import org.eclipse.core.runtime.Platform;
    {
 * You may obtain a copy of the License at
        return instance;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        }
    }

            instance = new PluginServiceRegistry(Platform.getExtensionRegistry());
            type = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));

 * limitations under the License.
    private final List<IPluginService> services = new ArrayList<>();
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static PluginServiceRegistry instance = null;
 * See the License for the specific language governing permissions and

import org.eclipse.core.runtime.IConfigurationElement;

        return services;
import org.jkiss.dbeaver.Log;
        }
public class PluginServiceRegistry
            try {
import org.eclipse.core.runtime.IExtensionRegistry;
            super(config);

 * Copyright (C) 2010-2024 DBeaver Corp and others
                services.add(pluginService);
import org.jkiss.dbeaver.runtime.IPluginService;
        protected ServiceDescriptor(IConfigurationElement config) {
 *
        }
    private PluginServiceRegistry(IExtensionRegistry registry)
import java.util.List;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.pluginService"; //$NON-NLS-1$
    public synchronized static PluginServiceRegistry getInstance()

                IPluginService pluginService = serviceDescriptor.type.createInstance(IPluginService.class);
    public List<IPluginService> getServices()
    }

 */
 * Unless required by applicable law or agreed to in writing, software
    
            ServiceDescriptor serviceDescriptor = new ServiceDescriptor(ext);
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);

        for (IConfigurationElement ext : extElements) {
{
            } catch (DBException e) {
/*
 * you may not use this file except in compliance with the License.
    {
package org.jkiss.dbeaver.registry;

 *
                log.error("Can't create plugin service", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

    private static final Log log = Log.getLog(PluginServiceRegistry.class);
    }
    private class ServiceDescriptor extends AbstractDescriptor {
 *
        if (instance == null) {

        private final ObjectType type;

import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
}
import java.util.ArrayList;
