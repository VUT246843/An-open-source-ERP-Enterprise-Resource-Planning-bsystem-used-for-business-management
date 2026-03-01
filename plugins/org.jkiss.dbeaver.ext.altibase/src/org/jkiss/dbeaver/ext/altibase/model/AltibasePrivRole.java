    }
import org.jkiss.dbeaver.DBException;
public class AltibasePrivRole extends AltibasePriv implements DBSObjectLazy<AltibaseDataSource> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    }
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
 * See the License for the specific language governing permissions and
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return this.role;
    
/*
            return role;
 *
        super(user, JDBCUtils.safeGetString(resultSet, "ROLE_NAME"));
    }
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.altibase.model;
    @Override
        grantor = JDBCUtils.safeGetString(resultSet, "GRANTOR_NAME");
 *

/**
    public String getName() {

    
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String grantor;
import java.sql.ResultSet;

import org.jkiss.code.NotNull;
        return name;
    @NotNull


    public AltibasePrivRole(AltibaseGrantee user, ResultSet resultSet) {
        return AltibaseUtils.resolveLazyReference(monitor, getDataSource(), getDataSource().roleCache, this, null);
    }
    public Object getRole(DBRProgressMonitor monitor) throws DBException {
 *
 * you may not use this file except in compliance with the License.
    public String getGrantor() {
    @Override
        return grantor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public Object getLazyReference(Object propertyId) {
    private Object role;
        
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * AltibasePrivRole

    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 2, supportsPreview = true)
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.code.Nullable;
        this.role = this.name;
import org.jkiss.dbeaver.ext.altibase.AltibaseUtils;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    @Nullable
 * limitations under the License.
        if (monitor == null) {
        }
 * You may obtain a copy of the License at
