import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        List<NetworkHandlerDescriptor> descList = new ArrayList<>(descriptors);

        return result;
                for (NetworkHandlerDescriptor hd2 : descriptors) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.net.DBWHandlerRegistry;

            if (descriptor.getId().equals(id)) {
    private NetworkHandlerRegistry(IExtensionRegistry registry) {
import org.jkiss.code.NotNull;
    @NotNull
                result.add(d);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.Platform;
            }
                descriptors.add(formatterDescriptor);
    public NetworkHandlerDescriptor getDescriptor(@NotNull String id) {
        // Load data descriptors from external plugins
    public synchronized static NetworkHandlerRegistry getInstance() {
 *
                NetworkHandlerDescriptor formatterDescriptor = new NetworkHandlerDescriptor(ext);
import java.util.ArrayList;
                    return descriptor.getReplacedBy();
        List<NetworkHandlerDescriptor> result = new ArrayList<>();
            }
import org.jkiss.dbeaver.model.connection.DBPDriver;
            for (IConfigurationElement ext : extElements) {
public class NetworkHandlerRegistry implements DBWHandlerRegistry {
 * distributed under the License is distributed on an "AS IS" BASIS,
                }

        }
        return instance;
            instance = new NetworkHandlerRegistry(Platform.getExtensionRegistry());
                        break;

import org.eclipse.core.runtime.IExtensionRegistry;
        if (instance == null) {


                return descriptor;
 * limitations under the License.

        {
package org.jkiss.dbeaver.registry.network;
    @NotNull
 * you may not use this file except in compliance with the License.
    private final List<NetworkHandlerDescriptor> descriptors = new ArrayList<>();
    private static NetworkHandlerRegistry instance = null;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return descList;
    @NotNull
}
    public List<NetworkHandlerDescriptor> getDescriptors(@NotNull DBPDriver driver) {
 * Unless required by applicable law or agreed to in writing, software
        return getDescriptors(dataSource.getDriver());


            // Remove replaced handlers
 *
    }
    public List<NetworkHandlerDescriptor> getDescriptors() {
 * See the License for the specific language governing permissions and
        for (NetworkHandlerDescriptor d : descriptors) {
 */
                }
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
            descriptors.sort(Comparator.comparingInt(NetworkHandlerDescriptor::getOrder));
import org.eclipse.core.runtime.IConfigurationElement;

 *
                    }
import java.util.Comparator;

                        hd1.setReplacedBy(hd2);
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * You may obtain a copy of the License at
        descList.removeIf(nhd -> nhd.getReplacedBy() != null);
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(NetworkHandlerDescriptor.EXTENSION_ID);
    }
        }
import java.util.List;
                    if (hd2.replaces(hd1)) {

            if (d.getReplacedBy() == null && !d.hasObjectTypes() || d.matches(driver)) {
    }
                if (descriptor.getReplacedBy() != null) {
            for (NetworkHandlerDescriptor hd1 : descriptors) {
        return null;
        for (NetworkHandlerDescriptor descriptor : descriptors) {
    }
    public List<NetworkHandlerDescriptor> getDescriptors(@NotNull DBPDataSourceContainer dataSource) {
        }
    }
        }
