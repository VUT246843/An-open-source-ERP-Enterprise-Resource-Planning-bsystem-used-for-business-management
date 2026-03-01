 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    private final List<ValueHandlerDescriptor> dataTypeProviders = new ArrayList<>();
        }
                for (DataSourceProviderDescriptor parent = ds2.getParentProvider(); parent != null; parent = parent.getParentProvider()) {
        }

 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
                if (result == null) {
                ValueHandlerDescriptor parent2 = getValueHandler(p2);
        for (AttributeTransformerDescriptor descriptor : dataTypeTransformers) {
package org.jkiss.dbeaver.registry.datatype;
import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;
}
                (descriptor.isGlobal() && descriptor.supportsType(typedObject))))
                } else if (o2.isGlobal()) {
            }
import org.jkiss.dbeaver.model.data.DBDRegistry;
        }
                }
                    ValueHandlerDescriptor provider = new ValueHandlerDescriptor(ext);
                if (p1 == null) {
            }
    private final Map<String, ValueHandlerDescriptor> dataTypeProvidersMap = new HashMap<>();
    private DataTypeProviderRegistry()
/*

                } else if ("transformer".equals(ext.getName())) {
            dataTypeProviders.sort((o1, o2) -> {
    @Nullable


                } else if (parent2.isChildOf(parent1)) {
        {
        if (result != null) {
            }
                return o1.getId().compareTo(o2.getId());
                    return o1.getId().compareTo(o2.getId());
                    }
            }
        return null;
    {
                result.add(descriptor);
            log.debug("Internal error during providers sort", e);
        for (ValueHandlerDescriptor dtProvider : dataTypeProviders) {
            if (dtProvider.isGlobal() && dtProvider.supportsType(typedObject)) {
        }
                return dtProvider.getInstance();
                if ("provider".equals(ext.getName())) {
        return false;
 * DataTypeProviderRegistry

                    result = new ArrayList<>();
    }
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void loadExtensions(IExtensionRegistry registry)
 * you may not use this file except in compliance with the License.
            if (id.equals(descriptor.getId())) {
        // Find in default providers
public class DataTypeProviderRegistry implements DBDRegistry {
    {
/**
    ////////////////////////////////////////////////////
                ValueHandlerDescriptor parent1 = getValueHandler(p1);
                ((!descriptor.isGlobal() && descriptor.supportsDataSource(dataSource) && descriptor.supportsType(typedObject)) ||
    }

import org.eclipse.core.runtime.IExtensionRegistry;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        return true;
    {
                    return o2.isGlobal() ? 0 : -1;
        for (DataSourceProviderDescriptor ds1 : dsList1) {
        List<AttributeTransformerDescriptor> result = null;
import org.jkiss.dbeaver.Log;

    ValueHandlerDescriptor getValueHandler(@NotNull String id) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public synchronized static DataTypeProviderRegistry getInstance()
    public void dispose()
            instance = new DataTypeProviderRegistry();
    @Override

 *
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    private static boolean isChildOfAnyProvider(List<DataSourceProviderDescriptor> dsList1, List<DataSourceProviderDescriptor> dsList2) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    private static DataTypeProviderRegistry instance = null;
                    dataTypeTransformers.add(new AttributeTransformerDescriptor(ext));
                }

                if (parent1 == parent2) {
        for (ValueHandlerDescriptor dtProvider : dataTypeProviders) {
import org.jkiss.dbeaver.model.DBPDataSource;
                    return 1;
import java.util.*;
                    return 1;
        // First try to find type provider for specific datasource type
            for (DataSourceProviderDescriptor ds2 : dsList2) {

                }
 *
                }
            }
        return null;
    private final List<AttributeTransformerDescriptor> dataTypeTransformers = new ArrayList<>();
                    return p2 == null ? o1.getId().compareTo(o2.getId()) : 1;
    }
        } catch (Exception e) {
            result.sort(Comparator.comparing(AttributeTransformerDescriptor::getName));
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataTypeProvider"; //$NON-NLS-1$

 * See the License for the specific language governing permissions and

                    return -1;
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
    }
        if (instance == null) {
        return dataTypeProvidersMap.get(id);
    {
            if ((custom == null || custom == descriptor.isCustom()) &&
                } else if (parent1.isChildOf(parent2)) {

                    dataTypeProvidersMap.put(provider.getId(), provider);
    }
    @Override
import org.eclipse.core.runtime.Platform;
        return instance;
        return result;

        }
                }
 */

            for (IConfigurationElement ext : extElements) {
 *
        // Load data type providers from external plugins
import org.jkiss.code.Nullable;
        this.dataTypeProviders.clear();
        }
        }
        try {
    public List<AttributeTransformerDescriptor> findTransformers(DBPDataSource dataSource, DBSTypedObject typedObject, Boolean custom) {
    {
            });
    }
                String p2 = o2.getParentProvider();
            }
        for (AttributeTransformerDescriptor descriptor : dataTypeTransformers) {
            // Order providers. More precise come first

        // Find in global providers
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.code.NotNull;
                if (o1.isGlobal()) {
                return dtProvider.getInstance();
            if (!dtProvider.isGlobal() && dtProvider.supportsDataSource(dataSource) && dtProvider.supportsType(typedObject)) {
        }
    public DBDValueHandlerProvider getValueHandlerProvider(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject typedObject)
        }
    private static final Log log = Log.getLog(DataTypeProviderRegistry.class);
            instance.loadExtensions(Platform.getExtensionRegistry());
    public DBDAttributeTransformerDescriptor getTransformer(String id) {
                    dataTypeProviders.add(provider);
    // DataType providers
                    if (parent == ds1) {

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.eclipse.core.runtime.IConfigurationElement;
                }
                } else if (p2 == null) {
                return descriptor;
 */
                    return -1;

                String p1 = o1.getParentProvider();
            {
    }
