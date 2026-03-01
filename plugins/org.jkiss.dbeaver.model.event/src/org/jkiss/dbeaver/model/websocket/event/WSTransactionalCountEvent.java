        @NotNull String projectId,
        @NotNull String contextId,
        @Nullable String sessionId,
 * limitations under the License.

    ) {
        int transactionalCount
 */
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

 *
        @NotNull String connectionId,
 * you may not use this file except in compliance with the License.
 *
    }
    public WSTransactionalCountEvent(
    private final String connectionId;

 * See the License for the specific language governing permissions and
        this.contextId = contextId;
public class WSTransactionalCountEvent extends WSProjectResourceEvent {
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
        super("cb_transaction_count", WSConstants.TOPIC_TRANSACTION_COUNT, sessionId, userId, projectId);
}
        this.transactionalCount = transactionalCount;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
package org.jkiss.dbeaver.model.websocket.event;
import org.jkiss.dbeaver.model.websocket.WSConstants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        this.connectionId = connectionId;
    private final String contextId;

        @Nullable String userId,
    private final int transactionalCount;
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
