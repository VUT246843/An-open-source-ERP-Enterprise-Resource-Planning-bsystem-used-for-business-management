    }
    public AltibaseReplicationSender(AltibaseReplication parent, JDBCResultSet resultSet) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        return readLogCount;
    }
    public long getGapSizeInByte() {

 * you may not use this file except in compliance with the License.

        return status;
        networkError = JDBCUtils.safeGetBoolean(resultSet, "NET_ERROR_FLAG", "1");
}        commitXsn = JDBCUtils.safeGetLong(resultSet, "COMMIT_XSN");
    public String getName() {
    private long xsn;
    @Property(viewable = true, order = 4)
    }
        return sentLogCount;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return networkError;

        sentLogCount = JDBCUtils.safeGetLong(resultSet, "SEND_LOG_COUNT");

    }
            case 8: return "Parallel";
            case 7: return "Failback Eager";
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
            case 2: return "Retry";
            case 1: return "Run";
/*

            case 5: return "Sync End";
package org.jkiss.dbeaver.ext.altibase.model;
/*
    public long getCommitXsn() {
    @NotNull
    public long getReadLogCount() {
            case 3: return "Sync Only";
    private String status;

 *


            case 8: return "Failback Flush";

    private long gapSizeInByte;
            case 5: return "Failback Slave";
        readLogCount = JDBCUtils.safeGetLong(resultSet, "READ_LOG_COUNT");
            default: return "Unknown";
        return startFlag;
 *
    public long getXsn() {
        startFlag = getStartFlag(JDBCUtils.safeGetLong(resultSet, "START_FLAG"));
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(parent);
    public boolean getNetworkError() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return "Sender";
    }


    private long commitXsn;
    public String getStatus() {
 */
            case 4: return "Sync Run";
    public long getGap() {
            case 0: return "Stop";
        return gapSizeInByte;
    private boolean networkError;
        status = getStatus(JDBCUtils.safeGetLong(resultSet, "STATUS"));

import org.jkiss.utils.ByteNumberFormat;
    private String getStartFlag(long value) {
 * Unless required by applicable law or agreed to in writing, software
 *

            case 1: return "Quick";
 * You may obtain a copy of the License at

            case 9: return "Idle";
 */
public class AltibaseReplicationSender extends AltibaseReplicationModule {
    @Property(viewable = true, order = 2, formatter = ByteNumberFormat.class)
    private String startFlag;
    private String getStatus(long value) {
    }

    private long sentLogCount;
    public String getStartFlag() {
            case 6: return "Recovery";
            case 0: return "Normal";
            case 7: return "Offline";
        switch ((int) value) {
    @Override
    public long getSentLogCount() {
    @Property(viewable = true, order = 6)
 * A thread to send replication target table's data to a peer database.
    }
        return commitXsn;
    @Property(viewable = true, order = 8)
    @Property(viewable = true, order = 7)
        return gapSizeInByte;
    }
            case 2: return "Sync";
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.meta.Property;
            case 4: return "Failback Master";
    @NotNull
        }
            default: return "Unknown";

 * See the License for the specific language governing permissions and
            case 3: return "Failback Normal";
    }
        }

            case 6: return "Sync";
    @Property(viewable = true, order = 5)
    }
    @Property(viewable = true, order = 9)
        switch ((int) value) {
    @Property(viewable = false, order = 1, hidden = true)
 * limitations under the License.
    @Property(viewable = true, order = 3)
        return xsn;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }

        gapSizeInByte = JDBCUtils.safeGetLong(resultSet, "GAP_SIZE_IN_BYTE");
 * DBeaver - Universal Database Manager
    private long readLogCount;
    }
        xsn = JDBCUtils.safeGetLong(resultSet, "XSN");
