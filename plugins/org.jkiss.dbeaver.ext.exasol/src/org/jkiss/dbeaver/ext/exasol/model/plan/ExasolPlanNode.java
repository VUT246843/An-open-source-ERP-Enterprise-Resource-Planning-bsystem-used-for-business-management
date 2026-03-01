        attributes.put(ATTR_HDD_WRITE, hddWrite);
        return hddRead;
    }
        attributes.put(ATTR_CPU, cpu);
    public ExasolPlanNode(ExasolPlanNode parent, Map<String, Object> attributes) {

import java.sql.ResultSet;
        this.objectSchema = JSONUtils.getString(attributes, ATTR_OBJECT_SCHEMA);
    public String getPartName() {

    private String objectName;
        if (CommonUtils.isNotEmpty(object)) {
    }
        return parent;
    private Double outRows;
        attributes = new HashMap<>();
    private ExasolPlanNode parent;

    private static final String ATTR_CPU = "CPU";
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
        return partName;

        attributes.put(ATTR_NET, netTransfer);
        return commandName;
    public Double getHddWrite() {
        this.hddWrite = JDBCUtils.safeGetDouble(dbResult, ATTR_HDD_WRITE);
    @Property(order = 16, viewable = true)
        return duration;

    private static final String ATTR_COMMAND_NAME = "COMMAND_NAME";
import java.util.Collection;
    private Double netTransfer;

import org.jkiss.dbeaver.model.data.json.JSONUtils;
    @Property(order = 15, viewable = true)
    @Override
    public int getStmtId() {
        this.duration = JSONUtils.getDouble(attributes, ATTR_DURATION);
    @Property(order = 0, viewable = true)
 * you may not use this file except in compliance with the License.
    private Collection<ExasolPlanNode> listNestedNodes = new ArrayList<>(64);

import java.util.HashMap;
        this.commandName = JSONUtils.getString(attributes, ATTR_COMMAND_NAME);

    public Double getObjectRows() {
    private Map<String, Object> attributes;
    private static final String ATTR_REMARKS = "REMARKS";
    }
    private int partId;
        this.tempDbRamPeak = JSONUtils.getDouble(attributes, ATTR_TEMP_DB_RAM_PEAK);

        this.partId = JDBCUtils.safeGetInt(dbResult, ATTR_PART_ID);

 * @author Karl Griesser
    }

    }

        attributes.put(ATTR_OBJECT_ROWS, objectRows);
    }
        this.commandName = JDBCUtils.safeGetString(dbResult, ATTR_COMMAND_NAME);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 */
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        putNotNullStringInMap(ATTR_PART_INFO, partInfo);

    public String getNodeType() {
    }
 * limitations under the License.
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
    private static final String ATTR_TEMP_DB_RAM_PEAK = "TEMP_DB_RAM_PEAK";
    private String partName;


    public Double getTempDbRamPeak() {
        this.attributes = attributes;

        this.netTransfer = JSONUtils.getDouble(attributes, ATTR_NET);
        this.parent = parent;
        this.objectRows = JSONUtils.getDouble(attributes, ATTR_OBJECT_ROWS);
        putNotNullStringInMap(ATTR_COMMAND_NAME, commandName);
    }
        return attributes;
    private String commandName;

        this.partId = JSONUtils.getInteger(attributes, ATTR_PART_ID);

        this.objectRows = JDBCUtils.safeGetDouble(dbResult, ATTR_OBJECT_ROWS);

    private Double duration;
import org.jkiss.code.NotNull;
        this.stmtId = JDBCUtils.safeGetInt(dbResult, ATTR_STMT_ID);
import org.jkiss.code.Nullable;

    @Property(order = 2, viewable = true)
        putNotNullStringInMap(ATTR_OBJECT_SCHEMA, objectSchema);
    private static final String ATTR_NET = "NET";
    @Property(order = 6, viewable = true)

        return listNestedNodes;
    public Double getOutRows() {

    public String getPartInfo() {

            attributes.put(key, object);
 *
}
    }
import org.jkiss.utils.CommonUtils;
        return cpu;

    private String objectSchema;
    public Double getDuration() {

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.exasol.model.plan;
    private void putNotNullStringInMap(@NotNull String key, @Nullable String object) {

public class ExasolPlanNode extends AbstractExecutionPlanNode {
        attributes.put(ATTR_STMT_ID, stmtId);
        this.cpu = JDBCUtils.safeGetDouble(dbResult, ATTR_CPU);
        this.netTransfer = JDBCUtils.safeGetDouble(dbResult, ATTR_NET);
    }
 * You may obtain a copy of the License at
    @Property(order = 7, viewable = true)
    }
    @Override
        this.partInfo = JSONUtils.getString(attributes, ATTR_PART_INFO);
    @Property(order = 13, viewable = true)
        attributes.put(ATTR_OUT_ROWS, outRows);
    }

    }
