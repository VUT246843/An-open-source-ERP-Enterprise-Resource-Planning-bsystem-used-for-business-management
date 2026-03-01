 * @author Denis Forveille
 * You may obtain a copy of the License at
 * DB2 Data Type Manager
    {
/*
 *
package org.jkiss.dbeaver.ext.db2.manager;
/**
}
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

    public DBSObjectCache<DB2Schema, DB2DataType> getObjectsCache(DB2DataType db2DataType)
    public String buildDropStatement(DB2DataType db2DataType)
 * DBeaver - Universal Database Manager
    }
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.db2.model.DB2DataType;

 *
 */
    {
        return db2DataType.getSchema().getUdtCache();
        String fullyQualifiedName = db2DataType.getFullyQualifiedName(DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 * Licensed under the Apache License, Version 2.0 (the "License");
public class DB2DataTypeManager extends DB2AbstractDropOnlyManager<DB2DataType, DB2Schema> {
    @Override
    private static final String SQL_DROP = "DROP TYPE %s RESTRICT";
        return String.format(SQL_DROP, fullyQualifiedName);
    }
 * 

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

 *
    @Nullable
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.code.Nullable;
    @Override
 * Unless required by applicable law or agreed to in writing, software
