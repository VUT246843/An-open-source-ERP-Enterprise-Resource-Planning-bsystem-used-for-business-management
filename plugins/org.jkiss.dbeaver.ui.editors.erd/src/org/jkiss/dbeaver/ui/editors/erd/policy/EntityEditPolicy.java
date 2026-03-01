 * Licensed under the Apache License, Version 2.0 (the "License");
} *
/*
/**
 * You may obtain a copy of the License at
	{
public class EntityEditPolicy extends ComponentEditPolicy {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.erd.policy;
		return entityPart.getDiagramPart().createEntityDeleteCommand(entityPart);
 */

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * Handles deletion of tables
 *
 *
 * @author Serge Rider
import org.eclipse.gef.requests.GroupRequest;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
	
	}
	@Override
		EntityPart entityPart = (EntityPart) getHost();


import org.eclipse.gef.commands.Command;
    protected Command createDeleteCommand(GroupRequest request)
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
