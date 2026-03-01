    List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options);
import org.jkiss.dbeaver.DBException;
     * Keep original plan nodes structure (produced by server).
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

    String getPlanQueryString() throws DBException;
 *
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
/*
 * limitations under the License.
/**
    String getQueryString();


     * Restricts any client-side plan structure modifications.
 *
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

package org.jkiss.dbeaver.model.exec.plan;
 * Copyright (C) 2010-2024 DBeaver Corp and others

public interface DBCPlan {
 * DBeaver - Universal Database Manager
    /**
    String OPTION_KEEP_ORIGINAL = "keepOriginal";
import java.util.Map;
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    Object getPlanFeature(String feature);

import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");


 * Execution plan
 * you may not use this file except in compliance with the License.

 */
     */

