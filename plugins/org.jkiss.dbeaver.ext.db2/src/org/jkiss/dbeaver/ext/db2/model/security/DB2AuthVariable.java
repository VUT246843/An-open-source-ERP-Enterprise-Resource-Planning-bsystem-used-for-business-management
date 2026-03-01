 *
 * You may obtain a copy of the License at
    // Constructors

 * limitations under the License.
    }
 */
    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
    // -----------------
        throws DBException

 * you may not use this file except in compliance with the License.

    {
    {
    // Properties
        return super.getObjectSchema();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * 
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // -----------------------
/**
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.DBSObject;
    {
    public DB2AuthHeldType getWrite()

    public DB2Schema getObjectSchema()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public DB2AuthVariable(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Variable db2Variable, ResultSet resultSet)
}
    // -----------------------
    private DB2AuthHeldType write;
    }
 */
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

    {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0


/*
    @Property(viewable = true, order = 1)
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.read = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "USAGEAUTH"));
import org.jkiss.utils.CommonUtils;
        return super.getObject();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.DB2Variable;
    // -----------------
package org.jkiss.dbeaver.ext.db2.model.security;
    {
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        super(monitor, db2Grantee, db2Variable, resultSet);
 *

    private DB2AuthHeldType read;
public class DB2AuthVariable extends DB2AuthBase {
 * DB2 Authorisations on Variables
 * @author Denis Forveille
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.ext.db2.DB2Constants;
        return write;

    public DB2AuthHeldType getRead()
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
    public DBSObject getObject()
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.write = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "ALTERINAUTH"));
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

    @Property(viewable = true, order = 2)
        return read;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
