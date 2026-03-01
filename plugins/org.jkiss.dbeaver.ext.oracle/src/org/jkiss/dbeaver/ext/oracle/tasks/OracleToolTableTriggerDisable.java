
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        String sql = "ALTER TRIGGER " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " DISABLE";
 * Unless required by applicable law or agreed to in writing, software
 *
/*
    }
package org.jkiss.dbeaver.ext.oracle.tasks;
import org.jkiss.dbeaver.model.exec.DBCException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
import org.jkiss.dbeaver.ext.oracle.model.OracleTableTrigger;
    }
    public OracleToolTableTriggerSettings createToolSettings() {

 * limitations under the License.
 *
 */
        return true;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
    public boolean needsRefreshOnFinish() {
}
        return new OracleToolTableTriggerSettings();
 * DBeaver - Universal Database Manager
    @NotNull
 * See the License for the specific language governing permissions and
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0

        queries.add(new SQLDatabasePersistAction(sql));

import org.jkiss.code.NotNull;
    @Override
public class OracleToolTableTriggerDisable extends SQLToolExecuteHandler<OracleTableTrigger, OracleToolTableTriggerSettings> {
import java.util.List;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCSession;
    public void generateObjectQueries(DBCSession session, OracleToolTableTriggerSettings settings, List<DBEPersistAction> queries, OracleTableTrigger object) throws DBCException {
 * Copyright (C) 2010-2024 DBeaver Corp and others

