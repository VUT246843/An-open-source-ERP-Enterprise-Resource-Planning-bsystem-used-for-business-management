 */
package org.jkiss.dbeaver.ui.navigator;
        }
 * limitations under the License.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBEObjectConfigurator.class
 * You may obtain a copy of the License at
            return configurator == null ? null : adapterType.cast(configurator.createConfigurator());
        if (adapterType == DBEObjectConfigurator.class && adaptableObject instanceof DBPObject) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.editors.entity.EntityConfiguratorDescriptor;
    private static final Class<?>[] ADAPTER_LIST = {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Adapts objects to their UI configurators
import org.jkiss.dbeaver.model.DBPObject;
    }
 * See the License for the specific language governing permissions and

    };
}    @Override

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 *
 */
import org.eclipse.core.runtime.IAdapterFactory;
 *
/**

public class NavigatorConfiguratorFactory implements IAdapterFactory {
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Class<?>[] getAdapterList() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorsRegistry;

        return null;
            EntityConfiguratorDescriptor configurator = EntityEditorsRegistry.getInstance().getEntityConfigurator((DBPObject) adaptableObject);
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
    @Override
        return ADAPTER_LIST;
