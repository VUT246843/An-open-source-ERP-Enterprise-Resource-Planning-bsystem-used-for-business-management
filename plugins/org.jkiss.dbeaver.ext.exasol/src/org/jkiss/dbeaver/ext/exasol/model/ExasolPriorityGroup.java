    @NotNull
	public String getDescription() {
    @Property(viewable = true, editable= true, updatable=true, order = 30)
		super(dataSource, "", "");
 *
	@Override
	public int getWeight() {
	
	@Override
	}
	private String groupName;


    @Property(viewable = true, editable= false, updatable=false, order = 40)
import org.jkiss.dbeaver.model.meta.Property;
package org.jkiss.dbeaver.ext.exasol.model;
	{
	}
	}
			this.groupId = JDBCUtils.safeGetBigDecimal(dbResult, "PRIORITY_GROUP_ID");

	public void setPersisted(boolean persisted)
	}
	private int weight;
	{
	public DBSObject getParentObject()

			this.comment = JDBCUtils.safeGetString(dbResult, "PRIORITY_GROUP_COMMENT");
 *     http://www.apache.org/licenses/LICENSE-2.0

	public void setWeight(int weight) {
    @Property(viewable = true, editable= true, updatable=true, order = 20)
			this.created = JDBCUtils.safeGetDate(dbResult, "CREATED");
	@Override
 * DBeaver - Universal Database Manager
	}
		this.groupName = groupName;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
	}
import org.jkiss.dbeaver.model.DBPNamedObject2;
			this.weight = JDBCUtils.safeGetInt(dbResult, "PRIORITY_GROUP_WEIGHT");
        ((ExasolDataSource) getDataSource()).refreshObject(monitor);
    }
	@Override
	
		this.weight = weight;
}
		if (dbResult != null) {
	public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
	
import org.jkiss.dbeaver.model.DBPRefreshableObject;

	}
	}
	{
	public void setName(@NotNull String groupName) {
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		this.dataSource = dataSource;
 *
	private Boolean persisted;
		return weight;
 * you may not use this file except in compliance with the License.
		return groupId;
	    this.dataSource = dataSource;
	@Override

	public ExasolPriorityGroup(ExasolDataSource dataSource, String name, String comment, int weight ) {
	
		return groupName;
		return this.persisted;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
	@Override
import java.sql.ResultSet;
		return comment;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
		this.comment = comment;

import java.math.BigDecimal;
		this.groupName = name;
    	return created;
	public String getName() {
	private String comment="";
	
/*
 *
import org.jkiss.dbeaver.DBException;

	}

	}

	public ExasolPriorityGroup(ExasolDataSource dataSource, ResultSet dbResult) {
public class ExasolPriorityGroup  extends ExasolPriority implements DBPRefreshableObject, DBPNamedObject2, DBPSaveableObject {
	public void setDescription(String comment) {
    @Property(viewable = true, editable= true, updatable=true, order = 10)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	    this.persisted = false;
import java.sql.Date;
			this.groupName = JDBCUtils.safeGetString(dbResult, "PRIORITY_GROUP_NAME");
 * Licensed under the Apache License, Version 2.0 (the "License");
			throws DBException
 */
		super.setDescription(comment);
import org.jkiss.dbeaver.model.DBPSaveableObject;
	{
 * limitations under the License.
		this.persisted = persisted;

import org.jkiss.dbeaver.model.struct.DBSObject;
		super(dataSource, name, comment);
	private BigDecimal groupId = new BigDecimal(-1);
		super.setName(groupName);


	}

 * You may obtain a copy of the License at
		return this.dataSource.getContainer();
	private Date created;


    
	@Property(viewable = true, editable= false, updatable=false, order = 40)
		this.weight = weight;
	private ExasolDataSource dataSource;
		return this;
	}
    public Date getCreated()
		this.comment = comment;
		}
	public boolean isPersisted()
    {
	{
			this.persisted = true;
	public BigDecimal getGroupId()
	}
