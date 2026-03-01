 */
 *
        return update;
    {

        return super.getObjectSchema();
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2013-2017 Denis Forveille (titou10.titou10@gmail.com)
        return reference;
 * @author Denis Forveille
    {

/**

    }
}
import org.jkiss.dbeaver.model.meta.Property;
    }
 * DB2 Authorisations on Columns

        } else {
 *
    public DB2AuthColumn(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2TableColumn db2TableColumn, ResultSet resultSet)
        super(monitor, db2Grantee, db2TableColumn, resultSet);
 * See the License for the specific language governing permissions and
    public DBSObject getObject()
    // -----------------------
    }
    {
    public DB2Schema getObjectSchema()
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, order = 2)
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
        String grantable = JDBCUtils.safeGetString(resultSet, "CREATEINAUTH");
            reference = grantable.equals(DB2AuthHeldType.N.getName()) ? DB2AuthHeldType.Y : DB2AuthHeldType.G;
public class DB2AuthColumn extends DB2AuthBase {


    // -----------------
    private static final String UPDATE_PRIVILEGE = "U";
 */
    // -----------------------
/*
        throws DBException
package org.jkiss.dbeaver.ext.db2.model.security;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DB2AuthHeldType getUpdate()
    }
import org.jkiss.dbeaver.ext.db2.DB2Constants;

 *
        }
    {
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * 
 * you may not use this file except in compliance with the License.
        // PRIVTYPE in ALTERINAUTH
 *     http://www.apache.org/licenses/LICENSE-2.0
    // Constructors


import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

        return super.getObject();
 * distributed under the License is distributed on an "AS IS" BASIS,
    private DB2AuthHeldType reference = DB2AuthHeldType.N;


    private DB2AuthHeldType update = DB2AuthHeldType.N;;
    @Property(viewable = true, order = 1)
    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
    // Properties
 * Copyright (C) 2010-2024 DBeaver Corp and others
            update = grantable.equals(DB2AuthHeldType.N.name()) ? DB2AuthHeldType.Y : DB2AuthHeldType.G;
    }
    public DB2AuthHeldType getReference()
 * limitations under the License.

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import java.sql.ResultSet;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software

    // -----------------
        if (privType.equals(UPDATE_PRIVILEGE)) {
    {
        String privType = JDBCUtils.safeGetString(resultSet, "ALTERINAUTH");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
        // GRANTABLE in CREATEINAUTH
