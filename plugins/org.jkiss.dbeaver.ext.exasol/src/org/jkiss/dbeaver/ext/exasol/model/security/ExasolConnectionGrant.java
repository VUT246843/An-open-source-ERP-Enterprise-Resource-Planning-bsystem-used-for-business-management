
/*
		implements DBAPrivilege {
	private String grantee;
		this.adminOption = JDBCUtils.safeGetBoolean(dbResult, "ADMIN_OPTION");
	{
	}
	@Override
	{
		return isPersisted;
	{
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
		return dataSource.getContainer();
	public ExasolConnection getConnection() throws DBException
	public Boolean getAdminOption()
	}
	{
import org.jkiss.dbeaver.model.meta.Property;
 * See the License for the specific language governing permissions and
	public String getName()
 * you may not use this file except in compliance with the License.
		return grantee+"|"+connection+"|"+adminOption.toString();


	{
	private Boolean isPersisted;
		return dataSource.getConnection(new VoidProgressMonitor(), connection);
import org.jkiss.code.NotNull;
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
	{
 *
		return this.dataSource;
	@Override

	@NotNull
	}
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.access.DBAPrivilege;
	}
	@Property(viewable = true, order = 90)

	}
	private String connection;


 * Licensed under the Apache License, Version 2.0 (the "License");
	@Property(hidden = true, length = PropertyLength.MULTILINE)
import org.jkiss.dbeaver.DBException;
		this.grantee = JDBCUtils.safeGetString(dbResult, "GRANTEE");
public class ExasolConnectionGrant 
	public Object getGrantee() {
	public DBPDataSource getDataSource()

 * distributed under the License is distributed on an "AS IS" BASIS,
	public DBSObject getParentObject()
	@Property(viewable = true, order = 10)

		return null;
 * limitations under the License.
 * DBeaver - Universal Database Manager
 */
    @Override
	{
	@Override
	private ExasolDataSource dataSource;
import org.jkiss.dbeaver.model.meta.PropertyLength;
	}
package org.jkiss.dbeaver.ext.exasol.model.security;
	private Boolean adminOption;
			ResultSet dbResult) 
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	@Override
	
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
 * You may obtain a copy of the License at
	public boolean isPersisted()
		return grantee;
import org.jkiss.dbeaver.ext.exasol.model.ExasolConnection;
		this.isPersisted = true;

		return this.adminOption;
 *     http://www.apache.org/licenses/LICENSE-2.0
		this.dataSource = dataSource;
	}

	
 *
	public String getDescription()
}
		this.connection = JDBCUtils.safeGetString(dbResult, "CONNECTION_NAME");
	public ExasolConnectionGrant(ExasolDataSource dataSource,
	}
import java.sql.ResultSet;
	}
