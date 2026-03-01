 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * @author Denis Forveille
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DB2Schema getObjectSchema()
    // -----------------
    // -----------------------
    // -----------------------
 * See the License for the specific language governing permissions and
        return super.getObject();
 * DBeaver - Universal Database Manager


 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DB2AuthXMLSchema(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2XMLSchema db2XMLSchema, ResultSet resultSet)
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    {
/*

 * limitations under the License.
    }
    }
        return usage;
    // -----------------
import org.jkiss.dbeaver.ext.db2.model.DB2XMLSchema;
    public DBSObject getObject()
 *
 * you may not use this file except in compliance with the License.
    // Properties

 * You may obtain a copy of the License at
    @Property(viewable = true, order = 2)
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.db2.model.security;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
    {

        super(monitor, db2Grantee, db2XMLSchema, resultSet);
import org.jkiss.dbeaver.DBException;

 *
    public DB2AuthHeldType getUsage()
import org.jkiss.utils.CommonUtils;
 */
        this.usage = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "USAGEAUTH"));
 */
    {
import org.jkiss.dbeaver.model.meta.Property;
        return super.getObjectSchema();
        throws DBException


public class DB2AuthXMLSchema extends DB2AuthBase {
    }
/**
    @Property(viewable = true, order = 1)
}
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    {
import java.sql.ResultSet;

    private DB2AuthHeldType usage;
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
    // Constructors
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DB2 Authorisations on XML Schemas
    }

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * distributed under the License is distributed on an "AS IS" BASIS,
 * 
