        }
public class AltibaseDirectory extends AltibaseObject<GenericStructContainer> implements DBPScriptObject, DBPRefreshableObject {
    


 * See the License for the specific language governing permissions and
    public long getDirId() {
                true);

    }
    private String dirPath;
        if (CommonUtils.isEmpty(ddl)) {
    public String getDirName() {
        lastDdlTime = JDBCUtils.safeGetTimestamp(resultSet, "LAST_DDL_TIME");
 */
import org.jkiss.dbeaver.model.DBPScriptObject;

    
        return lastDdlTime;
 * limitations under the License.
import org.jkiss.dbeaver.model.meta.Property;
        return getObjectId();
import org.jkiss.code.NotNull;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    private Timestamp created;
                JDBCUtils.safeGetLong(resultSet, "DIRECTORY_ID"),
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
 *
        AltibaseSchema schema = (AltibaseSchema) getParentObject();
    public Timestamp getCreated() {
    private String ddl;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * distributed under the License is distributed on an "AS IS" BASIS,

        return schema.getDirectoryCache().refreshObject(monitor, schema, this);
import org.jkiss.code.Nullable;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @NotNull
    @Property(viewable = true, order = 4)
        return created;
    @Override
        return dirPath;
    @NotNull
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.altibase.model;

    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
    }
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 10)


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = true, order = 11)
    @NotNull
        
    }
import org.jkiss.dbeaver.DBException;
            ddl = ((AltibaseMetaModel) getDataSource().getMetaModel()).getDirectoryDDL(monitor, this, options) + ";";
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * DBeaver - Universal Database Manager
        created = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");
import org.jkiss.dbeaver.model.DBPRefreshableObject;
        dirPath = JDBCUtils.safeGetString(resultSet, "DIRECTORY_PATH");

    protected AltibaseDirectory(GenericStructContainer parent, JDBCResultSet resultSet) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Map;
    private Timestamp lastDdlTime;
}import java.sql.Timestamp;
    }
 *
    }
        return ddl;
        super(parent, 
 * Unless required by applicable law or agreed to in writing, software


    @Override
                JDBCUtils.safeGetString(resultSet, "DIRECTORY_NAME"), 
    public Timestamp getLastDdlTime() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, order = 2)
