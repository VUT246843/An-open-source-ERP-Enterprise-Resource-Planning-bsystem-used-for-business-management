 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        return new AltibaseToolTableTruncateSettings();
            AltibaseToolTableTruncateSettings settings,
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
 * limitations under the License.


            DBCSession session,

    @NotNull

    @Override
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
        queries.add(new SQLDatabasePersistAction(sql.toString()));
 * See the License for the specific language governing permissions and
    public AltibaseToolTableTruncateSettings createToolSettings() {
    @Override
    }
        return true;
 */
import org.jkiss.dbeaver.ext.altibase.model.AltibaseTable;
    public void generateObjectQueries(
            List<DBEPersistAction> queries,
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
 * DBeaver - Universal Database Manager

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
public class AltibaseToolTableTruncate extends SQLToolExecuteHandler<AltibaseTable, AltibaseToolTableTruncateSettings> {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    public boolean needsRefreshOnFinish() {
            AltibaseTable object) {

import java.util.List;
package org.jkiss.dbeaver.ext.altibase.tasks;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
}    }
        StringBuilder sql = new StringBuilder("TRUNCATE TABLE ").append(object.getFullyQualifiedName(DBPEvaluationContext.DDL));
