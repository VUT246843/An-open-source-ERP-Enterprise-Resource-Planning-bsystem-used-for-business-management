            List<DBEPersistAction> queries, AltibaseProcedureStandAlone object) throws DBCException {

        return new AltibaseToolProcedureCompileSettings();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCSession;
 * You may obtain a copy of the License at
        queries.add(new SQLDatabasePersistAction(sql));
 * limitations under the License.
    public AltibaseToolProcedureCompileSettings createToolSettings() {
}
/*

 *
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean needsRefreshOnFinish() {

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        String sql = String.format("ALTER %s %s COMPILE", objType, object.getFullyQualifiedName(DBPEvaluationContext.DDL));
 */
package org.jkiss.dbeaver.ext.altibase.tasks;
 *
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    }
        return true;
import org.jkiss.dbeaver.ext.altibase.model.AltibaseProcedureStandAlone;
 * you may not use this file except in compliance with the License.
    }
    }
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
    @Override


import java.util.List;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        String objType = object.getProcedureTypeName();
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
    public void generateObjectQueries(DBCSession session, AltibaseToolProcedureCompileSettings settings, 
public class AltibaseToolProcedureCompile extends SQLToolExecuteHandler<AltibaseProcedureStandAlone, AltibaseToolProcedureCompileSettings> {

 * distributed under the License is distributed on an "AS IS" BASIS,
