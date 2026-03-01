import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.meta.Property;

 * See the License for the specific language governing permissions and
    @NotNull
    public String getTriggerType() {

    }
                    break;
        String event = JDBCUtils.safeGetString(dbResult, "Event");
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;
import org.jkiss.dbeaver.model.DBPQualifiedObject;

        this.createDate = JDBCUtils.safeGetTimestamp(dbResult, "createDate");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            getSchema(),
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.meta.PropertyLength;
 *
    }
    @Property(order = 7)
 * You may obtain a copy of the License at
                    actionTime = DBSActionTiming.BEFORE;
    private String enabledStatus;
    @Property(viewable = true, order = 4)
            switch (actTime) {
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
        return createDate;
public class TeradataTrigger extends GenericTableTrigger implements DBPQualifiedObject {
                    eventType = DBSManipulationType.UNKNOWN;
        if (!CommonUtils.isEmpty(actTime)) {
        this.description = description;
    }
                    eventType = DBSManipulationType.UPDATE;


import java.util.Date;
/*
 * Unless required by applicable law or agreed to in writing, software

    }
        return enabledStatus;
                case "D":
    }
import org.jkiss.code.Nullable;
                case "B":
    private String triggerType;

                case "U":
            this);
    @Property(viewable = true, order = 3)
        this.description = description;
    @Override
        this.triggerType = JDBCUtils.safeGetString(dbResult, "triggerKind");

    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)

 * you may not use this file except in compliance with the License.
        }
    @Property(viewable = true, order = 6)
                    actionTime = DBSActionTiming.UNKNOWN;
    @Override
            }
        return eventType;
    public String getDescription() {
import java.util.Map;
                    actionTime = DBSActionTiming.AFTER;
                    eventType = DBSManipulationType.INSERT;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) {

                    break;

                    break;
    private DBSManipulationType eventType;
        }
    @Override
                    break;
                    eventType = DBSManipulationType.DELETE;
    }
    private Date createDate;

        return definition;

 *
    public DBSManipulationType getEventType() {
    @Property(viewable = true, order = 5)
    }

        return DBUtils.getFullQualifiedName(getDataSource(),
        String actTime = JDBCUtils.safeGetString(dbResult, "ActionTime");
        this.enabledStatus = JDBCUtils.safeGetString(dbResult, "status");
        return triggerType;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            }
 * DBeaver - Universal Database Manager
    private String definition;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @NotNull
                default:
    public String getEnabledStatus() {
 */
        return getTable().getSchema();
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setDescription(String description) {
        this.definition = JDBCUtils.safeGetString(dbResult, "definition");

                    break;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    break;
    @Nullable
                    break;
    @Override

        super(table, name, description);
import org.jkiss.dbeaver.model.struct.DBSActionTiming;

            switch (event) {
        if (!CommonUtils.isEmpty(event)) {
    }
import org.jkiss.code.NotNull;

        return description;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private DBSActionTiming actionTime;
    private String description;
                default:
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    }
                case "A":
    public Date getCreateDate() {
    }
                case "I":

package org.jkiss.dbeaver.ext.teradata.model;
}
    public GenericSchema getSchema() {
    public TeradataTrigger(GenericTableBase table, String name, String description, JDBCResultSet dbResult) {
import org.jkiss.dbeaver.model.DBUtils;
 *

    public DBSActionTiming getActionTime() {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        return actionTime;
 * limitations under the License.
