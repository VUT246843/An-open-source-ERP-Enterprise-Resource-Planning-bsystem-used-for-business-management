/*
{

            managerInstance = clazz.getConstructor().newInstance();
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.objectManager"; //NON-NLS-1 //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
        } catch (Throwable ex) {


    public String toString() {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
            throw new IllegalStateException("Error instantiating object manager '" + clazz.getName() + "'", ex);
package org.jkiss.dbeaver.registry;
    private ObjectType managerType;
        managerInstance = null;

        return objectType.matchesType(clazz);
        objectType = null;
        Class<? extends DBEObjectManager> clazz = managerType.getObjectClass(DBEObjectManager.class);
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at

        if (managerInstance != null) {
        if (clazz == null) {

        managerType = null;
public class ObjectManagerDescriptor extends AbstractDescriptor
    {
    public synchronized DBEObjectManager getManager()
 *
    public ObjectType getObjectType() {
/**
        super(config);
 *
        return id;
        return objectType;
        }
        }

    {
    {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            return managerInstance;

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.runtime.IConfigurationElement;
 * ObjectManagerDescriptor
            throw new IllegalStateException("Can't instantiate object manager '" + managerType.getImplName() + "'");
        return id;

    }
    private ObjectType objectType;
    public String getId()

        try {
    private DBEObjectManager managerInstance;
    }
    }
        this.managerType = new ObjectType(id);
 * you may not use this file except in compliance with the License.
    }
        }
        return managerInstance;
    }
    public boolean appliesToType(Class<?> clazz)
    }

    }
    void dispose()
}    {
        this.id = config.getAttribute(RegistryConstants.ATTR_CLASS);
        this.objectType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_OBJECT_TYPE));
    ObjectManagerDescriptor(IConfigurationElement config)
    @Override
 * Unless required by applicable law or agreed to in writing, software

    private String id;
    {
