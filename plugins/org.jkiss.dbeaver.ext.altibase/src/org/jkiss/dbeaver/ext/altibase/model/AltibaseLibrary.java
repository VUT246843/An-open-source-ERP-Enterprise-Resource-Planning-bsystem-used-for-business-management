    private Timestamp created;
 */
    @NotNull
    @Property(viewable = true, order = 11)


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                JDBCUtils.safeGetLong(resultSet, "LIBRARY_ID"),
    @Property(viewable = true, order = 5)
    @Property(viewable = true, order = 2)
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private String fileSpec;
    }
        return status;
        fileSpec = JDBCUtils.safeGetString(resultSet, "FILE_SPEC");

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
public class AltibaseLibrary extends AltibaseObject<GenericStructContainer> implements DBPScriptObject, DBPRefreshableObject {
    }
 *
    }
    private String ddl;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.jkiss.utils.CommonUtils;


            ddl = ((AltibaseMetaModel) getDataSource().getMetaModel()).getLibraryDDL(monitor, this, options) + ";";
        AltibaseSchema schema = (AltibaseSchema) getParentObject();
        if (CommonUtils.isEmpty(ddl)) {
    @Override
    @Nullable
    @Property(viewable = true, order = 10)
        return lastDdlTime;
    }
import org.jkiss.dbeaver.model.meta.Property;
        return getObjectId();
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    public Timestamp getCreated() {
    public long getLibraryId() {
        return schema.getLibraryCache().refreshObject(monitor, schema, this);
 *

                JDBCUtils.safeGetString(resultSet, "LIBRARY_NAME"), 
    @Property(viewable = true, order = 4)
 * limitations under the License.
        }
    @NotNull
 * See the License for the specific language governing permissions and
    
    public String getFileSpec() {
        return ddl;
    protected AltibaseLibrary(GenericStructContainer parent, JDBCResultSet resultSet) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
    public Timestamp getLastDdlTime() {
        super(parent, 
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPScriptObject;
    @NotNull
    }
        lastDdlTime = JDBCUtils.safeGetTimestamp(resultSet, "LAST_DDL_TIME");

 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
}    private Timestamp lastDdlTime;
import java.util.Map;
    }
        return fileSpec;

 * You may obtain a copy of the License at

import java.sql.Timestamp;
        return created;
    }
    public String getStatus() {
import org.jkiss.dbeaver.DBException;
    @NotNull
    private String status;
        
package org.jkiss.dbeaver.ext.altibase.model;
                true);
        status = JDBCUtils.safeGetString(resultSet, "STATUS");

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        created = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");
 * you may not use this file except in compliance with the License.
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {


import org.jkiss.code.NotNull;
