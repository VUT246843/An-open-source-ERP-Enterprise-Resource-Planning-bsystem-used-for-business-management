import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.access.DBARole;
    // Associations
import org.jkiss.dbeaver.model.DBPSaveableObject;

 * @author Denis Forveille
    private final DBSObjectCache<DB2Role, DB2RoleDep> roleDepCache;
    private String remarks;
 *
    {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
 * You may obtain a copy of the License at
        this.id = JDBCUtils.safeGetInteger(resultSet, "ROLEID");
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.struct.DBSObject;
    private Timestamp createTime;

 * limitations under the License.
    // -----------------
        return DB2AuthIDType.R;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
        return auditPolicyName;
    @Property(viewable = true, length = PropertyLength.MULTILINE)
import org.jkiss.dbeaver.model.meta.PropertyLength;
    // -----------------
        this.createTime = JDBCUtils.safeGetTimestamp(resultSet, DB2Constants.SYSCOLUMN_CREATE_TIME);
    // -----------------------
    // -----------------
    public Collection<DB2RoleDep> getRoleDeps(DBRProgressMonitor monitor) throws DBException
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    // -----------------
import java.util.Collection;
    @Nullable

package org.jkiss.dbeaver.ext.db2.model.security;
    // Business Contract
    {
    @Override
/**
        return roleDepCache.getAllObjects(monitor, this);
    {
 * See the License for the specific language governing permissions and

    // -----------------------
    private Integer auditPolicyId;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
 * DBeaver - Universal Database Manager
    }

    public DB2AuthIDType getType()
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
        super(new VoidProgressMonitor(), db2DataSource, resultSet, "ROLENAME");

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DB2Role(DB2DataSource db2DataSource, ResultSet resultSet)
import org.jkiss.dbeaver.model.meta.Association;
        return auditPolicyId;
import java.sql.Timestamp;


        }

    @Property(viewable = false, category = DB2Constants.CAT_AUDIT)
 * DB2 Role
/*

        return id;
public class DB2Role extends DB2Grantee implements DBPSaveableObject, DBARole, DBPRefreshableObject {
    // Constructors
 * 
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
        return remarks;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    // -----------------------
    {
    {

    }
    }
    }

    public Integer getId()
    }
 */
import org.jkiss.dbeaver.model.meta.Property;


        this.remarks = JDBCUtils.safeGetString(resultSet, DB2Constants.SYSCOLUMN_REMARKS);
    public Timestamp getCreateTime()

 * Licensed under the Apache License, Version 2.0 (the "License");

    private static final String C_RL = "SELECT * FROM SYSCAT.ROLEAUTH WHERE ROLENAME=? ORDER BY GRANTEETYPE,GRANTEE WITH UR";
    public Integer getAuditPolicyId()
    @Property(viewable = false, category = DB2Constants.CAT_AUDIT)

    private Integer id;
    @Association
        this.roleDepCache = new JDBCObjectSimpleCache<>(DB2RoleDep.class, C_RL, getName());

    // -----------------------

        return this;
    }
 */
    public String getDescription()
    @Override
    // Properties
    public String getAuditPolicyName()
    }
    {
    @Override
    {
    private String auditPolicyName;
    @Property(viewable = true, order = 2)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (db2DataSource.isAtLeastV10_1()) {
}

 * Unless required by applicable law or agreed to in writing, software
        return createTime;
        roleDepCache.clearCache();
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 *
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
            this.auditPolicyName = JDBCUtils.safeGetString(resultSet, "AUDITPOLICYNAME");

import java.sql.ResultSet;
import org.jkiss.dbeaver.DBException;
    {
            this.auditPolicyId = JDBCUtils.safeGetInteger(resultSet, "AUDITPOLICYID");
