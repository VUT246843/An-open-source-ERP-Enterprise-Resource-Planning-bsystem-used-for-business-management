    }
        this.bind = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "BINDAUTH"));
    }
    }
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * 
 *
    public DB2Schema getObjectSchema()
    // -----------------------
public class DB2AuthPackage extends DB2AuthBase {
        return bind;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others


 * DB2 Authorisations on Packages

    private DB2AuthHeldType control;
    {
    // -----------------------
/*
import org.jkiss.dbeaver.ext.db2.model.DB2Package;
    {
import java.sql.ResultSet;

    // Constructors
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 *
    }
 * limitations under the License.
    @Property(viewable = true, order = 2)
 */
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
        throws DBException

import org.jkiss.dbeaver.DBException;

 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 1)
 */
    // -----------------
    private DB2AuthHeldType bind;
    }
/**
    private DB2AuthHeldType execute;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    public DB2AuthHeldType getBind()

    // -----------------
    public DB2AuthHeldType getExecute()
package org.jkiss.dbeaver.ext.db2.model.security;
        return execute;
    {
    @Property(viewable = true, order = 22, category = DB2Constants.CAT_AUTH)
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DB2AuthPackage(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Package db2Package, ResultSet resultSet)

 * @author Denis Forveille
    }
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
        this.control = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "CONTROLAUTH"));

    // Properties
}
import org.jkiss.utils.CommonUtils;
    {



 * You may obtain a copy of the License at
        super(monitor, db2Grantee, db2Package, resultSet);
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return control;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.execute = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "EXECUTEAUTH"));
    public DBSObject getObject()
        return super.getObjectSchema();
    {
        return super.getObject();
    public DB2AuthHeldType getControl()
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
