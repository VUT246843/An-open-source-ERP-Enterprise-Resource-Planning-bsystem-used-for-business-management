    }
    private static final String SQL_DROP = "DROP PACKAGE %s";
    }
 * You may obtain a copy of the License at
        String fullyQualifiedName = db2Package.getFullyQualifiedName(DBPEvaluationContext.DDL);


    @Override
 * limitations under the License.
    @Nullable
 * @author Denis Forveille
 * See the License for the specific language governing permissions and
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return db2Package.getSchema().getPackageCache();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * Licensed under the Apache License, Version 2.0 (the "License");

}
 *
/**
package org.jkiss.dbeaver.ext.db2.manager;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DB2 Package Manager
import org.jkiss.dbeaver.ext.db2.model.DB2Package;
    {
 */
    public String buildDropStatement(DB2Package db2Package)
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 * you may not use this file except in compliance with the License.
public class DB2PackageManager extends DB2AbstractDropOnlyManager<DB2Package, DB2Schema> {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return String.format(SQL_DROP, fullyQualifiedName);
 */


import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.code.Nullable;
 * 
    public DBSObjectCache<DB2Schema, DB2Package> getObjectsCache(DB2Package db2Package)
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
