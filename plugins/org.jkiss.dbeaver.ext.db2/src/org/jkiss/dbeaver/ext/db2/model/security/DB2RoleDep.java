
public class DB2RoleDep extends DB2Object<DB2Role> implements DBAPrivilege {
        return grantee;
        default:
 * DBeaver - Universal Database Manager

 */
    // Constructors
            break;
        case G:
        String granteeName = JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTEE");
import org.jkiss.dbeaver.model.access.DBAPrivilege;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        case U:
        }
    // -----------------

        this.granteeType = CommonUtils.valueOf(DB2GrantorGranteeType.class,
 * @author Denis Forveille
    }
            this.grantee = getDataSource().getGroup(new VoidProgressMonitor(), granteeName);

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.code.NotNull;

            JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTEETYPE"));

            break;
import org.jkiss.dbeaver.DBException;
    }
 *
import org.jkiss.dbeaver.model.meta.Property;

        return granteeType;

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
    }
    // -----------------------
            break;
    public DB2Grantee getGrantee()
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    // Properties
        case R:
        switch (granteeType) {

 * DB2 Role used by Users and Groups
    public DB2GrantorGranteeType getGranteeType()
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
 *
    @Property(viewable = true, order = 1)
            this.grantee = getDataSource().getRole(new VoidProgressMonitor(), granteeName);
    {
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DB2RoleDep(DB2Role role, ResultSet resultSet) throws DBException
    public String getName()
    {
 * See the License for the specific language governing permissions and

        this.admin = JDBCUtils.safeGetBoolean(resultSet, "ADMIN", DB2YesNo.Y.name());
    private Boolean admin;
 */
        super(role, JDBCUtils.safeGetString(resultSet, "GRANTEE"), true);
package org.jkiss.dbeaver.ext.db2.model.security;
            break;

            this.grantee = getDataSource().getUser(new VoidProgressMonitor(), granteeName);
    @Property(viewable = true, order = 3)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    // -----------------
/**
        return admin;
}
import org.jkiss.dbeaver.ext.db2.model.DB2Object;
    DB2GrantorGranteeType granteeType;
        return super.getName();
    {
import java.sql.ResultSet;
    @Property(hidden = true)
    public Boolean getAdmin()
    private DB2Grantee grantee;
    // -----------------------

    @Property(viewable = true, order = 2)
 * 
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {
/*
