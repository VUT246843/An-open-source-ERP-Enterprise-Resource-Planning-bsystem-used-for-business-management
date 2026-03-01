 *     http://www.apache.org/licenses/LICENSE-2.0
    // Constructors
    public DBSObject getObject()

        return super.getObject();
 *
    }
/**
public class DB2AuthSequence extends DB2AuthBase {
    // -----------------
    // -----------------------
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * @author Denis Forveille

        super(monitor, db2Grantee, db2Sequence, resultSet);
    {
    }
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

    private DB2AuthHeldType usage;
 */
    // -----------------
import java.sql.ResultSet;
    @Property(viewable = true, order = 1)
    public DB2AuthHeldType getUsage()
 * Copyright (C) 2010-2024 DBeaver Corp and others
        throws DBException
    }
    {
import org.jkiss.dbeaver.ext.db2.model.DB2Sequence;
 * You may obtain a copy of the License at
    }
package org.jkiss.dbeaver.ext.db2.model.security;

/*
    @Property(viewable = true, order = 2)
 * limitations under the License.
    // -----------------------

        return usage;

        return alter;
    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
 * DB2 Authorisations on Sequences
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
    // Properties


import org.jkiss.dbeaver.DBException;

}

 * you may not use this file except in compliance with the License.
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
    {
        this.usage = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "USAGEAUTH"));
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    public DB2Schema getObjectSchema()
    {
        return super.getObjectSchema();
 * DBeaver - Universal Database Manager


 *
 * 
    private DB2AuthHeldType alter;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Unless required by applicable law or agreed to in writing, software
        this.alter = CommonUtils.valueOf(DB2AuthHeldType.class, JDBCUtils.safeGetString(resultSet, "ALTERAUTH"));
    }
    public DB2AuthSequence(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DB2Sequence db2Sequence, ResultSet resultSet)
    public DB2AuthHeldType getAlter()
