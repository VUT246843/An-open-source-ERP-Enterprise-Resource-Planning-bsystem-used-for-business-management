            Map<String, Object> parameters = this.configuration.getParameters();
                    nodes.add(0,curNode);

            rootNodes.add(new PostgrePlanNodeXML(session.getDataSource(), null, planElement));
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
    }
        } finally {
            }
    public Object getPlanFeature(String feature) {
                        curParentNode =  rootNode;
                    && !CommonUtils.toBoolean(parameters.get(PostgreQueryPlaner.PARAM_ANALYSE))
                    continue;
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
                    }
import org.jkiss.dbeaver.model.DBPDataSource;
                        if (dbResult.next()) {

    }

                 if (lineIndent == 0) {
                    // We can't add TIMING if ANALYZE is not add
        this.verbose = verbose;
        Element queryElement = XMLUtils.getChildElement(planDocument.getDocumentElement(), "Query");
 * limitations under the License.
 * DBeaver - Universal Database Manager
                    break;
                    continue;
    @Override
        }
                            SQLXML planXML = dbResult.getSQLXML(1);
                            if(nodes.get(i).getIndent() == lineIndent - 2) {
                        }
            }
                        parsePlanText(session, planLines);
import org.w3c.dom.Document;
                }
                    if (lineIndent > curNode.getIndent()) {
            // Rollback changes because EXPLAIN actually executes query and it could be INSERT/UPDATE
            return true;
 *
    }
                // Root node

                // In other cases we can just add parameter keyword
        rootNodes.add(rootNode);
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            return "EXPLAIN " + (verbose ? "VERBOSE " : "") + query;
                } else {
                            String planLine = dbResult.getString(1);
            explainStat.append("EXPLAIN (FORMAT XML");
 */
                        }
        for (String line : lines) {
 * Postgre execution plan analyser
        }
        DBPDataSource dataSource = session.getDataSource();
                    continue;
        }
                    } else {
        throws DBCException
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ext.postgresql.model.plan;
        List<PostgrePlanNodeText> nodes = new ArrayList<>(lines.size());
                    } else {


    private void parsePlanText(DBCSession session, List<String> lines) {
                lineIndent++;
    }
                if (CommonUtils.toBoolean(entry.getValue())) {
    public String getQueryString()
        }
                                planLines.add(planLine);
                }
                        //need find upper parent
        return rootNodes;
                    explainStat.append(",").append(key);

                nodes.add(rootNode);
    {
        PostgrePlanNodeText rootNode = null, curNode = null, curParentNode = null;
        rootNodes = new ArrayList<>();
    public void explain(DBCSession session)
    private void parsePlanXML(DBCSession session, SQLXML planXML) throws SQLException, XMLException {
                        curParentNode = curNode;  

                        curNode = new PostgrePlanNodeText(dataSource, curParentNode, line, lineIndent);
        if (oldQuery) {
            DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature))
    {
                    }
    {
                    }
import org.jkiss.dbeaver.Log;
public class PostgreExecutionPlan extends AbstractExecutionPlan {


                    }
import org.jkiss.utils.xml.XMLException;
        rootNodes = new ArrayList<>();
            throw new DBCException(e, session.getExecutionContext());
                                curParentNode = nodes.get(i);
                    if (oldQuery) {
                // Child node
        this.configuration = new DBCQueryPlannerConfiguration();
        if (DBCPlanCostNode.FEATURE_PLAN_COST.equals(feature) ||
        this.query = query;
            if (oldAutoCommit) {
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options)
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
                    continue;
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
                    }
                String key = entry.getKey();
        boolean oldAutoCommit = false;
    private static final String NODE_PREFIX = "->  ";
                    throw new DBCException("Can't parse plan XML", e);
                }
                connection.rollback();
import java.util.ArrayList;
                    connection.setAutoCommit(true);
                }
                curIndent = lineIndent;
                        curNode.addProp(line);
    }
