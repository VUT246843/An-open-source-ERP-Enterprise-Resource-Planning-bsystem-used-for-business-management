
}package org.jkiss.dbeaver.model.exec.plan;
 * DBeaver - Universal Database Manager

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software

    String getNodeDescription();

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    String getNodeName();
public interface DBCPlanNode extends DBPObject {
 * limitations under the License.

import org.jkiss.dbeaver.model.DBPObject;
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *
/**
import java.util.Collection;
    String getNodeType();

 * Execution plan node

    String getNodeCondition();
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 *
    DBCPlanNode getParent();
    Collection<? extends DBCPlanNode> getNested();

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others


    DBCPlanNodeKind getNodeKind();

 * Licensed under the Apache License, Version 2.0 (the "License");
