    private final String sessionId;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return criteria;
 *
    }
public class QMAdminCursorFilter {

        this.criteria = new QMAdminEventCriteria(cursorFilter.getCriteria(), userNames, Collections.emptySet());
        this.sessionId = sessionId;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2026 DBeaver Corp and others

import org.jkiss.dbeaver.model.qm.QMEventFilter;
 * You may obtain a copy of the License at
        return filter;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        this.criteria = criteria;
 * you may not use this file except in compliance with the License.

        this.sessionId = cursorFilter.getSessionId();
}


    }
    public String getSessionId() {
 *

    private final QMEventFilter filter;
        return sessionId;
 * See the License for the specific language governing permissions and
 * limitations under the License.
/*
    }
 * Unless required by applicable law or agreed to in writing, software
    private final QMAdminEventCriteria criteria;
    public QMAdminCursorFilter(QMCursorFilter cursorFilter, Set<String> userNames) {
import java.util.Collections;
package org.jkiss.dbeaver.model.qm.filters;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    public QMAdminCursorFilter(String sessionId, QMAdminEventCriteria criteria, QMEventFilter filter) {
        this.filter = filter;
    }
        this.filter = cursorFilter.getFilter();
    public QMAdminEventCriteria getAdminCriteria() {
 *

import java.util.Set;
    public QMEventFilter getFilter() {
 *     http://www.apache.org/licenses/LICENSE-2.0
