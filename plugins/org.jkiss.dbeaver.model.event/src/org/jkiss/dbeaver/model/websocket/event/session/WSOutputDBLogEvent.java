    private final List<WSOutputLogInfo> messages;
        return messages;
        this.contextId = contextId;



 * Licensed under the Apache License, Version 2.0 (the "License");
    public List<WSOutputLogInfo> getMessages() {
    }
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.websocket.WSConstants;
    }
 *
    }
    public long getEventTimestamp() {
        this.messages = messages;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.websocket.event.WSOutputLogInfo;
    public WSOutputDBLogEvent(String contextId,
                              List<WSOutputLogInfo> messages,
import java.util.List;
 */
 * limitations under the License.
        super("cb_database_output_log_updated", WSConstants.TOPIC_DATABASE_OUTPUT_LOG);
    private final long eventTimestamp;
    }
    public String getContextId() {
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

        this.eventTimestamp = eventTimestamp;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        return eventTimestamp;

                              long eventTimestamp) {
    private final String contextId;
package org.jkiss.dbeaver.model.websocket.event.session;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return contextId;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
}
public class WSOutputDBLogEvent extends WSAbstractSessionEvent {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
