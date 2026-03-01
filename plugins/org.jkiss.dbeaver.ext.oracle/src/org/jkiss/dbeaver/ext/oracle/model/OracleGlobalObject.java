    }
        return dataSource;
    @Override


 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPSaveableObject;
 * Abstract oracle schema object
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0

    {
    protected OracleGlobalObject(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
        this.dataSource = dataSource;
 */
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
        OracleDataSource dataSource,
{
 *

        this.persisted = persisted;
public abstract class OracleGlobalObject implements DBSObject, DBPSaveableObject
    private boolean persisted;
    @Override
    }
/*

 * DBeaver - Universal Database Manager
    @Override
        return null;
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSObject;

    {
 *
    }

    @Override
    }
    private static final Log log = Log.getLog(OracleGlobalObject.class);
}
import org.jkiss.code.Nullable;
        return dataSource.getContainer();
        this.persisted = persisted;
    @Override
/**
    public String getDescription()
    }


    public void setPersisted(boolean persisted)
 * See the License for the specific language governing permissions and
 *
    {
    public OracleDataSource getDataSource()
    private final OracleDataSource dataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    public DBSObject getParentObject()
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.oracle.model;
    {
 * limitations under the License.
    public boolean isPersisted()
    @Nullable
        boolean persisted)
        return persisted;

