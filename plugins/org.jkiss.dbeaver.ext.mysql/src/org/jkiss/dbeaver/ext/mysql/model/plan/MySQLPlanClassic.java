                    MySQLPlanNodePlain leftNode = lastCompositeNode;
import java.util.ArrayList;
 * DBeaver - Universal Database Manager
        return leftNode;
        List<MySQLPlanNodePlain> subList = new ArrayList<>();

 */


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
        }
            leftNode.setParent(nodeJoin);
                if (nodes.isEmpty()) {
            if (parent != null) {
        }
        }
            MySQLPlanNodePlain lastCompositeNode = null;
        } else {
        super((MySQLDataSource) session.getDataSource(), query);
            rightNode.setParent(nodeJoin);
 * MySQL execution plan analyser
 *
                    roots.add(node);
                    } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Map;
                List<MySQLPlanNodePlain> nodes = getQueriesById(srcNodes, id);
    private List<MySQLPlanNodePlain> convertToPlanTree(List<MySQLPlanNodePlain> srcNodes) {
                    nodes.add(node);
 *
        this.rootNodes = rootNodes;
                    if (leftNode == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                rootNodes = nodes;
        return super.getPlanFeature(feature);
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
/**
                    }

        }
                }
        for (MySQLPlanNodePlain node : roots) {
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        try (JDBCPreparedStatement dbStat = session.prepareStatement(getPlanQueryString())) {
            }
            // Add the rest
                if (node.getId() != null && !parsed.contains(node)) {
        return subList;
    }
                    }

                nodeJoin.setParent(parent);

                    if (firstNode.isCompositeNode()) {
        return rootNodes;
    @Override
            }


import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and

    private MySQLPlanNodePlain joinNodes(List<MySQLPlanNodePlain> srcNodes, MySQLPlanNodePlain parent, List<MySQLPlanNodePlain> nodes) {
    }

            leftNode = nodeJoin;
    @Override
        return "EXPLAIN EXTENDED " + query;
import org.jkiss.dbeaver.model.exec.DBCException;
                }
                }
            }
        return query;
        for (int i = 1; i < nodes.size(); i++) {
    }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        super(dataSource, query);
                    MySQLPlanNodePlain node = new MySQLPlanNodePlain(null, dbResult);
public class MySQLPlanClassic extends MySQLPlanAbstract {
                        roots.add(joinNode);
}
                } else {
        MySQLPlanNodePlain leftNode = nodes.get(0);
            MySQLPlanNodePlain rightNode = nodes.get(i);
    }
                List<MySQLPlanNodePlain> nodes = new ArrayList<>();
            node.computeStats();
        if (DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
                        roots.add(firstNode);
                while (dbResult.next()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            MySQLPlanNodeJoin nodeJoin = new MySQLPlanNodeJoin(parent, leftNode, rightNode);
                    MySQLPlanNodePlain joinNode = joinNodes(srcNodes, leftNode, nodes);
                        firstNode.setParent(lastCompositeNode);
import java.sql.SQLException;
            if (node.getId() != null && node.getId() == id) {
    }
        if (srcNodes.size() == 1) {
    }
    }
package org.jkiss.dbeaver.ext.mysql.model.plan;
                    MySQLPlanNodePlain firstNode = nodes.get(0);
                    if (leftNode == null) {

        for (MySQLPlanNodePlain node : srcNodes) {
            throw new DBCException(e, session.getExecutionContext());
                }
            }
 * Unless required by applicable law or agreed to in writing, software
        } catch (SQLException e) {
 * you may not use this file except in compliance with the License.
    public Object getPlanFeature(String feature) {
                    }
            List<MySQLPlanNodePlain> parsed = new ArrayList<>();
        List<MySQLPlanNodePlain> roots = new ArrayList<>();
    @Override
    public MySQLPlanClassic(MySQLDataSource dataSource, String query, List<MySQLPlanNodePlain> rootNodes) {

            for (MySQLPlanNodePlain node : srcNodes) {
    public String getPlanQueryString() {
                        leftNode = nodes.get(0).getParent();
            // Just one node
 */
                if (nodes.size() == 1) {
import java.util.List;
            roots.add(srcNodes.get(0));
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
                    break;
 *

            for (int id = 1; ; id++) {
            }
    }
                subList.add(node);
    @Override
                        lastCompositeNode = firstNode;

            return true;
 * You may obtain a copy of the License at

    public MySQLPlanClassic(JDBCSession session, String query) throws DBCException {
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {

        return roots;
 * limitations under the License.
                parsed.addAll(nodes);
    private List<MySQLPlanNodePlain> getQueriesById(List<MySQLPlanNodePlain> srcNodes, int id) {
    public String getQueryString() {
                    if (lastCompositeNode != null) {
        }
    private List<MySQLPlanNodePlain> rootNodes;
