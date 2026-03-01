    DBPDataSource getDataSource();

    Map<?,LOCK_TYPE> getLocks(DBCSession session, Map<String, Object> options)

import org.jkiss.dbeaver.DBException;
public interface DBAServerLockManager<LOCK_TYPE extends DBAServerLock, LOCK_TYPE_ITEM extends DBAServerLockItem> {
/*
    		throws DBException;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    Class<LOCK_TYPE> getLocksType();


}
/**
    Collection<LOCK_TYPE_ITEM> getLockItems(DBCSession session,Map<String, Object> options)
        throws DBException;



package org.jkiss.dbeaver.model.admin.locks;
    		throws DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    void alterSession(DBCSession session, LOCK_TYPE sessionType, Map<String, Object> options)
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Lock manager

 *
 */
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com) 
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    
import java.util.Collection;
