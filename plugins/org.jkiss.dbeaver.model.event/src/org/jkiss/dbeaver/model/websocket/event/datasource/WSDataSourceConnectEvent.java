    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.connectionId = connectionId;
 * DBeaver - Universal Database Manager
    public WSDataSourceConnectEvent(
 */

public class WSDataSourceConnectEvent extends WSProjectResourceEvent {

 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.model.websocket.event.datasource;
 * you may not use this file except in compliance with the License.
        @NotNull String projectId,
    ) {

    private final String connectionId;
        @NotNull String userId
/*
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.websocket.event.WSProjectResourceEvent;
    public String getConnectionId() {
        return connectionId;
 * limitations under the License.
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
    @NotNull
import org.jkiss.dbeaver.model.websocket.WSConstants;
        @NotNull String connectionId,
        @NotNull String sessionId,
    @NotNull

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
}
 *
        super("cb_datasource_connected", WSConstants.TOPIC_DATASOURCE_CONNECTION, sessionId, userId, projectId);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
