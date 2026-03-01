        this.operatorInfo = JDBCUtils.safeGetString(dbResult, "operator info");
    public Collection<? extends DBCPlanNode> getNested() {
        this.nested = nodes;
    private void addChild(TiDBPlanNodePlain node) {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
 *
    }
/*
        return null;

    }
    public String getNodeName() {

     *
        return null;

    @Override
 * Copyright (C) 2010-2022 DBeaver Corp and others

     * |   └─Selection           | 0.00    | cop[tikv] |               | eq(test.t1.c1, 3)              |
    }

        // Root node
        return this.accessObject;
        return Double.parseDouble(this.estRows);
        this.parent = parent;
        }

 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
    @Override
    public Number getNodePercent() {
        return this.id.trim().replaceAll("└", "").replaceAll("─", "");
        return estRows;

        this.accessObject = JDBCUtils.safeGetString(dbResult, "access object");
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

            this.estRows = nodes.get(0).estRows;
    }

import java.util.Collection;
    }
        return task;
    public TiDBPlanNodePlain(List<TiDBPlanNodePlain> nodes) {
     */

    protected String accessObject;
 * See the License for the specific language governing permissions and
    @Override
 * You may obtain a copy of the License at
            this.parent.addChild(this);
    @Property(order = 2, viewable = true)

     * +-------------------------+---------+-----------+---------------+--------------------------------+
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    /**
import java.util.List;
     * The result of explain will be like this:
 * you may not use this file except in compliance with the License.
    }
    protected String operatorInfo;
    @Override
    @Override
        }
    }
     * +-------------------------+---------+-----------+---------------+--------------------------------+

        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
     * +-------------------------+---------+-----------+---------------+--------------------------------+
 *
        this.estRows = JDBCUtils.safeGetString(dbResult, "estRows");

    public String getEstRows() {
    @Override
        return id;
    void setParent(TiDBPlanNodePlain node) {
        this.task = JDBCUtils.safeGetString(dbResult, "task");
import org.jkiss.dbeaver.ext.mysql.model.plan.MySQLPlanNode;
    public Number getNodeCost() {
    }
        id = "<plan>";
     * | Delete                  | N/A     | root      |               | N/A                            |
        this.id = JDBCUtils.safeGetString(dbResult, "id");
    }
     * | id                      | estRows | task      | access object | operator info                  |
        if (this.parent != null && this.parent.nested != null) {
    public String getAccessObject() {

    }
import java.sql.ResultSet;
        if (this.parent != null) {
    public String getId() {
    @Property(order = 0, viewable = true)
        }
import java.util.ArrayList;
    protected String task;
    }

     * | └─TableReader           | 0.00    | root      |               | data:Selection                 |
public class TiDBPlanNodePlain extends MySQLPlanNode {

}
    public TiDBPlanNodePlain(TiDBPlanNodePlain parent, ResultSet dbResult) {
    protected List<TiDBPlanNodePlain> nested;
     * You need to replace the other chars.
        return accessObject;
    protected String id;
    public Number getNodeRowCount() {
     * So, If you want get the operator name, like "Delete" or "TableReader".
        this.nested.add(node);
    }
        if (!nodes.isEmpty()) {
     * getNodeType
package org.jkiss.dbeaver.ext.tidb.model.plan;
            this.nested = new ArrayList<>();
 */
import org.jkiss.dbeaver.model.meta.Property;
        if (this.nested == null) {
    // Before 4.0 estRows named "count"

    @Property(order = 3, viewable = true)
    public Number getNodeDuration() {
    public TiDBPlanNodePlain getParent() {
 *
    public String getNodeType() {
    protected TiDBPlanNodePlain parent;


    }
    protected String estRows;
    public String getOperatorInfo() {
    @Property(order = 4, viewable = true)


        }
        return this.nested;


        return operatorInfo;
        this.parent = node;
            this.parent.nested.remove(this);
    @Property(order = 1, viewable = true)
 * distributed under the License is distributed on an "AS IS" BASIS,
        return parent;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
     * |     └─TableFullScan     | 3.00    | cop[tikv] | table:t1      | keep order:false, stats:pseudo |
     * @return node type
    public String getTask() {