import java.util.Map;
    }
    public PostgreExecutionPlan(String query, List<PostgrePlanNodeExternal> nodes) {
    private DBCQueryPlannerConfiguration configuration;
            if (curIndent == 0 && lineIndent == 0) {
                }
}
import org.jkiss.dbeaver.model.exec.DBCSession;
 * See the License for the specific language governing permissions and
        this.configuration = configuration;
        this.oldQuery = oldQuery;
                    } else {
                } catch (XMLException e) {
            return explainStat.toString();
    public PostgreExecutionPlan(boolean oldQuery, boolean verbose, String query, DBCQueryPlannerConfiguration configuration)

                            }
                    curNode = new PostgrePlanNodeText(dataSource, curParentNode, line, lineIndent);
    private String query;
                if (PostgreQueryPlaner.PARAM_COSTS.equals(key) || PostgreQueryPlaner.PARAM_TIMING.equals(key)) {

            StringBuilder explainStat = new StringBuilder(64);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (line.charAt(i) != ' ') {
                connection.setAutoCommit(false);
                        curNode.addProp(line);
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    {
/**
        this.query = query;
            for (int i = lineIndent; i < line.length(); i++) {
                            if (!CommonUtils.isEmpty(planLine)) {
                        while (dbResult.next()) {
                curParentNode = curNode = rootNode = new PostgrePlanNodeText(dataSource, null, line, lineIndent);
 *     http://www.apache.org/licenses/LICENSE-2.0
        try {
 * Unless required by applicable law or agreed to in writing, software
        JDBCSession connection = (JDBCSession) session;
                        nodes.add(0,curNode);
                    if (!CommonUtils.toBoolean(entry.getValue())) {
                ) {
    }
                            }
                curIndent = lineIndent;
        return super.getPlanFeature(feature);
 * You may obtain a copy of the License at
 *
import java.sql.SQLException;
        this.rootNodes = new ArrayList<>();
    public String getPlanQueryString() {
                            parsePlanXML(session, planXML);
            oldAutoCommit = connection.getAutoCommit();
    }
                                break;
                        explainStat.append(",").append(key).append(" FALSE");
 *
                if (line.substring(lineIndent).startsWith(NODE_PREFIX)) {
            } catch (SQLException e) {
                }
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
        int curIndent = 0;
                     if (lineIndent + NODE_PREFIX.length() < curNode.getIndent()) {
            try {
                try (JDBCResultSet dbResult = dbStat.executeQuery(getPlanQueryString())) {
                        lineIndent += NODE_PREFIX.length();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private boolean verbose;
            int lineIndent = 0;
                        log.debug("Unexpected node line: " + line);
 */
 * you may not use this file except in compliance with the License.
import org.w3c.dom.Element;
            DBCPlanCostNode.FEATURE_PLAN_DURATION.equals(feature) ||
                    if (curNode != null) {
                if (PostgreQueryPlaner.PARAM_TIMING.equals(key)
                    lineIndent += NODE_PREFIX.length();
        } else {
                    // Trailing plan statuses
    private static final Log log = Log.getLog(PostgreExecutionPlan.class);

    @Override
                    // if they are false. And SUMMARY is true by default only for ANALYZE parameter
    private List<DBCPlanNode> rootNodes;
import java.sql.SQLXML;
                log.error("Error closing plan analyser", e);
            try (JDBCStatement dbStat = connection.createStatement()) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
                } else {
            for (Map.Entry<String, Object> entry : CommonUtils.safeCollection(parameters.entrySet())) {
                }

                        List<String> planLines = new ArrayList<>();
        return query;
        }
import org.jkiss.utils.xml.XMLUtils;
            } else if (lineIndent < curIndent) {
    @Override
        for (Element planElement : XMLUtils.getChildElementList(queryElement, "Plan")) {
            }
        } catch (SQLException e) {
                        }
                    //log.debug("New child " + line);
            }
                } else if (lineIndent == curIndent || lineIndent == curIndent) {
    private static final String PROP_PREFIX = "  ";
                    if (!line.substring(lineIndent).startsWith(NODE_PREFIX)) {
            }
                    // Property
                    curNode.addProp(line);

    private boolean oldQuery;
                    }
        {
                if (oldAutoCommit) {

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    // COSTS and TIMING are true by default, no need to add it to query if they are true, but we need to add them
                        for(int i = 0;i<nodes.size();i++) {
        this.rootNodes.addAll(nodes);
        Document planDocument = XMLUtils.parseDocument(planXML.getBinaryStream());
import java.util.List;
            } else if (lineIndent >= curIndent) {
            explainStat.append(") ").append(query);
