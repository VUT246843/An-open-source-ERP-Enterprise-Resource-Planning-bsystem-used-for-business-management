        return property;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull WSResourceProperty property,
    @Nullable
            sessionId,
/*
            property,
        @Nullable String details

    public String getProjectId() {
            DELETED,
    }

    private final String details;
            details
    }
        @NotNull WSResourceProperty property,
        super(eventId, WSConstants.TOPIC_SCRIPTS, sessionId, userId, projectId);
        @NotNull String projectId,
    @NotNull
    }
        @NotNull String resourcePath,
 * limitations under the License.
            userId,
        );
 *
        this.property = property;

        @NotNull WSResourceProperty property,

 * Unless required by applicable law or agreed to in writing, software
        this.resourcePath = resourcePath;

package org.jkiss.dbeaver.model.websocket.event.resource;
            projectId,
        @Nullable String userId,
        @Nullable String sessionId,
        @NotNull String projectId,
    public static WSResourceUpdatedEvent update(
            property,
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final String CREATED = "cb_rm_resource_created";
        @Nullable String details
            details
    }
            userId,
 * DBeaver - Universal Database Manager
    public String getResourcePath() {
            resourcePath,
        @Nullable String details

 * See the License for the specific language governing permissions and
    public static final String UPDATED = "cb_rm_resource_updated";
import org.jkiss.dbeaver.model.websocket.event.WSProjectResourceEvent;
        @Nullable String sessionId,

        this.details = details;
    }

    private final WSResourceProperty property;
import org.jkiss.code.Nullable;
        @Nullable String userId,
    ) {
    @NotNull
        @NotNull String resourcePath,
    public String getDetails() {
public class WSResourceUpdatedEvent extends WSProjectResourceEvent {
 *
            projectId,
        @Nullable String details
    @NotNull
    private WSResourceUpdatedEvent(
import org.jkiss.dbeaver.model.websocket.WSConstants;

        @NotNull String resourcePath,
}
        );
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static WSResourceUpdatedEvent delete(
        ) {
        @NotNull String projectId,
    @Nullable
    public static final String DELETED = "cb_rm_resource_deleted";
        @Nullable String userId,

        return resourcePath;
            sessionId,
 * you may not use this file except in compliance with the License.
        );
    @NotNull
        return projectId;
        return details;
    }
            UPDATED,
    ) {
        @NotNull String projectId,
 */
    private final String resourcePath;
    public WSResourceProperty getProperty() {
    }
        return new WSResourceUpdatedEvent(
        @NotNull String resourcePath,
    public static WSResourceUpdatedEvent create(
        @NotNull String eventId,

    ) {
            userId,
        return new WSResourceUpdatedEvent(
            resourcePath,
import org.jkiss.code.NotNull;
            sessionId,
            resourcePath,
            details
            projectId,
        return new WSResourceUpdatedEvent(
            property,
        @NotNull WSResourceProperty property,
        @Nullable String sessionId,
    @NotNull
        @Nullable String userId,
        @Nullable String sessionId,
            CREATED,
