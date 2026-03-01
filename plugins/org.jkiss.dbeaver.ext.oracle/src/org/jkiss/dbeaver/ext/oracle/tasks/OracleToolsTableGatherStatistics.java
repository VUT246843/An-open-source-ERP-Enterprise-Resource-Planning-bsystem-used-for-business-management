    @Override
 *
import org.jkiss.dbeaver.ext.oracle.model.OracleTable;
 *
 * You may obtain a copy of the License at

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            if (percent > 0) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            int percent = settings.getSamplePercent();
 * you may not use this file except in compliance with the License.
 */
            sql += " \n );\n END;";
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
}
                    " DBMS_STATS.GATHER_TABLE_STATS (\n" +
public class OracleToolsTableGatherStatistics extends SQLToolExecuteHandler<DBSObject, OracleToolTableGatherStatisticsSettings> {
 *
            }
            OracleTable table = (OracleTable)object;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * See the License for the specific language governing permissions and
    @Override
            queries.add(new SQLDatabasePersistAction(sql));
 */
/*
import java.util.List;

        if (object instanceof OracleTable) {
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
            String sql = "BEGIN \n" +
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.oracle.tasks;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public OracleToolTableGatherStatisticsSettings createToolSettings() {

                    " OWNNAME => '" + DBUtils.getQuotedIdentifier(table.getSchema()) + "',\n" +
    public void generateObjectQueries(DBCSession session, OracleToolTableGatherStatisticsSettings settings, List<DBEPersistAction> queries, DBSObject object) throws DBCException {
        return new OracleToolTableGatherStatisticsSettings();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
/*
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
                sql += ",\n estimate_percent => " + percent;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCException;
                    " TABNAME => '" + DBUtils.getQuotedIdentifier(table) + "'";
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
import org.jkiss.dbeaver.model.exec.DBCSession;
