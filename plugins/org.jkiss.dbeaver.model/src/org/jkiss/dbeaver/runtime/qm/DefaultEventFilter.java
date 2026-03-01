import org.jkiss.dbeaver.model.qm.QMEventFilter;
    public DefaultEventFilter()
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.runtime.qm;
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Default event filter based on preference settings.
        } else if (object instanceof QMMTransactionInfo || object instanceof QMMTransactionSavepointInfo) {

 * limitations under the License.
            return eventCriteria.hasObjectType(QMObjectType.query) &&
/*

import org.jkiss.dbeaver.runtime.DBWorkbench;
    {
 *
 * Unless required by applicable law or agreed to in writing, software
 *
                eventCriteria.hasQueryType(((QMMStatementExecuteInfo) object).getStatement().getPurpose());
 */
        } else if (object instanceof QMMConnectionInfo) {
/**
            return eventCriteria.hasObjectType(QMObjectType.txn);
 */
        }

 * See the License for the specific language governing permissions and
    }
        eventCriteria = QMUtils.createDefaultCriteria(DBWorkbench.getPlatform().getPreferenceStore());
 * Licensed under the Apache License, Version 2.0 (the "License");
public class DefaultEventFilter implements QMEventFilter {
    public void reloadPreferences()
 *
    {
    public boolean accept(QMEvent event) {
import org.jkiss.dbeaver.model.qm.meta.*;
import org.jkiss.dbeaver.model.qm.QMObjectType;
    }
        QMMObject object = event.getObject();
    }
            return eventCriteria.hasObjectType(QMObjectType.session);

        if (object instanceof QMMStatementExecuteInfo) {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.model.qm.QMUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.qm.filters.QMEventCriteria;
    private QMEventCriteria eventCriteria = new QMEventCriteria();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        return true;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.qm.QMEvent;
        reloadPreferences();
