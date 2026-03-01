        super(parentStore);
import org.jkiss.dbeaver.model.impl.preferences.AbstractPreferenceStore;
    @Nullable
 */
            if (propName.startsWith(DBConstants.DEFAULT_DRIVER_PROP_PREFIX)) {
 * You may obtain a copy of the License at
        // Forward event to global DS prefs store
                getDefaultProperties().put(
        DBPPreferenceStore gps = DBWorkbench.getPlatform().getDataSourceProviderRegistry().getGlobalDataSourcePreferenceStore();
            ((AbstractPreferenceStore) gps).firePropertyChangeEvent(this, name, oldValue, newValue);
    DataSourcePreferenceStore(DataSourceDescriptor dataSourceDescriptor) {
        for (Map.Entry<String, Object> prop : defaultConnectionProperties.entrySet()) {
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
 *
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.DBConstants;
    {
        }
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 */

 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
/*
    }
}
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.dataSourceDescriptor = dataSourceDescriptor;
public class DataSourcePreferenceStore extends SimplePreferenceStore implements DBPDataSourceContainerProvider
{
            String propName = prop.getKey();
    ) {
        @NotNull DBPPreferenceStore parentStore,
                    propName.substring(DBConstants.DEFAULT_DRIVER_PROP_PREFIX.length()),
import java.io.IOException;
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;
    DataSourcePreferenceStore(
    }
    }
                    CommonUtils.toString(prop.getValue()));
import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
        Map<String, Object> defaultConnectionProperties = dataSourceDescriptor.getDriver()


        throws IOException
        @NotNull DataSourceDescriptor dataSourceDescriptor
        if (gps instanceof AbstractPreferenceStore) {
    private final DataSourceDescriptor dataSourceDescriptor;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        dataSourceDescriptor.getRegistry().flushConfig();

 * DataSourcePreferenceStore
        return dataSourceDescriptor;
    @Override
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void firePropertyChangeEvent(@NotNull String name, @Nullable Object oldValue, @Nullable Object newValue) {
    @Override
            .getDefaultConnectionProperties();
    public void save()
package org.jkiss.dbeaver.registry;
    public DBPDataSourceContainer getDataSourceContainer() {

        }
 * DBeaver - Universal Database Manager
        this(dataSourceDescriptor.getRegistry().getPreferenceStore(), dataSourceDescriptor);


/**
 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        super.firePropertyChangeEvent(name, oldValue, newValue);
 * Licensed under the Apache License, Version 2.0 (the "License");
            }

import java.util.Map;
    }
        // Init default properties from driver overrides
    @Override
