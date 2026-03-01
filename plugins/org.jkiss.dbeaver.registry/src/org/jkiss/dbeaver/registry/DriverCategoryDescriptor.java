    private int rank;

 */
 * You may obtain a copy of the License at
    }
/*
    }
    {
public class DriverCategoryDescriptor extends AbstractDescriptor


    public String getDescription() {
 * you may not use this file except in compliance with the License.
    private boolean promoted;
    private String id;
    public String getId()
    }
import org.eclipse.core.runtime.IConfigurationElement;
/**

        this.id = config.getAttribute(RegistryConstants.ATTR_ID);

        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
    public DriverCategoryDescriptor(IConfigurationElement config)
 *
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
    }
import org.jkiss.utils.CommonUtils;
}
    public boolean isPromoted() {
 * DBeaver - Universal Database Manager

    public int getRank() {
    }
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0


        return id;
    {
    public String getName() {
    private DBPImage icon;
package org.jkiss.dbeaver.registry;
    private String name;
 * limitations under the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        return id;
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
    }
        this.rank = CommonUtils.toInt(config.getAttribute("rank"));
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    public DBPImage getIcon() {
    public String toString() {
 * distributed under the License is distributed on an "AS IS" BASIS,
{
import org.jkiss.dbeaver.model.DBPImage;

        return description;
        this.promoted = CommonUtils.toBoolean(config.getAttribute(RegistryConstants.ATTR_PROMOTED));
 *
        super(config.getContributor().getName());

        return icon;
        return rank;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return name;
    }
 * DriverCategoryDescriptor
 */
 *
        return promoted;
    private String description;
