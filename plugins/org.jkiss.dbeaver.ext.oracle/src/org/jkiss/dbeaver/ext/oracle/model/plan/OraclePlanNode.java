            return operation;
        this.cardinality = JSONUtils.getLong(attributes, "cardinality", 0);
        this.partitionStart = JDBCUtils.safeGetString(dbResult, "partition_start");
        this.position = JDBCUtils.safeGetInt(dbResult, "position");
        return operation + " " + CommonUtils.toString(options) + " " + CommonUtils.toString(objectName);
    }
                    return DBCPlanNodeKind.TABLE_SCAN;

                case "project":
        if (parent_id != null) {
        }
        this.tempSpace = JDBCUtils.safeGetLong(dbResult, "temp_space");
        return partitionId;
        return cpuCost;
    }
        this.operation = JSONUtils.getString(attributes, "operation");

public class OraclePlanNode extends AbstractExecutionPlanNode implements DBCPlanCostNode {
        for (String kind : allowedKind) {
        this.position = JSONUtils.getInteger(attributes, "position");
        this.optimizer = JSONUtils.getString(attributes, "optimizer");
    }
        return OracleObjectType.resolveObject(
        this.options = JSONUtils.getString(attributes, "options");
                    return DBCPlanNodeKind.DEFAULT;
        return time;

    }
        this.projection = JSONUtils.getString(attributes, "projection");

                    return DBCPlanNodeKind.JOIN;

    public String getDistribution() {
        this.distribution = JSONUtils.getString(attributes, "distribution");
    }
    @Override

        this.filterPredicates = JSONUtils.getString(attributes, "filter_predicates");
    }
    private long cpuCost;

                switch (kind) {
    @Override
    private String other;
        this.time = JSONUtils.getLong(attributes, "time", 0);
    }
        this.time = JDBCUtils.safeGetLong(dbResult, "time");
    @Property(category = CAT_DETAILS, order = 22)
    private long tempSpace;
