 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.model.websocket.event;
 *
    @Nullable
 *
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        this.sessionId = sessionId;
 *     http://www.apache.org/licenses/LICENSE-2.0
public class WSEventDeleteTempFile extends WSAbstractEvent {
 *
import org.jkiss.dbeaver.model.websocket.WSConstants;
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String sessionId;
 */
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

/*
    @Override
    public String getSessionId() {
        return sessionId;

    public WSEventDeleteTempFile(String sessionId) {
    }

 * limitations under the License.
        super("cb_temp_folder_deleted", WSConstants.TOPIC_DELETE_TEMP_FOLDER);
