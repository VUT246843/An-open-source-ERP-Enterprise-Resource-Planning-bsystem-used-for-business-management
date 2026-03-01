    private static final String SQL_DROP = "DROP VIEW %s";
    @Override
 */

import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
import org.jkiss.code.Nullable;
    @Nullable
/**

public class DB2ViewManager extends DB2AbstractDropOnlyManager<DB2View, DB2Schema> {
 */
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.ext.db2.model.DB2View;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.db2.manager;
        return db2View.getSchema().getViewCache();
        return String.format(SQL_DROP, fullyQualifiedName);
 * Copyright (C) 2010-2024 DBeaver Corp and others

        String fullyQualifiedName = db2View.getFullyQualifiedName(DBPEvaluationContext.DDL);
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    public DBSObjectCache<DB2Schema, DB2View> getObjectsCache(DB2View db2View)
    {
 * DBeaver - Universal Database Manager
    }
    {
 * @author Denis Forveille
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

}
    public String buildDropStatement(DB2View db2View)
 * DB2 View Manager
 *
 *
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
