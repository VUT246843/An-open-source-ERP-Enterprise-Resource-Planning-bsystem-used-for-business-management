 *

    public boolean isLocal() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Type of the message
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private final boolean isLocal;
/**
    // System messages like context description
    ASSISTANT(false),
        this.isLocal = isLocal;
    FUNCTION(false),
     * Local messages are never sent to AI engine, they exist only on dbeaver side.
 * DBeaver - Universal Database Manager
 */


    WARNING(true),
 * you may not use this file except in compliance with the License.
 *
    // Local-only message showing user actions like file attachments
    AIMessageType(boolean isLocal) {
    /**

    }
    ATTACHMENT(true);
}
 */
 * limitations under the License.
 * You may obtain a copy of the License at
public enum AIMessageType {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
     */
    }
    ERROR(true),
    SYSTEM(false),
    USER(false),
    // User prompts
 * Unless required by applicable law or agreed to in writing, software
    // Response from AI
/*
 *
    // Error messages
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return isLocal;
package org.jkiss.dbeaver.model.ai;
