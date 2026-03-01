 * Execution plan builder for saved (historical) queries
 * limitations under the License.
 *
 * You may obtain a copy of the License at
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    @NotNull

import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.model.exec.plan;
/*

 * DBeaver - Universal Database Manager
 */
 *
 */
    DBCPlan readSavedQueryExecutionPlan(@NotNull DBCSession session, @NotNull Object savedQueryId)
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
        throws DBException;

import org.jkiss.dbeaver.model.exec.DBCSession;
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

public interface DBCSavedQueryPlanner extends DBCQueryPlanner {
