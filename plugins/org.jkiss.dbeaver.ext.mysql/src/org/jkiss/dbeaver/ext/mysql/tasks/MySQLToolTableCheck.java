        return new MySQLToolTableCheckSettings();
 * DBeaver - Universal Database Manager
    @NotNull
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Unless required by applicable law or agreed to in writing, software
        queries.add(new SQLDatabasePersistAction(sql));
        String sql = "CHECK TABLE " + object.getFullyQualifiedName(DBPEvaluationContext.DDL);
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import java.util.List;
    public MySQLToolTableCheckSettings createToolSettings() {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 *
 *
    }
}

 * you may not use this file except in compliance with the License.
        if (!CommonUtils.isEmpty(option)) sql += " " + option;
 */
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
/**


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
/*
        String option = settings.getOption();
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
    public void generateObjectQueries(DBCSession session, MySQLToolTableCheckSettings settings, List<DBEPersistAction> queries, MySQLTableBase object) {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class MySQLToolTableCheck extends MySQLToolWithStatus<MySQLTableBase, MySQLToolTableCheckSettings> {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
package org.jkiss.dbeaver.ext.mysql.tasks;
 */
 * Table check


 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
