    // -----------------
import org.jkiss.dbeaver.DBException;
 *
    public DB2Schema getObjectSchema()
 * DB2 Authorisations on Functions
 * @author Denis Forveille
        return execute;
    }
 * DBeaver - Universal Database Manager
    {
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
    // -----------------------
        this.execute = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "EXECUTEAUTH"));
import org.jkiss.dbeaver.model.struct.DBSObject;


    // Properties
public class DB2AuthUDF extends DB2AuthBase {
    private DB2AuthHeldType execute;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * limitations under the License.
    }
    public DB2AuthHeldType getExecute()
    public DB2AuthUDF(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Routine db2Routine, ResultSet resultSet)
        return super.getObjectSchema();
/*
    @Property(viewable = true, order = 1)
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    }

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, order = 2)

        throws DBException
 * You may obtain a copy of the License at
/**
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.ext.db2.DB2Constants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;
    }
    @Property(viewable = true, order = 22, category = DB2Constants.CAT_AUTH)
import org.jkiss.dbeaver.model.meta.Property;
    {
        return super.getObject();

package org.jkiss.dbeaver.ext.db2.model.security;
    // -----------------
 * 
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 *
        super(monitor, db2Grantee, db2Routine, resultSet);
import java.sql.ResultSet;
    // Constructors
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

}
    // -----------------------
    {

    public DBSObject getObject()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


 *
