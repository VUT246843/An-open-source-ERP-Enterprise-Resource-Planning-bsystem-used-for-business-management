
            this.icon = DBIcon.DATABASE_DEFAULT;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataSourceStorage"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    private DBPImage icon;
        return name;

        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
 * DBeaver - Universal Database Manager
}
 *
                this.instance = null;
                throw new IllegalStateException("Can't initialize data source configuration storage '" + implType.getImplName() + "'", ex);
import org.jkiss.dbeaver.model.DBIcon;

            catch (Throwable ex) {
        super(config);

        return id;
                // locate class
    @NotNull
    public DBPImage getIcon()
/**
    }
 * DataSourceConfigurationStorageDescriptor
        return icon;
    }


 */
        this.name = config.getAttribute(RegistryConstants.ATTR_LABEL);
 * You may obtain a copy of the License at
    {
        }
package org.jkiss.dbeaver.registry;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getName()
    {
        if (instance == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String description;

    public String getDescription()
 *
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
    public DataSourceConfigurationStorageDescriptor(IConfigurationElement config)
    private static final Log log = Log.getLog(DataSourceConfigurationStorageDescriptor.class);
    private final ObjectType implType;
        return description;

 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
        }
            }
import org.jkiss.code.NotNull;
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
    private final String name;
 *
 * you may not use this file except in compliance with the License.

public class DataSourceConfigurationStorageDescriptor extends AbstractDescriptor
 * See the License for the specific language governing permissions and

            }
    }
    public String getId()
    {
import org.eclipse.core.runtime.IConfigurationElement;
        return instance;
 */
    public DBPDataSourceConfigurationStorage getInstance()
    {
        this.implType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
            try {
    }
                this.instance = implType.createInstance(DBPDataSourceConfigurationStorage.class);
        if (this.icon == null) {


{
 * Unless required by applicable law or agreed to in writing, software
    }

    private DBPDataSourceConfigurationStorage instance;
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    private final String id;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
