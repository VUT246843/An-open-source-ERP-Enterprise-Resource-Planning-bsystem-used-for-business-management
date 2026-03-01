 *


    @NotNull
import org.jkiss.code.NotNull;

    public DBPDataSource getDataSource() {
    @NotNull
    private CubridDataSource dataSource;
        this.dataSource = dataSource;
    public DBCPlan planQueryExecution(
package org.jkiss.dbeaver.ext.cubrid.model.plan;
import java.util.List;
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *
        }
public class CubridQueryPlanner implements DBCQueryPlanner
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        List<String> supportStatement = List.of("SELECT", "WITH", "PREPARE", "VALUES");

    public DBCPlanStyle getPlanStyle() {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
    @NotNull
    }
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
        return new CubridPlanAnalyser(session, query);
            @NotNull String query,
    public CubridPlanAnalyser explain(@NotNull JDBCSession session, @NotNull String query)
        return dataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.sql.SQLDialect;
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
    @Override
            @NotNull DBCSession session,
    @Override

 *
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;

        final String firstKeyword = SQLUtils.getFirstKeyword(dialect, plainQuery);
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
{


import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.exec.DBCException;
            throws DBCException {
            throws DBCException {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
}    public CubridQueryPlanner(@NotNull CubridDataSource dataSource) {
        return DBCPlanStyle.PLAN;
        final SQLDialect dialect = SQLUtils.getDialectFromObject(dataSource);
            throw new DBCException("Only SELECT, WITH, and PREPARE statements could produce execution plan");
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        if (!supportStatement.contains(firstKeyword.toUpperCase())) {
 * limitations under the License.
        return explain((JDBCSession) session, query);
import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
 * You may obtain a copy of the License at
        final String plainQuery = SQLUtils.stripComments(dialect, query).toUpperCase();
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

            @NotNull DBCQueryPlannerConfiguration configuration)
