public class ExasolPriority implements DBPRefreshableObject, DBPNamedObject2, DBPSaveableObject {
	public void setName(@NotNull String groupName) {

 * Unless required by applicable law or agreed to in writing, software
	}
import org.jkiss.code.NotNull;
		return this;

	private Date created;
    @NotNull
	@Override
		return groupId;
		return this.persisted;
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
	private Boolean persisted;
	{
package org.jkiss.dbeaver.ext.exasol.model;
	public ExasolDataSource getDataSource()
import org.jkiss.dbeaver.model.meta.Property;
	}
    	return created;
	public BigDecimal getGroupId()

import org.jkiss.dbeaver.model.DBPSaveableObject;
import org.jkiss.dbeaver.model.DBPNamedObject2;
	@Override
    }
	@Override
}
	    this.persisted = false;
	@Override
    @Property(viewable = true, editable= true, updatable=true, order = 10)
 * See the License for the specific language governing permissions and
	public String getDescription() {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.struct.DBSObject;
	{
	    this.dataSource = dataSource;
 *
    public Date getCreated()
    
	
	}
import org.jkiss.dbeaver.model.DBPRefreshableObject;

	}

	public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
	
 *

	}

	private ExasolDataSource dataSource;
		this.comment = description;

	
 *     http://www.apache.org/licenses/LICENSE-2.0
	{
    @Property(viewable = true, editable= true, updatable=true, order = 30)
	private BigDecimal groupId = new BigDecimal(-1);
	
	@Override
 * Licensed under the Apache License, Version 2.0 (the "License");
		this.persisted = persisted;
	{
		return this.dataSource.getContainer();
/*
	{
	}

	@Override

import java.math.BigDecimal;
	@Property(viewable = true, editable= false, updatable=false, order = 40)
	@Override
	}
		this.groupName = groupName;
	}
	private String comment="";
	public ExasolPriority(ExasolDataSource dataSource, String name, String comment ) {
	public void setPersisted(boolean persisted)

import java.sql.Date;
 * You may obtain a copy of the License at
 * limitations under the License.
	}
        ((ExasolDataSource) getDataSource()).refreshObject(monitor);
	public DBSObject getParentObject()
			throws DBException
	private String groupName;
	{
	public void setDescription(String description)
import org.jkiss.dbeaver.DBException;
		return this.dataSource;
		this.comment = comment;
	}
	}
	public boolean isPersisted()
    @Property(viewable = true, editable= false, updatable=false, order = 40)
	public String getName() {
	{

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
		return groupName;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	

 * distributed under the License is distributed on an "AS IS" BASIS,
		this.groupName = name;
 *

		return comment;
 * you may not use this file except in compliance with the License.
