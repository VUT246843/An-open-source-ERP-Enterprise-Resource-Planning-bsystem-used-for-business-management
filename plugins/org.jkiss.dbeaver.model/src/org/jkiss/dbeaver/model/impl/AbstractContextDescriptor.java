
        for (IConfigurationElement typeCfg : config.getChildren(OBJECT_TYPE)) {
import org.eclipse.core.runtime.IConfigurationElement;

    }
        return false;
        }
        }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 */


    public AbstractContextDescriptor(@NotNull IConfigurationElement config) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
                return true;

    private final ObjectType[] objectTypes;
 * AbstractContextDescriptor
    @NotNull
}
    }
            }


        return appliesTo(object, null);
    public boolean appliesTo(@NotNull DBPObject object, @Nullable Object context) {
        for (ObjectType objectType : objectTypes) {
package org.jkiss.dbeaver.model.impl;
        String objectType = config.getAttribute(OBJECT_TYPE);
        super(pluginId);
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
        if (object == null) {
        if (object instanceof DBSObject) {
import java.util.List;

    }


 * Licensed under the Apache License, Version 2.0 (the "License");

                return true;
 *
    protected Object adaptType(@NotNull DBPObject object) {
public abstract class AbstractContextDescriptor extends AbstractDescriptor {
    }
            object = DBUtils.getPublicObject((DBSObject) object);
import java.util.ArrayList;
        }
    @Nullable
        List<ObjectType> objectTypes = new ArrayList<>();
    }
 */
    }
 * See the License for the specific language governing permissions and

            if (objectType.matchesType(objectClass)) {
        this.objectTypes = objectTypes.toArray(new ObjectType[0]);
        this.objectTypes = new ObjectType[0];
    public boolean matchesType(@NotNull Class<? extends DBSObject> objectClass) {
 *
        }
        Object adapted = adaptType(object);
            objectTypes.add(new ObjectType(typeCfg));
    }
        }

import org.jkiss.dbeaver.model.struct.DBSObject;
            }
            return false;
    private static final String OBJECT_TYPE = "objectType";
 * limitations under the License.
 * DBeaver - Universal Database Manager
    public boolean appliesTo(@NotNull DBPObject object) {
 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.code.Nullable;
            if (objectType.appliesTo(object, context) || (adapted != null && objectType.appliesTo(adapted, context))) {
        super(config.getContributor().getName());
    public AbstractContextDescriptor(@NotNull String pluginId) {
 * You may obtain a copy of the License at

    @NotNull
        for (ObjectType objectType : objectTypes) {
    }
        return objectTypes;
    public boolean hasObjectTypes() {
    public ObjectType[] getObjectTypes() {
import org.jkiss.dbeaver.model.DBPObject;
            objectTypes.add(new ObjectType(objectType));
        return objectTypes.length > 0;
/*
        return false;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBUtils;
        if (objectType != null) {
        return null;
