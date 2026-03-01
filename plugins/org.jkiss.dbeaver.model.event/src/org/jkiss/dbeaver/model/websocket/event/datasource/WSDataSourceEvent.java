        @NotNull String projectId,
    public static final String UPDATED = "cb_datasource_updated";
        @Nullable String userId,

            projectId,
 * you may not use this file except in compliance with the License.


        @NotNull List<String> datasourceIds,
        @Nullable String sessionId,
            userId,
    ) {
            UPDATED,
        return dataSourceIds;
            sessionId,
            sessionId,
        @NotNull WSDataSourceProperty property
        @NotNull List<String> datasourceIds,
    }

 * You may obtain a copy of the License at
        @NotNull WSDataSourceProperty property
    @NotNull
/*
        this.dataSourceIds = dataSourceIds;

    }
        this.property = property;
    }
            property);
            datasourceIds,
import org.jkiss.code.NotNull;
        @Nullable String userId,
import org.jkiss.dbeaver.model.websocket.WSConstants;
public class WSDataSourceEvent extends WSProjectResourceEvent {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.websocket.event.WSProjectResourceEvent;
        @NotNull WSDataSourceProperty property
    @NotNull
            projectId,
    public List<String> getDataSourceIds() {
        return new WSDataSourceEvent(
import org.jkiss.code.Nullable;
            DELETED,
    ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public static final String CREATED = "cb_datasource_created";
 *     http://www.apache.org/licenses/LICENSE-2.0
    public WSDataSourceProperty getProperty() {
            projectId,
    public static final String DELETED = "cb_datasource_deleted";
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull String projectId,
            CREATED,
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return new WSDataSourceEvent(
    ) {
package org.jkiss.dbeaver.model.websocket.event.datasource;
        super(eventId, WSConstants.TOPIC_DATASOURCE, sessionId, userId, projectId);
            property);
            sessionId,


            userId,
        return new WSDataSourceEvent(
    }
        @Nullable String userId,
        @NotNull String eventId,

 * Unless required by applicable law or agreed to in writing, software
        return property;
 * See the License for the specific language governing permissions and
            datasourceIds,
        @NotNull WSDataSourceProperty property
 */
        @NotNull List<String> dataSourceIds,
        @Nullable String sessionId,
 * DBeaver - Universal Database Manager
    private final WSDataSourceProperty property;
        @NotNull String projectId,
    @NotNull
 *
    ) {
    private WSDataSourceEvent(
        @NotNull String projectId,
    public static WSDataSourceEvent create(
    public static WSDataSourceEvent update(
 * limitations under the License.
    public static WSDataSourceEvent delete(
        @Nullable String sessionId,
    @NotNull
            property);
 *
}
            datasourceIds,
import java.util.List;
        @NotNull List<String> datasourceIds,
    private final List<String> dataSourceIds;
        @Nullable String userId,
        @Nullable String sessionId,
            userId,
