		this.plan = plan;
package org.jkiss.dbeaver.ext.firebird.model.plan;
 *
		super();

/**
}
	public FireBirdPlanBuilder(String plan) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
			}
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
		String [] plans = plan.split("\\n");
	private String plan;

 * See the License for the specific language governing permissions and
/*
 * @author tomashorak@post.cz
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCException;
			FireBirdPlanParser pm = new FireBirdPlanParser(plan, session);
			FireBirdPlanNode node = null;
 * DBeaver - Universal Database Manager
 */
		}
 * Build tree of plan nodes.
 * You may obtain a copy of the License at
	}
 *
	
		return rootNodes;
				throw new DBCException(e.getMessage());
	public List<FireBirdPlanNode> Build(JDBCSession session) throws DBCException {
				node = pm.parse();
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;
 */
	
public class FireBirdPlanBuilder {
import java.util.ArrayList;
			} catch (FireBirdPlanException e) {

		List<FireBirdPlanNode> rootNodes = new ArrayList<>();
	}
		for (String plan: plans) {
 * Licensed under the Apache License, Version 2.0 (the "License");
			try {
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	
 *
			rootNodes.add(node);
 *     http://www.apache.org/licenses/LICENSE-2.0
