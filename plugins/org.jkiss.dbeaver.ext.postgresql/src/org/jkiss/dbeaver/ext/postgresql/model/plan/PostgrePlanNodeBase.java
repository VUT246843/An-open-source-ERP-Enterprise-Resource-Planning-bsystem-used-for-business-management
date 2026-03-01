
                          "sort",
    static final String ATTR_INDEX_NAME = "Index-Name";
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return DBCPlanNodeKind.MODIFY;

    public boolean isPropertySet(@NotNull String id) {
                case "result":
        String startCost = attributes.get(ATTR_STARTUP_COST);
    }
    public Number getNodeRowCount() {
                          "update",
        }
    @Override
            if (op.contains(kind)) {
                          "index",
                    String.class,
    private static final String ATTR_INDEX_COND = "Index-Cond";
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNodeKind;
                }
    }

                          "merge",
        entity = attributes.get(ATTR_RELATION_NAME);
    public void resetPropertyValueToDefault(@NotNull String id) {
 *
    // Properties
        }
    public Number getNodeDuration() {
        StringBuilder title = new StringBuilder();
                    return DBCPlanNodeKind.JOIN;
    @Override
    }


            nodeType = "Parallel " + nodeType;
    public Number getNodeCost() {
        //        String costPercent = attributes.get(ATTR_TOTAL_COST);
            props[index++] = new PropertyDescriptor(
            Arrays.asList("result",
                    return DBCPlanNodeKind.SORT;

    protected String nodeType;
    {
        String totalCost = attributes.get(ATTR_TOTAL_COST);
                    return DBCPlanNodeKind.FUNCTION;

                case "update":
    private static final String ATTR_ACTUAL_TOTAL_TIME = "Actual-Total-Time";
    }

    @Override
                    return DBCPlanNodeKind.RESULT;
    }
        return parent;
                          "group",
        if (!CommonUtils.isEmpty(joinType)) {
        if (cond == null) {
    /*
    }

    }
    @Property(order = 0, viewable = true)

    public DBPPropertyDescriptor[] getProperties() {
            }
    
        return false;//attributes.containsKey(id.toString());
                    return DBCPlanNodeKind.MODIFY;
/*
        }
    }

                case "insert":
 *

    public boolean isPropertyResettable(@NotNull String id) {

        return cond;
        //        return costPercent == null ? null : CommonUtils.toDouble(costPercent);
                default:
                case "filter":
 * You may obtain a copy of the License at
    @Override
    public String getCost() {
        }

    @NotNull
    private static final String ATTR_FILTER = "Filter";
        return nested;

            cond = SQLFormatUtils.formatSQL(dataSource, cond);
        }
        if (!CommonUtils.isEmpty(entity)) {
    @NotNull

                          "function"));
 * DBeaver - Universal Database Manager
    @Property(order = 21, viewable = true)
                    null,
    //////////////////////////////////////////////////////////
                case "join":
    @Nullable

        if (entity == null) {
            rows = attributes.get(ATTR_PLAN_ROWS);
                case "function":
        return props;
                case "aggregate":

        String op = nodeType.toLowerCase();
        } else {
/**
    }

                    return DBCPlanNodeKind.INDEX_SCAN;
    }
    @Property(order = 3, viewable = true)
        }
                case "modify":
        return rows;

                    "Details",
                          "join",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.dataSource = dataSource;
            cond = attributes.get(ATTR_HASH_COND);
    }
    static final String ATTR_TOTAL_COST = "Total-Cost";
        return attributes.get("Plan-Rows");
 *

    @Override
    private final DBPDataSource dataSource;
    public String getNodeType() {
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
        }
    @Override
    @Override
        }

    public String toString() {
        for (String kind : allowedKind) {
        return entity;
    }
    @Property(order = 2, viewable = true)
import org.jkiss.utils.CommonUtils;
    {
                case "project":
        return nodeType;
        return totalCost == null ? null : CommonUtils.toDouble(totalCost);
                case "merge":
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                    return DBCPlanNodeKind.MODIFY;
                case "foregin":


    public String getActualRows() {

        title.append("Type: ").append(nodeType);
            cond = attributes.get(ATTR_FILTER);
 * Postgre execution plan node
    public Object getEditableValue() {
    protected void setAttributes(Map<String, String> attributes) {

                    return DBCPlanNodeKind.MATERIALIZE;

        this.parent = parent;
                          "inset",
    static final String ATTR_STARTUP_COST = "Startup-Cost";
                switch (kind) {
                          "materialize",

            // "COSTS FALSE" option enabled.
    public NODE getParent()
       
        return title.toString();


        return rows == null ? null : CommonUtils.toLong(rows);

                    attr.getKey(),
    private String entity;
    @Override

            rows = attributes.get(ATTR_PLAN_ROWS);
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
        return time == null ? null : CommonUtils.toDouble(time);
                    return DBCPlanNodeKind.HASH;
    @Override
        return attributes.get(id.toString());

    private static final String ATTR_HASH_COND = "Hash-Cond";

            entity = attributes.get(ATTR_CTE_NAME);
    }
    public static final String ATTR_ALIAS = "Alias";
            entity = attributes.get(ATTR_INDEX_NAME);


                    return DBCPlanNodeKind.AGGREGATE;
        }
        if (entity == null) {
    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
        return entity;
    @Override
    protected final List<NODE> nested = new ArrayList<>();
                case "delete":
                          "modify",
        String cond = attributes.get(ATTR_INDEX_COND);

                    false,
                    return DBCPlanNodeKind.JOIN;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    return DBCPlanNodeKind.MERGE;
 */
     */
    static final String ATTR_RELATION_NAME = "Relation-Name";
    public String getNodeName() {
    public String getNodeCondition() {
        }
            entity = attributes.get(ATTR_FUNCTION_NAME);
    @Override
    }
        DBPPropertyDescriptor[] props = new DBPPropertyDescriptor[attributes.size()];
                    return DBCPlanNodeKind.SET;
                    return DBCPlanNodeKind.GROUP;
                    return DBCPlanNodeKind.DEFAULT;

                          "delete",
            // PG adds the "Parallel" word to the scan type in the TEXT format but not in XML format. In XML format, there is a special Parallel-Aware tag.
                case "collector":
    @Override
        for (Map.Entry<String, String> attr : attributes.entrySet()) {
    private String cost;
public abstract class PostgrePlanNodeBase<NODE extends PostgrePlanNodeBase<?>> extends AbstractExecutionPlanNode implements DBCPlanCostNode, DBPPropertySource {

    protected PostgrePlanNodeBase(DBPDataSource dataSource, NODE parent) {
    private static final String ATTR_JOIN_TYPE = "Join-Type";
                    return DBCPlanNodeKind.AGGREGATE;
                    return DBCPlanNodeKind.TABLE_SCAN;
        return attributes.get(ATTR_FILTER);
    public List<NODE> getNested()
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {
                    false);
                case "hash":

    @Override
        title.append("; Cost: ").append(cost);

        String rows = attributes.get(ATTR_ACTUAL_ROWS);
    @Override

import org.jkiss.dbeaver.model.DBPDataSource;
    private static final String ATTR_PARALLEL_AWARE = "Parallel-Aware";
    public DBCPlanNodeKind getNodeKind() {
 */
    static final String ATTR_ACTUAL_ROWS = "Actual-Rows";
    protected NODE parent;
    public String getPlanRows() {

    @Property(order = 20, viewable = true)

 *     http://www.apache.org/licenses/LICENSE-2.0
    private final static List<String> allowedKind = new ArrayList<>( 
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
                          "foregin",
}
    }
                          "project",
        }
                case "index":

                case "group":
        return DBCPlanNodeKind.DEFAULT;
package org.jkiss.dbeaver.ext.postgresql.model.plan;
        
        }
        if (rows == null) {
                          "aggregate",
        String parallelAware = attributes.get(ATTR_PARALLEL_AWARE);
        String time = attributes.get(ATTR_ACTUAL_TOTAL_TIME);
    }
    static final String ATTR_OBJECT_NAME = "Object name";
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
        String rows = attributes.get(ATTR_ACTUAL_ROWS);
        if ("true".equals(parallelAware)) {

                    return DBCPlanNodeKind.FILTER;
        int index = 0;

                          "hash",


    static final String ATTR_FUNCTION_NAME = "Function-Name";
        if (!CommonUtils.isEmpty(cond)) {
    }
    @Override
    }
    }
    static final String ATTR_NODE_TYPE = "Node-Type";
                          "loop",
                case "materialize":
    }
        return attributes.get(ATTR_ACTUAL_TOTAL_TIME);
    protected Map<String, String> attributes = Collections.emptyMap();

    public String getTotalTime() {
        if (CommonUtils.isEmpty(startCost) && CommonUtils.isEmpty(totalCost)) {


                case "sort":
                    attr.getKey(),
    static final String ATTR_PLAN_ROWS = "Plan-Rows";

 * See the License for the specific language governing permissions and
            title.append(" (").append(joinType).append(")");
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;

    }
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;

                    return DBCPlanNodeKind.MODIFY;
        if (rows == null) {
        if (entity == null) {

    }
 * limitations under the License.
        String totalCost = attributes.get(ATTR_TOTAL_COST);
                          "merge",
    }
                    null,
    @Override

                    null,
            cost = "";
        }
import java.util.*;
        return cost;
    public String getEntity() {
        return false;
        }


        this.attributes = attributes;
    private static final String ATTR_CTE_NAME = "CTE-Name";

import org.jkiss.code.NotNull;
    @Property(order = 23, viewable = true)
        String joinType = attributes.get(ATTR_JOIN_TYPE);
    }



    
    @Override
        return this;
            title.append("Rel: ").append(entity).append(" ");
            cost = startCost + " - " + totalCost;
        return null;
    @Property(order = 22, viewable = true)
    public String getNodeDescription() {
    public Number getNodePercent() {

                case "loop":
 * you may not use this file except in compliance with the License.
    @Override
        if (cond == null) {

    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        nodeType = attributes.remove(ATTR_NODE_TYPE);
    }

        title.append("; ");