import java.util.ArrayList;
        return detailInfo;
    private Double objectRows;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return partId;
    private static final String ATTR_OBJECT_ROWS = "OBJECT_ROWS";
        attributes.put(ATTR_TEMP_DB_RAM_PEAK, tempDbRamPeak);
    @Property(order = 5, viewable = true)
    private static final String ATTR_DURATION = "DURATION";
    }
        fillAttributes();
    private void fillAttributes() {
/**
    public String getNodeName() {
    }
    @Override


        this.detailInfo = JDBCUtils.safeGetString(dbResult, ATTR_REMARKS);
    @Property(order = 1, viewable = true)
    @Property(order = 4, viewable = true)
    public String getNodeDescription() {
        putNotNullStringInMap(ATTR_OBJECT_NAME, objectName);
 * See the License for the specific language governing permissions and
    private Double hddWrite;

        putNotNullStringInMap(ATTR_REMARKS, detailInfo);
    private static final String ATTR_PART_ID = "PART_ID";

        this.outRows = JDBCUtils.safeGetDouble(dbResult, ATTR_OUT_ROWS);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    // Methods from Interface

import java.util.Map;
        this.stmtId = JSONUtils.getInteger(attributes, ATTR_STMT_ID);
    }
    private static final String ATTR_HDD_READ = "HDD_READ";
        return stmtId;
    public String getDetailInfo() {
        this.objectSchema = JDBCUtils.safeGetString(dbResult, ATTR_OBJECT_SCHEMA);
        return tempDbRamPeak;
 * DBeaver - Universal Database Manager
        return objectName;
    @Property(order = 10, viewable = true)
 *
    public ExasolPlanNode(ExasolPlanNode parent, ResultSet dbResult) {
        attributes.put(ATTR_DURATION, duration);
    public Collection<ExasolPlanNode> getListNestedNodes() {
        attributes.put(ATTR_PART_ID, partId);

        return commandClass;
    @Override
    private String detailInfo;
    private static final String ATTR_HDD_WRITE = "HDD_WRITE";
        return partInfo;
    private String partInfo;
        return detailInfo;
        this.outRows = JSONUtils.getDouble(attributes, ATTR_OUT_ROWS);


        return netTransfer;
    public Double getCpu() {
        this.commandClass = JSONUtils.getString(attributes, ATTR_COMMAND_CLASS);
        this.commandClass = JDBCUtils.safeGetString(dbResult, ATTR_COMMAND_CLASS);
        this.partName = JDBCUtils.safeGetString(dbResult, ATTR_PART_NAME);
    public String getObjectName() {
    public Double getNetTransfer() {
    public String getCommandName() {
/*
        return objectName;
    private static final String ATTR_OUT_ROWS = "OUT_ROWS";
        return commandName;




    public String getCommandClass() {

    }
        this.hddRead = JSONUtils.getDouble(attributes, ATTR_HDD_READ);
    private static final String ATTR_PART_NAME = "PART_NAME";
        this.tempDbRamPeak = JDBCUtils.safeGetDouble(dbResult, ATTR_TEMP_DB_RAM_PEAK);
        this.objectName = JDBCUtils.safeGetString(dbResult, ATTR_OBJECT_NAME);
        this.detailInfo = JSONUtils.getString(attributes, ATTR_REMARKS);
    }
        putNotNullStringInMap(ATTR_PART_NAME, partName);
    private static final String ATTR_STMT_ID = "STMT_ID";
    @Property(order = 3, viewable = true)
    @Property(order = 12, viewable = true)
    @Property(order = 8, viewable = true)
    }
    public DBCPlanNode getParent() {
    private static final String ATTR_OBJECT_SCHEMA = "OBJECT_SCHEMA";
    }
    public Double getHddRead() {
    @Property(order = 9, viewable = true)
    private static final String ATTR_PART_INFO = "PART_INFO";
    private static final String ATTR_OBJECT_NAME = "OBJECT_NAME";
    public String getObjectSchema() {
        attributes.put(ATTR_HDD_READ, hddRead);
        this.hddRead = JDBCUtils.safeGetDouble(dbResult, ATTR_HDD_READ);



    private String commandClass;
        putNotNullStringInMap(ATTR_COMMAND_CLASS, commandClass);
    @Property(order = 11, viewable = true)
    }
        this.cpu = JSONUtils.getDouble(attributes, ATTR_CPU);
    }

    private static final String ATTR_COMMAND_CLASS = "COMMAND_CLASS";
    }
    private Double tempDbRamPeak;
        }
    // ----------------------
        return hddWrite;


        this.parent = parent;
    // ---------------------	

 */
        return outRows;



 *     http://www.apache.org/licenses/LICENSE-2.0
        return listNestedNodes;

        this.objectName = JSONUtils.getString(attributes, ATTR_OBJECT_NAME);

        this.duration = JDBCUtils.safeGetDouble(dbResult, ATTR_DURATION);
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;
    @Override
    private Double cpu;
        this.partName = JSONUtils.getString(attributes, ATTR_PART_NAME);
    private int stmtId;
import org.jkiss.dbeaver.model.meta.Property;
    private Double hddRead;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public int getPartId() {
    Map<String, Object> getAttributes() {
        this.hddWrite = JSONUtils.getDouble(attributes, ATTR_HDD_WRITE);
    public Collection<ExasolPlanNode> getNested() {
        this.partInfo = JDBCUtils.safeGetString(dbResult, ATTR_PART_INFO);
 *
        return objectRows;
        return objectSchema;
    }

    @Property(order = 14, viewable = true)
    }
    }
