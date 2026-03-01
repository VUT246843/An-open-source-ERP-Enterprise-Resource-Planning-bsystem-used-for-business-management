        isEnable = JDBCUtils.safeGetBoolean(resultSet, "IS_ENABLE", "T");
    }
    }
 */
    public String getName() {
 * you may not use this file except in compliance with the License.
    private String comment;
        jobId = JDBCUtils.safeGetInt(resultSet, "JOB_ID");
    @Property(viewable = true, order = 1)
    private Timestamp startTime;
    @Override
    @NotNull
        return lastExecTime;
    private int interval;
        return activated;
    @Property(viewable = true, order = 3)
    }

    private String execQuery;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Property(viewable = true, order = 12)


}
        return jobName;
import org.jkiss.utils.CommonUtils;
import java.sql.Timestamp;
    }
    }
    public int getExecCount() {
        return endTime;
        comment = JDBCUtils.safeGetString(resultSet, "COMMENT");
        execQuery = JDBCUtils.safeGetString(resultSet, "EXEC_QUERY");
    public int getJobId() {
    private String ddl;


    }

    }
        errorCode = JDBCUtils.safeGetString(resultSet, "ERROR_CODE");
    public String getComment() {
    @NotNull
    @NotNull
    private Timestamp lastExecTime;
    public String getExecQuery() {
    @NotNull
        AltibaseDataSource dataSouce = getDataSource();
        
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    }
 *

            ddl = ((AltibaseMetaModel) getDataSource().getMetaModel()).getJobDDL(monitor, this, options) + ";";
    }
        return ddl;

 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
        return execCount;
 * DBeaver - Universal Database Manager

    private Timestamp endTime;
    @Override
    @Property(viewable = true, order = 6)
 * Licensed under the Apache License, Version 2.0 (the "License");

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        return dataSouce.getJobCache().refreshObject(monitor, dataSouce, this);

    public Timestamp getEndTime() {
    public AltibaseJob(GenericStructContainer owner, @NotNull ResultSet resultSet) {

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0


        if (CommonUtils.isEmpty(ddl)) {
    @NotNull


        super((AltibaseDataSource) owner.getDataSource(), true);
 *
    public boolean getIsEnable() {
        activated = JDBCUtils.safeGetBoolean(resultSet, "STATE", "1");
import java.sql.ResultSet;
    private boolean activated; // state
    public String getErrorCode() {
    private String errorCode;

    
    @Property(viewable = true, order = 11)
    @Property(viewable = true, order = 10)
package org.jkiss.dbeaver.ext.altibase.model;
    public Timestamp getLastExecTime() {
    @NotNull
        jobName = JDBCUtils.safeGetString(resultSet, "JOB_NAME");
        return errorCode;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.meta.Property;
        execCount = JDBCUtils.safeGetInt(resultSet, "EXEC_COUNT");
    private String intervalType;
    private int execCount;
    @Property(viewable = true, order = 5)
    }
    @Property(viewable = true, order = 8)
    }
    @Property(viewable = true, order = 7)
    }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        endTime = JDBCUtils.safeGetTimestamp(resultSet, "END_TIME");
        lastExecTime = JDBCUtils.safeGetTimestamp(resultSet, "LAST_EXEC_TIME");
        return execQuery;
    @Property(viewable = true, order = 2)
        intervalType = JDBCUtils.safeGetString(resultSet, "INTERVAL_TYPE");
import org.jkiss.dbeaver.model.DBPRefreshableObject;
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 8)
    @Override
        return startTime;
    @NotNull
import org.jkiss.code.NotNull;
    }
public class AltibaseJob extends AltibaseGlobalObject implements DBPScriptObject, DBPRefreshableObject {
        return comment;
        return jobId;
    private String jobName;

    private boolean isEnable;
    private int jobId;
import org.jkiss.dbeaver.model.DBPScriptObject;
        startTime = JDBCUtils.safeGetTimestamp(resultSet, "START_TIME");
    @NotNull
        }
import java.util.Map;
        return isEnable;

    @Property(viewable = true, order = 4)
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return interval + " " + intervalType;
    }
        interval = JDBCUtils.safeGetInt(resultSet, "INTERVAL");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public Timestamp getStartTime() {
/*
    public boolean getActivated() {
    public String getinterval() {
