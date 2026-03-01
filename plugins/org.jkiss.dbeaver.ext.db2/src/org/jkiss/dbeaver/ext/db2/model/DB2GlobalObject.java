    // Constructors
 * Unless required by applicable law or agreed to in writing, software
        return dataSource.getContainer();
    private final DB2DataSource dataSource;

        return persisted;
 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.Log;
 * 
    // -----------------------
 */
    protected DB2GlobalObject(DB2DataSource dataSource, boolean persisted)
    @Override
 * You may obtain a copy of the License at


 *
    }
    @Override
    protected Log log = Log.getLog(DB2GlobalObject.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        this.dataSource = dataSource;
}
import org.jkiss.code.NotNull;
    }
    }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    @Nullable
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
    public boolean isPersisted()

package org.jkiss.dbeaver.ext.db2.model;
    {
    }
 * Abstract DB2 schema object
public abstract class DB2GlobalObject implements DBSObject, DBPSaveableObject {
/*

    // Standard Getters/Setters
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setPersisted(boolean persisted)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and

    @Override

    // By default : no Description

    // -----------------------
    // -----------------------


        return dataSource;
import org.jkiss.code.Nullable;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    public String getDescription()
/**
        this.persisted = persisted;
    public DBSObject getParentObject()
    public DB2DataSource getDataSource()
    {
        this.persisted = persisted;
    {


    {
 * @author Denis Forveille
 *
import org.jkiss.dbeaver.model.DBPSaveableObject;
    // -----------------------
    private boolean persisted;
 * limitations under the License.
    {
        return null;
 */
    {
 *
 * DBeaver - Universal Database Manager
