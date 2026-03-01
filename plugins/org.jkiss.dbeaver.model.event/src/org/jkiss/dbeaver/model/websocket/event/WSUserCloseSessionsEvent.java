        return sessionIds;
 * you may not use this file except in compliance with the License.
    private final List<String> sessionIds;
public class WSUserCloseSessionsEvent extends WSAbstractEvent {

    }
 * You may obtain a copy of the License at


    public static final String ID = "cb_close_user_sessions";
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        this(sessionIds, null, null);
        @Nullable String initiatorSessionId,

        @NotNull List<String> sessionIds,
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.websocket.WSConstants;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    }
}
/*
    public List<String> getSessionIds() {
        super(ID, WSConstants.TOPIC_USER, initiatorSessionId, userId);
import java.util.List;
 * See the License for the specific language governing permissions and
 *
 */
    }
        this.sessionIds = sessionIds;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public WSUserCloseSessionsEvent(
 *
package org.jkiss.dbeaver.model.websocket.event;
    @NotNull
    ) {

        @Nullable String userId
 * DBeaver - Universal Database Manager

 *
    public WSUserCloseSessionsEvent(@NotNull List<String> sessionIds) {
