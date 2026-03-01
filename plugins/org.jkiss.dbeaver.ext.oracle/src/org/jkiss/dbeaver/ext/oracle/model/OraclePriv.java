import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    {
    @Override
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0


    }
    @Property(viewable = true, order = 3)

import org.jkiss.dbeaver.model.access.DBAPrivilege;

 * you may not use this file except in compliance with the License.
}
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean adminOption;
 */
    public boolean isAdminOption()
/**
    public OraclePriv(OracleGrantee user, String name, ResultSet resultSet) {

 *
        return adminOption;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
import java.sql.ResultSet;
        this.adminOption = JDBCUtils.safeGetBoolean(resultSet, "ADMIN_OPTION", OracleConstants.RESULT_YES_VALUE);
    }

package org.jkiss.dbeaver.ext.oracle.model;
 * You may obtain a copy of the License at
        return super.getName();
import org.jkiss.dbeaver.model.meta.Property;
 * Unless required by applicable law or agreed to in writing, software
 * OraclePrivRole
        super(user, name, true);
    public String getName() {
/*
 */
public abstract class OraclePriv extends OracleObject<OracleGrantee> implements DBAPrivilege {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * Copyright (C) 2010-2024 DBeaver Corp and others
