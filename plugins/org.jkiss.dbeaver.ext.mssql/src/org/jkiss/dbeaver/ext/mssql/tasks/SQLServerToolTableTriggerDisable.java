 *
package org.jkiss.dbeaver.ext.mssql.tasks;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public SQLServerToolTableTriggerSettings createToolSettings() {
}

    public boolean needsRefreshOnFinish() {
    }
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * limitations under the License.

        String sql = "ALTER TABLE " + object.getTable() + " DISABLE TRIGGER " + DBUtils.getQuotedIdentifier(object);
        return new SQLServerToolTableTriggerSettings();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *
    }
    @Override
        queries.add(new SQLDatabasePersistAction(sql));
/*

 * See the License for the specific language governing permissions and
    public void generateObjectQueries(DBCSession session, SQLServerToolTableTriggerSettings settings, List<DBEPersistAction> queries, SQLServerTableTrigger object) throws DBCException {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableTrigger;
        return true;
public class SQLServerToolTableTriggerDisable extends SQLServerToolWithStatus<SQLServerTableTrigger, SQLServerToolTableTriggerSettings> {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
import java.util.List;


