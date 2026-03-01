import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void generateObjectQueries(DBCSession session, OracleToolTableValidateStructureSettings settings, List<DBEPersistAction> queries, OracleTableBase object) throws DBCException {


    }
/*
 * DBeaver - Universal Database Manager


import org.jkiss.dbeaver.model.exec.DBCSession;
        if (!CommonUtils.isEmpty(option)) sql += " " + option;
}
    @Override
        queries.add(new SQLDatabasePersistAction(sql));
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
    }
 *
        String sql = "ANALYZE TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " VALIDATE STRUCTURE";
        String option = settings.getOption();
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ext.oracle.tasks;
        return new OracleToolTableValidateStructureSettings();
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *
    @Override
public class OracleToolTableValidateStructure extends SQLToolExecuteHandler<OracleTableBase, OracleToolTableValidateStructureSettings> {
import java.util.List;
import org.jkiss.utils.CommonUtils;
    public OracleToolTableValidateStructureSettings createToolSettings() {
 *
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
