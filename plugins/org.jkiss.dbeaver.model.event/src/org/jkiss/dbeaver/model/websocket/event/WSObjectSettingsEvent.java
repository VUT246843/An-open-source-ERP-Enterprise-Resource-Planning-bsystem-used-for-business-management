    private final String projectId;
            settingIds
        return projectId;
    public static WSObjectSettingsEvent delete(
            projectId,
 * DBeaver - Universal Database Manager
 */
 *
    }
    @Nullable
    @NotNull

            UPDATED,
    public String getProjectId() {
        return new WSObjectSettingsEvent(
            smObjectType,
        this.smObjectType = smObjectType;
    }
        this.projectId = projectId;
        @Nullable String projectId,
            sessionId,
            settingIds

    @NotNull
        @Nullable String sessionId,
}
            userId,
        @Nullable String sessionId,
        @Nullable String projectId,
    ) {
        @NotNull String objectId,
    }
    ) {
        );
        @NotNull SMObjectType smObjectType,
    }
        @NotNull String userId,
    private final String objectId;
            objectId,
        this.settingIds = settingIds;
        super(eventId, WSConstants.TOPIC_OBJECT_SETTINGS, sessionId, userId);
    public Set<String> getSettingIds() {
    public static final String UPDATED = "cb_object_settings_updated";
        return new WSObjectSettingsEvent(
        this.objectId = objectId;

import java.util.Set;
            DELETED,
            sessionId,
import org.jkiss.dbeaver.model.security.SMObjectType;

        @Nullable String sessionId,
import org.jkiss.dbeaver.model.websocket.WSConstants;
    public String getObjectId() {
        @NotNull Set<String> settingIds
        @NotNull SMObjectType smObjectType,
            objectId,
    private final SMObjectType smObjectType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        );

        @NotNull SMObjectType smObjectType,
    }
    ) {
        return objectId;
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
public class WSObjectSettingsEvent extends WSAbstractEvent {
 * limitations under the License.
        @NotNull String objectId,

    protected WSObjectSettingsEvent(
 * You may obtain a copy of the License at
        return settingIds;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public SMObjectType getSmObjectType() {
        @Nullable String projectId,
        @NotNull Set<String> settingIds
 *
    }
        @NotNull String eventId,
            smObjectType,
    public static final String DELETED = "cb_object_settings_deleted";
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others


import org.jkiss.code.Nullable;
    }
        @NotNull String userId,
 * you may not use this file except in compliance with the License.
        @NotNull String userId,
    private final Set<String> settingIds;
        return smObjectType;
 *

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.websocket.event;

        @NotNull String objectId,
    public static WSObjectSettingsEvent update(
/*
            userId,
    @NotNull
            projectId,
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull Set<String> settingIds
