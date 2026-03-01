    }
 * You may obtain a copy of the License at

        queries.add(new SQLDatabasePersistAction(sql));
import org.jkiss.dbeaver.model.exec.DBCException;
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
package org.jkiss.dbeaver.ext.db2.tasks;
    public void generateObjectQueries(DBCSession session, DB2ToolTableTruncateSettings settings, List<DBEPersistAction> queries, DB2TableBase object) throws DBCException {
/*
import org.jkiss.dbeaver.model.exec.DBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

        sql += " " + DB2TableTruncateOptions.getOption(settings.getTriggerOption()).getDdlString(); //$NON-NLS-1$
 * DBeaver - Universal Database Manager
    public boolean needsRefreshOnFinish() {
        sql += getLineSeparator() + "CONTINUE IDENTITY IMMEDIATE"; //$NON-NLS-1$
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
        return new DB2ToolTableTruncateSettings();
        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        sql += " " + DB2TableTruncateOptions.getOption(settings.getStorageOption()).getDdlString(); //$NON-NLS-1$

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 */
    @Override

public class DB2ToolTableTruncate extends DB2ToolWithStatus<DB2TableBase, DB2ToolTableTruncateSettings>{
import org.jkiss.code.NotNull;
import static org.jkiss.utils.CommonUtils.getLineSeparator;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Unless required by applicable law or agreed to in writing, software
        sql += " " + object.getFullyQualifiedName(DBPEvaluationContext.DDL); //$NON-NLS-1$
}


    public DB2ToolTableTruncateSettings createToolSettings() {
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
        String sql = "TRUNCATE TABLE"; //$NON-NLS-1$
