        @Nullable String sessionId,
 *
 * DBeaver - Universal Database Manager
        @NotNull String action
package org.jkiss.dbeaver.model.websocket.event;
import org.jkiss.dbeaver.model.websocket.WSConstants;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    @NotNull

    @Override
        this.action = action;
    }
 * See the License for the specific language governing permissions and

    public boolean isForceProcessed() {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public class WSServerStateEvent extends WSAbstractEvent {
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.code.Nullable;

        return action;
    private final String action;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getAction() {
    @NotNull
 * limitations under the License.
    }
 * Unless required by applicable law or agreed to in writing, software
    }
    public WSServerStateEvent(
    private static final String ID = "cb_server_state_updated";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {

/*

        @Nullable String userId,
        return true;
 */
        super(ID, WSConstants.TOPIC_SERVER_STATE, sessionId, userId);
