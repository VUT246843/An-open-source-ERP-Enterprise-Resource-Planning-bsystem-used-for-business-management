	public String getLockType()
	private String scopeSchema;

	@Property(viewable = true, order = 100)
		return resources;
		return osUser;
	}
 * Licensed under the Apache License, Version 2.0 (the "License");

	private Integer resources;
		return evaluation;
 */
	{
 *
	@Property(viewable = true, order = 80)

 * distributed under the License is distributed on an "AS IS" BASIS,
		return driver;


	
	public String getPriority()
	public Timestamp ltime()
	}
		this.driver = JDBCUtils.safeGetString(dbResult, "DRIVER");


		this.evaluation = JDBCUtils.safeGetString(dbResult, "EVALUATION");
	}
	public String getActivity()
	}
	private String sqlText;
 * You may obtain a copy of the License at

	public String getUserName()
	}

	public String getScopeSchema()
import java.sql.Timestamp;
	public String getDriver()
		this.osUser = JDBCUtils.safeGetString(dbResult, "OS_USER");
import java.sql.ResultSet;
		return loginTime;

	public String getEvaluation()


	}
	}
 * Unless required by applicable law or agreed to in writing, software
		return priority;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	private String status;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	{
		return client;

	@Property(viewable = true, order = 60)
	@Property(viewable = true, order = 50)
	@Property(viewable = true, order = 20)
	private String activity;
		return status;
	{
	{
	private String userName;
	}
		this.sqlText = JDBCUtils.safeGetString(dbResult, "SQL_TEXT");
		this.activity = JDBCUtils.safeGetString(dbResult, "ACTIVITY");
	public String getCommandName()

		this.client = JDBCUtils.safeGetString(dbResult, "CLIENT");

	{

package org.jkiss.dbeaver.ext.exasol.model.lock;
	}


	@Property(viewable = true, order = 90)
	{
/*
public class ExasolLockItem implements DBAServerLockItem {
	

import org.jkiss.dbeaver.model.meta.Property;
		this.loginTime = JDBCUtils.safeGetTimestamp(dbResult, "LOGIN_TIME");

	private String evaluation;
 * limitations under the License.

	{
	{
		this.lockType = JDBCUtils.safeGetString(dbResult, "HAS_LOCKS");
		return scopeSchema;
		this.resources = JDBCUtils.safeGetInteger(dbResult, "RESOURCES");
		this.priority = JDBCUtils.safeGetString(dbResult, "PRIORITY");
}

		return osName;

		return activity;
	public String getHost()
		this.host = JDBCUtils.safeGetString(dbResult, "HOST");
	private String client;
	{
	{
	public String getSqlText()
	@Property(viewable = true, order = 120)


	public Timestamp getLoginTime()
	}
 * Copyright (C) 2010-2024 DBeaver Corp and others

		return commandName;
	@Property(viewable = true, order = 40)
	{
	@Property(viewable = true, order = 30)
	@Property(viewable = true, order = 150)
	}
	@Property(viewable = true, order = 110)
		return sqlText;
	@Property(viewable = true, order = 140)

 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
	private String commandName;
	public String getClient()
	private Timestamp loginTime;
		this.userName = JDBCUtils.safeGetString(dbResult, "USER_NAME");
	private String osName;
	{
	@Property(viewable = true, order = 70)
	private String lockType;
 * you may not use this file except in compliance with the License.
	public String getOsUser()



		this.scopeSchema = JDBCUtils.safeGetString(dbResult, "SCOPE_SCHEMA");
	public String getOsName()
	{
	}
	}
	{
	}
	private String osUser;
	}



		return lockType;
	private String host;
	public String getStatus()
	
		return this.loginTime;
		this.status = JDBCUtils.safeGetString(dbResult, "STATUS");


	}
 *
	

		return host;
	public Integer getResources()

	
	}
 *
	@Property(viewable = true, order = 10)
	{
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
	@Property(viewable = true, order = 130)
	ExasolLockItem(ResultSet dbResult) {
 * See the License for the specific language governing permissions and
	{
	private String driver;
		return userName;
 *     http://www.apache.org/licenses/LICENSE-2.0
	private String priority;
 * DBeaver - Universal Database Manager
	}
	{
