        this.authInfo = authInfo;
import org.jkiss.code.NotNull;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.websocket.event.session;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
 * You may obtain a copy of the License at
    public WSAuthEvent(@NotNull SMAuthInfo authInfo) {
 *
    }
 *
/*
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.websocket.WSConstants;

 *
        return authInfo;

public class WSAuthEvent extends WSAbstractEvent {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.auth.SMAuthInfo;
    private final SMAuthInfo authInfo;
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
 * limitations under the License.
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
import org.jkiss.dbeaver.model.websocket.event.WSAbstractEvent;
 * Unless required by applicable law or agreed to in writing, software
    public SMAuthInfo getAuthInfo() {
        super("cb_session_auth", WSConstants.TOPIC_SESSION_AUTH);
 * Copyright (C) 2010-2025 DBeaver Corp and others
