    }

        this.damengRole = damengRole;

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    }
    private long userId;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    public boolean isPersisted() {
 *

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBSObject getParentObject() {
import org.jkiss.dbeaver.model.access.DBAPrivilege;
    public String getName() {

        return ((DamengDataSource) getDataSource()).getUserById(monitor, userId);

/**
    @Override
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
 */
        return null;
    public DamengPrivUser(DamengRole damengRole, JDBCResultSet dbResult) {

    @NotNull
package org.jkiss.dbeaver.ext.dameng.model;
    public String getDescription() {
        return damengRole;

import org.jkiss.dbeaver.model.DBPDataSource;
    private DamengRole damengRole;

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true)
 * you may not use this file except in compliance with the License.
    }
    @Override
    public DamengUser getUser(DBRProgressMonitor monitor) throws DBException {
    }
        return damengRole.getDataSource();
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return name;
}
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at


    }

import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.code.NotNull;
    @Override
public class DamengPrivUser implements DBAPrivilege {
 * @author Shengkai Bai
 */
        this.userId = JDBCUtils.safeGetLong(dbResult, DamengConstants.ID);
    private String name;

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
/*
    public DBPDataSource getDataSource() {
        this.name = JDBCUtils.safeGetString(dbResult, DamengConstants.NAME);
        return true;
