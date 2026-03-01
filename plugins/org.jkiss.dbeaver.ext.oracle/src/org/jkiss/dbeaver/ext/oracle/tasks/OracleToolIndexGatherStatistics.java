 * Licensed under the Apache License, Version 2.0 (the "License");
        queries.add(new SQLDatabasePersistAction(sql));
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
    }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
 *
    public void generateObjectQueries(DBCSession session, OracleToolIndexGatherStatisticsSettings settings, List<DBEPersistAction> queries, OracleTableIndex object) throws DBCException {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
/*
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.


import org.jkiss.dbeaver.model.exec.DBCException;
 * You may obtain a copy of the License at
public class OracleToolIndexGatherStatistics extends SQLToolExecuteHandler<OracleTableIndex, OracleToolIndexGatherStatisticsSettings> {

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String sql = "ALTER INDEX " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPUTE STATISTICS";
}

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.oracle.tasks;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableIndex;
import java.util.List;
import org.jkiss.dbeaver.model.exec.DBCSession;
    public OracleToolIndexGatherStatisticsSettings createToolSettings() {
        return new OracleToolIndexGatherStatisticsSettings();
 *
