import java.util.HashMap;
                if (descriptor.instance == null) {
import org.eclipse.core.runtime.IConfigurationElement;
        for (IConfigurationElement ext : extElements) {
                        return descriptor.impl.createInstance(serviceType);
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        private final ObjectType type;
 * DBeaver - Universal Database Manager

import org.eclipse.core.runtime.IExtensionRegistry;
                        log.debug("Error creating service '" + serviceType.getName() + "'", e);
        }
        }
        private final boolean headless;
                    try {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
                }
    public synchronized static ServiceRegistry getInstance() {
                    continue;
 *
import org.jkiss.code.NotNull;
                }
            descriptors.add(service);
                return (T) descriptor.instance;
        }
        private final boolean singleton;
        if (!CommonUtils.isEmpty(descriptors)) {
/*
        ServiceDescriptor(IConfigurationElement config) {
            ServiceDescriptor service = new ServiceDescriptor(ext);
    private static final Log log = Log.getLog(ServiceRegistry.class);
package org.jkiss.dbeaver.runtime;
        List<ServiceDescriptor> descriptors = services.get(serviceType.getName());
    private final Map<String, List<ServiceDescriptor>> services = new HashMap<>();
    }
import java.util.ArrayList;
        private final ObjectType impl;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;

                if (!descriptor.singleton) {
        private Object instance;
            instance = new ServiceRegistry(Platform.getExtensionRegistry());



        }

                    } catch (DBException e) {

    }
 * Unless required by applicable law or agreed to in writing, software
    @Nullable

            boolean headlessMode = DBWorkbench.getPlatform().getApplication().isHeadlessMode();
    public <T> T getService(@NotNull Class<T> serviceType) {
        if (instance == null) {
                if (descriptors.size() > 1 && headlessMode != descriptor.headless) {

 *
 * limitations under the License.
import java.util.Map;
 */
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
 * See the License for the specific language governing permissions and
    private static ServiceRegistry instance = null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
import org.jkiss.utils.CommonUtils;
}
    }
                        descriptor.instance = descriptor.impl.createInstance(Object.class);
                }

    private static class ServiceDescriptor extends AbstractDescriptor {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return instance;
import java.util.List;
 * You may obtain a copy of the License at
import org.eclipse.core.runtime.Platform;
    }
            this.singleton = CommonUtils.toBoolean(config.getAttribute("singleton"), true);
                    }
                    } catch (DBException e) {
            type = new ObjectType(config.getAttribute("name"));
    private ServiceRegistry(IExtensionRegistry registry) {


                        return null;
                        log.debug(e);
                    try {
            this.headless = CommonUtils.toBoolean(config.getAttribute("headless"));
            List<ServiceDescriptor> descriptors = services.computeIfAbsent(service.type.getImplName(), s -> new ArrayList<>());
import org.jkiss.code.Nullable;
            super(config);
public class ServiceRegistry {
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.service"; //$NON-NLS-1$
import org.jkiss.dbeaver.DBException;
            }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            impl = new ObjectType(config.getAttribute("class"));
            for (ServiceDescriptor descriptor : descriptors) {
 * distributed under the License is distributed on an "AS IS" BASIS,
