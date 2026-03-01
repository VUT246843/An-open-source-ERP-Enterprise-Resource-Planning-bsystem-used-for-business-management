            sql = "ALTER TABLE " + object.getTable() + " ENABLE TRIGGER " + DBUtils.getQuotedIdentifier(object);
import org.jkiss.code.NotNull;
 * limitations under the License.
        }
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTriggerBase;
        String sql;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
package org.jkiss.dbeaver.ext.postgresql.tasks;
 *
    public void generateObjectQueries(DBCSession session, PostgreToolTableTriggerSettings settings, List<DBEPersistAction> queries, PostgreTriggerBase object) {
    public boolean needsRefreshOnFinish() {

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        queries.add(new SQLDatabasePersistAction(sql));
 * distributed under the License is distributed on an "AS IS" BASIS,

            sql = "ALTER EVENT TRIGGER " + DBUtils.getQuotedIdentifier(object) + " ENABLE";
 * you may not use this file except in compliance with the License.
 *
        return true;
 */
import org.jkiss.dbeaver.ext.postgresql.model.PostgreEventTrigger;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (object instanceof PostgreEventTrigger) {
    }
public class PostgreToolTableTriggerEnable extends PostgreToolWithStatus<PostgreTriggerBase, PostgreToolTableTriggerSettings> {
}
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
    public PostgreToolTableTriggerSettings createToolSettings() {
    }
 *
/*
    }

import org.jkiss.dbeaver.model.edit.DBEPersistAction;


    @NotNull
import org.jkiss.dbeaver.model.DBUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
        } else {
import java.util.List;
        return new PostgreToolTableTriggerSettings();
 * Copyright (C) 2010-2024 DBeaver Corp and others
