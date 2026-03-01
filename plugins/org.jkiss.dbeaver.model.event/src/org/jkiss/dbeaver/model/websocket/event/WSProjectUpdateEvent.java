 *
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.websocket.WSConstants;
        return projectInfo;
            REMOVED,
    }
        @NotNull RMProjectInfo projectInfo
 * See the License for the specific language governing permissions and
            projectId,
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
    public String getProjectId() {
    public static final String UPDATED = "cb_rm_project_updated";
    protected final RMProjectInfo projectInfo;
        this.projectId = projectId;
public class WSProjectUpdateEvent extends WSAbstractEvent implements WSProjectEvent {

    public static WSProjectUpdateEvent create(
            UPDATED,
        @NotNull String projectId
    ) {
        return projectId;
        @Nullable String sessionId,
    @Nullable

 */
/*
        super(eventId, WSConstants.TOPIC_PROJECTS, sessionId, userId);

    @NotNull
            null
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected final String projectId;

        return new WSProjectUpdateEvent(
    }
    @Nullable
 * limitations under the License.
    ) {
        @Nullable String sessionId,
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable String userId,
    public static WSProjectUpdateEvent update(
import org.jkiss.code.Nullable;
        @Nullable String sessionId,
    }
        @Nullable String sessionId,
            projectId,

        );
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.websocket.event;
    }

    public static WSProjectUpdateEvent delete(
            projectInfo
            userId,
            ADDED,
 * DBeaver - Universal Database Manager

    @Override
    ) {
            sessionId,
        return new WSProjectUpdateEvent(
        @NotNull String projectId
        @Nullable String userId,
            projectId,
        );
    public static final String REMOVED = "cb_rm_project_removed";
        @NotNull String projectId,
            userId,
 * you may not use this file except in compliance with the License.
        );
            null
 * Unless required by applicable law or agreed to in writing, software
            userId,
            sessionId,
    public RMProjectInfo getProjectInfo() {
        @NotNull String eventId,
 *
    ) {
import org.jkiss.dbeaver.model.rm.RMProjectInfo;

        @Nullable String userId,
    public static final String ADDED = "cb_rm_project_added";
        this.projectInfo = projectInfo;
    }
        @NotNull String projectId,
    public WSProjectUpdateEvent(
        return new WSProjectUpdateEvent(
        @Nullable String userId,
 * Licensed under the Apache License, Version 2.0 (the "License");
            sessionId,
        @Nullable RMProjectInfo projectInfo
