        if (instance == null) {
                var descriptor = new WSClientEventDescriptor(ext);
package org.jkiss.dbeaver.model.websocket.registry;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    private final List<WSClientEventDescriptor> clientEvents = new ArrayList<>();
 * Copyright (C) 2010-2024 DBeaver Corp and others

            instance = new WSEventRegistry();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final String CLIENT_EVENT_TAG = "clientEvent";
 * you may not use this file except in compliance with the License.
    private void loadExtensions(@NotNull IExtensionRegistry registry) {
 *
                clientEvents.add(descriptor);
        for (IConfigurationElement ext : extElements) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * limitations under the License.

        return new ArrayList<>(clientEvents);
            if (EVENT_TAG.equals(ext.getName())) {
            } else if(CLIENT_EVENT_TAG.equals(ext.getName())) {
 * You may obtain a copy of the License at

        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
/*
import org.jkiss.code.NotNull;
    private static final String EVENT_TAG = "event";
 *

    @NotNull
public class WSEventRegistry {
 * DBeaver - Universal Database Manager
        return instance;
    public synchronized static WSEventRegistry getInstance() {

    private static WSEventRegistry instance = null;

            instance.loadExtensions(Platform.getExtensionRegistry());
    private WSEventRegistry() {
import org.eclipse.core.runtime.IExtensionRegistry;
        }
        }
                serverEvents.add(descriptor);

import org.eclipse.core.runtime.IConfigurationElement;
                var descriptor = new WSServerEventDescriptor(ext);
 */
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.ws.event";
 *
    }
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.core.runtime.Platform;
import java.util.List;
    public List<WSClientEventDescriptor> getClientEvents() {
}
            }
    }
 * Unless required by applicable law or agreed to in writing, software
import java.util.ArrayList;
    }
    @NotNull
        return new ArrayList<>(serverEvents);
    public List<WSServerEventDescriptor> getServerEvents() {
    private final List<WSServerEventDescriptor> serverEvents = new ArrayList<>();
