    public boolean needsRefreshOnFinish() {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableTrigger;
 */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
import org.jkiss.dbeaver.model.DBUtils;
        return new SQLServerToolTableTriggerSettings();

package org.jkiss.dbeaver.ext.mssql.tasks;

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

}
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
        String sql = "ALTER TABLE " + object.getTable() + " ENABLE TRIGGER " + DBUtils.getQuotedIdentifier(object);
        queries.add(new SQLDatabasePersistAction(sql));
    }
    public SQLServerToolTableTriggerSettings createToolSettings() {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.exec.DBCException;
        return true;
 * limitations under the License.

    public void generateObjectQueries(DBCSession session, SQLServerToolTableTriggerSettings settings, List<DBEPersistAction> queries, SQLServerTableTrigger object) throws DBCException {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * You may obtain a copy of the License at
public class SQLServerToolTableTriggerEnable extends SQLServerToolWithStatus<SQLServerTableTrigger, SQLServerToolTableTriggerSettings> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    @Override
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.exec.DBCSession;
