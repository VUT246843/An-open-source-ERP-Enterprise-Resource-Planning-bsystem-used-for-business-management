    {
 * you may not use this file except in compliance with the License.
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        return type;
        this.icon = iconToImage(config.getAttribute("icon"));
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,


        this.label = config.getAttribute("label");
    public boolean isDefault() {
package org.jkiss.dbeaver.registry.functions;
        this.description = config.getAttribute("description");
/**
    private final String type;

    private final DBPImage icon;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        this.implClass = new ObjectType(config.getAttribute("class"));
/*
        this.id = config.getAttribute("id");
    }
import org.jkiss.dbeaver.model.data.aggregate.IAggregateFunction;
 * Unless required by applicable law or agreed to in writing, software
        this.isDefault = CommonUtils.toBoolean(config.getAttribute("default"));
        return implClass.createInstance(IAggregateFunction.class);
import org.jkiss.utils.CommonUtils;
    }
    private final String id;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
    {
    public AggregateFunctionDescriptor(IConfigurationElement config)
    public IAggregateFunction createFunction()

    private final String label;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

}
public class AggregateFunctionDescriptor extends AbstractContextDescriptor {
        throws DBException

    public DBPImage getIcon() {
        return description;
 *
    public String getType() {
    private final String description;
 * AggregateFunctionDescriptor
import org.jkiss.dbeaver.model.DBPImage;
 *



 */
        return label;

        return isDefault;
        return icon;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    public String getDescription() {
    private final boolean isDefault;
        super(config);
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.aggregateFunction"; //$NON-NLS-1$
    }
    public String getId() {
    private final ObjectType implClass;
import org.eclipse.core.runtime.IConfigurationElement;
        this.type = config.getAttribute("type");
    }
    }
 *
    }
    public String getLabel() {
        return id;
