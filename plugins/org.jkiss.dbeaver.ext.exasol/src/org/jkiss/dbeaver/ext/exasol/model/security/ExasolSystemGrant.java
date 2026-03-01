	@Property(hidden=true, length = PropertyLength.MULTILINE)
		return grantee+"|"+sysPrivilege+"|"+adminOption.toString();

	{
import org.jkiss.dbeaver.model.access.DBAPrivilege;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
package org.jkiss.dbeaver.ext.exasol.model.security;
		return dataSource.getContainer();
import org.jkiss.code.NotNull;
	@Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
		return dataSource;
	private String sysPrivilege;
	private Boolean isPersisted;
	@Property(hidden=true)

public class ExasolSystemGrant implements DBAPrivilege {

	public DBPDataSource getDataSource()
    @Override

import org.jkiss.dbeaver.model.DBPDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
	{
	public Boolean getAdminOption()
	public String getGrantee()
	public String getDescription()
	}
import java.sql.ResultSet;
	
	@Property(viewable = true, order = 10)

	@NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.meta.PropertyLength;
		this.dataSource = dataSource;
	@Override
	{
	private String grantee;
	}
	public String getSystemPrivilege()
	@Property(viewable = true, order = 20)
	private ExasolDataSource dataSource;
	{

import org.jkiss.dbeaver.model.meta.Property;
 * limitations under the License.
		return grantee;
		return "";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	{
 *
		this.adminOption = JDBCUtils.safeGetBoolean(resultSet, "ADMIN_OPTION");
	}
import org.jkiss.dbeaver.DBException;
	@Override
	}

		return this.adminOption;
	public ExasolSystemGrant(ExasolDataSource dataSource, ResultSet resultSet) throws DBException
		this.grantee = JDBCUtils.safeGetString(resultSet, "GRANTEE");
	
		this.sysPrivilege = JDBCUtils.safeGetString(resultSet, "PRIVILEGE");
	{
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
	public boolean isPersisted()
		return this.sysPrivilege;

 * DBeaver - Universal Database Manager
	@Override
 */
 * Unless required by applicable law or agreed to in writing, software
		this.isPersisted = true;
import org.jkiss.dbeaver.model.struct.DBSObject;
	}
	{

	{
	
	
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

	}
	public DBSObject getParentObject()
	}
		return isPersisted;
	@Property(hidden=true)
}
	private Boolean adminOption;
	}
	public String getName()
 *
	{

	}
