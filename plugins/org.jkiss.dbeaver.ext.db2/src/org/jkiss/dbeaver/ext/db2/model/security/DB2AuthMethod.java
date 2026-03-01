
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
 * 
    public DB2AuthMethod(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Routine db2Routine, ResultSet resultSet)
        return super.getObject();
    {
        return super.getObjectSchema();

 * DBeaver - Universal Database Manager
import java.sql.ResultSet;
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;
    }
    // Properties
    }

import org.jkiss.dbeaver.model.meta.Property;
 *
    }
 * You may obtain a copy of the License at
    public DB2AuthHeldType getExecute()
    // -----------------
    }
        this.execute = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "EXECUTEAUTH"));
        super(monitor, db2Grantee, db2Routine, resultSet);
/*
 *
    // -----------------
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    {
 */
}
        throws DBException


public class DB2AuthMethod extends DB2AuthBase {



    // Constructors
package org.jkiss.dbeaver.ext.db2.model.security;
 * @author Denis Forveille
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObject getObject()
import org.jkiss.utils.CommonUtils;

 *

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.model.struct.DBSObject;
    private DB2AuthHeldType execute;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
        return execute;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    {
    @Property(viewable = true, order = 2)
 */
    @Property(viewable = true, order = 1)
    public DB2Schema getObjectSchema()
    // -----------------------
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DB2 Authorisations on methds
    // -----------------------
 * See the License for the specific language governing permissions and
