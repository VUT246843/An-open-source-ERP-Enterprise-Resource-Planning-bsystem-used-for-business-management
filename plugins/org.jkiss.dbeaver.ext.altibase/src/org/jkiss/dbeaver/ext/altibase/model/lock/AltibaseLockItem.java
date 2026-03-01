    @Property(viewable = true, order = 2)
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.lockCnt = JDBCUtils.safeGetInt(dbResult, "lock_cnt");
        return lockCnt;
    public AltibaseLockItem(ResultSet dbResult) {


    @Property(viewable = true, order = 5)

 *
        this.dbfId = JDBCUtils.safeGetLong(dbResult, "dbf_id");

    }
    }
    private String lockItemType;

    private String tbsName;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}    @Property(viewable = true, order = 4)
    }
    public int getLockCnt() {
    }
        this.tbsId = JDBCUtils.safeGetInt(dbResult, "tbs_id");
    }
/*
    public int getTbsId() {
        this.tableOid = JDBCUtils.safeGetLong(dbResult, "table_oid");



    @Property(viewable = true, order = 7)
 * you may not use this file except in compliance with the License.
 * limitations under the License.
import java.sql.ResultSet;
    public String getLockTargetObjType() {
        this.lockDesc = JDBCUtils.safeGetString(dbResult, "lock_desc");
 *
        return dbfId;
    @Property(viewable = true, order = 1)

    private long tableOid;
 */
    }

    }
 *
    public long getDbfOid() {

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;

    private int tbsId;
        return tbsName;
        return lockItemType;
 * Unless required by applicable law or agreed to in writing, software
    public long getTableOid() {
        return lockDesc;

package org.jkiss.dbeaver.ext.altibase.model.lock;
import org.jkiss.dbeaver.model.meta.Property;
        return tbsId;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.tbsName = JDBCUtils.safeGetString(dbResult, "tbs_name");
    @Property(viewable = true, order = 6)
    @Property(viewable = true, order = 3)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    private String lockDesc;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private long dbfId;
public class AltibaseLockItem implements DBAServerLockItem {
        this.lockItemType = JDBCUtils.safeGetString(dbResult, "locked_obj_type");
    public String getTbsName() {
 * See the License for the specific language governing permissions and
        return tableOid;

    public String getLockType() {
    private int lockCnt;
