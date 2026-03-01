    private final Timestamp explainTime;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import java.sql.Timestamp;
        return sourceName;
                targetNode.setEstimatedCardinality(planStream.getStreamCount());
    private final Double totalCost;
        return listStreams;
        // DF: Very Important!: The Stream MUST be order by STREAM_ID DESC for the viewer to display things right (from the list

    public Integer getSectNo() {
    // ------------
    private final String explainRequester;
                sourceNode.setParent(targetNode);
 * limitations under the License.

    }
        }


        return statementText;
}
    }

        try (JDBCPreparedStatement sqlStmt = session.prepareStatement(String.format(SEL_BASE_SELECT, planTableSchema, "EXPLAIN_OBJECT",



 * DBeaver - Universal Database Manager
    // Standard Getters

            }
            setQueryParameters(sqlStmt);
            setQueryParameters(sqlStmt);

            "OBJECT_SCHEMA,OBJECT_NAME"))) {
        sqlStmt.setString(6, explainLevel);
                sourceNode.getNested().add(targetNode);
                    db2PlanObject = new DB2PlanObject(res);
            }

 *
        this.planTableSchema = planTableSchema;

 */
        DB2PlanNode targetNode;
    public List<DB2PlanStream> getListStreams() {
            // parents
public class DB2PlanStatement {
    public Integer getQueryDegree() {
            // Get Source Node
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private final Integer queryDegree;
            setQueryParameters(sqlStmt);
        this.queryDegree = JDBCUtils.safeGetInteger(dbResult, "QUERY_DEGREE");
    public String getExplainLevel() {
    }
                while (res.next()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                    mapDataObjects.put(db2PlanObject.getNodeName(), db2PlanObject);
                    listStreams.add(new DB2PlanStream(res, this));
    public Integer getStmtNo() {
    private final String explainLevel;
    // Constructors
 *
    private final String statementText;
        sqlStmt.setString(1, explainRequester);
                }
 * DB2 EXPLAIN_STATEMENT table
        return stmtNo;
        // order)

 *
    }
        return explainRequester;
            }
    }
    // -------------
            try (JDBCResultSet res = sqlStmt.executeQuery()) {
                while (res.next()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getExplainRequester() {
        this.sourceSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCE_SCHEMA");
        "WHERE EXPLAIN_REQUESTER = ? AND EXPLAIN_TIME = ? AND SOURCE_NAME = ? AND SOURCE_SCHEMA = ?" +
    public String getSourceName() {
    private static final String SEL_BASE_SELECT = "SELECT * FROM %s.%s\n" +
        sqlStmt.setInt(7, stmtNo);
    // ----------------
 * Unless required by applicable law or agreed to in writing, software
                DB2PlanObject db2PlanObject;
            // DF: "Data Objects" may be "target" of "Explain" Streams and have multiple parents..

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import java.sql.SQLException;
            // Get Target Node
        }
        try (JDBCPreparedStatement sqlStmt = session.prepareStatement(
import java.util.*;
        }
    private final Integer stmtNo;
    public String getPlanTableSchema() {
    // ----------------
    }
            }

    public Double getTotalCost() {

    public String getStatementText() {
package org.jkiss.dbeaver.ext.db2.model.plan;
                sourceNode = new DB2PlanObject((DB2PlanObject) sourceNode);
        this.sourceVersion = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCE_VERSION");
        sqlStmt.setTimestamp(2, explainTime);
        this.stmtNo = JDBCUtils.safeGetInteger(dbResult, "STMTNO");
    }
        return explainLevel;
 * Licensed under the Apache License, Version 2.0 (the "License");
        sqlStmt.setInt(8, sectNo);
            } else {
        try (JDBCPreparedStatement sqlStmt = session.prepareStatement(
        return explainTime;
    public List<DB2PlanNode> buildNodes() {


    public String getSourceSchema() {
    // ----------------


    private void loadChildren(JDBCSession session) throws SQLException {
            String.format(SEL_BASE_SELECT, planTableSchema, "EXPLAIN_STREAM", "STREAM_ID DESC"))) {

        this.explainLevel = JDBCUtils.safeGetStringTrimmed(dbResult, "EXPLAIN_LEVEL");
        return planTableSchema;
                // Inverse target <-> source
        loadChildren(session);
    }
                DB2PlanOperator db2PlanOperator;
    }

    public String getSourceVersion() {
    private final Map<String, DB2PlanObject> mapDataObjects = new HashMap<>();
 */
        DB2PlanNode sourceNode;
    private final String sourceName;

            String.format(SEL_BASE_SELECT, planTableSchema, "EXPLAIN_OPERATOR", "OPERATOR_ID"))) {
    }
        this.sourceName = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCE_NAME");

        return rootNode == null ? Collections.emptyList() : Collections.singletonList(rootNode);
    private final String sourceSchema;
    private DB2PlanNode rootNode;
        " AND SOURCE_VERSION = ? AND EXPLAIN_LEVEL = ? AND STMTNO = ? AND SECTNO = ?\n" +
        this.sectNo = JDBCUtils.safeGetInteger(dbResult, "SECTNO");
    // Business Methods
        this.explainRequester = JDBCUtils.safeGetStringTrimmed(dbResult, "EXPLAIN_REQUESTER");
 * distributed under the License is distributed on an "AS IS" BASIS,

                sourceNode = mapOperators.get(planStream.getSourceName());
                }

            if (planStream.getSourceType().equals(DB2PlanNodeType.D)) {

        this.totalCost = JDBCUtils.safeGetDouble(dbResult, "TOTAL_COST");

    }

    private void setQueryParameters(JDBCPreparedStatement sqlStmt) throws SQLException {

    private final String sourceVersion;
 * You may obtain a copy of the License at
                    mapOperators.put(db2PlanOperator.getNodeName(), db2PlanOperator);
    private final Map<String, DB2PlanOperator> mapOperators = new HashMap<>();

    }
            // It seems reasonable to reverse the stream after cloning the Object because the same Data Object has multiple
    // -------------
            if (planStream.getTargetType().equals(DB2PlanNodeType.D)) {
            // DBeaver Explain Plan Viewer shows nodes in parent-child hierarchy so a node can not have multiple "parents"
    public Timestamp getExplainTime() {
                sourceNode = mapDataObjects.get(planStream.getSourceName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return sectNo;
/*
    private final Integer sectNo;
        sqlStmt.setString(3, sourceName);
                        rootNode = db2PlanOperator;
    // Load children
        this.explainTime = JDBCUtils.safeGetTimestamp(dbResult, "EXPLAIN_TIME");
 *

        sqlStmt.setString(4, sourceSchema);
            try (JDBCResultSet res = sqlStmt.executeQuery()) {
        }
                    db2PlanOperator = new DB2PlanOperator(session, res, this, planTableSchema);
        "ORDER BY %s\n" +
    public DB2PlanStatement(JDBCSession session, JDBCResultSet dbResult, String planTableSchema) throws SQLException {
        return sourceSchema;
    }

    }
        "WITH UR";
        for (DB2PlanStream planStream : listStreams) {
 * See the License for the specific language governing permissions and
 * @author Denis Forveille
        sqlStmt.setString(5, sourceVersion);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
            try (JDBCResultSet res = sqlStmt.executeQuery()) {
                targetNode.getNested().add(sourceNode);
        return queryDegree;

/**
            }
                targetNode = mapDataObjects.get(planStream.getTargetName());
        this.statementText = JDBCUtils.safeGetString(dbResult, "STATEMENT_TEXT");
            } else {

    private final List<DB2PlanStream> listStreams = new ArrayList<>();
                targetNode = mapOperators.get(planStream.getTargetName());
                targetNode = new DB2PlanObject((DB2PlanObject) targetNode);

    // ----------------
                while (res.next()) {
        return totalCost;
            // LOG.debug(planStream.getStreamId() + " src=" + planStream.getSourceName() + " tgt=" + planStream.getTargetName());
                    if (rootNode == null || db2PlanOperator.getOperatorType() == DB2PlanOperatorType.RETURN) {


    private final String planTableSchema;


                targetNode.setParent(sourceNode);
    }
    // ------------
        // Based on streams, establish relationships between nodes
 * you may not use this file except in compliance with the License.
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return sourceVersion;
