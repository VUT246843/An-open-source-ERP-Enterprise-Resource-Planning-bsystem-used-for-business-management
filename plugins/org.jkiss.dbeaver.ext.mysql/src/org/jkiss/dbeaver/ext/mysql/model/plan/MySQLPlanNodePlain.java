
        return parent;
        this.ref = source.ref;

    @Property(order = 5, viewable = true)
    private void addChild(MySQLPlanNodePlain node) {
        }
        this.extra = JSONUtils.getString(props, "extra");
    public Integer getId() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.mysql.model.plan;
    public String getPossibleKeys() {
    @Override
    protected String ref;
    @Override
    }
        this.parent = parent;
    void setParent(MySQLPlanNodePlain node) {

            if (nested != null) {

    protected String key;
    public List<MySQLPlanNodePlain> getNested() {

    @Property(order = 6, viewable = true)

    public MySQLPlanNodePlain getParent() {
        this.table = JSONUtils.getString(props, "table");
        return null;
    }
 */
/**
                child.computeStats();
        return "PRIMARY".equals(selectType);
    public MySQLPlanNodePlain(MySQLPlanNodePlain parent, String type) {
    public String toString() {
        this.possibleKeys = JSONUtils.getString(props, "possible_keys");
        if (!nodes.isEmpty()) {
    public Long getFiltered() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.selectType = type;
    protected Long filtered;

    @Override
    protected Long rowCount;
 PRIMARY – the SELECT is in the outermost query in a JOIN
 *
    }
import java.util.Map;
    public String getKeyLength() {

            }
        this.ref = JDBCUtils.safeGetString(dbResult, "ref");
        return table;
            return DBCPlanNodeKind.SELECT;
            this.nested = new ArrayList<>(source.nested.size());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            this.parent.nested.remove(this);
        if ("SIMPLE".equals(selectType)) {
    @Override
        this.id = props.containsKey("id") ? CommonUtils.toInt(props.get("id")) : null;
import org.jkiss.dbeaver.model.meta.Property;
import java.sql.ResultSet;

        return null;
        this.nested.add(node);
                long calcCount = 0;
 * you may not use this file except in compliance with the License.

    protected String type;
    public boolean isCompositeNode() {
        this.rowCount = source.rowCount;
        this.extra = JDBCUtils.safeGetString(dbResult, "extra");
        }
    public String getExtra() {

        if (this.nested == null) {
    @Override
        return id + " " + selectType + " " + table;
            for (MySQLPlanNodePlain srcNode : source.nested) {
}
        this.ref = JSONUtils.getString(props, "ref");
 DERIVED – the SELECT is part of a subquery within a FROM clause
        this.parent = parent;
    }
        this.keyLength = JDBCUtils.safeGetString(dbResult, "key_len");
    }
    MySQLPlanNodePlain copyNode(MySQLPlanNodePlain parent) {
            }
 SIMPLE – the query is a simple SELECT query without any subqueries or UNIONs
                    calcCount += CommonUtils.toLong(child.getRowCount());

    }
        } else if ("UNION".equals(selectType)) {
    public Number getNodeCost() {

 * MySQL execution plan node.
    @Override


    public MySQLPlanNodePlain(MySQLPlanNodePlain parent, ResultSet dbResult) {
    }
        return nested;
    public String getTable() {
        }

    protected String table;
        this.parent = parent;

        this.key = JSONUtils.getString(props, "key");
            }

import org.jkiss.dbeaver.model.data.json.JSONUtils;
        return rowCount;
        this.selectType = JDBCUtils.safeGetString(dbResult, "select_type");
    }
    protected String possibleKeys;
        this.nested = nodes;
        this.keyLength = JSONUtils.getString(props, "key_len");
import org.jkiss.utils.CommonUtils;
        this.key = JDBCUtils.safeGetString(dbResult, "key");
 * Select type:
 * DBeaver - Universal Database Manager
            return DBCPlanNodeKind.JOIN;
    protected MySQLPlanNodePlain(MySQLPlanNodePlain parent, MySQLPlanNodePlain source) {
            this.parent.addChild(this);
        return ref;
import java.util.ArrayList;
    protected String extra;
    @Property(order = 7, viewable = true)
 UNION – the SELECT is the second or later statement of a UNION
        return id;
        this.parent = parent;

    protected String keyLength;

    }
            return DBCPlanNodeKind.UNION;
    public DBCPlanNodeKind getNodeKind() {
        }

        type = "<plan>";
        }
 UNION RESULT – the SELECT is a result of a UNION
                this.nested.add(srcNode.copyNode(this));
        return table;


    @Property(order = 2, viewable = true)
 UNCACHEABLE SUBQUERY – a subquery which is not cacheable (there are certain conditions for a query to be cacheable)
    }
    public String getNodeName() {
        return new MySQLPlanNodePlain(parent, this);
    public Number getNodePercent() {
                    child.computeStats();

    }
        this.type = JSONUtils.getString(props, "type");
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.type = JDBCUtils.safeGetString(dbResult, "type");

    }
    public Long getRowCount() {
            for (MySQLPlanNodePlain child : nested) {
 DEPENDENT UNION – the second or later SELECT of a UNION is dependent on an outer query
        this.selectType = JSONUtils.getString(props, "select_type");
        return keyLength;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNodeKind;
 *
    }
 * Unless required by applicable law or agreed to in writing, software
        }
        return null;
        }
 */

    }
    }
        this.type = source.type;
 *
        if (this.parent != null && this.parent.nested != null) {
    public MySQLPlanNodePlain(MySQLPlanNodePlain parent, Map<String, Object> props) {
            this.nested = new ArrayList<>();
        if (this.parent != null) {
                for (MySQLPlanNodePlain child : nested) {
        return selectType;
        this.id = source.id;
        this.key = source.key;

    protected Integer id;
    @Property(order = 8, viewable = true)
    }
 * limitations under the License.
    @Property(order = 4, viewable = true)
        this.filtered = source.filtered;
                this.rowCount = calcCount;
    }
    protected String selectType;
        return super.getNodeKind();
    public Number getNodeRowCount() {
        this.rowCount = JDBCUtils.safeGetLongNullable(dbResult, "rows");
    protected List<MySQLPlanNodePlain> nested;
                }
 DEPENDENT SUBQUERY – a subquery which is dependent upon on outer query
    }
    }
            this.rowCount = nodes.get(0).rowCount;
    @Override


    }
        return selectType;
    public String getKey() {
    public MySQLPlanNodePlain(List<MySQLPlanNodePlain> nodes) {
public class MySQLPlanNodePlain extends MySQLPlanNode {
        return filtered;
    }
        this.parent = node;
        return extra;
        this.table = source.table;

 *
        this.extra = source.extra;
        this.keyLength = source.keyLength;

        this.filtered = JDBCUtils.safeGetLongNullable(dbResult, "filtered");
 * See the License for the specific language governing permissions and
    }
        this.rowCount = props.containsKey("rows") ? CommonUtils.toLong(props.get("rows")) : null;
        return ref;
        } else if ("JOIN".equals(selectType)) {
    @Property(order = 1, viewable = true)
        this.table = JDBCUtils.safeGetString(dbResult, "table");
    public String getNodeType() {
    @Override
        this.possibleKeys = JDBCUtils.safeGetString(dbResult, "possible_keys");

        this.possibleKeys = source.possibleKeys;
    @Override
        }
    }
    }
    }
    protected MySQLPlanNodePlain parent;
        if (nested != null) {
    }
    }
        // Root node
        this.filtered = props.containsKey("filtered") ? CommonUtils.toLong(props.get("filtered")) : null;
    @Override
        return possibleKeys;
/*
    public String getSelectType() {
    public Number getNodeDuration() {
    }

    @Property(order = 9, viewable = true)
    @Property(order = 0, viewable = true)
    @Override


    @Property(order = 10, viewable = true)
    public String getNodeDescription() {
        return key;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import java.util.List;
 SUBQUERY – the first SELECT in a subquery

    public String getRef() {
        this.selectType = source.selectType;
    }
        if (rowCount == null) {

        if (source.nested != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 * You may obtain a copy of the License at
        this.id = JDBCUtils.safeGetInteger(dbResult, "id");
    @Property(order = 3, viewable = true)
    void computeStats() {

        return rowCount;
