    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
    String getId();

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    @NotNull
    String getSessionId();
 * Unless required by applicable law or agreed to in writing, software
    }
        return false;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
     */
package org.jkiss.dbeaver.model.websocket.event;
}
    long getTimestamp();
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
    String getUserId();

     * flag that indicates that the event should be processed forcibly regardless of the server settings and user filters
    String getTopicId();
/*
    @Nullable
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    @Nullable
    /**

import org.jkiss.code.Nullable;
public interface WSEvent {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    default boolean isForceProcessed() {
import org.jkiss.code.NotNull;
