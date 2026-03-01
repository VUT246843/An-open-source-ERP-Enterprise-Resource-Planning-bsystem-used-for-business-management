        String sql = "CALL DBMS_MVIEW.REFRESH('" + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'," +
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
import org.jkiss.dbeaver.model.exec.DBCSession;

        if (settings.isFast()) method += "f";
        return true;

    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return new OracleToolMViewRefreshSettings();

}
        queries.add(new SQLDatabasePersistAction(sql));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCException;
 */
public class OracleToolMViewRefresh extends SQLToolExecuteHandler<OracleTableBase, OracleToolMViewRefreshSettings> {


                "'" + method + "'" +
 *
        if (settings.isRecomputed()) method += "p";
        if (settings.isForce()) method += "?";
    public void generateObjectQueries(DBCSession session, OracleToolMViewRefreshSettings settings, List<DBEPersistAction> queries, OracleTableBase object) throws DBCException {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
package org.jkiss.dbeaver.ext.oracle.tasks;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (settings.isComplete()) method += "c";
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
 * limitations under the License.
                ")";
        String method = "";
    @Override
    public boolean needsRefreshOnFinish() {
 *
 * You may obtain a copy of the License at
import java.util.List;
 * DBeaver - Universal Database Manager
    public OracleToolMViewRefreshSettings createToolSettings() {
        if (settings.isAlways()) method += "a";
    }
