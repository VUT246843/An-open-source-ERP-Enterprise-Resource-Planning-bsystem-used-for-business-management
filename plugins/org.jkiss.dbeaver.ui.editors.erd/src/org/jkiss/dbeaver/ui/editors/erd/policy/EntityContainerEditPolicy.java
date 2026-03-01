/*
package org.jkiss.dbeaver.ui.editors.erd.policy;
		return command;
	/**
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
import org.eclipse.gef.commands.Command;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Edit policy for Table as a container, handling functionality for dropping new columns into tables
	@Override

 * @author Serge Rider
	}
 *
 * Unless required by applicable law or agreed to in writing, software
/**
    protected Command getCreateCommand(CreateRequest request)

		}
 * limitations under the License.
		ERDEntity table = entityPart.getTable();
public class EntityContainerEditPolicy extends ContainerEditPolicy
	{
		AttributeCreateCommand command = new AttributeCreateCommand();
 * 
		Object newObject = request.getNewObject();
		command.setTable(table);
		command.setColumn(column);
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
{
        return null;
		
 * See the License for the specific language governing permissions and
		EntityPart entityPart = (EntityPart) getHost();
 */
		{
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
			return null;
		if (!(newObject instanceof ERDEntityAttribute))
 */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
} * @return command to handle adding a new column
import org.eclipse.gef.requests.CreateRequest;
 *
*/
		ERDEntityAttribute column = (ERDEntityAttribute) newObject;

 * You may obtain a copy of the License at
