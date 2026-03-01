        this.dataType = JDBCUtils.safeGetString(dbResult, "DATATYPE");
    }
    {
    private String defferedValue;
import org.jkiss.code.Nullable;

    @Override

    // Properties
    public String getValue()
    {
    @Override
    // -----------------------
    private String name;
    // -----------------
    }

        return flags;
 * DB2 Database and Instance parameters
    private String flags;
        return null;
    @Property(viewable = true, editable = false, order = 2)
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, editable = false, order = 3)
    }
    {
    @Property(viewable = true, editable = false, order = 4)
    public String getDefferedValue()
public class DB2Parameter implements DBSObject {
    private String value;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;

    private String dataType;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    public String getDataType()
    {
    }
    @Property(viewable = true, editable = false, order = 6)
    public String getName()
 * 
    @Override
 *
        return false;
    // -----------------------
        return value;
        this.dataSource = dataSource;
    public DBSObject getParentObject()
    {
    public boolean isPersisted()
 * DBeaver - Universal Database Manager
    {
    public DBPDataSource getDataSource()
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {
    @Property(viewable = true, editable = false, order = 1)
}
        this.value = JDBCUtils.safeGetString(dbResult, "VALUE");
        return defferedValueFlags;
    public String getFlags()
    {
import org.jkiss.dbeaver.model.meta.Property;
    }


        return dataSource.getContainer();

 * @author Denis Forveille
 * you may not use this file except in compliance with the License.
    // -----------------
    @NotNull
    public String getDefferedValueFlags()
    }
        this.name = JDBCUtils.safeGetString(dbResult, "NAME");
    {
    }

 * You may obtain a copy of the License at
 * limitations under the License.
 *

        return dataSource;
    @NotNull
        return defferedValue;
 * See the License for the specific language governing permissions and
    private String defferedValueFlags;
        // DB2 v10.1 this.defferedValueFlags = JDBCUtils.safeGetString(dbResult, "DEFERRED_VALUE_FLAGS ");
    @Nullable
    // Constructors

    }
    {
        return dataType;

    }
    public String getDescription()
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, editable = false, order = 5)
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
    public DB2Parameter(DB2DataSource dataSource, ResultSet dbResult)

        this.flags = JDBCUtils.safeGetString(dbResult, "VALUE_FLAGS");
package org.jkiss.dbeaver.ext.db2.info;


import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        this.defferedValue = JDBCUtils.safeGetString(dbResult, "DEFERRED_VALUE");
 * Unless required by applicable law or agreed to in writing, software
        return name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
import java.sql.ResultSet;



 */
 *
 */
    private DB2DataSource dataSource;
