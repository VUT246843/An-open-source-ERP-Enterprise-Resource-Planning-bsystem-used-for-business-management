    @Override

 *
        return tableSize;
    private int operatorId;
    private String operatorDetails;
        return subtreeCost;
    private String operatorProperties;
 * DBeaver - Universal Database Manager
    @Property(order = 10, viewable = true)
    public String getNodeDescription() {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        this.tableSize = JDBCUtils.safeGetDouble(dbResult, "TABLE_SIZE");
        this.operatorName = JDBCUtils.safeGetStringTrimmed(dbResult, "OPERATOR_NAME");
        this.schemaName = JDBCUtils.safeGetString(dbResult, "SCHEMA_NAME");

        this.executionEngine = JDBCUtils.safeGetString(dbResult, "EXECUTION_ENGINE");

        return schemaName;
        return host;
    @Override
import java.util.ArrayList;

    @Property(order = 7, viewable = true)
    @Property(order = 2, viewable = true)
    public String getOperatorProperties() {
    }
 */
    public String getTableName() {
        this.host = JDBCUtils.safeGetString(dbResult, "HOST");
}
    public DBCPlanNode getParent() {
 * you may not use this file except in compliance with the License.
import java.sql.ResultSet;
 * Unless required by applicable law or agreed to in writing, software
 *
    }
    }
import java.sql.Timestamp;
 * limitations under the License.
    private String schemaName;
    }
        return databaseName;



import java.util.Collection;
    private Double tableSize;
        nestedNodes.add(node);
    public void addNested(HANAPlanNode node) {
    public String getExecutionEngine() {
    @Property(order = 6, viewable = true)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private String executionEngine;

    @Property(order = 4, viewable = true)
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.outputSize = JDBCUtils.safeGetDouble(dbResult, "OUTPUT_SIZE");
    @Property(order = 1, viewable = true)
 * Licensed under the Apache License, Version 2.0 (the "License");

public class HANAPlanNode extends AbstractExecutionPlanNode {
    }
    }
        return operatorName;
    public void setParent(HANAPlanNode node) {
    @Override
        return operatorDetails;
    public int getPort() {
    public Collection<HANAPlanNode> getNested() {

    @Property(order = 5, viewable = true)
    private Timestamp timestamp;
        return parentNode;
    }
    }

    @Override
    public String getHost() {
        return outputSize;
    private String host;
 * You may obtain a copy of the License at
    private int port;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    // private int level;
    @Override
        this.operatorDetails = JDBCUtils.safeGetString(dbResult, "OPERATOR_DETAILS");
        this.operatorId = JDBCUtils.safeGetInt(dbResult, "OPERATOR_ID");
    public String getOperatorDetails() {
    }
        return operatorId;
    public Double getOutputSize() {
    @Property(order = 0, viewable = true)
    private String tableType;
    private Double outputSize;
    private Collection<HANAPlanNode> nestedNodes = new ArrayList<>(64);
        this.tableName = JDBCUtils.safeGetString(dbResult, "TABLE_NAME");
    // private int position;
    public int getParentOperatorId() {
    }
        parentNode = node;
    public String getDatabaseName() {
    private String databaseName;
        // this.position = JDBCUtils.safeGetInt(dbResult, "POSITION");


import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;
        this.databaseName = JDBCUtils.safeGetString(dbResult, "DATABASE_NAME");
        return parentOperatorId;
    @Property(order = 9, viewable = true)
/*
        return operatorProperties;
package org.jkiss.dbeaver.ext.hana.model.plan;

        return operatorName;
        return null;

    private String operatorName;
        return timestamp;
    public Timestamp getTimestamp() {
 * See the License for the specific language governing permissions and
    public HANAPlanNode(ResultSet dbResult) {

        this.operatorProperties = JDBCUtils.safeGetString(dbResult, "OPERATOR_PROPERTIES");
    @Property(order = 12, viewable = true)

    }
    private Double subtreeCost;
        return tableName;
    public int getOperatorId() {
    }
    @Property(order = 13, viewable = true)
    public String getNodeType() {
        this.parentOperatorId = JDBCUtils.safeGetInt(dbResult, "PARENT_OPERATOR_ID");

    public String getOperatorName() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    }

    @Property(order = 11, viewable = true)

    }
    }
    public String getTableType() {

    public Double getTableSize() {

    public Double getSubtreeCost() {
    }
    }
    }
    private int parentOperatorId;
        this.tableType = JDBCUtils.safeGetString(dbResult, "TABLE_TYPE");

        this.subtreeCost = JDBCUtils.safeGetDouble(dbResult, "SUBTREE_COST");

        return nestedNodes;
        this.port = JDBCUtils.safeGetInt(dbResult, "PORT");
    }

        return port;
    @Property(order = 8, viewable = true)
        // this.level = JDBCUtils.safeGetInt(dbResult, "LEVEL");
    public String getNodeName() {
    }
        return operatorDetails;
    private String tableName;
        this.timestamp = JDBCUtils.safeGetTimestamp(dbResult, "TIMESTAMP");
         // trim tree style indentation in operatorName, as dbeaver creates a real tree
    private HANAPlanNode parentNode;
    }

    }
        return tableType;
    @Property(order = 3, viewable = true)

        return executionEngine;
    public String getSchemaName() {
