        super(monitor, db2Grantee, db2TableBase, resultSet);
        return super.getObjectSchema();
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // Constructors
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Property(viewable = true, order = 1)
 *
package org.jkiss.dbeaver.ext.db2.model.security;
 * See the License for the specific language governing permissions and
    // -----------------------

/*
/**
    }
        ResultSet resultSet) throws DBException
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.sql.ResultSet;

    public DBSObject getObject()
    public DB2Schema getObjectSchema()
 * DB2 Authorisations on MQTs
    }
import org.jkiss.dbeaver.DBException;
 * @author Denis Forveille
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = true, order = 2)
 */
public class DB2AuthMaterializedQueryTable extends DB2AuthTableBase {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.meta.Property;

}
    }
 * limitations under the License.
    public DB2AuthMaterializedQueryTable(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2TableBase db2TableBase,
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    {
 *
    // -----------------
 * distributed under the License is distributed on an "AS IS" BASIS,


    // -----------------------
        return super.getObject();
    // -----------------
 * DBeaver - Universal Database Manager
 * 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *


    // Properties
