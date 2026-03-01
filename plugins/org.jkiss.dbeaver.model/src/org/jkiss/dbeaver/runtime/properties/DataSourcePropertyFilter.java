
        if (property instanceof ObjectPropertyDescriptor) {
import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.

    private final boolean showExpensive;

 * Datasource property filter
 * Unless required by applicable law or agreed to in writing, software
            if (read) {
        }
            } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        this.showExpensive = store.getBoolean(ModelPreferences.READ_EXPENSIVE_PROPERTIES);
    public boolean select(Object object, DBPPropertyDescriptor property)
            }
        this((DBPDataSourceContainer)null);
    }
        return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;
        DBPPreferenceStore store = container != null ?
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        this(dataSource == null ? null : dataSource.getContainer());

        }
/**
    public DataSourcePropertyFilter()
import java.util.Set;
            return false;
package org.jkiss.dbeaver.runtime.properties;
                readExpPropertiesFor.remove(objectFullId);
}
 */
    }
public class DataSourcePropertyFilter implements IPropertyFilter {
    public static boolean isExpensivePropertiesReadEnabledFor(DBSObject object) {
    }
    public static void readExpensivePropertiesFor(DBSObject object, boolean read) {


import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
        synchronized (readExpPropertiesFor) {
            }
    public DataSourcePropertyFilter(DBPDataSourceContainer container)

import org.jkiss.dbeaver.ModelPreferences;
    }
        }
            container.getPreferenceStore() :
                readExpPropertiesFor.add(objectFullId);
        synchronized (readExpPropertiesFor) {
 *
    private final static Set<String> readExpPropertiesFor = new LinkedHashSet<>();
    {
 * You may obtain a copy of the License at

            String objectFullId = DBUtils.getObjectFullId(object);
 *
            DBWorkbench.getPlatform().getPreferenceStore();
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!prop.isExpensive() || showExpensive) {
    {
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
                return true;
            ObjectPropertyDescriptor prop = (ObjectPropertyDescriptor) property;
    }
            if (object instanceof DBSObject) {
                return isExpensivePropertiesReadEnabledFor((DBSObject) object);
            String objectFullId = DBUtils.getObjectFullId(object);
    public DataSourcePropertyFilter(DBPDataSource dataSource)
    }
 * you may not use this file except in compliance with the License.
 */
import java.util.LinkedHashSet;
    {


import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            return readExpPropertiesFor.contains(objectFullId);
