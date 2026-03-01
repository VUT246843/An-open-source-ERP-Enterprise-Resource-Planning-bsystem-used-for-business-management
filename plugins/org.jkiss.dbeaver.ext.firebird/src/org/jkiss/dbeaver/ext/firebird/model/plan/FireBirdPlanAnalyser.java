
/*
			JDBCPreparedStatement dbStat = session.prepareStatement(getQueryString());
	@Override
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
	public FireBirdPlanAnalyser(FireBirdDataSource dataSource, JDBCSession session, String query)
	private String query;
import java.util.List;
				dbStat.close();
        this.dataSource = dataSource;
	

			// Read explained plan
 * Build firebird plan tree based on textual plan information returned by getPlan.
import java.sql.SQLException;
	}
 * you may not use this file except in compliance with the License.
        this.session = session;
 * DBeaver - Universal Database Manager
		return null;
	@Override

				String plan = FireBirdUtils.getPlan(dbStat);
 * See the License for the specific language governing permissions and
	private FireBirdDataSource dataSource;
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
    {
	        throws DBException
}
	public String getPlanQueryString() throws DBException {
	
public class FireBirdPlanAnalyser extends AbstractExecutionPlan {
import org.jkiss.dbeaver.DBException;
	}
	@Override
		return rootNodes;
 *
	public List<? extends DBCPlanNode> getPlanNodes(Map<String, Object> options) {
    }
	public String getQueryString() {
 * You may obtain a copy of the License at
			}
	{
		} catch (SQLException e) {
			throw new DBCException(e, session.getExecutionContext());
		try {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.firebird.model.FireBirdDataSource;

import org.jkiss.dbeaver.ext.firebird.FireBirdUtils;
 * limitations under the License.
	private List<FireBirdPlanNode> rootNodes;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
	

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
package org.jkiss.dbeaver.ext.firebird.model.plan;
 *
	}
import java.util.Map;
				FireBirdPlanBuilder builder = new FireBirdPlanBuilder(plan);
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
		}
			} finally {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * @author tomashorak@post.cz
				rootNodes = builder.Build(session);

import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
			try {
	public void explain()
	private JDBCSession session;
import org.jkiss.dbeaver.model.exec.DBCException;

 */
        this.query = query;
	}
		return query;
