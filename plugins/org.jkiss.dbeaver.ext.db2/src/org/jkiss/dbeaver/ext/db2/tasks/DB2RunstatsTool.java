 *
        return new DB2RunstatsToolSettings();
    }
        }
public class DB2RunstatsTool extends DB2ToolWithStatus<DB2TableBase, DB2RunstatsToolSettings>{
import static org.jkiss.utils.CommonUtils.getLineSeparator;
        String sql = "CALL SYSPROC.ADMIN_CMD('"; //$NON-NLS-1$
import org.jkiss.code.NotNull;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (settings.isTableSampling()) {

    @NotNull
        sql += "RUNSTATS ON TABLE "; //$NON-NLS-1$
    }
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 */
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * You may obtain a copy of the License at
    @Override

        }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCException;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
}
        sql += getLineSeparator();
        sql += "')"; //$NON-NLS-1$

import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
    public DB2RunstatsToolSettings createToolSettings() {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.db2.tasks;
import java.util.List;
        sql += DB2RunstatsOptions.getOption(settings.getColumnStat()).getDdlString();
        sql += object.getFullyQualifiedName(DBPEvaluationContext.DDL);

        if (!DB2RunstatsOptions.getOption(settings.getIndexStat()).getDdlString().equals("")) { //$NON-NLS-1$
 * limitations under the License.
        queries.add(new SQLDatabasePersistAction(sql));
            sql += String.format(" TABLESAMPLE SYSTEM(%d)", settings.getSamplePercent()); //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
            sql += " " + DB2RunstatsOptions.getOption(settings.getIndexStat()).getDdlString(); //$NON-NLS-1$
    public void generateObjectQueries(DBCSession session, DB2RunstatsToolSettings settings, List<DBEPersistAction> queries, DB2TableBase object) throws DBCException {
