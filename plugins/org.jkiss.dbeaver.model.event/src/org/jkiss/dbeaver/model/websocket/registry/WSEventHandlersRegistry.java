 * Unless required by applicable law or agreed to in writing, software
            instance = new WSEventHandlersRegistry();
            .map(WSEventHandlerDescriptor::getInstance)
    }
        for (IConfigurationElement ext : registry.getConfigurationElementsFor(EXTENSION_ID)) {
            if (EVENT_HANDLER_TAG.equals(ext.getName())) {
        return instance;
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
                result.add(new WSEventHandlerDescriptor(ext));
 *
package org.jkiss.dbeaver.model.websocket.registry;
    @NotNull
        var result = new ArrayList<WSEventHandlerDescriptor>();

    private static final String EVENT_HANDLER_TAG = "eventHandler";
        }
import org.eclipse.core.runtime.IConfigurationElement;


    }
 * you may not use this file except in compliance with the License.
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.ws.event.handler";
    }
            .collect(Collectors.toList());
/*

    @NotNull
}
import org.jkiss.dbeaver.model.websocket.WSEventHandler;
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        List<WSEventHandlerDescriptor> eventHandlerDescriptors = readDescriptors();
        }
        if (instance == null) {
import java.util.stream.Collectors;
 * See the License for the specific language governing permissions and
 *
 * DBeaver - Universal Database Manager
        return eventHandlerDescriptors.stream()


            // Load webServices
 * distributed under the License is distributed on an "AS IS" BASIS,
        return result;
public class WSEventHandlersRegistry {
    public List<WSEventHandlerDescriptor> readDescriptors() {
        var registry = Platform.getExtensionRegistry();
 * limitations under the License.
import org.jkiss.code.NotNull;
            }
 * You may obtain a copy of the License at
    public List<WSEventHandler> getEventHandlers() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.Platform;
    public synchronized static WSEventHandlersRegistry getInstance() {
    private static WSEventHandlersRegistry instance = null;
