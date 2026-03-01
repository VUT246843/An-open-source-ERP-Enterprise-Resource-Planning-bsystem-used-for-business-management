import org.jkiss.dbeaver.model.exec.DBCException;
    @NotNull


 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return new DB2ReorgIndexToolSettings();
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        queries.add(new SQLDatabasePersistAction(sql));
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
        String sql = "CALL SYSPROC.ADMIN_CMD(" + getLineSeparator() +
public class DB2ReorgIndexTool extends DB2ToolWithStatus<DB2TableBase, DB2ReorgIndexToolSettings>{
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                settings.getTableAccess() + settings.getCleanupOption() +

 * DBeaver - Universal Database Manager
    public void generateObjectQueries(DBCSession session, DB2ReorgIndexToolSettings settings, List<DBEPersistAction> queries, DB2TableBase object) throws DBCException {
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
/*
 *
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

    public DB2ReorgIndexToolSettings createToolSettings() {
                "')";

import static org.jkiss.utils.CommonUtils.getLineSeparator;
}
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.db2.tasks;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * limitations under the License.

    @Override
 */
                "'REORG INDEXES ALL FOR TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) +
 * See the License for the specific language governing permissions and
