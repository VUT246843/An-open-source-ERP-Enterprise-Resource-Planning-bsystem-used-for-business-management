 *
package org.jkiss.dbeaver.ext.postgresql.tasks;
    }
 * Unless required by applicable law or agreed to in writing, software
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
 * See the License for the specific language governing permissions and
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;
 * you may not use this file except in compliance with the License.
    @Override
            PostgreTableBase postObject = (PostgreTableBase) object;
        String sql = "ANALYZE VERBOSE";
 *     http://www.apache.org/licenses/LICENSE-2.0
public class PostgreToolBaseAnalyze extends PostgreToolWithStatus<DBSObject, PostgreToolBaseAnalyzeSettings> {
import org.jkiss.dbeaver.model.exec.DBCSession;
    public PostgreToolBaseAnalyzeSettings createToolSettings() {

}
    @NotNull
    @Override
 */
 * limitations under the License.
        queries.add(new SQLDatabasePersistAction(sql));
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * You may obtain a copy of the License at
    public void generateObjectQueries(DBCSession session, PostgreToolBaseAnalyzeSettings settings, List<DBEPersistAction> queries, DBSObject object) throws DBCException {
import org.jkiss.dbeaver.model.struct.DBSObject;
            sql += " " + postObject.getFullyQualifiedName(DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        return new PostgreToolBaseAnalyzeSettings();
 * Licensed under the Apache License, Version 2.0 (the "License");
        if(object instanceof PostgreTableBase){
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/*
 *
