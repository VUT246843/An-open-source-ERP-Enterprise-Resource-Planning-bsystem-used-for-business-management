    public void explain(@NotNull DBCSession session) throws DBCException {
    public String getPlanQueryString() {
public class HSQLExecutionPlan extends AbstractExecutionPlan {
 *
        return List.of();
 * You may obtain a copy of the License at
import java.util.Map;
    /**
        }

import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
    @Override
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import java.sql.SQLException;

    }

        } catch (SQLException e) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCSession;
 * you may not use this file except in compliance with the License.
        this.query = query;
    }
 */
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
        try (JDBCStatement stmt = connection.createStatement()) {
    }
    public HSQLExecutionPlan(@NotNull String query) {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        return query;
     */
    public String getQueryString() {
import org.jkiss.dbeaver.model.exec.DBCException;
/*

    private final String query;
     * Retrieves execution plan for the given query.

            throw new DBCException(e, session.getExecutionContext());

 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
 *
    public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
        final JDBCSession connection = (JDBCSession) session;
 *
            stmt.execute(getPlanQueryString());
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,
}
    @Override
package org.jkiss.dbeaver.ext.hsqldb.model.plan;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return "EXPLAIN PLAN FOR " + query;
