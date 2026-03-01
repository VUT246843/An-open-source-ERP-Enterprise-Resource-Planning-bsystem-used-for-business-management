        @NotNull String sessionId,
    ) {

 *
        @NotNull String userId
 * limitations under the License.
    public String getConnectionId() {
    @NotNull
    @NotNull

        this.connectionId = connectionId;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.websocket.event.WSProjectResourceEvent;
 * Unless required by applicable law or agreed to in writing, software
        super("cb_datasource_disconnected", WSConstants.TOPIC_DATASOURCE_CONNECTION, sessionId, userId, projectId);
import org.jkiss.dbeaver.model.websocket.WSConstants;
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.model.websocket.event.datasource;
        return connectionId;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
public class WSDataSourceDisconnectEvent extends WSProjectResourceEvent {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String connectionId;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull String projectId,
 * DBeaver - Universal Database Manager


    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * You may obtain a copy of the License at
        @NotNull String connectionId,
 * you may not use this file except in compliance with the License.

}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    public WSDataSourceDisconnectEvent(
