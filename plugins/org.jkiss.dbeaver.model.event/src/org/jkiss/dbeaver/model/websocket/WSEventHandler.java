 *
 * limitations under the License.
/**
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface WSEventHandler<EVENT extends WSEvent> {
 * CB web event handlers
    /**
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager


 * See the License for the specific language governing permissions and
 *
/*
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.websocket.event.WSEvent;
package org.jkiss.dbeaver.model.websocket;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
     * Handle associated cb event
    void handleEvent(@NotNull EVENT event);
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
}

