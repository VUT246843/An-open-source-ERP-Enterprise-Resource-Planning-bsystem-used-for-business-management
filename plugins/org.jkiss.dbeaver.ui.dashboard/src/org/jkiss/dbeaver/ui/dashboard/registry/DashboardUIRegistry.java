
        for (DashboardRendererDescriptor descriptor : viewTypeList) {

 * distributed under the License is distributed on an "AS IS" BASIS,
        List<DashboardRendererType> result = new ArrayList<>();
 * You may obtain a copy of the License at
    private final List<DashboardRendererDescriptor> viewTypeList = new ArrayList<>();
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.dashboard.registry;
            }
}
    public synchronized static DashboardUIRegistry getInstance() {
        }
    private static DashboardUIRegistry instance = null;
            }
import org.jkiss.dbeaver.ui.dashboard.model.DashboardRendererType;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.IConfigurationElement;
 *
    private static final Log log = Log.getLog(DashboardUIRegistry.class);
        }
/*
    private final Object syncRoot = new Object();


    public List<DashboardRendererType> getSupportedViewTypes(DBDashboardDataType dataType) {
            if (descriptor.getId().equals(id)) {
        return result;
            if ("dashboardView".equals(ext.getName())) {
    



        return instance;
        if (instance == null) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // Load view types
    }
    }

import org.jkiss.dbeaver.model.dashboard.DBDashboardDataType;
 */
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    }
    public List<DashboardRendererType> getAllViewTypes() {
        for (IConfigurationElement ext : extElements) {
                    new DashboardRendererDescriptor(ext));
                return descriptor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (DashboardRendererType vt : viewTypeList) {


    public DashboardRendererDescriptor getViewType(String id) {
import org.eclipse.core.runtime.IExtensionRegistry;
 * limitations under the License.
        // Load data dashboardList from external plugins
        return null;
 * See the License for the specific language governing permissions and
import org.jkiss.utils.ArrayUtils;
        return new ArrayList<>(viewTypeList);
import java.util.ArrayList;

    }
            if (ArrayUtils.contains(vt.getSupportedTypes(), dataType)) {
public class DashboardUIRegistry {
 *
import java.util.List;

        }
 * Unless required by applicable law or agreed to in writing, software
            }
import org.jkiss.dbeaver.Log;
                viewTypeList.add(
            instance = new DashboardUIRegistry(Platform.getExtensionRegistry());
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(DashboardRendererDescriptor.EXTENSION_ID);

    private DashboardUIRegistry(IExtensionRegistry registry) {
    }
                result.add(vt);
