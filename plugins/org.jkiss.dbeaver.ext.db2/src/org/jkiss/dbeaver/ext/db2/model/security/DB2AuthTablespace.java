 * 
    {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.DBException;
    public DB2AuthTablespace(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Tablespace db2Tablespace, ResultSet resultSet)
/**

 * Unless required by applicable law or agreed to in writing, software
    // Constructors
    {
    }
    public DB2AuthHeldType getUsage()

 * Licensed under the Apache License, Version 2.0 (the "License");

        return super.getObjectSchema();
        return super.getObject();

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 */
 *
 * You may obtain a copy of the License at
import java.sql.ResultSet;
    // -----------------
    public DBSObject getObject()
        this.usage = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "USAGEAUTH"));

/*

    // -----------------------

 */
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {
    }

    // Properties
 * limitations under the License.
    {
    private DB2AuthHeldType usage;

 * @author Denis Forveille
public class DB2AuthTablespace extends DB2AuthBase {
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSObject;
        super(monitor, db2Grantee, db2Tablespace, resultSet);
    @Property(hidden = true)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    public DB2Schema getObjectSchema()
    // -----------------------
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * DB2 Authorisations on Tablespaces
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
}
        return usage;
package org.jkiss.dbeaver.ext.db2.model.security;

    // -----------------
 *
        throws DBException
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.ext.db2.model.DB2Tablespace;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
