	{
		this.alterAuth = grant.getAlterAuth();
	@NotNull
    @Override
	@Override
		{
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
		return alterAuth;
 * limitations under the License.
		this.executeAuth = grant.getExecuteAuth();
	public String getName()
 * Unless required by applicable law or agreed to in writing, software

		String grants = JDBCUtils.safeGetString(resultSet, "PRIVS");
	}
				break;
		this.exasolGrantee = JDBCUtils.safeGetString(resultSet, "GRANTEE") ;
	private ExasolDataSource dataSource;
 */
	private Boolean isPersted;
		if (type == ExasolTableObjectType.SCHEMA) 
	{
		
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
				break;
		return exasolGrantee+"|"+type+"|"+schema+"|"+name;

	}
		return deleteAuth;

		return this.dataSource;
	{
 * See the License for the specific language governing permissions and
import java.sql.ResultSet;
 *
    @Property(viewable = true, order = 90)
 * Copyright (C) 2010-2025 DBeaver Corp and others

package org.jkiss.dbeaver.ext.exasol.model.security;
import org.jkiss.dbeaver.DBException;
			}
	}
			case "REFERENCES":
	public boolean isPersisted()
	@Override
    	return executeAuth;
 * Licensed under the Apache License, Version 2.0 (the "License");
	}
	{
import org.jkiss.dbeaver.model.meta.PropertyLength;
	{
	}
	{
		// No Description available
	
	{
    @Property(viewable = true, order = 50)
    @Property(hidden = true, length = PropertyLength.MULTILINE)
}
				insertAuth=true;
    @Property(viewable = true, order = 80)

		return this.schema;
			switch (grant) {
	@Override
	@Override
			case "INSERT":
	private Boolean alterAuth=false;
		this.name = grant.getObjectName();
		this.updateAuth = grant.getUpdateAuth();
		return this.name;
    @Property(viewable = true, order = 70)
	{
	{
		this.schema = grant.getSchema();
	public String getObjectName()
	{
	public Boolean getSelectAuth()
	
	private Boolean selectAuth=false;
	private Boolean updateAuth=false;

				referencesAuth=true;
    @Property(viewable = true, order = 40)
				break;
				executeAuth=true;
	}
	public ExasolBaseObjectGrant(ExasolBaseObjectGrant grant)

	private Boolean referencesAuth=false;

			case "SELECT":
			this.schema = dataSource.getChild(new VoidProgressMonitor(), JDBCUtils.safeGetString(resultSet, "OBJECT_NAME"));
			case "UPDATE":
import org.jkiss.dbeaver.model.access.DBAPrivilege;
		for(String grant: CommonUtils.splitString(grants, '|'))

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	}
	}
	private String exasolGrantee;
		}
			case "EXECUTE":
		return updateAuth;
import org.jkiss.dbeaver.model.meta.Property;
		this.dataSource =  grant.getDataSource();
	{
	}
			case "DELETE":
				break;
		{
				deleteAuth=true;
	
	}
				alterAuth=true;
 * you may not use this file except in compliance with the License.
		
				updateAuth=true;
import org.jkiss.code.NotNull;
	public Boolean getInsertAuth()
 *     http://www.apache.org/licenses/LICENSE-2.0

	public ExasolDataSource getDataSource()
	{
	public Boolean getAlterAuth()

	{

import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
	private ExasolTableObjectType type;
				selectAuth=true;
	
	{
	public ExasolTableObjectType getType()
	public String getDescription()
		return this.dataSource;
 *
		this.referencesAuth = grant.getReferencesAuth();
	{
		this.dataSource = dataSource;
    
	public Boolean getDeleteAuth()
 * You may obtain a copy of the License at
/*
				break;
    }
		this.isPersted = true;
		return this.exasolGrantee;
import org.jkiss.utils.CommonUtils;
		this.insertAuth = grant.getInsertAuth();
		this.isPersted = true;
	private Boolean executeAuth=false;
    {
		this.deleteAuth = grant.getDeleteAuth();
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
    public Boolean getExecuteAuth()
			case "ALTER":
		this.type = grant.getType();
			default:

	public String getGrantee()
			this.schema = dataSource.getChild(new VoidProgressMonitor(), JDBCUtils.safeGetString(resultSet, "OBJECT_SCHEMA"));
		this.type = ExasolUtils.getTableObjectType(JDBCUtils.safeGetString(resultSet, "OBJECT_TYPE"));
 * DBeaver - Universal Database Manager
				break;
		this.exasolGrantee = grant.getGrantee();
	}
		} else {
	}
	
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		return this.isPersted;

	public ExasolDataSource getParentObject()
	}

	public Boolean getUpdateAuth()
	}
	private String name;

	
		this.name = JDBCUtils.safeGetString(resultSet, "OBJECT_NAME");
    @Property(viewable = true, order = 60)
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
		return referencesAuth;
		}
	{
	{

		
	private ExasolSchema schema;
	public  ExasolBaseObjectGrant(ExasolDataSource dataSource, ResultSet resultSet) throws DBException
    @Property(viewable = true, order = 10)
		this.selectAuth = grant.getSelectAuth();
	public Boolean getReferencesAuth()
	
	public ExasolSchema getSchema()
	private Boolean deleteAuth=false;
	}

	
				break;

    @Property(hidden = true)
	}
	
		return "";
		return this.type;
	private Boolean insertAuth=false;
	}
	
		return insertAuth;
	
		return selectAuth;
public class ExasolBaseObjectGrant implements DBAPrivilege  {
