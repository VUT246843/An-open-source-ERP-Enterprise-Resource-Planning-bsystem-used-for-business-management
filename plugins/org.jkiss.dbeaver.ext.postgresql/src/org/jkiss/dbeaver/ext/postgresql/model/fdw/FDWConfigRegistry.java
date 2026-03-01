    public List<FDWConfigDescriptor> getConfigDescriptors() {
    }
                return desc;
            }
        }
        if (instance == null) {
 */
import org.eclipse.core.runtime.IConfigurationElement;
    }


        }

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
    public FDWConfigDescriptor findFirstMatch(DBPDataSourceContainer dataSource) {
 * distributed under the License is distributed on an "AS IS" BASIS,


    public synchronized static FDWConfigRegistry getInstance()
}

/*
        // Load datasource providers from external plugins
import org.jkiss.dbeaver.Log;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.postgresql.fdw.config"; //$NON-NLS-1$
        for (FDWConfigDescriptor desc : configDescriptors) {
            instance = new FDWConfigRegistry(Platform.getExtensionRegistry());
            // Load main configDescriptors
            if (desc.matches(dataSource)) {
/**

 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IExtensionRegistry;

    private static FDWConfigRegistry instance = null;


    private List<FDWConfigDescriptor> configDescriptors = new ArrayList<>();
import java.util.ArrayList;
 * DataTransferRegistry
 * DBeaver - Universal Database Manager
 */
package org.jkiss.dbeaver.ext.postgresql.model.fdw;
    {
        return configDescriptors;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
 *
        for (IConfigurationElement ext : extElements) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
public class FDWConfigRegistry {
    private static final Log log = Log.getLog(FDWConfigRegistry.class);
    {
    private FDWConfigRegistry(IExtensionRegistry registry)
                configDescriptors.add(new FDWConfigDescriptor(ext));
            }

        return instance;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
 *
    }
        return null;


        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
import org.eclipse.core.runtime.Platform;
    }
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
            if ("fdw".equals(ext.getName())) {
