    @Property(viewable = true, order = 2)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.targetObjName = JDBCUtils.safeGetString(dbResult, "OBJECT_NAME");
    @Nullable
    private String targetObjOwner;
 *
 * @author Chao Tian
    }
        return owner;

 *     http://www.apache.org/licenses/LICENSE-2.0
}
/**
        this.owner = JDBCUtils.safeGetString(dbResult, "TABLE_SCHEM");
    }
    @Override
        super(container, name, description);
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

    public String getOwner() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.targetObjOwner = JDBCUtils.safeGetString(dbResult, "OBJECT_OWNER");
/*
            @NotNull JDBCResultSet dbResult) {
 * You may obtain a copy of the License at
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
    private String targetObjName;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        return getDataSource().findTable(monitor, null, this.targetObjOwner, this.targetObjName);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
 */
 */
    public DBSObject getTargetObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.code.NotNull;
 *
 *
    public GBase8sSynonym(@NotNull GenericStructContainer container, @NotNull String name, @Nullable String description,
    @Property(viewable = true, editable = false, order = 3)
    private String owner;


public class GBase8sSynonym extends GenericSynonym {


import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.meta.Property;

    }
package org.jkiss.dbeaver.ext.gbase8s.model;

