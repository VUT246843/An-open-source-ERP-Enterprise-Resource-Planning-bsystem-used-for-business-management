
    }
public class DB2RoleAuth extends DB2Object<DB2Role> implements DBAPrivilege {
 * distributed under the License is distributed on an "AS IS" BASIS,

import java.sql.ResultSet;
}
            JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTORTYPE"));
        this.grantorType = CommonUtils.valueOf(DB2GrantorGranteeType.class,
        return grantor;
        return parent;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 1)
    {
    }
    // -----------------
    // -----------------------
    {
 * 
 *
 * @author Denis Forveille

 * limitations under the License.
    }
    @Property(viewable = true, order = 2)

        return admin;
    private DB2GrantorGranteeType grantorType;
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(hidden = true)
    @Override
package org.jkiss.dbeaver.ext.db2.model.security;
import org.jkiss.dbeaver.model.access.DBAPrivilege;
    private Boolean admin;
        return grantorType;
    // -----------------
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;

    {
    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public Boolean getAdmin()
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 4)
 */
 *
import org.jkiss.dbeaver.model.meta.Property;
    public DB2GrantorGranteeType getGrantorType()
    private String grantor;
    // Properties
 * you may not use this file except in compliance with the License.

    {
    public DB2RoleAuth(DB2Role role, ResultSet resultSet)
        return super.getName();
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.grantor = JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTOR");
import org.jkiss.dbeaver.ext.db2.model.DB2Object;
/*
    public String getName()
    public String getGrantor()
        this.admin = JDBCUtils.safeGetBoolean(resultSet, "ADMIN", DB2YesNo.Y.name());
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

    {
        super(role, JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTEE"), true);

import org.jkiss.code.NotNull;
    @NotNull
    }

    {
    // Constructors
 */
    // -----------------------
    public DB2Role getRole()
    @Property(viewable = true, order = 3)
 * DB2 Authorisations assigned to Roles

