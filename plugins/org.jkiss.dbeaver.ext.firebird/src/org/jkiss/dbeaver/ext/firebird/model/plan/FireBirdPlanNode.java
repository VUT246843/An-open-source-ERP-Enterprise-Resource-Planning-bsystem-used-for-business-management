 * Licensed under the Apache License, Version 2.0 (the "License");
	public FireBirdPlanNode(String plan) {
	FireBirdPlanNode parent;
		return plan;

	public String getNodeName() {
		return parent;
 * you may not use this file except in compliance with the License.
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
	@Override
		this.nested = new ArrayList<>();
package org.jkiss.dbeaver.ext.firebird.model.plan;

	public DBCPlanNode getParent() {
public class FireBirdPlanNode extends AbstractExecutionPlanNode {
	}
	private List<FireBirdPlanNode> nested;
	}
	@Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return plan;
    @Property(order = 1, viewable = true)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author tomashorak@post.cz
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;
	
	@Override
 * See the License for the specific language governing permissions and

	}

		return "Plan";
	}
	public String getNodeType() {
	}
 *
		this.plan = plan;
 */
 * DBeaver - Universal Database Manager
 * Firebird plan node implementation.
		return plan;
	public String getNodeDescription() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

import java.util.ArrayList;
    public String toString()
    {
 * limitations under the License.
    }
 *
	
	private String plan;
	@Override
	@Override
import org.jkiss.dbeaver.model.meta.Property;

/*
		return nested;

 *
import java.util.List;
 */
	}
 * You may obtain a copy of the License at
import java.util.Collection;

 * Unless required by applicable law or agreed to in writing, software
/**
	public Collection<FireBirdPlanNode> getNested() {
	@Override
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;

