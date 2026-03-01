
    // -----------------------
    // -----------------------
        super(monitor, db2Grantee, db2Schema, resultSet);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
/**
    {
    public DB2AuthSchema(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Schema db2Schema, ResultSet resultSet)
        return super.getObjectSchema();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    public DB2AuthHeldType getCreateIn()
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
}

 * distributed under the License is distributed on an "AS IS" BASIS,
    // Properties
 * 
import java.sql.ResultSet;


    public DB2AuthHeldType getDropIn()
    // -----------------
    public DB2AuthHeldType getAlterIn()
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
public class DB2AuthSchema extends DB2AuthBase {
    @Property(viewable = true, order = 22, category = DB2Constants.CAT_AUTH)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
/*
 * @author Denis Forveille
 * See the License for the specific language governing permissions and
    private DB2AuthHeldType dropIn;
        this.dropIn = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "DROPINAUTH"));

    {
        this.createIn = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "CREATEINAUTH"));
 * Unless required by applicable law or agreed to in writing, software

    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    private DB2AuthHeldType createIn;
    public DBSObject getObject()
    @Property(hidden = true)
        throws DBException
        return createIn;
 * DB2 Authorisations on Schemas
    @Override
        this.alterIn = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "ALTERINAUTH"));
    private DB2AuthHeldType alterIn;
    {
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
 *
    }
        return alterIn;


    @Property(viewable = true, order = 2)
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
    }
    // -----------------
 *
    // Constructors

import org.jkiss.dbeaver.model.meta.Property;
package org.jkiss.dbeaver.ext.db2.model.security;
    }

    public DB2Schema getObjectSchema()
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    {
    }
        return super.getObject();
 * you may not use this file except in compliance with the License.
    }
        return dropIn;

    {
 *
 */
