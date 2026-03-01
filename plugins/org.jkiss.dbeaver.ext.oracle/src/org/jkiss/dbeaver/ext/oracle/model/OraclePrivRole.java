 *
    @Override

    }


    private Object role;
        super(user, JDBCUtils.safeGetString(resultSet, "GRANTED_ROLE"), resultSet);
 * DBeaver - Universal Database Manager
    {
 *
}
        this.defaultRole = JDBCUtils.safeGetBoolean(resultSet, "DEFAULT_ROLE", OracleConstants.RESULT_YES_VALUE);

 */
    }
    @Nullable
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 2, supportsPreview = true)
    public Object getRole(DBRProgressMonitor monitor) throws DBException
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBConstants;

 * you may not use this file except in compliance with the License.
        return this.role;
 *
 * You may obtain a copy of the License at
 * OraclePrivRole
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
package org.jkiss.dbeaver.ext.oracle.model;
    @Override
        if (monitor == null) {

import org.jkiss.dbeaver.model.meta.Property;
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
        return OracleUtils.resolveLazyReference(monitor, getDataSource(), getDataSource().roleCache, this, null);
        return super.getName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return role;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getName() {
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
    public boolean isDefaultRole()
public class OraclePrivRole extends OraclePriv implements DBSObjectLazy<OracleDataSource> {
/**
        }
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    }

    @Property(viewable = true, order = 4)
    public OraclePrivRole(OracleGrantee user, ResultSet resultSet) {
 */
        this.role = this.name;
 * limitations under the License.
        return defaultRole;
    }

    {
 * See the License for the specific language governing permissions and
    private boolean defaultRole;

/*
    public Object getLazyReference(Object propertyId)
