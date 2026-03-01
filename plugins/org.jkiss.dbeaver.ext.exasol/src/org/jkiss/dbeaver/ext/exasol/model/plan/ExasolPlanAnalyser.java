
        this.query = query;
            //execute query
    ExasolPlanAnalyser(ExasolDataSource dataSource, String query) {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
            connection.rollback();
        boolean oldAutoCommit = false;
 */
            //alter session
import java.sql.SQLException;
    }
	            }


import java.util.List;
        throws DBCException {
            }



    @Override

        return query;
                LOG.error("Error closing plan analyser", e);
            } catch (SQLException e) {

    public String getPlanQueryString() {
/*
            }
            //alter session

        return "/*snapshot execution*/ SELECT * FROM EXA_USER_PROFILE_LAST_DAY WHERE SESSION_ID = CURRENT_SESSION AND STMT_ID = (select max(stmt_id) from EXA_USER_PROFILE_LAST_DAY where sql_text = ?)";

            JDBCUtils.executeSQL(connection, "ALTER SESSION SET PROFILE = 'ON'");
        this.rootNodes = rootNodes;
    }
public class ExasolPlanAnalyser extends AbstractExecutionPlan {
            //rollback in case of DML
import org.jkiss.dbeaver.Log;
        }
            try (JDBCPreparedStatement stmt = connection.prepareStatement(getPlanQueryString())) {
                connection.setAutoCommit(false);
        } finally {
            throw new DBCException(e, session.getExecutionContext());

 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
        rootNodes = new ArrayList<>();
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {

	            stmt.setString(1, query);
            if (oldAutoCommit)
/**
            JDBCUtils.executeSQL(connection, query);

            //retrieve execute info
    private static final Log LOG = Log.getLog(ExasolPlanAnalyser.class);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    private ExasolDataSource dataSource;
    private String query;

    public void explain(DBCSession session)

		            while (dbResult.next()) {
    @Override
            JDBCUtils.executeSQL(connection, "ALTER SESSION SET PROFILE = 'OFF'");
    public ExasolDataSource getDataSource() {
		            }
import java.util.ArrayList;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
        return rootNodes;
            //alter session
    }
 * limitations under the License.

 * You may obtain a copy of the License at
 */
 *
    }
            //rollback changes because profile actually executes query and it could be INSERT/UPDATE
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    ExasolPlanAnalyser(ExasolDataSource dataSource, String query, List<ExasolPlanNode> rootNodes) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        this.dataSource = dataSource;

 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
        this.dataSource = dataSource;
            try {
                connection.rollback();


 *
	            try (JDBCResultSet dbResult = stmt.executeQuery()) {
		                rootNodes.add(node);
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
		                ExasolPlanNode node = new ExasolPlanNode(null, dbResult);

        } catch (SQLException e) {
    public String getQueryString() {
            connection.commit();
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
 * Unless required by applicable law or agreed to in writing, software
        this.query = query;
 * @author Karl
    private List<ExasolPlanNode> rootNodes;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
}
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
        JDBCSession connection = (JDBCSession) session;
            JDBCUtils.executeSQL(connection, "FLUSH STATISTICS");
import org.jkiss.dbeaver.model.exec.DBCException;
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.exasol.model.plan;
                if (oldAutoCommit)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.exec.DBCSession;
                    connection.setAutoCommit(true);
            oldAutoCommit = connection.getAutoCommit();
import java.util.Map;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return this.dataSource;
