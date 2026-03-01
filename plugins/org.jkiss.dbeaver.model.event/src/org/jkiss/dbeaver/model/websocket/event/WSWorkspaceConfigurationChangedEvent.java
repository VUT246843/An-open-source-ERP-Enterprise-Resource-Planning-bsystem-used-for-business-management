
    }
}

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.configFilePath = configFilePath;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * You may obtain a copy of the License at
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class WSWorkspaceConfigurationChangedEvent extends WSAbstractEvent {
 *

 * DBeaver - Universal Database Manager
    public WSWorkspaceConfigurationChangedEvent(@NotNull String configFilePath, @Nullable String sessionId, @Nullable String userId) {
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
 */
    @NotNull
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.websocket.WSConstants;


 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
        return configFilePath;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super("cb_workspace_config_changed", WSConstants.TOPIC_WORKSPACE_CONFIGURATION, sessionId, userId);
package org.jkiss.dbeaver.model.websocket.event;
 *
    private final String configFilePath;
 * you may not use this file except in compliance with the License.
    public String getConfigFilePath() {
