 * Extends DBPObject to enable configurators
    DBCPlanStyle getPlanStyle();
 * Execution plan builder.
 * you may not use this file except in compliance with the License.
    DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration)
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBCQueryPlanner extends DBPObject {

}
 *
    @NotNull
 * limitations under the License.


import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.model.exec.plan;
 *
    DBPDataSource getDataSource();
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
import org.jkiss.dbeaver.model.DBPDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,


/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPObject;
 * See the License for the specific language governing permissions and
    @NotNull
        throws DBException;

 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCSession;
