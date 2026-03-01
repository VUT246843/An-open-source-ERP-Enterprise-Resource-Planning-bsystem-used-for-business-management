 * limitations under the License.
    public DamengUser(DamengDataSource dataSource, JDBCResultSet dbResult) {
        LOCKED,
    public String getName() {
        this.lockedStatus = JDBCUtils.safeGetInt(dbResult, "LOCKED_STATUS") == 2 ? LockedStatus.UNLOCKED : LockedStatus.LOCKED;
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
    }
        return true;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getDescription() {
 *
 *

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    public enum LockedStatus {
    public boolean isPersisted() {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.Property;
/**
import java.util.Map;
        return dataSource;
    }
        this.dataSource = dataSource;
    private long id;
 * you may not use this file except in compliance with the License.
    }
        this.id = JDBCUtils.safeGetLong(dbResult, DamengConstants.ID);
 * See the License for the specific language governing permissions and
        return lockedStatus;

    public Type getType() {

    @Property(viewable = true, order = 2)
        int typeValue = JDBCUtils.safeGetInt(dbResult, DamengConstants.INFO1);
    @Property(viewable = true, order = 5)

 * You may obtain a copy of the License at
    @Override
 * DBeaver - Universal Database Manager
        this.tablespaceId = JDBCUtils.safeGetInt(dbResult, "TABLESPACE_ID");

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.access.DBAUser;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * @author Shengkai Bai
 * Unless required by applicable law or agreed to in writing, software
    }
    public DamengTablespace getTablespace(DBRProgressMonitor monitor) throws DBException {

    private long tablespaceId;


    private DamengDataSource dataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String name;
        this.name = JDBCUtils.safeGetString(dbResult, DamengConstants.NAME);
    @NotNull
import org.jkiss.dbeaver.DBException;
    public Timestamp getCreateTime() {

        SSO,

        return null;
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

    public LockedStatus getLockedStatus() {
    }
    private Timestamp createTime;
import org.jkiss.dbeaver.model.struct.DBSObject;
    public DBPDataSource getDataSource() {

        return DamengUtils.getDDL(monitor, this, DamengConstants.ObjectType.USER, null);
    @Override
        return type;
        return getDataSource().getContainer();
    private Type type;
import java.sql.Timestamp;
}
    @Property(viewable = true, order = 4)
    }
    @Property(viewable = true, order = 1)
        DBO,
    public enum Type {

    }

        this.type = Type.values()[typeValue];
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
        SYS
import org.jkiss.dbeaver.model.DBPDataSource;
public class DamengUser implements DBAUser, DBPScriptObject, DBPObjectWithLongId {
    }

        UNLOCKED
 */

        DBA,
import org.jkiss.dbeaver.model.DBPObjectWithLongId;
import org.jkiss.dbeaver.model.DBPScriptObject;
    }
        AUDITOR,
    }
    @Override
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        return id;

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DamengConstants.CRTDATE);
    @NotNull
    @Property(viewable = true, order = 6)
    }

    public long getObjectId() {
    private LockedStatus lockedStatus;


        return name;
    @Property(viewable = true, order = 3)
    @Override
    }
        return this.dataSource.getTablespaceById(monitor, tablespaceId);
/*
    }
    @Override


        return createTime;
package org.jkiss.dbeaver.ext.dameng.model;
    public DBSObject getParentObject() {
