    }
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
 * AltibasePrivUser
    public Object getLazyReference(Object propertyId) {
import org.jkiss.dbeaver.model.meta.Property;
 * See the License for the specific language governing permissions and
        this.user = this.name;
import org.jkiss.code.NotNull;
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        super(user, JDBCUtils.safeGetString(resultSet, "GRANTEE_NAME"));
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 2, supportsPreview = true)
package org.jkiss.dbeaver.ext.altibase.model;
    @NotNull
}    }
 *
    
 * limitations under the License.
        return grantor;
    
 *

/*

        }
        return AltibaseUtils.resolveLazyReference(monitor, getDataSource(), getDataSource().userCache, this, null);

import java.sql.ResultSet;
 * DBeaver - Universal Database Manager
        return this.user;
        grantor = JDBCUtils.safeGetString(resultSet, "GRANTOR_NAME");
import org.jkiss.dbeaver.ext.altibase.AltibaseUtils;
    public Object getUser(DBRProgressMonitor monitor) throws DBException {
        if (monitor == null) {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    
    }
    private String grantor;
    }
/**
 */
    @Override
    public AltibasePrivUser(AltibaseGrantee user, ResultSet resultSet) {
            return user;
    public String getGrantor() {
    @Property(viewable = true, order = 3)
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Object user;
    
 *
        return super.getName();
    public String getName() {
 * You may obtain a copy of the License at
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
public class AltibasePrivUser extends AltibasePriv implements DBSObjectLazy<AltibaseDataSource> {
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
