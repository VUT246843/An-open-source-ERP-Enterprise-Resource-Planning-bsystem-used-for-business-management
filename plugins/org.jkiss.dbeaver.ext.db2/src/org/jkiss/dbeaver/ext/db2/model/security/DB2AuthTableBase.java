 * @author Denis Forveille
    @Property(viewable = true, order = 27, category = DB2Constants.CAT_AUTH)

    }

    public DB2AuthHeldType getIndex()
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
    @Property(viewable = true, order = 26, category = DB2Constants.CAT_AUTH)
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        return reference;
 * DB2 Common Authorisations on Tables and Views
        super(monitor, db2Grantee, db2TableBase, resultSet);
    private DB2AuthHeldType insert;
    public DB2AuthHeldType getUpdate()
    private DB2AuthHeldType select;
 * 
    @Property(viewable = true, order = 22, category = DB2Constants.CAT_AUTH)
    }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // -----------------------
    {
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        this.reference = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "REFAUTH"));
    public DB2AuthHeldType getControl()
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private DB2AuthHeldType update;
    @Property(viewable = true, order = 23, category = DB2Constants.CAT_AUTH)
 * Licensed under the Apache License, Version 2.0 (the "License");
        return index;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    {
import org.jkiss.dbeaver.DBException;
        return delete;
 * DBeaver - Universal Database Manager
    }
    @Property(viewable = true, order = 25, category = DB2Constants.CAT_AUTH)
        return insert;
    // -----------------------
    {
 *

import java.sql.ResultSet;
 * you may not use this file except in compliance with the License.
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
    {
    {

    public DB2AuthHeldType getAlter()
        this.select = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "SELECTAUTH"));
    // Properties
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DB2AuthHeldType getDelete()
    @Property(viewable = true, order = 24, category = DB2Constants.CAT_AUTH)

    public DB2AuthHeldType getReference()
 */
    // -----------------
    private DB2AuthHeldType reference;
        this.update = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "UPDATEAUTH"));

}
    }



 *
    public DB2AuthHeldType getInsert()
    public DB2AuthHeldType getSelect()

    // -----------------
/**
/*

 * Unless required by applicable law or agreed to in writing, software

    {
    public DB2AuthTableBase(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2TableBase db2TableBase, ResultSet resultSet)
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
    }

        this.control = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "CONTROLAUTH"));
import org.jkiss.utils.CommonUtils;
        this.delete = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "DELETEAUTH"));
    private DB2AuthHeldType control;
 * See the License for the specific language governing permissions and

        this.index = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "INDEXAUTH"));
    private DB2AuthHeldType delete;
package org.jkiss.dbeaver.ext.db2.model.security;
        return alter;
    }
    // Constructors
 * You may obtain a copy of the License at
    {
    }


    private DB2AuthHeldType alter;
        return update;
        return control;
    {
 * limitations under the License.
        this.alter = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "ALTERAUTH"));
        throws DBException
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private DB2AuthHeldType index;
public abstract class DB2AuthTableBase extends DB2AuthBase {
        this.insert = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "INSERTAUTH"));
    {
        return select;
