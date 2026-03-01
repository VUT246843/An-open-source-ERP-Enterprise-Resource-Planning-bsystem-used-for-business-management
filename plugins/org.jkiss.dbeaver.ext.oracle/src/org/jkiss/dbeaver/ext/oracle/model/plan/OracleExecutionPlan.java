import java.util.ArrayList;
                } catch (Exception e) {
        this.rootNodes = nodes;
    public String getPlanQueryString() throws DBException {
        return super.getPlanFeature(feature);
        }
            "SET STATEMENT_ID = '" + planStmtId + "'\n" +
        }

/*
    public void readHistoric() throws DBException {
                while (dbResult.next()) {

            dbStat = session.prepareStatement(planQuery);
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
 *
                }
        if (planTableName == null) {
import java.sql.ParameterMetaData;
            DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
    }
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
    public Object getPlanFeature(String feature) {
    private JDBCSession session;
    OracleExecutionPlan(OracleDataSource dataSource, JDBCSession session, String query) {

            planStmtId = SecurityUtils.generateUniqueId();
 * DBeaver - Universal Database Manager
            readPlanNodes(dbStat);
            // Read explained plan

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        // Update costs
                dbStat.execute();
    public OracleExecutionPlan(String query, List<OraclePlanNode> nodes) {
            try {
import org.jkiss.utils.SecurityUtils;
    }
                    " WHERE SQL_ID=? ORDER BY ID");
    private String planStmtId;

        }
                    allNodes.put(node.getId(), node);
 *
    }
 * See the License for the specific language governing permissions and
                dbStat.execute();

        try {
 * You may obtain a copy of the License at
    private void readPlanNodes(JDBCPreparedStatement dbStat) throws SQLException {
        } catch (SQLException e) {
            JDBCPreparedStatement dbStat = session.prepareStatement(
            "FOR " + query;

import java.util.Map;
            }
        } else if (DBCPlanCostNode.PLAN_DURATION_MEASURE.equals(feature)) {
import org.jkiss.dbeaver.DBException;

    public void explain() throws DBException {
                    }
            try {

    }

            return "KC";
            node.updateCosts();
            "INTO " + planTableName + "\n" +

        }
            readPlanNodes(dbStat);
            dbStat.setString(1, planStmtId);
        this.dataSource = dataSource;
                rootNodes = new ArrayList<>();
                "SELECT * FROM " + planTableName +
    private List<OraclePlanNode> rootNodes;
        if (DBCPlanCostNode.FEATURE_PLAN_COST.equals(feature) ||

                        rootNodes.add(node);
            } finally {
    @Override
 * you may not use this file except in compliance with the License.
    private OracleDataSource dataSource;
            }
 * Oracle execution plan analyser
 *
        try {
            // Explain plan
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;

            // Detect plan table
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        this.query = query;
    @Override
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
        return "EXPLAIN PLAN " + "\n" +
        for (OraclePlanNode node : rootNodes) {
                "DELETE FROM " + planTableName +
            dbStat.close();
        this.dataSource = dataSource;
        String planQuery = getPlanQueryString();
import java.util.List;

        this.session = session;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                throw new DBCException("Plan table not found - query can't be explained");

}
            throw new DBCException(e, session.getExecutionContext());
            // (actually there should be no statement with this id -
                dbStat.close();
                    ParameterMetaData parameterMetaData = dbStat.getParameterMetaData();
    }

    OracleExecutionPlan(OracleDataSource dataSource, JDBCSession session, Object savedQueryId) {
            planTableName = dataSource.getPlanTableName(session);
 * distributed under the License is distributed on an "AS IS" BASIS,
                        }
                }
                    if (parameterMetaData != null && parameterMetaData.getParameterCount() > 0) {
import org.jkiss.dbeaver.model.exec.DBCException;
                dbStat.close();
            if (planTableName == null) {
import org.jkiss.utils.IntKeyMap;
package org.jkiss.dbeaver.ext.oracle.model.plan;
                    // Bind parameters if any
            return true;
        }
        this.query = query;
                    }
    private static final Log log = Log.getLog(OracleExecutionPlan.class);

import java.sql.SQLException;
        this.savedQueryId = savedQueryId;
    }
                    " WHERE STATEMENT_ID=? ");
    @Override
 * limitations under the License.
            dbStat = session.prepareStatement(
        this.session = session;
                            dbStat.setNull(i + 1, Types.VARCHAR);
                    log.error(e);
    public String getQueryString() {
    private String query;
        }
            // but let's do it, just in case)
        return query;
            // Read explained plan
    }

            } finally {
    }
import org.jkiss.dbeaver.Log;
        } catch (SQLException e) {
    }
public class OracleExecutionPlan extends AbstractExecutionPlan {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
                dbStat.setString(1, planStmtId);

            }
    @Override
    private String planTableName;
        } finally {
                "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(dataSource) + "DBA_HIST_SQL_PLAN" +
import java.sql.Types;
import org.jkiss.dbeaver.ext.oracle.model.OracleUtils;
 * Unless required by applicable law or agreed to in writing, software
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
/**

    }
        return rootNodes;
 * Licensed under the Apache License, Version 2.0 (the "License");

                try {

                        for (int i = 0; i < parameterMetaData.getParameterCount(); i++) {
                    " WHERE STATEMENT_ID=? ORDER BY ID");
                    if (node.getParent() == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */


 *     http://www.apache.org/licenses/LICENSE-2.0
            throw new DBCException(e, session.getExecutionContext());

            DBCPlanCostNode.FEATURE_PLAN_DURATION.equals(feature) ||
            // Delete previous statement rows
                    OraclePlanNode node = new OraclePlanNode(dataSource, allNodes, dbResult);
            }
        if (planStmtId == null) {
 */
                IntKeyMap<OraclePlanNode> allNodes = new IntKeyMap<>();
    private Object savedQueryId;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            JDBCPreparedStatement dbStat = session.prepareStatement(
        try {
