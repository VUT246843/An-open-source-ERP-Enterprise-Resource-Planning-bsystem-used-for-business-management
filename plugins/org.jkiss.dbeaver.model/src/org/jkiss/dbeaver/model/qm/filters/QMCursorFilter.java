 *
    private final QMEventFilter filter;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
    public String getSessionId() {
        return criteria;
    public QMCursorFilter(String sessionId, QMEventCriteria criteria, QMEventFilter filter) {
    }
 */
        this.criteria = criteria;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final String sessionId;
        this.sessionId = sessionId;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public QMEventCriteria getCriteria() {
    private final QMEventCriteria criteria;
    public QMEventFilter getFilter() {
 * limitations under the License.
        return filter;
        return sessionId;



import org.jkiss.dbeaver.model.qm.QMEventFilter;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

}
 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }

 *

/*
        this.filter = filter;
package org.jkiss.dbeaver.model.qm.filters;
public class QMCursorFilter {
