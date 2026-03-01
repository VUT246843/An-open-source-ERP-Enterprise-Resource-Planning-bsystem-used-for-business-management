 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        for (DataTransferNodeConfiguratorDescriptor nd : nodeConfigurators.values()) {
                    replacements.add(new AbstractMap.SimpleEntry<>(replaces, descriptor));
    }
        // Remember all replacement pairs to apply in a second pass
            if (replaced != null) {
        // Load datasource providers from external plugins
                }
                if (pagesById.containsKey(nodeId)) {
                String replaces = it.getAttribute("replaces");
public class DataTransferConfiguratorRegistry {
 *
    }
package org.jkiss.dbeaver.tools.transfer.ui.registry;
                String nodeId = it.getAttribute("node");
 */
import org.eclipse.core.runtime.Platform;
 * distributed under the License is distributed on an "AS IS" BASIS,

            .filter(it -> "configPages".equals(it.getName()))
        Arrays.stream(registry.getConfigurationElementsFor(EXTENSION_ID))

        nodeConfigurators.putAll(pagesById);
            for (DataTransferPageDescriptor pd : nd.patPageDescriptors()) {

    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return nodeConfigurators.get(nodeId);
import org.eclipse.core.runtime.IExtensionRegistry;
                DataTransferNodeConfiguratorDescriptor descriptor = new DataTransferNodeConfiguratorDescriptor(it);
        if (instance == null) {


    public DataTransferPageDescriptor getPageDescriptor(IWizardPage page) {
 */
    private DataTransferConfiguratorRegistry(IExtensionRegistry registry) {
/*
        return instance;
 * limitations under the License.

        Map<String, DataTransferNodeConfiguratorDescriptor> pagesById = new HashMap<>();
import org.eclipse.jface.wizard.IWizardPage;

        });
                if (replaces != null && !replaces.isEmpty()) {

 * DBeaver - Universal Database Manager
        return null;
                    "No configurator with id '" + replacement.getKey()
    private static final Log log = Log.getLog(DataTransferConfiguratorRegistry.class);
    private Map<String, DataTransferNodeConfiguratorDescriptor> nodeConfigurators = new LinkedHashMap<>();

        }
            .forEach(it -> {
/**
                pagesById.put(nodeId, descriptor);
}
 * See the License for the specific language governing permissions and

                }
            });

 *
                if (pd.getPageClass().getImplName().equals(page.getClass().getName())) {
 * you may not use this file except in compliance with the License.

            }
                    throw new IllegalArgumentException("Duplicate node id: " + nodeId);
                        + "' found to replace, adding new one: " + replacement.getValue().getId()
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataTransferConfigurator"; //$NON-NLS-1$
            instance = new DataTransferConfiguratorRegistry(Platform.getExtensionRegistry());
        List<Map.Entry<String, DataTransferNodeConfiguratorDescriptor>> replacements = new ArrayList<>();
                }
import java.util.*;
 *
            pagesById.remove(replacement.getValue().getId());
            }

            } else {
            DataTransferNodeConfiguratorDescriptor replaced = pagesById.put(replacement.getKey(), replacement.getValue());
        replacements.forEach(replacement -> {
                log.debug("Data transfer configurator '" + replaced.getId() + "' is replaced by '" + replacement.getValue().getId() + "'");


 * DataTransferConfiguratorRegistry
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DataTransferNodeConfiguratorDescriptor getConfigurator(String nodeId) {
    private static DataTransferConfiguratorRegistry instance = null;

                log.debug(
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public synchronized static DataTransferConfiguratorRegistry getInstance()

import org.jkiss.dbeaver.Log;
    }
 * You may obtain a copy of the License at
                );
                    return pd;
