        String projectId,
    }
public class WSDatasourceFolderEvent extends WSProjectResourceEvent {

    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return new WSDatasourceFolderEvent(
        return new WSDatasourceFolderEvent(


        return new WSDatasourceFolderEvent(
import org.jkiss.code.Nullable;
        );
        @Nullable String sessionId,
 * You may obtain a copy of the License at
            sessionId,
        @Nullable String sessionId,
import org.jkiss.dbeaver.model.websocket.event.WSProjectResourceEvent;
        return nodePaths;
            userId,

    ) {
            sessionId,
    }
import java.util.List;
 *
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    ) {
 * DBeaver - Universal Database Manager
        String userId,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull String projectId,
        @Nullable String userId,
 *

        List<String> nodePaths
 * you may not use this file except in compliance with the License.
            "cb_datasource_folder_created",
        super(eventId, WSConstants.TOPIC_DATASOURCE_FOLDER, sessionId, userId, projectId);

    }
 */
            "cb_datasource_folder_deleted",
        String sessionId,
            "cb_datasource_folder_updated",
        @NotNull String projectId,
        @Nullable String userId,
    }
        @Nullable String sessionId,
    private final List<String> nodePaths;
        @NotNull String eventId,
    public static WSDatasourceFolderEvent delete(
        @NotNull String projectId,
            datasourceIds
            projectId,
    }
            userId,
            folderPaths
 *
            userId,
        this.nodePaths = nodePaths;
        @NotNull List<String> datasourceIds
        @NotNull List<String> datasourceIds
        );
        @NotNull List<String> folderPaths
        );
            projectId,

}
import org.jkiss.dbeaver.model.websocket.WSConstants;
    public List<String> getNodePaths() {
    private WSDatasourceFolderEvent(
        @Nullable String userId,
            sessionId,
import org.jkiss.code.NotNull;
    ) {
 * See the License for the specific language governing permissions and
            datasourceIds
 * distributed under the License is distributed on an "AS IS" BASIS,

    public static WSDatasourceFolderEvent update(
    public static WSDatasourceFolderEvent create(
package org.jkiss.dbeaver.model.websocket.event.datasource;
            projectId,
 * Licensed under the Apache License, Version 2.0 (the "License");
