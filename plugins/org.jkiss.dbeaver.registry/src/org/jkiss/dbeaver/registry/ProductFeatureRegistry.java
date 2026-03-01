 *


 * Unless required by applicable law or agreed to in writing, software

            DBPApplicationFeature parent = CommonUtils.isEmpty(parentId) ? null : allFeatures.get(parentId);
                ext.getAttribute("label"),
 * limitations under the License.
}

/*
    }
        }


    private final Map<String, DBPApplicationFeature> allFeatures = new LinkedHashMap<>();
import org.jkiss.dbeaver.model.app.DBPApplicationFeature;
import java.util.LinkedHashMap;
public class ProductFeatureRegistry {
            String parentId = ext.getAttribute("parent");
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (IConfigurationElement ext : extElements) {
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.util.List;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ObjectManagerDescriptor.EXTENSION_ID);
 *
                parent,
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.productFeature"; //NON-NLS-1

import org.eclipse.core.runtime.Platform;
 * you may not use this file except in compliance with the License.
    private ProductFeatureRegistry(IExtensionRegistry registry) {
 *
 * DBeaver - Universal Database Manager
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

 */

 * You may obtain a copy of the License at
            instance = new ProductFeatureRegistry(Platform.getExtensionRegistry());
        // Load datasource providers from external plugins
    private static ProductFeatureRegistry instance = null;
package org.jkiss.dbeaver.registry;
    public synchronized static ProductFeatureRegistry getInstance() {
import java.util.Map;
        return new ArrayList<>(allFeatures.values());
    public List<DBPApplicationFeature> getAllFeatures() {
            allFeatures.put(feature.getId(), feature);
                ext.getAttribute("id"),
                ext.getAttribute("description"));
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final Log log = Log.getLog(ProductFeatureRegistry.class);
        }
 * See the License for the specific language governing permissions and
        if (instance == null) {
 * Application feature registry
/**
    }
import org.jkiss.dbeaver.Log;
            DBPApplicationFeature feature = new DBPApplicationFeature(
 */

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IConfigurationElement;
        return instance;
