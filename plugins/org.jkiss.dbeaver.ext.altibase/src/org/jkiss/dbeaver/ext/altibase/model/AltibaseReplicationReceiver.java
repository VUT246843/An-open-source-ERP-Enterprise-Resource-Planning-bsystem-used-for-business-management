 */
 * limitations under the License.

        applyXsn = JDBCUtils.safeGetLong(resultSet, "APPLY_XSN");
        insertFailureCount = JDBCUtils.safeGetLong(resultSet, "INSERT_FAILURE_COUNT");
    }
    public long getInsertSuccessCount() {
    private long insertFailureCount = 0;

    private long insertSuccessCount = 0;

}
    @Property(viewable = true, order = 7)
    }
    @NotNull
    }
        return deleteFailureCount;
    @Property(viewable = false, order = 1, hidden = true)
    }
    @Property(viewable = true, order = 5)
    public long getInsertFailureCount() {
    }
    @Property(viewable = true, order = 3)
    @Property(viewable = true, order = 8)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*

    @Property(viewable = true, order = 4)
/*
    }
    private long deleteFailureCount = 0;
        insertSuccessCount = JDBCUtils.safeGetLong(resultSet, "INSERT_SUCCESS_COUNT");

 * distributed under the License is distributed on an "AS IS" BASIS,

 * A thread to receive replication target table's data from a peer database.
        super(parent);
        updateFailureCount = JDBCUtils.safeGetLong(resultSet, "UPDATE_FAILURE_COUNT");
    public long getDeleteFailureCount() {
    private long deleteSuccessCount = 0;


        return insertSuccessCount;
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 9)
        updateSuccessCount = JDBCUtils.safeGetLong(resultSet, "UPDATE_SUCCESS_COUNT");
    public long getUpdateSuccessCount() {
        return updateFailureCount;
    }
    private long applyXsn = -1;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
package org.jkiss.dbeaver.ext.altibase.model;
        deleteSuccessCount = JDBCUtils.safeGetLong(resultSet, "DELETE_SUCCESS_COUNT");
    public long getApplyXsn() {
        return "Receiver";

        return updateSuccessCount;
    private long updateSuccessCount = 0;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getName() {
    public long getDeleteSuccessCount() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
public class AltibaseReplicationReceiver extends AltibaseReplicationModule {
    }

 * you may not use this file except in compliance with the License.
    @Override

    public long getUpdateFailureCount() {
        return applyXsn;
    public AltibaseReplicationReceiver(AltibaseReplication parent, JDBCResultSet resultSet) {

 *
 *
 * See the License for the specific language governing permissions and
    private long updateFailureCount = 0;
    }
    @Property(viewable = true, order = 6)
        return insertFailureCount;
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        deleteFailureCount = JDBCUtils.safeGetLong(resultSet, "DELETE_FAILURE_COUNT");
import org.jkiss.code.NotNull;
 *
        return deleteSuccessCount;
 *     http://www.apache.org/licenses/LICENSE-2.0
