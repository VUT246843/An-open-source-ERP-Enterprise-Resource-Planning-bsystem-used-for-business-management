        if (dataSource.isMariaDB()) {
    }
 *
    }
import com.google.gson.JsonObject;
                    throw new DBCException("Can't explain plan: " + rootNode.getProperty("message"));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    JsonElement value = prop.getValue();
                        case "message":
package org.jkiss.dbeaver.ext.mysql.model.plan;

        super((MySQLDataSource) session.getDataSource(), query);
/*
                return true;
            }
                rootNodes = nodes;
 * MySQL JSON plan
 *

public class MySQLPlanJSON extends MySQLPlanAbstract {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    public Object getPlanFeature(String feature) {
            throw new DBCException(e, session.getExecutionContext());

                        default:
                List<MySQLPlanNodeJSON> nodes = new ArrayList<>();

                MySQLPlanNodeJSON rootNode = new MySQLPlanNodeJSON(null, "select", queryBlock);
    }
    public MySQLPlanJSON(JDBCSession session, String query) throws DBCException {
                if (CommonUtils.isEmpty(rootNode.getNested()) && rootNode.getProperty("message") != null) {
                String jsonPlan = dbResult.getString(1);



import com.google.gson.Gson;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                MySQLPlanNodeJSON nodeJSON = new MySQLPlanNodeJSON(null, prop.getKey(), (JsonObject) value);
                nodes.add(rootNode);
                dbResult.next();
    @Override
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
import java.util.Map;
 */

 * Unless required by applicable law or agreed to in writing, software
            }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(getPlanQueryString())) {
import java.sql.SQLException;
                                nodes.add(nodeJSON);

                            selectId = value.getAsLong();
        return rootNodes;
 * DBeaver - Universal Database Manager
                        case "select_id":
 * you may not use this file except in compliance with the License.
    @Override
    @Override
        } catch (SQLException e) {
}

    public String getPlanQueryString() {
                            break;

                }
    }

import org.jkiss.utils.CommonUtils;
                    }
        return query;
    public List<MySQLPlanNodeJSON> getPlanNodes(Map<String, Object> options) {
                            errorMessage = value.getAsString();
 * limitations under the License.
        this.rootNodes = rootNodes;

            }
/**
                JsonObject queryBlock = planObject.getAsJsonObject("query_block");
                            } else if (value instanceof JsonObject) {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
        }
        return super.getPlanFeature(feature);
        return "EXPLAIN FORMAT=JSON " + query;
                        case "query_cost":
/*
            if (DBCPlanCostNode.FEATURE_PLAN_COST.equals(feature) ||
        }
    public String getQueryString() {
    private static final Gson gson = new Gson();
            if (DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
                            if (value instanceof JsonObject) {
                            break;
import java.util.List;
                for (Map.Entry<String, JsonElement> prop : queryBlock.entrySet()) {
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 *

        super(dataSource, query);

 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                }
    public MySQLPlanJSON(MySQLDataSource dataSource, String query, List<MySQLPlanNodeJSON> rootNodes) {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
                JsonObject planObject = gson.fromJson(jsonPlan, JsonObject.class);
    }
                            }
        "ordering_operation", "grouping_operation", "nested_loop", "table",
import java.util.ArrayList;
                    switch (prop.getKey()) {

                            break;
 */
                return true;
        "attached_subqueries", "optimized_away_subqueries", "materialized_from_subquery", "duplicates_removal"
    private final String[] nodePropNames = new String[] {
    @Override
        } else {
 * You may obtain a copy of the License at
*/
    };
    private List<MySQLPlanNodeJSON> rootNodes;
