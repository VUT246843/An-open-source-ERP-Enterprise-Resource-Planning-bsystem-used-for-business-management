 * you may not use this file except in compliance with the License.
    
    }
 *

 * You may obtain a copy of the License at
    protected AltibaseDataFile(AltibaseTablespace parent, ResultSet dbResult) {
    }
 *
    @NotNull
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.code.NotNull;
/*
 *
        super(parent, JDBCUtils.safeGetString(dbResult, "NAME"), true);
package org.jkiss.dbeaver.ext.altibase.model;
    protected int spaceid;
        this.spaceid = JDBCUtils.safeGetInt(dbResult, "SPACEID");
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 1)
        return id;
}
        return name;
    public int getTbsId() {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * limitations under the License.
public abstract class AltibaseDataFile extends AltibaseObject<AltibaseTablespace> {
    }

    public String getName() {
    }
        return spaceid;
 * distributed under the License is distributed on an "AS IS" BASIS,

    
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 2)
import java.sql.ResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
    
 */

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, order = 3)
    protected int id;
    public int getId() {
 * See the License for the specific language governing permissions and
        this.id = JDBCUtils.safeGetInt(dbResult, "ID");
