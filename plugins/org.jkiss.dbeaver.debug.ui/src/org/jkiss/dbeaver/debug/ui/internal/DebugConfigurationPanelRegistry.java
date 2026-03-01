            instance = new DebugConfigurationPanelRegistry(Platform.getExtensionRegistry());
 *

        return descriptors;
 * you may not use this file except in compliance with the License.

 * See the License for the specific language governing permissions and

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                descriptors.add(formatterDescriptor);

        return null;
    private static DebugConfigurationPanelRegistry instance = null;
        // Load data descriptors from external plugins
        }


        }
 * limitations under the License.
import java.util.List;
 * DBeaver - Universal Database Manager
 *
    public List<DebugConfigurationPanelDescriptor> getPanels(DBPDataSourceContainer dataSource) {
package org.jkiss.dbeaver.debug.ui.internal;
        }
            for (IConfigurationElement ext : extElements) {
    {
            }
    private final List<DebugConfigurationPanelDescriptor> descriptors = new ArrayList<>();
    public synchronized static DebugConfigurationPanelRegistry getInstance()
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DebugConfigurationPanelDescriptor.EXTENSION_ID);
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 */

    public DebugConfigurationPanelDescriptor getPanel(String id)
            if (descriptor.getId().equals(id)) {
        return result;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<DebugConfigurationPanelDescriptor> getPanels()
 *
        {
public class DebugConfigurationPanelRegistry
                result.add(desc);

        if (instance == null) {
        for (DebugConfigurationPanelDescriptor desc : descriptors) {
    }
import org.eclipse.core.runtime.IConfigurationElement;
        return instance;
    }
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
                DebugConfigurationPanelDescriptor formatterDescriptor = new DebugConfigurationPanelDescriptor(ext);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return descriptor;
        List<DebugConfigurationPanelDescriptor> result = new ArrayList<>();
        for (DebugConfigurationPanelDescriptor descriptor : descriptors) {
            }
    {
{
import org.eclipse.core.runtime.IExtensionRegistry;
    }
    private DebugConfigurationPanelRegistry(IExtensionRegistry registry)

import java.util.ArrayList;
/*
    {
            if (desc.supportsDataSource(dataSource)) {
import org.eclipse.core.runtime.Platform;
 * You may obtain a copy of the License at
    }
    {
    }
