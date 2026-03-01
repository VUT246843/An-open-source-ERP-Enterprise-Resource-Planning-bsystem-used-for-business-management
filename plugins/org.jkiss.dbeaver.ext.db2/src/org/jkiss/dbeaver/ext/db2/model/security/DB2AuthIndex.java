 *
    {
/**
    {
import org.jkiss.dbeaver.model.struct.DBSObject;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DB2AuthHeldType getControl()
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
    {
public class DB2AuthIndex extends DB2AuthBase {
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws DBException
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
 * @author Denis Forveille
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // -----------------------

 */
import java.sql.ResultSet;

    // Properties
    // -----------------------

    // -----------------
    public DB2Schema getObjectSchema()
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
    }
 */
        return super.getObject();
 * limitations under the License.
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.ext.db2.DB2Constants;

 * You may obtain a copy of the License at
    }
    private DB2AuthHeldType control;
    }

    @Property(viewable = true, order = 1)
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *
    public DBSObject getObject()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // -----------------
        return control;
 * you may not use this file except in compliance with the License.
 * 

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
        super(monitor, db2Grantee, db2Index, resultSet);
import org.jkiss.dbeaver.model.meta.Property;
    // Constructors
    public DB2AuthIndex(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Index db2Index, ResultSet resultSet)
}
import org.jkiss.dbeaver.DBException;

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 *
/*
        return super.getObjectSchema();
        this.control = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "CONTROLAUTH"));
import org.jkiss.dbeaver.ext.db2.model.DB2Index;
 * DB2 Authorisations on Tablespaces
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.ext.db2.model.security;
