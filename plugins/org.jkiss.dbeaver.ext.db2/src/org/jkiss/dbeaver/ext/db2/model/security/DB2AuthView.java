    // -----------------------

        throws DBException
 *
 */
}
    // Properties

    public DBSObject getObject()
    {
        return super.getObjectSchema();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * 
 * limitations under the License.
 *


/*
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 *
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DB2 Authorisations on Views
package org.jkiss.dbeaver.ext.db2.model.security;
    {
    public DB2Schema getObjectSchema()
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 1)
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
 *     http://www.apache.org/licenses/LICENSE-2.0


 * Copyright (C) 2010-2024 DBeaver Corp and others
    // -----------------
    // -----------------
import org.jkiss.dbeaver.model.struct.DBSObject;
 */
/**
    }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @author Denis Forveille
public class DB2AuthView extends DB2AuthTableBase {
    // Constructors

    }
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    // -----------------------
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.meta.Property;
import java.sql.ResultSet;
        super(monitor, db2Grantee, db2TableBase, resultSet);
    public DB2AuthView(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2TableBase db2TableBase, ResultSet resultSet)
        return super.getObject();

