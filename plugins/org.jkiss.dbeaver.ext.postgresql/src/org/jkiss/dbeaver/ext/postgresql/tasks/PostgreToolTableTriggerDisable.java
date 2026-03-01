
 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    public void generateObjectQueries(DBCSession session, PostgreToolTableTriggerSettings settings, List<DBEPersistAction> queries, PostgreTriggerBase object) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        return true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreEventTrigger;
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * DBeaver - Universal Database Manager
/*
        } else {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.DBUtils;
        queries.add(new SQLDatabasePersistAction(sql));
        return new PostgreToolTableTriggerSettings();
    }

    }
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
public class PostgreToolTableTriggerDisable extends PostgreToolWithStatus<PostgreTriggerBase, PostgreToolTableTriggerSettings> {

        }
import org.jkiss.dbeaver.model.exec.DBCSession;
package org.jkiss.dbeaver.ext.postgresql.tasks;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTriggerBase;
        if (object instanceof PostgreEventTrigger) {
}
    public PostgreToolTableTriggerSettings createToolSettings() {
 *

    @Override
 * You may obtain a copy of the License at
            sql = "ALTER TABLE " + object.getTable() + " DISABLE TRIGGER " + DBUtils.getQuotedIdentifier(object);

 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    }
            sql = "ALTER EVENT TRIGGER " + DBUtils.getQuotedIdentifier(object) + " DISABLE";
        String sql;
    public boolean needsRefreshOnFinish() {
import java.util.List;
