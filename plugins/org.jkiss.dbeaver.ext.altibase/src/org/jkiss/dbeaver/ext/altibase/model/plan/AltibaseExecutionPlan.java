             * Here, the second method is required.
    /**
                    stmt.getClass().getMethod("executeQuery").invoke(stmt);
 * limitations under the License.
    }
    /** 
            }
            expPlan = AltibaseConstants.ExplainPlan.getByIndex(
            method = clazz.getMethod(setExplainPlan, byte.class);

            JDBCPreparedStatement dbStat = session.prepareStatement(getQueryString());
            if (expPlan == AltibaseConstants.ExplainPlan.ON) {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
                throw new NoSuchMethodException(String.format(

            conn = session.getOriginal();
            throw new DBCException(e, session.getExecutionContext());
        ExplainPlan expPlan = null;
        return planQuery;
    private String getExplainPlan(JDBCSession session, String query) {
                        clazz.getName(), setExplainPlan,  AltibaseDataTypeDomain.BYTE.getTypeName().toLowerCase()));
            }
    }
    @Override
    @Override

            }
            
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.lang.reflect.Method;
     * Deserialize execution plan
        try {
    private static final String setExplainPlan = "setExplainPlan";
                    dataSource.getContainer().getPreferenceStore().getInt(
            // Read explained plan
     */

                dbStat.close();
        } catch (Exception e) {
        Connection conn = null;
 * See the License for the specific language governing permissions and
/*
                    e.printStackTrace();
    }
        } finally {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
             * The first one's argument is boolean, the second one's argument is byte.
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
    }
            if (stmt != null) {
    private AltibaseDataSource dataSource;

    }
    private JDBCSession session;
                        "Unable to find the target method: [class] %s, [method] %s, [argument type] %s", 

     */
            method.invoke(conn, expPlan.getArgValue());
import java.util.List;
        this.session = session;
            clazz = conn.getClass();
                rootNodes = AltibasePlanBuilder.build(dataSource, plan);
    /**
                String plan = getExplainPlan(session, query);
import java.util.Map;
        return planQuery;
        this.query = query;
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
     */
        this.rootNodes = nodes;
     * Read from database
    public String getPlanQueryString() throws DBException {
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
import org.jkiss.dbeaver.Log;
                if (query.trim().toUpperCase().startsWith("SELECT")) {
        }
            
                } else {
                    stmt.close();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } finally {
    private String planQuery;
    }
    
    public AltibaseExecutionPlan(String query, List<AltibasePlanNode> nodes) {
     *  Get explain plan result string using Java reflection. 
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    }
 *
 *
                try {

                } catch (SQLException e) {
 * You may obtain a copy of the License at
                            AltibaseConstants.PREF_EXPLAIN_PLAN_TYPE));
                }
    public AltibaseExecutionPlan(AltibaseDataSource dataSource, JDBCSession session, String query) {

     * Get Execution Plan by firing query to database. 
 * Unless required by applicable law or agreed to in writing, software
    private List<AltibasePlanNode> rootNodes;
            planQuery = (String) stmt.getClass().getMethod("getExplainPlan").invoke(stmt);
            }
            

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants.ExplainPlan;


    public String getQueryString() {
 * DBeaver - Universal Database Manager
    @Override
    public void explain() throws DBException {
public class AltibaseExecutionPlan extends AbstractExecutionPlan {
import java.sql.Statement;
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
        Method method = null;
        Statement stmt = null;

    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
import org.jkiss.dbeaver.model.exec.DBCException;
            // In case of EXPLAIN_PLAN_ON, need to execute query
        }
    private String query;
            try {

 */
            /* 
import java.sql.SQLException;
        return rootNodes;
    static final Log log = Log.getLog(AltibaseExecutionPlan.class);
                    stmt.getClass().getMethod("execute").invoke(stmt);
        
        try {
        return query;
        Class<? extends Connection> clazz = null;
            if (method == null) {
            
    /**
            log.error("Failed to execute explain plan: " + e.getMessage());
            */
        
        this.dataSource = dataSource;
 * you may not use this file except in compliance with the License.
        this.planQuery = "";
     */

 *     http://www.apache.org/licenses/LICENSE-2.0
             * There are two setExplain methods in Connection class: 
    
            stmt = conn.prepareStatement(query);

import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataTypeDomain;
}
import java.sql.Connection;
import org.jkiss.dbeaver.DBException;
        this.query = query;
package org.jkiss.dbeaver.ext.altibase.model.plan;
