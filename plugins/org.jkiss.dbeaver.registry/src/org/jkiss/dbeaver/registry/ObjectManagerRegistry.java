        for (ObjectManagerDescriptor descriptor : entityManagers) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    private static ObjectManagerRegistry instance = null;
            descriptor.dispose();
 * limitations under the License.
    }
        if (manager != null) {
        }
public class ObjectManagerRegistry implements DBERegistry {
        ObjectManagerDescriptor manager = entityManagerMap.get(targetTypeName);
        if (nullEntityManagerMap.containsKey(targetTypeName)) {

}
    }
import java.util.ArrayList;
 * You may obtain a copy of the License at
        }
import org.eclipse.core.runtime.Platform;
        // 2. Find first applicable
        nullEntityManagerMap.put(targetTypeName, Boolean.TRUE);
            return null;
    private Map<String, ObjectManagerDescriptor> entityManagerMap = new HashMap<>();
            }

import org.eclipse.core.runtime.IConfigurationElement;
            return managerType.cast(objectManager);
        } else {
 */
        return instance;

            return manager;
 * DBeaver - Universal Database Manager
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ObjectManagerDescriptor.EXTENSION_ID);

        if (objectManager != null && managerType.isAssignableFrom(objectManager.getClass())) {

        }
                ObjectManagerDescriptor descriptor = new ObjectManagerDescriptor(ext);

    }
    private ObjectManagerDescriptor getEntityManager(Class<?> objectType) {

        for (ObjectManagerDescriptor em : entityManagers) {
 *
import java.util.HashMap;

 *
        return null;
 * you may not use this file except in compliance with the License.
    public ObjectManagerRegistry(IExtensionRegistry registry) {
        // TODO: need to re-validate. Maybe cache will break some lazy loaded bundles?
    public synchronized static ObjectManagerRegistry getInstance() {
    }
import org.jkiss.dbeaver.model.edit.DBERegistry;
        for (ObjectManagerDescriptor descriptor : entityManagers) {

    public DBEObjectManager<?> getObjectManager(Class<?> aClass) {
        ObjectManagerDescriptor entityManager = getEntityManager(aClass);
        }


        String targetTypeName = objectType.getName();
 *
 */


    private Map<String, Boolean> nullEntityManagerMap = new HashMap<>();
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others

        }
        }
            if (TAG_MANAGER.equals(ext.getName())) {
 * Unless required by applicable law or agreed to in writing, software
            if (descriptor.appliesToType(objectType)) {
    }
        if (instance == null) {
        nullEntityManagerMap.clear();
        return entityManager == null ? null : entityManager.getManager();
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
            instance = new ObjectManagerRegistry(Platform.getExtensionRegistry());
            return null;

                entityManagers.add(descriptor);
        for (IConfigurationElement ext : extElements) {
import org.eclipse.core.runtime.IExtensionRegistry;
 * See the License for the specific language governing permissions and
        }
                return descriptor;
import java.util.List;
    public <T> T getObjectManager(Class<?> objectClass, Class<T> managerType) {
    }
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
        entityManagers.clear();
        entityManagerMap.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0
        // Load datasource providers from external plugins
import java.util.Map;
    private static final String TAG_MANAGER = "manager"; //NON-NLS-1
 * ObjectManagerRegistry
            entityManagerMap.put(em.getObjectType().getImplName(), em);
        }
    public void dispose() {
package org.jkiss.dbeaver.registry;
                entityManagerMap.put(targetTypeName, descriptor);
        final DBEObjectManager<?> objectManager = getObjectManager(objectClass);
    private List<ObjectManagerDescriptor> entityManagers = new ArrayList<ObjectManagerDescriptor>();
        // 1. Try exact match
