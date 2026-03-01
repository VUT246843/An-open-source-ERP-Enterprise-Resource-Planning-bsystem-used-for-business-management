                )
 */
 *
 *
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    WSServerEventDescriptor::getEventClass
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        );

 * distributed under the License is distributed on an "AS IS" BASIS,
            .stream()
import java.util.stream.Collectors;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.websocket.registry.WSEventRegistry;
            )
/*
 * Unless required by applicable law or agreed to in writing, software
        super(WSEventRegistry.getInstance().getServerEvents()
import org.jkiss.dbeaver.model.websocket.registry.WSServerEventDescriptor;
package org.jkiss.dbeaver.model.websocket.gson;
            .collect(Collectors.toMap(
    }

    public WSEventDeserializer() {

public class WSEventDeserializer extends WSAbstractClassByIdDeserializer<WSEvent> {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
}
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.websocket.event.WSEvent;
                    WSServerEventDescriptor::getId,
