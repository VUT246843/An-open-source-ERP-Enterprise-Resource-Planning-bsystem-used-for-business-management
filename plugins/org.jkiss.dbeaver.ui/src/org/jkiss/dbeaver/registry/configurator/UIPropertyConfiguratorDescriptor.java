 */
{
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return objectType;
        super(config);
    private final String objectType;

    @SuppressWarnings("unchecked")
 */
/*
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.registry.configurator;

    public <T extends IObjectPropertyConfigurator<?, ?>> T createConfigurator() throws DBException {

    public UIPropertyConfiguratorDescriptor(
    {
}
        this.objectType = config.getAttribute("class");
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.ui.propertyConfigurator"; //$NON-NLS-1$
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
 * Licensed under the Apache License, Version 2.0 (the "License");
        IConfigurationElement config)
 *


    private final ObjectType uiConfigType;

 * See the License for the specific language governing permissions and
import org.eclipse.core.runtime.IConfigurationElement;
    public String getObjectType() {
 *
 * UIPropertyConfiguratorDescriptor
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
 * Unless required by applicable law or agreed to in writing, software
        return (T) uiConfigType.createInstance(IObjectPropertyConfigurator.class);
public class UIPropertyConfiguratorDescriptor extends AbstractContextDescriptor

        this.uiConfigType = new ObjectType(config.getAttribute("uiClass"));
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
