    }
        return damengRole.getDataSource();

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.dameng.model;
    @Override
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        this.damengRole = damengRole;
    @Override


    private String object;
    }
        this.objectType = JDBCUtils.safeGetString(resultSet, "SUB_TYPE");

        return damengRole;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 *
    public String getDescription() {
        this.grantor = JDBCUtils.safeGetString(resultSet, "GRANTOR_NAME");

    @NotNull
    @Override
import org.jkiss.dbeaver.model.meta.Property;
/**
    }
 * You may obtain a copy of the License at
    }

}
        return objectType;
    }
    public String getObjectType() {
/*
 */

    }
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public DBSObject getParentObject() {

    private String grantor;
        return privilege;
    @Override

    @Property(viewable = true, order = 4)
import java.sql.ResultSet;
        return object;
    @Property(viewable = true, order = 2)
    @Property(viewable = true, order = 3)
    @Property(viewable = true, order = 1)
    }
    public boolean isPersisted() {

import org.jkiss.code.NotNull;
    public String getName() {
    private String privilege;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DamengPrivObject(DamengRole damengRole, ResultSet resultSet) {
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPDataSource;

        return grantor;
import org.jkiss.dbeaver.model.access.DBAPrivilege;
        return true;
        this.privilege = JDBCUtils.safeGetString(resultSet, "PRIV");

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    public String getGrantor() {
    }
public class DamengPrivObject implements DBAPrivilege {
    private DamengRole damengRole;
    public DBPDataSource getDataSource() {
        return null;

 * limitations under the License.

        this.object = JDBCUtils.safeGetString(resultSet, "OBJECT_NAME");


 *
    public String getPrivilege() {
 * @author Shengkai Bai
    private String objectType;
