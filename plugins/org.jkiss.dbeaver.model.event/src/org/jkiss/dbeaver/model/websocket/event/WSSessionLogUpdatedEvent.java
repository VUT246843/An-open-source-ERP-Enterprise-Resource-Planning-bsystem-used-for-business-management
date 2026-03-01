
 * DBeaver - Universal Database Manager
 * limitations under the License.
 *
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getMessage() {
    public WSSessionLogUpdatedEvent(
    }
        super("cb_session_log_updated", WSConstants.TOPIC_SESSION_LOG, sessionId, userId);
    }
        this.messageType = messageType;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,

        return messageType;
    private final MessageType messageType;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.websocket.WSConstants;
    ) {
 */
    }
public class WSSessionLogUpdatedEvent extends WSAbstractEvent {
        @NotNull MessageType messageType,
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final String message;
package org.jkiss.dbeaver.model.websocket.event;
        return message;
        @Nullable String sessionId,
        this.message = message;
 * you may not use this file except in compliance with the License.
}
        @Nullable String userId,

    public MessageType getMessageType() {

        @Nullable String message
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
 *
