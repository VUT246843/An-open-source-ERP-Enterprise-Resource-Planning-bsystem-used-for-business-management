 *
    }
public class WSObjectPermissionEvent extends WSAbstractEvent {
            DELETED,

        @Nullable String sessionId,

import org.jkiss.dbeaver.model.security.SMObjectType;
    private final String objectId;
            objectType,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            UPDATED,
    public static final String UPDATED = "cb_object_permissions_updated";
        return new WSObjectPermissionEvent(

    }
        return new WSObjectPermissionEvent(
    public static WSObjectPermissionEvent update(
            sessionId,
        @NotNull String eventId,
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
    private final SMObjectType smObjectType;
    public static WSObjectPermissionEvent delete(
        this.smObjectType = smObjectType;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.websocket.WSConstants;
        return smObjectType;
    }
            objectType,
        @Nullable String userId,
import org.jkiss.dbeaver.model.websocket.event.WSAbstractEvent;
    public SMObjectType getSmObjectType() {
        return objectId;
 *
        @Nullable String userId
            objectId,
        @NotNull String objectId
        super(eventId, WSConstants.TOPIC_OBJECT_PERMISSIONS, sessionId, userId);
    ) {
package org.jkiss.dbeaver.model.websocket.event.permissions;
            objectId,
        this.objectId = objectId;
        @NotNull SMObjectType smObjectType,
 * DBeaver - Universal Database Manager

    public static final String DELETED = "cb_object_permissions_deleted";

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    ) {
        );


    public String getObjectId() {
/*
        @NotNull String objectId
        @Nullable String sessionId,
            userId
            sessionId,
        );
 * Copyright (C) 2010-2024 DBeaver Corp and others

            userId
 * you may not use this file except in compliance with the License.
}
        @Nullable String sessionId,
    ) {
 *
 */
    protected WSObjectPermissionEvent(
 * See the License for the specific language governing permissions and
    }
        @NotNull String objectId,
 * You may obtain a copy of the License at
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable String userId,
        @NotNull SMObjectType objectType,
        @NotNull SMObjectType objectType,
