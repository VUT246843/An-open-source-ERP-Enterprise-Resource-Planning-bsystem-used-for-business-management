 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.qm.meta.QMMObject;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *
    public QMMetaEvent(
    public QMMObject getObject() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return timestamp;
 * QM meta event
    protected final QMMObject object;

 */
        QMEventAction action,
/**
    }
/*
    protected final QMEventAction action;

    protected String sessionId;
    }
        QMMObject object,
 *

public class QMMetaEvent implements QMEvent {
    public void setSessionId(String sessionId) {
    public String getSessionId() {
    }
        return action + " " + object;
        this.sessionId = sessionId;

package org.jkiss.dbeaver.model.qm;
 * DBeaver - Universal Database Manager

    }
 * Unless required by applicable law or agreed to in writing, software
}
    public String toString() {
    }

    @Override
        this.sessionId = sessionId;
        String sessionId
        this.action = action;
        this.timestamp = timestamp;

    protected final long timestamp;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *

        long timestamp,
        return object;
        this.object = object;
    ) {
        return action;

    public long getTimestamp() {
        return sessionId;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    public QMEventAction getAction() {
 * limitations under the License.
