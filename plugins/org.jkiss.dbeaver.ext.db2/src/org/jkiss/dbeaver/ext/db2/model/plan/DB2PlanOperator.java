    // ----------------

public class DB2PlanOperator extends DB2PlanNode implements DBCPlanCostNode {
    public DB2PlanOperator(JDBCSession session, JDBCResultSet dbResult, DB2PlanStatement db2Statement, String planTableSchema)
    public void setEstimatedCardinality(Double estimatedCardinality)
    @Override

import java.sql.SQLException;
    public Integer getOperatorId()


    @Override
    public List<DB2PlanOperatorPredicate> getPredicates()
 * DB2 EXPLAIN_OPERATOR table
    }
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override

        sb.append(" WHERE EXPLAIN_REQUESTER = ?"); // 1
    public Double getTotalCost()
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    public String getNodeDescription() {
    }
import org.jkiss.dbeaver.model.meta.Property;
        loadChildren(session);
    public String toString()
        return nodename;
/*

        }
        sb.append("   AND OPERATOR_ID = ?");// 9
        this.planTableSchema = planTableSchema;
        sb.append("   AND SOURCE_SCHEMA = ?");// 4
    @Property(viewable = true, order = 3)

        return totalCost;
    private String displayName;


    {
 *
                    listPredicates.add(new DB2PlanOperatorPredicate(res, this));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static String buildName(Integer operatorId)
        }
    {
    // -------------
    }
                }
 * you may not use this file except in compliance with the License.
        sb.append(" FROM %s.%s");
            }

    {
    // --------
        sb.append("   AND STMTNO = ?");// 7
    {
    private void loadChildren(JDBCSession session) throws SQLException
    }
    @Property(viewable = true, order = 2)
        return listArguments;
 * DBeaver - Universal Database Manager

                while (res.next()) {

        sb.append("   AND EXPLAIN_LEVEL = ?");// 6
    @Override
    // ------------
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        this.operatorId = JDBCUtils.safeGetInteger(dbResult, "OPERATOR_ID");
        return listPredicates;
    {
        return estimatedCardinality;
}
 * You may obtain a copy of the License at
        this.nodename = buildName(operatorId);
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = true, order = 4, format = DB2Constants.PLAN_COST_FORMAT)
    // Pproperties
    }
        sqlStmt.setString(3, db2Statement.getSourceName());
    public Number getNodeRowCount() {

    }
        listPredicates = new ArrayList<>();

        return null;
        StringBuilder sb = new StringBuilder(1024);


    private DB2PlanStatement db2Statement;
        // DF: not sure if this rule is correct. Seems to be OK
    @Override
            }
    @Property(viewable = false, order = 7)


    public List<DB2PlanOperatorArgument> getArguments()

        sb.append(" WITH UR");
 *
        sb.append("   AND EXPLAIN_TIME = ?"); // 2
        listArguments = new ArrayList<>();

import java.util.ArrayList;
    }
    {
        this.operatorType = CommonUtils.valueOf(DB2PlanOperatorType.class, JDBCUtils.safeGetString(dbResult, "OPERATOR_TYPE"));
    public Number getNodePercent() {
        return totalCost;
 * 
    @Property(viewable = true, order = 1)
    @Property(viewable = true, order = 5, format = DB2Constants.PLAN_COST_FORMAT)
    }
    // ------------

import java.util.List;
    private String nodename;
            setQueryParameters(sqlStmt);
/**


        return ""; // Looks better without a name...
        sb.append("SELECT *");

        this.db2Statement = db2Statement;
            try (JDBCResultSet res = sqlStmt.executeQuery()) {
    public Number getNodeDuration() {
        return operatorType;
    static {
        try (JDBCPreparedStatement sqlStmt = session.prepareStatement(
    {
        sb.append("   AND SOURCE_NAME = ?");// 3
    }
    }
    @Override
    // Helpers
        {
        sqlStmt.setTimestamp(2, db2Statement.getExplainTime());
    public Double getEstimatedCardinality()
                    listArguments.add(new DB2PlanOperatorArgument(res));
        sqlStmt.setString(4, db2Statement.getSourceSchema());

        return null;
    public DB2PlanOperatorType getOperatorType()
                while (res.next()) {
    private List<DB2PlanOperatorArgument> listArguments;
    }
            String.format(SEL_BASE_SELECT, planTableSchema, "EXPLAIN_PREDICATE", "PREDICATE_ID")))
            String.format(SEL_BASE_SELECT, planTableSchema, "EXPLAIN_ARGUMENT", "ARGUMENT_TYPE")))
        this.displayName = nodename + " - " + operatorType;
        this.estimatedCardinality = Math.max(this.estimatedCardinality, estimatedCardinality);
    // Constructors
        sb.append("   AND SECTNO = ?");// 8

    private DB2PlanOperatorType operatorType;
    }
    {
    public String getDisplayName()
        SEL_BASE_SELECT = sb.toString();
    @Override
    }
    public String getNodeName()
    }
 * limitations under the License.
        return null;
        this.totalCost = JDBCUtils.safeGetDouble(dbResult, "TOTAL_COST");
    @Property(viewable = false, order = 6)
    }

        {
    public String getNodeType() {
    public Number getNodeCost() {
        sb.append("   AND SOURCE_VERSION = ?");// 5

 * @author Denis Forveille
    }
            setQueryParameters(sqlStmt);
package org.jkiss.dbeaver.ext.db2.model.plan;

        return String.valueOf(operatorId);
    {
    // Load children
    // -------------
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        sqlStmt.setString(1, db2Statement.getExplainRequester());
        sqlStmt.setString(5, db2Statement.getSourceVersion());

    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.utils.CommonUtils;

    // --------
        sqlStmt.setInt(7, db2Statement.getStmtNo());

    }
        try (JDBCPreparedStatement sqlStmt = session.prepareStatement(
    private Integer operatorId;
    {
        throws SQLException
    private Double estimatedCardinality = -1d;

    {
    private String planTableSchema;
    }
                }
    private static final String SEL_BASE_SELECT;
        return displayName;
    private void setQueryParameters(JDBCPreparedStatement sqlStmt) throws SQLException


        sqlStmt.setInt(9, operatorId);
        return operatorId;
        sqlStmt.setInt(8, db2Statement.getSectNo());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        sqlStmt.setString(6, db2Statement.getExplainLevel());
    private List<DB2PlanOperatorPredicate> listPredicates;

 *     http://www.apache.org/licenses/LICENSE-2.0
    // ----------------
        return CommonUtils.toString(operatorType);
        return null;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
    {
 */
    private Double totalCost;
    @Override
 */
        sb.append(" ORDER BY %s");// 9

            try (JDBCResultSet res = sqlStmt.executeQuery()) {
