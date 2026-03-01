public class WSServerEventDescriptor extends WSAbstractEventDescriptor {
        this.topicId = cfg.getAttribute("topicId");;
 * See the License for the specific language governing permissions and

    @NotNull
    private final String topicId;
    }
    @NotNull
 * limitations under the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    public Class<? extends WSEvent> getEventClass() {
        @NotNull IConfigurationElement cfg
/*
    @NotNull
 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getTopicId() {
}
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at

    ) {
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  Event from the server to the client (browser or desktop)
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        return implType.getImplClass(WSEvent.class);
import org.jkiss.code.NotNull;
        super(cfg);

    protected WSServerEventDescriptor(
/**
import org.jkiss.dbeaver.model.websocket.event.WSEvent;
package org.jkiss.dbeaver.model.websocket.registry;
import org.eclipse.core.runtime.IConfigurationElement;
        return topicId;
 *
