 * DBeaver - Universal Database Manager
        int precision,
        return getCachedObject(name);
 *
        int valueType,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSDataType;

        boolean unsigned,
    public Collection<DBSDataType> getAllObjects(@NotNull DBRProgressMonitor monitor, @Nullable JDBCDataSource jdbcDataSource) throws DBException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.owner = owner;
    {
    @NotNull
    {
    }
 */
        int maxScale);
 *     http://www.apache.org/licenses/LICENSE-2.0
/*


import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;

    protected abstract DBSDataType createDataType(
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    {

    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    protected final DBSObject owner;
import java.util.Collection;
    {
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;

public abstract class JDBCLazyDataTypeCache extends AbstractObjectCache<JDBCDataSource, DBSDataType> {
import org.jkiss.dbeaver.DBException;
        int minScale,
 * You may obtain a copy of the License at
        return null;

 * limitations under the License.
    public JDBCLazyDataTypeCache(DBSObject owner)
        String name,
 * See the License for the specific language governing permissions and

    public DBSDataType getDataType(String name, int valueType)
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBSDataType getObject(@NotNull DBRProgressMonitor monitor, @NotNull JDBCDataSource jdbcDataSource, @NotNull String name) throws DBException

 * Unless required by applicable law or agreed to in writing, software
        return getCachedObjects();
    @Override
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.model.impl.jdbc.cache;
        String remarks,
        boolean searchable,
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
