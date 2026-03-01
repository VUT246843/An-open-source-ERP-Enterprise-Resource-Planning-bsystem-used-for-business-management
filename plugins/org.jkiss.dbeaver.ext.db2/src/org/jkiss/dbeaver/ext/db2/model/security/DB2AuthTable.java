    }
 */
import org.jkiss.dbeaver.model.meta.Property;
    // Constructors

    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.db2.model.security;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return super.getObjectSchema();
import org.jkiss.dbeaver.DBException;
    public DB2AuthTable(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2TableBase db2TableBase, ResultSet resultSet)
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 *
}
    {
 * Unless required by applicable law or agreed to in writing, software
 * @author Denis Forveille

    {
    // -----------------------

    {

 * DB2 Authorisations on Tables
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    public DBSObject getObject()


    // Properties
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager

    // -----------------------
        return super.getObject();
        super(monitor, db2Grantee, db2TableBase, resultSet);
 *
        throws DBException
    // -----------------
import java.sql.ResultSet;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DB2Schema getObjectSchema()
import org.jkiss.dbeaver.model.struct.DBSObject;
    // -----------------
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = true, order = 2)
    @Property(viewable = true, order = 1)
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
public class DB2AuthTable extends DB2AuthTableBase {
 * You may obtain a copy of the License at
/**
 * limitations under the License.
 *
 * 
