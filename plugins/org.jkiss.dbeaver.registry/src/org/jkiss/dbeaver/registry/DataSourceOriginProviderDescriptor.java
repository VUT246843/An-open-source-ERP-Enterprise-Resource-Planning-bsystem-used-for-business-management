    public DataSourceOriginProviderDescriptor(IConfigurationElement config)
    }
    private static final Log log = Log.getLog(DataSourceOriginProviderDescriptor.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.IConfigurationElement;
        return provider;
        if (provider == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

    public String getLabel() {
    private final ObjectType implType;
                provider = implType.getImplClass(DBPDataSourceOriginProvider.class).getConstructor().newInstance();
 * limitations under the License.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
package org.jkiss.dbeaver.registry;
 *
        }
/**
}

            } catch (Exception e) {
            }
    public String getId() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
public class DataSourceOriginProviderDescriptor extends AbstractDescriptor
 * DataSourceOriginProviderDescriptor



import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    private DBPDataSourceOriginProvider provider;
import org.jkiss.dbeaver.model.DBPDataSourceOriginProvider;
/*
 * DBeaver - Universal Database Manager

    {
{
    public DBPDataSourceOriginProvider getProvider() {
    private final String id;
 * See the License for the specific language governing permissions and
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);



        return id;
 * You may obtain a copy of the License at
        return label;
        this.implType = new ObjectType(config, RegistryConstants.ATTR_CLASS);
import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String label;
    }
                throw new IllegalStateException("Error instantiating datasource origin provider " + id, e);
 */
        super(config);
    }
            try {
