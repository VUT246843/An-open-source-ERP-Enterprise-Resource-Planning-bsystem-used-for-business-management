import org.jkiss.code.NotNull;
    public void generateObjectQueries(DBCSession session, MySQLToolTableOptimizeSettings settings, List<DBEPersistAction> queries, MySQLTableBase object) throws DBCException {
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull


 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;
public class MySQLToolTableOptimize extends MySQLToolWithStatus<MySQLTableBase, MySQLToolTableOptimizeSettings> {
        String sql = "OPTIMIZE TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL);
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.mysql.tasks;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return new MySQLToolTableOptimizeSettings();
    @Override
    }
 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;


 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * DBeaver - Universal Database Manager
        queries.add(new SQLDatabasePersistAction(sql));
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
import java.util.List;
    public MySQLToolTableOptimizeSettings createToolSettings() {
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
 *
/*
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
