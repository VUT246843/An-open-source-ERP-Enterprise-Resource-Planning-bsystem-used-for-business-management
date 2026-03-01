        this.elapsedSeconds = JDBCUtils.safeGetLong(dbResult, "ELAPSED_SECONDS");
 *
/*
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    @Property(viewable = true, order = 4)
    }
    private Date timestamp;
    @Property(viewable = true, order = 2)
public class OracleServerLongOp implements DBPObject {
    private String units;
    public String getTarget() {
    }
    public String getTargetDesc() {
        return lastUpdateTime;
        return opName;
    @Property(viewable = false, order = 9)
package org.jkiss.dbeaver.ext.oracle.model.session;
        this.targetDesc = JDBCUtils.safeGetString(dbResult, "TARGET_DESC");
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = false, order = 7)
    }
        return target;
    @Property(viewable = true, order = 1)
    public OracleServerLongOp(ResultSet dbResult) {
    public String toString() {



 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPObject;
}
 * DBeaver - Universal Database Manager
    }



        return opName;
    public long getElapsedSeconds() {
        return soFar;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.units = JDBCUtils.safeGetString(dbResult, "UNITS");
 *
    @Property(viewable = false, order = 8)


        return elapsedSeconds;

        this.opName = JDBCUtils.safeGetString(dbResult, "OPNAME");
    private Date lastUpdateTime;
import org.jkiss.dbeaver.model.meta.Property;
    }

import java.util.Date;
    }
        this.timeRemaining = JDBCUtils.safeGetLong(dbResult, "TIME_REMAINING");
    @Property(viewable = true, order = 3)
 * See the License for the specific language governing permissions and
        this.startTime = JDBCUtils.safeGetTimestamp(dbResult, "START_TIME");
    public Date getLastUpdateTime() {
 * Unless required by applicable law or agreed to in writing, software
        this.target = JDBCUtils.safeGetString(dbResult, "TARGET");

    public String getOpName() {
 */
/**
        this.timestamp = JDBCUtils.safeGetTimestamp(dbResult, "TIMESTAMP");
    private long elapsedSeconds;
        this.lastUpdateTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_UPDATE_TIME");
    private String opName;
        this.soFar = JDBCUtils.safeGetLong(dbResult, "SOFAR");
    @Property(viewable = true, order = 11)
 * Session
    @Property(viewable = false, order = 6)
    }
        return timestamp;
    private String target;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return startTime;
        return targetDesc;
    private long soFar;
 * You may obtain a copy of the License at
    private long timeRemaining;
        return units;
        return timeRemaining;

    public String getUnits() {

import java.sql.ResultSet;
 * limitations under the License.

        return totalWork;

    public long getTotalWork() {
    @Property(viewable = true, order = 5)
    private Date startTime;
    private long totalWork;
    private String targetDesc;

    public Date getTimestamp() {
    }
    public long getSoFar() {
 * you may not use this file except in compliance with the License.
    public Date getStartTime() {
    @Override
    @Property(viewable = true, order = 10)
    }
    public long getTimeRemaining() {
    }
    }
    }
        this.totalWork = JDBCUtils.safeGetLong(dbResult, "TOTALWORK");

