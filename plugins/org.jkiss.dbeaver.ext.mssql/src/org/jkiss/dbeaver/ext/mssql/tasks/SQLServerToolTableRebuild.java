 * DBeaver - Universal Database Manager
 */
 *
    public void generateObjectQueries(DBCSession session, SQLServerToolTableRebuildSettings settings, List<DBEPersistAction> queries, SQLServerTableBase object) throws DBCException {

 * You may obtain a copy of the License at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableBase;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        queries.add(new SQLDatabasePersistAction("ALTER INDEX ALL ON " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " REBUILD "));
 * See the License for the specific language governing permissions and
        return new SQLServerToolTableRebuildSettings();
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
    }
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
}
    @Override
    }
package org.jkiss.dbeaver.ext.mssql.tasks;
 * Copyright (C) 2010-2024 DBeaver Corp and others

public class SQLServerToolTableRebuild extends SQLServerToolWithStatus<SQLServerTableBase, SQLServerToolTableRebuildSettings> {
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    public SQLServerToolTableRebuildSettings createToolSettings() {
