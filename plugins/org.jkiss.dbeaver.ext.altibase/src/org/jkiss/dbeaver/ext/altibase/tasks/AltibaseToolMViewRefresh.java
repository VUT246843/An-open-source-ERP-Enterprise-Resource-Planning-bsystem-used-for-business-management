import org.jkiss.dbeaver.model.exec.DBCException;
 * DBeaver - Universal Database Manager
                DBUtils.getQuotedIdentifier(object.getDataSource(), object.getSchemaName()),
        return new AltibaseToolMViewRefreshSettings();
    }
 */
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
 * See the License for the specific language governing permissions and
        return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
                DBUtils.getQuotedIdentifier(object.getDataSource(), object.getName()));
import org.jkiss.dbeaver.ext.altibase.model.AltibaseMaterializedView;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
public class AltibaseToolMViewRefresh extends SQLToolExecuteHandler<AltibaseMaterializedView, AltibaseToolMViewRefreshSettings> {
 * limitations under the License.
    public AltibaseToolMViewRefreshSettings createToolSettings() {
        queries.add(new SQLDatabasePersistAction(sql));
 *
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean needsRefreshOnFinish() {
 *
    }
            List<DBEPersistAction> queries, AltibaseMaterializedView object) throws DBCException {

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

package org.jkiss.dbeaver.ext.altibase.tasks;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.DBUtils;
    @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Unless required by applicable law or agreed to in writing, software
    @Override
import java.util.List;
        String sql = String.format("EXEC SYSTEM_.REFRESH_MATERIALIZED_VIEW('%s', '%s')", 


 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
}
    public void generateObjectQueries(DBCSession session, AltibaseToolMViewRefreshSettings settings, 
