public class EntityConfiguratorDescriptor extends AbstractContextDescriptor {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 *
 *
import org.jkiss.dbeaver.ui.editors.entity.properties.ObjectPropertiesEditor;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public DBEObjectConfigurator<?> createConfigurator() {
            return null;
        }

 * You may obtain a copy of the License at
    private final ObjectType implType;
    public EntityConfiguratorDescriptor(IConfigurationElement config) {
            return implType.createInstance(DBEObjectConfigurator.class);
    private static final Log log = Log.getLog(EntityConfiguratorDescriptor.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * See the License for the specific language governing permissions and
        this.implType = new ObjectType(ObjectPropertiesEditor.class.getName());

import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.dbeaver.Log;
 * limitations under the License.
        super(config);
        this.implType = new ObjectType(config.getAttribute("class"));
    EntityConfiguratorDescriptor() {

 * DBeaver - Universal Database Manager
/*
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    }
 *
package org.jkiss.dbeaver.ui.editors.entity;

/**
 * you may not use this file except in compliance with the License.
        try {
            log.error("Error instantiating entity configurator '" + implType.getImplName() + "'", ex); //$NON-NLS-1$ //$NON-NLS-2$
    public String toString() {
    }
 * EntityConfiguratorDescriptor
        super(UINavigatorActivator.PLUGIN_ID);

        } catch (Exception ex) {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.databaseObjectConfigurator"; //NON-NLS-1 //$NON-NLS-1$
        return implType.getImplName();
    }
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.internal.UINavigatorActivator;

    @Override
}

