 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 */
            List<DBEPersistAction> queries, AltibaseView object) throws DBCException {
/*
    }
 * limitations under the License.
 *
import java.util.List;

import org.jkiss.dbeaver.model.exec.DBCSession;
    public void generateObjectQueries(DBCSession session, AltibaseToolViewCompileSettings settings, 
}

 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public AltibaseToolViewCompileSettings createToolSettings() {
 * you may not use this file except in compliance with the License.
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.altibase.tasks;
    @Override
        queries.add(new SQLDatabasePersistAction(sql));
        return true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        String sql = String.format("ALTER VIEW %s COMPILE", object.getFullyQualifiedName(DBPEvaluationContext.DDL));
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    }
 *
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;

        return new AltibaseToolViewCompileSettings();
    @Override
import org.jkiss.dbeaver.ext.altibase.model.AltibaseView;
    public boolean needsRefreshOnFinish() {
import org.jkiss.dbeaver.model.exec.DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

public class AltibaseToolViewCompile extends SQLToolExecuteHandler<AltibaseView, AltibaseToolViewCompileSettings> {
