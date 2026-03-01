package org.jkiss.dbeaver.model.websocket.event.permissions;
import org.jkiss.dbeaver.model.websocket.WSConstants;
    public String getSubjectId() {
import org.jkiss.code.NotNull;
        @NotNull String subjectId
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
            userId
 * you may not use this file except in compliance with the License.
        @NotNull SMSubjectType subjectType,
        @Nullable String sessionId,
        return subjectId;
            subjectType,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Nullable String userId,
    public SMSubjectType getSubjectType() {
    }
    private final String subjectId;
    @NotNull
}

        this.subjectId = subjectId;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return new WSSubjectPermissionEvent(
 */
        @NotNull SMSubjectType subjectType,

            subjectId,
 * limitations under the License.

        @Nullable String userId

        @Nullable String sessionId,
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
/*
        super("cb_subject_permissions_updated", WSConstants.TOPIC_SUBJECT_PERMISSIONS, sessionId, userId);
 *
 * You may obtain a copy of the License at
    public static WSSubjectPermissionEvent update(
    protected WSSubjectPermissionEvent(
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        @NotNull String subjectId,
        this.subjectType = subjectType;
import org.jkiss.dbeaver.model.websocket.event.WSAbstractEvent;
    ) {
public class WSSubjectPermissionEvent extends WSAbstractEvent {
    ) {
    private final SMSubjectType subjectType;
 * DBeaver - Universal Database Manager

        return subjectType;
    }
import org.jkiss.dbeaver.model.security.SMSubjectType;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        );
            sessionId,
