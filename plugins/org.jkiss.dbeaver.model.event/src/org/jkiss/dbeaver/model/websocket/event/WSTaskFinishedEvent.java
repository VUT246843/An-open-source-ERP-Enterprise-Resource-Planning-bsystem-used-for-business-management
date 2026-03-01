

 *
 * See the License for the specific language governing permissions and


public class WSTaskFinishedEvent extends WSAbstractEvent implements WSProjectEvent{
    @NotNull

 * you may not use this file except in compliance with the License.
    public WSTaskFinishedEvent(@NotNull String taskId, @NotNull String projectId) {
    private final String projectId;
    }
        return taskId;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        this.taskId = taskId;
        super("cb_task_finished", WSConstants.TOPIC_TASK);

    }
        this.projectId = projectId;
} */
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
import org.jkiss.dbeaver.model.websocket.WSConstants;
package org.jkiss.dbeaver.model.websocket.event;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    }
        return projectId;
    @NotNull
import org.jkiss.code.NotNull;
 *
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
    public String getTaskId() {
    private final String taskId;
    public String getProjectId() {
