        return serverTypes.get(id);
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        }
    }
import java.util.ArrayList;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
import org.eclipse.core.runtime.IExtensionRegistry;
 * DBeaver - Universal Database Manager
    }
    private final Map<String, PostgreServerType> serverTypes = new HashMap<>();

 * you may not use this file except in compliance with the License.

    }

 * Unless required by applicable law or agreed to in writing, software

        for (IConfigurationElement ext : extElements) {
 * You may obtain a copy of the License at
    private static PostgreServerTypeRegistry instance = null;
 *
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.util.List;
import java.util.HashMap;
    public List<PostgreServerType> getServerTypes() {
import org.eclipse.core.runtime.Platform;
 *

        return new ArrayList<>(serverTypes.values());
 *
            instance = new PostgreServerTypeRegistry(Platform.getExtensionRegistry());
            PostgreServerType type = new PostgreServerType(ext);
        if (instance == null) {
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.postgresql.model.impls;
    public synchronized static PostgreServerTypeRegistry getInstance() {
import java.util.Map;
        return instance;

public class PostgreServerTypeRegistry {
    public PostgreServerType getServerType(String id) {

/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.postgresql.serverType"; //$NON-NLS-1$
            serverTypes.put(type.getId(), type);
}

    private PostgreServerTypeRegistry(IExtensionRegistry registry) {
import org.eclipse.core.runtime.IConfigurationElement;
 */

