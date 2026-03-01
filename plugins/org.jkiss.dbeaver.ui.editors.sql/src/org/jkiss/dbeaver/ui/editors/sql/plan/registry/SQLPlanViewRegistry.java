
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<SQLPlanViewDescriptor> getPlanViewDescriptors() {

import java.util.Comparator;
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.core.runtime.Platform;

 * you may not use this file except in compliance with the License.


 * limitations under the License.


import java.util.List;
        result.sort(Comparator.comparingInt(SQLPlanViewDescriptor::getPriority));
import org.eclipse.core.runtime.IExtensionRegistry;
                return converter;
    {
        return instance;
    public SQLPlanViewDescriptor getPlanViewDescriptor(String id) {
        List<SQLPlanViewDescriptor> result = new ArrayList<>(planViewDescriptors);
                planViewDescriptors.add(descriptor);
    private static SQLPlanViewRegistry instance;
        // Load target converters
 *
            if (converter.getId().equals(id)) {
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sql.plan.view"; //NON-NLS-1 //$NON-NLS-1$
package org.jkiss.dbeaver.ui.editors.sql.plan.registry;
        IConfigurationElement[] panelElements = registry.getConfigurationElementsFor(EXTENSION_ID);
}
        return null;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        return result;

 *
import org.jkiss.code.NotNull;

    private static final String TAG_VIEW = "view"; //NON-NLS-1
 * DBeaver - Universal Database Manager
    private List<SQLPlanViewDescriptor> planViewDescriptors = new ArrayList<>();
            if (TAG_VIEW.equals(ext.getName())) {
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    @NotNull
        }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
            }
    }
        for (SQLPlanViewDescriptor converter : planViewDescriptors) {
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.Nullable;
 *
    @Nullable
    }
 * SQLPlanViewRegistry
public class SQLPlanViewRegistry {
    public synchronized static SQLPlanViewRegistry getInstance() {
                SQLPlanViewDescriptor descriptor = new SQLPlanViewDescriptor(ext);
        if (instance == null) {
    }
 * See the License for the specific language governing permissions and
/*
            instance = new SQLPlanViewRegistry(Platform.getExtensionRegistry());
 */
        for (IConfigurationElement ext : panelElements) {
            }

    private SQLPlanViewRegistry(IExtensionRegistry registry)
import java.util.ArrayList;
