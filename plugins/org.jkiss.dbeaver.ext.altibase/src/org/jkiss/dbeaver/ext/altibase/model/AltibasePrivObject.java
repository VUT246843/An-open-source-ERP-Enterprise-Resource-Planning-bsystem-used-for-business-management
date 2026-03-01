        grantable = JDBCUtils.safeGetBoolean(resultSet, "WITH_GRANT_OPTION", "1");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return objName;
        return objSchema;
    @Property(viewable = true, order = 4)
    @Property(viewable = true, order = 20)
    @Property(viewable = true, order = 1)
 * DBeaver - Universal Database Manager
        return grantorName;

    public String getObjName() {
    
    
        super(user, JDBCUtils.safeGetString(resultSet, "PRIV_NAME"));
 * limitations under the License.
    }
 * Unless required by applicable law or agreed to in writing, software
    }
    private String objSchema;
        grantorName = JDBCUtils.safeGetString(resultSet, "GRANTOR_NAME");
    
    public boolean getGrantable() {
/*
    protected AltibasePrivObject(AltibaseGrantee user, ResultSet resultSet) {
        return objType;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

 * you may not use this file except in compliance with the License.
    @Override
    @Property(viewable = true, order = 10)
 *
    }
}
        objSchema = JDBCUtils.safeGetString(resultSet, "SCHEMA_NAME");
    
    public String getObjSchema() {
    }
    
import org.jkiss.dbeaver.model.meta.Property;
    @NotNull
    
    }
package org.jkiss.dbeaver.ext.altibase.model;
 *
        return super.getName();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public String getGrantor() {
    private String grantorName;
 *     http://www.apache.org/licenses/LICENSE-2.0
    
    private String objName;
 *
 */
    
import java.sql.ResultSet;
    private String objType;
        objName = JDBCUtils.safeGetString(resultSet, "OBJ_NAME");
    public String getObjType() {

import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 3)
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getName() {
        objType = JDBCUtils.safeGetString(resultSet, "OBJ_TYPE");
        return grantable;
    private boolean grantable;
public class AltibasePrivObject extends AltibasePriv {
