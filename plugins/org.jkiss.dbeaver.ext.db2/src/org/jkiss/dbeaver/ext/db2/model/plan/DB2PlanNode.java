 * 
 * @author Denis Forveille
 *

 * You may obtain a copy of the License at
    }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
/**
    @Override
    public String getDetails()
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;


    {
package org.jkiss.dbeaver.ext.db2.model.plan;
 */
    }
    }
import java.util.ArrayList;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    public abstract Double getEstimatedCardinality();
import java.util.Collection;
    protected DB2PlanNode(DB2PlanNode node) {
        return listNestedNodes;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 *

        this.listNestedNodes.addAll(node.listNestedNodes);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // DB2PlanNode Contract
    }
    public abstract String getNodeName();
        return "";
    public void setParent(DB2PlanNode parent)

 */
 * limitations under the License.

    }

        return parent;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DB2PlanNode getParent()
    {
    public Collection<DB2PlanNode> getNested()
 * Unless required by applicable law or agreed to in writing, software
    protected DB2PlanNode() {
    private DB2PlanNode parent;
public abstract class DB2PlanNode extends AbstractExecutionPlanNode {
    // --------------------
        this.parent = node.parent;
    @Override
    @Override



    {
        // Not supported by every kind of DB2PlanNode
    {
 * DB2 Plan Node
    // ---------------------
    // Methods from Interface
/*
    private Collection<DB2PlanNode> listNestedNodes = new ArrayList<>(64);
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    // ----------------------
    }
        this.parent = parent;

    // --------------------

    public void setEstimatedCardinality(Double estimatedCardinality)
}

 * you may not use this file except in compliance with the License.
