                    )
 * Unless required by applicable law or agreed to in writing, software
            WSEventRegistry.getInstance().getClientEvents()
 * limitations under the License.
                        WSClientEventDescriptor::getId,
/*
 * You may obtain a copy of the License at
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.websocket.registry.WSEventRegistry;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
public class WSClientEventDeserializer extends WSAbstractClassByIdDeserializer<WSClientEvent> {
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.websocket.event.WSClientEvent;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * you may not use this file except in compliance with the License.
                .collect(
        super(
    public WSClientEventDeserializer() {

package org.jkiss.dbeaver.model.websocket.gson;
                .stream()
                )
import org.jkiss.dbeaver.model.websocket.registry.WSClientEventDescriptor;
 */
        );
                    Collectors.toMap(
}
                        WSClientEventDescriptor::getEventClass
