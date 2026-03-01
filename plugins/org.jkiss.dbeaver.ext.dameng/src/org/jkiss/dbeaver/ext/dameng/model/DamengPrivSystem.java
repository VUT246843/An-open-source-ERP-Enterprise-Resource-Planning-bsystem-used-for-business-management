public class DamengPrivSystem implements DBAPrivilege {
        return true;
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 2)


    private Boolean grantable;
 * @author Shengkai Bai
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 *
/*
        return null;
    }
/**
        return grantable;
    }
    private String name;
 */


 * See the License for the specific language governing permissions and

import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBPDataSource getDataSource() {
    @NotNull
    public DamengPrivSystem(DamengRole damengRole, JDBCResultSet resultSet) {
 */
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSObject;


import org.jkiss.dbeaver.model.access.DBAPrivilege;
        this.damengRole = damengRole;
    @Override
    public boolean isPersisted() {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0

        return damengRole.getDataSource();
    @Property(viewable = true, order = 1)
        return damengRole;

        return name;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
package org.jkiss.dbeaver.ext.dameng.model;

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Boolean getGrantable() {
    @Override
    public String getDescription() {
    public DBSObject getParentObject() {
    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
 * Unless required by applicable law or agreed to in writing, software
        this.grantable = "Y".equals(JDBCUtils.safeGetString(resultSet, "GRANTABLE"));
    private DamengRole damengRole;
    }
 *

import org.jkiss.dbeaver.model.DBPDataSource;
}
        this.name = JDBCUtils.safeGetString(resultSet, "PRIV");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * limitations under the License.

    public String getName() {
    @Override
    }
