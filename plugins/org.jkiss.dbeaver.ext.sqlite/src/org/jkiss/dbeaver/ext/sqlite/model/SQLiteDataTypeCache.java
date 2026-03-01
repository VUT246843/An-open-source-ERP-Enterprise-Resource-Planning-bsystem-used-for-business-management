            types.add(dataType);
 * Copyright (C) 2010-2024 DBeaver Corp and others

public class SQLiteDataTypeCache extends JDBCBasicDataTypeCache<GenericStructContainer, SQLiteDataType>
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.


            SQLiteDataType dataType = new SQLiteDataType((SQLiteDataSource) dataSource, affinity);
 */
 * DBeaver - Universal Database Manager
        setCache(types);
    protected synchronized void loadObjects(DBRProgressMonitor monitor, GenericStructContainer dataSource) throws DBException {
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * SQLiteDataTypeCache
package org.jkiss.dbeaver.ext.sqlite.model;
 *
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * you may not use this file except in compliance with the License.
/*
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
{
 * You may obtain a copy of the License at
        for (SQLiteAffinity affinity : SQLiteAffinity.values()) {
        List<SQLiteDataType> types = new ArrayList<>();
        super(owner);
 */
}
    }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
import org.jkiss.dbeaver.DBException;
    @Override
/**
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLiteDataTypeCache(GenericStructContainer owner) {
