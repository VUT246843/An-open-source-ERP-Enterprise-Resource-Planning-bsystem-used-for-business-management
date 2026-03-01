    @Override
    @Property(viewable = true, order = 4)
    public Object getUser(DBRProgressMonitor monitor) throws DBException
}

 *
    }
        return super.getName();
    {
        return OracleUtils.resolveLazyReference(monitor, getDataSource(), getDataSource().userCache, this, null);
 */
package org.jkiss.dbeaver.ext.oracle.model;
import java.sql.ResultSet;
    }
        }
public class OraclePrivUser extends OraclePriv implements DBSObjectLazy<OracleDataSource> {
import org.jkiss.code.Nullable;
    private boolean defaultRole;
/*

 *
    public OraclePrivUser(OracleGrantee user, ResultSet resultSet) {
    @NotNull

import org.jkiss.dbeaver.model.struct.DBSObjectLazy;

 * limitations under the License.
    public String getName() {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 2, supportsPreview = true)
    @Nullable
    public boolean isDefaultRole()
        return defaultRole;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.meta.Property;
 * DBeaver - Universal Database Manager

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (monitor == null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * OraclePrivUser
 *
        this.defaultRole = JDBCUtils.safeGetBoolean(resultSet, "DEFAULT_ROLE", OracleConstants.RESULT_YES_VALUE);
    {
        super(user, JDBCUtils.safeGetString(resultSet, "GRANTEE"), resultSet);
import org.jkiss.dbeaver.model.DBConstants;
    public Object getLazyReference(Object propertyId)
 * you may not use this file except in compliance with the License.
    private Object user;

 * Unless required by applicable law or agreed to in writing, software
/**

 * distributed under the License is distributed on an "AS IS" BASIS,


    }
    }
            return user;
    }
import org.jkiss.code.NotNull;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.user = this.name;
 */
        return this.user;
