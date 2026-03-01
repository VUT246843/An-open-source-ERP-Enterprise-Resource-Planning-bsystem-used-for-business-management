    @Nullable
/**
        String fullyQualifiedName = db2Nickname.getFullyQualifiedName(DBPEvaluationContext.DDL);
    @Override
    private static final String SQL_DROP = "DROP NICKNAME %s";
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    public DBSObjectCache<DB2Schema, DB2Nickname> getObjectsCache(DB2Nickname db2Nickname)
        return db2Nickname.getSchema().getNicknameCache();
 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 */
 * You may obtain a copy of the License at

    public String buildDropStatement(DB2Nickname db2Nickname)
}
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
/*
 * @author Denis Forveille
import org.jkiss.dbeaver.ext.db2.model.fed.DB2Nickname;
    {
public class DB2NicknameManager extends DB2AbstractDropOnlyManager<DB2Nickname, DB2Schema> {
    }
 * 
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 *
 *
    {
        return String.format(SQL_DROP, fullyQualifiedName);
 * limitations under the License.
 * DB2 Federated Nickname Manager
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.db2.manager;
 */


 * See the License for the specific language governing permissions and
