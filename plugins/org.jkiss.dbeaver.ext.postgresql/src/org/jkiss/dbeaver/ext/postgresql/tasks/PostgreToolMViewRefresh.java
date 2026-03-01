 *
    }
 *
    @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreMaterializedView;
    public void generateObjectQueries(DBCSession session, PostgreToolMViewRefreshSettings settings, List<DBEPersistAction> queries, PostgreMaterializedView object) throws DBCException {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean isWithData = settings.isWithData();
import org.jkiss.dbeaver.model.exec.DBCException;
import java.util.List;
import org.jkiss.dbeaver.model.exec.DBCSession;
/*
        else {
        return new PostgreToolMViewRefreshSettings();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public PostgreToolMViewRefreshSettings createToolSettings() {
package org.jkiss.dbeaver.ext.postgresql.tasks;
    }
 * See the License for the specific language governing permissions and
        }

    @NotNull
        queries.add(new SQLDatabasePersistAction(sql));
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * Unless required by applicable law or agreed to in writing, software
        }
}
        if (isWithData) {

public class PostgreToolMViewRefresh extends PostgreToolWithStatus<PostgreMaterializedView, PostgreToolMViewRefreshSettings>  {
 */
            sql += "WITH DATA";
        String sql = "REFRESH MATERIALIZED VIEW " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " ";
            sql += "WITH NO DATA";
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;


