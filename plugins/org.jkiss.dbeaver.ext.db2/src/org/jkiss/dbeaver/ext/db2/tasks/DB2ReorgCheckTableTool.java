        String sql = "CALL SYSPROC.REORGCHK_TB_STATS('T','"; //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
    }
    public void generateObjectQueries(DBCSession session, DB2ReorgCheckTableToolSettings settings, List<DBEPersistAction> queries, DB2TableBase object) throws DBCException {
public class DB2ReorgCheckTableTool extends DB2ToolWithStatus<DB2TableBase, DB2ReorgCheckTableToolSettings>{
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.db2.tasks;
 */


        sql += "')"; //$NON-NLS-1$
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.code.NotNull;
    @NotNull
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        sql += object.getFullyQualifiedName(DBPEvaluationContext.DDL);

import org.jkiss.dbeaver.model.exec.DBCException;
 *
    public DB2ReorgCheckTableToolSettings createToolSettings() {
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import java.util.List;
 * DBeaver - Universal Database Manager
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
}
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
        queries.add(new SQLDatabasePersistAction(sql));
import org.jkiss.dbeaver.model.exec.DBCSession;
        return new DB2ReorgCheckTableToolSettings();

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
