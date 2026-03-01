 * Unless required by applicable law or agreed to in writing, software

    }
    {
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
        String fullyQualifiedName = db2View.getFullyQualifiedName(DBPEvaluationContext.DDL);
public class DB2MQTManager extends DB2AbstractDropOnlyManager<DB2MaterializedQueryTable, DB2Schema> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
/**
 */
    {
 */
 * DB2 MQT Manager

 *
    @Nullable
/*


    public String buildDropStatement(DB2MaterializedQueryTable db2View)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author Denis Forveille
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.db2.manager;
        return db2MQT.getSchema().getMaterializedQueryTableCache();
import org.jkiss.code.Nullable;
    private static final String SQL_DROP = "DROP TABLE %s";
import org.jkiss.dbeaver.ext.db2.model.DB2MaterializedQueryTable;
        return String.format(SQL_DROP, fullyQualifiedName);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

    @Override
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * limitations under the License.
    }
 *
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObjectCache<DB2Schema, DB2MaterializedQueryTable> getObjectsCache(DB2MaterializedQueryTable db2MQT)
}
