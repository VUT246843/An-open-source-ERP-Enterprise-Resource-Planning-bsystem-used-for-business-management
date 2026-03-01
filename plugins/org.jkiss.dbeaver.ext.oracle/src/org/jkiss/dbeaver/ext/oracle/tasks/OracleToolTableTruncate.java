 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
                .append(partition.getParent().getFullyQualifiedName(DBPEvaluationContext.DDL))
 *

 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.oracle.tasks;
            OracleTablePartition partition = (OracleTablePartition) object;
        StringBuilder sql = new StringBuilder(32);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                sql.append("SUB");
        }
 */
 * You may obtain a copy of the License at
    @Override
        return true;
import org.jkiss.dbeaver.ext.oracle.model.OracleTablePartition;
/*
    @Override
public class OracleToolTableTruncate extends SQLToolExecuteHandler<OracleTableBase, OracleToolTableTruncateSettings> {

    @NotNull
        OracleTableBase object
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                .append(" TRUNCATE ");
    public OracleToolTableTruncateSettings createToolSettings() {
        }
            sql.append("PARTITION ")
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;

        List<DBEPersistAction> queries,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.DBUtils;
        } else {
            sql.append("ALTER TABLE ")
}
    }
        if (settings.isReusable()) {
        queries.add(new SQLDatabasePersistAction(sql.toString()));
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
        if (object instanceof OracleTablePartition) {
 * See the License for the specific language governing permissions and
        OracleToolTableTruncateSettings settings,
    public boolean needsRefreshOnFinish() {
    public void generateObjectQueries(
    }
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
    ) {
 * limitations under the License.
 *

import java.util.List;
        return new OracleToolTableTruncateSettings();
            sql.append("TRUNCATE TABLE ").append(object.getFullyQualifiedName(DBPEvaluationContext.DDL));

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.exec.DBCSession;
        DBCSession session,
                .append(DBUtils.getQuotedIdentifier(object));
            if (partition.isSubPartition()) {
            sql.append(" REUSE STORAGE");
