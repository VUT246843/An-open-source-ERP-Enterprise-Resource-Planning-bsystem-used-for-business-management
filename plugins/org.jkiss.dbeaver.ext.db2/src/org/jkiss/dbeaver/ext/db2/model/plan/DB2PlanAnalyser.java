    // ----------------
    private static final String PT_EXPLAIN = "EXPLAIN PLAN SET QUERYNO = %d FOR %s";
 * limitations under the License.
        sb.append("                WHERE S.EXPLAIN_TIME = I.EXPLAIN_TIME");
    // ----------------
    private void cleanExplainTables(JDBCSession session, Integer stmtNo, String planTableSchema) throws SQLException
        sb.append(" WHERE EXISTS (SELECT 1");
 *
import org.jkiss.dbeaver.Log;
        Integer stmtNo = STMT_NO_GEN.incrementAndGet();
    {
    // ------------
        PT_DELETE = sb.toString();

    // Constructors
    // Helpers
import java.util.List;
        return listNodes;
            cleanExplainTables(session, stmtNo, planTableSchema);
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options)


    }
    }

import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
    static {
                    dbResult.next();
    @Override
    private DB2PlanStatement db2PlanStatement;
        sb.append("                  AND S.SOURCE_NAME = I.SOURCE_NAME");
    }
 */
            return true;
/**
    @Override
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    // ----------------
import org.jkiss.dbeaver.model.exec.DBCException;
 * See the License for the specific language governing permissions and
    }
        StringBuilder sb = new StringBuilder(256);
        this.planTableSchema = planTableSchema;
    public void explain(JDBCSession session) throws DBCException
    public DB2PlanAnalyser(String query, String planTableSchema)

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

            }
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
/*
            return "ms";
    private List<DB2PlanNode> listNodes;
            listNodes = db2PlanStatement.buildNodes();
    // Standard Getters
        try {
            // Clean afterward
            try (JDBCPreparedStatement dbStat = session.prepareStatement(explainStmt)) {
        }

            // Start by cleaning old rows for safety
 * DBeaver - Universal Database Manager
            try (JDBCPreparedStatement dbStat = session.prepareStatement(String.format(SEL_STMT, planTableSchema))) {
            throw new DBCException(e, session.getExecutionContext());

        sb.append("DELETE");
            dbStat.setInt(1, stmtNo);
        } else if (DBCPlanCostNode.PLAN_DURATION_MEASURE.equals(feature)) {
public class DB2PlanAnalyser extends AbstractExecutionPlan {

 *

 * Unless required by applicable law or agreed to in writing, software
    @Override
        sb.append("  FROM %s.EXPLAIN_INSTANCE I");
    private String planTableSchema;
        {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

    private static AtomicInteger STMT_NO_GEN = new AtomicInteger(Long.valueOf(System.currentTimeMillis() / 10000000L).intValue());
    // Business Methods
 * you may not use this file except in compliance with the License.
    {
    public String getPlanQueryString() {
    @Override
        sb.append("                  AND S.SOURCE_VERSION = I.SOURCE_VERSION");
            // Explain
            DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature))
    {
            dbStat.execute();
    }
            DBCPlanCostNode.FEATURE_PLAN_DURATION.equals(feature) ||
package org.jkiss.dbeaver.ext.db2.model.plan;
        sb.append("                  AND S.SOURCE_SCHEMA = I.SOURCE_SCHEMA");

        try (JDBCPreparedStatement dbStat = session.prepareStatement(String.format(PT_DELETE, planTableSchema, planTableSchema))) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
        LOG.debug("Schema=" + planTableSchema + " : " + explainStmt);
            // Build Node Structure
    private static String PT_DELETE;
import java.util.concurrent.atomic.AtomicInteger;
 * You may obtain a copy of the License at

        }
        // Delete previous statement rows
    private static final Log LOG = Log.getLog(DB2PlanAnalyser.class);
    public Object getPlanFeature(String feature) {
        sb.append("                 FROM %s.EXPLAIN_STATEMENT S");
            }
        return String.format(PT_EXPLAIN, STMT_NO_GEN.get(), query);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 


        }

    // ----------------


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (DBCPlanCostNode.FEATURE_PLAN_COST.equals(feature) ||
    // ------------
    private static final String SEL_STMT = "SELECT * FROM %s.EXPLAIN_STATEMENT WHERE QUERYNO = ? AND EXPLAIN_LEVEL = 'P' WITH UR";
                }
 */
                dbStat.setInt(1, stmtNo);
    {
import java.sql.SQLException;
 *
        sb.append("                  AND QUERYNO = ?)");
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;

                dbStat.execute();
}
    }


    // ----------------
                    db2PlanStatement = new DB2PlanStatement(session, dbResult, planTableSchema);
 * @author Denis Forveille

            cleanExplainTables(session, stmtNo, planTableSchema);
    }
        this.query = query;
        String explainStmt = String.format(PT_EXPLAIN, stmtNo, query);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    // ----------------
        return super.getPlanFeature(feature);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * DB2 execution plan analyser


 * Licensed under the Apache License, Version 2.0 (the "License");
        return query;
    private String query;
    // See init below


        } catch (SQLException e) {

    public String getQueryString()
    }
