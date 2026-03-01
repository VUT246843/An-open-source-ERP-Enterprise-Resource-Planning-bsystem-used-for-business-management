    public DriverCategoryDescriptor getCategory(String id) {
            if (viewElement.getName().equals("category")) {
    }
        return instance;
 * Unless required by applicable law or agreed to in writing, software

        if (instance == null) {
    private static DriverManagerRegistry instance = null;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.IConfigurationElement;
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    new DriverCategoryDescriptor(viewElement));
    private DriverManagerRegistry(IExtensionRegistry registry) {
    public synchronized static DriverManagerRegistry getInstance() {
package org.jkiss.dbeaver.registry;
            }

            }
 *
            instance = new DriverManagerRegistry(Platform.getExtensionRegistry());
        for (DriverCategoryDescriptor categoryDescriptor : categories) {
    private final List<DriverCategoryDescriptor> categories = new ArrayList<>();
import org.eclipse.core.runtime.IExtensionRegistry;
        return null;
import java.util.List;

public class DriverManagerRegistry {
    }
    }


import java.util.ArrayList;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * You may obtain a copy of the License at

        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
 *

        }
        for (IConfigurationElement viewElement : extElements) {
                this.categories.add(
}
                return categoryDescriptor;
    }
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (id.equalsIgnoreCase(categoryDescriptor.getId())) {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

        return new ArrayList<>(categories);
 * limitations under the License.
    public List<DriverCategoryDescriptor> getCategories() {

/*
        }
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.driverManager"; //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
