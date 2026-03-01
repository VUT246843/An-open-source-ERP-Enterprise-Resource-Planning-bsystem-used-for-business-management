    }

    public DBSTable getTable() {
 * you may not use this file except in compliance with the License.


        this.granularity        = JDBCUtils.safeGetStringTrimmed(dbResult, "GRANULARITY");
    protected boolean isEnable;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Property(viewable = true, order = 11)
 *
    public boolean isSystem() {
    @Property(viewable = true, order = 5)

    public String getEventType() {
    

    }

import org.jkiss.dbeaver.model.meta.Property;
    protected String dmlTableName;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    protected String dmlStmtType;
        return false;

    }
    }
    protected String eventType;
        return (DBSTable) getParentObject();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    extends GenericTrigger<DBSObject> implements DBPSystemObject, DBPScriptObject {
 *

    protected int refRowCount;
    }
}
    }
    public String getEventTime() {
    public String getTargetTable() {
    @Property(viewable = true, order = 10)

 * Unless required by applicable law or agreed to in writing, software
        return eventType;
        return (dmlTableSchema == null || dmlTableName == null) ? "" : dmlTableSchema + "." + dmlTableName;
    }
    @Override
        this.eventType          = JDBCUtils.safeGetStringTrimmed(dbResult, "EVENT_TYPE");
        this.updateColumnCount  = JDBCUtils.safeGetInt(dbResult, "UPDATE_COLUMN_CNT");
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean isEnabled() {

    protected String eventTime;
    @Property(viewable = true, order = 9)
        return eventTime;
    }
        this.dmlStmtType        = JDBCUtils.safeGetString(dbResult, "DML_STMT_TYPE");
 * See the License for the specific language governing permissions and
        return null;
    public String getDescription() {
        return isEnable;
    @Nullable
        this.dmlTableSchema     = JDBCUtils.safeGetString(dbResult, "DMLTABLE_SCHEMA");
    public String getGranularity() {
 * AltibaseTrigger

        super(container, name, description);
    protected String granularity;
    protected int updateColumnCount;
        return granularity;
package org.jkiss.dbeaver.ext.altibase.model;
    @Property(viewable = true, order = 4)
    protected String dmlTableSchema;
 * DBeaver - Universal Database Manager
/*
public abstract class AltibaseTrigger<OWNER extends DBSObject> 
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        return dmlStmtType;

    public AltibaseTrigger(OWNER container, String name, String description, JDBCResultSet dbResult) {
import org.jkiss.dbeaver.ext.generic.model.GenericTrigger;
    public String getSource() {
import org.jkiss.dbeaver.model.DBPScriptObject;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.

 */
    @Property(viewable = true, order = 6)
    @Override
import org.jkiss.dbeaver.model.DBPSystemObject;
        this.isEnable           = (JDBCUtils.safeGetInt(dbResult, "IS_ENABLE") == 1);

    @Property(viewable = true, order = 7)
    public int getUpdateColumnCount() {
        return source;
    }
 */
/**
    @Property(viewable = true, order = 8)
        this.refRowCount        = JDBCUtils.safeGetInt(dbResult, "REF_ROW_CNT");
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = false, hidden = true, order = 100)
        return updateColumnCount;
        this.dmlTableName       = JDBCUtils.safeGetString(dbResult, "DMLTABLE_NAME");
        this.eventTime          = JDBCUtils.safeGetStringTrimmed(dbResult, "EVENT_TIME");
    public String getDmlType() {
 *
