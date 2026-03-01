    public HSQLQueryPlanner(@NotNull HSQLDataSource dataSource) {
    }
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 *
        this.dataSource = dataSource;
 */
 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.ext.hsqldb.model.HSQLDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        @NotNull String query,
public class HSQLQueryPlanner implements DBCQueryPlanner {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
    private final HSQLDataSource dataSource;
    ) throws DBException {
 * limitations under the License.

    public DBPDataSource getDataSource() {

        return DBCPlanStyle.QUERY;
    public DBCPlan planQueryExecution(
        plan.explain(session);
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
        return plan;
    @Override
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
    }
        final HSQLExecutionPlan plan = new HSQLExecutionPlan(query);
        return dataSource;
    }
    public DBCPlanStyle getPlanStyle() {
        @NotNull DBCSession session,
import org.jkiss.dbeaver.DBException;


import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
}

        @NotNull DBCQueryPlannerConfiguration configuration
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.hsqldb.model.plan;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataSource;
