	
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

		return grantee + "|" + role;
	@Property(viewable = true, order = 20)
	{
	public Boolean getAdminOption()
	{
	public boolean isPersisted()
package org.jkiss.dbeaver.ext.exasol.model.security;

	{
import org.jkiss.code.NotNull;
		this.role = JDBCUtils.safeGetString(resultSet, "ROLE_NAME");
		return grantee;
		this.adminOption = JDBCUtils.safeGetBoolean(resultSet, "ADMIN_OPTION");
	{
	{
	{
import org.jkiss.dbeaver.model.access.DBAPrivilege;
	public String getGrantee()
	@NotNull
		return dataSource.getRole(monitor, role);
	public ExasolRole getRole(DBRProgressMonitor monitor) throws DBException
	@Override
	@Override
    @Override
	public DBPDataSource getDataSource()
		this.grantee = JDBCUtils.safeGetString(resultSet, "GRANTEE");
	private String grantee;

	}

	private Boolean adminOption;
import org.jkiss.dbeaver.model.struct.DBSObject;
	@Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	}
	}	
	
	
	{
	
 * distributed under the License is distributed on an "AS IS" BASIS,
	public DBSObject getParentObject()
	{
	@Override
import org.jkiss.dbeaver.model.DBPDataSource;
 *
 * you may not use this file except in compliance with the License.
		return this.adminOption;
		// TODO Auto-generated method stub
	}
 * limitations under the License.
 * See the License for the specific language governing permissions and
		return null;
/*

	
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
		return dataSource.getContainer();
		return false;
	}
	}
	}
 * DBeaver - Universal Database Manager


	private ExasolDataSource dataSource;


 *     http://www.apache.org/licenses/LICENSE-2.0
	public ExasolRoleGrant(ExasolDataSource dataSource, ResultSet resultSet)
		return this.dataSource;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
		this.dataSource = dataSource;
	public String getDescription()
import java.sql.ResultSet;
}
	}
	}
	@Property(viewable = true, order = 10)
 */
 *
	private String role;
	public String getName()
 * Licensed under the Apache License, Version 2.0 (the "License");
	{
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class ExasolRoleGrant implements DBAPrivilege  {
