 * You may obtain a copy of the License at
    public boolean needsRefreshOnFinish() {

    public AltibaseToolReplicationStartSettings createToolSettings() {
import org.jkiss.dbeaver.ext.altibase.model.AltibaseReplication;
/*
import org.jkiss.dbeaver.model.exec.DBCException;
    }
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 *
            List<DBEPersistAction> queries, AltibaseReplication object) throws DBCException {

 * limitations under the License.
import java.util.List;

    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCSession;


 * See the License for the specific language governing permissions and
        return true;
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
        String sql = String.format(AltibaseConstants.ALTER_REPL_PREFIX + " %s START", object.getName());
}
        queries.add(new SQLDatabasePersistAction(sql));
 *
package org.jkiss.dbeaver.ext.altibase.tasks;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
public class AltibaseToolReplicationStart extends SQLToolExecuteHandler<AltibaseReplication, AltibaseToolReplicationStartSettings> {
 * Unless required by applicable law or agreed to in writing, software

    @Override
 *
    public void generateObjectQueries(DBCSession session, AltibaseToolReplicationStartSettings settings, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 */
        return new AltibaseToolReplicationStartSettings();
