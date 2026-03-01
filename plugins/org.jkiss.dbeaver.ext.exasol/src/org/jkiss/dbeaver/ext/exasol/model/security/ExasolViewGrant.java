 * You may obtain a copy of the License at

	{
	{
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
	public ExasolViewGrant(ExasolBaseObjectGrant grant) throws DBException
	}
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.meta.Property;
	}
	@Property(viewable = true, order = 10)
 * limitations under the License.
		
	

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
 *
 * See the License for the specific language governing permissions and
 *
public class ExasolViewGrant extends ExasolBaseObjectGrant {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.exasol.model.ExasolView;
package org.jkiss.dbeaver.ext.exasol.model.security;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	public ExasolView getView(DBRProgressMonitor monitor) throws DBException
}
		super(grant);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
		return super.getSchema().getView(monitor, super.getObjectName());
