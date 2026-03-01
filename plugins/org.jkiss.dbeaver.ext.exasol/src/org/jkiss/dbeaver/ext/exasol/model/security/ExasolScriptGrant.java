		return super.getInsertAuth();

	@Override
import org.jkiss.dbeaver.model.meta.Property;
	@Override
	{

		super(grant);
		return super.getSelectAuth();
}
	//

	@Override
	
	@Override
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	{
	
	{

		return super.getAlterAuth();
	}
import org.jkiss.dbeaver.ext.exasol.model.ExasolScript;
	}
	@Override
 *
	{
		return super.getDeleteAuth();
	public Boolean getReferencesAuth()
	
	
	@Property(viewable = true, order = 10)
 * DBeaver - Universal Database Manager
	{
	@Property(hidden = true)
 * You may obtain a copy of the License at
	{
 *     http://www.apache.org/licenses/LICENSE-2.0
	{
	
	
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
	
package org.jkiss.dbeaver.ext.exasol.model.security;
	@Property(hidden = true)
	{
	
	public ExasolScript getProcedure(DBRProgressMonitor monitor) throws DBException
	public Boolean getUpdateAuth()
	
	@Property(hidden = true)
	@Property(hidden = true)
/*

import org.jkiss.dbeaver.DBException;
	public Boolean getSelectAuth()
 * See the License for the specific language governing permissions and
	
 *
 * limitations under the License.
	public ExasolScriptGrant(ExasolBaseObjectGrant grant) throws DBException
 * Copyright (C) 2010-2024 DBeaver Corp and others
	@Property(hidden = true)
 */
	}
	public Boolean getExecuteAuth()
	}
	}
	//
	}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class ExasolScriptGrant extends ExasolBaseObjectGrant {
		return super.getSchema().getProcedure(monitor, super.getObjectName());
		return super.getExecuteAuth();
	}
	public Boolean getInsertAuth()
		return super.getUpdateAuth();
	// don't show these properties for scripts
		return super.getReferencesAuth();
	public Boolean getAlterAuth()
	}
	@Property(viewable = true, order = 70)
 * Unless required by applicable law or agreed to in writing, software
	@Override
 * Licensed under the Apache License, Version 2.0 (the "License");
	@Property(hidden = true)
	@Override
	}
	{

	public Boolean getDeleteAuth()
