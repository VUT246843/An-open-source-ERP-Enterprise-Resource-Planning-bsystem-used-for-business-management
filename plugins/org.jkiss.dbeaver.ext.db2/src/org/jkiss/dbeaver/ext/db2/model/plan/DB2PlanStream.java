    // ------------
            return DB2PlanObject.buildName(objectSchema, objectName);
/*
 * limitations under the License.

    public DB2PlanStream(JDBCResultSet dbResult, DB2PlanStatement db2Statement)
    private DB2PlanNodeType targetType;
        this.objectName = JDBCUtils.safeGetString(dbResult, "OBJECT_NAME");
        this.sourceId = JDBCUtils.safeGetInteger(dbResult, "SOURCE_ID");
public class DB2PlanStream {
        this.db2Statement = db2Statement;


        }
    public String getTargetName()
        } else {
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
package org.jkiss.dbeaver.ext.db2.model.plan;
    {
    {
    private Integer targetId;
    }

    {
 */
    private String objectName;
        return sourceType;
    {
 * DBeaver - Universal Database Manager
    private String objectSchema;
            return DB2PlanObject.buildName(objectSchema, objectName);
    private Integer streamId;

    // ------------
    {

        return objectSchema;
 *

    {
 * DB2 EXPLAIN_STREAM table
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return sourceId;
    public String getObjectName()


 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private Double streamCount;
/**
 * Unless required by applicable law or agreed to in writing, software
    {
        this.targetId = JDBCUtils.safeGetInteger(dbResult, "TARGET_ID");
        return streamCount;
        }
    }
        if (sourceType.equals(DB2PlanNodeType.O)) {
    }

        if (targetType.equals(DB2PlanNodeType.O)) {
    private DB2PlanStatement db2Statement;
    }
        return db2Statement;
 * you may not use this file except in compliance with the License.
    // ----------------
    {

            // Operator
        this.streamCount = JDBCUtils.safeGetDouble(dbResult, "STREAM_COUNT");
        return streamId;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
            return DB2PlanOperator.buildName(sourceId);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    }
    private DB2PlanNodeType sourceType;
 * 
    // ----------------
            // D: Data Object

    public DB2PlanNodeType getTargetType()



 */
    // Constructors
    public String getObjectSchema()
    public String getSourceName()
    public Integer getStreamId()
    }
    }

 *

    public Integer getSourceId()
    public Integer getTargetId()
    {
 *
    }
    public DB2PlanNodeType getSourceType()
            // Data Object
        this.targetType = CommonUtils.valueOf(DB2PlanNodeType.class, JDBCUtils.safeGetString(dbResult, "TARGET_TYPE"));
        return objectName;
        return targetType;
}
    public DB2PlanStatement getDb2Statement()
    }




 * @author Denis Forveille
    {

            // Operator

        this.streamId = JDBCUtils.safeGetInteger(dbResult, "STREAM_ID");
    // Standard Getters
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.sourceType = CommonUtils.valueOf(DB2PlanNodeType.class, JDBCUtils.safeGetString(dbResult, "SOURCE_TYPE"));
        return targetId;
            return DB2PlanOperator.buildName(targetId);
    public Double getStreamCount()

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        this.objectSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "OBJECT_SCHEMA");
    private Integer sourceId;
    }
import org.jkiss.utils.CommonUtils;
