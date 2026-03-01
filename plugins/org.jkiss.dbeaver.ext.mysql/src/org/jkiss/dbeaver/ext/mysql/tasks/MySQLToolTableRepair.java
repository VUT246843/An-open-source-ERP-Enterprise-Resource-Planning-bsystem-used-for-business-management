package org.jkiss.dbeaver.ext.mysql.tasks;
        boolean isQuick = settings.isQuick();
        if (isExtended) sql += " EXTENDED";
 *
 * DBeaver - Universal Database Manager
        queries.add(new SQLDatabasePersistAction(sql));
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
}
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public MySQLToolTableRepairSettings createToolSettings() {
        if (useFRM) sql += " USE_FRM";
    }

import org.jkiss.dbeaver.model.exec.DBCSession;
 * you may not use this file except in compliance with the License.
 *
    @Override
        boolean useFRM = settings.isUseFRM();

        String sql = "REPAIR TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL);
 * See the License for the specific language governing permissions and
/*
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return new MySQLToolTableRepairSettings();
import org.jkiss.dbeaver.model.exec.DBCException;
public class MySQLToolTableRepair extends MySQLToolWithStatus<MySQLTableBase, MySQLToolTableRepairSettings> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    @Override
import java.util.List;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        if (isQuick) sql += " QUICK";

 * distributed under the License is distributed on an "AS IS" BASIS,
        boolean isExtended = settings.isExtended();
import org.jkiss.code.NotNull;
    public void generateObjectQueries(DBCSession session, MySQLToolTableRepairSettings settings, List<DBEPersistAction> queries, MySQLTableBase object) throws DBCException {
    @NotNull
 * limitations under the License.
    }
