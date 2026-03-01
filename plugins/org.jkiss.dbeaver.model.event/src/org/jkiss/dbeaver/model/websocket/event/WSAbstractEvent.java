    @Nullable
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    @HiddenField
 */
        @Nullable String userId

 * Unless required by applicable law or agreed to in writing, software
        return sessionId;
        this.sessionId = sessionId;
}    }
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.websocket.gson.HiddenField;
    private final String id;
    }
/*
    @NotNull
    }
 */
        @NotNull String topicId

    ) {
    @HiddenField
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    private final long timestamp = System.currentTimeMillis();
    }


import org.jkiss.code.Nullable;
        @NotNull String topicId,
        return userId;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    @Nullable
 *
    private final String sessionId;
        return id;
        @NotNull String eventId,
    public long getTimestamp() {
package org.jkiss.dbeaver.model.websocket.event;
 * Base websocket event
    @Override
    protected WSAbstractEvent(
    public String getUserId() {
    @NotNull
        this(eventId, topicId, null, null);
    @Nullable
    public String getSessionId() {
        return timestamp;
        this.id = eventId;

    ) {
    @Override
    @Override
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        @Nullable String sessionId,
    private final String userId;
        this.userId = userId;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
 * DBeaver - Universal Database Manager

        return topicId;
    public String getTopicId() {
    public String getId() {

 *
    protected WSAbstractEvent(
 *
/**
    }
 * You may obtain a copy of the License at
    }
public abstract class WSAbstractEvent implements WSEvent {
    private final String topicId;
        @NotNull String eventId,

        this.topicId = topicId;
import org.jkiss.code.NotNull;
    }

