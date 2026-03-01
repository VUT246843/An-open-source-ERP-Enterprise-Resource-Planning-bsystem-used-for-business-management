 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.websocket.event;
}
 * You may obtain a copy of the License at
    }

    @NotNull
import org.jkiss.code.NotNull;
    public static final String ID = "cb_user_deleted";
public class WSUserDeletedEvent extends WSAbstractEvent {
import org.jkiss.dbeaver.model.websocket.WSConstants;
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
        super(ID, WSConstants.TOPIC_USER, null, userId);
    private final String deletedUserId;
    }
/*
 * limitations under the License.

 * you may not use this file except in compliance with the License.
    @NotNull
        return deletedUserId;
    public WSUserDeletedEvent(@NotNull String userId) {
    public String getDeletedUserId() {
 * Unless required by applicable law or agreed to in writing, software
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.deletedUserId = userId;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
