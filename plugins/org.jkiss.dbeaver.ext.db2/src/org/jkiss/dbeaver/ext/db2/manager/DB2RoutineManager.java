    @Override
    public DBSObjectCache<DB2Schema, DB2Routine> getObjectsCache(DB2Routine db2Routine)
            return String.format(SQL_DROP_FUNCTION, fullyQualifiedName);

public class DB2RoutineManager extends DB2AbstractDropOnlyManager<DB2Routine, DB2Schema> {
 *
 */
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
            throw new IllegalStateException(db2Routine.getType() + " is not a supported DB2RoutineType");
 * DBeaver - Universal Database Manager
}
 */
        case P:
            return db2Routine.getSchema().getProcedureCache();
            return String.format(SQL_DROP_PROCEDURE, fullyQualifiedName);

    public String buildDropStatement(DB2Routine db2Routine)

 * You may obtain a copy of the License at
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
        case M:
 * DB2 Routine Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        default:
            return db2Routine.getSchema().getUdfCache();
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;
    @Override
            throw new IllegalStateException(db2Routine.getType() + " not supported");
    private static final String SQL_DROP_FUNCTION = "DROP SPECIFIC FUNCTION %s";
 * you may not use this file except in compliance with the License.
/**

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
        case F:
        }
 *
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        switch (db2Routine.getType()) {
            return db2Routine.getSchema().getMethodCache();
        default:
        case P:
    }
 *
    @Nullable
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private static final String SQL_DROP_METHOD = "DROP SPECIFIC METHOD %s";
        case F:
        String fullyQualifiedName = db2Routine.getFullyQualifiedName(DBPEvaluationContext.DDL);

    }
 * @author Denis Forveille

 * limitations under the License.
        switch (db2Routine.getType()) {
        case M:
 * 
    private static final String SQL_DROP_PROCEDURE = "DROP SPECIFIC PROCEDURE %s";

package org.jkiss.dbeaver.ext.db2.manager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return String.format(SQL_DROP_METHOD, fullyQualifiedName);
