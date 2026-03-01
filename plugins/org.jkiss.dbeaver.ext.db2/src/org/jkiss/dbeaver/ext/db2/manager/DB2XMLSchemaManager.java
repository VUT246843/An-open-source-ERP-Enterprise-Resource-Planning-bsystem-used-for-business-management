import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 * @author Denis Forveille
    {
    }
        return String.format(SQL_DROP, fullyQualifiedName);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * DB2 XML Schema Manager
 * DBeaver - Universal Database Manager
 */
    public DBSObjectCache<DB2Schema, DB2XMLSchema> getObjectsCache(DB2XMLSchema db2XMLSchema)
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        return db2XMLSchema.getSchema().getXmlSchemaCache();
package org.jkiss.dbeaver.ext.db2.manager;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
 * 
 * See the License for the specific language governing permissions and

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
/*
 */
    }
        String fullyQualifiedName = db2XMLSchema.getFullyQualifiedName(DBPEvaluationContext.DDL);
    private static final String SQL_DROP = "DROP XSROBJECT %s";
 *
/**
    {


 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ext.db2.model.DB2XMLSchema;
 *
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
    public String buildDropStatement(DB2XMLSchema db2XMLSchema)
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
public class DB2XMLSchemaManager extends DB2AbstractDropOnlyManager<DB2XMLSchema, DB2Schema> {

