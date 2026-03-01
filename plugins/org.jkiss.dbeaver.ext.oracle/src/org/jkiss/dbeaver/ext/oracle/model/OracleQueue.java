        this.dequeueEnabled = JDBCUtils.safeGetString(dbResult, "DEQUEUE_ENABLED");
    private QueueType queueType;

        EXCEPTION_QUEUE,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.Log;
    @Property(viewable = true, order = 6)
    }
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
}
    public OracleQueue(OracleSchema schema, String name) {
    @Property(viewable = true, order = 5)
 *
public class OracleQueue extends OracleSchemaObject {
        return dequeueEnabled;
        this.retryDelay = JDBCUtils.safeGetInteger(dbResult, "RETRY_DELAY");
    private String dequeueEnabled;

        NORMAL_QUEUE,

        this.retention = JDBCUtils.safeGetString(dbResult, "RETENTION");
    @NotNull

import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
/**

        return userComment;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public enum QueueType {
    private String retention;
    }

import java.sql.ResultSet;
    }
    @Property(viewable = true, order = 10)
import org.jkiss.dbeaver.model.meta.Property;
    }
        this.queueTable = JDBCUtils.safeGetString(dbResult, "QUEUE_TABLE");

    private String networkName;
    }
    public Integer getRetryDelay() {
        super(schema, name, false);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    private String userComment;
    }
    public QueueType getQueueType() {
        try {
    }
    public String getEnqueueEnabled() {
import org.jkiss.code.NotNull;
        return this.parent.tableCache.getObject(monitor, parent, queueTable);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static final Log log = Log.getLog(OracleQueue.class);

    @Property(viewable = true, order = 4)
        } catch (IllegalArgumentException e) {

    public String getNetworkName() {
            this.queueType = QueueType.valueOf(JDBCUtils.safeGetString(dbResult, "QUEUE_TYPE"));
    public OracleTableBase getQueueTable(DBRProgressMonitor monitor) throws DBException {
    @NotNull
 * limitations under the License.
 * Copyright (C) 2010-2017 Eugene Fradkin (eugene.fradkin@gmail.com)

        return retryDelay;
        NON_PERSISTENT_QUEUE,
    @Property(viewable = true, order = 3)
        return enqueueEnabled;
 * DBeaver - Universal Database Manager
    public String getRetention() {
 * You may obtain a copy of the License at
    private int qId;
        this.enqueueEnabled = JDBCUtils.safeGetString(dbResult, "ENQUEUE_ENABLED");
    private Integer maxRetries;
 */
/*

    public Integer getMaxRetries() {
    }
 *

    public String getDequeueEnabled() {
        this.userComment = JDBCUtils.safeGetString(dbResult, "USER_COMMENT");
        return maxRetries;
    private String enqueueEnabled;
    public OracleQueue(OracleSchema schema, ResultSet dbResult) {
    private Integer retryDelay;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return qId;
    @Property(viewable = true, order = 9)
    @Property(viewable = true, order = 2)
        super(schema, JDBCUtils.safeGetString(dbResult, "NAME"), true);
        this.qId = JDBCUtils.safeGetInt(dbResult, "QID");

    private String queueTable;
package org.jkiss.dbeaver.ext.oracle.model;
    @Property(viewable = true, order = 11)

    }
    public String getUserComment() {
 * Unless required by applicable law or agreed to in writing, software
        this.maxRetries = JDBCUtils.safeGetInteger(dbResult, "MAX_RETRIES");
 * See the License for the specific language governing permissions and
        return retention;
        return queueType;
            this.queueType = null;
        }
    }
    public int getQId() {
    };
    @Property(viewable = true, order = 7)
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, order = 8)
 * Oracle sequence
        return networkName;
        this.networkName = JDBCUtils.safeGetString(dbResult, "NETWORK_NAME");

    }
