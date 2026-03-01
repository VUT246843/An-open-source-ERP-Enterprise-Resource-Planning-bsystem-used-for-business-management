    private String description;
    	this.description = description;
	}
import java.sql.ResultSet;
	}
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private Timestamp created;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    @Override
    }

    }

 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.NotNull;
	@Override


    @Property(viewable = true, order = 20)

 * limitations under the License.

    public void setDescription(String description) {

    @Property(viewable = true, updatable=true, editable=true, length = PropertyLength.MULTILINE, order = 10)
    }
    	return "Role "+ getName();
    	super(dataSource,false);
    public String getName() {
    public DBSObject getParentObject() {
	        this.created = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");
    		this.name = "New Role";
    	if (resultSet != null) {
	        this.name = JDBCUtils.safeGetString(resultSet, "ROLE_NAME");
    public String toString()
	
    	super(dataSource, resultSet);

    public String getDescription() {
	@NotNull
    
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public ExasolRole(ExasolDataSource dataSource, String name,
    }

    	} else {
    private ExasolDataSource dataSource;
import org.jkiss.dbeaver.model.DBPNamedObject2;
        return description;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
import org.jkiss.dbeaver.model.struct.DBSObject;

    
		this.name = newName;
    @Override
	        this.description = JDBCUtils.safeGetStringTrimmed(resultSet, "ROLE_COMMENT");
		this.description = description;

    @Override

    }
/*
        return name;
    public ExasolRole(ExasolDataSource dataSource, ResultSet resultSet) {
    }
		this.name = name;
    public Timestamp getCreated()
		this.dataSource = dataSource;
package org.jkiss.dbeaver.ext.exasol.model.security;
        return dataSource.getContainer();
    @Property(viewable = true, order = 1)
 * DBeaver - Universal Database Manager
}
 *
    
 * See the License for the specific language governing permissions and
	        this.dataSource = dataSource;
import java.sql.Timestamp;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * You may obtain a copy of the License at
	public void setName(@NotNull String newName)
import org.jkiss.dbeaver.model.meta.Property;
 */
    	}

public class ExasolRole extends ExasolGrantee  implements DBARole, DBPNamedObject2  {
		

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String name;
	{
	
 *
import org.jkiss.dbeaver.model.access.DBARole;
			String description)
    {
	{
    	return this.created;
    {
