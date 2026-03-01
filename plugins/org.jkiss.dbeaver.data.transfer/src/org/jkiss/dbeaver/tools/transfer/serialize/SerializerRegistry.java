    public boolean isSerializable(Object object) {
    private final Map<String, SerializerDescriptor> serializers = new HashMap<>();
/*
        return instance;
    private static final Log log = Log.getLog(SerializerRegistry.class);
import org.eclipse.core.runtime.Platform;
            }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Unless required by applicable law or agreed to in writing, software
    public <OBJECT_CONTEXT, OBJECT_TYPE> DTObjectSerializer<OBJECT_CONTEXT, OBJECT_TYPE> createSerializerByType(String typeID) {
        if (sd == null) {
            // Load main nodes

        }
}
    @Nullable
import org.jkiss.code.Nullable;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getObjectType(Object object) {
        } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (dbSerializable != null) {
        }
        }
            return null;
import org.eclipse.core.runtime.IConfigurationElement;
 *
 * You may obtain a copy of the License at
                SerializerDescriptor sd = new SerializerDescriptor(ext);
        return null;
            if ("serializer".equals(ext.getName())) {
import org.jkiss.dbeaver.Log;
import org.eclipse.core.runtime.IExtensionRegistry;
                if (!isDistributedMultiuserApp || sd.isDistributed()) {
public class SerializerRegistry {
 *     http://www.apache.org/licenses/LICENSE-2.0

    private SerializerRegistry(IExtensionRegistry registry) {

    }

            return sd.createSerializer();
    public synchronized static SerializerRegistry getInstance() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }
    }
        try {
package org.jkiss.dbeaver.tools.transfer.serialize;
import java.util.Map;
 * limitations under the License.
            .isMultiuser();
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
import org.jkiss.dbeaver.model.meta.DBSerializable;
 * See the License for the specific language governing permissions and
        DBSerializable dbSerializable = object.getClass().getAnnotation(DBSerializable.class);
 * DBeaver - Universal Database Manager
        }
    public DTObjectSerializer createSerializer(Object object) {
            return null;
    }
        // Load datasource providers from external plugins
            .getApplication()
            instance = new SerializerRegistry(Platform.getExtensionRegistry());
                    serializers.put(sd.getId(), sd);
import java.util.HashMap;
    private static SerializerRegistry instance = null;
        return dbSerializable != null ? dbSerializable.value() : null;
        return object.getClass().getAnnotation(DBSerializable.class) != null;
    }
    }
        }

 *

        SerializerDescriptor sd = serializers.get(typeID);


        boolean isDistributedMultiuserApp = DBWorkbench.isDistributed() && DBWorkbench.getPlatform()
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(SerializerDescriptor.EXTENSION_ID);

        DBSerializable dbSerializable = object.getClass().getAnnotation(DBSerializable.class);
            log.error("Error creating serializer " + sd.getId(), e);
    }

            return createSerializerByType(dbSerializable.value());
        for (IConfigurationElement ext : extElements) {
 *
            log.error("Serializer '" + typeID + "' not found");
 */
        if (instance == null) {

