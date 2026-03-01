                    case "DELETE":



    /**
    }
        return id;


    /**
            }
    }
                        return DBCPlanNodeKind.SELECT;
                }
        if (depth > 0) {
            return this.parent;
    }
        } else if (this.depth == depth) {

    }

                    case "SORT":
     * Returns its own ID
        this.id = id;
                    case "MERGE":
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Returns plan as string
    @Override
     */
        } else {
        return operation;


        // e.g. SCAN ( PARTITION: " )
public class AltibasePlanNode extends AbstractExecutionPlanNode  {
     * Otherwise, returns plan string only.
        if (this.depth > depth) {

                        return DBCPlanNodeKind.JOIN;
                    "MERGE", 
 *
    public int getParentId() {
    /**
                    case "HASH":

        for (AltibasePlanNode node : nested) {
     */
    @Override
    @Override
    public String getOptions() {
    AltibasePlanNode parent;
     * Returns its parent ID;
    public AltibasePlanNode(AltibaseDataSource dataSource, IntKeyMap<AltibasePlanNode> prevNodes, Map<String, Object> attributes) {
package org.jkiss.dbeaver.ext.altibase.model.plan;
                    case "GROUP":

                    "VIEW", 
        if (plan.contains("(")) {
        }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;

    @Override
    public void addChildNode(AltibasePlanNode node) {
    }
        for (int i = 0; i < depth; i++) {
            parent = prevNodes.get(parentIdFromMap);
        this.id = JSONUtils.getInteger(attributes, "id");
        this.dataSource = dataSource;
                        return DBCPlanNodeKind.UNION;
     * Returns prefix starts with "└" and append "-" as many as its depth except root node.

        return sb.toString();
}
     * 1. SCAN (PARTITON:...) -> operation: SCAN, options: PARTITION...

        this.parent = parent;
    @Property(order = 1, viewable = true)
    private int depth;
    public DBCPlanNode getParent() {

        return operation;
                        return DBCPlanNodeKind.SET;
 * See the License for the specific language governing permissions and

    }
    private String plan;
     */
     */
            sb.append("-");
        return plan;
        return parent;

                    case "FILTER":
 * DBeaver - Universal Database Manager
 */
    private void setOperation() {
        }
            options = "";
    private int id;
    public String getOperation() {
        Integer parentIdFromMap =  JSONUtils.getInteger(attributes, "parent_id");
    @Override

                    default:
        this.depth = depth;
    }
                        return DBCPlanNodeKind.SORT;
            sb.append(node.toString4Debug());
        sb.append(String.format("[depth:%3d] ", depth));
        if (this.parent == null) {
     */

     */
                    case "UNION":
        }
            throw new IllegalArgumentException("Argument depth: " + depth + ", this.depth: " + this.depth);
    }
                        return DBCPlanNodeKind.MODIFY;
        
            operation = splittedPlan[0].trim();
            return plan;
     * Set operation type
            parent.addChildNode(this);
     */
    /**

    /**
    /**
    public String toString4Debug() {
                    "INSERT", "UPDATE", "DELETE"
        
        return parentId;
import org.jkiss.dbeaver.model.meta.Property;

    }

                    ));
    }
    }



        } else {
    }
    public int getDepth() { 
            return this.parent.getParentNodeAtDepth(depth);
                    "SORT", 
    @Override
    public AltibasePlanNode getParentNodeAtDepth(int depth) {
    private static final List<String> allowedKind = new ArrayList<>(
                    "UNION", 
        }
     * 
                            return DBCPlanNodeKind.TABLE_SCAN;
        return options;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNodeKind;
        }
                    "JOIN", 
        // e.g. SCAN ( PARTITION: " )
     * Add a node as its child.

        return DBCPlanNodeKind.DEFAULT;
                        return DBCPlanNodeKind.FILTER;
     * Return debugging string for a plan node.

     * If PREF_PLAN_PREFIX option has checked, then returns prefix + string. 

    public String getPlan() {
 * You may obtain a copy of the License at
            this.parentId = 0;
                switch (kind) {
                        return DBCPlanNodeKind.HASH;  
        return operation;

                    case "UPDATE":
                    case "AGGREGATION":
    public String toString() {
    public DBCPlanNodeKind getNodeKind() {
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AltibasePlanNode(AltibaseDataSource dataSource, int id, int depth, String plan, AltibasePlanNode parent) {
        return depth; 
                        return DBCPlanNodeKind.DEFAULT;
                sb.append('-');
    /**
        for (String kind : allowedKind) {
    /**
    /**
     * Returns options

    private int parentId;
    private static String getPrefix(int depth) {
        sb.append(plan).append(AltibaseConstants.NEW_LINE);

     * Return parent node
     * Returns operation
    private final List<AltibasePlanNode> nested = new ArrayList<AltibasePlanNode>();
        StringBuilder sb = new StringBuilder();
        }
            this.parentId = this.parent.getId();
                    case "SCAN":
        }
    }

            operation = plan.trim();
    public int getId() {
    }
            for (int i = 0; i < depth; i++) {
        this.plan = JSONUtils.getString(attributes, "plan");
    }

                        } else {
            }
                        return DBCPlanNodeKind.AGGREGATE;
    }
            this.parent.addChildNode(this);
     */
    public String getNodeName() {
    /**

    public String getPlanString() {
        nested.add(node);
    /**

                        if (options.contains("FULL SCAN")) {
        setOperation();
                        return DBCPlanNodeKind.MERGE;

    private final AltibaseDataSource dataSource;
        this.dataSource = dataSource;

            Arrays.asList("SCAN", 

    private String operation;


    }

     */
                    case "JOIN":
            sb.append("└");
                    "PROJECT", 

                    case "VIEW":
                    "FILTER", 
        return getPlanString();
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    "CONCATENATION", 

import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;

            if (operation.contains(kind)) {
                    "AGGREGATION", 

    public Collection<? extends DBCPlanNode> getNested() {
        this.depth = JSONUtils.getInteger(attributes, "depth");
        } else {

 *

    }
import java.util.*;
    public String getNodeType() {

                    "GROUP", 
     */
        return nested;
     * Create plan node from database result.
import org.jkiss.utils.IntKeyMap;
 * you may not use this file except in compliance with the License.
    /**

     */
    }
                    case "PROJECT":
     */

import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
    /**
            options = splittedPlan[1].replace(")", "").trim();
 *
        if (parentIdFromMap != null) {
        return sb.toString();
    /**
        this.plan = plan;
        StringBuilder sb = new StringBuilder();
    }

        }
                        return DBCPlanNodeKind.GROUP;
                            return DBCPlanNodeKind.INDEX_SCAN;
        setOperation();
        }
        if (dataSource.getContainer().getPreferenceStore().getBoolean(AltibaseConstants.PREF_PLAN_PREFIX)) {
     * 2. Otherwise -> set operation only.
    private String options;
            return getPrefix(this.depth) + plan;
                    case "INERT":
     * Returns depth
                        }

                    "HASH", 
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;
            String[] splittedPlan = plan.trim().split("\\(");
        if (parent != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
     */
     * Load plan from saved execution plan
 * limitations under the License.

        } else {
