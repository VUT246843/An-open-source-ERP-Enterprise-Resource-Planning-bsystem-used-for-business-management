 * Unless required by applicable law or agreed to in writing, software
    @Override
            JDBCUtils.executeSQL(connection, "EXPLAIN PLAN FOR "+query);
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

            } catch (SQLException e) {
        this.query = query;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
                                parent.addNested(node);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
            JDBCUtils.executeSQL(connection, "DELETE FROM SYS.EXPLAIN_PLAN_TABLE");
                LOG.error("Error closing plan analyser", e);
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    while (dbResult.next()) {
                }
                            }
    }
 * you may not use this file except in compliance with the License.
    @Override
    public void explain(DBCSession session)  throws DBCException {
import org.jkiss.dbeaver.model.exec.DBCSession;
public class HANAPlanAnalyser extends AbstractExecutionPlan {
    public String getQueryString() {
        try {
 * limitations under the License.
        return this.dataSource;
    public HANAPlanAnalyser(HANADataSource dataSource, String query) {
 * You may obtain a copy of the License at
                        }
import java.util.Map;
            oldAutoCommit = connection.getAutoCommit();

            for (HANAPlanNode node : allNodes) {
import java.util.List;
    private List<HANAPlanNode> rootNodes;
 *

        JDBCSession connection = (JDBCSession) session;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private HANADataSource dataSource;

            try (JDBCPreparedStatement stmt = connection.prepareStatement(getPlanQueryString())) {
import java.sql.SQLException;


 *
                        allNodes.add(node);
            throw new DBCException(e, session.getExecutionContext());
        } finally {

                        for (HANAPlanNode parent : allNodes) {
/*
        boolean oldAutoCommit = false;
            }
    private static final Log LOG = Log.getLog(HANAPlanAnalyser.class);
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        this.dataSource = dataSource;
        return rootNodes;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


        List<HANAPlanNode> allNodes = new ArrayList<>();
 */

        rootNodes = new ArrayList<>();

import org.jkiss.dbeaver.ext.hana.model.HANADataSource;
                connection.setAutoCommit(false);
        }
    private String query;
                try (JDBCResultSet dbResult = stmt.executeQuery()) {
    public String getPlanQueryString() {
import java.util.ArrayList;
    public HANADataSource getDataSource() {
}

                if (oldAutoCommit)
        return "SELECT * FROM SYS.EXPLAIN_PLAN_TABLE";
                    rootNodes.add(node);
            if (oldAutoCommit)
                    }
                    connection.setAutoCommit(true);

package org.jkiss.dbeaver.ext.hana.model.plan;

                connection.rollback();
    }
 *
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
import org.jkiss.dbeaver.Log;
    }
        } catch (SQLException e) {
                        HANAPlanNode node = new HANAPlanNode(dbResult);
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                            if (node.getParentOperatorId() == parent.getOperatorId()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
                                node.setParent(parent);
            try {
    }

        return query;
            //rollback temporary EXPLAIN_PLAN_TABLE content

                if (node.getParent() == null)
            connection.rollback();
