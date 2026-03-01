        this.applicationRunId = applicationRunId;


import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    }

 *
        return applicationRunId;
import org.jkiss.dbeaver.model.websocket.WSConstants;
    private final String applicationRunId;
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
    public String getApplicationRunId() {
package org.jkiss.dbeaver.model.websocket.event.session;
 * DBeaver - Universal Database Manager
public class WSSocketConnectedEvent extends WSAbstractSessionEvent {
    }

 * You may obtain a copy of the License at
        super("cb_session_websocket_connected", WSConstants.TOPIC_SESSION);
    public WSSocketConnectedEvent(@NotNull String applicationRunId) {
 * you may not use this file except in compliance with the License.

    @NotNull
/*
 * See the License for the specific language governing permissions and
