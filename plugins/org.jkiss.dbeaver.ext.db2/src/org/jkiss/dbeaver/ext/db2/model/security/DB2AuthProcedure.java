package org.jkiss.dbeaver.ext.db2.model.security;
    private DB2AuthHeldType execute;
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
    // -----------------
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    }
 * you may not use this file except in compliance with the License.

    {

 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {

 */

        this.execute = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "EXECUTEAUTH"));
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * 
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // -----------------
    public DB2Schema getObjectSchema()

import org.jkiss.utils.CommonUtils;

 *
        super(monitor, db2Grantee, db2Routine, resultSet);
    // -----------------------


import java.sql.ResultSet;
 * Unless required by applicable law or agreed to in writing, software
 * DB2 Authorisations on Procedures
    // -----------------------
        return super.getObjectSchema();
/**
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    }
    @Property(viewable = true, order = 1)
    public DBSObject getObject()
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;
 */
import org.jkiss.dbeaver.DBException;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * @author Denis Forveille
 *     http://www.apache.org/licenses/LICENSE-2.0

        return execute;
    public DB2AuthProcedure(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Routine db2Routine, ResultSet resultSet)
        return super.getObject();
    @Property(viewable = true, order = 2)
    // Constructors
}
 * See the License for the specific language governing permissions and
    }
public class DB2AuthProcedure extends DB2AuthBase {
    public DB2AuthHeldType getExecute()
    // Properties
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBException
 *
    {
/*
