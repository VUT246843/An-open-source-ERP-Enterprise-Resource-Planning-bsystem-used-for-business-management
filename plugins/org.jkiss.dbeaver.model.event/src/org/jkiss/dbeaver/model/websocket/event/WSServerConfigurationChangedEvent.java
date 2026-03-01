
    public WSServerConfigurationChangedEvent() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(ID, WSConstants.TOPIC_SERVER_CONFIG, sessionId, userId);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public WSServerConfigurationChangedEvent(@Nullable String sessionId, @Nullable String userId) {
 * Unless required by applicable law or agreed to in writing, software
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final String ID = "cb_config_changed";
}
    }
public class WSServerConfigurationChangedEvent extends WSAbstractEvent {
 * limitations under the License.
import org.jkiss.dbeaver.model.websocket.WSConstants;
        super(ID, WSConstants.TOPIC_SERVER_CONFIG);
package org.jkiss.dbeaver.model.websocket.event;
 */
/*
 * DBeaver - Universal Database Manager
