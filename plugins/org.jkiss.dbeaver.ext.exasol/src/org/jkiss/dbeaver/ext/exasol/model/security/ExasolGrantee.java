		
		{
	}
	private static final Log log = Log.getLog(ExasolGrantee.class);
 *
	public Collection<ExasolScriptGrant> getProcedures(DBRProgressMonitor monitor) throws DBException
				return grantee;
		} else {
	public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
	}

		this.priority = priority;
		Collection<ExasolSystemGrant> sysGrants = new ArrayList<>();
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
		}
	public Collection<ExasolTableGrant> getTables(DBRProgressMonitor monitor) throws DBException

	{
 * Unless required by applicable law or agreed to in writing, software
	@Override
			if (grant.getGrantee().equals(this.getName()))
		}
	private ExasolDataSource dataSource;
			}
			
				grants.add(grant);
	
 * limitations under the License.
	}
			if (grant.getGrantee().equals(this.getName()))
		return conGrants;

		for(ExasolConnectionGrant grant: this.dataSource.getConnectionGrants(monitor))

import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriorityGroup;
		throw new DBException("Object disappeared after refresh");
 *     http://www.apache.org/licenses/LICENSE-2.0
	@Override
import org.jkiss.dbeaver.Log;
			}
		implements DBPSaveableObject, DBPRefreshableObject {
		for (ExasolGrantee grantee : dataSource.getAllGrantees(monitor))
    public void setPriority(ExasolPriority priority) {
		{
	public void setPersisted(boolean persisted)
		{
		return this.dataSource.getContainer();
		this.dataSource = dataSource;
			{
	
	}
			throws DBException
	public Collection<ExasolSystemGrant> getSystemgrants(DBRProgressMonitor monitor) throws DBException
				
					) 
				sysGrants.add(grant);
	@NotNull
	}
			if (grant.getGrantee().equals(this.getName()))
import org.jkiss.code.NotNull;
		for(ExasolViewGrant grant: this.dataSource.getViewGrants(monitor))
		for(ExasolSystemGrant grant: dataSource.getSystemGrants(monitor))
		}
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.model.DBPSaveableObject;
	
				return new Object[0];
	{

 *
			}
	{
		{
		{
}
	{
			} catch (DBException e) {
			}
		for(ExasolSchemaGrant grant: this.dataSource.getSchemaGrants(monitor))
					return priorityGroups.toArray(new Object[0]);
	
	public boolean isPersisted()
    {
		}

				grants.add(grant);
 * Copyright (C) 2010-2025 DBeaver Corp and others
			this.persisted = false;

	{
		}
				log.error(e);
		
 */
			if (this.getClass().getSimpleName().equals(grantee.getClass().getSimpleName())
	public Collection<ExasolSchemaGrant> getSchemas(DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriority;
 * You may obtain a copy of the License at
		dataSource.refreshObject(monitor);
	private boolean persisted;
		return this.persisted;
	}
			} catch (DBException e) {
			return false;
		{
		public boolean allowCustomValue() {
	public DBSObject getParentObject()
		Collection<ExasolViewGrant> grants = new ArrayList<>();
				} else {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
	}
	public Collection<ExasolViewGrant> getViews(DBRProgressMonitor monitor) throws DBException
	private ExasolPriority priority;
		for(ExasolTableGrant grant: this.dataSource.getTableGrants(monitor))
	@Override
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
			ExasolDataSource dataSource = object.getDataSource();
    public ExasolPriority getPriority()
			}
		if (resultSet != null) {
		}
	{
	//
	
		
    
		}

	
		
		{
		}
		return grants;
	{
    }
	{
	{
        		this.priority = dataSource.getPriorityGroup(new VoidProgressMonitor(), JDBCUtils.safeGetString(resultSet, "USER_PRIORITY"));
	}

			if (grant.getGrantee().equals(this.getName()))
		
package org.jkiss.dbeaver.ext.exasol.model.security;
	public Collection<ExasolRoleGrant> getRoles(DBRProgressMonitor monitor)
 * you may not use this file except in compliance with the License.
	
			this.persisted = true;
public abstract class ExasolGrantee
		
    	


	}
		Collection<ExasolSchemaGrant> grants = new ArrayList<>();
	{
 * DBeaver - Universal Database Manager
		return sysGrants;
		public Object[] getPossibleValues(ExasolGrantee object) {
			if (grant.getGrantee().equals(this.getName()))
			if (grant.getGrantee().equals(this.getName()))
	}
	public ExasolGrantee(ExasolDataSource dataSource, Boolean persisted)
	
				}
				if (dataSource.getUserPriviliges().hasConsumerGroups())

import org.jkiss.code.Nullable;
					return consumerGroups.toArray(new Object[0]);
		return roleGrants;
	public ExasolDataSource getDataSource()
		return grants;

 *
	{
	{
    public abstract String getName();
		
import java.util.Collection;
		
		for (ExasolRoleGrant grant: this.dataSource.getRoleGrants(monitor))
	}
			{
		return this.dataSource;
		
		{
	}

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true,   editable = true, updatable = true, order = 20, listProvider = PriorityListProvider.class)
	@Override
		
			{
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
	
		@Override

		}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	@Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

		}
					&& this.getName().equals(grantee.getName())
		}
import org.jkiss.dbeaver.ext.exasol.model.ExasolConsumerGroup;
	{
		Collection<ExasolConnectionGrant> conGrants = new ArrayList<>(); 
	        try {
	public Collection<ExasolConnectionGrant> getConnections(DBRProgressMonitor monitor) throws DBException
		return grants;
			{
		this.persisted = persisted;
    
			if (grant.getGrantee().equals(this.getName()))
	// Retrieve Grants
import org.jkiss.dbeaver.DBException;
		this.dataSource = dataSource;
import java.sql.ResultSet;

 * Licensed under the Apache License, Version 2.0 (the "License");
    public static class PriorityListProvider implements IPropertyValueListProvider<ExasolGrantee> {
	}
		return grants;
		@Override
	}
				roleGrants.add(grant);
			try {
		this.persisted = persisted;
import org.jkiss.dbeaver.model.meta.Property;
	//
			throws DBException
				{
				conGrants.add(grant);
    	return priority;
		@Nullable
	{
			}
    }
	}
		for(ExasolScriptGrant grant: this.dataSource.getScriptGrants(monitor))

			{
/*
	

				grants.add(grant);
		Collection<ExasolTableGrant> grants = new ArrayList<>();
					Collection<ExasolPriorityGroup> priorityGroups = dataSource.getPriorityGroups(new VoidProgressMonitor());
	public ExasolGrantee(ExasolDataSource dataSource, ResultSet resultSet)
import java.util.ArrayList;
					Collection<ExasolConsumerGroup> consumerGroups = dataSource.getConsumerGroups(new VoidProgressMonitor());
				this.priority = null;
				grants.add(grant);
		

		Collection<ExasolRoleGrant> roleGrants = new ArrayList<>();
 * See the License for the specific language governing permissions and
			}
		
		Collection<ExasolScriptGrant> grants = new ArrayList<>();
