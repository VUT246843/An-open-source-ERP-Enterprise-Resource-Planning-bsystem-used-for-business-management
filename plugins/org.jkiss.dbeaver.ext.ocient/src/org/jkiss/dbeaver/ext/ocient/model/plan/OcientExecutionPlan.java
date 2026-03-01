    public String getPlanQueryString() {
        OcientPlanNodeJson headerNode = new OcientPlanNodeJson(null, "header", planHeader);

import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;

    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
        return rootNodes;
        rootNodes = new ArrayList<>();
        JsonObject planObject = gson.fromJson(explainString, JsonObject.class);
        }
        rootNodes.add(headerNode);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Unless required by applicable law or agreed to in writing, software
    }

    }
        return plan;
    @Override
        String explainString = getExplainString(session);
            JDBCPreparedStatement dbStat = connection.prepareStatement(getPlanQueryString());
    @Override
            || DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
package org.jkiss.dbeaver.ext.ocient.model.plan;
        try {
    }
 *
/*
        this.query = query;

import java.sql.SQLException;
        }
        return "explain json " + query;
        String plan = "";


import com.google.gson.Gson;
        OcientPlanNodeJson rootNode = new OcientPlanNodeJson(null, "Root", planRoot);
            throw new DBCException(e, session.getExecutionContext());
        return query;
 */
    @Override
    }
    }
    private String getExplainString(DBCSession session) throws DBCException {
            dbResult.close();
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public void explain(DBCSession session) throws DBCException {
        rootNodes.add(rootNode);
import com.google.gson.JsonObject;
import java.util.List;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        // Adds "explain json" to front of query with proper spacing

            return true;
            while (dbResult.next()) {
        return super.getPlanFeature(feature);
import java.util.ArrayList;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
 * You may obtain a copy of the License at
        if (DBCPlanCostNode.FEATURE_PLAN_COST.equals(feature) || DBCPlanCostNode.FEATURE_PLAN_DURATION.equals(feature)
    private static final Gson gson = new Gson();
    @Override
            }
 *

    public OcientExecutionPlan(String query, List<OcientPlanNodeJson> rootNodes) {
    private String query;
        JsonObject planHeader = planObject.getAsJsonObject("header");

 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
                plan += planLine;
    }
        JsonObject planRoot = planObject.getAsJsonObject("rootNode");
    }
 * limitations under the License.
        this.query = query;
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.DBCSession;
    }

}

    public OcientExecutionPlan(String query) {
            JDBCResultSet dbResult = dbStat.executeQuery();
import java.util.Map;

                String planLine = dbResult.getString(1);
import org.jkiss.dbeaver.model.exec.DBCException;
    public Object getPlanFeature(String feature) {
 * See the License for the specific language governing permissions and
    public String getQueryString() {
        this.rootNodes = rootNodes;
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class OcientExecutionPlan extends AbstractExecutionPlan {
        JDBCSession connection = (JDBCSession) session;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private List<OcientPlanNodeJson> rootNodes;
 *

