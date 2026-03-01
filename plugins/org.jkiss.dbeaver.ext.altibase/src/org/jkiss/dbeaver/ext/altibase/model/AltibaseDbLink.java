        }
        return userName;

        if (isPublic()) {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    @Property(viewable = true, order = 8)
            AltibaseDataSource dataSouce = getDataSource();

    protected AltibaseDbLink(GenericStructContainer parent, JDBCResultSet resultSet) {
    public String getRemoteUserId() {
        return dbsObject;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    public Timestamp getCreated() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
        super(parent, 
    @NotNull
 *

 * DBeaver - Universal Database Manager
    private String remoteUserId;
import java.util.Map;
        created = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");
        remoteUserId = JDBCUtils.safeGetString(resultSet, "REMOTE_USER_ID");
 * You may obtain a copy of the License at
        // Schema DbLink
    @NotNull

import java.sql.Timestamp;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

    private Timestamp created;
 *
                JDBCUtils.safeGetString(resultSet, "LINK_NAME"), 

                true);
package org.jkiss.dbeaver.ext.altibase.model;
        if (CommonUtils.isEmpty(ddl)) {
        } else {
    @NotNull
    public long getLinkOid() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            options.put("SCHEMA", isPublic() ? "PUBLIC" : this.getParentObject().getName());
public class AltibaseDbLink extends AltibaseObject<GenericStructContainer> implements DBPScriptObject, DBPRefreshableObject {
    }


                JDBCUtils.safeGetLong(resultSet, "LINK_OID"),
    @Property(viewable = true, order = 4)
            ddl = ((AltibaseMetaModel) getDataSource().getMetaModel()).getDbLinkDDL(monitor, this, options) + ";";
        return lastDdlTime;
        return linkId;
    private Timestamp lastDdlTime;
    }
            dbsObject = dataSouce.getDbLinkCache().refreshObject(monitor, dataSouce, this);
import org.jkiss.dbeaver.model.DBPScriptObject;
        linkId = JDBCUtils.safeGetInt(resultSet, "LINK_ID");
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    private int linkType; // Heterogeneous Link or Homogeneous Link: Only Heterogeneous since 6.5.1
        // Non-schema DbLink
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    private int linkId;
        return (linkType == 0) ? "Heterogeneous" : "Homogeneous";
    }

import org.jkiss.code.NotNull;
            AltibaseSchema schema = (AltibaseSchema) getParentObject();
        
import org.jkiss.utils.CommonUtils;
        return targetName;
    private String ddl;
    public Timestamp getLastDdlTime() {
    @Override
import org.jkiss.dbeaver.DBException;
    }

    private boolean isPublic() {
    @Property(viewable = true, order = 7)

    public String getUserName() {
    }
        userName = JDBCUtils.safeGetString(resultSet, "USER_NAME");
 * you may not use this file except in compliance with the License.
    }
    }

 * Licensed under the Apache License, Version 2.0 (the "License");

    private int userMode; // 0:public, 1: private
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getTargetName() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * See the License for the specific language governing permissions and
    }

    private String targetName;
}        targetName = JDBCUtils.safeGetString(resultSet, "TARGET_NAME");
    public String getUserMode() {
        return isPublic() ? "Public" : "Private";
        return created;
    public int getLinkId() {
        DBSObject dbsObject = null;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return getObjectId();
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Property(viewable = true, order = 10)
        }
    @NotNull
    }
        return ddl;
        userMode = JDBCUtils.safeGetInt(resultSet, "USER_MODE");
        return remoteUserId;
    private String userName; // null for public, user_id for private
    }
 *
    @Property(viewable = true, order = 11)
 * limitations under the License.
        return (userMode == 0);
    @Property(viewable = true, order = 5)
    @NotNull
    @NotNull
    }
    @NotNull
/*
    public String getLinkType() {
    @Property(viewable = true, order = 6)
            dbsObject = schema.getDbLinkCache().refreshObject(monitor, schema, this);
    @Property(viewable = true, order = 3)


        

        lastDdlTime = JDBCUtils.safeGetTimestamp(resultSet, "LAST_DDL_TIME");
    }
import org.jkiss.dbeaver.model.meta.Property;
        linkType = JDBCUtils.safeGetInt(resultSet, "LINK_TYPE");
 */
    /* null in case of public DbLink */

