 * distributed under the License is distributed on an "AS IS" BASIS,
            List<DBEPersistAction> queries, AltibaseReplication object) throws DBCException {
        return true;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        queries.add(new SQLDatabasePersistAction(sql));
 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

    }
    public boolean needsRefreshOnFinish() {
import org.jkiss.dbeaver.model.exec.DBCException;
        String sql = String.format(AltibaseConstants.ALTER_REPL_PREFIX + " %s STOP", object.getName());
import java.util.List;
    public AltibaseToolReplicationStopSettings createToolSettings() {
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
import org.jkiss.dbeaver.ext.altibase.model.AltibaseReplication;
 *
 * limitations under the License.
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }


 * Copyright (C) 2010-2024 DBeaver Corp and others
public class AltibaseToolReplicationStop extends SQLToolExecuteHandler<AltibaseReplication, AltibaseToolReplicationStopSettings> {
        return new AltibaseToolReplicationStopSettings();
 * DBeaver - Universal Database Manager
    @Override
 *
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;

    public void generateObjectQueries(DBCSession session, AltibaseToolReplicationStopSettings settings, 
 * Unless required by applicable law or agreed to in writing, software
    @Override

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
 * you may not use this file except in compliance with the License.
}
package org.jkiss.dbeaver.ext.altibase.tasks;
/*
