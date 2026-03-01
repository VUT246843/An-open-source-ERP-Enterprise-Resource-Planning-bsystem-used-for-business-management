/*

    @Property(order = 4, viewable = true)
    }
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 13)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            objectType,
        }
    public boolean isHierarchy()
    @NotNull
    }
    private String objectOwner;
 *
    }
        this.hierarchy = JDBCUtils.safeGetBoolean(resultSet, "HIERARCHY", OracleConstants.RESULT_YES_VALUE);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    {
        super(grantee, JDBCUtils.safeGetString(resultSet, OracleConstants.COL_TABLE_NAME), true);
public class OraclePrivObject extends OracleObject<OracleGrantee> implements DBAPrivilege {
        this.grantor = JDBCUtils.safeGetString(resultSet, "GRANTOR");
            getDataSource(),
 * you may not use this file except in compliance with the License.

/**
    @Property(viewable = true, order = 12)

            null,
    @Property(order = 11)
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
            name);
        return grantor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        if (monitor == null || CommonUtils.isEmpty(objectOwner)) {
        this.privilege = JDBCUtils.safeGetString(resultSet, "PRIVILEGE");
        return grantable;
        this.objectOwner = JDBCUtils.safeGetString(resultSet, OracleConstants.COL_OWNER);
    }
        this.objectType = JDBCUtils.safeGetString(resultSet, OracleConstants.COLUMN_OBJECT_TYPE);
 */
 * See the License for the specific language governing permissions and

    public String getPrivilege()
        if (this.objectOwner == null) this.objectOwner = JDBCUtils.safeGetString(resultSet, "TABLE_SCHEMA");
        return hierarchy;
 * Licensed under the Apache License, Version 2.0 (the "License");

    {
 *

    public OraclePrivObject(OracleGrantee grantee, ResultSet resultSet) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * OraclePrivObject

import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.access.DBAPrivilege;
        return OracleObjectType.resolveObject(

    private String grantor;
    }
    }
    private String privilege;
        return super.getName();
    {
    {
 * You may obtain a copy of the License at
            objectOwner,
        return objectType;
    @Property(order = 5, viewable = true, supportsPreview = true)
 *

    {
    }
            monitor,
    public String getName() {
    public boolean isGrantable()
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
        return privilege;
    private String objectType;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.oracle.model;
import org.jkiss.dbeaver.model.meta.Property;
    @Override
        this.grantable = JDBCUtils.safeGetBoolean(resultSet, "GRANTABLE", OracleConstants.RESULT_YES_VALUE);
    public String getObjectType()
    private boolean grantable;
    private boolean hierarchy;
 */
    public Object getObject(DBRProgressMonitor monitor) throws DBException
import java.sql.ResultSet;
            return name;
    @Property(viewable = true, order = 10)
    public String getGrantor()
}
