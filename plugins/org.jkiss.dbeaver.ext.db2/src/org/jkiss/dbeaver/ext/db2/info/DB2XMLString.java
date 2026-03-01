
}
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * limitations under the License.
        return dataSource.getContainer();



    public String getString()
/*
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 * Unless required by applicable law or agreed to in writing, software
    {
    {
    public DB2XMLString(DB2DataSource dataSource, ResultSet dbResult)
    // -----------------------
    public DBSObject getParentObject()
 */
    @Override
    public String getDescription()
import org.jkiss.dbeaver.model.struct.DBSObject;
    // -----------------

    // -----------------------
        return stringUTF8;
    @Property(viewable = true, order = 1)
 *
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    private Integer stringId;
    }


import org.jkiss.dbeaver.model.DBPDataSource;
 * DBeaver - Universal Database Manager
    }
        this.dataSource = dataSource;

    // -----------------
    @NotNull
    {
    @Override
    {

import org.jkiss.code.Nullable;
 * @author Denis Forveille
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = false, order = 3)

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String stringUTF8;
    private String string;
        return string;
public class DB2XMLString implements DBSObject {
import org.jkiss.code.NotNull;
        return false;
    }

    }
    @Nullable
 * 
        return stringId.toString();
 *
    }

    {
        return null;
        this.stringUTF8 = JDBCUtils.safeGetString(dbResult, "STRING_UTF8");

    public boolean isPersisted()
    }

        this.string = JDBCUtils.safeGetString(dbResult, "STRING");
    private DB2DataSource dataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.sql.ResultSet;
/**
package org.jkiss.dbeaver.ext.db2.info;
    @Override
    public String getStringUTF8()
    @Property(viewable = true, order = 2)
    @NotNull

    public String getName()
 *
    // Constructors
        return dataSource;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public DBPDataSource getDataSource()
 */
    {
    @Override
    {
    // Properties

    }
 * you may not use this file except in compliance with the License.
    }
        this.stringId = JDBCUtils.safeGetInteger(dbResult, "STRINGID");
    {
 * DB2 XML Strings
    @Override
