        return super.getName();
 *
 *
        super(user, privName);
    }
 *
}
import java.sql.ResultSet;
    
    
        isGranted = (grantorName != null);
    @Override
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        super(user, JDBCUtils.safeGetString(resultSet, "PRIV_NAME"));
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private String grantorName;
 *     http://www.apache.org/licenses/LICENSE-2.0
    

    protected AltibasePrivSystem(AltibaseGrantee user, ResultSet resultSet) {

    public String getName() {
    }
    }

 * limitations under the License.
public class AltibasePrivSystem extends AltibasePriv {
 * Unless required by applicable law or agreed to in writing, software
        return grantorName;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getGrantor() {
    }
    @Property(viewable = true, order = 4)
    @Property(viewable = true, order = 2)
 * you may not use this file except in compliance with the License.
    private boolean isGranted;
 */
    public boolean getGranted() {
package org.jkiss.dbeaver.ext.altibase.model;
    }
 * You may obtain a copy of the License at
    
        return isGranted;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    
        isGranted = true;
 * DBeaver - Universal Database Manager
    
    protected AltibasePrivSystem(AltibaseGrantee user, String privName) {
    @Property(viewable = true, order = 3)
 * See the License for the specific language governing permissions and
        grantorName = JDBCUtils.safeGetString(resultSet, "GRANTOR_NAME");
    // For special account: SYSTEM_, SYS account
 * Licensed under the Apache License, Version 2.0 (the "License");
