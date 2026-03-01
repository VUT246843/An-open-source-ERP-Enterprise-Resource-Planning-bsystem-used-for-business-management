 * You may obtain a copy of the License at
    @NotNull
/**
    @NotNull
public abstract class WSClientEvent {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.websocket.event;
    @Nullable

 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String id;

        return topicId;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *

    }
    protected WSClientEvent(@NotNull String id, @Nullable String topicId) {
 * Unless required by applicable law or agreed to in writing, software
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * See the License for the specific language governing permissions and
 *
    public String getTopicId() {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * limitations under the License.
    private final String topicId;
    public String getId() {
    }
import org.jkiss.code.NotNull;
        this.id = id;
        this.topicId = topicId;
}
    @Nullable

 * Base websocket client event
        return id;
import org.jkiss.code.Nullable;
 *
