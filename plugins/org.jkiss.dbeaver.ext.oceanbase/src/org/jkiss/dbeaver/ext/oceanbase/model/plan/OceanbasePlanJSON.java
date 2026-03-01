        this.query = query;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

    private String query;

import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
import java.util.ArrayList;
    }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    private OceanbaseMySQLDataSource dataSource;
                }
                rootNodes = nodes;
    public String getPlanQueryString() {
    public DBPDataSource getDataSource() {
                throw new DBCException(e, session.getExecutionContext());
        return super.getPlanFeature(feature);

    @Override
        } catch (SQLException e) {
            }
import java.util.List;

    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
        try (JDBCPreparedStatement dbStat = session.prepareStatement(getPlanQueryString())) {
                    throw new DBCException("Can't explain plan: " + rootNode.getProperty("message"));
/*
        this.rootNodes = rootNodes;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                OceanbasePlanNodeJSON rootNode = new OceanbasePlanNodeJSON(null, "select", queryBlock);
 * limitations under the License.
    

import com.google.gson.JsonObject;
                nodes.add(rootNode);
    OceanbasePlanJSON(JDBCSession session, String query) throws DBCException {
 *
        }
 * Unless required by applicable law or agreed to in writing, software
 *
 * See the License for the specific language governing permissions and
import com.google.gson.Gson;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private final List<OceanbasePlanNodeJSON> rootNodes;
    private static final Gson gson = new Gson();

            } catch (SQLException e) {
        return Collections.unmodifiableList(rootNodes);
 * You may obtain a copy of the License at
                if (CommonUtils.isEmpty(rootNode.getNested()) && rootNode.getProperty("message") != null) {
    public List<OceanbasePlanNodeJSON> getPlanNodes(Map<String, Object> options) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

package org.jkiss.dbeaver.ext.oceanbase.model.plan;

                JsonObject queryBlock = planObject.getAsJsonObject();
public class OceanbasePlanJSON extends AbstractExecutionPlan {
                String jsonPlan = dbResult.getString(1);
        return "EXPLAIN FORMAT=JSON " + query + ";";
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            return true;
                List<OceanbasePlanNodeJSON> nodes = new ArrayList<>();
        if (DBCPlanCostNode.FEATURE_PLAN_COST.equals(feature) || DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
import org.jkiss.dbeaver.model.DBPDataSource;

import java.util.Map;
        this.dataSource = (OceanbaseMySQLDataSource) session.getDataSource();

    public String getQueryString() {
 */
    
        return this.dataSource;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
import java.util.Collections;
        this.dataSource = (OceanbaseMySQLDataSource) dataSource;
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.DBCException;
        return query;
import org.jkiss.dbeaver.ext.oceanbase.model.OceanbaseMySQLDataSource;
            throw new DBCException(e, session.getExecutionContext());
    public Object getPlanFeature(String feature) {
    }
    
    }
        }
    }
    }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        this.query = query;
    OceanbasePlanJSON(MySQLDataSource dataSource, String query, List<OceanbasePlanNodeJSON> rootNodes) {
                JsonObject planObject = gson.fromJson(jsonPlan, JsonObject.class);
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
}

                dbResult.next();
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
