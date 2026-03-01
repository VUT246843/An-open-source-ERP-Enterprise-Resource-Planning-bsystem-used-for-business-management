 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return locale;
    }
        this.lastAccessTime = lastAccessTime;
 * Unless required by applicable law or agreed to in writing, software
    private final long remainingTime;
    public boolean isCacheExpired() {
        boolean isCacheExpired,

    }
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 *

    private final long lastAccessTime;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return isCacheExpired;


 * DBeaver - Universal Database Manager
        Map<String, Object> actionParameters
    private final Map<String, Object> actionParameters;
    }
        boolean isValid,
        String locale,
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 */
package org.jkiss.dbeaver.model.websocket.event.session;
import java.util.Map;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return actionParameters;

    public Map<String, Object> getActionParameters() {
 *
        return remainingTime;
 *
    ) {

        this.isCacheExpired = isCacheExpired;
    private final String locale;
import org.jkiss.dbeaver.model.websocket.WSConstants;
        this.actionParameters = actionParameters;
    public WSSessionStateEvent(
    public long getRemainingTime() {

}
    public String getLocale() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        long remainingTime,

    public boolean isValid() {
    private final boolean isCacheExpired;
        this.locale = locale;
    }
    }

        this.remainingTime = remainingTime;
        long lastAccessTime,
        return isValid;
    private final boolean isValid;
    }
        return lastAccessTime;
 * you may not use this file except in compliance with the License.
        super("cb_session_state", WSConstants.TOPIC_SESSION);

    public long getLastAccessTime() {
        this.isValid = isValid;
public class WSSessionStateEvent extends WSAbstractSessionEvent {
