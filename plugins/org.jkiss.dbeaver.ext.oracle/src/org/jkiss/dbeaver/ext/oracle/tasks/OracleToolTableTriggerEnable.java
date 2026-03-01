    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        queries.add(new SQLDatabasePersistAction(sql));
        String sql = "ALTER TRIGGER " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " ENABLE";
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    public boolean needsRefreshOnFinish() {
    }
        return true;
    @NotNull
}


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager

    @Override
 */
/*
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableTrigger;
    public OracleToolTableTriggerSettings createToolSettings() {
 *
public class OracleToolTableTriggerEnable extends SQLToolExecuteHandler<OracleTableTrigger, OracleToolTableTriggerSettings> {

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        return new OracleToolTableTriggerSettings();


 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.oracle.tasks;
    public void generateObjectQueries(DBCSession session, OracleToolTableTriggerSettings settings, List<DBEPersistAction> queries, OracleTableTrigger object) throws DBCException {
    }
 * limitations under the License.

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
