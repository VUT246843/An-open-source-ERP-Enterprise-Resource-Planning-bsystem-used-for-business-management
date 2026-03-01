        return new ExasolToolTableTruncateSettings();

        queries.add(new SQLDatabasePersistAction("TRUNCATE TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL)));
    public ExasolToolTableTruncateSettings createToolSettings() {
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
    public boolean needsRefreshOnFinish() {
    @NotNull

import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
    }
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.exasol.tasks;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
public class ExasolToolTableTruncate extends SQLToolExecuteHandler<ExasolTable, ExasolToolTableTruncateSettings> {
 * You may obtain a copy of the License at
    }

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCSession;
 */

 *
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

import java.util.List;
 *
}
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return true;
    }
 * DBeaver - Universal Database Manager
    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void generateObjectQueries(DBCSession session, ExasolToolTableTruncateSettings settings, List<DBEPersistAction> queries, ExasolTable object) {
