}
/*
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
    @Override
                    TiDBPlanNodePlain node = new TiDBPlanNodePlain(null, dbResult);

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.tidb.model.plan;
 */
        }
        return rootNodes;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
 *
 *
            return true;
 * limitations under the License.
                while (dbResult.next()) {
 * Copyright (C) 2010-2022 DBeaver Corp and others
    }
            throw new DBCException(e, session.getExecutionContext());
    }
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

        return query;
    private List<TiDBPlanNodePlain> rootNodes;
 * DBeaver - Universal Database Manager
                rootNodes = nodes;

        }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
import java.sql.SQLException;
        this.rootNodes = rootNodes;
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public TiDBPlainClassic(JDBCSession session, String query) throws DBCException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (DBCPlanCostNode.FEATURE_PLAN_ROWS.equals(feature)) {
        } catch (SQLException e) {
                    nodes.add(node);
 * you may not use this file except in compliance with the License.


        return "EXPLAIN FORMAT = \"brief\" " + query;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
import java.util.Map;
        return super.getPlanFeature(feature);
    @Override
        super(dataSource, query);

import org.jkiss.dbeaver.ext.mysql.model.plan.MySQLPlanAbstract;
import java.util.ArrayList;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }

    public String getQueryString() {
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
    }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(getPlanQueryString())) {

    public Object getPlanFeature(String feature) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }

                List<TiDBPlanNodePlain> nodes = new ArrayList<>();

    public String getPlanQueryString() {
    public TiDBPlainClassic(MySQLDataSource dataSource, String query, List<TiDBPlanNodePlain> rootNodes) {
            }
        super((MySQLDataSource) session.getDataSource(), query);

import java.util.List;
public class TiDBPlainClassic extends MySQLPlanAbstract {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
