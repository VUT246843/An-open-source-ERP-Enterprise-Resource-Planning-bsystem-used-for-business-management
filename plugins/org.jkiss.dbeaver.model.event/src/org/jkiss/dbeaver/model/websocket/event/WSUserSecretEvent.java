

}
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    @NotNull
import org.jkiss.dbeaver.model.websocket.WSConstants;
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.websocket.event;
    @NotNull
    private final String projectId;
    }
    @NotNull

        return dataSourceId;
    private final String dataSourceId;
        @NotNull String dataSourceId,

        this.projectId = projectId;
    public WSUserSecretEvent(
    public String getProjectId() {
 */
        this.dataSourceId = dataSourceId;
    @NotNull
        @Nullable String userId
    ) {
 * you may not use this file except in compliance with the License.

    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super("cb_user_secret_updated", WSConstants.TOPIC_USER_SECRET, sessionId, userId);
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        return projectId;
    }
        @Nullable String sessionId,
 * DBeaver - Universal Database Manager
        @NotNull String projectId,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getDataSourceId() {
 *
public class WSUserSecretEvent extends WSAbstractEvent {
 *
 * You may obtain a copy of the License at

