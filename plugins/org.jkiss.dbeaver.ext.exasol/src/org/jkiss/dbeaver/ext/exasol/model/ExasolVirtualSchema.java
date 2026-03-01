
				"/*snapshot execution*/ select\r\n" + 
	private String adapterScriptName;
	public ExasolScript getAdapterScriptName() throws DBException
	public ExasolVirtualSchema(ExasolDataSource exasolDataSource, ResultSet dbResult) throws DBException {
	}

	
 *
	{
	{
	{
package org.jkiss.dbeaver.ext.exasol.model;
import java.util.Collection;
 * Copyright (C) 2010-2025 DBeaver Corp and others
				super.getName()
	}
				"	schema_name = ?\r\n" + 
public class ExasolVirtualSchema extends ExasolSchema  {
	private String adapterScriptSchema;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
	
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
	}
	public ExasolDataSource getDataSource()
	{
			throws DBException
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	{
				"order by\r\n" + 
				ExasolVirtualSchemaParameter.class, 
import org.jkiss.code.NotNull;
				);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/*
import java.sql.Timestamp;
	@Property(viewable = true, order = 10)
				"from\r\n" + 
	public Boolean isPhysicalSchema()
	public Collection<ExasolVirtualSchemaParameter> getVirtualSchemaParameters() throws DBException
 *     http://www.apache.org/licenses/LICENSE-2.0
	

	}

				"", 
	}
	public Timestamp getLastRefresh()
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
		return this.getAdapterScriptSchema().getProcedure(new VoidProgressMonitor(), adapterScriptName);
 * Licensed under the Apache License, Version 2.0 (the "License");
	{
		return this.adapterNotes.replaceAll(",", ",\n");
	}
	{

	@Override
	@Property(viewable = true, order = 30)
				"	property_value\r\n" + 
 */
	public String getRefreshBy()
 * DBeaver - Universal Database Manager
				"	EXA_ALL_VIRTUAL_SCHEMA_PROPERTIES\r\n" + 

import org.jkiss.dbeaver.model.meta.Property;
				"	property_name\r\n" + 
    @Override
	private ExasolDataSource dataSource;
	
				"	property_name,\r\n" + 
	private Timestamp lastRefresh;
	
				"where\r\n" + 
	private String adapterNotes;
		
 *
		return refreshBy;
	
 * limitations under the License.
	}
		this.lastRefresh = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REFRESH");
import java.sql.ResultSet;
		adapterScriptName = fqnAdapter.get(1);
 * Unless required by applicable law or agreed to in writing, software
	@Property(viewable = true, order = 40)
	    return false;
		return lastRefresh;
		this.dataSource = exasolDataSource;
		return dataSource.getSchema(new VoidProgressMonitor(), adapterScriptSchema) ;
	}
	public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options)
import java.util.List;


	private String refreshBy;
		

	public ExasolSchema getAdapterScriptSchema() throws DBException
import java.util.Map;
		this.refreshBy = JDBCUtils.safeGetString(dbResult, "LAST_REFRESH_BY");
		adapterScriptSchema = fqnAdapter.get(0);
		this.adapterNotes = JDBCUtils.safeGetString(dbResult, "ADAPTER_NOTES");
	private DBSObjectCache<ExasolVirtualSchema, ExasolVirtualSchemaParameter> virtualSchemaParameterCache;
}
	@Property(viewable = true, order = 20)
 * You may obtain a copy of the License at
 *

	}
		
		super(exasolDataSource, dbResult);
	@Override
		List<String> fqnAdapter = CommonUtils.splitString(JDBCUtils.safeGetString(dbResult, "ADAPTER_SCRIPT"),'.');
	{
		virtualSchemaParameterCache = new JDBCObjectSimpleCache<>(
		return this.dataSource;
		
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.utils.CommonUtils;
		return virtualSchemaParameterCache.getAllObjects(new VoidProgressMonitor(), this);
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
	@NotNull


import org.jkiss.dbeaver.DBException;
