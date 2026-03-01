    public WSProjectResourceEvent(
    }
 * DBeaver - Universal Database Manager
        @NotNull String projectId
 * You may obtain a copy of the License at
        @Nullable String userId,
    @NotNull
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getProjectId() {
    ) {
 */
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.websocket.event;
import org.jkiss.code.NotNull;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        return projectId;
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Nullable String sessionId,
import org.jkiss.code.Nullable;
    protected final String projectId;
        super(eventId, topicId, sessionId, userId);
    @NotNull
    }
        @NotNull String eventId,
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 * Unless required by applicable law or agreed to in writing, software
        @NotNull String topicId,

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
public class WSProjectResourceEvent extends WSAbstractEvent implements WSProjectEvent {
        this.projectId = projectId;
}
