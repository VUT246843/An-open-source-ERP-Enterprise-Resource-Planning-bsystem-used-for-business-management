
        String sql = "";
import org.jkiss.dbeaver.model.exec.DBCException;
            queries.add(new SQLDatabasePersistAction("Disable foreign key checks", "SET FOREIGN_KEY_CHECKS = 0", DBEPersistAction.ActionType.INITIALIZER));
    @NotNull

public class MySQLToolTableTruncate extends MySQLToolWithStatus<MySQLTableBase, MySQLToolTableTruncateSettings> {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
    @Override
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isNeedConfirmation() {
 * Unless required by applicable law or agreed to in writing, software
        return new MySQLToolTableTruncateSettings();

    }

import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
        }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
}
    @Override
    }
        queries.add(new SQLDatabasePersistAction(sql));
 *
package org.jkiss.dbeaver.ext.mysql.tasks;
    }
    public boolean needsRefreshOnFinish() {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

            queries.add(new SQLDatabasePersistAction("Enable foreign key checks", "SET FOREIGN_KEY_CHECKS = 1", DBEPersistAction.ActionType.FINALIZER));
 * limitations under the License.
 *
    public MySQLToolTableTruncateSettings createToolSettings() {
    public void generateObjectQueries(DBCSession session, MySQLToolTableTruncateSettings settings, List<DBEPersistAction> queries, MySQLTableBase object) throws DBCException {
 *
        if (force) {
        return true;
 */
        }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        boolean force = settings.isForce();
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (force) {
import java.util.List;
        sql += "TRUNCATE TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
import org.jkiss.code.NotNull;
        return true;
