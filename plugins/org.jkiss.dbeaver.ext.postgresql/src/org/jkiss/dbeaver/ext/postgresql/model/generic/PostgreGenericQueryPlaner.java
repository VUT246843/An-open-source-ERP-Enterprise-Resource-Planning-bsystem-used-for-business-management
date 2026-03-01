            configuration);
    private final GenericDataSource dataSource;
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
 *
 * DBeaver - Universal Database Manager
        PostgreExecutionPlan plan = new PostgreExecutionPlan(
public class PostgreGenericQueryPlaner implements DBCQueryPlanner
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.postgresql.model.plan.PostgreExecutionPlan;
    }
        return dataSource.isServerVersionAtLeast(9, 0) ? DBCPlanStyle.PLAN : DBCPlanStyle.QUERY;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return dataSource;
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
    @NotNull
        this.dataSource = dataSource;
 * Unless required by applicable law or agreed to in writing, software
 *
    public DBCPlanStyle getPlanStyle() {
        return plan;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

 * PostgreGenericQueryPlaner
    }
{
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
package org.jkiss.dbeaver.ext.postgresql.model.generic;

import org.jkiss.dbeaver.model.exec.DBCSession;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    }
                query,
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    @NotNull
/**

/*
 */
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;

    }

    public GenericDataSource getDataSource() {
    public PostgreGenericQueryPlaner(GenericDataSource dataSource) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                true,
import org.jkiss.dbeaver.model.exec.DBCException;
        plan.explain(session);
}
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBCException {
                getPlanStyle() == DBCPlanStyle.QUERY,
