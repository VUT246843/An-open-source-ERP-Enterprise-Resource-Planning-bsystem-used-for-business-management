 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    private final boolean custom;

    private final String name;
        super(config, DBDAttributeTransformer.class);
        }
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
 * See the License for the specific language governing permissions and
    }
        return applyByDefault;
import org.jkiss.dbeaver.registry.RegistryConstants;
    private final boolean applyByDefault;
        return custom;
    public boolean isApplicableByDefault() {
    }
    }
/**
import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;

 *

    public DBPImage getIcon() {
    private final String description;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public List<DBPPropertyDescriptor> getProperties() {
        this.custom = "true".equals(config.getAttribute("custom"));
    }
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
        return name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}    @Override

        this.applyByDefault = "true".equals(config.getAttribute("applyByDefault"));


 *

    @Override
    }
 * you may not use this file except in compliance with the License.
 * AttributeTransformerDescriptor
import org.eclipse.core.runtime.IConfigurationElement;

        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
            properties.addAll(PropertyDescriptor.extractProperties(prop));
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        return description;
import org.jkiss.dbeaver.model.DBPImage;
    public String getDescription() {
 */
 * limitations under the License.
    }
    {
    private final DBPImage icon;
 * Unless required by applicable law or agreed to in writing, software
    @Override
    public boolean isCustom() {
{
 * DBeaver - Universal Database Manager
        return icon;
        for (IConfigurationElement prop : config.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP)) {
    @Override
    @Override
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;

import java.util.ArrayList;
package org.jkiss.dbeaver.registry.datatype;
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
 */
    @Override

/*
 * You may obtain a copy of the License at
import java.util.List;
public class AttributeTransformerDescriptor extends DataTypeAbstractDescriptor<DBDAttributeTransformer> implements DBDAttributeTransformerDescriptor


        return properties;
    }
    public AttributeTransformerDescriptor(IConfigurationElement config)
    private final List<DBPPropertyDescriptor> properties = new ArrayList<>();
    public String getName() {