import java.sql.SQLException;
            objectTypeName = OracleObjectType.TABLE.name();

        this.accessPredicates = JDBCUtils.safeGetString(dbResult, "access_predicates");
                            "merge",
    }
    private String otherTag;
        return objectInstance;

                    return DBCPlanNodeKind.RESULT;
    }
        if (divPos != -1) {
    public String getRemarks() {

        if (parent != null) {
    }

                this.cpuCost += child.cpuCost;

                case "collector":
        this.otherTag = JSONUtils.getString(attributes, "other_tag");
        return position;
    @Property(category = CAT_DETAILS, order = 7, viewable = true)
 * limitations under the License.
    @Property(category = CAT_DETAILS, order = 20)
        this.cardinality = JDBCUtils.safeGetLong(dbResult, "cardinality");
        }
    private OraclePlanNode parent;
    private String optimizer;
    }
                    return DBCPlanNodeKind.INDEX_SCAN;
 * DBeaver - Universal Database Manager
        this.statementId = JSONUtils.getString(attributes, "statement_id");
    public String getProjection() {
                    return DBCPlanNodeKind.FUNCTION;
        if (this.cost == 0 && this.cpuCost == 0 && nested != null) {
    private int depth;
 * Unless required by applicable law or agreed to in writing, software
    public Object getObject(DBRProgressMonitor monitor) throws DBException {


    private String objectType;
    private final static List<String> allowedKind = new ArrayList<>( 
                            "loop",
                    return DBCPlanNodeKind.HASH;

        return objectName;
    }


    }

    @Override
                dataSource,
                objectOwner,
                monitor,
                }


 *
        Integer parent_id = JSONUtils.getInteger(attributes, "parent_id");
    public String getObjectAlias() {
        this.otherTag = JDBCUtils.safeGetString(dbResult, "other_tag");


                            "collector",
    public long getCpuCost() {
    }
    public OraclePlanNode(OracleDataSource dataSource, IntKeyMap<OraclePlanNode> prevNodes, ResultSet dbResult) throws SQLException {
    }
            for (OraclePlanNode parentNode = parent; parentNode != null; parentNode = parentNode.getParent()) {
/**

                if (parentObject instanceof OracleTablePhysical) {
 * You may obtain a copy of the License at
                            "delete",
        }


        return remarks;

    @Property(category = CAT_DETAILS, order = 21)
        this.partitionStart = JSONUtils.getString(attributes, "partition_start");

    private String qblockName;
    public long getPartitionId() {

import org.jkiss.dbeaver.model.data.json.JSONUtils;
    //    {

                            "sort",

        return null;
    private long searchColumns;
    //@Property(name = "Type", order = 3, viewable = true, description = "Object type")

            parent = prevNodes.get(parent_id);
                            "index",
        this.dataSource = dataSource;
    private String accessPredicates;
    private String statementId;
    }
                    return DBCPlanNodeKind.MERGE;
    public String getObjectType() {
        this.searchColumns = JSONUtils.getLong(attributes, "search_columns", 0);
            // Get index from parent table - reading of all indexes takes too much time

        this.searchColumns = JDBCUtils.safeGetLong(dbResult, "search_columns");
    private String objectName;
        return timestamp;

                case "update":
        this.partitionId = JDBCUtils.safeGetLong(dbResult, "partition_id");
    public int getPosition() {
    public long getSearchColumns() {
        String objectTypeName = objectType;
    
        this.ioCost = JDBCUtils.safeGetLong(dbResult, "io_cost");
                            "foregin",
        this.cpuCost = JSONUtils.getLong(attributes, "cpu_cost", 0);
        }
    private String objectAlias;
import org.jkiss.utils.CommonUtils;
    //@Property(name = "Options", order = 2, viewable = true, description = "A variation on the operation described in the Operation column")
        Integer parent_id = JDBCUtils.safeGetInteger(dbResult, "parent_id");
        return other;
        return statementId;
        return operation;
        }
            return operation + " (" + options + ")";
        return objectName;
    }
                case "sort":
        if (objectName.startsWith("X$")) {
        this.dataSource = dataSource;

            parent = prevNodes.get(parent_id);

            return objectName;
        String name = divPos == -1 ? objectName : objectName.substring(0, divPos);
        this.tempSpace = JSONUtils.getLong(attributes, "temp_space", 0);
    public String getPartitionStop() {
        return cost;
    public Number getNodeRowCount() {
        return objectNode;
    public OraclePlanNode getParent() {
        return otherTag;
            // Some internal stuff
    public String getStatementId() {
    private String remarks;
    @Property(category = CAT_DETAILS, order = 23)
            }
    }
    //    public Object getObjectOwner()
                            "join",
        return projection;
    }

        divPos = objectName.indexOf("(");
    @Override
import org.jkiss.utils.IntKeyMap;
        this.timestamp = JDBCUtils.safeGetTimestamp(dbResult, "timestamp");

    @Override
        return ioCost;
        this.partitionStop = JDBCUtils.safeGetString(dbResult, "partition_stop");
        return DBCPlanNodeKind.DEFAULT;
        } else {
    @Property(category = CAT_DETAILS, order = 10, viewable = true)
        this.objectInstance = JSONUtils.getLong(attributes, "object_instance", 0);
 */
                child.updateCosts();
        return cardinality;
                case "loop":
        return (double) cpuCost / 1000;
    }
    public String getAlias() {
        this.ioCost = JSONUtils.getLong(attributes, "io_cost", 0);
                    return DBCPlanNodeKind.MODIFY;
    public long getTempSpace() {
        return objectOwner;
    public long getCardinality() {
    }
import java.sql.ResultSet;
        this.qblockName = JDBCUtils.safeGetString(dbResult, "qblock_name");
 * you may not use this file except in compliance with the License.

/*
    private int id;

    public String getNodeType() {
        this.objectInstance = JDBCUtils.safeGetLong(dbResult, "object_instance");
    }
                final Object parentObject = parentNode.getObject(monitor);
    public Number getNodePercent() {
import java.sql.Timestamp;
        this.operation = JDBCUtils.safeGetString(dbResult, "operation");
            }
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNodeKind;

    public long getCost() {


                    return DBCPlanNodeKind.GROUP;
    }
        this.objectOwner = JSONUtils.getString(attributes, "object_owner");
    }
    public OraclePlanNode(OracleDataSource dataSource, IntKeyMap<OraclePlanNode> prevNodes, Map<String, Object> attributes) {
        if (nested != null) {
        if (CommonUtils.isEmpty(options)) {
        this.objectAlias = JSONUtils.getString(attributes, "object_alias");
    }
        }
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
import org.jkiss.dbeaver.ext.oracle.model.OracleTablePhysical;
        this.cpuCost = JDBCUtils.safeGetLong(dbResult, "cpu_cost");
        return distribution;
                            "modify",

    public DBCPlanNodeKind getNodeKind() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            "update",
        return parentId;
        return objectAlias;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(category = CAT_DETAILS, order = 24)
                case "join":
    }
        this.other = JDBCUtils.safeGetString(dbResult, "other");
        this.options = JDBCUtils.safeGetString(dbResult, "options");
    //    }
    public Timestamp getTimestamp() {
    @Property(category = CAT_DETAILS, order = 25)


    private long plan_id;

        }
                            "filter",
    public String getOptions() {
        this.depth = JDBCUtils.safeGetInt(dbResult, "depth");
                objectTypeName,
        if (OracleObjectType.INDEX.name().equals(objectTypeName)) {
                    return DBCPlanNodeKind.MATERIALIZE;
    protected final List<OraclePlanNode> nested = new ArrayList<>();
    }
        this.objectAlias = JDBCUtils.safeGetString(dbResult, "object_alias");
    }
        this.remarks = JSONUtils.getString(attributes, "remarks");
    @Property(category = CAT_DETAILS, order = 30)
    }
        return bytes;
        String op = operation.toLowerCase();
        return plan_id;
    private void addChild(OraclePlanNode node) {
                    return DBCPlanNodeKind.AGGREGATE;
    public String getOperation() {
        this.remarks = JDBCUtils.safeGetString(dbResult, "remarks");
        this.otherXml = JDBCUtils.safeGetString(dbResult, "other_xml");

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(order = 9, viewable = true)
                objectNode,
                            "hash",
    @Property(category = CAT_DETAILS, order = 28)
                }
    public String getOptimizer() {
    public int getDepth() {
        this.statementId = JDBCUtils.safeGetString(dbResult, "statement_id");
                    return DBCPlanNodeKind.SORT;
    public String getPartitionStart() {

    private long ioCost;
        this.timestamp = JSONUtils.getTimestamp(attributes, "timestamp");
 * Oracle execution plan node
    @Override
            return objectName == null ? "" : objectName;
    }
    public String getQblockName() {
                    return DBCPlanNodeKind.MODIFY;
                    return ((OracleTablePhysical) parentObject).getIndex(monitor, objectName);
    private String projection;

        return options;



    public long getBytes() {
    private long cardinality;
        return null;
            }
    public String getOther() {
    //@Property(name = "ID", order = 0, viewable = true, description = "Node ID")
        int divPos = objectTypeName == null ? -1 : objectTypeName.indexOf('(');

                    return DBCPlanNodeKind.MODIFY;
    public int getId() {

        this.projection = JDBCUtils.safeGetString(dbResult, "projection");
        } else {
    private Timestamp timestamp;


                case "function":
    private String options;
 *

    public String getObjectOwner() {
        }
                    return DBCPlanNodeKind.JOIN;
 *     http://www.apache.org/licenses/LICENSE-2.0

        return cardinality;
    @Property(category = CAT_DETAILS, order = 27)
    public void updateCosts() {
        return accessPredicates;
        return partitionStop;
                case "hash":
    @Property(order = 1, viewable = true)
    
        this.cost = JSONUtils.getLong(attributes, "cost", 0);

                case "result":
        this.plan_id = JSONUtils.getLong(attributes, "plan_id", 0);
    public Number getNodeDuration() {
            return objectName;
    @Property(category = CAT_DETAILS, order = 26)
                case "modify":
    }
    @Override
 * See the License for the specific language governing permissions and
    private int parentId;

        this.objectType = JSONUtils.getString(attributes, "object_type");
        this.objectNode = JDBCUtils.safeGetString(dbResult, "object_node");
    }
        this.accessPredicates = JSONUtils.getString(attributes, "access_predicates");
        this.partitionStop = JSONUtils.getString(attributes, "partition_stop");
                    return DBCPlanNodeKind.FILTER;

        return nested;
            for (OraclePlanNode child : nested) {
    }


                    return DBCPlanNodeKind.SET;

    public String getAccessPredicates() {
        this.objectOwner = JDBCUtils.safeGetString(dbResult, "object_owner");
    @Property(category = CAT_DETAILS, order = 31)
    }
              Arrays.asList("result",
    }
        return filterPredicates;
     @Override
            if (op.contains(kind)) {
            parent.addChild(this);
    }

    }
                case "materialize":
    }
                case "aggregate":
        this.bytes = JDBCUtils.safeGetLong(dbResult, "bytes");
                            "merge",

                case "group":
        return objectAlias;
        this.other = JSONUtils.getString(attributes, "other");
        if (monitor == null || CommonUtils.isEmpty(objectOwner) || CommonUtils.isEmpty(objectName)) {
    private String objectOwner;
    @Property(order = 5, viewable = true, supportsPreview = true)
                case "insert":


import org.jkiss.dbeaver.ext.oracle.model.OracleObjectType;
    }
        this.qblockName = JSONUtils.getString(attributes, "qblock_name");
    private String distribution;
    }
    private String filterPredicates;

}
    }
    private String operation;
    private String partitionStop;
    }
                case "merge":

            for (OraclePlanNode child : nested) {

                            "project",
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getObjectName() {

        this.bytes = JSONUtils.getLong(attributes, "bytes", 0);


    public long getIoCost() {

package org.jkiss.dbeaver.ext.oracle.model.plan;
        this.objectName = JSONUtils.getString(attributes, "object_name");
 *
    public String getOtherXml() {
    private String otherXml;
                case "index":

    public String getNodeDescription() {
    public String toString() {
                case "delete":
import java.util.*;
    private int position;

                            "function"));
        this.id = JDBCUtils.safeGetInt(dbResult, "id");
                name.trim());
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
                    return DBCPlanNodeKind.AGGREGATE;


        this.filterPredicates = JDBCUtils.safeGetString(dbResult, "filter_predicates");
    public Number getNodeCost() {
    }

        this.partitionId = JSONUtils.getLong(attributes, "partition_id", 0);
        return qblockName;
    @Property(category = CAT_DETAILS, order = 29)
    private String objectNode;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        this.otherXml = JSONUtils.getString(attributes, "other_xml");

    private long cost;
    public String getNodeName() {
        return id;
            objectTypeName = objectTypeName.substring(0, divPos).trim();


        this.id = JSONUtils.getInteger(attributes, "id");
    }
        this.cost = JDBCUtils.safeGetLong(dbResult, "cost");
        }
 */
    }
    private long time;
        return cost;
    private long partitionId;
        return optimizer;
                case "foregin":
    public final static String CAT_DETAILS = "Details";
            }
        return partitionStart;
import org.jkiss.dbeaver.model.meta.Property;

    }
        return objectType;
        }
    public long getPlanId() {
    }
                this.cost += child.cost;
                            "aggregate",

        }
    //@Property(name = "Alias", order = 6, viewable = true, description = "Object alias")
        return otherXml;
        this.depth = JSONUtils.getInteger(attributes, "depth");
        return searchColumns;
                case "filter":
    }
        this.objectType = JDBCUtils.safeGetString(dbResult, "object_type");
    public long getTime() {
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;
                    return DBCPlanNodeKind.MODIFY;
    //        final OracleSchema schema = dataSource.schemaCache.getCachedObject(objectOwner);
    }
    public String getOtherTag() {
    }
        return tempSpace;
        this.plan_id = JDBCUtils.safeGetLong(dbResult, "plan_id");
                            "group",
                            "inset",

    public String getFilterPredicates() {
                default:
        if (parent_id != null) {

    @Override
    public Collection<OraclePlanNode> getNested() {
    public String getObjectNode() {
    private String partitionStart;
    public int getParentId() {


            parent.addChild(this);
    //@Property(name = "Owner", order = 4, viewable = true, description = "Object owner (schema)")

    }
    private long bytes;
    public long getObjectInstance() {
import org.jkiss.dbeaver.DBException;

                            "materialize",
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
        this.optimizer = JDBCUtils.safeGetString(dbResult, "optimizer");
    @Property(order = 8, viewable = true)
        return parent;
        this.objectNode = JSONUtils.getString(attributes, "object_node");
    //        return schema == null ? objectOwner : schema;
        if (parent != null) {
        return depth;
        this.objectName = JDBCUtils.safeGetString(dbResult, "object_name");
        }

    private long objectInstance;

        this.distribution = JDBCUtils.safeGetString(dbResult, "distribution");
    private final OracleDataSource dataSource;
         this.nested.add(node);
