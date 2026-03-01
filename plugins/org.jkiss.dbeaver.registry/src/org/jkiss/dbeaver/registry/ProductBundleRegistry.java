            if ("bundle".equals(ext.getName())) {
import org.jkiss.dbeaver.model.runtime.OSDescriptor;

        if (instance == null) {
            }
}
    public ProductBundleDescriptor getBundle(String id)
        }
/**
    {
 *
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.LinkedHashMap;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
        OSDescriptor localSystem = DBWorkbench.getPlatform().getLocalSystem();
 * You may obtain a copy of the License at
import org.eclipse.core.runtime.IConfigurationElement;

 *     http://www.apache.org/licenses/LICENSE-2.0
                ProductBundleDescriptor bundle = new ProductBundleDescriptor(ext);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    {
                if (!bundle.matchesOS(localSystem)) {
    {
        return bundles.containsKey(id);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private ProductBundleRegistry(IExtensionRegistry registry)
    }
 * limitations under the License.

package org.jkiss.dbeaver.registry;
                    continue;
    private static ProductBundleRegistry instance = null;
/*
        // Load datasource providers from external plugins

                }
    private Map<String, ProductBundleDescriptor> bundles = new LinkedHashMap<>();

 * Unless required by applicable law or agreed to in writing, software
    public synchronized static ProductBundleRegistry getInstance()
import java.util.Map;
 */
public class ProductBundleRegistry {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    }
 * ProductBundleRegistry

                bundles.put(bundle.getId(), bundle);
        for (IConfigurationElement ext : extElements) {


        return bundles.get(id);
        }


 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        return instance;
 */
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.product.bundles"; //$NON-NLS-1$

    }
 * you may not use this file except in compliance with the License.
    }
    public boolean hasBundle(String id)
    {
 * distributed under the License is distributed on an "AS IS" BASIS,

            instance = new ProductBundleRegistry(Platform.getExtensionRegistry());
