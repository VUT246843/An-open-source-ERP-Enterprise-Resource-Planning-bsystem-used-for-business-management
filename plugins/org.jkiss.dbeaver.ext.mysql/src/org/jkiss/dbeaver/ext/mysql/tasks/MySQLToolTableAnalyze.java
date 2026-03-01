 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
import java.util.List;
    }
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
    public void generateObjectQueries(DBCSession session, MySQLToolTableAnalyzeSettings settings, List<DBEPersistAction> queries, MySQLTableBase object) throws DBCException {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 *
 *
        return new MySQLToolTableAnalyzeSettings();

 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
public class MySQLToolTableAnalyze extends MySQLToolWithStatus<MySQLTableBase, MySQLToolTableAnalyzeSettings> {
 * limitations under the License.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCException;
        queries.add(new SQLDatabasePersistAction(sql));
    @NotNull

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        String sql = "ANALYZE TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL);
 */
    @Override
    @Override
    }

    public MySQLToolTableAnalyzeSettings createToolSettings() {
package org.jkiss.dbeaver.ext.mysql.tasks;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
}
