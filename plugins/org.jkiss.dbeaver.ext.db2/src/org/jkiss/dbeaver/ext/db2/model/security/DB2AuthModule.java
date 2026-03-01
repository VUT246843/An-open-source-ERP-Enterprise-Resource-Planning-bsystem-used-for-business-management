

/**
        this.execute = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "EXECUTEAUTH"));
 *
 */
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * DBeaver - Universal Database Manager

    // -----------------------
    }
    }
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.DBException;
import java.sql.ResultSet;
 * Unless required by applicable law or agreed to in writing, software
    public DB2AuthModule(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Module db2Module, ResultSet resultSet)
package org.jkiss.dbeaver.ext.db2.model.security;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.
        return execute;

    {
        return super.getObject();

import org.jkiss.utils.CommonUtils;
        return super.getObjectSchema();
    // -----------------
 * See the License for the specific language governing permissions and

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    private DB2AuthHeldType execute;
 *
}

    // -----------------
public class DB2AuthModule extends DB2AuthBase {
    public DB2Schema getObjectSchema()
    @Property(viewable = true, order = 2)
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *
    public DB2AuthHeldType getExecute()
    @Property(viewable = true, order = 1)
/*

    public DBSObject getObject()
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * DB2 Authorisations on Modules
    }
    {
 * @author Denis Forveille


    {
        super(monitor, db2Grantee, db2Module, resultSet);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * limitations under the License.
        throws DBException
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    // -----------------------
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Properties
    // Constructors
 * Copyright (C) 2010-2024 DBeaver Corp and others
