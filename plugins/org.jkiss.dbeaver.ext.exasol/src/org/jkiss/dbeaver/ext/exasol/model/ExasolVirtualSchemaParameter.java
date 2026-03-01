	

	public String getDescription()
 */
		return isPersisted;
	@Override
	public String getValue()
	}
 * DBeaver - Universal Database Manager
 *
		this.value = JDBCUtils.safeGetString(dbResult, "PROPERTY_VALUE");

	private ExasolVirtualSchema schema;
		this.name = JDBCUtils.safeGetString(dbResult, "PROPERTY_NAME");
		return value;
		return schema.getDataSource();

	@Override
 *     http://www.apache.org/licenses/LICENSE-2.0
	public ExasolVirtualSchema getParentObject()

	{
public class ExasolVirtualSchemaParameter implements DBSObject {
	}

	@Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

	@Property(viewable = true, order = 20)
import java.sql.ResultSet;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
		return name;
	{
import org.jkiss.dbeaver.model.meta.Property;
 *
	public boolean isPersisted()

 * You may obtain a copy of the License at
	@Property(viewable = true, order = 10)
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
	}
		return schema;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
	private String value;
	}
	
	public ExasolVirtualSchemaParameter(ExasolVirtualSchema schema, ResultSet dbResult)

 * you may not use this file except in compliance with the License.
		this.schema = schema;
import org.jkiss.dbeaver.model.struct.DBSObject;
	@Override
/*
	public ExasolDataSource getDataSource()
	{
		return null;
	}
	{
	private String name;
 * See the License for the specific language governing permissions and
	}
	}
	public String getName()
		isPersisted = true;
package org.jkiss.dbeaver.ext.exasol.model;
	private Boolean isPersisted;

	@NotNull
	{
	{

 *
