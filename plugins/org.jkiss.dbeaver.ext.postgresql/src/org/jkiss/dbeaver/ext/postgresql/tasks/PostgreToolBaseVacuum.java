        queries.add(new SQLDatabasePersistAction(sql));

        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");

        if(settings.isDisableSkipping()) sql += ", DISABLE_PAGE_SKIPPING";
 */
        }
            PostgreTableBase postObject = (PostgreTableBase) object;
    }
        if(object instanceof PostgreTableBase){
    @Override
    public PostgreToolBaseVacuumSettings createToolSettings() {
package org.jkiss.dbeaver.ext.postgresql.tasks;
        if(settings.isSkipLocked()) sql += ", SKIP_LOCKED";
    public boolean isRunInAutoCommit() {
 * limitations under the License.
    }
        if(settings.isAnalyzed()) sql += ", ANALYZE";
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *
    @Override
        String sql = "VACUUM (";
 * you may not use this file except in compliance with the License.
}
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;

    @Override
        if(settings.isTruncated()) sql += ", TRUNCATE";
        sql += ")";
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
        sql += "VERBOSE";
        if(settings.isFull()) sql += "FULL, ";
import org.jkiss.dbeaver.model.DBPEvaluationContext;

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
            sql += " " + postObject.getFullyQualifiedName(DBPEvaluationContext.DDL);

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
    public void generateObjectQueries(DBCSession session, PostgreToolBaseVacuumSettings settings, List<DBEPersistAction> queries, DBSObject object) throws DBCException {
        return new PostgreToolBaseVacuumSettings();
        if(settings.isIndexCleaning()) sql += ", INDEX_CLEANUP";
 *
 * See the License for the specific language governing permissions and
/*
 *
public class PostgreToolBaseVacuum extends PostgreToolWithStatus<DBSObject, PostgreToolBaseVacuumSettings> {
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if(settings.isFreeze()) sql += "FREEZE, ";
 *     http://www.apache.org/licenses/LICENSE-2.0
