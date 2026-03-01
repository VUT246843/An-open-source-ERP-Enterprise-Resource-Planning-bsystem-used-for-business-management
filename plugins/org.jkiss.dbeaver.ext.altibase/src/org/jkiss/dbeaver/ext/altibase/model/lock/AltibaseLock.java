    }
        return objSchema;
    }
    @Property(viewable = true, order = 14)
        return this.waiters;
}    private DBAServerLock hold = null;
    public Integer getHoldID() {
    private int    holdSid;
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.meta.Property;
import java.util.ArrayList;

    @Property(viewable = true, order = 4)
    }
    private String waitUser;
    public int getHold_pid() {
    }
    @Property(viewable = true, order = 2)
    }
    @Property(viewable = true, order = 10)
    @Property(viewable = true, order = 12)
    }
    }
    }
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.waitTxid = JDBCUtils.safeGetInt(dbResult, "w_txid");
    private int    waitSid;
        return waitTxid;
    private String waitQuery;


    private int    waitTxid;
 * Unless required by applicable law or agreed to in writing, software
        return hold;
 * You may obtain a copy of the License at

        this.waitSid = JDBCUtils.safeGetInt(dbResult, "w_sid");
        return hold;
    @Override
import java.sql.ResultSet;
    private String holdQuery;

    @Property(viewable = true, order = 6)
    private int    holdTxid;
    private int    waitPid;
    }
        this.objSchema = JDBCUtils.safeGetString(dbResult, "w_obj_name");
    @Property(viewable = true, order = 5)
    public int getWait_txid() {
    public AltibaseLock(ResultSet dbResult, AltibaseDataSource dataSource) {
        return waitSid;
    @Override
        return waitUser;

    @Property(viewable = true, order = 3)
    }

    @Property(viewable = true, order = 11)
        return waitPid;
    private int    holdPid;
package org.jkiss.dbeaver.ext.altibase.model.lock;
    }
        return String.valueOf(waitSid);
    public int getWait_sid() {
        return objName;

        return holdSid;

import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
public class AltibaseLock implements DBAServerLock {
    }

        this.hold = lock;
        this.waitUser = JDBCUtils.safeGetString(dbResult, "w_user_name");

    @Override
        return dataSource;
    @Property(viewable = true, order = 1)
    public String getWait_query() {
 * you may not use this file except in compliance with the License.
        this.holdUser = JDBCUtils.safeGetString(dbResult, "h_user_name");

    public int getHold_txid() {

        this.holdSid  = JDBCUtils.safeGetInt(dbResult, "h_sid");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private List<DBAServerLock> waiters = new ArrayList<>(0);

    }
    public String getTitle() {


 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        return holdQuery;

 *
        this.holdPid = JDBCUtils.safeGetInt(dbResult, "h_pid");

 *

    }

        return holdPid;
 * limitations under the License.
        return waitQuery;
    private String holdUser;
    public List<DBAServerLock> waitThis() {
/*
    }

    public void setHoldBy(DBAServerLock lock) {
        return waitSid;
        this.waitQuery = JDBCUtils.safeGetString(dbResult, "w_query");

    @Override

    }
    @Override
    public String getOname() {
    public String getHold_query() {
    @Property(viewable = true, order = 13)
    @Property(viewable = true, order = 7)
import java.util.List;
        return holdSid;
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
    public AltibaseDataSource getDataSource() {
    @Override


        return holdUser;
    public String getOwner() {
        this.holdTxid = JDBCUtils.safeGetInt(dbResult, "h_txid");

    }

    public Integer getId() {
    public int getWait_pid() {
    private AltibaseDataSource dataSource;

    private String objSchema;

 *
    }

        return holdTxid;
    public int getHold_sid() {
        this.holdQuery = JDBCUtils.safeGetString(dbResult, "h_query");
        this.dataSource = dataSource;
    }
    public String getWait_user() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.objName = JDBCUtils.safeGetString(dbResult, "w_obj_schema");
        this.waitPid = JDBCUtils.safeGetInt(dbResult, "w_pid");
    public String getHold_user() {

    private String objName;
    public DBAServerLock getHold() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public DBAServerLock getHoldBy() {
