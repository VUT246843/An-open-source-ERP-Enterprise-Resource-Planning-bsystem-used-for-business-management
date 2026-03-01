import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * @author Denis Forveille
 * DB2 Trigger Manager
} * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.code.Nullable;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
    @Override
    @Nullable
package org.jkiss.dbeaver.ext.db2.manager;
    @Override
import org.jkiss.dbeaver.ext.db2.model.DB2Trigger;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
/*
    public String buildDropStatement(DB2Trigger db2Trigger)
        return db2Trigger.getSchema().getTriggerCache();
 * 
    public DBSObjectCache<DB2Schema, DB2Trigger> getObjectsCache(DB2Trigger db2Trigger)


        return String.format(SQL_DROP, fullyQualifiedName);
 */
public class DB2TriggerManager extends DB2AbstractDropOnlyManager<DB2Trigger, DBSObject> {

    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        String fullyQualifiedName = db2Trigger.getFullyQualifiedName(DBPEvaluationContext.DDL);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.model.struct.DBSObject;

 * DBeaver - Universal Database Manager

    }

/**
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    private static final String SQL_DROP = "DROP TRIGGER %s";
 */
