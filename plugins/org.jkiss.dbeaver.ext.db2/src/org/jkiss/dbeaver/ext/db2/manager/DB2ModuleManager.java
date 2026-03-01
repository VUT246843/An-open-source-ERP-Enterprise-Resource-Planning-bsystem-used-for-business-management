 *     http://www.apache.org/licenses/LICENSE-2.0
    }
package org.jkiss.dbeaver.ext.db2.manager;
 * DB2 Module Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    {
public class DB2ModuleManager extends DB2AbstractDropOnlyManager<DB2Module, DB2Schema> {
 * 
 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
    private static final String SQL_DROP = "DROP MODULE %s";

 * DBeaver - Universal Database Manager
        return String.format(SQL_DROP, fullyQualifiedName);
 */
 * @author Denis Forveille
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
 *
}
        return db2Module.getSchema().getModuleCache();
    @Override
 */

import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *

    @Override
    public String buildDropStatement(DB2Module db2Module)
        String fullyQualifiedName = db2Module.getFullyQualifiedName(DBPEvaluationContext.DDL);
/**
    public DBSObjectCache<DB2Schema, DB2Module> getObjectsCache(DB2Module db2Module)
 * limitations under the License.
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
    {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Nullable
    }
